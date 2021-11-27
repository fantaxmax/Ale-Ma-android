package cl.duocuc.pry2111.alertamascota.model

import android.provider.BaseColumns
import java.util.*

class Mascota(id: Int, nombre: String, desc: String, perdido: Boolean, foto: String, sexo: Char, QR: String, tamano: Tamaño, raza: Raza,dueño: Dueño) {
    var id: Int = id
    var nombre: String = nombre
    var descripcion: String = desc
    var perdido: Boolean = perdido
    var foto: String = foto
    var sexo: Char = sexo
    var QR: String = QR
    var tamano: Tamaño = tamano
    var raza: Raza = raza
    var dueño: Dueño = dueño

}

