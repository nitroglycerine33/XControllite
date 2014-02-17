package com.eclipse.xcontrollite.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.eclipse.xcontrollite.R;
import com.eclipse.xcontrollite.settings.BaseSetting;


public class CategorySeparator extends LinearLayout {

    public CategorySeparator(Context context) {
        this(context, null);
    }

    public CategorySeparator(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CategorySeparator(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));

        View.inflate(context, R.layout.setting_category, this);

        if (attrs != null) {
            int title = attrs.getAttributeResourceValue(BaseSetting.NAMESPACE_ANDROID, "title", 0);
            if (title > 0) {
                TextView textView = (TextView) findViewById(R.id.title);
                textView.setText(title);
                textView.setVisibility(View.VISIBLE);
            }
        }
    }

}
