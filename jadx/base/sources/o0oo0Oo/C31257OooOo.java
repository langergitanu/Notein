package o0oo0Oo;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
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
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0oo0Oo.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31257OooOo<T> extends AbstractC31239OooO00o<T> {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final boolean f111568OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final o0O0oo00.OooO00o<T> f111569OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final int f111570OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f111571OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f111572OooOo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f111574OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final float f111575OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f111576OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ShapeInfo f111577OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f111579OooOoOO;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final PointF f111573OooOo0 = new PointF();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f111578OooOoO0 = 1.0f;

    public C31257OooOo(int i, float f, boolean z, int i2, o0O0oo00.OooO00o<T> oooO00o) {
        this.f111568OooOOOo = z;
        this.f111570OooOOo0 = i2;
        this.f111569OooOOo = oooO00o;
        this.f111575OooOo0O = f;
        this.f111576OooOo0o = i;
        this.f111576OooOo0o = C24969OooOO0.OooO0OO(i);
        OooO00o.C19734OooO00o.OooO00o(oooO00o, i, f, 0, 13, false, 16);
        oooO00o.OooOO0(OooOOOo());
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> displayItems) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItems, "displayItems");
        DrawResult drawResultOooO = super.OooO(f, f2, f3, i, C34434OooOoO.f123453OooOo0o);
        PointF pointF = this.f111573OooOo0;
        ShapeInfo shapeInfo = null;
        o0O0oo00.OooO00o<T> oooO00o = this.f111569OooOOo;
        if (i == 0) {
            oooO00o.reset();
            OooO00o.C19734OooO00o.OooO00o(this.f111569OooOOo, this.f111576OooOo0o, this.f111575OooOo0O * this.f111578OooOoO0, 0, 13, false, 16);
            oooO00o.OooOO0(OooOOOo());
            oooO00o.moveTo(f, f2);
            this.f111571OooOOoo = f;
            this.f111574OooOo00 = f2;
            pointF.set(f, f2);
            this.f111572OooOo = true;
            this.f111577OooOoO = null;
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        boolean z = this.f111568OooOOOo;
        if (i == 1) {
            this.f111572OooOo = false;
            if (!z) {
                if (this.f111422OooOO0) {
                    ShapeInfo shapeInfo2 = this.f111577OooOoO;
                    if (shapeInfo2 != null) {
                        return new DrawResult(3, shapeInfo2, com.facebook.soloader.OooOo.OooO0oO(shapeInfo2), null, null, false, false, null, null, false, null, 2040, null);
                    }
                } else {
                    oooO00o.lineTo(f, f2);
                }
                return new DrawResult(3, drawResultOooO.getItem(), com.facebook.soloader.OooOo.OooO0oO(drawResultOooO.getItem()), null, null, false, false, null, null, false, null, 2040, null);
            }
            pointF.set(f, f2);
            PointF pointFOooO0OO = AbstractC31239OooO00o.OooO0OO(this.f111571OooOOoo, this.f111574OooOo00, f, f2);
            InterfaceC31284OooO0O0 item = drawResultOooO.getItem();
            kotlin.jvm.internal.OooOOO0.OooO0o0(item, "null cannot be cast to non-null type com.orion.penkit.models.DrawRecord");
            DrawRecord drawRecord = (DrawRecord) item;
            drawRecord.getPoints().clear();
            drawRecord.getPoints().addAll(C34429OooOOo0.OooOO0o(new PressurePoint(this.f111571OooOOoo, this.f111574OooOo00, 1.0f, 0), new PressurePoint(pointFOooO0OO.x, pointFOooO0OO.y, 1.0f, 1)));
            return new DrawResult(3, drawRecord, com.facebook.soloader.OooOo.OooO0oO(drawRecord), null, null, false, false, null, null, false, null, 2040, null);
        }
        if (i != 2) {
            return new DrawResult(0, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        if (z) {
            if (Math.abs(pointF.x - f) > this.f111578OooOoO0 || Math.abs(pointF.y - f2) > this.f111578OooOoO0) {
                pointF.set(f, f2);
            }
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        oooO00o.lineTo(f, f2);
        this.f111571OooOOoo = f;
        this.f111574OooOo00 = f2;
        if (this.f111422OooOO0) {
            ShapeInfo shapeInfo3 = this.f111577OooOoO;
            if (shapeInfo3 == null) {
                oooO00o.reset();
                AbstractC26133OooOO0o abstractC26133OooOO0oOooO00o = this.f111413OooO.OooO00o();
                if (abstractC26133OooOO0oOooO00o != null) {
                    oooO00o.reset();
                    abstractC26133OooOO0oOooO00o.OooOO0O(oooO00o);
                    shapeInfo = new ShapeInfo(C24761OooO.OooO00o("toString(...)"), this.f111576OooOo0o, this.f111575OooOo0O, abstractC26133OooOO0oOooO00o.OooO0Oo(), abstractC26133OooOO0oOooO00o.OooO0o(), 13, null, 0L, this.f111570OooOOo0 == 0 ? 0 : 2, false, this.f111570OooOOo0, false, 2752, null);
                }
                if (shapeInfo != null) {
                    this.f111577OooOoO = shapeInfo;
                    this.f111579OooOoOO = shapeInfo.getMinDistancePointIndex(new PointF(f, f2));
                }
            } else {
                oooO00o.reset();
                ShapeInfo shapeInfo4 = this.f111577OooOoO;
                if (shapeInfo4 != null) {
                    shapeInfo4.updateAnchorPoint(this.f111579OooOoOO, new PointF(f, f2));
                }
                shapeInfo3.setupRenderEngine(oooO00o);
            }
            ShapeInfo shapeInfo5 = this.f111577OooOoO;
            if (shapeInfo5 != null) {
                return new DrawResult(1, shapeInfo5, null, null, null, false, false, null, null, false, null, 2044, null);
            }
        }
        return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0Oo() {
        return this.f111576OooOo0o;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0o() {
        Log.d("ContentValues", "getScale " + this.f111578OooOoO0);
        return this.f111578OooOoO0;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0oO() {
        return 9;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0oo() {
        return this.f111575OooOo0O;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0(o0O0oo00.OooO0O0<T> target, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
        if (!z || this.f111572OooOo) {
            o0O0oo00.OooO00o<T> oooO00o = this.f111569OooOOo;
            oooO00o.OooOo00(target);
            boolean z2 = this.f111568OooOOOo;
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
                oooO00o.OooOOOO(this.f111578OooOoO0);
                oooO00o.OooO0o0();
                return;
            }
            oooO00o.reset();
            OooO00o.C19734OooO00o.OooO00o(this.f111569OooOOo, this.f111576OooOo0o, this.f111575OooOo0O * this.f111578OooOoO0, 0, 13, false, 16);
            OooOOOO(oooO00o, z);
            oooO00o.OooOO0(OooOOOo());
            oooO00o.moveTo(this.f111571OooOOoo, this.f111574OooOo00);
            float f = this.f111571OooOOoo;
            float f2 = this.f111574OooOo00;
            PointF pointF = this.f111573OooOo0;
            PointF pointFOooO0OO = AbstractC31239OooO00o.OooO0OO(f, f2, pointF.x, pointF.y);
            oooO00o.lineTo(pointFOooO0OO.x, pointFOooO0OO.y);
            oooO00o.OooOOOO(this.f111578OooOoO0);
            oooO00o.reset();
            if (z) {
                oooO00o.reset();
                OooO00o.C19734OooO00o.OooO00o(this.f111569OooOOo, Color.parseColor("#80000000"), 0.0f, 1, -1, false, 16);
                RectF rectF = new RectF(C28460OooooO0.OooO00o(18.0f) + pointFOooO0OO.x, pointFOooO0OO.y - C28460OooooO0.OooO00o(20.0f), C28460OooooO0.OooO00o(40.0f) + C28460OooooO0.OooO00o(18.0f) + pointFOooO0OO.x, pointFOooO0OO.y);
                oooO00o.OooOoo0(C28460OooooO0.OooO00o(4.0f), C28460OooooO0.OooO00o(4.0f), rectF);
                oooO00o.OooOOOO(this.f111578OooOoO0);
                oooO00o.reset();
                oooO00o.OooOo0O(String.valueOf(oO0O00O.OooO00o.OooO0O0(C25446OooO0Oo.OooO0Oo(pointFOooO0OO, new PointF(this.f111571OooOOoo, this.f111574OooOo00)) / this.f111578OooOoO0)), rectF.centerX(), rectF.centerY(), C28460OooooO0.OooO00o(11.0f));
                oooO00o.reset();
            }
        }
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0O() {
        this.f111569OooOOo.reset();
        this.f111572OooOo = false;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0o(float f) {
        this.f111578OooOoO0 = f;
    }

    public final void OooOOOO(o0O0oo00.OooO00o<T> oooO00o, boolean z) {
        if (Build.VERSION.SDK_INT <= 27) {
            if (z) {
                oooO00o.OooOoO0(-1);
                oooO00o.OooOO0O(Color.argb((int) (Color.alpha(this.f111576OooOo0o) * 0.5f), Color.red(this.f111576OooOo0o), Color.green(this.f111576OooOo0o), Color.blue(this.f111576OooOo0o)));
            } else {
                oooO00o.OooOoO0(13);
                oooO00o.OooOO0O(this.f111576OooOo0o);
            }
        }
    }

    public final RectF OooOOOo() {
        float f = this.f111575OooOo0O;
        float f2 = this.f111578OooOoO0;
        float f3 = 0.33333334f * f * f2;
        float f4 = f * f2;
        return new RectF(f3 * (-0.5f), (-0.5f) * f4, f3 * 0.5f, f4 * 0.5f);
    }
}
