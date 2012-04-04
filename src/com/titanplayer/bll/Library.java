/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.titanplayer.bll;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ken
 */
public class Library {

    List<Song> songs;

    public Library(){
        songs = new ArrayList<Song>();
    }

    public void addSong(Song songToAdd){
        songs.add(songToAdd);
    }

    public void deleteSong(Song songToDelete){
        songs.remove(songToDelete);
       
   }

   public int songCount(){
       return songs.size();
   }
   
   
public void testDeletion(){

    }
}
   


