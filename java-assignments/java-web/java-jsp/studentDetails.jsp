<%-- 
    Document   : studentDetails
    Created on : 9 Feb, 2023, 9:07:52 AM
    Author     : srki-035
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>student details</title>

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
    <center ><font size=6><h3 style="margin-top: 80px;">Student Registration</h3></font>

        <form action="studentserv" method="POST">
            <table align="center">
                <tbody>
                    <tr>
                        <td><b>Name : </b></td>
                        <td><input class="textbx" type="text" name="sName" >  </td>
                    </tr><tr></tr>
                    <tr>
                        <td><b>Age : </b></td>
                        <td><input class="textbx" type="text" name="sAge" ></td>
                    </tr><tr></tr>  

                    <tr>
                        <td><b>Gender : </b></td>
                        <td>
                            <input type="radio" name="gender" value="male" /> Male
                            <input type="radio" name="gender" value="female" /> Female
                        </td><tr></tr>
                    </tr>

                    <tr>
                        <td><b>Address : </b></td>
                        <td><textarea name="Address" rows="4" cols="28"></textarea></td>
                    </tr><tr></tr>

                    <tr>
                        <td><b>Course : </b></td>
                        <td><select name="Course">
                                <option value="Computer Science">Computer Science</option>
                                <option value="Information Tech">Information Tech</option>
                                <option value="Micro Biology">Micro Biology</option>
                                <option value="Bio Technology">Bio Technology</option>
                            </select></td>
                    </tr><tr></tr>

                    <tr>
                        <td><b>Semester : </b></td>
                        <td><select  name="Semester" style="width:50px;">
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                                <option value="5">5</option>
                                <option value="6">6</option>
                                <option value="7">7</option>
                                <option value="8">8</option>
                            </select></td>
                    </tr><tr></tr>



                    <tr>
                        <td></td>
                        <td> <br>
                            <input class="btn" style="text-align: center;" type="submit" name="submit" value="SUBMIT">
                            <input class="btnc " style="text-align: center;" type="reset" name="reset" value="RESET">
                        </td>
                    </tr><tr></tr>
                    
                    


                </tbody>
            </table>

        </form>


    </body>
</html>
