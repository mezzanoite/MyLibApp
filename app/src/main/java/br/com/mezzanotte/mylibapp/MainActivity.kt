package br.com.mezzanotte.mylibapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.mezzanotte.mylib.Calculadora
import br.com.mezzanotte.mylib.CustomToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        meuBotao.setOnClickListener() {
            val myToast = CustomToast()
            myToast.showToast(this, "Meu Teste!")
        }

    }

}
