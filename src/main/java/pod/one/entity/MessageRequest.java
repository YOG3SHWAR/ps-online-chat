package pod.one.entity;

public class MessageRequest {
	private int sender_id;
	private int receiver_id;
	private String message_body;
	private int is_accepted;
	
	public MessageRequest() {
		
	}

	public MessageRequest(int sender_id, int receiver_id, String message_body, int is_accepted) {
		super();
		this.sender_id = sender_id;
		this.receiver_id = receiver_id;
		this.message_body = message_body;
		this.is_accepted = is_accepted;
	}

	public int getSender_id() {
		return sender_id;
	}

	public void setSender_id(int sender_id) {
		this.sender_id = sender_id;
	}

	public int getReceiver_id() {
		return receiver_id;
	}

	public void setReceiver_id(int receiver_id) {
		this.receiver_id = receiver_id;
	}

	public String getMessage_body() {
		return message_body;
	}

	public void setMessage_body(String message_body) {
		this.message_body = message_body;
	}

	public int getIs_accepted() {
		return is_accepted;
	}

	public void setIs_accepted(int is_accepted) {
		this.is_accepted = is_accepted;
	}

	@Override
	public String toString() {
		return "MessageRequest [sender_id=" + sender_id + ", receiver_id=" + receiver_id + ", message_body="
				+ message_body + ", is_accepted=" + is_accepted + "]";
	}

	
}
