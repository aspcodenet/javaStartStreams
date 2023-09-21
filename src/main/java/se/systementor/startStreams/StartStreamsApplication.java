package se.systementor.startStreams;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import se.systementor.startStreams.models.Actor;
import se.systementor.startStreams.models.Movie;

@SpringBootApplication
public class StartStreamsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StartStreamsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var alla = getAllMovies();
		//1. Visa alla filmer som släpptes någon gång under 90-talet.
		// 2. Visa alla filmer vars Actor-lista innehåller tre skådespelare  (tips: för detta kan du behöva använda count
		/// 3. Visa alla filmer som där någon av skådespelarna i filmen var äldre än 40 år när filmen gjordes
		//4, //Visa alla skådespelare som är äldre än 50 år. Sortera skådespelarna på namn.
		//5. Visa alla skådespelare som har bokstaven "g" eller ”G” i sitt namn. Det skall inte spela
		//            //någon roll om det är med stor eller liten bokstav alla skall visas.
		//6. //Visa en lista innehållande filmtitel, regissör och antal skådespelare för alla filmer.

	}

	private List<Movie> getAllMovies(){
		var list = new ArrayList<Movie>();
		list.add(new Movie(1,"Inception",2010, "Cristopher Nolan", getAllActors().stream().filter(c->c.getId() == 1 || c.getId() == 2  || c.getId() == 3).toList()));
		list.add(new Movie(2,"There will be blood",2007, "Paul Thomas Anderson", getAllActors().stream().filter(c->c.getId() == 4 || c.getId() == 5 ).toList()));
		list.add(new Movie(3,"Primer",2004, "Shane Carruth", getAllActors().stream().filter(c->c.getId() == 6 ).toList()));
		list.add(new Movie(4,"The Godfather",1972, "Francis Ford Coppola", getAllActors().stream().filter(c->c.getId() == 7 || c.getId() == 8 || c.getId() == 9 ).toList()));
		list.add(new Movie(5,"What's eating Gilberg Grape?",1993, "Lasse Hallström", getAllActors().stream().filter(c->c.getId() == 1 || c.getId() == 10).toList()));
		list.add(new Movie(6,"Donnie Brasco",1997, "Mike Newell", getAllActors().stream().filter(c->c.getId() == 8 || c.getId() == 10 ).toList()));
		list.add(new Movie(7,"Gangs of New York",2002, "Martin Scorsese", getAllActors().stream().filter(c->c.getId() == 1 || c.getId() == 4 ).toList()));
		list.add(new Movie(8,"Alien",1979, "Ridley Scott", getAllActors().stream().filter(c->c.getId() == 11 || c.getId() == 12 || c.getId() == 13 ).toList()));
		list.add(new Movie(9,"The Aviator",2004, "Martin Scorsese", getAllActors().stream().filter(c->c.getId() == 1 || c.getId() == 14 || c.getId() == 15 ).toList()));
		list.add(new Movie(10,"Age of Innocence",1993, "Martin Scorsese", getAllActors().stream().filter(c->c.getId() == 4 || c.getId() == 16 ).toList()));
		list.add(new Movie(11,"Tinker Tailor Soldier Spy",2011, "Tomas Alfredson", getAllActors().stream().filter(c->c.getId() == 13 || c.getId() == 5 ).toList()));
		return list;
	}
	private List<Actor> getAllActors() {
		var list = new ArrayList<Actor>();
		list.add(new Actor(1,"Leonardo DiCaprio",  1974));
		list.add(new Actor(3,"Ellen Page",  1987));
		list.add(new Actor(2,"Joseph Gordon-Levitt",  1981));
		list.add(new Actor(4,"Daniel Day Lewis",  1957));
		list.add(new Actor(5,"Ciarán Hinds",  1953));
		list.add(new Actor(6,"Shane Carruth",  1972));
		list.add(new Actor(7,"Marlon Brando",  1924));
		list.add(new Actor(8,"Al Pacino",  1940));
		list.add(new Actor(9,"Robert Duvall",  1931));
		list.add(new Actor(10,"Johnny Depp",  1963));
		list.add(new Actor(11,"Sigourney Weaver",  1949));
		list.add(new Actor(12,"Tom Skeritt",  1933));
		list.add(new Actor(13,"John Hurt",  1940));
		list.add(new Actor(14,"Cate Blanchett",  1981));
		list.add(new Actor(15,"Kate Beckinsale",  1981));
		list.add(new Actor(16,"Michelle Pfeiffer",  1958));
		return list;
	}

}
