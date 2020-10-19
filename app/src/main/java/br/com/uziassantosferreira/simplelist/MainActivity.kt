package br.com.uziassantosferreira.simplelist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.zup.beagle.android.utils.renderScreen
import br.com.zup.beagle.android.view.OnFragmentCallback
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnFragmentCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        container.renderScreen(this, getScreen())
    }


    private fun getScreen(): String = """
        {
          "_beagleComponent_" : "beagle:screenComponent",
          "child" : {
            "_beagleComponent_" : "beagle:container",
            "children" : [ {
              "_beagleComponent_" : "beagle:text",
              "text" : "Hello Beagle!",
              "style" : {
                "margin" : {
                  "top" : {
                    "value" : 16.0,
                    "type" : "REAL"
                  }
                },
                "flex" : {
                  "alignSelf" : "CENTER"
                }
              }
            }, {
              "_beagleComponent_" : "beagle:text",
              "text" : "Beagle is a cross-platform framework which provides usage of the Server-Driven UI concept, natively in iOS, Android and Web applications. By using Beagle, your team could easily change application's layout and data by just changing backend code.",
              "style" : {
                "margin" : {
                  "left" : {
                    "value" : 16.0,
                    "type" : "REAL"
                  },
                  "top" : {
                    "value" : 20.0,
                    "type" : "REAL"
                  },
                  "right" : {
                    "value" : 16.0,
                    "type" : "REAL"
                  }
                }
              }
            } ]
          }
        }
    """

    override fun fragmentResume() {}
}