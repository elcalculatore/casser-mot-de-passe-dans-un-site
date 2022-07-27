<?php
session_start();

$login = FALSE;
$password = FALSE;

if( ( $_REQUEST["login"]=="admin" ) )
{
$login = TRUE;
}
if( ($_REQUEST["password"] =="passer") )
{
$password = TRUE;
}

if( $login && $password )
{
$_SESSION[ "login" ] = $_REQUEST["login"];
echo"reussie";
}
else
{
 header('Location:connexion.php');
} 

