package com.example.uts_progmob2021

class Matkul {

    var id: Int? = null
    var kode: String? = null
    var nama: String? = null
    var hari: String? = null
    var sesi: String? = null
    var sks: Int? = null

    constructor(id: Int, kode: String, nama: String, hari: String, sesi: String, sks: Int) {
        this.id = id
        this.kode = kode
        this.nama = nama
        this.hari = hari
        this.sesi = sesi
        this.sks = sks
    }
}