package o0oo0Oo;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.ShapeInfo;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import o0O0oo00.OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0oo0Oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31242OooO0Oo<T> extends AbstractC31239OooO00o<T> {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final int f111437OooOoOO = Color.parseColor("#c0c0c0");

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final int f111438OooOoo0 = Color.parseColor("#c0f9f9f9");

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o0O0oo00.OooO00o<T> f111439OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f111440OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final float f111441OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f111442OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public float f111444OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f111445OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public float f111446OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public float f111447OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f111449OooOoO0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f111443OooOo = 1.0f;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final HashSet f111448OooOoO = new HashSet();

    public C31242OooO0Oo(float f, o0O0oo00.OooO00o oooO00o) {
        this.f111439OooOOOo = oooO00o;
        this.f111441OooOOo0 = f;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> list) {
        Object displayItems = list;
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItems, "displayItems");
        DrawResult drawResultOooO = super.OooO(f, f2, f3, i, list);
        if (i == 0) {
            this.f111440OooOOo = f;
            this.f111442OooOOoo = f2;
            this.f111445OooOo00 = f;
            this.f111444OooOo0 = f2;
            this.f111446OooOo0O = f;
            this.f111447OooOo0o = f2;
            this.f111449OooOoO0 = true;
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        HashSet hashSet = this.f111448OooOoO;
        if (i == 1) {
            this.f111449OooOoO0 = false;
            List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(hashSet);
            hashSet.clear();
            return new DrawResult(3, drawResultOooO.getItem(), null, listO0ooOO0, null, false, false, null, null, false, null, 2036, null);
        }
        if (i != 2) {
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        float f4 = this.f111446OooOo0O;
        this.f111445OooOo00 = f4;
        this.f111444OooOo0 = this.f111447OooOo0o;
        this.f111446OooOo0O = f;
        this.f111447OooOo0o = f2;
        float fMin = Math.min(f, f4);
        float fMax = Math.max(this.f111446OooOo0O, this.f111445OooOo00);
        float fMin2 = Math.min(this.f111447OooOo0o, this.f111444OooOo0);
        float fMax2 = Math.max(this.f111447OooOo0o, this.f111444OooOo0);
        float f5 = this.f111443OooOo;
        float f6 = this.f111441OooOOo0;
        float f7 = (f5 * f6) / 2;
        RectF rectF = new RectF(fMin - f7, fMin2 - f7, fMax + f7, fMax2 + f7);
        HashSet hashSet2 = new HashSet();
        DrawToolFactory drawToolFactory = DrawToolFactory.INSTANCE;
        if (drawToolFactory.getEnableEraseHighLighterOnly()) {
            ArrayList arrayList = new ArrayList();
            for (T t : (Iterable) displayItems) {
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) t;
                if (!(interfaceC31284OooO0O0 instanceof ShapeInfo) || ((ShapeInfo) interfaceC31284OooO0O0).getBlendMode() == -1) {
                    if (interfaceC31284OooO0O0 instanceof DrawRecord) {
                        DrawRecord drawRecord = (DrawRecord) interfaceC31284OooO0O0;
                        if (drawRecord.getType() == 2 || drawRecord.getType() == 9 || drawRecord.getType() == 6) {
                        }
                    }
                }
                arrayList.add(t);
            }
            displayItems = arrayList;
        } else if (drawToolFactory.getEnableEraseTapeOnly()) {
            ArrayList arrayList2 = new ArrayList();
            for (T t2 : (Iterable) displayItems) {
                InterfaceC31284OooO0O0 interfaceC31284OooO0O02 = (InterfaceC31284OooO0O0) t2;
                boolean z = (interfaceC31284OooO0O02 instanceof ShapeInfo) && ((ShapeInfo) interfaceC31284OooO0O02).getTapeLike();
                boolean z2 = (interfaceC31284OooO0O02 instanceof DrawRecord) && ((DrawRecord) interfaceC31284OooO0O02).getType() == 11;
                if (z || z2) {
                    arrayList2.add(t2);
                }
            }
            displayItems = arrayList2;
        }
        ArrayList<InterfaceC31284OooO0O0> arrayList3 = new ArrayList();
        for (T t3 : (Iterable) displayItems) {
            if (((InterfaceC31284OooO0O0) t3).getBoundingBox(1.0f).intersects(rectF.left, rectF.top, rectF.right, rectF.bottom)) {
                arrayList3.add(t3);
            }
        }
        for (InterfaceC31284OooO0O0 interfaceC31284OooO0O03 : arrayList3) {
            PointF pointF = new PointF(this.f111440OooOOo, this.f111442OooOOoo);
            PointF pointF2 = new PointF(this.f111445OooOo00, this.f111444OooOo0);
            PointF pointF3 = new PointF(f, f2);
            float f8 = this.f111443OooOo;
            hashSet2.addAll(interfaceC31284OooO0O03.onEraserEvent(pointF, pointF2, pointF3, f6 * f8, false, f8).f116637OooOo);
        }
        if (hashSet2.size() <= 0) {
            return new DrawResult(1, drawResultOooO.getItem(), null, C34434OooOoO.f123453OooOo0o, null, false, false, null, null, false, null, 2036, null);
        }
        hashSet.addAll(hashSet2);
        return new DrawResult(3, drawResultOooO.getItem(), null, oOo000Oo.OooOo.o0ooOO0(hashSet2), null, true, false, null, null, false, null, 2004, null);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0Oo() {
        return 0;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0o() {
        return this.f111443OooOo;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0oO() {
        return 3;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0oo() {
        return this.f111441OooOOo0;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0(o0O0oo00.OooO0O0<T> target, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
        if (z && this.f111449OooOoO0) {
            this.f111439OooOOOo.OooOo00(target);
            float f = (this.f111441OooOOo0 * this.f111443OooOo) / 2;
            float f2 = this.f111446OooOo0O;
            float f3 = this.f111447OooOo0o;
            o0O0oo00.OooO00o<T> oooO00o = this.f111439OooOOOo;
            OooO00o.C19734OooO00o.OooO00o(oooO00o, f111437OooOoOO, 1.0f, 0, -1, false, 16);
            oooO00o.OooOOOo(f2, f3, f);
            oooO00o.OooOOOO(1.0f);
            oooO00o.reset();
            OooO00o.C19734OooO00o.OooO00o(oooO00o, f111438OooOoo0, 0.0f, 1, -1, false, 16);
            oooO00o.OooOOOo(f2, f3, f - 1);
            oooO00o.OooOOOO(1.0f);
            oooO00o.reset();
        }
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0O() {
        this.f111449OooOoO0 = false;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0o(float f) {
        this.f111443OooOo = f;
    }
}
