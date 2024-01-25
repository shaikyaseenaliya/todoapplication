
package com.example.todo.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class TodoRowMapper implements RowMapper<Todo> {
    @Override

    public Todo mapRow(ResultSet rs, int rowNum) throws SQLException {

        return new Todo(
                rs.getInt("id"),
                rs.getString("todo"),
                rs.getString("status"),
                rs.getString("priority"));
    }

}
