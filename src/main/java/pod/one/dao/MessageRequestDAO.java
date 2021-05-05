package pod.one.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pod.one.entity.MessageRequest;
import pod.one.interfaces.IMessageRequestDAO;
import pod.one.utils.GetConnection;

public class MessageRequestDAO implements IMessageRequestDAO{

	public boolean saveMessage(MessageRequest messageRequest) {
		String sql = "insert into messagerequest values(default,?,?,?,?)";
		try {
			PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql);
			ps.setInt(1, messageRequest.getSender_id());
			ps.setInt(2, messageRequest.getReceiver_id());
			ps.setString(3, messageRequest.getMessage_body());
			ps.setInt(4, messageRequest.getIs_accepted());
			
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	public MessageRequest getMessage(int request_id) {
		String sql = "select request_id, sender_id, receiver_id, message_body, is_accepted from messagerequest where request_id = ?";
		
		try {
			PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql);
			ps.setInt(1, request_id);
			ResultSet rs = ps.executeQuery();
			MessageRequest messageRequest = new MessageRequest();
			if(rs.next()) {
				messageRequest.setSender_id(rs.getInt(2));
				messageRequest.setReceiver_id(rs.getInt(3));
				messageRequest.setMessage_body(rs.getString(4));
				messageRequest.setIs_accepted(rs.getInt(5));
				return messageRequest;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<MessageRequest> getAllMessages() {
		String sql = "select request_id, sender_id, receiver_id, message_body, is_accepted from messagerequest";
		List<MessageRequest> list = null;
		try {
			PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			list = new ArrayList<MessageRequest>();
			while(rs.next()) {
				MessageRequest messageRequest = new MessageRequest();
				messageRequest.setSender_id(rs.getInt(2));
				messageRequest.setReceiver_id(rs.getInt(3));
				messageRequest.setMessage_body(rs.getString(4));
				messageRequest.setIs_accepted(rs.getInt(5));
				list.add(messageRequest);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public boolean updateRequest(int request_id, int is_accepted) {
		String sql = "update messagerequest set is_accepted = ?";
		try {
			PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql);
			ps.setInt(request_id, is_accepted);
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
