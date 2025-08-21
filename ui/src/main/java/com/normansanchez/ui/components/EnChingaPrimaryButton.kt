package com.normansanchez.ui.components

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton
import com.normansanchez.ui.R

class EnChingaPrimaryButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.primaryEnChingaButtonStyle
) : AppCompatButton(context, attrs, defStyleAttr) {

    init {
        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.EnChingaPrimaryButton,
            defStyleAttr,
            0
        )
    }
}