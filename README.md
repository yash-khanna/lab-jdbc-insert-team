![Image description](https://i1.faceprep.in/ProGrad/face-logo-resized.png)

# ProGrad Lab | ProGrad Premier League


## Progression 1:

Create Main.java with main method Create Team.java domain class with below attributes, 
```
name - String 
coach - String 
city - City 
```

Include getter and setter method for all the attributes 
Include a constructor with below arguments, 
`public Team(String name, String coach, String captain, City city)`
 
 
## Progression 2:

Create `City.java` domain class with below attributes, 
```
cityld - Long 
cityName - String 
```

Include getter and setter method for all the attributes 
Include a constructor with below arguments, 
`public City(cityld,cityName)`


## Progression 3:

Create `CityDA0` class with below methods, 
`public City getCityByName(String name)` - Method to fetch the city information from database based on the city name. 


## Progression 4:

Create `TeamDAO` class to insert user into the database, 
`public void createTeam(Team team)` - Method used to insert new team into the database



![1 2](https://user-images.githubusercontent.com/61002120/76416050-5807d380-63c0-11ea-8d52-9e8750e800f9.png)


### Note:

Use the below code to retreive the connection details from mysql.properties to establish connection
```
public static Properties loadPropertiesFile() throws Exception {
	Properties prop = new Properties();	
	InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
	prop.load(in);
	in.close(); 
	return prop;
}
```    
**Sample Input and Output**
```
Enter team name 
England 
Enter coach name 
Pravin Amre 
Enter the city 
1.Pune 
2.Hyderabad 
3.Delhi 
1 
Team has been created 
Team Details are: 
Name 			Coach			C
England 		Paddy Upton     	United Kingdom
Australia 		Brad Hodge		Victoria
India 			Sanjay Bangar		Kolkata
England		 	Jacques Kallis		United Kingdom
America 		Ricky Ponting		New York
South Africa 		Pravin Amre 		Cape Town
```
