package com.example.tp1

class Salle {
    var id: Int = 0
    var code: Int?=null
    var libelle: String?=null
    constructor(id:Int?,code:Int?,libelle:String?){
        this.id=+id!!
        this.code= code
        this.libelle = libelle
    }
    fun tostring(){
        println("la salle d'id ${this.id} a le code ${this.code} est nommee ${this.libelle}")
    }
}

fun main() {
    println("Code:")
    var code1 = readLine()?.toInt()
    var id:Int?=1
    println("Libelle:")
    var libelle1 = readLine()

    var salle1= Salle(id,code1,libelle1)
    salle1.tostring()
    println("Code:")
    var code2 = readLine()?.toInt()
    var id2:Int?=0
    println("Libelle:")
    var libelle2 = readLine()

    var salle2= Salle(id2,code2,libelle2)
    salle1.tostring()
}