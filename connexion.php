<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Connexion</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <form action="admin.php" method="POST">
        <fieldset id="f" >
            <legend>Connexion</legend><br/>
            <label class="lab" > Username </label>
            <input class="ch" type="text" value="admin" size="10" name="login" /><br/><br/>
            <label class="lab" >Password</label>
            <input class="ch" type="text" size="10" name="password" /><br/><br/>
            <input class="ch" id="sub" type="submit" value="Login" />
        </fieldset>
    </form> 
</body>
</html>