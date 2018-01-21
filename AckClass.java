import java.util.Arrays;
import java.nio.ByteBuffer;


/*
 Cn-project-2
 Contributors: 
       1. Jeevitha Mahankali (800966168)
       2. Raghava Adarsh Mandarapu (800937296)

 */



public class AckClass{
	
	private int seqNo;

	public AckClass(int seqNo) {
		this.seqNo = seqNo;
	}

	public AckClass(byte[] packet) {
		ByteBuffer wrapped = ByteBuffer.wrap(packet);
		this.seqNo = wrapped.getInt();
	}

	public int getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}

	public byte[] generatePacket(){

		byte[] packet = ByteBuffer.allocate(4).putInt(this.seqNo).array();

		return packet;
	}

	@Override
	public String toString() {
		return "UDPAcknowledgement [seq=" + seqNo + "]";
	}

}
