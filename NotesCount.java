package com.great.learning.lab.session.service;

public class NotesCount {

	public void notesCountImplementation(int notes[], int amount) {
		// TODO Auto-generated method stub
		
		if(amount == 0)
			return;
		
		int[] noteCounter = new int[notes.length];
		
		try {
			for (int i = 0; i < notes.length; i++) {
				if(amount == 0) {
					System.out.println();
				}
				
				if (amount >= notes[i]) {
					noteCounter[i] = amount / notes[i];
					amount = amount - noteCounter[i] * notes[i];
				}
			}
			if (amount > 0) {
				System.out.println("exact amount cannot be given with the highest denomination");
			} else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for(int i = 0; i < notes.length; i++) {
					if(noteCounter[i] != 0) {
						System.out.println(notes[i] + noteCounter[i]);	
					}
				}
			}
			
		} catch(ArithmeticException e) {
			System.out.println(e + " notes of denomination 0 is invalid");
		}
		

	}

	public void notesCountImplementation(String string) {
		// TODO Auto-generated method stub
		
	}

}
