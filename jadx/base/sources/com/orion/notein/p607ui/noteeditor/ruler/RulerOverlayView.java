package com.orion.notein.p607ui.noteeditor.ruler;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.aspose.words.StyleIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0oOo.C28312OooO0oO;
import o0o0000o.C29728OooO0Oo;
import o0o0000o.C29729OooO0o0;
import o0o0000o.OooO0O0;
import o0o0000o.OooO0OO;
import o0o0000o.OooO0o;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012¨\u0006\u0018"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/ruler/RulerOverlayView;", "Landroid/view/View;", "Lkotlin/Function1;", "Lo0o0000o/OooO0o;", "LoO00ooO/OooOooO;", "OooOo0o", "LoO0O000o/OooOO0o;", "getTransformListener", "()LoO0O000o/OooOO0o;", "setTransformListener", "(LoO0O000o/OooOO0o;)V", "transformListener", "Lkotlin/Function0;", "OooOo", "LoO0O000o/OooO00o;", "getGestureEndListener", "()LoO0O000o/OooO00o;", "setGestureEndListener", "(LoO0O000o/OooO00o;)V", "gestureEndListener", "OooOoO0", "getAngleDialClickListener", "setAngleDialClickListener", "angleDialClickListener", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class RulerOverlayView extends View {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public static final /* synthetic */ int f76189OooooOo = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name and from kotlin metadata */
    public OooO00o<C32460OooOooO> gestureEndListener;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name and from kotlin metadata */
    public InterfaceC32507OooOO0o<? super OooO0o, C32460OooOooO> transformListener;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C29728OooO0Oo f76192OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name and from kotlin metadata */
    public OooO00o<C32460OooOooO> angleDialClickListener;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Paint f76194OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final float f76195OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final Paint f76196OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final float f76197OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final int f76198OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final Paint f76199Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final Paint f76200Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final int f76201Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final int f76202Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final Paint f76203Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final float f76204Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final Paint f76205Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Paint f76206Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final Paint f76207Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Paint f76208Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Paint f76209Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final float f76210OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final RectF f76211OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final Paint f76212OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final float f76213OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final float f76214OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final float f76215OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final float f76216OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final OooO0O0 f76217OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f76218OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f76219OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f76220Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final PointF f76221Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final PointF f76222OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final float f76223OooooOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final float f76224o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RulerOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f76192OooOoO = new C29728OooO0Oo(63);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(Color.parseColor("#1F767680"));
        this.f76194OooOoOO = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        paint2.setStrokeWidth(2.0f);
        paint2.setColor(Color.parseColor("#FF999999"));
        this.f76196OooOoo0 = paint2;
        this.f76195OooOoo = getResources().getDisplayMetrics().density * 1.0f;
        this.f76197OooOooO = getResources().getDisplayMetrics().density * 2.0f;
        this.f76198OooOooo = Color.argb(oO0O00O.OooO00o.OooO0O0(76.5f), 0, 0, 0);
        this.f76201Oooo000 = Color.argb(oO0O00O.OooO00o.OooO0O0(20.4f), 0, 0, 0);
        this.f76202Oooo00O = Color.argb(0, 0, 0, 0);
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        this.f76203Oooo00o = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        this.f76200Oooo0 = paint4;
        this.f76204Oooo0O0 = C29729OooO0o0.f105441OooO00o;
        Paint paint5 = new Paint(1);
        paint5.setStyle(style);
        paint5.setColor(Color.parseColor("#29787880"));
        this.f76205Oooo0OO = paint5;
        Paint paint6 = new Paint(1);
        paint6.setStyle(style2);
        paint6.setStrokeWidth(2.0f);
        paint6.setColor(Color.parseColor("#80FFFFFF"));
        this.f76207Oooo0o0 = paint6;
        Paint paint7 = new Paint(1);
        paint7.setStyle(style2);
        paint7.setStrokeWidth(1.5f);
        paint7.setColor(Color.parseColor("#80B0B0B0"));
        this.f76206Oooo0o = paint7;
        Paint paint8 = new Paint(1);
        paint8.setStyle(style2);
        paint8.setStrokeWidth(2.5f);
        paint8.setColor(Color.parseColor("#FFEE5A5A"));
        this.f76208Oooo0oO = paint8;
        float f = getResources().getDisplayMetrics().density * 14.0f;
        Paint paint9 = new Paint(1);
        paint9.setColor(Color.parseColor("#FF636366"));
        paint9.setTextSize(f);
        Paint.Align align = Paint.Align.CENTER;
        paint9.setTextAlign(align);
        paint9.setTypeface(Typeface.create("sans-serif-medium", 0));
        this.f76209Oooo0oo = paint9;
        Paint paint10 = new Paint(paint9);
        paint10.setTextSize(f * 0.75f);
        paint10.setTextAlign(Paint.Align.LEFT);
        this.f76199Oooo = paint10;
        Paint paint11 = new Paint(1);
        paint11.setStyle(style);
        paint11.setColor(-1);
        paint11.setTextSize(getResources().getDisplayMetrics().scaledDensity * 12.0f);
        paint11.setTextAlign(align);
        this.f76212OoooO00 = paint11;
        this.f76211OoooO0 = new RectF();
        this.f76213OoooO0O = getResources().getDisplayMetrics().density * 21.0f;
        this.f76210OoooO = getResources().getDisplayMetrics().density * 22.0f;
        this.f76214OoooOO0 = getResources().getDisplayMetrics().density * 14.0f;
        this.f76224o000oOoO = getResources().getDisplayMetrics().density * 8.0f;
        this.f76215OoooOOO = getResources().getDisplayMetrics().density * 14.0f;
        this.f76216OoooOOo = getResources().getDisplayMetrics().density * 2.0f;
        this.f76217OoooOo0 = new OooO0O0(new OooO0OO(this), new C28312OooO0oO(this, 1));
        this.f76220Ooooo00 = -1;
        this.f76221Ooooo0o = new PointF();
        this.f76222OooooO0 = new PointF();
        float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f76223OooooOO = scaledTouchSlop * scaledTouchSlop;
    }

    public static void OooO00o(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, int i, int i2) {
        paint.setShader(new LinearGradient(0.0f, f3, 0.0f, f4, i, i2, Shader.TileMode.CLAMP));
        canvas.drawRect(f, Math.min(f3, f4), f2, Math.max(f3, f4), paint);
    }

    public final void OooO0O0(float f, float f2, PointF pointF) {
        C29728OooO0Oo c29728OooO0Oo = this.f76192OooOoO;
        PointF pointF2 = c29728OooO0Oo.f105432OooO0O0;
        float f3 = f - pointF2.x;
        float f4 = f2 - pointF2.y;
        double d = -c29728OooO0Oo.f105434OooO0Oo;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        pointF.x = (f3 * fCos) - (f4 * fSin);
        pointF.y = (f4 * fCos) + (f3 * fSin);
    }

    public final void OooO0OO(C29728OooO0Oo newState) {
        OooOOO0.OooO0oO(newState, "newState");
        PointF pointF = newState.f105432OooO0O0;
        this.f76192OooOoO = C29728OooO0Oo.OooO00o(newState, false, new PointF(pointF.x, pointF.y), 0.0f, 0.0f, 0.0f, 61);
        invalidate();
    }

    public final OooO00o<C32460OooOooO> getAngleDialClickListener() {
        return this.angleDialClickListener;
    }

    public final OooO00o<C32460OooOooO> getGestureEndListener() {
        return this.gestureEndListener;
    }

    public final InterfaceC32507OooOO0o<OooO0o, C32460OooOooO> getTransformListener() {
        return this.transformListener;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        float f;
        float f2;
        OooOOO0.OooO0oO(canvas, "canvas");
        super.onDraw(canvas);
        C29728OooO0Oo c29728OooO0Oo = this.f76192OooOoO;
        if (c29728OooO0Oo.f105431OooO00o) {
            float f3 = c29728OooO0Oo.f105433OooO0OO / 2.0f;
            float f4 = this.f76204Oooo0O0 / 2.0f;
            float fMin = Math.min(f4, 16.0f);
            canvas.save();
            PointF pointF = this.f76192OooOoO.f105432OooO0O0;
            canvas.translate(pointF.x, pointF.y);
            canvas.rotate((this.f76192OooOoO.f105434OooO0Oo * 180.0f) / 3.1415927f);
            RectF rectF = this.f76211OoooO0;
            float f5 = -f3;
            float f6 = -f4;
            rectF.set(f5, f6, f3, f4);
            canvas.drawRoundRect(rectF, fMin, fMin, this.f76194OooOoOO);
            float f7 = this.f76195OooOoo;
            float f8 = f6 - f7;
            Paint paint = this.f76203Oooo00o;
            OooO00o(canvas, paint, f5, f3, f6, f8, this.f76198OooOooo, this.f76201Oooo000);
            float f9 = f6;
            float f10 = this.f76197OooOooO;
            OooO00o(canvas, paint, f5, f3, f8, f8 - f10, this.f76201Oooo000, this.f76202Oooo00O);
            float f11 = f4 + f7;
            Paint paint2 = this.f76200Oooo0;
            OooO00o(canvas, paint2, f5, f3, f4, f11, this.f76198OooOooo, this.f76201Oooo000);
            OooO00o(canvas, paint2, f5, f3, f11, f11 + f10, this.f76201Oooo000, this.f76202Oooo00O);
            float f12 = this.f76192OooOoO.f105436OooO0o0;
            float f13 = f12 < 4.0f ? 4.0f : f12;
            int iCeil = (int) Math.ceil(f3 / f13);
            int i2 = this.f76192OooOoO.f105435OooO0o;
            int i3 = i2 < 1 ? 1 : i2;
            int i4 = i3 * 2;
            Math.min(f4 * 0.15f, getResources().getDisplayMetrics().density * 12.0f);
            this.f76212OoooO00.getTextSize();
            float fMin2 = Math.min(this.f76210OoooO, f4);
            float fMin3 = Math.min(this.f76214OoooOO0, f4);
            float fMin4 = Math.min(this.f76224o000oOoO, f4);
            int i5 = -iCeil;
            if (i5 <= iCeil) {
                while (true) {
                    float f14 = i5 * f13;
                    if (Math.abs(f14) > f3) {
                        f2 = f4;
                        f = f9;
                        i = i5;
                        canvas2 = canvas;
                    } else {
                        int iAbs = i4 == 0 ? 0 : Math.abs(i5) % i4;
                        float f15 = iAbs == 0 ? fMin2 : iAbs == i3 % i4 ? fMin3 : fMin4;
                        float f16 = f9 + f15;
                        Paint paint3 = this.f76196OooOoo0;
                        float f17 = f9;
                        i = i5;
                        canvas2 = canvas;
                        canvas2.drawLine(f14, f17, f14, f16, paint3);
                        f = f17;
                        f2 = f4;
                        canvas2.drawLine(f14, f2, f14, f4 - f15, paint3);
                    }
                    if (i == iCeil) {
                        break;
                    }
                    i5 = i + 1;
                    f4 = f2;
                    f9 = f;
                }
            } else {
                canvas2 = canvas;
            }
            canvas2.save();
            canvas2.rotate(((-this.f76192OooOoO.f105434OooO0Oo) * 180.0f) / 3.1415927f);
            Paint paint4 = this.f76205Oooo0OO;
            float f18 = this.f76213OoooO0O;
            canvas2.drawCircle(0.0f, 0.0f, f18, paint4);
            canvas2.drawCircle(0.0f, 0.0f, f18, this.f76207Oooo0o0);
            canvas2.save();
            for (int i6 = 0; i6 < 72; i6++) {
                float f19 = -f18;
                canvas2.drawLine(0.0f, f19, 0.0f, f19 + (i6 % 6 == 0 ? f18 * 0.15f : 0.08f * f18), i6 % 18 == 0 ? this.f76208Oooo0oO : this.f76206Oooo0o);
                canvas2.rotate(360.0f / 72);
            }
            canvas2.restore();
            double d = (this.f76192OooOoO.f105434OooO0Oo * 180.0f) / 3.1415927f;
            double d2 = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
            String strValueOf = String.valueOf(oO0O00O.OooO00o.OooO00o((((180.0d - (((d % d2) + d2) % d2)) % 180.0d) + 180.0d) % 180.0d) % 180);
            Paint paint5 = this.f76209Oooo0oo;
            Paint.FontMetrics fontMetrics = paint5.getFontMetrics();
            float f20 = (-(fontMetrics.ascent + fontMetrics.descent)) / 2.0f;
            canvas2.drawText(strValueOf, 0.0f, f20, paint5);
            canvas2.drawText("°", (paint5.measureText(strValueOf) / 2.0f) + this.f76216OoooOOo, f20 - (paint5.getTextSize() * 0.25f), this.f76199Oooo);
            canvas2.restore();
            canvas2.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0123  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent event) {
        boolean z;
        boolean z2;
        float f;
        ViewParent parent;
        int actionMasked;
        boolean z3;
        OooO0O0.EnumC20019OooO0O0 enumC20019OooO0O0;
        OooOOO0.OooO0oO(event, "event");
        boolean z4 = false;
        if (this.f76192OooOoO.f105431OooO00o && this.transformListener != null) {
            boolean z5 = event.getToolType(0) == 2 || event.getToolType(0) == 4;
            if (event.getActionMasked() == 0 && z5) {
                this.f76218OoooOoO = false;
                return false;
            }
            int actionMasked2 = event.getActionMasked();
            PointF pointF = this.f76221Ooooo0o;
            if (actionMasked2 != 0) {
                if (actionMasked2 == 1 || actionMasked2 == 3) {
                    z2 = true;
                }
                if (this.f76219OoooOoo) {
                    if (actionMasked2 == 2) {
                        int iFindPointerIndex = event.findPointerIndex(this.f76220Ooooo00);
                        if (iFindPointerIndex != -1) {
                            f = 2.0f;
                            float x = event.getX(iFindPointerIndex) - pointF.x;
                            float y = event.getY(iFindPointerIndex) - pointF.y;
                            if ((y * y) + (x * x) > this.f76223OooooOO || event.getPointerCount() > 1) {
                                this.f76219OoooOoo = false;
                                this.f76220Ooooo00 = -1;
                            }
                            if (!this.f76218OoooOoO) {
                            }
                            parent = getParent();
                            if (parent != null) {
                            }
                            OooO0O0 oooO0O0 = this.f76217OoooOo0;
                            oooO0O0.getClass();
                            OooO0O0.EnumC20019OooO0O0 enumC20019OooO0O02 = OooO0O0.EnumC20019OooO0O0.f105429OooOoO0;
                            actionMasked = event.getActionMasked();
                            PointF pointF2 = oooO0O0.f105422OooO0o;
                            if (actionMasked != 0) {
                            }
                            z3 = true;
                            if (z2) {
                            }
                            return z3;
                        }
                        this.f76219OoooOoo = false;
                        this.f76220Ooooo00 = -1;
                    } else if (actionMasked2 == 5 || actionMasked2 == 6) {
                        this.f76219OoooOoo = false;
                        this.f76220Ooooo00 = -1;
                    }
                    f = 2.0f;
                    if (!this.f76218OoooOoO) {
                    }
                    parent = getParent();
                    if (parent != null) {
                    }
                    OooO0O0 oooO0O02 = this.f76217OoooOo0;
                    oooO0O02.getClass();
                    OooO0O0.EnumC20019OooO0O0 enumC20019OooO0O022 = OooO0O0.EnumC20019OooO0O0.f105429OooOoO0;
                    actionMasked = event.getActionMasked();
                    PointF pointF22 = oooO0O02.f105422OooO0o;
                    if (actionMasked != 0) {
                    }
                    z3 = true;
                    if (z2) {
                    }
                    return z3;
                }
                f = 2.0f;
                if (!this.f76218OoooOoO || z2) {
                    parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    OooO0O0 oooO0O022 = this.f76217OoooOo0;
                    oooO0O022.getClass();
                    OooO0O0.EnumC20019OooO0O0 enumC20019OooO0O0222 = OooO0O0.EnumC20019OooO0O0.f105429OooOoO0;
                    actionMasked = event.getActionMasked();
                    PointF pointF222 = oooO0O022.f105422OooO0o;
                    if (actionMasked != 0) {
                        C28312OooO0oO c28312OooO0oO = oooO0O022.f105419OooO0O0;
                        if (actionMasked != 1) {
                            PointF pointF3 = oooO0O022.f105424OooO0oO;
                            if (actionMasked != 2) {
                                if (actionMasked == 3) {
                                    oooO0O022.f105420OooO0OO = OooO0O0.EnumC20019OooO0O0.f105427OooOo0o;
                                    oooO0O022.f105421OooO0Oo = -1;
                                    oooO0O022.f105423OooO0o0 = -1;
                                    oooO0O022.f105425OooO0oo = 0.0f;
                                    c28312OooO0oO.invoke();
                                } else if (actionMasked != 5) {
                                    if (actionMasked == 6) {
                                        int pointerId = event.getPointerId(event.getActionIndex());
                                        int i = oooO0O022.f105423OooO0o0;
                                        if (pointerId == i) {
                                            oooO0O022.f105423OooO0o0 = -1;
                                            int i2 = oooO0O022.f105421OooO0Oo;
                                            if (i2 != -1) {
                                                int iFindPointerIndex2 = event.findPointerIndex(i2);
                                                if (iFindPointerIndex2 != -1) {
                                                    pointF222.set(event.getX(iFindPointerIndex2), event.getY(iFindPointerIndex2));
                                                }
                                                enumC20019OooO0O0 = OooO0O0.EnumC20019OooO0O0.f105426OooOo;
                                            } else {
                                                enumC20019OooO0O0 = OooO0O0.EnumC20019OooO0O0.f105427OooOo0o;
                                            }
                                            oooO0O022.f105420OooO0OO = enumC20019OooO0O0;
                                        } else if (pointerId == oooO0O022.f105421OooO0Oo) {
                                            oooO0O022.f105421OooO0Oo = i;
                                            oooO0O022.f105423OooO0o0 = -1;
                                            if (i == -1) {
                                                oooO0O022.f105420OooO0OO = OooO0O0.EnumC20019OooO0O0.f105427OooOo0o;
                                                oooO0O022.f105421OooO0Oo = -1;
                                                oooO0O022.f105423OooO0o0 = -1;
                                                oooO0O022.f105425OooO0oo = 0.0f;
                                                c28312OooO0oO.invoke();
                                            } else {
                                                int iFindPointerIndex3 = event.findPointerIndex(i);
                                                if (iFindPointerIndex3 != -1) {
                                                    pointF222.set(event.getX(iFindPointerIndex3), event.getY(iFindPointerIndex3));
                                                }
                                                oooO0O022.f105420OooO0OO = OooO0O0.EnumC20019OooO0O0.f105426OooOo;
                                            }
                                        }
                                    }
                                    z4 = false;
                                    z3 = false;
                                } else {
                                    if (event.getPointerCount() >= 2) {
                                        int pointerId2 = event.getPointerId(event.getActionIndex());
                                        if (oooO0O022.f105423OooO0o0 == -1) {
                                            oooO0O022.f105423OooO0o0 = pointerId2;
                                        }
                                        int iFindPointerIndex4 = event.findPointerIndex(oooO0O022.f105421OooO0Oo);
                                        int iFindPointerIndex5 = event.findPointerIndex(oooO0O022.f105423OooO0o0);
                                        if (iFindPointerIndex4 != -1 && iFindPointerIndex5 != -1) {
                                            PointF pointF4 = new PointF(event.getX(iFindPointerIndex4), event.getY(iFindPointerIndex4));
                                            PointF pointF5 = new PointF(event.getX(iFindPointerIndex5), event.getY(iFindPointerIndex5));
                                            pointF3.set(new PointF((pointF4.x + pointF5.x) / f, (pointF4.y + pointF5.y) / f));
                                            PointF pointF6 = new PointF(pointF5.x - pointF4.x, pointF5.y - pointF4.y);
                                            oooO0O022.f105425OooO0oo = (float) Math.atan2(pointF6.y, pointF6.x);
                                        }
                                        oooO0O022.f105420OooO0OO = enumC20019OooO0O0222;
                                    }
                                    z4 = false;
                                    z3 = false;
                                }
                                z4 = false;
                            } else {
                                int iOrdinal = oooO0O022.f105420OooO0OO.ordinal();
                                if (iOrdinal != 0) {
                                    OooO0OO oooO0OO = oooO0O022.f105418OooO00o;
                                    if (iOrdinal == 1) {
                                        int iFindPointerIndex6 = event.findPointerIndex(oooO0O022.f105421OooO0Oo);
                                        if (iFindPointerIndex6 != -1) {
                                            float x2 = event.getX(iFindPointerIndex6);
                                            float y2 = event.getY(iFindPointerIndex6);
                                            float f2 = x2 - pointF222.x;
                                            float f3 = y2 - pointF222.y;
                                            if (f2 != 0.0f || f3 != 0.0f) {
                                                oooO0OO.invoke(new OooO0o(f2, f3, 12));
                                                pointF222.set(x2, y2);
                                                z4 = false;
                                            }
                                        }
                                    } else {
                                        if (iOrdinal != 2) {
                                            throw new C32442OooOO0o();
                                        }
                                        int iFindPointerIndex7 = event.findPointerIndex(oooO0O022.f105421OooO0Oo);
                                        int iFindPointerIndex8 = event.findPointerIndex(oooO0O022.f105423OooO0o0);
                                        if (iFindPointerIndex7 != -1 && iFindPointerIndex8 != -1) {
                                            PointF pointF7 = new PointF(event.getX(iFindPointerIndex7), event.getY(iFindPointerIndex7));
                                            PointF pointF8 = new PointF(event.getX(iFindPointerIndex8), event.getY(iFindPointerIndex8));
                                            PointF pointF9 = new PointF((pointF7.x + pointF8.x) / f, (pointF7.y + pointF8.y) / f);
                                            float f4 = pointF9.x - pointF3.x;
                                            float f5 = pointF9.y - pointF3.y;
                                            PointF pointF10 = new PointF(pointF8.x - pointF7.x, pointF8.y - pointF7.y);
                                            float fAtan2 = (float) Math.atan2(pointF10.y, pointF10.x);
                                            float f6 = fAtan2 - oooO0O022.f105425OooO0oo;
                                            if (f4 != 0.0f || f5 != 0.0f || f6 != 0.0f) {
                                                oooO0OO.invoke(new OooO0o(f4, f5, f6, new PointF(pointF9.x, pointF9.y)));
                                            }
                                            pointF3.set(pointF9);
                                            oooO0O022.f105425OooO0oo = fAtan2;
                                            z4 = false;
                                        }
                                    }
                                }
                                z4 = false;
                                z3 = false;
                            }
                        }
                        if (z2) {
                            this.f76218OoooOoO = z4;
                            boolean z6 = this.f76219OoooOoo && actionMasked2 == 1 && event.getPointerId(event.getActionIndex()) == this.f76220Ooooo00;
                            this.f76219OoooOoo = false;
                            this.f76220Ooooo00 = -1;
                            if (z6) {
                                performClick();
                                return true;
                            }
                        }
                        return z3;
                    }
                    oooO0O022.f105421OooO0Oo = event.getPointerId(0);
                    pointF222.set(event.getX(), event.getY());
                    oooO0O022.f105420OooO0OO = OooO0O0.EnumC20019OooO0O0.f105426OooOo;
                    z3 = true;
                    if (z2) {
                    }
                    return z3;
                }
            } else {
                float x3 = event.getX();
                float y3 = event.getY();
                boolean z7 = this.f76192OooOoO.f105431OooO00o;
                PointF pointF11 = this.f76222OooooO0;
                if (z7) {
                    OooO0O0(x3, y3, pointF11);
                    float f7 = this.f76192OooOoO.f105433OooO0OO / 2.0f;
                    float fMax = Math.max(0.0f, (this.f76204Oooo0O0 / 2.0f) - this.f76215OoooOOO);
                    if (Math.abs(pointF11.x) <= f7 && Math.abs(pointF11.y) <= fMax) {
                        z = true;
                    }
                    this.f76218OoooOoO = z;
                    if (z) {
                    }
                } else {
                    z = false;
                    this.f76218OoooOoO = z;
                    if (z) {
                        if (this.angleDialClickListener != null) {
                            OooO0O0(event.getX(), event.getY(), pointF11);
                            float f8 = pointF11.x;
                            float f9 = pointF11.y;
                            float f10 = (f9 * f9) + (f8 * f8);
                            float f11 = this.f76213OoooO0O;
                            boolean z8 = f10 <= f11 * f11;
                            this.f76219OoooOoo = z8;
                            if (z8) {
                                this.f76220Ooooo00 = event.getPointerId(0);
                                pointF.set(event.getX(), event.getY());
                            }
                        }
                    }
                }
            }
            z2 = false;
            if (this.f76219OoooOoo) {
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        OooO00o<C32460OooOooO> oooO00o = this.angleDialClickListener;
        if (oooO00o == null) {
            return true;
        }
        oooO00o.invoke();
        return true;
    }

    public final void setAngleDialClickListener(OooO00o<C32460OooOooO> oooO00o) {
        this.angleDialClickListener = oooO00o;
    }

    public final void setGestureEndListener(OooO00o<C32460OooOooO> oooO00o) {
        this.gestureEndListener = oooO00o;
    }

    public final void setTransformListener(InterfaceC32507OooOO0o<? super OooO0o, C32460OooOooO> interfaceC32507OooOO0o) {
        this.transformListener = interfaceC32507OooOO0o;
    }
}
