<%-- 
    Document   : lab2
    Created on : 16 февр. 2021 г., 15:30:16
    Author     : HP
--%>

<%@page import="java.util.List"%>
<%@page import="org.obrii.mit.dp2021.jurilents.Data"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Third Lab</title>
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
  height:150px;
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

.header__search{
   margin-top: 50px;
   margin-left: 1020px;
   width: 180px;
   color: white;
}

.filtercl{
    background-color: rgba(255,255,255,0.3);
    border-color: rgba(255,255,255,0.3);
    border-style: inset; 
}

.button{
    margin-left: 50px;
    font-size: 12px;
    letter-spacing: 0px;
    font-weight: 300;
    margin-top: 20px;
    line-height: 16px;
    text-decoration: none !important;
    text-transform: uppercase;
    background-color: rgba(255,255,255,0.3);
    color: #fff !important;
    border: none;
    border-radius: 2px;
    cursor: pointer;
    justify-content: center;
    padding: 12px 26px;
    height: 38px;
    text-align: center;
    white-space: nowrap;
    margin-left: 50px;
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
    margin-top: 30px;
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
    margin-left: 50px;
}

.button2 {
    position: relative;
    display: inline-flex;
    font-size: 14px;
    letter-spacing: 0px;
    font-weight: 700;
    margin-top: 30px;
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
    margin-left: 550px;
}

.button3 {
    position: relative;
    display: inline-flex;
    font-size: 14px;
    letter-spacing: 0px;
    font-weight: 700;
    margin-top: 0px;
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
    margin-left: -50px;
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

.button:hover {
    animation: bounce 1s;
}

.button2:hover {
    animation: bounce 1s;
}

.button3:hover {
    animation: bounce 1s;
}
        </style>
    </head>
    <body>
        <%List<Data> dataList = (List<Data>) request.getAttribute("data");%>
      <main>
          <section>
                   
               <form action= "<%=request.getContextPath()%>/" method="get">
              <div class="header__search">
                  <input type="text" class="filtercl" name="filter">
                  <input type="submit" class="button" value="Filter">
            </div>
               </form>
            
              <!--for demo wrap-->
              <h1>Information table</h1>
              <div class="tbl-header">
                  <table cellpadding="0" cellspacing="0" border="0">
                      <thead>
                          <tr>
                              <th>Number</th>
                              <th>Name</th>
                              <th>Family name</th>
                              <th>Age</th>
                              <th>Email</th>
                              <th> </th>
                              <th>Update</th>
                              <th>Delete</th>
                          </tr>
                      </thead>
                  </table>
              </div>
              <div class="tbl-content">
                  <table cellpadding="0" cellspacing="0" border="0">
                      <tbody>
                          <%for(Data data:dataList){
                          %>
                           <tr>
                              <td><%=data.getNumber()%></td>
                              <td><%=data.getName()%></td>
                              <td><%=data.getFamilyname()%></td>
                              <td><%=data.getAge()%></td>
                              <td><%=data.getEmail()%></td>
                              <td></td>
                          
                              <th><form action="Update_Table.jsp" method="post">
                          <input type="hidden" name="number" value="<%=data.getNumber()%>"/>
                          <input type="hidden" name="name" value="<%=data.getName()%>"/>
                          <input type="hidden" name="familyname" value="<%=data.getFamilyname()%>"/>
                          <input type="hidden" name="age" value="<%=data.getAge()%>"/>
                          <input type="hidden" name="email" value="<%=data.getEmail()%>"/>
                          <div class="hero-cta"><input class="button3" type="submit" value="Update"></div></th>
                          </form>
                      <th><form action="<%=request.getContextPath()%>/SecondInformServlet" method="get">
                          <input type="hidden" name="number" value="<%=data.getNumber()%>"/>
                          <div class="hero-cta"><input class="button3" type="submit" value="Delete"></div>
                      </form></th>
                      </tr>
                          <%}%>
                      </tbody>
                  </table>
              </div>
          </section>
          <form action="Fill_Table.jsp">
              <div class="hero-cta"><input class="button2" type="submit" value="Add new"></div>  
          </form>

      </main>
    </body>
</html>