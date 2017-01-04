package com.github.megatronking.svg.sample.drawables;

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
public class ic_svg_test extends SVGRenderer {

    public ic_svg_test(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 120.0f;
        final float scaleY = h / 2200.0f;
        final float minScale = Math.min(scaleX, scaleY);
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(10.0f, 10.0f);
        mPath.rLineTo(100.0f, 0f);
        mPath.rLineTo(0f, 100.0f);
        mPath.rLineTo(-100.0f, 0f);
        mPath.close();
        mPath.moveTo(10.0f, 10.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16724992, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);
        if (mStrokePaint == null) {
            mStrokePaint = new Paint();
            mStrokePaint.setStyle(Paint.Style.STROKE);
            mStrokePaint.setAntiAlias(true);
        }
        mStrokePaint.setStrokeJoin(Paint.Join.MITER);
        mStrokePaint.setStrokeCap(Paint.Cap.BUTT);
        mStrokePaint.setStrokeMiter(4.0f);
        mStrokePaint.setColor(applyAlpha(-16777114, 1.0f));
        mStrokePaint.setColorFilter(filter);
        mStrokePaint.setStrokeWidth(minScale * 1.0f * 1.0f);
        canvas.drawPath(mRenderPath, mStrokePaint);
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(40.0f, 50.0f);
        mPath.rMoveTo(-26.0f, 0.0f);
        mPath.cubicTo(14.0f, 43.107018f, 16.741148f, 36.4893f, 21.615223f, 31.615223f);
        mPath.cubicTo(26.4893f, 26.741148f, 33.107018f, 24.0f, 40.0f, 24.0f);
        mPath.cubicTo(46.892982f, 24.0f, 53.5107f, 26.741148f, 58.384777f, 31.615223f);
        mPath.cubicTo(63.258854f, 36.4893f, 66.0f, 43.107018f, 66.0f, 50.0f);
        mPath.cubicTo(66.0f, 56.892982f, 63.258854f, 63.5107f, 58.384777f, 68.38477f);
        mPath.cubicTo(53.5107f, 73.25885f, 46.892982f, 76.0f, 40.0f, 76.0f);
        mPath.cubicTo(33.107018f, 76.0f, 26.4893f, 73.25885f, 21.615223f, 68.38477f);
        mPath.cubicTo(16.741148f, 63.5107f, 14.0f, 56.892982f, 14.0f, 50.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        mFillPaint.setColor(applyAlpha(-3407872, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);
        mStrokePaint.setStrokeJoin(Paint.Join.MITER);
        mStrokePaint.setStrokeCap(Paint.Cap.BUTT);
        mStrokePaint.setStrokeMiter(4.0f);
        mStrokePaint.setColor(applyAlpha(-16751104, 1.0f));
        mStrokePaint.setColorFilter(filter);
        mStrokePaint.setStrokeWidth(minScale * 1.0f * 1.0f);
        canvas.drawPath(mRenderPath, mStrokePaint);

    }

}