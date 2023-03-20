package com.jspiders.musicplayer.object;


import java.util.ArrayList;
import java.util.Scanner;

public class SongOperation 
{
	static Scanner scanner=new Scanner(System.in);
	
	static ArrayList<Song>arrayList=new ArrayList<Song>();
	
	
	public static void addSong()
	{
		System.out.println("How many songs you want to add ?");
		int addCount=scanner.nextInt();
		
		for(int i=0 ; i<addCount ; i++)
		{
			Song song = new Song();
			
			System.out.println("Enter the ID for song : ");
			song.setId(scanner.nextInt());
			
			System.out.println("Enter the name for song : ");
			song.setName(scanner.next());
			
			System.out.println("Enter the movie name for song : ");
			song.setMovie(scanner.next());
			
			System.out.println("Enter the length for song : ");
			song.setLength(scanner.nextDouble());
			
			System.out.println("Enter the composer name for song : ");
			song.setComposer(scanner.next());
			
			System.out.println("Enter the lyrist name for song : ");
			song.setLyricist(scanner.next());
			
			arrayList.add(song);
			System.out.println(song.getName() + " song added successfully");
			
		}
		System.out.println("Songs added successfull.........");
	}
	
	public void removeSong()
	{
		if (arrayList.isEmpty())
		{
			System.out.println("Add song then remove");
			addSong();
		}
		
		
		System.out.println("Select Id to remove the Song");
		displayAllSongs();
		int removeId=scanner.nextInt();
		
		System.out.println(arrayList.get(removeId-1).getName() + " song removed successfully..");
		
		arrayList.remove(removeId-1);
		displayAllSongs();
	}
	
	public void playAllSong()
	{
		if (arrayList.isEmpty()) 
		{
			System.out.println("Add songs then play : ");
			addSong();
		}
		
		System.out.println("Playing selected song ");
		for (Song song : arrayList) 
		{
			System.out.println(song.getName());
		}
		
	}
	
	
	public void displayAllSongs()
	{
		if (arrayList.isEmpty()) 
		{
			System.out.println("add song then you will get songList.");
			addSong();
		}
		
		for(Song song : arrayList)
		{
			System.out.println("Song Id = " + song.getId() + "Song Name = " + song.getName() );
		} 
	}
	public void chooseSong()
	{
		if (arrayList.isEmpty()) 
		{
			System.out.println("add song then you will get songList.");
			addSong();
		}
		
	}
	public void playRandomSong()
	{
		if (arrayList.isEmpty())
		{
			System.out.println("First add song then play . ");
			addSong();
		}
		
		System.out.println("Playing random song ");
		double number = Math.random();
		int random=(int)(number*10)+1;
		
		if (random>arrayList.size()) 
		{
			random=1;
		}
		System.out.println("Playing song " + arrayList.get(random).getName());
	}
	
	public void specificSong()
	{
		if (arrayList.isEmpty()) 
		{
			System.out.println("Add song then play");
			addSong();
		}
		
		System.out.println("Select a Song Id to play");
		displayAllSongs();
		
		int play=scanner.nextInt();
		
		System.out.println("Playing song " + arrayList.get(play-1).getName());
	}
	
	public void editPlaylist()
	{
		if (arrayList.isEmpty())
		{
			System.out.println("Add song then edit the song");
			addSong();
		}
		
		System.out.println("Select Song Id to edit");
		
		displayAllSongs();
		
		int edit=scanner.nextInt();
		
		arrayList.remove(edit-1);  //indexvalue 0 (we seen id as 1 but in arrayList its a index value 0)
		
		
		Song song1=new Song();
		
		System.out.println("Enter the new id for song : ");
		song1.setId(scanner.nextInt());
		
		System.out.println("Enter the new name for song : ");
		song1.setName(scanner.next());
		
		System.out.println("Enter the new movie name for song : ");
		song1.setMovie(scanner.next());
		
		System.out.println("Enter the new length for song : ");
		song1.setLength(scanner.nextDouble());
		
		System.out.println("Enter the new composer name for song : ");
		song1.setComposer(scanner.next());
		
		System.out.println("Enter the new lyrist name for song : ");
		song1.setLyricist(scanner.next());
		
		arrayList.add(edit-1,song1);
		System.out.println("Id Number : " + arrayList.get(edit-1).getId()+ " Song Name : " 
							+ arrayList.get(edit-1).getName() + " get updated");
		
	}
}
