package com.orion.editor;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import com.orion.editor.ForegroundView;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.ShapeInfo;
import kotlin.jvm.internal.OooOOO0;
import o0O0oOOO.C26120OooO0Oo;
import o0O0oOOO.C26121OooO0o0;
import o0oo0o.InterfaceC31284OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public class ForegroundView extends View {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C26121OooO0o0 f69047OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C26120OooO0Oo f69048OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public OooO00o f69049OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public PDFView f69050OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f69051OooOoOO;

    public class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC31284OooO0O0 f69052OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ValueAnimator f69053OooO0O0;

        public OooO00o(InterfaceC31284OooO0O0 interfaceC31284OooO0O0) {
            this.f69052OooO00o = interfaceC31284OooO0O0;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.2f);
            this.f69053OooO0O0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(150L);
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0O0o00.OooOOO
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ForegroundView.this.invalidate();
                }
            });
        }
    }

    public ForegroundView(Context context) {
        super(context);
        this.f69048OooOo0o = new C26120OooO0Oo();
        this.f69047OooOo = new C26121OooO0o0();
        this.f69051OooOoOO = false;
        setLayerType(0, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f69050OooOoO0 == null || !this.f69051OooOoOO) {
            return;
        }
        OooO00o oooO00o = this.f69049OooOoO;
        C26121OooO0o0 c26121OooO0o0 = this.f69047OooOo;
        if (oooO00o != null) {
            InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = oooO00o.f69052OooO00o;
            InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy = interfaceC31284OooO0O0.deepCopy(interfaceC31284OooO0O0.getId());
            RectF boundingBox = interfaceC31284OooO0O0.getBoundingBox(1.0f);
            interfaceC31284OooO0O0DeepCopy.scale(((Float) oooO00o.f69053OooO0O0.getAnimatedValue()).floatValue(), false);
            RectF boundingBox2 = interfaceC31284OooO0O0DeepCopy.getBoundingBox(1.0f);
            interfaceC31284OooO0O0DeepCopy.offset(boundingBox.centerX() - boundingBox2.centerX(), boundingBox.centerY() - boundingBox2.centerY());
            if (interfaceC31284OooO0O0DeepCopy instanceof DrawRecord) {
                ((DrawRecord) interfaceC31284OooO0O0DeepCopy).drawOnCanvasV2(canvas, 1.0f, this.f69050OooOoO0.getPenWidthScale());
            } else if (interfaceC31284OooO0O0DeepCopy instanceof ShapeInfo) {
                Context context = getContext();
                c26121OooO0o0.getClass();
                OooOOO0.OooO0oO(canvas, "canvas");
                canvas2 = canvas;
                C26121OooO0o0.OooO0Oo(c26121OooO0o0, canvas2, context, 0.0f, 0.0f, 60);
                C26120OooO0Oo c26120OooO0Oo = this.f69048OooOo0o;
                c26120OooO0Oo.OooOo00(c26121OooO0o0);
                interfaceC31284OooO0O0DeepCopy.render(c26120OooO0Oo, c26121OooO0o0, 1.0f);
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
        }
        Context context2 = getContext();
        float zoomLevel = this.f69050OooOoO0.getZoomLevel();
        float zoomLevel2 = this.f69050OooOoO0.getZoomLevel();
        c26121OooO0o0.getClass();
        OooOOO0.OooO0oO(canvas2, "canvas");
        C26121OooO0o0.OooO0Oo(c26121OooO0o0, canvas2, context2, zoomLevel, zoomLevel2, 48);
        this.f69050OooOoO0.getTool().OooOO0(c26121OooO0o0, true);
    }

    public void setupLayout(PDFView pDFView) {
        boolean z = this.f69051OooOoOO;
        C26121OooO0o0 c26121OooO0o0 = this.f69047OooOo;
        if (z && this.f69050OooOoO0 == pDFView && getParent() == pDFView) {
            c26121OooO0o0.f89175OooO0OO = pDFView.getColorInversion();
            invalidate();
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null && viewGroup != pDFView) {
            viewGroup.removeView(this);
        }
        this.f69050OooOoO0 = pDFView;
        if (getParent() != pDFView) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ForegroundView");
            c20358OooO00o.OooO0o0("Adding ForegroundView to PDFView", new Object[0]);
            pDFView.addView(this, layoutParams);
        }
        this.f69051OooOoOO = true;
        c26121OooO0o0.f89175OooO0OO = pDFView.getColorInversion();
        invalidate();
    }
}
