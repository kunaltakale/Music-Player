package com.jspiders.musicplayer.main;
import java.util.Scanner;

import com.jspiders.musicplayer.object.*;

public class MusicPlayerMain 
{
	Scanner scanner=new Scanner(System.in);
	SongOperation songOperation=new SongOperation();
	
	
	public static void main(String[] args) 
	{
		MusicPlayerMain musicPlayerMain=new MusicPlayerMain();
		
		boolean loop=true;
		
		while(loop)
		{
			musicPlayerMain.multiPlayer();
		}
	}
	
	public void multiPlayer()
	{
		System.out.println("------------------**------------------");
		System.out.println("--------------------------------------");
		System.out.println("1. Add or Remove Song \n"
							+ "2.Play Song \n"
							+ "3.Edit Song \n"
							+ "4.Exit");
		int choice=scanner.nextInt();
		
		switch (choice) 
		{
		case 1: 
			{
			
				System.out.println("1.Add a Song \n"
									+	"2.Remove a Song \n"
									+	"3.Back");
				
				int number=scanner.nextInt();
				switch (number) 
				{
					case 1: {	
								SongOperation.addSong();
								break;
							}
					
					case 2: {
								songOperation.removeSong();
								break;
							}
					
					case 3 : {
								multiPlayer();
								break;
							}
					default:{
								System.out.println("Invalid Choice");
								break;
							}
				}
				break;	
			}
		
		case 2 : 
				{
					System.out.println("1.Play all Songs \n"
										+	"2.Choose Song \n"
										+	"3.Shuffle \n"
										+   "4.Back");
					
					switch (scanner.nextInt())
					{
						case 1 :{
									songOperation.playAllSong();
									break;
								}
						case 2 :{
									songOperation.specificSong();
									break;
								}
						case 3: {
									songOperation.playRandomSong();
									break;
								}
						case 4 :{
									multiPlayer();
									break;
								}
						default:{
									System.out.println("Invalid Choice");
									break;
								}
						
					}
					break;
				}
				
		
		case 3 :{
					System.out.println("1.Edit a Sonng \n"
										+ "2.Back");
					
					switch (scanner.nextInt()) 
					{
						case 1 :{
									songOperation.editPlaylist();
									break;
								}
						case 2 :{
									multiPlayer();
									break;
								}
						
					    default:{
									System.out.println("Invalid Choice");
									break;
								}
					}
				    break;
				}
		
		case 4 :{
					System.out.println("Thank You");
					
					break;
				}
				
				
		default:{
					System.out.println("Invalid Choice");
					break;
				}
		}
	}
	
	
}
