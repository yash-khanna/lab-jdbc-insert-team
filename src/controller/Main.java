package controller;

import dao.*;
import model.Team;

import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		TeamDAO td=new TeamDAO();
		CityDAO cd=new CityDAO();		
		Scanner s=new Scanner(System.in);
		System.out.println("ENter Team Details for Inserting data");
		String name=s.next();
		String coach=s.next();
		String captain=s.next();
		String city=s.next();
		Team team=new Team(name,coach,captain,city);
		td.createTeam(team);
		System.out.println("Enter the name entry of city");
		String city1=s.next();
		cd.getCityByName(city1);
	}
}
