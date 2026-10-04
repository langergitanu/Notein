package o0oo0Oo;

import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.PointF;
import android.graphics.RectF;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.PressurePoint;
import com.orion.penkit.models.ShapeInfo;
import java.util.ArrayList;
import java.util.List;
import o000oooo.C24761OooO;
import o00o0o0o.C25446OooO0Oo;
import o0O0oOo.AbstractC26133OooOO0o;
import o0O0oo00.OooO00o;
import o0Oo0ooO.C28460OooooO0;
import o0o0OOO.C30508OoooOo0;
import o0o0OOO.C30509OoooOoO;
import o0o0OOO.C30510OoooOoo;
import o0oo0o.InterfaceC31284OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0oo0Oo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31266OooOoo0<T> extends AbstractC31239OooO00o<T> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final int f111629OooOoo0 = C28460OooooO0.OooO0O0(2);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final boolean f111630OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final o0O0oo00.OooO00o<T> f111631OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final boolean f111632OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f111633OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f111634OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final PointF f111635OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final PointF f111636OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final float f111637OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f111638OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ShapeInfo f111639OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f111640OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f111641OooOoOO;

    public C31266OooOoo0() {
        throw null;
    }

    public C31266OooOoo0(int i, float f, boolean z, boolean z2, o0O0oo00.OooO00o oooO00o) {
        this.f111630OooOOOo = z;
        this.f111632OooOOo0 = z2;
        this.f111631OooOOo = oooO00o;
        this.f111633OooOOoo = 0.0f;
        this.f111636OooOo00 = new PointF();
        this.f111635OooOo0 = new PointF();
        this.f111637OooOo0O = f;
        this.f111638OooOo0o = i;
        this.f111640OooOoO0 = 1.0f;
        OooO00o.C19734OooO00o.OooO00o(oooO00o, i, f, 0, 0, false, 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01df  */
    @Override // o0oo0Oo.AbstractC31239OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> displayItems) {
        ShapeInfo shapeInfo;
        List<PointF> listOooOO0o;
        List list;
        int iOooO0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItems, "displayItems");
        DrawResult drawResultOooO = super.OooO(f, f2, f3, i, C34434OooOoO.f123453OooOo0o);
        PointF pointF = this.f111635OooOo0;
        PointF pointF2 = this.f111636OooOo00;
        o0O0oo00.OooO00o<T> oooO00o = this.f111631OooOOo;
        if (i == 0) {
            oooO00o.reset();
            OooO00o.C19734OooO00o.OooO00o(this.f111631OooOOo, this.f111638OooOo0o, this.f111637OooOo0O * this.f111640OooOoO0, 0, 0, !this.f111630OooOOOo, 8);
            oooO00o.OooO0oO(this.f111424OooOO0o);
            oooO00o.moveTo(f, f2);
            pointF2.set(f, f2);
            pointF.set(f, f2);
            this.f111634OooOo = true;
            this.f111639OooOoO = null;
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        boolean z = this.f111632OooOOo0;
        int i2 = 0;
        if (i == 1) {
            this.f111634OooOo = false;
            if (!z) {
                if (this.f111422OooOO0) {
                    ShapeInfo shapeInfo2 = this.f111639OooOoO;
                    if (shapeInfo2 != null) {
                        return new DrawResult(3, shapeInfo2, com.facebook.soloader.OooOo.OooO0oO(shapeInfo2), null, null, false, false, null, null, false, null, 2040, null);
                    }
                } else {
                    oooO00o.OooO0O0(pointF2.x, pointF2.y, f, f2);
                }
                return new DrawResult(3, drawResultOooO.getItem(), com.facebook.soloader.OooOo.OooO0oO(drawResultOooO.getItem()), null, null, false, false, null, null, false, null, 2040, null);
            }
            pointF.set(f, f2);
            PointF pointFOooO0OO = AbstractC31239OooO00o.OooO0OO(pointF2.x, pointF2.y, f, f2);
            InterfaceC31284OooO0O0 item = drawResultOooO.getItem();
            kotlin.jvm.internal.OooOOO0.OooO0o0(item, "null cannot be cast to non-null type com.orion.penkit.models.DrawRecord");
            DrawRecord drawRecord = (DrawRecord) item;
            drawRecord.getPoints().clear();
            drawRecord.getPoints().addAll(C34429OooOOo0.OooOO0o(new PressurePoint(pointF2.x, pointF2.y, 1.0f, 0), new PressurePoint(pointFOooO0OO.x, pointFOooO0OO.y, 1.0f, 1)));
            return new DrawResult(3, drawRecord, com.facebook.soloader.OooOo.OooO0oO(drawRecord), null, null, false, false, null, null, false, null, 2040, null);
        }
        if (i != 2) {
            return new DrawResult(0, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        if (z) {
            if (Math.abs(pointF.x - f) > this.f111640OooOoO0 || Math.abs(pointF.y - f2) > this.f111640OooOoO0) {
                pointF.set(f, f2);
            }
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        float f4 = pointF2.x;
        float f5 = pointF2.y;
        float f6 = 2;
        oooO00o.OooO0O0(f4, f5, (f4 + f) / f6, (f5 + f2) / f6);
        pointF2.set(f, f2);
        if (this.f111422OooOO0) {
            ShapeInfo shapeInfo3 = this.f111639OooOoO;
            if (shapeInfo3 == null) {
                oooO00o.reset();
                AbstractC26133OooOO0o abstractC26133OooOO0oOooO00o = this.f111413OooO.OooO00o();
                if (abstractC26133OooOO0oOooO00o != null) {
                    oooO00o.reset();
                    abstractC26133OooOO0oOooO00o.OooOO0O(oooO00o);
                    oooO00o.OooOoOO(new CornerPathEffect(36.0f));
                    int iOooO0o2 = abstractC26133OooOO0oOooO00o.OooO0o();
                    int iOooO0o3 = 3;
                    if (iOooO0o2 == 0) {
                        listOooOO0o = C34429OooOOo0.OooOO0o(oOo000Oo.OooOo.Oooo0oO(abstractC26133OooOO0oOooO00o.OooO0Oo()), oOo000Oo.OooOo.OoooOOo(abstractC26133OooOO0oOooO00o.OooO0Oo()));
                    } else if (iOooO0o2 == 2 || iOooO0o2 == 3 || iOooO0o2 == 4) {
                        List<PointF> listOooO0Oo = abstractC26133OooOO0oOooO00o.OooO0Oo();
                        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooO0Oo, 10));
                        for (T t : listOooO0Oo) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                C34429OooOOo0.OooOOo();
                                throw null;
                            }
                            PointF pointF3 = (PointF) t;
                            arrayList.add(new C31238OooO(i2, pointF3.x, pointF3.y));
                            i2 = i3;
                        }
                        List listO00O0O = oOo000Oo.OooOo.o00O0O(arrayList, new C30508OoooOo0(1));
                        C31238OooO c31238OooO = (C31238OooO) oOo000Oo.OooOo.Oooo0oO(listO00O0O);
                        C31238OooO c31238OooOOooO00o = C31238OooO.OooO00o((C31238OooO) listO00O0O.get(1), c31238OooO.f111410OooO0O0, 0.0f, 5);
                        C31238OooO c31238OooO2 = (C31238OooO) oOo000Oo.OooOo.OoooOOo(listO00O0O);
                        List listO00O0O2 = oOo000Oo.OooOo.o00O0O(C34429OooOOo0.OooOO0o(c31238OooO, c31238OooOOooO00o, C31238OooO.OooO00o((C31238OooO) listO00O0O.get(2), c31238OooO2.f111410OooO0O0, 0.0f, 5), c31238OooO2), new C30509OoooOoO(1));
                        C31238OooO c31238OooO3 = (C31238OooO) oOo000Oo.OooOo.Oooo0oO(listO00O0O2);
                        C31238OooO c31238OooOOooO00o2 = C31238OooO.OooO00o((C31238OooO) listO00O0O2.get(1), 0.0f, c31238OooO3.f111411OooO0OO, 3);
                        C31238OooO c31238OooO4 = (C31238OooO) oOo000Oo.OooOo.OoooOOo(listO00O0O2);
                        List<C31238OooO> listO00O0O3 = oOo000Oo.OooOo.o00O0O(C34429OooOOo0.OooOO0o(c31238OooO3, c31238OooOOooO00o2, C31238OooO.OooO00o((C31238OooO) listO00O0O2.get(2), 0.0f, c31238OooO4.f111411OooO0OO, 3), c31238OooO4), new C30510OoooOoo(2));
                        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(listO00O0O3, 10));
                        for (C31238OooO c31238OooO5 : listO00O0O3) {
                            arrayList2.add(new PointF(c31238OooO5.f111410OooO0O0, c31238OooO5.f111411OooO0OO));
                        }
                        list = arrayList2;
                        iOooO0o = abstractC26133OooOO0oOooO00o.OooO0o();
                        if (iOooO0o != 0) {
                            iOooO0o3 = 7;
                        } else if (iOooO0o != 2 && iOooO0o != 3 && iOooO0o != 4) {
                            iOooO0o3 = abstractC26133OooOO0oOooO00o.OooO0o();
                        }
                        shapeInfo = new ShapeInfo(C24761OooO.OooO00o("toString(...)"), this.f111638OooOo0o, this.f111637OooOo0O, list, iOooO0o3, -1, null, 0L, 1, true, 0, false, 3264, null);
                    } else {
                        listOooOO0o = abstractC26133OooOO0oOooO00o.OooO0Oo();
                    }
                    list = listOooOO0o;
                    iOooO0o = abstractC26133OooOO0oOooO00o.OooO0o();
                    if (iOooO0o != 0) {
                    }
                    shapeInfo = new ShapeInfo(C24761OooO.OooO00o("toString(...)"), this.f111638OooOo0o, this.f111637OooOo0O, list, iOooO0o3, -1, null, 0L, 1, true, 0, false, 3264, null);
                } else {
                    shapeInfo = null;
                }
                if (shapeInfo != null) {
                    this.f111639OooOoO = shapeInfo;
                    this.f111641OooOoOO = shapeInfo.getMinDistancePointIndex(new PointF(f, f2));
                }
            } else {
                oooO00o.reset();
                ShapeInfo shapeInfo4 = this.f111639OooOoO;
                if (shapeInfo4 != null) {
                    shapeInfo4.updateAnchorPoint(this.f111641OooOoOO, new PointF(f, f2));
                }
                shapeInfo3.setupRenderEngine(oooO00o);
            }
            ShapeInfo shapeInfo5 = this.f111639OooOoO;
            if (shapeInfo5 != null) {
                return new DrawResult(1, shapeInfo5, null, null, null, false, false, null, null, false, null, 2044, null);
            }
        }
        return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0Oo() {
        return this.f111638OooOo0o;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0o() {
        return this.f111640OooOoO0;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0oO() {
        return 11;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0oo() {
        return this.f111637OooOo0O;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x014a  */
    @Override // o0oo0Oo.AbstractC31239OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOO0(o0O0oo00.OooO0O0<T> target, boolean z) {
        int i;
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
        if (!z || this.f111634OooOo) {
            PointF pointF = new PointF(this.f111426OooOOO0, this.f111425OooOOO);
            float f = pointF.x;
            float f2 = pointF.y;
            o0O0oo00.OooO00o<T> oooO00o = this.f111631OooOOo;
            oooO00o.OooOOO(f, f2);
            oooO00o.OooOOO0(this.f111633OooOOoo);
            oooO00o.OooOo00(target);
            oooO00o.OooO0oO(this.f111424OooOO0o);
            float f3 = this.f111637OooOo0O;
            boolean z2 = this.f111632OooOOo0;
            int i2 = f111629OooOoo0;
            boolean z3 = this.f111630OooOOOo;
            if (!z2) {
                oooO00o.OooO0Oo();
                if (z3) {
                    oooO00o.OooO((this.f111640OooOoO0 * f3) + i2);
                    oooO00o.OooOOOO(this.f111640OooOoO0);
                    oooO00o.OooOoO0(11);
                    oooO00o.OooO(f3 * this.f111640OooOoO0);
                    oooO00o.OooOOOO(this.f111640OooOoO0);
                } else {
                    ShapeInfo shapeInfo = this.f111639OooOoO;
                    if (shapeInfo == null) {
                        i = 0;
                        oooO00o.OooOo(i);
                        oooO00o.OooOOOO(this.f111640OooOoO0);
                    } else {
                        if (!shapeInfo.getTapeLike() || !shapeInfo.isClosedShape()) {
                            shapeInfo = null;
                        }
                        if (shapeInfo != null) {
                            i = 1;
                        }
                        oooO00o.OooOo(i);
                        oooO00o.OooOOOO(this.f111640OooOoO0);
                    }
                }
                oooO00o.OooO0o0();
                return;
            }
            oooO00o.reset();
            OooO00o.C19734OooO00o.OooO00o(this.f111631OooOOo, this.f111638OooOo0o, f3 * this.f111640OooOoO0, 0, 0, !z3, 8);
            PointF pointF2 = this.f111636OooOo00;
            oooO00o.moveTo(pointF2.x, pointF2.y);
            float f4 = pointF2.x;
            float f5 = pointF2.y;
            PointF pointF3 = this.f111635OooOo0;
            PointF pointFOooO0OO = AbstractC31239OooO00o.OooO0OO(f4, f5, pointF3.x, pointF3.y);
            oooO00o.lineTo(pointFOooO0OO.x, pointFOooO0OO.y);
            if (z3) {
                oooO00o.OooO((this.f111640OooOoO0 * f3) + i2);
                oooO00o.OooOOOO(this.f111640OooOoO0);
                oooO00o.OooOoO0(11);
                oooO00o.OooO(f3 * this.f111640OooOoO0);
                oooO00o.OooOOOO(this.f111640OooOoO0);
            } else {
                oooO00o.OooOOOO(this.f111640OooOoO0);
            }
            oooO00o.reset();
            if (z) {
                oooO00o.reset();
                OooO00o.C19734OooO00o.OooO00o(this.f111631OooOOo, Color.parseColor("#80000000"), 0.0f, 1, -1, false, 16);
                RectF rectF = new RectF(C28460OooooO0.OooO00o(18.0f) + pointFOooO0OO.x, pointFOooO0OO.y - C28460OooooO0.OooO00o(20.0f), pointFOooO0OO.x + C28460OooooO0.OooO0O0(18) + C28460OooooO0.OooO0O0(40), pointFOooO0OO.y);
                oooO00o.OooOoo0(C28460OooooO0.OooO00o(4.0f), C28460OooooO0.OooO00o(4.0f), rectF);
                oooO00o.OooOOOO(this.f111640OooOoO0);
                oooO00o.reset();
                oooO00o.OooOo0O(String.valueOf(oO0O00O.OooO00o.OooO0O0(C25446OooO0Oo.OooO0Oo(pointFOooO0OO, new PointF(pointF2.x, pointF2.y)) / this.f111640OooOoO0)), rectF.centerX(), rectF.centerY(), C28460OooooO0.OooO00o(11.0f));
                oooO00o.reset();
            }
        }
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0O() {
        this.f111631OooOOo.reset();
        this.f111634OooOo = false;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0o(float f) {
        this.f111640OooOoO0 = f;
    }
}
