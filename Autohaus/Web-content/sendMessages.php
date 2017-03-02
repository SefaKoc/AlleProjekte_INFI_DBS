<html>
<body>

<?php
$servername = "localhost";
$username = "root";
$password = "";
$database = "autohaus";

// Create connection
$conn = new mysqli($servername, $username, $password, $database);

// Check connection
 if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 
$vn1= $_POST["vorname"];
$nn1= $_POST["nachname"];
$kn1= $_POST["kundennummer"];
$sql = "INSERT INTO kunden (vorname, nachname, kundennummer) VALUES ('$vn1','$nn1','$kn1');";
if ($conn->query($sql) === FALSE) {
    echo "Error: " . $sql . "<br>" . $conn->error;
}	
$conn->close();
?>

</body>
</html>