package com.siniturk.sumit.siniturk;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import com.siniturk.sumit.siniturk.K430.K430_kernel;
import com.siniturk.sumit.siniturk.K430.K430_recovery;
import com.siniturk.sumit.siniturk.K430.K430_roms;

public class K430_main extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main);

        TabHost mTabHost = getTabHost();

        mTabHost.addTab(mTabHost.newTabSpec("Roms").setIndicator("Roms").setContent(new Intent(this  ,K430_roms.class )));
        mTabHost.addTab(mTabHost.newTabSpec("Recovery").setIndicator("Recovery").setContent(new Intent(this , K430_recovery.class )));
        mTabHost.addTab(mTabHost.newTabSpec("Kernel").setIndicator("Kernel").setContent(new Intent(this , K430_kernel.class )));
        mTabHost.setCurrentTab(0);


    }
}
