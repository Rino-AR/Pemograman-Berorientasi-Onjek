/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

import java.io.Serializable;
/**
 *
 * @author rinoa
 */
public abstract class KoleksiPerpustakaan implements Serializable {
    protected String id;
    protected String judul;

    public KoleksiPerpustakaan(String id, String judul) {
        this.id = id;
        this.judul = judul;
    }

    public abstract void tampilkanInfo();
}
