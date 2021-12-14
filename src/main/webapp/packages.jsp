<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />

    <link rel="stylesheet" href="css/styles.css"/>
    <link rel="stylesheet" type="text/css" href="css/assigment.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Josefin+Sans:wght@500&family=Ubuntu+Mono&display=swap" rel="stylesheet">
    <script defer src="script/script.js"></script>
    <script src="js/assigment.js"></script>

<title>Packages</title>
</head>
<body>


<header>
    <nav class="nav1">
      <div class="nav1-l">
        <ul>
          <li><a class="facebook"><i class="fa fa-facebook"></a></i></li>
          <li><a class="twitter"><i class="fa fa-twitter"></a></i></li>
          <li><a class="google"><i class="fa fa-google-plus"></a></i></li>
          <li class="nav1-txt">Keep Your Way More Luxury</li>
        </ul>
      </div>
      <div class="nav1-r">
        <button data-modal-target="#modal" type="button" name="navi_btn">
          <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-list" viewBox="0 0 16 16">
          <path fill-rule="evenodd" d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z"/>
        </svg><i class="bi bi-list"></i></button>
        <div class="modal" id="modal">
          <div class="model-content">
            <div class="sec-content-header">
              <button data-close-button class="close-button">&times;</button>
            </div>
            <div class="sec-content-search">
              <form class="example" action="action_page.php">
                <input type="text" placeholder="Search.." name="search">
                <button type="submit"><i class="fa fa-search"></i></button>
              </form>
            </div>
            <div class="sec-content">
              <div class="sec-clm1"><i class="fa fa-registered" aria-hidden="true"></i></div>
              <div class="sec-clm2">Register</div>
            </div>
            <div class="sec-content">
              <div class="sec-clm1"><i class="fa fa-sign-in" aria-hidden="true"></i></div>
              <div class="sec-clm2">Login</div>
            </div>
            <div class="sec-content">
              <div class="sec-clm1"><i class="fa fa-car" aria-hidden="true"></i></div>
              <div class="sec-clm2">Rent My Car</div>
            </div>
            <div class="sec-content">
              <div class="sec-clm1"><i class="fa fa-user" aria-hidden="true"></i></div>
              <div class="sec-clm2">Drive With EasyTaxi</div>
            </div>
          </div>
        </div>
        <div id="overlay"></div>
      </div>
    </nav>

    <div class="maindiv">
      <div class="logo">
        <img class="EasyTaxiLogo" src="images/Logo/EasyTaxiLogo.png" alt="EasyTaxiLogo">
      </div>
      <div class="nav2-r">
        <ul>
          <li><a href="#">Home</a></li>
          <li><a>Vehical Fleet</a><button type="button" name="vFleet_btn"><i class="fa fa-angle-down" aria-hidden="true"></i></button></li>
          <li><a>Packages</a><button type="button" name="vFleet_btn"><i class="fa fa-angle-down" aria-hidden="true"></i></button></li>
          <li><a>Services</a></li>
          <li><a>About Us</a></li>
        </ul>
      </div>
    </div>
  </header>


<div class="include"><br><br>
    <center><h1><p style="color:rgb(19, 14, 14)">Package</p></h1></center><br><br>
      <form method="post" action="servletjava">

        Package type<br>
        <input type="text" id="uName" name="uName" class="insert" placeholder="Type of package" required><br><br>
        Car name<br>
        <input type="text" id="showPass" name="showPass" class="insert" placeholder="Name of the car" required><br><br>
        Passengers<br>
        <input type="text" id="uName" name="uName" class="insert" placeholder="Passenger amount" required><br><br>
        Condition<br>
        <input type="text" id="uName" name="uName" class="insert" placeholder="Describe about condition" required><br><br>
        Rental type<br>
        <input type="text" id="uName" name="uName" class="insert" placeholder="Rental type" required><br><br>
        Package fee<br>
        <input type="text" id="uName" name="uName" class="insert" placeholder="Package fee" required><br><br>
        Offers<br>
        <input type="text" id="uName" name="uName" class="insert" placeholder="Input offers" required><br><br>
    

        
        <button type = "submit" onclick="" class="login">Submit</button>
        <button type = "reset" onclick="" class="login">reset</button>
             
      
      </form>
      <br><br><br><br><br><br><br><br><br><br><br><br>
  </div>

</body>
</html>