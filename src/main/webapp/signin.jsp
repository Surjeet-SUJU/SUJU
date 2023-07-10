<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign In</title>
    <link rel="stylesheet" href="css/signincss.css" />
    <link
      href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;300;400;500;700&display=swap"
      rel="stylesheet"
    />
  </head>
  <body>
    <div class="container">
      <div class="col1">col1</div>
      <div class="col2">
        <div class="form-container">
        <p class="text">Sign In</p>
        <form action="signin" method="post">
          <p class="textlabel">Email</p>
          <input type="text" class="email-box" name="email" required />
          <p class="textlabel">Password</p>
          <input type="password" class="password-box" name="password" required/>
          <button class="signinbtn">SIGN IN</button>
        </form>
          <p class="needanacct">
            Need an Account? <a href="signup.jsp">SIGN UP</a>
          </p>
        </div>
        <div class="img-container">
          <img src="images/desk.jpg" alt="Error in image loading" class="desk" />
        </div>
      </div>
      <div class="col3">col3</div>
    </div>
  </body>
</html>