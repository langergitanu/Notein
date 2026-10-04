package androidx.constraintlayout.utils.widget;

import OooO.OooO00o;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f63834OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Drawable f63835OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f63836OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f63837OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f63838OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public float f63839OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f63840OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public float f63841OooOooO;

    private void setOverlay(boolean z) {
    }

    public final void OooO0OO() {
        if (Float.isNaN(this.f63838OooOoOO) && Float.isNaN(this.f63840OooOoo0) && Float.isNaN(this.f63839OooOoo) && Float.isNaN(this.f63841OooOooO)) {
            return;
        }
        float f = Float.isNaN(this.f63838OooOoOO) ? 0.0f : this.f63838OooOoOO;
        float f2 = Float.isNaN(this.f63840OooOoo0) ? 0.0f : this.f63840OooOoo0;
        float f3 = Float.isNaN(this.f63839OooOoo) ? 1.0f : this.f63839OooOoo;
        float f4 = Float.isNaN(this.f63841OooOooO) ? 0.0f : this.f63841OooOooO;
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

    public final void OooO0Oo() {
        if (Float.isNaN(this.f63838OooOoOO) && Float.isNaN(this.f63840OooOoo0) && Float.isNaN(this.f63839OooOoo) && Float.isNaN(this.f63841OooOooO)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            OooO0OO();
        }
    }

    public float getBrightness() {
        throw null;
    }

    public float getContrast() {
        throw null;
    }

    public float getCrossfade() {
        return this.f63834OooOo;
    }

    public float getImagePanX() {
        return this.f63838OooOoOO;
    }

    public float getImagePanY() {
        return this.f63840OooOoo0;
    }

    public float getImageRotate() {
        return this.f63841OooOooO;
    }

    public float getImageZoom() {
        return this.f63839OooOoo;
    }

    public float getRound() {
        return this.f63836OooOoO;
    }

    public float getRoundPercent() {
        return this.f63837OooOoO0;
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
        OooO0OO();
    }

    public void setAltImageDrawable(Drawable drawable) {
        this.f63835OooOo0o = drawable.mutate();
        throw null;
    }

    public void setAltImageResource(int i) {
        Drawable drawableOooO0OO = OooO00o.OooO0OO(getContext(), i);
        this.f63835OooOo0o = drawableOooO0OO;
        setAltImageDrawable(drawableOooO0OO);
    }

    public void setBrightness(float f) {
        throw null;
    }

    public void setContrast(float f) {
        throw null;
    }

    public void setCrossfade(float f) {
        this.f63834OooOo = f;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f63835OooOo0o == null || drawable == null) {
            super.setImageDrawable(drawable);
        } else {
            drawable.mutate();
            throw null;
        }
    }

    public void setImagePanX(float f) {
        this.f63838OooOoOO = f;
        OooO0Oo();
    }

    public void setImagePanY(float f) {
        this.f63840OooOoo0 = f;
        OooO0Oo();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f63835OooOo0o == null) {
            super.setImageResource(i);
        } else {
            OooO00o.OooO0OO(getContext(), i).mutate();
            throw null;
        }
    }

    public void setImageRotate(float f) {
        this.f63841OooOooO = f;
        OooO0Oo();
    }

    public void setImageZoom(float f) {
        this.f63839OooOoo = f;
        OooO0Oo();
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f63836OooOoO = f;
            float f2 = this.f63837OooOoO0;
            this.f63837OooOoO0 = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f63836OooOoO != f;
        this.f63836OooOoO = f;
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
        boolean z = this.f63837OooOoO0 != f;
        this.f63837OooOoO0 = f;
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
