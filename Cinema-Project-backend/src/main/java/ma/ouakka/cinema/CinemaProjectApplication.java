package ma.ouakka.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import ma.ouakka.cinema.entities.Film;
import ma.ouakka.cinema.entities.Salle;
import ma.ouakka.cinema.entities.Ticket;
import ma.ouakka.cinema.service.ICinemaInitService;

@SpringBootApplication
public class CinemaProjectApplication implements CommandLineRunner {

	@Autowired
	private ICinemaInitService iCinemaInitService;
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(CinemaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*repositoryRestConfiguration.exposeIdsFor(Film.class, Ticket.class);
		repositoryRestConfiguration.exposeIdsFor(Salle.class);*/
		iCinemaInitService.initVilles();
		iCinemaInitService.initCinemas();
		iCinemaInitService.initSalles();
		iCinemaInitService.initPlaces();
		iCinemaInitService.initSeances();
		iCinemaInitService.initCategories();
		iCinemaInitService.initFilms();
		iCinemaInitService.initProjections();
		iCinemaInitService.initTickets();
	}

}
