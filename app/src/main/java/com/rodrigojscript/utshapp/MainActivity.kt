package com.rodrigojscript.utshapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class MainActivity : AppCompatActivity() {

    private lateinit var  btnAlumnos: Button
    private lateinit var btnAdmin: Button
    private lateinit var carousel: ImageCarousel
    var list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAlumnos = findViewById(R.id.btnAlum)
         btnAdmin = findViewById(R.id.btnAdmin)
         carousel = findViewById(R.id.carousel)


        carousel.registerLifecycle(lifecycle)
        list.add(CarouselItem(imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8wYIV6bYhL-USJTbaIDytDor9TbFiFDrl6Q&usqp=CAU"))
        list.add(CarouselItem(imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSSOj8VJ-Z4NZdQQO-irh41QjVuUfx-SnJWLg&usqp=CAU"))
        list.add(CarouselItem(imageUrl = "https://agendahidalguense.files.wordpress.com/2018/03/la-utsh-fue-sede-del-xxii-encuentro-deportivo-y-cultural-de-universidades-tecnolc3b3gicas-20184.jpg"))
        list.add(CarouselItem(imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTY5t-xeWpUi3aip1uOhHNP1FjuA7lUjzL4C9c_U8waNZeszO2jo8Ts6FtmVLbvbpsACGg&usqp=CAU"))
        carousel.setData(list)

        btnAlumnos.setOnClickListener{
            val intento = Intent(this,  Alumnos::class.java)
            startActivity(intento)
        }
        btnAdmin.setOnClickListener{
            val intento2 = Intent(this,  Administrativos::class.java)
            startActivity(intento2)
        }
    }
}