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
            <th>Task Description</th>
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

    th {
        cursor: pointer;
    }
</style>

<div id="banner">
    <h2 class="banner-header"></h2>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"
        integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
<script>
    $(document).ready(() => {
        // Table sort for both columns and both directions.
        function sortTable(table, n) {
            var rows, i, x, y, count = 0;
            var switching = true;

            // Order is set as ascending
            var direction = "ascending";

            // Run loop until no switching is needed
            while (switching) {
                switching = false;
                var rows = table.rows;

                //Loop to go through all rows
                for (i = 1; i < (rows.length - 1); i++) {
                    var Switch = false;

                    // Fetch 2 elements that need to be compared
                    x = rows[i].getElementsByTagName("TD")[n];
                    y = rows[i + 1].getElementsByTagName("TD")[n];

                    // Check the direction of order
                    if (direction == "asc") {

                        // Check if 2 rows need to be switched
                        if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
                            // If yes, mark Switch as needed and break loop
                            Switch = true;
                            break;
                        }
                    } else if (direction == "desc") {

                        // Check direction
                        if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) {
                            // If yes, mark Switch as needed and break loop
                            Switch = true;
                            break;
                        }
                    }
                }
                if (Switch) {
                    // Function to switch rows and mark switch as completed
                    rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
                    switching = true;

                    // Increase count for each switch
                    count++;
                } else {
                    // Run while loop again for descending order
                    if (count == 0 && direction == "asc") {
                        direction = "desc";
                        switching = true;
                    }
                }
            }
        }

        function makeSortable(table) {
            console.log('started')
            var th = table.tHead, i;
            th && (th = th.rows[0]) && (th = th.cells);
            if (th) i = th.length;
            else return; // if no `<thead>` then do nothing
            console.log('thead step')
            while (--i >= 0) (function (i) {
                var dir = 1;
                th[i].addEventListener('click', function () {
                    console.log('sorting: ' + i + ', ' + dir)
                    sortTable(table, i, (dir = 1 - dir))
                });
            }(i));
        }

        const banner = {
            init: () => {
                this.wrapper = $('#banner');
                this.title = this.wrapper.find('.banner-header');
            },
            show: (time, text) => {
                this.title.text(text);
                this.wrapper.addClass('banner-visible');
                setTimeout(() => this.wrapper.removeClass('banner-visible'), time);
            }
        }

        banner.init();

        const todosTable = document.getElementById('todolist-form');
        const todos = todosTable.querySelectorAll('.todo-item');

        makeSortable(todosTable);

        for (let item of todos) {
            const id = +item.querySelector('.id-input').value;

            const updateButton = item.querySelector('.update-button');
            updateButton.addEventListener('click', () => {
                const data = {
                    id: +item.querySelector('.id-input').value,
                    oldId: id,
                    name: item.querySelector('.name-input').value,
                    completed: item.querySelector('.item-completed').value === 'on'
                }
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
