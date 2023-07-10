<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
    <link rel="stylesheet" href="css/signup.css" />
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;300;400;500;700&display=swap"
      rel="stylesheet"
    />
  </head>
    
   <!-- <script type="text/javascript">
    var status = document.getElementById("status").value;
    if(status === "success")
    	{
    		alert("Congrats Your Account Has Been Created Successfully");
    	}
    
    </script>-->
    
   <body>
    <div class="container">
      <div class="col1">col1</div>
      <div class="col2">
        <div class="form-container">
          <p class="signup">Sign Up</p>
          <form method="post" action="signup">
            <p class="fname">First Name</p>
            <input type="text" class="firstname" id="first_name" name="fname" required/>
            <p class="lname">Last Name</p>
            <input type="text" class="lastname" id="last_name"  name="lname" required/>
            <p class="gender">Gender</p>
            <span class="male-span">Male</span>
            <input type="radio" name="gender" id="male" value="male" required/>
            <span class="female-span">Female</span>
            <input type="radio" name="gender" id="female" value="female" required/>
            <span class="other-span">Other</span>
            <input type="radio" name="gender" id="other" value="other" required/>
            <p class="mobnum">Mobile Number</p>
            <input type="tel" class="mobno" name="mobileno" required/>
            <p class="address">Address</p>
            <textarea
              id="addr"
              name="address"
              rows="5"
              cols="33"
              required
            ></textarea>
            <p class="course">Course</p>
            <select name="courses" id="course-select" required>
              <option value="">--Please Choose a Course--</option>
              <option value="java">JAVA</option>
              <option value="python">Python</option>
              <option value="mysql">MySql</option>
              <option value="php">PHP</option>
            </select>
            <p class="email">Email</p>
            <input type="text" class="email-input" id="mail" name="email" required/>
            <p class="password">Password</p>
            <input type="password" class="password-input" id="pass" name="password" required/>
            <button class="submit" type="submit">Submit</button>
            <p class="alreadyuser">Already a user? <a href="signin.jsp">SIGN IN</a></p>
          </form>
        </div>
      </div>
      <div class="col3">col3</div>
    </div>
    
    
  </body>
 <script src="scripts/signupvalidation.js"></script>

</html>