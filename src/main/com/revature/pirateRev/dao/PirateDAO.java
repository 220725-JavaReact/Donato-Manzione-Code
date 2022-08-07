package main.com.revature.pirateRev.dao;

import java.sql.Connection;
import java.sql.SQLException;
import main.com.revature.pirateRev.exceptions.NoSuchElementException;
import main.com.revature.pirateRev.models.Pirate;
import main.com.revature.pirateRev.util.CaptainsLogger;
import main.com.revature.pirateRev.util.ConnectionFactory;
import main.com.revature.pirateRev.util.CaptainsLogger.LogLevel;

public class PirateDAO implements DAO<Pirate> {
	private static CaptainsLogger logger = CaptainsLogger.getLogger();

	@Override
	public void create(Pirate pirate) {
		try (Connection conn = ConnectionFactory.getInstance().getConnection()) {

		} catch (SQLException e) {
			logger.log(LogLevel.ERROR,
					"You not create connection to database. New pirate could not be added.\n\n\tException: "
							+ e.getMessage() + "\n\n\tStack Trace:\n\n" + e.getStackTrace().toString());
		}
	}

	@Override
	public Pirate readByName(String name) throws NoSuchElementException {
		for (Object p : readAll()) {
			Pirate pir = (Pirate) p;
			if (pir.getName().equals(name)) {
				return pir;
			}
		}
		throw new NoSuchElementException("There is no pirate called " + name);
	}

	@Override
	public Object[] readAll() {
		Object[] pirates = null;
		return pirates;
	}

	@Override
	public void update(Pirate obj) {

	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub

	}

}
