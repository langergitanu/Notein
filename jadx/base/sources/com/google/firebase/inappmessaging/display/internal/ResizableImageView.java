package com.google.firebase.inappmessaging.display.internal;

import OooO0Oo.C20398OooO0O0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes8.dex */
public class ResizableImageView extends AppCompatImageView {
    private int mDensityDpi;

    public static class Dimensions {

        /* JADX INFO: renamed from: h */
        final int f51821h;

        /* JADX INFO: renamed from: w */
        final int f51822w;

        private Dimensions(int i, int i2) {
            this.f51822w = i;
            this.f51821h = i2;
        }
    }

    public ResizableImageView(Context context) {
        super(context);
        init(context);
    }

    private Dimensions bound(int i, int i2) {
        int maxWidth = getMaxWidth();
        int maxHeight = getMaxHeight();
        if (i > maxWidth) {
            Logging.logdNumber("Image: capping width", maxWidth);
            i2 = (i2 * maxWidth) / i;
            i = maxWidth;
        }
        if (i2 > maxHeight) {
            Logging.logdNumber("Image: capping height", maxHeight);
            i = (i * maxHeight) / i2;
        } else {
            maxHeight = i2;
        }
        return new Dimensions(i, maxHeight);
    }

    private void checkMinDim() {
        int iMax = Math.max(getMinimumWidth(), getSuggestedMinimumWidth());
        int iMax2 = Math.max(getMinimumHeight(), getSuggestedMinimumHeight());
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = iMax;
        float f2 = iMax2;
        Logging.logdPair("Image: min width, height", f, f2);
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        Logging.logdPair("Image: actual width, height", f3, f4);
        float f5 = measuredWidth < iMax ? f / f3 : 1.0f;
        float f6 = measuredHeight < iMax2 ? f2 / f4 : 1.0f;
        if (f5 <= f6) {
            f5 = f6;
        }
        if (f5 > 1.0d) {
            int iCeil = (int) Math.ceil(f3 * f5);
            int iCeil2 = (int) Math.ceil(f4 * f5);
            StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("Measured dimension (", measuredWidth, "x", ") too small.  Resizing to ", measuredHeight);
            sbOooO0O0.append(iCeil);
            sbOooO0O0.append("x");
            sbOooO0O0.append(iCeil2);
            Logging.logd(sbOooO0O0.toString());
            Dimensions dimensionsBound = bound(iCeil, iCeil2);
            setMeasuredDimension(dimensionsBound.f51822w, dimensionsBound.f51821h);
        }
    }

    private void init(Context context) {
        this.mDensityDpi = (int) (context.getResources().getDisplayMetrics().density * 160.0f);
    }

    private void scalePxToDp(Drawable drawable) {
        Logging.logdPair("Image: intrinsic width, height", drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        Dimensions dimensionsBound = bound((int) Math.ceil((r0 * this.mDensityDpi) / 160), (int) Math.ceil((r5 * this.mDensityDpi) / 160));
        Logging.logdPair("Image: new target dimensions", dimensionsBound.f51822w, dimensionsBound.f51821h);
        setMeasuredDimension(dimensionsBound.f51822w, dimensionsBound.f51821h);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Drawable drawable = getDrawable();
        boolean adjustViewBounds = getAdjustViewBounds();
        if (drawable == null || !adjustViewBounds) {
            return;
        }
        scalePxToDp(drawable);
        checkMinDim();
    }

    public ResizableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public ResizableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
