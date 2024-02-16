/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.youtube;

/**
 *
 * @author vtali
 */
public class Youtube {

    public static void main(String[] args) {
      usuario usuario= new usuario( "victor talin" )
        Video video = new Video("Aprendiendo java",2400,"https;//youtube.com");
        usuario.subirVideo(video);
        usuario.mostrarInfoUsuario();
    }
}
