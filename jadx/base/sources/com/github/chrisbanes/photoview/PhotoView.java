package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import o00ooo0.C25810OooOOO0;
import o00ooo0.InterfaceC25797OooO;
import o00ooo0.InterfaceC25800OooO0OO;
import o00ooo0.InterfaceC25801OooO0Oo;
import o00ooo0.InterfaceC25802OooO0o;
import o00ooo0.InterfaceC25803OooO0o0;
import o00ooo0.InterfaceC25804OooO0oO;
import o00ooo0.InterfaceC25805OooO0oo;
import o00ooo0.ViewOnTouchListenerC25806OooOO0;

/* JADX INFO: loaded from: classes5.dex */
public class PhotoView extends AppCompatImageView {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ImageView.ScaleType f67554OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ViewOnTouchListenerC25806OooOO0 f67555OooOo0o;

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f67555OooOo0o = new ViewOnTouchListenerC25806OooOO0(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f67554OooOo;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f67554OooOo = null;
        }
    }

    public ViewOnTouchListenerC25806OooOO0 getAttacher() {
        return this.f67555OooOo0o;
    }

    public RectF getDisplayRect() {
        ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO0 = this.f67555OooOo0o;
        viewOnTouchListenerC25806OooOO0.OooO0O0();
        Matrix matrixOooO0OO = viewOnTouchListenerC25806OooOO0.OooO0OO();
        if (viewOnTouchListenerC25806OooOO0.f87992OooOooO.getDrawable() == null) {
            return null;
        }
        RectF rectF = viewOnTouchListenerC25806OooOO0.f87999Oooo0O0;
        rectF.set(0.0f, 0.0f, r2.getIntrinsicWidth(), r2.getIntrinsicHeight());
        matrixOooO0OO.mapRect(rectF);
        return rectF;
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f67555OooOo0o.f87998Oooo00o;
    }

    public float getMaximumScale() {
        return this.f67555OooOo0o.f87989OooOoOO;
    }

    public float getMediumScale() {
        return this.f67555OooOo0o.f87987OooOoO;
    }

    public float getMinimumScale() {
        return this.f67555OooOo0o.f87988OooOoO0;
    }

    public float getScale() {
        return this.f67555OooOo0o.OooO0Oo();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f67555OooOo0o.f88005OoooO0;
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f67555OooOo0o.f87991OooOoo0 = z;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.f67555OooOo0o.OooO0o();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO0 = this.f67555OooOo0o;
        if (viewOnTouchListenerC25806OooOO0 != null) {
            viewOnTouchListenerC25806OooOO0.OooO0o();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO0 = this.f67555OooOo0o;
        if (viewOnTouchListenerC25806OooOO0 != null) {
            viewOnTouchListenerC25806OooOO0.OooO0o();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO0 = this.f67555OooOo0o;
        if (viewOnTouchListenerC25806OooOO0 != null) {
            viewOnTouchListenerC25806OooOO0.OooO0o();
        }
    }

    public void setMaximumScale(float f) {
        ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO0 = this.f67555OooOo0o;
        C25810OooOOO0.OooO00o(viewOnTouchListenerC25806OooOO0.f87988OooOoO0, viewOnTouchListenerC25806OooOO0.f87987OooOoO, f);
        viewOnTouchListenerC25806OooOO0.f87989OooOoOO = f;
    }

    public void setMediumScale(float f) {
        ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO0 = this.f67555OooOo0o;
        C25810OooOOO0.OooO00o(viewOnTouchListenerC25806OooOO0.f87988OooOoO0, f, viewOnTouchListenerC25806OooOO0.f87989OooOoOO);
        viewOnTouchListenerC25806OooOO0.f87987OooOoO = f;
    }

    public void setMinimumScale(float f) {
        ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO0 = this.f67555OooOo0o;
        C25810OooOOO0.OooO00o(f, viewOnTouchListenerC25806OooOO0.f87987OooOoO, viewOnTouchListenerC25806OooOO0.f87989OooOoOO);
        viewOnTouchListenerC25806OooOO0.f87988OooOoO0 = f;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f67555OooOo0o.f88002Oooo0o0 = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f67555OooOo0o.f87993OooOooo.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f67555OooOo0o.f88001Oooo0o = onLongClickListener;
    }

    public void setOnMatrixChangeListener(InterfaceC25800OooO0OO interfaceC25800OooO0OO) {
        this.f67555OooOo0o.getClass();
    }

    public void setOnOutsidePhotoTapListener(InterfaceC25801OooO0Oo interfaceC25801OooO0Oo) {
        this.f67555OooOo0o.getClass();
    }

    public void setOnPhotoTapListener(InterfaceC25803OooO0o0 interfaceC25803OooO0o0) {
        this.f67555OooOo0o.getClass();
    }

    public void setOnScaleChangeListener(InterfaceC25802OooO0o interfaceC25802OooO0o) {
        this.f67555OooOo0o.getClass();
    }

    public void setOnSingleFlingListener(InterfaceC25804OooO0oO interfaceC25804OooO0oO) {
        this.f67555OooOo0o.getClass();
    }

    public void setOnViewDragListener(InterfaceC25805OooO0oo interfaceC25805OooO0oo) {
        this.f67555OooOo0o.getClass();
    }

    public void setOnViewTapListener(InterfaceC25797OooO interfaceC25797OooO) {
        this.f67555OooOo0o.getClass();
    }

    public void setRotationBy(float f) {
        ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO0 = this.f67555OooOo0o;
        viewOnTouchListenerC25806OooOO0.f87995Oooo0.postRotate(f % 360.0f);
        viewOnTouchListenerC25806OooOO0.OooO00o();
    }

    public void setRotationTo(float f) {
        ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO0 = this.f67555OooOo0o;
        viewOnTouchListenerC25806OooOO0.f87995Oooo0.setRotate(f % 360.0f);
        viewOnTouchListenerC25806OooOO0.OooO00o();
    }

    public void setScale(float f) {
        ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO0 = this.f67555OooOo0o;
        PhotoView photoView = viewOnTouchListenerC25806OooOO0.f87992OooOooO;
        viewOnTouchListenerC25806OooOO0.OooO0o0(f, photoView.getRight() / 2, photoView.getBottom() / 2, false);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO0 = this.f67555OooOo0o;
        if (viewOnTouchListenerC25806OooOO0 == null) {
            this.f67554OooOo = scaleType;
            return;
        }
        viewOnTouchListenerC25806OooOO0.getClass();
        if (scaleType == null) {
            return;
        }
        if (C25810OooOOO0.OooO00o.f88022OooO00o[scaleType.ordinal()] == 1) {
            throw new IllegalStateException("Matrix scale type is not supported");
        }
        if (scaleType != viewOnTouchListenerC25806OooOO0.f88005OoooO0) {
            viewOnTouchListenerC25806OooOO0.f88005OoooO0 = scaleType;
            viewOnTouchListenerC25806OooOO0.OooO0o();
        }
    }

    public void setZoomTransitionDuration(int i) {
        this.f67555OooOo0o.f87985OooOo = i;
    }

    public void setZoomable(boolean z) {
        ViewOnTouchListenerC25806OooOO0 viewOnTouchListenerC25806OooOO0 = this.f67555OooOo0o;
        viewOnTouchListenerC25806OooOO0.f88006OoooO00 = z;
        viewOnTouchListenerC25806OooOO0.OooO0o();
    }
}
