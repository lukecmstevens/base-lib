package uk.co.lukestevens.db;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * A function interface to define a method to
 * parse a result set into some given type
 * 
 * @author luke.stevens
 *
 * @param <T> The type to parse the result set into
 */
@FunctionalInterface
public interface ResultParser<T> {
	public T parse(ResultSet rs) throws IOException, SQLException;
}
