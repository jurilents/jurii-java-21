<%@ page import="org.obrii.mit.dp2021.jurilents.laba3.data.ToDoTask" %>
<%@ page import="org.obrii.mit.dp2021.jurilents.laba3.data.IData" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>The Best ToDo list of the All ToDo lists in the World!!!</title>
</head>
<body>

<% String FORM_URL = request.getRequestURL().toString().split("/pages/")[0] + "/form"; %>
<% IData[] taskList = (IData[]) request.getAttribute("todoData"); %>

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
        <% for (IData taskAbstractData : taskList) { %>
        <% ToDoTask task = (ToDoTask) taskAbstractData; %>
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

<style>
    #banner {
        display: none;
    }
    .banner-visible {
        display: block !important;
    }
</style>

<div id="banner">
    <h2 class="banner-header"></h2>
    <button type="button" class="banner-button button-ok">OK</button>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"
        integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
<script>
    $(document).ready(() => {
        const banner = {
            init: () => {
                this.wrapper = $('#banner');
                this.title = this.wrapper.find('.banner-header');

                this.okButton = this.wrapper.find('.button-hide');
                this.okButton.on('click', () => {
                    this.wrapper.removeClass('banner-visible');
                });
            },
            show: (time, text) => {
                this.title.text(text);
                this.wrapper.addClass('banner-visible');
                setTimeout(() => {
                    this.wrapper.removeClass('banner-visible');
                    console.log("end");
                }, time);
            }
        }

        banner.init();

        const todosTable = document.getElementById('todolist-form');
        const todos = todosTable.querySelectorAll('.todo-item');

        for (let item of todos) {
            const id = +item.querySelector('.id-input').value;
            const name = item.querySelector('.name-input').value;
            const completed = item.querySelector('.item-completed').value === 'on';

            const data = {
                id: id,
                name: name,
                completed: completed
            }

            const updateButton = item.querySelector('.update-button');
            updateButton.addEventListener('click', () => {
                console.log(data);
                $.ajax({
                    url: "<%= FORM_URL %>",
                    type: 'PUT',
                    data: data,
                }).done(result => {
                    console.log(result);
                    banner.show(1500, 'Element updated');
                }).fail(result => {
                    console.error("error " + result.code);
                    console.log(result);
                    location.reload();
                });
            });


            const deleteButton = item.querySelector('.delete-button');
            deleteButton.addEventListener('click', () => {
                console.log(data);
                $.ajax({
                    url: "<%= FORM_URL %>",
                    type: 'DELETE',
                    data: {id: id},
                }).done(result => {
                    item.parentNode.removeChild(item); // remove current row from html page
                    console.log(result);
                    banner.show(1500, 'Element deleted');
                }).fail(result => {
                    console.error("error " + result.code);
                    console.log(result);
                    location.reload();
                });
            });
        }
    });
</script>

</body>
</html>
