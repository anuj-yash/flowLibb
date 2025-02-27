package com.anuj.flow_dialog_lib

import android.app.Activity
import android.app.Dialog
import android.view.Window
import android.widget.TextView

public class FlowListener {
    fun showDialog(activity: Activity) {
        val dialog = Dialog(activity)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dialog)

        val yesBtn = dialog.findViewById(R.id.tvCancle) as TextView
        yesBtn.setOnClickListener {
            dialog.dismiss()
        }

        val noBtn = dialog.findViewById(R.id.tvOk) as TextView
        noBtn.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }
}