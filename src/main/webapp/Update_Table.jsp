<%-- 
    Document   : Filled_Form
    Created on : 16 ????. 2021 ?., 15:30:45
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Information table</title>
        <style type='text/css'>
           h1{
  font-size: 30px;
  color: #fff;
  text-transform: uppercase;
  font-weight: 300;
  text-align: center;
  margin-bottom: 15px;
}
table{
  width:100%;
  table-layout: fixed;
}
.tbl-header{
  background-color: rgba(255,255,255,0.3);
 }
.tbl-content{
  height:300px;
  overflow-x:auto;
  margin-top: 0px;
}
th{
  padding: 20px 15px;
  text-align: left;
  font-weight: 500;
  font-size: 12px;
  color: #fff;
  text-transform: uppercase;
}
td{
  padding: 15px;
  text-align: left;
  vertical-align:middle;
  font-weight: 300;
  font-size: 12px;
  color: #fff;
  border-bottom: solid 1px rgba(255,255,255,0.1);
}


/* demo styles */

body{
  background: -webkit-linear-gradient(left, #25c481, #25b7c4);
  background: linear-gradient(to right, #25c481, #25b7c4);
  font-family: 'Roboto', sans-serif;
}
section{
  margin: 70px;
}

/* for custom scrollbar for webkit browser*/

::-webkit-scrollbar {
    width: 6px;
} 
::-webkit-scrollbar-track {
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3); 
} 
::-webkit-scrollbar-thumb {
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3); 
}

.hero-cta{
    display: inline-block;
    padding: 30px;
}
.button1 {
    position: relative;
    display: inline-flex;
    font-size: 14px;
    letter-spacing: 0px;
    font-weight: 700;
    margin-top: 80px;
    line-height: 16px;
    text-decoration: none !important;
    text-transform: uppercase;
    background-color: rgba(255,255,255,0.3);
    color: #fff !important;
    border: none;
    border-radius: 2px;
    cursor: pointer;
    justify-content: center;
    padding: 16px 32px;
    height: 48px;
    text-align: center;
    white-space: nowrap;
    margin-left: 500px;
}


@keyframes bounce {
	0%, 20%, 60%, 100% {
		transform: translateY(0);
		transform: translateY(0);
	}
	40% {
		transform: translateY(-20px);
		transform: translateY(-20px);
	}
	80% {
		transform: translateY(-10px);
		transform: translateY(-10px);
	}
}
.button1:hover {
    animation: bounce 1s;
}
        </style>
    </head>
    <body>
      <form action="<%=request.getContextPath()%>/SecondInformServlet" method="post">
          
      <main>
            <section>
              <!--for demo wrap-->
              <h1>Updating table</h1>
              <div class="tbl-header">
                  <table cellpadding="0" cellspacing="0" border="0">
                      <thead>
                          <tr>
                              <th>Name</th>
                              <th>Family name</th>
                              <th>Age</th>
                              <th>Email</th>
                          </tr>
                      </thead>
                  </table>
              </div>
              <div class="tbl-content">
                  <table cellpadding="0" cellspacing="0" border="0">
                      <tbody>
                          <tr>
                      <input type="hidden" name="number" value="<%=request.getParameter("number")%>">
                              <td><input type="text" name="name" value="<%=request.getParameter("name")%>"></td>
                              <td><input type="text" name="familyname" value="<%=request.getParameter("familyname")%>"></td>
                              <td><input type="text" placeholder="integer" name="age" value="<%=request.getParameter("age")%>"></td>
                              <td><input type="email" name="email" value="<%=request.getParameter("email")%>"></td>
                          </tr>
                      </tbody>
                  </table>
                           <div class="hero-cta"><input class="button1" type="submit" value="Update"/></div>
              </div>
          </section>
         
      </main>
      </form>
    </body>
</html>
