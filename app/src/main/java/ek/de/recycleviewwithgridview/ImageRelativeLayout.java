package ek.de.recycleviewwithgridview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Created by Enrico on 04.11.2016.
 */

//Used to prevent all images to use to much height
public class ImageRelativeLayout extends RelativeLayout {
    public ImageRelativeLayout(Context context) {
        super(context);
    }

    public ImageRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ImageRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private static final double WIDTH_RATIO = 4;//3;
    private static final double HEIGHT_RATIO = 4;
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightSize = (int) (HEIGHT_RATIO / WIDTH_RATIO * widthSize);
        int newHeightSpec = MeasureSpec.makeMeasureSpec(heightSize, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, newHeightSpec);
    }
}
