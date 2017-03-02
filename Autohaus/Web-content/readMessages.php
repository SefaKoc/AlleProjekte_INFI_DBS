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

//execute a DB query
$sql = "SELECT * FROM kunden";
//$sql .= "SELECT * FROM auto";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    // output data of each row
    while($row = $result->fetch_assoc()) {
		
        echo " Kundenname: " . $row["vorname"] . "<br>";
		echo " Nachname: " . $row["nachname"] . "<br>";
		echo " Kundennummer: " . $row["kundennummer"] . "<br>";
		echo "<br>";
//		echo " Seriennummer: " . $row["seriennummer"] . "<br>";
//		echo " Marke: " . $row["marke"] . "<br>";
//		echo " Modell: " . $row["modell"] . "<br>";
//		echo " Farbe: " . $row["farbe"] . "<br>";
//		echo " Leistung: " . $row["leistung"] . "<br>";
//		echo " Motorhubraum: " . $row["motorhubraum"] . "<br>";
//		echo " Preis: " . $row["preis"] . "<br>";
//		echo "<br>";
   }
}else 
	{
    echo "keine Nachricht empfangen";
	}
$conn->close();
?>