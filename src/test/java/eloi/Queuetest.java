package eloi;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

public class Queuetest {

	private Queue queue;
	
	@Before
	public void construct(){
	queue = new Queue(3);
	
	}
	@Test
	public void testdeQueue() {
		queue.enqueue(3);
		final int sollWert = 3;
		assertEquals(sollWert,queue.dequeue());
	}
	@Test 
	public void testenQueue() {
		queue.enqueue(3);
		queue.enqueue(7);
		queue.enqueue(2);
		queue.enqueue(6);
		
		final int sollWert = 3;
		assertEquals(sollWert,queue.dequeue());
	
	}

}
