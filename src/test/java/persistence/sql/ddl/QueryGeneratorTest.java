package persistence.sql.ddl;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class QueryGeneratorTest {

	@Test
	@DisplayName("person create 쿼리를 반환한다.")
	void personCreateQuery() {
		QueryGenerator queryGenerator = new QueryGenerator();
		String result = queryGenerator.createQuery();

		String expected = "CREATE TABLE Person (\n"
			+ "    id BIGINT AUTO_INCREMENT PRIMARY KEY,\n"
			+ "    nick_name VARCHAR(255),\n"
			+ "    old INT,\n"
			+ "    email VARCHAR(255) NOT NULL\n"
			+ ");";
		assertThat(result).isEqualTo(expected);
	}
}
