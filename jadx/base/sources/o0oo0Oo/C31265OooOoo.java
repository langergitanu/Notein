package o0oo0Oo;

import Oooo0.C20855OooooOO;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import androidx.appcompat.widget.C21532OooOOo;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.ShapeInfo;
import java.util.List;
import o000oooo.C24761OooO;
import o00o0o0o.C25446OooO0Oo;
import o0O0oOo.AbstractC26133OooOO0o;
import o0O0oOo.C26122OooO;
import o0O0oOo.C26123OooO00o;
import o0O0oOo.C26124OooO0O0;
import o0O0oOo.C26125OooO0OO;
import o0O0oOo.C26126OooO0Oo;
import o0O0oOo.C26127OooO0o;
import o0O0oOo.C26128OooO0o0;
import o0O0oOo.C26129OooO0oO;
import o0O0oOo.C26130OooO0oo;
import o0O0oOo.C26131OooOO0;
import o0O0oOo.C26132OooOO0O;
import o0O0oOo.C26134OooOOO;
import o0O0oOo.C26135OooOOO0;
import o0O0oOo.C26136OooOOOO;
import o0O0oOo.C26137OooOOOo;
import o0O0oOo.C26138OooOOo;
import o0O0oOo.C26140OooOOoo;
import o0O0oOo.C26143OooOo0o;
import o0O0oOo.C26144OooOoO;
import o0O0oOo.C26145OooOoO0;
import o0oo0o.InterfaceC31284OooO0O0;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0oo0Oo.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31265OooOoo<T> extends AbstractC31239OooO00o<T> {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final List<Integer> f111617OooOoOO = C34429OooOOo0.OooOO0o(24, 23, 1, 3, 9, 6, 8, 18, 10, 11, 13, 12, 14, 15, 16, 17);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f111618OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final float f111619OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final o0O0oo00.OooO00o<T> f111620OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final int f111621OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ShapeInfo f111622OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f111626OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f111627OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f111628OooOoO0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f111624OooOo00 = 1.0f;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final PointF f111623OooOo0 = new PointF();

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final PointF f111625OooOo0O = new PointF();

    public C31265OooOoo(int i, float f, int i2, int i3, o0O0oo00.OooO00o<T> oooO00o) {
        this.f111618OooOOOo = i3;
        this.f111620OooOOo0 = oooO00o;
        this.f111619OooOOo = f;
        this.f111621OooOOoo = i;
        this.f111627OooOoO = i2;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> displayItems) {
        int i2;
        AbstractC26133OooOO0o c26130OooO0oo;
        AbstractC26133OooOO0o abstractC26133OooOO0o;
        AbstractC26133OooOO0o c26143OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItems, "displayItems");
        DrawResult drawResultOooO = super.OooO(f, f2, f3, i, displayItems);
        PointF pointF = this.f111623OooOo0;
        PointF pointF2 = this.f111625OooOo0O;
        if (i == 0) {
            pointF.set(f, f2);
            pointF2.set(f, f2);
            this.f111626OooOo0o = true;
            this.f111622OooOo = null;
        } else if (i == 1) {
            pointF2.set(f, f2);
            this.f111626OooOo0o = false;
            ShapeInfo shapeInfo = this.f111622OooOo;
            if (shapeInfo != null) {
                return new DrawResult(3, shapeInfo, com.facebook.soloader.OooOo.OooO0oO(shapeInfo), null, null, false, false, null, null, false, null, 2040, null);
            }
        } else if (i == 2) {
            pointF2.set(f, f2);
            ShapeInfo shapeInfo2 = this.f111622OooOo;
            int i3 = this.f111627OooOoO;
            if (shapeInfo2 == null || i3 == 1 || i3 == 9) {
                if (f111617OooOoOO.contains(Integer.valueOf(i3)) && C25446OooO0Oo.OooO0Oo(pointF, pointF2) < 10.0f) {
                    pointF.offset(-10.0f, -10.0f);
                    pointF2.offset(10.0f, 10.0f);
                }
                String str = AbstractC26133OooOO0o.f89191OooO0O0;
                RectF rectF = new RectF(pointF.x, pointF.y, pointF2.x, pointF2.y);
                if (i3 != 0) {
                    if (i3 == 1) {
                        i2 = 2;
                        float fMin = Math.min(rectF.left, rectF.right);
                        float fMax = Math.max(rectF.left, rectF.right);
                        float fMin2 = Math.min(rectF.top, rectF.bottom);
                        float fMax2 = Math.max(rectF.top, rectF.bottom);
                        c26143OooOo0o = new C26143OooOo0o(C34429OooOOo0.OooOO0o(new PointF(fMin, fMax2), new PointF((fMin + fMax) / 2.0f, fMin2), new PointF(fMax, fMax2)));
                    } else if (i3 != 3) {
                        switch (i3) {
                            case 6:
                                i2 = 2;
                                float fMin3 = Math.min(rectF.left, rectF.right);
                                float fMax3 = Math.max(rectF.left, rectF.right);
                                float fMin4 = Math.min(rectF.top, rectF.bottom);
                                float fMax4 = Math.max(rectF.top, rectF.bottom);
                                float f4 = (fMin3 + fMax3) / 2.0f;
                                float f5 = (fMin4 + fMax4) / 2.0f;
                                c26143OooOo0o = new C26125OooO0OO(C34429OooOOo0.OooOO0o(new PointF(fMin3, f5), new PointF(f4, fMin4), new PointF(fMax3, f5), new PointF(f4, fMax4)));
                                break;
                            case 7:
                                i2 = 2;
                                c26130OooO0oo = new C26136OooOOOO(C34429OooOOo0.OooOO0o(new PointF(rectF.left, rectF.top), new PointF(rectF.right, rectF.bottom)), 0);
                                break;
                            case 8:
                                i2 = 2;
                                float fMin5 = Math.min(rectF.left, rectF.right);
                                float fMax5 = Math.max(rectF.left, rectF.right);
                                float fMin6 = Math.min(rectF.top, rectF.bottom);
                                float fMax6 = Math.max(rectF.top, rectF.bottom);
                                c26130OooO0oo = new C26132OooOO0O(C34429OooOOo0.OooOO0o(new PointF(fMin5, fMin6), new PointF(fMax5, fMin6), new PointF(fMax5, fMax6), new PointF(fMin5, fMax6)));
                                break;
                            case 9:
                                float f6 = 2;
                                i2 = 2;
                                float f7 = 4;
                                float f8 = 3;
                                c26130OooO0oo = new C26134OooOOO(C34429OooOOo0.OooOO0o(new PointF(rectF.left, (rectF.height() / f6) + rectF.top), new PointF((rectF.width() / f7) + rectF.left, rectF.top), new PointF(C20855OooooOO.OooO00o(rectF.width(), f8, f7, rectF.left), rectF.top), new PointF(rectF.right, (rectF.height() / f6) + rectF.top), new PointF(((rectF.width() * f8) / f7) + rectF.left, rectF.bottom), new PointF((rectF.width() / f7) + rectF.left, rectF.bottom)));
                                break;
                            case 10:
                                c26130OooO0oo = new C26135OooOOO0(C34429OooOOo0.OooOO0o(new PointF(rectF.left, rectF.top), new PointF(rectF.right, rectF.top), new PointF(rectF.right, rectF.bottom), new PointF(rectF.left, rectF.bottom)));
                                i2 = 2;
                                break;
                            case 11:
                                float fMin7 = Math.min(rectF.left, rectF.right);
                                float fMax7 = Math.max(rectF.left, rectF.right);
                                float fMin8 = Math.min(rectF.top, rectF.bottom);
                                float fMax8 = Math.max(rectF.top, rectF.bottom);
                                c26130OooO0oo = new C26127OooO0o(C34429OooOOo0.OooOO0o(new PointF(fMin7, fMin8), new PointF(fMax7, fMin8), new PointF(fMax7, fMax8), new PointF(fMin7, fMax8)));
                                i2 = 2;
                                break;
                            case 12:
                                float fMin9 = Math.min(rectF.left, rectF.right);
                                float fMax9 = Math.max(rectF.left, rectF.right);
                                float fMin10 = Math.min(rectF.top, rectF.bottom);
                                float fMax10 = Math.max(rectF.top, rectF.bottom);
                                c26130OooO0oo = new C26145OooOoO0(C34429OooOOo0.OooOO0o(new PointF(fMin9, fMin10), new PointF(fMax9, fMin10), new PointF(fMax9, fMax10), new PointF(fMin9, fMax10)));
                                i2 = 2;
                                break;
                            case 13:
                                float fMin11 = Math.min(rectF.left, rectF.right);
                                float fMax11 = Math.max(rectF.left, rectF.right);
                                float fMin12 = Math.min(rectF.top, rectF.bottom);
                                float fMax12 = Math.max(rectF.top, rectF.bottom);
                                c26130OooO0oo = new o0O0oOo.OooOo(C34429OooOOo0.OooOO0o(new PointF(fMin11, fMin12), new PointF(fMax11, fMin12), new PointF(fMax11, fMax12), new PointF(fMin11, fMax12)));
                                i2 = 2;
                                break;
                            case 14:
                                float fMin13 = Math.min(rectF.left, rectF.right);
                                float fMax13 = Math.max(rectF.left, rectF.right);
                                float fMin14 = Math.min(rectF.top, rectF.bottom);
                                float fMax14 = Math.max(rectF.top, rectF.bottom);
                                c26130OooO0oo = new C26122OooO(C34429OooOOo0.OooOO0o(new PointF(fMin13, fMin14), new PointF(fMax13, fMin14), new PointF(fMax13, fMax14), new PointF(fMin13, fMax14)));
                                i2 = 2;
                                break;
                            case 15:
                                float fMin15 = Math.min(rectF.left, rectF.right);
                                float fMax15 = Math.max(rectF.left, rectF.right);
                                float fMin16 = Math.min(rectF.top, rectF.bottom);
                                float fMax16 = Math.max(rectF.top, rectF.bottom);
                                c26130OooO0oo = new C26126OooO0Oo(C34429OooOOo0.OooOO0o(new PointF(fMin15, fMin16), new PointF(fMax15, fMin16), new PointF(fMax15, fMax16), new PointF(fMin15, fMax16)));
                                i2 = 2;
                                break;
                            case 16:
                                float fMin17 = Math.min(rectF.left, rectF.right);
                                float fMax17 = Math.max(rectF.left, rectF.right);
                                float fMin18 = Math.min(rectF.top, rectF.bottom);
                                float fMax18 = Math.max(rectF.top, rectF.bottom);
                                c26130OooO0oo = new o0O0oOo.OooOo00(C34429OooOOo0.OooOO0o(new PointF(fMin17, fMin18), new PointF(fMax17, fMin18), new PointF(fMax17, fMax18), new PointF(fMin17, fMax18)));
                                i2 = 2;
                                break;
                            case 17:
                                float fMin19 = Math.min(rectF.left, rectF.right);
                                float fMax19 = Math.max(rectF.left, rectF.right);
                                float fMin20 = Math.min(rectF.top, rectF.bottom);
                                float fMax20 = Math.max(rectF.top, rectF.bottom);
                                c26130OooO0oo = new C26140OooOOoo(C34429OooOOo0.OooOO0o(new PointF(fMin19, fMin20), new PointF(fMax19, fMin20), new PointF(fMax19, fMax20), new PointF(fMin19, fMax20)));
                                i2 = 2;
                                break;
                            case 18:
                                float fMin21 = Math.min(rectF.left, rectF.right);
                                float fMax21 = Math.max(rectF.left, rectF.right);
                                float fMin22 = Math.min(rectF.top, rectF.bottom);
                                float fMax22 = Math.max(rectF.top, rectF.bottom);
                                c26130OooO0oo = new C26137OooOOOo(C34429OooOOo0.OooOO0o(new PointF(fMin21, fMin22), new PointF(fMax21, fMin22), new PointF(fMax21, fMax22), new PointF(fMin21, fMax22)));
                                i2 = 2;
                                break;
                            case 19:
                                c26130OooO0oo = new C26131OooOO0(C34429OooOOo0.OooOO0o(new PointF(rectF.left, rectF.top), new PointF(rectF.right, rectF.bottom)));
                                i2 = 2;
                                break;
                            case 20:
                                c26130OooO0oo = new C26144OooOoO(C34429OooOOo0.OooOO0o(new PointF(rectF.left, rectF.top), new PointF(rectF.right, rectF.bottom)));
                                i2 = 2;
                                break;
                            case 21:
                                c26130OooO0oo = new C26124OooO0O0(C34429OooOOo0.OooOO0o(new PointF(rectF.left, rectF.top), new PointF(rectF.right, rectF.bottom)));
                                i2 = 2;
                                break;
                            case 22:
                                c26130OooO0oo = new C26123OooO00o(C34429OooOOo0.OooOO0o(new PointF(rectF.left, rectF.top), new PointF(rectF.right, rectF.bottom)));
                                i2 = 2;
                                break;
                            case 23:
                                float fMin23 = Math.min(rectF.left, rectF.right);
                                float fMax23 = Math.max(rectF.left, rectF.right);
                                float fMin24 = Math.min(rectF.top, rectF.bottom);
                                float fMax24 = Math.max(rectF.top, rectF.bottom);
                                c26130OooO0oo = new C26128OooO0o0(C34429OooOOo0.OooOO0o(new PointF(fMin23, fMin24), new PointF(fMax23, fMin24), new PointF(fMax23, fMax24), new PointF(fMin23, fMax24)));
                                i2 = 2;
                                break;
                            case 24:
                                c26130OooO0oo = new C26129OooO0oO(C34429OooOOo0.OooOO0o(new PointF(rectF.left, rectF.top), new PointF(rectF.right, rectF.bottom)));
                                i2 = 2;
                                break;
                            default:
                                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i3, "createGeometryByTypeAndBounds Unknown geometry type: "));
                        }
                    } else {
                        i2 = 2;
                        float fMin25 = Math.min(rectF.left, rectF.right);
                        float fMax25 = Math.max(rectF.left, rectF.right);
                        float fMin26 = Math.min(rectF.top, rectF.bottom);
                        float fMax26 = Math.max(rectF.top, rectF.bottom);
                        c26130OooO0oo = new C26138OooOOo(C34429OooOOo0.OooOO0o(new PointF(fMin25, fMin26), new PointF(fMax25, fMin26), new PointF(fMax25, fMax26), new PointF(fMin25, fMax26)));
                    }
                    c26130OooO0oo = c26143OooOo0o;
                } else {
                    i2 = 2;
                    Rect rect = new Rect();
                    rectF.roundOut(rect);
                    if (rect.width() == 0) {
                        rect.right = rect.left + 2;
                    }
                    if (rect.height() == 0) {
                        rect.bottom = rect.top + 2;
                    }
                    int iMin = Math.min(rect.left, rect.right);
                    int iMax = Math.max(rect.left, rect.right);
                    int iMin2 = Math.min(rect.top, rect.bottom);
                    float fMax27 = Math.max(rect.top, rect.bottom);
                    c26130OooO0oo = new C26130OooO0oo(C34429OooOOo0.OooOO0o(new PointF(iMin - 100, fMax27), new PointF((iMin + iMax) / 2, iMin2), new PointF(iMax + 100, fMax27)));
                }
                if (AbstractC26133OooOO0o.OooO00o.OooO00o(c26130OooO0oo.OooO0Oo())) {
                    abstractC26133OooOO0o = c26130OooO0oo;
                } else {
                    Log.e(AbstractC26133OooOO0o.f89191OooO0O0, "createGeometryByTypeAndBounds: Invalid geometry: " + c26130OooO0oo);
                    abstractC26133OooOO0o = null;
                }
                int i4 = this.f111618OooOOOo == 0 ? 0 : i2;
                if (abstractC26133OooOO0o != null) {
                    ShapeInfo shapeInfo3 = new ShapeInfo(C24761OooO.OooO00o("toString(...)"), this.f111621OooOOoo, this.f111619OooOOo, abstractC26133OooOO0o.OooO0Oo(), abstractC26133OooOO0o.OooO0o(), -1, null, 0L, i4, false, this.f111618OooOOOo, false, 2752, null);
                    this.f111622OooOo = shapeInfo3;
                    this.f111628OooOoO0 = shapeInfo3.getMinDistancePointIndex(new PointF(f, f2));
                    if (i3 == 24 || i3 == 19 || i3 == 20 || i3 == 7 || i3 == 21 || i3 == 22) {
                        this.f111628OooOoO0 = 1;
                    }
                }
            } else {
                shapeInfo2.updateAnchorPoint(this.f111628OooOoO0, new PointF(f, f2));
            }
            ShapeInfo shapeInfo4 = this.f111622OooOo;
            if (shapeInfo4 != null) {
                return new DrawResult(1, shapeInfo4, null, null, null, false, false, null, null, false, null, 2044, null);
            }
        }
        return new DrawResult(0, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0Oo() {
        return this.f111621OooOOoo;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0oO() {
        return 8;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0oo() {
        return this.f111619OooOOo;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0(o0O0oo00.OooO0O0<T> target, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
        if (!z || this.f111626OooOo0o) {
            o0O0oo00.OooO00o<T> oooO00o = this.f111620OooOOo0;
            oooO00o.OooOo00(target);
            ShapeInfo shapeInfo = this.f111622OooOo;
            if (shapeInfo != null) {
                shapeInfo.render(oooO00o, target, this.f111624OooOo00);
            }
        }
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0O() {
        this.f111620OooOOo0.reset();
        this.f111626OooOo0o = false;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0o(float f) {
        this.f111624OooOo00 = f;
    }
}
