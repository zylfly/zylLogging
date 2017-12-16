package com.zyl.zyllogging

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.zyl.zlogger.ZLogger
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.info -> ZLogger.i("测试级别")
            R.id.war -> ZLogger.w("AAA","测试级别")
            R.id.err -> ZLogger.e("AAA","测试级别")
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        info.setOnClickListener(this)
        war.setOnClickListener(this)
        err.setOnClickListener(this)
    }
}
