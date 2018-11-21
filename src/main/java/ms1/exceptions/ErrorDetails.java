package ms1.exceptions;

import java.time.Instant;
public class ErrorDetails {

	private Instant timestamp;
	
	private String message;
	
	private String details;

	public ErrorDetails(Instant date, String message2, String description) {
		this.timestamp = date;
		this.message = message2;
		this.details = description;
	}

	public Instant getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
}
