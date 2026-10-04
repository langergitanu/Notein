package o0oo0Oo;

import android.graphics.PointF;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.ShapeInfo;
import java.util.List;
import o000oooo.C24761OooO;
import o0O0oOo.AbstractC26133OooOO0o;
import o0O0oo00.OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0oo0Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31240OooO0O0<T> extends AbstractC31239OooO00o<T> {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f111427OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final o0O0oo00.OooO00o<T> f111429OooOOo0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ShapeInfo f111431OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final int f111432OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final float f111433OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f111434OooOo0O;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f111436OooOoO0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final PointF f111428OooOOo = new PointF();

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final PointF f111430OooOOoo = new PointF();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public float f111435OooOo0o = 1.0f;

    public C31240OooO0O0(int i, float f, int i2, o0O0oo00.OooO00o oooO00o) {
        this.f111427OooOOOo = i2;
        this.f111429OooOOo0 = oooO00o;
        this.f111433OooOo00 = f;
        this.f111432OooOo0 = i;
        OooO00o.C19734OooO00o.OooO00o(oooO00o, i, f, 0, 0, false, 24);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> displayItems) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItems, "displayItems");
        DrawResult drawResultOooO = super.OooO(f, f2, f3, i, C34434OooOoO.f123453OooOo0o);
        PointF pointF = this.f111428OooOOo;
        PointF pointF2 = this.f111430OooOOoo;
        ShapeInfo shapeInfo = null;
        o0O0oo00.OooO00o<T> oooO00o = this.f111429OooOOo0;
        if (i == 0) {
            oooO00o.reset();
            OooO00o.C19734OooO00o.OooO00o(this.f111429OooOOo0, this.f111432OooOo0, this.f111433OooOo00 * this.f111435OooOo0o, 0, 0, false, 24);
            oooO00o.moveTo(f, f2);
            pointF.set(f, f2);
            pointF2.set(f, f2);
            this.f111434OooOo0O = true;
            this.f111431OooOo = null;
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        if (i == 1) {
            this.f111434OooOo0O = false;
            if (this.f111422OooOO0) {
                ShapeInfo shapeInfo2 = this.f111431OooOo;
                if (shapeInfo2 != null) {
                    return new DrawResult(3, shapeInfo2, com.facebook.soloader.OooOo.OooO0oO(shapeInfo2), null, null, false, false, null, null, false, null, 2040, null);
                }
            } else {
                oooO00o.lineTo(f, f2);
            }
            return new DrawResult(3, drawResultOooO.getItem(), com.facebook.soloader.OooOo.OooO0oO(drawResultOooO.getItem()), null, null, false, false, null, null, false, null, 2040, null);
        }
        if (i != 2) {
            return new DrawResult(0, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        float f4 = pointF.x;
        float f5 = pointF.y;
        float f6 = 2;
        oooO00o.OooO0O0(f4, f5, (f4 + f) / f6, (f5 + f2) / f6);
        pointF.set(f, f2);
        if (this.f111422OooOO0) {
            ShapeInfo shapeInfo3 = this.f111431OooOo;
            if (shapeInfo3 == null) {
                oooO00o.reset();
                AbstractC26133OooOO0o abstractC26133OooOO0oOooO00o = this.f111413OooO.OooO00o();
                if (abstractC26133OooOO0oOooO00o != null) {
                    oooO00o.reset();
                    abstractC26133OooOO0oOooO00o.OooOO0O(oooO00o);
                    shapeInfo = new ShapeInfo(C24761OooO.OooO00o("toString(...)"), this.f111432OooOo0, this.f111433OooOo00, abstractC26133OooOO0oOooO00o.OooO0Oo(), abstractC26133OooOO0oOooO00o.OooO0o(), -1, null, 0L, this.f111427OooOOOo == 0 ? 0 : 2, false, this.f111427OooOOOo, false, 2752, null);
                }
                if (shapeInfo != null) {
                    this.f111431OooOo = shapeInfo;
                    this.f111436OooOoO0 = shapeInfo.getMinDistancePointIndex(new PointF(f, f2));
                }
            } else {
                oooO00o.reset();
                ShapeInfo shapeInfo4 = this.f111431OooOo;
                if (shapeInfo4 != null) {
                    shapeInfo4.updateAnchorPoint(this.f111436OooOoO0, new PointF(f, f2));
                }
                shapeInfo3.setupRenderEngine(oooO00o);
            }
            ShapeInfo shapeInfo5 = this.f111431OooOo;
            if (shapeInfo5 != null) {
                return new DrawResult(1, shapeInfo5, null, null, null, false, false, null, null, false, null, 2044, null);
            }
        }
        return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0Oo() {
        return this.f111432OooOo0;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0o() {
        return this.f111435OooOo0o;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0oO() {
        return 1;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0oo() {
        return this.f111433OooOo00;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0(o0O0oo00.OooO0O0<T> target, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
        if (!z || this.f111434OooOo0O) {
            o0O0oo00.OooO00o<T> oooO00o = this.f111429OooOOo0;
            oooO00o.OooOo00(target);
            oooO00o.OooO0Oo();
            if (this.f111415OooO0O0 && !this.f111422OooOO0) {
                oooO00o.lineTo(this.f111416OooO0OO, this.f111417OooO0Oo);
            }
            oooO00o.OooOOOO(this.f111435OooOo0o);
            oooO00o.OooO0o0();
        }
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0O() {
        this.f111429OooOOo0.reset();
        this.f111434OooOo0O = false;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0o(float f) {
        this.f111435OooOo0o = f;
    }
}
