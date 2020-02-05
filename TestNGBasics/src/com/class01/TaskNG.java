package com.class01;

import org.testng.annotations.Test;

public class TaskNG {
	@Test
	public void wePlayed() {
		System.out.println("Chelsea played today");
	}
	@Test
	public void weDidNotPlay() {
		System.out.println("Chelsea did not play today");
	}
	@Test
	public void ChelseaWon() {
		System.out.println("Chelsea won today's match");
	}
	@Test
	public void ChelseaLost() {
		System.err.println("Chelsea lost today's match");
	}

}
