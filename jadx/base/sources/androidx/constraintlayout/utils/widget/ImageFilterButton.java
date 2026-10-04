package androidx.constraintlayout.utils.widget;

import OooO.OooO00o;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f63826OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public float f63827OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Drawable f63828OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f63829OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f63830OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public float f63831OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f63832OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public float f63833OooOooO;

    private void setOverlay(boolean z) {
    }

    public final void OooO00o() {
        if (Float.isNaN(this.f63830OooOoOO) && Float.isNaN(this.f63832OooOoo0) && Float.isNaN(this.f63831OooOoo) && Float.isNaN(this.f63833OooOooO)) {
            return;
        }
        float f = Float.isNaN(this.f63830OooOoOO) ? 0.0f : this.f63830OooOoOO;
        float f2 = Float.isNaN(this.f63832OooOoo0) ? 0.0f : this.f63832OooOoo0;
        float f3 = Float.isNaN(this.f63831OooOoo) ? 1.0f : this.f63831OooOoo;
        float f4 = Float.isNaN(this.f63833OooOooO) ? 0.0f : this.f63833OooOooO;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f5 = f3 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f5, f5);
        float f6 = intrinsicWidth * f5;
        float f7 = f5 * intrinsicHeight;
        matrix.postTranslate(((((width - f6) * f) + width) - f6) * 0.5f, ((((height - f7) * f2) + height) - f7) * 0.5f);
        matrix.postRotate(f4, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void OooO0O0() {
        if (Float.isNaN(this.f63830OooOoOO) && Float.isNaN(this.f63832OooOoo0) && Float.isNaN(this.f63831OooOoo) && Float.isNaN(this.f63833OooOooO)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            OooO00o();
        }
    }

    public float getContrast() {
        throw null;
    }

    public float getCrossfade() {
        return this.f63827OooOo0o;
    }

    public float getImagePanX() {
        return this.f63830OooOoOO;
    }

    public float getImagePanY() {
        return this.f63832OooOoo0;
    }

    public float getImageRotate() {
        return this.f63833OooOooO;
    }

    public float getImageZoom() {
        return this.f63831OooOoo;
    }

    public float getRound() {
        return this.f63829OooOoO0;
    }

    public float getRoundPercent() {
        return this.f63826OooOo;
    }

    public float getSaturation() {
        throw null;
    }

    public float getWarmth() {
        throw null;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        OooO00o();
    }

    public void setAltImageResource(int i) {
        this.f63828OooOoO = OooO00o.OooO0OO(getContext(), i).mutate();
        throw null;
    }

    public void setBrightness(float f) {
        throw null;
    }

    public void setContrast(float f) {
        throw null;
    }

    public void setCrossfade(float f) {
        this.f63827OooOo0o = f;
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f63828OooOoO == null || drawable == null) {
            super.setImageDrawable(drawable);
        } else {
            drawable.mutate();
            throw null;
        }
    }

    public void setImagePanX(float f) {
        this.f63830OooOoOO = f;
        OooO0O0();
    }

    public void setImagePanY(float f) {
        this.f63832OooOoo0 = f;
        OooO0O0();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f63828OooOoO == null) {
            super.setImageResource(i);
        } else {
            OooO00o.OooO0OO(getContext(), i).mutate();
            throw null;
        }
    }

    public void setImageRotate(float f) {
        this.f63833OooOooO = f;
        OooO0O0();
    }

    public void setImageZoom(float f) {
        this.f63831OooOoo = f;
        OooO0O0();
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f63829OooOoO0 = f;
            float f2 = this.f63826OooOo;
            this.f63826OooOo = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f63829OooOoO0 != f;
        this.f63829OooOoO0 = f;
        if (f != 0.0f) {
            setClipToOutline(true);
            getWidth();
            getHeight();
            throw null;
        }
        setClipToOutline(false);
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.f63826OooOo != f;
        this.f63826OooOo = f;
        if (f != 0.0f) {
            setClipToOutline(true);
            Math.min(getWidth(), getHeight());
            throw null;
        }
        setClipToOutline(false);
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        throw null;
    }

    public void setWarmth(float f) {
        throw null;
    }
}
