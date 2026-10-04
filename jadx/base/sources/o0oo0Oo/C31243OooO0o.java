package o0oo0Oo;

import OooOoOO.C20519OooO0Oo;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Bundle;
import android.util.Log;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.RPointF;
import com.orion.penkit.models.ShapeInfo;
import java.util.List;
import o000oooo.C24761OooO;
import o0O0oOo.AbstractC26133OooOO0o;
import o0O0oo00.OooO00o;
import o0OO0o00.C26885OooOoo;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32447OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0oo0Oo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31243OooO0o<T> extends AbstractC31239OooO00o<T> {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f111450OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final Bundle f111451OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final float f111452OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final int f111453OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final o0O0oo00.OooO00o<T> f111456OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f111457OooOo0O;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final float f111462OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f111463OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ShapeInfo f111464OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f111465OooOooo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public float f111455OooOo0 = 1.0f;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public RPointF f111458OooOo0o = new RPointF(0.0f, 0.0f, 0.0f, 7, null);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final PointF f111454OooOo = new PointF();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final RPointF f111460OooOoO0 = new RPointF(0.0f, 0.0f, 0.0f, 7, null);

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public RPointF f111459OooOoO = new RPointF(0.0f, 0.0f, 0.0f, 7, null);

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public RPointF f111461OooOoOO = new RPointF(0.0f, 0.0f, 0.0f, 7, null);

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C32447OooOOo f111466Oooo000 = C20519OooO0Oo.OooO0OO(new C26885OooOoo(this, 1));

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C32447OooOOo f111467Oooo00O = C20519OooO0Oo.OooO0OO(new o000O0oO.OooO0o(this, 5));

    public C31243OooO0o(int i, int i2, float f, Bundle bundle, o0O0oo00.OooO00o oooO00o) {
        this.f111450OooOOOo = i;
        this.f111452OooOOo0 = f;
        this.f111451OooOOo = bundle;
        this.f111453OooOOoo = i2;
        this.f111456OooOo00 = oooO00o;
        this.f111462OooOoo = 3.0f;
        OooO00o.C19734OooO00o.OooO00o(oooO00o, i, this.f111452OooOOo0, 1, 0, false, 24);
        float f2 = this.f111452OooOOo0;
        this.f111452OooOOo0 = f2;
        this.f111462OooOoo = f2 / 2;
    }

    public static void OooOOOO(o0O0oo00.OooO00o oooO00o, List list, List list2) {
        oooO00o.moveTo(((RPointF) list.get(0)).getX(), ((RPointF) list.get(0)).getY());
        oooO00o.lineTo(((RPointF) list.get(1)).getX(), ((RPointF) list.get(1)).getY());
        oooO00o.OooO0O0(((RPointF) list2.get(0)).getX(), ((RPointF) list2.get(0)).getY(), ((RPointF) list.get(2)).getX(), ((RPointF) list.get(2)).getY());
        oooO00o.lineTo(((RPointF) list.get(3)).getX(), ((RPointF) list.get(3)).getY());
        oooO00o.OooO0O0(((RPointF) list2.get(1)).getX(), ((RPointF) list2.get(1)).getY(), ((RPointF) list.get(0)).getX(), ((RPointF) list.get(0)).getY());
    }

    public static List OooOOOo(RPointF rPointF, float f, float f2, double d) {
        return C34429OooOOo0.OooOO0o(new RPointF((float) ((((double) (rPointF.getR() * f2)) / d) + ((double) rPointF.getX())), (float) (((double) rPointF.getY()) - (((double) (rPointF.getR() * f)) / d)), 0.0f, 4, null), new RPointF((float) (((double) rPointF.getX()) - (((double) (rPointF.getR() * f2)) / d)), (float) ((((double) (rPointF.getR() * f)) / d) + ((double) rPointF.getY())), 0.0f, 4, null));
    }

    public static double OooOOo0(Bundle bundle, String str) {
        if (bundle != null) {
            Object obj = bundle.get(str);
            if (obj instanceof Number) {
                return ((Number) obj).doubleValue();
            }
            if (obj != null) {
                Log.w("FountainPen", "key: " + str + ", value: " + obj + " is not a number, use defaultValue: 1.0");
            }
        }
        return 1.0d;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> displayItems) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItems, "displayItems");
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        InterfaceC31284OooO0O0 item = super.OooO(f, f2, f3, i, c34434OooOoO).getItem();
        this.f111463OooOoo0 = f3;
        float f4 = this.f111462OooOoo * this.f111455OooOo0 * f3;
        RPointF rPointF = this.f111460OooOoO0;
        rPointF.setValue(f, f2, f4);
        RPointF rPointFCopy$default = RPointF.copy$default(this.f111461OooOoOO, 0.0f, 0.0f, 0.0f, 7, null);
        this.f111459OooOoO = rPointFCopy$default;
        PointF pointF = this.f111454OooOo;
        ShapeInfo shapeInfo = null;
        o0O0oo00.OooO00o<T> oooO00o = this.f111456OooOo00;
        if (i == 0) {
            OooO00o.C19734OooO00o.OooO00o(oooO00o, this.f111450OooOOOo, 1.0f, 1, 0, false, 24);
            oooO00o.reset();
            oooO00o.OooOOOo(rPointF.getX(), rPointF.getY(), rPointF.getR());
            this.f111458OooOo0o = RPointF.copy$default(this.f111460OooOoO0, 0.0f, 0.0f, 0.0f, 7, null);
            this.f111461OooOoOO = RPointF.copy$default(this.f111460OooOoO0, 0.0f, 0.0f, 0.0f, 7, null);
            pointF.set(f, f2);
            this.f111457OooOo0O = true;
            this.f111464OooOooO = null;
            return new DrawResult(1, item, c34434OooOoO, c34434OooOoO, c34434OooOoO, false, false, new Point(0, 0), null, false, null, 1792, null);
        }
        if (i == 1) {
            this.f111457OooOo0O = false;
            if (this.f111422OooOO0) {
                ShapeInfo shapeInfo2 = this.f111464OooOooO;
                if (shapeInfo2 != null) {
                    return new DrawResult(3, shapeInfo2, com.facebook.soloader.OooOo.OooO0oO(shapeInfo2), null, null, false, false, null, null, false, null, 2040, null);
                }
            } else {
                RPointF.Companion companion = RPointF.INSTANCE;
                double distance = companion.getDistance(rPointFCopy$default, rPointF);
                if (distance > Math.abs(this.f111459OooOoO.getR() - rPointF.getR())) {
                    OooOOOO(oooO00o, companion.getTangencyPoints(this.f111459OooOoO, rPointF), OooOOOo(this.f111458OooOo0o, rPointF.getX() - this.f111459OooOoO.getX(), rPointF.getY() - this.f111459OooOoO.getY(), distance));
                    oooO00o.OooOOOo(rPointF.getX(), rPointF.getY(), rPointF.getR());
                }
            }
            return new DrawResult(3, item, com.facebook.soloader.OooOo.OooO0oO(item), c34434OooOoO, c34434OooOoO, false, false, new Point(0, 0), null, false, null, 1792, null);
        }
        if (i != 2) {
            return new DrawResult(1, item, c34434OooOoO, c34434OooOoO, c34434OooOoO, false, false, new Point(0, 0), null, false, null, 1792, null);
        }
        RPointF.Companion companion2 = RPointF.INSTANCE;
        RPointF midPoint = companion2.getMidPoint(this.f111458OooOo0o, rPointF);
        this.f111461OooOoOO = midPoint;
        double distance2 = companion2.getDistance(this.f111459OooOoO, midPoint);
        if (distance2 <= Math.abs(this.f111459OooOoO.getR() - this.f111461OooOoOO.getR())) {
            return new DrawResult(1, item, c34434OooOoO, c34434OooOoO, c34434OooOoO, false, false, new Point(0, 0), null, false, null, 1792, null);
        }
        OooOOOO(oooO00o, companion2.getTangencyPoints(this.f111459OooOoO, this.f111461OooOoOO), OooOOOo(this.f111458OooOo0o, this.f111461OooOoOO.getX() - this.f111459OooOoO.getX(), this.f111461OooOoOO.getY() - this.f111459OooOoO.getY(), distance2));
        oooO00o.OooOOOo(this.f111461OooOoOO.getX(), this.f111461OooOoOO.getY(), this.f111461OooOoOO.getR());
        this.f111458OooOo0o = RPointF.copy$default(this.f111460OooOoO0, 0.0f, 0.0f, 0.0f, 7, null);
        this.f111459OooOoO = RPointF.copy$default(this.f111461OooOoOO, 0.0f, 0.0f, 0.0f, 7, null);
        if (this.f111422OooOO0) {
            ShapeInfo shapeInfo3 = this.f111464OooOooO;
            if (shapeInfo3 == null) {
                oooO00o.reset();
                AbstractC26133OooOO0o abstractC26133OooOO0oOooO00o = this.f111413OooO.OooO00o();
                if (abstractC26133OooOO0oOooO00o != null) {
                    oooO00o.reset();
                    OooO00o.C19734OooO00o.OooO00o(this.f111456OooOo00, this.f111450OooOOOo, (this.f111452OooOOo0 / 2.0f) * this.f111455OooOo0, 0, 0, false, 24);
                    abstractC26133OooOO0oOooO00o.OooOO0O(oooO00o);
                    shapeInfo = new ShapeInfo(C24761OooO.OooO00o("toString(...)"), this.f111450OooOOOo, this.f111452OooOOo0 / 2.0f, abstractC26133OooOO0oOooO00o.OooO0Oo(), abstractC26133OooOO0oOooO00o.OooO0o(), -1, null, 0L, this.f111453OooOOoo == 0 ? 0 : 2, false, this.f111453OooOOoo, false, 2752, null);
                }
                if (shapeInfo != null) {
                    this.f111464OooOooO = shapeInfo;
                    this.f111465OooOooo = shapeInfo.getMinDistancePointIndex(new PointF(f, f2));
                }
            } else {
                oooO00o.reset();
                ShapeInfo shapeInfo4 = this.f111464OooOooO;
                if (shapeInfo4 != null) {
                    shapeInfo4.updateAnchorPoint(this.f111465OooOooo, new PointF(f, f2));
                }
                shapeInfo3.setupRenderEngine(oooO00o);
            }
            ShapeInfo shapeInfo5 = this.f111464OooOooO;
            if (shapeInfo5 != null) {
                return new DrawResult(1, shapeInfo5, null, null, null, false, false, null, null, false, null, 2044, null);
            }
        }
        return new DrawResult(1, item, null, null, null, false, false, null, null, false, null, 2044, null);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0O0(float f, float f2) {
        double dPow = Math.pow(f, ((Number) this.f111466Oooo000.getValue()).doubleValue());
        C32447OooOOo c32447OooOOo = this.f111467Oooo00O;
        return (float) (((1.0d - ((Number) c32447OooOOo.getValue()).doubleValue()) * dPow) + (((Number) c32447OooOOo.getValue()).doubleValue() * ((double) (1 / ((f2 / 2.0f) + 1.0f))) * dPow));
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0Oo() {
        return this.f111450OooOOOo;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0o() {
        return this.f111455OooOo0;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final Bundle OooO0o0() {
        return this.f111451OooOOo;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0oO() {
        return 0;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0oo() {
        return this.f111452OooOOo0;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0(o0O0oo00.OooO0O0<T> target, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
        if (!z || this.f111457OooOo0O) {
            o0O0oo00.OooO00o<T> oooO00o = this.f111456OooOo00;
            oooO00o.OooOo00(target);
            if (!this.f111415OooO0O0 || this.f111422OooOO0) {
                oooO00o.OooOOOO(this.f111455OooOo0);
                return;
            }
            oooO00o.OooO0Oo();
            float f = this.f111416OooO0OO;
            float f2 = this.f111417OooO0Oo;
            float f3 = this.f111463OooOoo0;
            RPointF rPointF = new RPointF(0.0f, 0.0f, 0.0f, 7, null);
            rPointF.setValue(f, f2, this.f111462OooOoo * this.f111455OooOo0 * f3);
            RPointF rPointFCopy$default = RPointF.copy$default(this.f111461OooOoOO, 0.0f, 0.0f, 0.0f, 7, null);
            RPointF.Companion companion = RPointF.INSTANCE;
            OooOOOO(oooO00o, companion.getTangencyPoints(rPointFCopy$default, rPointF), OooOOOo(this.f111458OooOo0o, rPointF.getX() - rPointFCopy$default.getX(), rPointF.getY() - rPointFCopy$default.getY(), companion.getDistance(rPointFCopy$default, rPointF)));
            oooO00o.OooOOOo(rPointF.getX(), rPointF.getY(), rPointF.getR());
            oooO00o.OooOOOO(this.f111455OooOo0);
            oooO00o.OooO0o0();
        }
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0O() {
        this.f111456OooOo00.reset();
        this.f111457OooOo0O = false;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0o(float f) {
        this.f111455OooOo0 = f;
    }
}
