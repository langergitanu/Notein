package com.miui.penengine.p596e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.miui.penengine.p594c.C18759b;

/* JADX INFO: renamed from: com.miui.penengine.e.d */
/* JADX INFO: loaded from: classes9.dex */
public class C18769d extends View {

    /* JADX INFO: renamed from: j */
    public static final String f57195j = "d";

    /* JADX INFO: renamed from: a */
    public Bitmap f57196a;

    /* JADX INFO: renamed from: b */
    public float f57197b;

    /* JADX INFO: renamed from: c */
    public float f57198c;

    /* JADX INFO: renamed from: d */
    public Matrix f57199d;

    /* JADX INFO: renamed from: e */
    public Context f57200e;

    /* JADX INFO: renamed from: f */
    public float f57201f;

    /* JADX INFO: renamed from: g */
    public ViewGroup f57202g;

    /* JADX INFO: renamed from: h */
    public View f57203h;

    /* JADX INFO: renamed from: i */
    public int f57204i;

    public C18769d(Context context, View view) {
        super(context);
        this.f57204i = 0;
        this.f57196a = null;
        this.f57201f = 1.0f;
        this.f57200e = context;
        this.f57199d = new Matrix();
        this.f57203h = view;
        m80334b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m80331c() {
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setBackgroundColor(-1);
        getBackground().setAlpha(0);
        this.f57202g.addView(this);
        bringToFront();
    }

    /* JADX INFO: renamed from: a */
    public void m80332a() {
        ViewParent parent = this.f57203h.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.f57202g = viewGroup;
            viewGroup.removeView(this);
        }
        Bitmap bitmap = this.f57196a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f57196a = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m80334b() {
        ViewParent parent = this.f57203h.getParent();
        if (parent instanceof ViewGroup) {
            this.f57202g = (ViewGroup) parent;
            this.f57203h.post(new Runnable() { // from class: o0O0Oo.OooO00o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f88409OooOo0o.m80331c();
                }
            });
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f57196a == null) {
            return;
        }
        this.f57199d.reset();
        this.f57199d.postRotate(this.f57204i);
        Matrix matrix = this.f57199d;
        float f = this.f57201f;
        matrix.postScale(f, f);
        Bitmap bitmap = this.f57196a;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.f57196a.getHeight(), this.f57199d, true);
        this.f57199d.reset();
        this.f57199d.postTranslate(this.f57197b - (bitmapCreateBitmap.getWidth() / 2), this.f57198c - (bitmapCreateBitmap.getHeight() / 2));
        canvas.drawBitmap(bitmapCreateBitmap, this.f57199d, null);
        bitmapCreateBitmap.recycle();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (this.f57196a == null) {
            return super.onHoverEvent(motionEvent);
        }
        if (motionEvent.getToolType(0) == 2) {
            if (motionEvent.getAction() == 10) {
                this.f57196a.eraseColor(0);
            } else {
                this.f57197b = motionEvent.getX();
                this.f57198c = motionEvent.getY();
                this.f57196a.eraseColor(Color.parseColor("#FF0000"));
            }
            invalidate();
        }
        return super.onHoverEvent(motionEvent);
    }

    public void setHoverBrush(Bitmap bitmap) {
        Bitmap bitmap2 = this.f57196a;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.f57196a = null;
        }
        this.f57196a = Bitmap.createBitmap(bitmap);
    }

    /* JADX INFO: renamed from: a */
    public void m80333a(float f) {
        this.f57204i = (int) f;
        C18759b.m80277c(f57195j, "Posture degree = " + this.f57204i);
    }

    /* JADX INFO: renamed from: b */
    public void m80335b(float f) {
        this.f57201f = f;
        C18759b.m80277c(f57195j, "Brush coefficient = " + this.f57201f);
    }
}
