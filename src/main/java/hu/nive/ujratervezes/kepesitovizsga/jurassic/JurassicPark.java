package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JurassicPark {

    private DataSource dataSource;

    public JurassicPark(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> checkOverpopulation() {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("SELECT breed FROM dinosaur WHERE actual > expected ORDER BY breed")
        ) {
            return getOverpopulatedDinos(stmt);
        } catch (SQLException se) {
            throw new IllegalStateException("Can not query", se);
        }
    }

    private List<String> getOverpopulatedDinos(PreparedStatement stmt) {
        List<String> result = new ArrayList<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String name = rs.getString("breed");
                result.add(name);
            }
        } catch (SQLException se) {
            throw new IllegalStateException("Can not query ", se);
        }
        return result;
    }
}
