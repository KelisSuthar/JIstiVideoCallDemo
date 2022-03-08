package com.example.jistivideocalldemo

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import org.jitsi.meet.sdk.JitsiMeet
import org.jitsi.meet.sdk.JitsiMeetActivity
import org.jitsi.meet.sdk.JitsiMeetActivity.launch
import org.jitsi.meet.sdk.JitsiMeetConferenceOptions
import java.net.URL


class MainActivity : AppCompatActivity(), View.OnClickListener {
    var btn: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.btn)
        btn!!.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        if (p0!!.id == R.id.btn) {
            //todo-to start and join jitsi
            val options: JitsiMeetConferenceOptions = JitsiMeetConferenceOptions.Builder()
                .setServerURL(URL("https://meet.jit.si"))
                .setRoom(";'lk,df;swmdkl;fml;skmd")
                .setAudioMuted(false)
                .setVideoMuted(false)
                .setAudioOnly(false)
                .setConfigOverride("requireDisplayName", true)
                .build()
            launch(this, options)
        }
    }
}