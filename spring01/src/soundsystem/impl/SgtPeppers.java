package soundsystem.impl;

import java.awt.image.TileObserver;

import org.springframework.stereotype.Component;

import soundsystem.ICompactDisc;

@Component
public class SgtPeppers implements ICompactDisc {

	@Override
	public void play() {
			String title = "�ǰ�����";
			String artist = "���";
			  
			System.out.println("Play "+ title + "  by  "+artist);
	}

}
