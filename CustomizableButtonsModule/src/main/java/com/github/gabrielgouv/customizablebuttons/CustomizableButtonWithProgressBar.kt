package com.github.gabrielgouv.customizablebuttons

import android.content.Context
import android.graphics.Color
import android.graphics.PorterDuff
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.View
import android.widget.ProgressBar

/**
 *
 * [CustomizableButton] with progress bar with ability to change color of progress bar
 */
class CustomizableButtonWithProgressBar @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private var myButton : CustomizableButton
    private var progressBar: ProgressBar
    // button text
    private var buttonText: String? = null

    init {
        View.inflate(context, R.layout.view_button_with_progress_bar, this)
        myButton = findViewById(R.id.button)
        progressBar = findViewById(R.id.progressBar)
    }

    /**
     * enable or disable button's progress bar
     */
    var isLoading = false
        set(value) {
            field = value
            // if enable loading
            if(value) {
                // progress bar color
                loaderColor = com.github.gabrielgouv.customizablebuttons.util.ColorUtil.getTextColorFromBackgroundColor(myButton.getBackgroundColor())
                // show progress bar
                progressBar.visibility = View.VISIBLE
                // save button text
                buttonText = myButton.text.toString()
                // remove button text
                myButton.text = null
                // set button clickable to false
                myButton.isClickable = false
            }
            // if disable loading
            else {
                // hide progress bar
                progressBar.visibility = View.INVISIBLE
                if(buttonText != null) {
                    // show button text
                    myButton.text = buttonText
                    // clear backup button text
                    buttonText = ""
                    // enable button clickable
                    myButton.isClickable = true
                }
            }
        }

    /**
     * set loader color
     */
    var loaderColor  = Color.WHITE
        set(value) {
            progressBar.indeterminateDrawable.setColorFilter(value, PorterDuff.Mode.MULTIPLY)
        }

    /**
     * access [CustomizableButton] and all of its properties, so the button can be customized programmatically.
     * Default style for button is primary button. Also this is necessary to onClick callbacks
     * (i.e. button.setOnClickListener{ } or touch listener)
     * @returns [CustomizableButton]
     */
    val button = myButton
}