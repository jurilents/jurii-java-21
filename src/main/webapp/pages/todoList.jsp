<%@ page import="org.obrii.mit.dp2021.jurilents.laba3.data.ToDoTask" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>The Best ToDo list of the All ToDo lists in the World!!!</title>
</head>
<body>

<% String FORM_URL = request.getRequestURL().toString() + "/form"; %>

<main>
    <h1>It's open ToDo List!</h1>
    <p>Everyone can update it, but not everyone can understand how to use it...</p>

    <table id="todolist-form">
        <thead>
        <tr>
            <th>#</th>
            <th>Task</th>
            <th>Status</th>
        </tr>
        </thead>

        <tbody>
        <% ToDoTask[] taskList = (ToDoTask[]) request.getAttribute("todoData"); %>
        <% for (ToDoTask task : taskList) { %>
        <tr class="todo-item">
            <td class="item-id">
                <input class="id-input" type="text" value="<%= task.getId() %>">
            </td>
            <td class="item-name">
                <input class="name-input" type="text" value="<%= task.getName() %>">
            </td>
            <td>
                <% String checked = task.isCompleted() ? "checked" : ""; %>
                <input class="item-completed" type="checkbox" <%= checked %>>
            </td>
            <td>
                <button class="update-button">Update</button>
            </td>
            <td>
                <button class="delete-button">Delete</button>
            </td>
        </tr>
        <% } %>
        </tbody>
    </table>

    <div class="button-section">
        <a class="add-button" href="<%= FORM_URL %>?opt=create">Add New</a>
    </div>

</main>

<div id="banner">
    <h2 class="banner-header"></h2>
    <button type="button" class="banner-button button-ok">OK</button>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
<script>
    const banner = {
        init: () => {
            this.wrapper = $('#banner');
            this.title = this.wrapper.find('.banner-header');

            this.okButton = this.component.find('.button-hide');
            this.okButton.on('click', () => {
                this.hide();
            });
        },
        show: (time, text) => {
            setTimeout(() => {
                this.title.text(text);
                this.wrapper.addClass('banner-visible');
            }, time);
            this.hide();
        },
        hide: () => {
            this.wrapper.removeClass('banner-visible');
        }
    }

    banner.init();

    const todos = $('#todolist-form').find('.todo-item');

    for (let item of todos) {
        const id = item.find('.id-input').val();
        const name = item.find('.name-input').val();
        const completed = item.find('.item-completed').prop('checked');

        const data = {
            id: id,
            name: name,
            completed: completed
        }

        const updateButton = item.querySelector('.update-button');
        updateButton.on('click', () => {
            $.ajax({
                url: "<%= FORM_URL %>",
                type: 'PUT',
                data: data,
            })
            .done(result => {
                console.log(result);
                banner.show(4000, 'Element updated!');
            })
            .fail(result => {
                console.error(result);
            });
        });


        const deleteButton = item.querySelector('.delete-button');
        deleteButton.on('click', () => {
            $.ajax({
                url: "<%= FORM_URL %>",
                type: 'DELETE',
                data: {id: id},
            })
            .done(result => {
                item.detach(); // remove current row from html page
                console.log(result);
                banner.show(4000, 'Element deleted!');
            })
            .fail(result => {
                console.error(result);
            });
        });
    }
</script>

</body>
</html>
