@import com.jts.jte.User
@import java.util.List

@param String msg
@param List<String> numbers
@param User user

<!doctype html>
<html>
<head>
    
   
</head>
<body>

    <h1> ${msg} </h1>
    <h1> ${user.firstName()} - ${user.lastName()} </h1>
    
    <ul>
    	@for(String number: numbers) 
    		<li>${number}</li>
    	@endfor
    </ul>

</body>
</html>