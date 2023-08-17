package kr.hs.emirim.tabhosttest

import android.app.TabActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//@Suppress(...names:"deprecation")
class MainActivity : TabActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tabHost = this.tabHost
        var tabSpec1 = tabHost.newTabSpec("sepc1").setIndicator("투바투")
        tabSpec1.setContent(R.id.linear1)
        tabHost.addTab(tabSpec1)

        var tabSpec2 = tabHost.newTabSpec("sepc2").setIndicator("최수빈")
        tabSpec2.setContent(R.id.linear2)
        tabHost.addTab(tabSpec2)

        var tabSpec3 = tabHost.newTabSpec("sepc3").setIndicator("최수빈")
        tabSpec3.setContent(R.id.linear3)
        tabHost.addTab(tabSpec3)

        tabHost.currentTab=1


    }
}