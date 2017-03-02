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
$kn1= $_POST["kundennummer"];
$sql = "DELETE FROM kunden WHERE kundennummer='$kn1'";
if ($conn->query($sql) === FALSE) {
    echo "Error: " . $sql . "<br>" . $conn->error;
}	
$conn->close();
?>

</body>
</html>