function validateForm() {
  var fname = document.getElementById("first_name").value;
  var lname = document.getElementById("last_name").value;
  var subject = document.getElementById("course-select").value;
  var password = document.getElementById("pass").value;
  var email = document.getElementById("mail").value;

  const emailreg = new RegExp(
    /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/
  );
  const reg = new RegExp("^(?=.{6,})(.*[0-9])");

  if (fname == "" || fname.length < 4 || fname.length > 20) {
    alert("First name must be minimum 4 char and less than 20 chars long");
    document.getElementById("first_name").focus();
    return false;
  }
  if (lname == "" || lname.length < 4 || lname.length > 20) {
    alert("Last name must be minimum 4 char and less than 20 chars long");
    document.getElementById("last_name").focus();
    return false;
  }
  if (!document.querySelector('input[name="gender"]:checked')) {
    alert("Please select gender");
    return false;
  }
  if (subject == "") {
    alert("Please choose subject");
    document.getElementById("subject").focus();
    return false;
  }
  if (!reg.test(password)) {
    alert(
      "Password should contain atleast one number and should be 6 characters long"
    );
    return false;
  }
  if (!emailreg.test(email)) {
    alert("It is not a valid email");
    return false;
  }
  return false;
}
