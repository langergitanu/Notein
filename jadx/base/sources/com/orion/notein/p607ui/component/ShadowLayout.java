package com.orion.notein.p607ui.component;

import OooOoO.C20509OooO0oo;
import Oooo00o.OooO0OO;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.orion.notein.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m80612d2 = {"Lcom/orion/notein/ui/component/ShadowLayout;", "Landroid/widget/FrameLayout;", "", "radiusPx", "LoO00ooO/OooOooO;", "setCornerRadius", "(F)V", "", "color", "setFillColor", "(I)V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ShadowLayout extends FrameLayout {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f70813OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public float f70814OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final boolean f70815OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f70816OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final RectF f70817OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final RectF f70818OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final Path f70819OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final RectF f70820OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final OooO00o f70821OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f70822Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final OooO00o f70823Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final Paint f70824Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final Paint f70825Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f70826Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public int f70827Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public int f70828Oooo0o0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f70829OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f70830OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f70831OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f70832OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f70833OooO0o0;

        public OooO00o(float f, float f2, float f3, float f4, int i) {
            this.f70829OooO00o = i;
            this.f70830OooO0O0 = f;
            this.f70831OooO0OO = f2;
            this.f70832OooO0Oo = f3;
            this.f70833OooO0o0 = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f70829OooO00o == oooO00o.f70829OooO00o && Float.compare(this.f70830OooO0O0, oooO00o.f70830OooO0O0) == 0 && Float.compare(this.f70831OooO0OO, oooO00o.f70831OooO0OO) == 0 && Float.compare(this.f70832OooO0Oo, oooO00o.f70832OooO0Oo) == 0 && Float.compare(this.f70833OooO0o0, oooO00o.f70833OooO0o0) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f70833OooO0o0) + C20509OooO0oo.OooO0OO(this.f70832OooO0Oo, C20509OooO0oo.OooO0OO(this.f70831OooO0OO, C20509OooO0oo.OooO0OO(this.f70830OooO0O0, Integer.hashCode(this.f70829OooO00o) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShadowLayer(color=");
            sb.append(this.f70829OooO00o);
            sb.append(", dx=");
            sb.append(this.f70830OooO0O0);
            sb.append(", dy=");
            sb.append(this.f70831OooO0OO);
            sb.append(", blur=");
            sb.append(this.f70832OooO0Oo);
            sb.append(", spread=");
            return OooO0OO.OooO0OO(sb, this.f70833OooO0o0, ")");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f70814OooOo0o = OooO0O0(2.0f);
        this.f70816OooOoO0 = true;
        this.f70815OooOoO = true;
        this.f70817OooOoOO = new RectF();
        this.f70819OooOoo0 = new Path();
        this.f70818OooOoo = new RectF();
        this.f70820OooOooO = new RectF();
        int iArgb = Color.argb(77, 0, 0, 0);
        float fOooO0O0 = OooO0O0(1.0f);
        float fOooO0O02 = OooO0O0(2.0f);
        this.f70821OooOooo = new OooO00o(0.0f, fOooO0O0, fOooO0O02, 0.0f, iArgb);
        int iArgb2 = Color.argb(38, 0, 0, 0);
        float fOooO0O03 = OooO0O0(1.0f);
        float fOooO0O04 = OooO0O0(3.0f);
        float fOooO0O05 = OooO0O0(1.0f);
        this.f70823Oooo000 = new OooO00o(0.0f, fOooO0O03, fOooO0O04, fOooO0O05, iArgb2);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(0);
        this.f70824Oooo00O = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        this.f70825Oooo00o = paint2;
        this.f70822Oooo0 = getPaddingStart();
        this.f70826Oooo0O0 = getPaddingTop();
        this.f70827Oooo0OO = getPaddingEnd();
        this.f70828Oooo0o0 = getPaddingBottom();
        setWillNotDraw(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f69778OooO0OO, 0, 0);
        this.f70814OooOo0o = typedArrayObtainStyledAttributes.getDimension(2, this.f70814OooOo0o);
        this.f70813OooOo = typedArrayObtainStyledAttributes.getColor(3, this.f70813OooOo);
        this.f70816OooOoO0 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.f70821OooOooo = new OooO00o(typedArrayObtainStyledAttributes.getDimension(6, 0.0f), typedArrayObtainStyledAttributes.getDimension(7, fOooO0O0), typedArrayObtainStyledAttributes.getDimension(4, fOooO0O02), typedArrayObtainStyledAttributes.getDimension(8, 0.0f), typedArrayObtainStyledAttributes.getColor(5, iArgb));
        this.f70823Oooo000 = new OooO00o(typedArrayObtainStyledAttributes.getDimension(11, 0.0f), typedArrayObtainStyledAttributes.getDimension(12, fOooO0O03), typedArrayObtainStyledAttributes.getDimension(9, fOooO0O04), typedArrayObtainStyledAttributes.getDimension(13, fOooO0O05), typedArrayObtainStyledAttributes.getColor(10, iArgb2));
        this.f70815OooOoO = typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
        setLayerType(0, null);
        OooO00o();
    }

    public final void OooO00o() {
        if (!this.f70816OooOoO0) {
            super.setPaddingRelative(this.f70822Oooo0, this.f70826Oooo0O0, this.f70827Oooo0OO, this.f70828Oooo0o0);
            return;
        }
        OooO00o[] oooO00oArr = {this.f70821OooOooo, this.f70823Oooo000};
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        float fMax3 = 0.0f;
        float fMax4 = 0.0f;
        for (int i = 0; i < 2; i++) {
            OooO00o oooO00o = oooO00oArr[i];
            float f = oooO00o.f70832OooO0Oo + oooO00o.f70833OooO0o0;
            float f2 = oooO00o.f70830OooO0O0;
            fMax = Math.max(fMax, Math.max(0.0f, -f2) + f);
            fMax3 = Math.max(fMax3, Math.max(0.0f, f2) + f);
            float f3 = oooO00o.f70831OooO0OO;
            fMax2 = Math.max(fMax2, Math.max(0.0f, -f3) + f);
            fMax4 = Math.max(fMax4, Math.max(0.0f, f3) + f);
        }
        super.setPaddingRelative(this.f70822Oooo0 + ((int) Math.ceil(fMax)), this.f70826Oooo0O0 + ((int) Math.ceil(fMax2)), this.f70827Oooo0OO + ((int) Math.ceil(fMax3)), this.f70828Oooo0o0 + ((int) Math.ceil(fMax4)));
    }

    public final float OooO0O0(float f) {
        return f * getResources().getDisplayMetrics().density;
    }

    public final void OooO0OO(Canvas canvas, RectF rectF, OooO00o oooO00o) {
        RectF rectF2 = this.f70820OooOooO;
        rectF2.set(rectF);
        float f = -oooO00o.f70833OooO0o0;
        rectF2.inset(f, f);
        float fMax = Math.max(0.0f, this.f70814OooOo0o + oooO00o.f70833OooO0o0);
        Paint paint = this.f70824Oooo00O;
        paint.setShadowLayer(oooO00o.f70832OooO0Oo, oooO00o.f70830OooO0O0, oooO00o.f70831OooO0OO, oooO00o.f70829OooO00o);
        canvas.drawRoundRect(rectF2, fMax, fMax, paint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        if (!this.f70815OooOoO) {
            super.dispatchDraw(canvas);
            return;
        }
        RectF rectF = this.f70817OooOoOO;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        Path path = this.f70819OooOoo0;
        path.reset();
        float f = this.f70814OooOo0o;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        int iSave = canvas.save();
        try {
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        super.onDraw(canvas);
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        RectF rectF = this.f70818OooOoo;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        OooO0OO(canvas, rectF, this.f70821OooOooo);
        OooO0OO(canvas, rectF, this.f70823Oooo000);
        int i = this.f70813OooOo;
        if ((i >>> 24) != 0) {
            Paint paint = this.f70825Oooo00o;
            paint.setColor(i);
            float f = this.f70814OooOo0o;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public final void setCornerRadius(float radiusPx) {
        this.f70814OooOo0o = radiusPx;
        invalidate();
    }

    public final void setFillColor(int color) {
        this.f70813OooOo = color;
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        this.f70822Oooo0 = i;
        this.f70826Oooo0O0 = i2;
        this.f70827Oooo0OO = i3;
        this.f70828Oooo0o0 = i4;
        OooO00o();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        this.f70822Oooo0 = i;
        this.f70826Oooo0O0 = i2;
        this.f70827Oooo0OO = i3;
        this.f70828Oooo0o0 = i4;
        OooO00o();
    }
}
