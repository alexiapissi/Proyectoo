<?php

$hostname_localhost ="localhost";
$database_localhost = "db_viaj_ar";
$username_localhost = "root";
$password_localhost = "";


$localhost= mysqli_connect($hostname_localhost, $username_localhost, $password_localhost, $database_localhost);


//mysqli_select_db($database_localhost, $localhost);

$query_search = "SELECT * FROM Tour";

$query_exec = mysqli_query($localhost, $query_search);

$tours = Array();

	if(mysqli_num_rows($query_exec)){
		while($row=mysqli_fetch_assoc($query_exec)){
			$tour = Array("Nombre" => $row["Nombre"], "Usuario" => $row["Usuario"]);
			array_push($tours, $tour);
		}
	}
	
	header("Content-Type: application/json");
	$json = json_encode($tours, JSON_PRETTY_PRINT);
	echo($json);

mysqli_close($localhost);

?>