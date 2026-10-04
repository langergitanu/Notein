package o0oo0Oo;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import androidx.core.view.PointerIconCompat;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.PressurePoint;
import com.orion.penkit.models.ShapeInfo;
import java.util.List;
import o000oooo.C24761OooO;
import o00O0oo0.C24969OooOO0;
import o00o0o0o.C25446OooO0Oo;
import o0O0oOOO.C26121OooO0o0;
import o0O0oOo.AbstractC26133OooOO0o;
import o0O0oo00.OooO00o;
import o0Oo0ooO.C28460OooooO0;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32460OooOooO;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0oo0Oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31246OooO0oo<T> extends AbstractC31239OooO00o<T> {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final boolean f111473OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final o0O0oo00.OooO00o<T> f111474OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final int f111475OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f111476OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f111477OooOo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f111479OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final float f111480OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f111481OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ShapeInfo f111482OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f111484OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public RectF f111485OooOoo0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final PointF f111478OooOo0 = new PointF();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f111483OooOoO0 = 1.0f;

    public C31246OooO0oo(int i, float f, boolean z, int i2, o0O0oo00.OooO00o<T> oooO00o) {
        this.f111473OooOOOo = z;
        this.f111475OooOOo0 = i2;
        this.f111474OooOOo = oooO00o;
        this.f111480OooOo0O = f;
        this.f111481OooOo0o = i;
        this.f111481OooOo0o = C24969OooOO0.OooO0OO(i);
        OooO00o.C19734OooO00o.OooO00o(oooO00o, i, f, 0, 13, false, 16);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> displayItems) {
        DrawResult drawResult;
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItems, "displayItems");
        DrawResult drawResultOooO = super.OooO(f, f2, f3, i, C34434OooOoO.f123453OooOo0o);
        PointF pointF = this.f111478OooOo0;
        ShapeInfo shapeInfo = null;
        o0O0oo00.OooO00o<T> oooO00o = this.f111474OooOOo;
        if (i == 0) {
            oooO00o.reset();
            OooO00o.C19734OooO00o.OooO00o(this.f111474OooOOo, this.f111481OooOo0o, this.f111480OooOo0O * this.f111483OooOoO0, 0, 13, false, 16);
            oooO00o.moveTo(f, f2);
            this.f111476OooOOoo = f;
            this.f111479OooOo00 = f2;
            pointF.set(f, f2);
            this.f111477OooOo = true;
            this.f111482OooOoO = null;
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        boolean z = this.f111473OooOOOo;
        if (i == 1) {
            this.f111477OooOo = false;
            if (!z) {
                if (this.f111422OooOO0) {
                    ShapeInfo shapeInfo2 = this.f111482OooOoO;
                    if (shapeInfo2 != null) {
                        return new DrawResult(3, shapeInfo2, com.facebook.soloader.OooOo.OooO0oO(shapeInfo2), null, null, false, false, null, null, false, null, 2040, null);
                    }
                } else {
                    oooO00o.lineTo(f, f2);
                }
                return new DrawResult(3, drawResultOooO.getItem(), com.facebook.soloader.OooOo.OooO0oO(drawResultOooO.getItem()), null, null, false, false, null, null, false, null, 2040, null);
            }
            pointF.set(f, f2);
            PointF pointFOooO0OO = AbstractC31239OooO00o.OooO0OO(this.f111476OooOOoo, this.f111479OooOo00, f, f2);
            InterfaceC31284OooO0O0 item = drawResultOooO.getItem();
            kotlin.jvm.internal.OooOOO0.OooO0o0(item, "null cannot be cast to non-null type com.orion.penkit.models.DrawRecord");
            DrawRecord drawRecord = (DrawRecord) item;
            drawRecord.getPoints().clear();
            drawRecord.getPoints().addAll(C34429OooOOo0.OooOO0o(new PressurePoint(this.f111476OooOOoo, this.f111479OooOo00, 1.0f, 0), new PressurePoint(pointFOooO0OO.x, pointFOooO0OO.y, 1.0f, 1)));
            return new DrawResult(3, drawRecord, com.facebook.soloader.OooOo.OooO0oO(drawRecord), null, null, false, false, null, null, false, null, 2040, null);
        }
        if (i != 2) {
            return new DrawResult(0, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        if (z) {
            if (Math.abs(pointF.x - f) > this.f111483OooOoO0 || Math.abs(pointF.y - f2) > this.f111483OooOoO0) {
                pointF.set(f, f2);
            }
            if (this.f111485OooOoo0 != null) {
                int color = Color.parseColor("#80000000");
                RectF rectF = this.f111485OooOoo0;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(rectF);
                drawResult = new DrawResult(1, new ShapeInfo(null, color, 0.0f, o00OO0O0.OooO0O0.OooO0o(rectF), 3, -1, null, 0L, 0, false, 0, false, 4033, null), null, null, null, false, false, null, null, false, null, 2044, null);
            } else {
                drawResult = null;
            }
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, drawResult, PointerIconCompat.TYPE_GRAB, null);
        }
        float f4 = this.f111476OooOOoo;
        float f5 = this.f111479OooOo00;
        float f6 = 2;
        oooO00o.OooO0O0(f4, f5, (f4 + f) / f6, (f5 + f2) / f6);
        this.f111476OooOOoo = f;
        this.f111479OooOo00 = f2;
        if (this.f111422OooOO0) {
            ShapeInfo shapeInfo3 = this.f111482OooOoO;
            if (shapeInfo3 == null) {
                oooO00o.reset();
                AbstractC26133OooOO0o abstractC26133OooOO0oOooO00o = this.f111413OooO.OooO00o();
                if (abstractC26133OooOO0oOooO00o != null) {
                    oooO00o.reset();
                    abstractC26133OooOO0oOooO00o.OooOO0O(oooO00o);
                    shapeInfo = new ShapeInfo(C24761OooO.OooO00o("toString(...)"), this.f111481OooOo0o, this.f111480OooOo0O, abstractC26133OooOO0oOooO00o.OooO0Oo(), abstractC26133OooOO0oOooO00o.OooO0o(), 13, null, 0L, this.f111475OooOOo0 == 0 ? 0 : 2, false, this.f111475OooOOo0, false, 2752, null);
                }
                if (shapeInfo != null) {
                    this.f111482OooOoO = shapeInfo;
                    this.f111484OooOoOO = shapeInfo.getMinDistancePointIndex(new PointF(f, f2));
                }
            } else {
                oooO00o.reset();
                ShapeInfo shapeInfo4 = this.f111482OooOoO;
                if (shapeInfo4 != null) {
                    shapeInfo4.updateAnchorPoint(this.f111484OooOoOO, new PointF(f, f2));
                }
                shapeInfo3.setupRenderEngine(oooO00o);
            }
            ShapeInfo shapeInfo5 = this.f111482OooOoO;
            if (shapeInfo5 != null) {
                return new DrawResult(1, shapeInfo5, null, null, null, false, false, null, null, false, null, 2044, null);
            }
        }
        return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0Oo() {
        return this.f111481OooOo0o;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0o() {
        Log.d("ContentValues", "getScale " + this.f111483OooOoO0);
        return this.f111483OooOoO0;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0oO() {
        return 2;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0oo() {
        return this.f111480OooOo0O;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0(o0O0oo00.OooO0O0<T> target, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
        if (!z || this.f111477OooOo) {
            o0O0oo00.OooO00o<T> oooO00o = this.f111474OooOOo;
            oooO00o.OooOo00(target);
            boolean z2 = this.f111473OooOOOo;
            if (!z2) {
                oooO00o.OooO0Oo();
                if (this.f111415OooO0O0 && !this.f111422OooOO0 && !z2) {
                    oooO00o.lineTo(this.f111416OooO0OO, this.f111417OooO0Oo);
                }
                if (target.OooO0O0()) {
                    oooO00o.OooOoO0(-1);
                } else {
                    oooO00o.OooOoO0(13);
                    OooOOOO(oooO00o, z);
                    if ((target instanceof C26121OooO0o0) && ((C26121OooO0o0) target).f89178OooO0o0) {
                        oooO00o.OooOoO0(16);
                    }
                }
                oooO00o.OooOOOO(this.f111483OooOoO0);
                oooO00o.OooO0o0();
                return;
            }
            oooO00o.reset();
            OooO00o.C19734OooO00o.OooO00o(this.f111474OooOOo, this.f111481OooOo0o, this.f111480OooOo0O * this.f111483OooOoO0, 0, 13, false, 16);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            OooOOOO(oooO00o, z);
            oooO00o.moveTo(this.f111476OooOOoo, this.f111479OooOo00);
            float f = this.f111476OooOOoo;
            float f2 = this.f111479OooOo00;
            PointF pointF = this.f111478OooOo0;
            PointF pointFOooO0OO = AbstractC31239OooO00o.OooO0OO(f, f2, pointF.x, pointF.y);
            oooO00o.lineTo(pointFOooO0OO.x, pointFOooO0OO.y);
            oooO00o.OooOOOO(this.f111483OooOoO0);
            oooO00o.reset();
            if (z) {
                oooO00o.reset();
                OooO00o.C19734OooO00o.OooO00o(this.f111474OooOOo, Color.parseColor("#80000000"), 0.0f, 1, -1, false, 16);
                RectF rectF = new RectF(C28460OooooO0.OooO00o(18.0f) + pointFOooO0OO.x, pointFOooO0OO.y - C28460OooooO0.OooO00o(20.0f), C28460OooooO0.OooO00o(40.0f) + C28460OooooO0.OooO00o(18.0f) + pointFOooO0OO.x, pointFOooO0OO.y);
                this.f111485OooOoo0 = rectF;
                oooO00o.OooOoo0(C28460OooooO0.OooO00o(4.0f), C28460OooooO0.OooO00o(4.0f), rectF);
                oooO00o.OooOOOO(this.f111483OooOoO0);
                oooO00o.reset();
                oooO00o.OooOo0O(String.valueOf(oO0O00O.OooO00o.OooO0O0(C25446OooO0Oo.OooO0Oo(pointFOooO0OO, new PointF(this.f111476OooOOoo, this.f111479OooOo00)) / this.f111483OooOoO0)), rectF.centerX(), rectF.centerY(), C28460OooooO0.OooO00o(11.0f));
                oooO00o.reset();
            }
        }
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0O() {
        this.f111474OooOOo.reset();
        this.f111477OooOo = false;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0o(float f) {
        this.f111483OooOoO0 = f;
    }

    public final void OooOOOO(o0O0oo00.OooO00o<T> oooO00o, boolean z) {
        if (Build.VERSION.SDK_INT <= 27) {
            if (z) {
                oooO00o.OooOoO0(-1);
                oooO00o.OooOO0O(Color.argb((int) (Color.alpha(this.f111481OooOo0o) * 0.5f), Color.red(this.f111481OooOo0o), Color.green(this.f111481OooOo0o), Color.blue(this.f111481OooOo0o)));
            } else {
                oooO00o.OooOoO0(13);
                oooO00o.OooOO0O(this.f111481OooOo0o);
            }
        }
    }
}
