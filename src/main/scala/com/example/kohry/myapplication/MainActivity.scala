package com.example.kohry.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.{Button, Toast}

class MainActivity extends AppCompatActivity {
  override protected def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    findViewById(R.id.btn_hello).asInstanceOf[Button].setOnClickListener(new MyOnClickListener)

  }

  class MyOnClickListener extends View.OnClickListener{
    override def onClick(v: View): Unit = {
      Toast.makeText(getApplicationContext, "hi",Toast.LENGTH_LONG).show()
    }

}


}
