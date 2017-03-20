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
public class ic_movie_filter extends SVGRenderer {

    public ic_movie_filter(Context context) {
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
        
        mPath.moveTo(18.0f, 4.0f);
        mPath.rLineTo(2.0f, 3.0f);
        mPath.rLineTo(-3.0f, 0f);
        mPath.rLineTo(-2.0f, -3.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(2.0f, 3.0f);
        mPath.rLineTo(-3.0f, 0f);
        mPath.rLineTo(-2.0f, -3.0f);
        mPath.lineTo(8.0f, 4.0f);
        mPath.rLineTo(2.0f, 3.0f);
        mPath.lineTo(7.0f, 7.0f);
        mPath.lineTo(5.0f, 4.0f);
        mPath.lineTo(4.0f, 4.0f);
        mPath.rCubicTo(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        mPath.lineTo(2.0f, 18.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(16.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.lineTo(22.0f, 4.0f);
        mPath.rLineTo(-4.0f, 0f);
        mPath.close();
        mPath.moveTo(18.0f, 4.0f);
        mPath.rMoveTo(-6.75f, 11.25f);
        mPath.lineTo(10.0f, 18.0f);
        mPath.rLineTo(-1.25f, -2.75f);
        mPath.lineTo(6.0f, 14.0f);
        mPath.rLineTo(2.75f, -1.25f);
        mPath.lineTo(10.0f, 10.0f);
        mPath.rLineTo(1.25f, 2.75f);
        mPath.lineTo(14.0f, 14.0f);
        mPath.rLineTo(-2.75f, 1.25f);
        mPath.close();
        mPath.moveTo(11.25f, 15.25f);
        mPath.rMoveTo(5.69f, -3.31f);
        mPath.lineTo(16.0f, 14.0f);
        mPath.rLineTo(-0.94f, -2.06f);
        mPath.lineTo(13.0f, 11.0f);
        mPath.rLineTo(2.06f, -0.94f);
        mPath.lineTo(16.0f, 8.0f);
        mPath.rLineTo(0.94f, 2.06f);
        mPath.lineTo(19.0f, 11.0f);
        mPath.rLineTo(-2.06f, 0.94f);
        mPath.close();
        mPath.moveTo(16.94f, 11.940001f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}