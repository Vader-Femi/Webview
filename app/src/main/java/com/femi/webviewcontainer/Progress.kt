package com.femi.webviewcontainer

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.annotation.StringRes
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.textview.MaterialTextView

class Progress constructor(
    context: Context,
    @StringRes private val titleRes: Int,
    cancelable: Boolean = false
) {

    private var view: View? = null
    private var builder: MaterialAlertDialogBuilder
    private var dialog: AlertDialog

    init {
        view = LayoutInflater.from(context).inflate(R.layout.progress, null)
        view?.findViewById<MaterialTextView>(R.id.text)?.setText(titleRes)
        builder = MaterialAlertDialogBuilder(context)
        builder.setView(view)
        dialog = builder.create()
        dialog.setCancelable(cancelable)
    }
    fun show() {
        dialog.show()
    }

    fun dismiss() {
        if (dialog.isShowing) {
            dialog.dismiss()
        }
    }

}