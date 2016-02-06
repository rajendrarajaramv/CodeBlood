package com.codeblood.rajendra.codeblood.typeface;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.codeblood.rajendra.codeblood.R;

/**
 * Created by rajendra on 2/5/2016.
 */
public class BloodTextView extends TextView {
    private static final String sScheme =
            "http://schemas.android.com/apk/res-auto";
    private static final String typeface = "typeface";
    public BloodTextView(Context context) {
        super(context);
    }

    public BloodTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (isInEditMode()) {
            return;
        }

        TypedArray styledAttrs = context.obtainStyledAttributes(attrs, R.styleable.BloodTextView);
        final String fontName = attrs.getAttributeValue(sScheme, typeface);



        styledAttrs.recycle();

        if (fontName != null) {
            Typeface typeface = Typeface.createFromAsset(context.getAssets(), fontName);
            setTypeface(typeface);
        }
    }



}
