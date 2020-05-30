package model;

public class Team{
	String name;
	String coach;
	String captain;
	String city;
	public Team(String name, String coach, String captain, String city) {
		super();
		this.name = name;
		this.coach = coach;
		this.captain = captain;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}	
}
