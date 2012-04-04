/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.titanplayertests;

import com.titanplayer.bll.Song;
import com.titanplayer.bll.Library;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ken
 */
public class LibraryTests {

    public LibraryTests() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

   @Test
   public void emptyLibraryTest(){
       Library emptyLibrary = new Library();
       assertEquals(0, emptyLibrary.songCount());
       
   }
   @Test
   public void addSongTest(){
       Library myLibrary = new Library();
       myLibrary.addSong(new Song("My Posse's On Broadway", "Sir Mix a Lot"));
       myLibrary.addSong(new Song("Brass Monkey", "Beastie Boys"));
       myLibrary.deleteSong(new Song("Brass Monkey", "Beastie Boys"));
      
       assertEquals(1, myLibrary.songCount());
   }
   @Test
   public void deleteSongTest(){


    }



}