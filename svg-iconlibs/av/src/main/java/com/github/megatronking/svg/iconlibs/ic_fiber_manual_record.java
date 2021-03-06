package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_fiber_manual_record extends SVGRenderer {

    public ic_fiber_manual_record(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(12.0f, 12.0f);
        mPath.rMoveTo(-8.0f, 0.0f);
        mPath.cubicTo(4.0f, 9.879082f, 4.84343f, 7.842861f, 6.343146f, 6.343146f);
        mPath.cubicTo(7.842861f, 4.84343f, 9.879082f, 4.0f, 12.0f, 4.0f);
        mPath.cubicTo(14.120918f, 4.0f, 16.157139f, 4.84343f, 17.656855f, 6.343146f);
        mPath.cubicTo(19.15657f, 7.842861f, 20.0f, 9.879082f, 20.0f, 12.0f);
        mPath.cubicTo(20.0f, 14.120918f, 19.15657f, 16.157139f, 17.656855f, 17.656855f);
        mPath.cubicTo(16.157139f, 19.15657f, 14.120918f, 20.0f, 12.0f, 20.0f);
        mPath.cubicTo(9.879082f, 20.0f, 7.842861f, 19.15657f, 6.343146f, 17.656855f);
        mPath.cubicTo(4.84343f, 16.157139f, 4.0f, 14.120918f, 4.0f, 12.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16711423, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}