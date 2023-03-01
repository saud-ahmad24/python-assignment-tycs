<%-- 
    Document   : form.jsp
    Created on : 9 Feb, 2023, 8:41:48 AM
    Author     : srki-035
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>

        <style type="text/css">
            .btn{
                background: green;
                padding: 6px 20px;
                border: none;
                color: #fff;
                border-radius: 3px;
                transition: .5s;
            }
            .btn:hover{
                background: #333;

            }

            .textbx{

                width: 200px;
                height: 20px;
                
            }

            .btnc{ background: red;
                   padding: 6px 20px;
                   border: none;
                   color: #fff;
                   border-radius: 3px;
                   transition: .5s;
            }

            .btnc:hover{
                background: #333;

            }

        </style>
    </head>
    <body>
    <center ><font size=6><h3 style="margin-top: 80px;">Login Form</h3></font>

        <form action="auth">
            <table align="center">
                <tbody>
                    <tr>
                        <td><b>Username : </b></td>
                        <td><input class="textbx" type="text" name="username" >  </td>
                    </tr>
                    <tr>
                        <td><b>Password : </b></td>
                        <td><input class="textbx" type="password" name="password" ></td>
                    </tr><tr> 
                        <td> <br>
                            <input class="btn" style="text-align: center;" type="submit" name="Login" value="Login">
                            <input class="btnc " style="text-align: center;" type="reset" name="reset" value="RESET">
                        </td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
