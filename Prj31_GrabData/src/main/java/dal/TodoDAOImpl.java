package dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entities.Todo;

public class TodoDAOImpl implements TodoDAO {

	private Connessione miaConn;
	private Connection conn;
	private Statement st;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public TodoDAOImpl() {
		miaConn = new Connessione();
		conn = miaConn.getConn();	
	}
	
	@Override
	public List<Todo> getAll() {
		List<Todo> todos = new ArrayList<Todo>();
		// 1 Metto la query nella busta
		try {
			this.st = this.conn.createStatement();
			this.rs = this.st.executeQuery(ALL);
			while(rs.next()) {
				Todo t = new Todo();
				t.setId(rs.getInt("id"));
				t.setTitle(rs.getString("title"));
				t.setUserId(rs.getInt("user_id"));
				t.setStatus(rs.getString("status"));
			
				LocalDateTime localDateTime = rs.getTimestamp("due_on").toLocalDateTime();	
				t.setDueOn(localDateTime);
				todos.add(t);			
							
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return todos;
	}

	@Override
	public void addTodo(Todo t) {

		try {
			this.ps = this.conn.prepareStatement(INSERT);
			this.ps.setInt(1, t.getUserId());
			this.ps.setString(2, t.getTitle());
			java.sql.Date sqlDate = java.sql.Date.valueOf(t.getDueOn().toLocalDate());
			this.ps.setDate(3, sqlDate);
			this.ps.setString(4, t.getStatus());
			
			if(this.ps.execute()) {
				System.out.println("record aggiunto");
			}else {
				System.out.println("record non aggiunto");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
