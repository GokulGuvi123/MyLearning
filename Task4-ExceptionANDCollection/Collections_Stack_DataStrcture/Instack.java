package Collections_Stack_DataStrcture;

import java.util.EmptyStackException;

public class Instack {
	int[] stackArr;
	int capacity;
	int top;

	public Instack(int capacity) {
		this.capacity = capacity;
		stackArr = new int[capacity];
		top = -1; // when stack is empty
	}

	public void push(int ele) {
		if (isStackFull()) {
			System.out.println("Stack Overflow: Cannot push element " + ele + ". Stack is full.");
			return;
		}
		stackArr[++top] = ele;
		System.out.println("Element " + ele + " pushed in stack");
	}

	public void pop() {
		if(isStackEmpty()) {
			throw new EmptyStackException();
		}
		int popEle = stackArr[top--];
		System.out.println("Popped element: " + popEle);
	}

	private boolean isStackEmpty() {
		if (top == -1)
			return true;
		return false;
	}

	private boolean isStackFull() {
		if (top == this.capacity - 1)
			return true;
		return false;
	}

}
