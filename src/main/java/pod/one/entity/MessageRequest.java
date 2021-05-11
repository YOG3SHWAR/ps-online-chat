package pod.one.entity;

public class MessageRequest {
	private int senderId;
	private int receiverId;
	private String messageBody;
	private int isAccepted;
	
	public MessageRequest() {
		
	}

	public MessageRequest(int sender_id, int receiver_id, String message_body, int is_accepted) {
		super();
		this.senderId = sender_id;
		this.receiverId = receiver_id;
		this.messageBody = message_body;
		this.isAccepted = is_accepted;
	}

	public int getSenderId() {
		return senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	public int getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	public int getIsAccepted() {
		return isAccepted;
	}

	public void setIsAccepted(int isAccepted) {
		this.isAccepted = isAccepted;
	}

	@Override
	public String toString() {
		return "MessageRequest [senderId=" + senderId + ", receiverId=" + receiverId + ", messageBody="
				+ messageBody + ", isAccepted=" + isAccepted + "]";
	}

	
}
