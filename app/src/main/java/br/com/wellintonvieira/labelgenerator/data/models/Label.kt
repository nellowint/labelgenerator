package br.com.wellintonvieira.labelgenerator.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "label")
data class Label(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,
    var name: String = ""
)