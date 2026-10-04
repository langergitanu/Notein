package o0oo0Oo;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.InkStrokeInfo;
import com.orion.penkit.models.MaskKt;
import com.orion.penkit.models.PressurePoint;
import com.orion.penkit.models.ShapeInfo;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import o0O0oo00.OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0oo0Oo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31260OooOo0O<T> extends AbstractC31239OooO00o<T> {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final int f111583OooOooO = Color.parseColor("#c0c0c0");

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final int f111584OooOooo = Color.parseColor("#c0f9f9f9");

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o0O0oo00.OooO00o<T> f111585OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f111586OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final float f111587OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f111588OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f111589OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public float f111590OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f111591OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public float f111592OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public float f111593OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f111595OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f111596OooOoOO;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f111594OooOoO = 1.0f;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final HashSet f111598OooOoo0 = new HashSet();

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final HashSet f111597OooOoo = new HashSet();

    public C31260OooOo0O(float f, o0O0oo00.OooO00o oooO00o) {
        this.f111585OooOOOo = oooO00o;
        this.f111587OooOOo0 = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9 A[PHI: r20
      0x00d9: PHI (r20v7 com.orion.penkit.models.DrawResult) = 
      (r20v9 com.orion.penkit.models.DrawResult)
      (r20v9 com.orion.penkit.models.DrawResult)
      (r20v9 com.orion.penkit.models.DrawResult)
      (r20v10 com.orion.penkit.models.DrawResult)
     binds: [B:24:0x00c8, B:26:0x00d0, B:28:0x00d7, B:18:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    @Override // o0oo0Oo.AbstractC31239OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> displayItems) {
        ?? arrayList;
        String string;
        DrawResult drawResult;
        Object obj;
        RectF rectF;
        DrawResult drawResult2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItems, "displayItems");
        DrawResult drawResultOooO = super.OooO(f, f2, f3, i, displayItems);
        if (i == 0) {
            this.f111586OooOOo = f;
            this.f111588OooOOoo = f2;
            this.f111591OooOo00 = f;
            this.f111590OooOo0 = f2;
            this.f111592OooOo0O = f;
            this.f111593OooOo0o = f2;
            this.f111589OooOo = f;
            this.f111595OooOoO0 = f2;
            this.f111596OooOoOO = true;
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, true, null, 1532, null);
        }
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        HashSet<InterfaceC31284OooO0O0> hashSet = this.f111598OooOoo0;
        HashSet hashSet2 = this.f111597OooOoo;
        if (i == 1) {
            ArrayList<InterfaceC31284OooO0O0> arrayList2 = new ArrayList();
            for (Object obj2 : hashSet2) {
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj2;
                int itemType = interfaceC31284OooO0O0.getItemType();
                if (itemType != 0) {
                    if (itemType == 9 && !((InkStrokeInfo) interfaceC31284OooO0O0).getEraserMasks().isEmpty()) {
                        arrayList2.add(obj2);
                    }
                } else if (!((DrawRecord) interfaceC31284OooO0O0).getMasks().isEmpty()) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
            for (InterfaceC31284OooO0O0 interfaceC31284OooO0O02 : arrayList2) {
                if (interfaceC31284OooO0O02 instanceof DrawRecord) {
                    DrawRecord drawRecord = (DrawRecord) interfaceC31284OooO0O02;
                    List<List<PressurePoint>> listCalculateVisibleStrokeList = drawRecord.calculateVisibleStrokeList(MaskKt.computeUnmaskedRegions(drawRecord.getMasks()));
                    arrayList = new ArrayList(C34428OooOOo.OooOOoo(listCalculateVisibleStrokeList, 10));
                    int i2 = 0;
                    for (T t : listCalculateVisibleStrokeList) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            C34429OooOOo0.OooOOo();
                            throw null;
                        }
                        List<PressurePoint> list = (List) t;
                        if (drawRecord.isConvertedFromShape() && i2 == 0) {
                            string = drawRecord.getId();
                        } else {
                            string = UUID.randomUUID().toString();
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(string);
                        }
                        arrayList.add(drawRecord.copyWithPoints(string, list));
                        i2 = i3;
                    }
                } else if (interfaceC31284OooO0O02 instanceof InkStrokeInfo) {
                    InkStrokeInfo inkStrokeInfo = (InkStrokeInfo) interfaceC31284OooO0O02;
                    List<androidx.ink.strokes.OooOOO0> listCalculateVisibleStrokeInputs = inkStrokeInfo.calculateVisibleStrokeInputs(MaskKt.computeUnmaskedRegions(inkStrokeInfo.getEraserMasks()));
                    arrayList = new ArrayList(C34428OooOOo.OooOOoo(listCalculateVisibleStrokeInputs, 10));
                    int i4 = 0;
                    for (T t2 : listCalculateVisibleStrokeInputs) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            C34429OooOOo0.OooOOo();
                            throw null;
                        }
                        String string2 = UUID.randomUUID().toString();
                        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "toString(...)");
                        arrayList.add(inkStrokeInfo.copyWithStroke(string2, (androidx.ink.strokes.OooOOO0) t2));
                        i4 = i5;
                    }
                } else {
                    arrayList = c34434OooOoO;
                }
                arrayList3.add(arrayList);
            }
            ArrayList arrayListOooOo00 = C34428OooOOo.OooOo00(arrayList3);
            hashSet2.removeAll(oOo000Oo.OooOo.o0OO00O(arrayList2));
            hashSet2.addAll(arrayListOooOo00);
            for (InterfaceC31284OooO0O0 interfaceC31284OooO0O03 : hashSet) {
                if (interfaceC31284OooO0O03 instanceof DrawRecord) {
                    ((DrawRecord) interfaceC31284OooO0O03).setMasks(c34434OooOoO);
                }
                if (interfaceC31284OooO0O03 instanceof InkStrokeInfo) {
                    ((InkStrokeInfo) interfaceC31284OooO0O03).clearEraserMasks();
                }
            }
            this.f111596OooOoOO = false;
            List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(hashSet);
            ArrayList arrayList4 = new ArrayList();
            for (T t3 : listO0ooOO0) {
                InterfaceC31284OooO0O0 interfaceC31284OooO0O04 = (InterfaceC31284OooO0O0) t3;
                if (!(interfaceC31284OooO0O04 instanceof DrawRecord) || !((DrawRecord) interfaceC31284OooO0O04).isConvertedFromShape()) {
                    arrayList4.add(t3);
                }
            }
            List listO0ooOO02 = oOo000Oo.OooOo.o0ooOO0(hashSet2);
            hashSet.clear();
            hashSet2.clear();
            return new DrawResult(3, drawResultOooO.getItem(), listO0ooOO02, arrayList4, null, false, false, null, null, true, null, 1520, null);
        }
        if (i != 2) {
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, true, null, 1532, null);
        }
        this.f111589OooOo = f;
        this.f111595OooOoO0 = f2;
        float f4 = this.f111592OooOo0O;
        this.f111591OooOo00 = f4;
        this.f111590OooOo0 = this.f111593OooOo0o;
        this.f111592OooOo0O = f;
        this.f111593OooOo0o = f2;
        float fMin = Math.min(f, f4);
        float fMax = Math.max(this.f111592OooOo0O, this.f111591OooOo00);
        float fMin2 = Math.min(this.f111593OooOo0o, this.f111590OooOo0);
        float fMax2 = Math.max(this.f111593OooOo0o, this.f111590OooOo0);
        float f5 = this.f111594OooOoO;
        float f6 = this.f111587OooOOo0;
        float f7 = 2;
        float f8 = (f5 * f6) / f7;
        RectF rectF2 = new RectF(fMin - f8, fMin2 - f8, fMax + f8, fMax2 + f8);
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        DrawToolFactory drawToolFactory = DrawToolFactory.INSTANCE;
        if (drawToolFactory.getEnableEraseHighLighterOnly()) {
            ArrayList arrayList5 = new ArrayList();
            Iterator<T> it = displayItems.iterator();
            while (it.hasNext()) {
                T next = it.next();
                InterfaceC31284OooO0O0 interfaceC31284OooO0O05 = (InterfaceC31284OooO0O0) next;
                Iterator<T> it2 = it;
                if (interfaceC31284OooO0O05 instanceof ShapeInfo) {
                    drawResult2 = drawResultOooO;
                    if (((ShapeInfo) interfaceC31284OooO0O05).getBlendMode() != -1) {
                        arrayList5.add(next);
                    }
                    it = it2;
                    drawResultOooO = drawResult2;
                } else {
                    drawResult2 = drawResultOooO;
                }
                if (interfaceC31284OooO0O05 instanceof DrawRecord) {
                    DrawRecord drawRecord2 = (DrawRecord) interfaceC31284OooO0O05;
                    if (drawRecord2.getType() == 2 || drawRecord2.getType() == 9 || drawRecord2.getType() == 6) {
                    }
                }
                it = it2;
                drawResultOooO = drawResult2;
            }
            drawResult = drawResultOooO;
            obj = arrayList5;
        } else {
            drawResult = drawResultOooO;
            if (drawToolFactory.getEnableEraseTapeOnly()) {
                ArrayList arrayList6 = new ArrayList();
                Iterator<T> it3 = displayItems.iterator();
                while (it3.hasNext()) {
                    T next2 = it3.next();
                    InterfaceC31284OooO0O0 interfaceC31284OooO0O06 = (InterfaceC31284OooO0O0) next2;
                    boolean z = (interfaceC31284OooO0O06 instanceof ShapeInfo) && ((ShapeInfo) interfaceC31284OooO0O06).getTapeLike();
                    Iterator<T> it4 = it3;
                    boolean z2 = (interfaceC31284OooO0O06 instanceof DrawRecord) && ((DrawRecord) interfaceC31284OooO0O06).getType() == 11;
                    if (z || z2) {
                        arrayList6.add(next2);
                    }
                    it3 = it4;
                }
                obj = arrayList6;
            } else {
                obj = displayItems;
            }
        }
        ArrayList<InterfaceC31284OooO0O0> arrayList7 = new ArrayList();
        Iterator<T> it5 = ((Iterable) obj).iterator();
        while (it5.hasNext()) {
            T next3 = it5.next();
            Iterator<T> it6 = it5;
            float f9 = f7;
            float f10 = f6;
            if (((InterfaceC31284OooO0O0) next3).getBoundingBox(1.0f).intersects(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom)) {
                arrayList7.add(next3);
            }
            it5 = it6;
            f7 = f9;
            f6 = f10;
        }
        float f11 = f7;
        float f12 = f6;
        PointF pointF = new PointF(this.f111591OooOo00, this.f111590OooOo0);
        PointF pointF2 = new PointF(f, f2);
        PointF pointF3 = new PointF(this.f111586OooOOo, this.f111588OooOOoo);
        for (InterfaceC31284OooO0O0 interfaceC31284OooO0O07 : arrayList7) {
            float f13 = this.f111594OooOoO;
            PointF pointF4 = pointF;
            PointF pointF5 = pointF2;
            PointF pointF6 = pointF3;
            C32443OooOOO<Set<InterfaceC31284OooO0O0>, Set<InterfaceC31284OooO0O0>> c32443OooOOOOnEraserEvent = interfaceC31284OooO0O07.onEraserEvent(pointF6, pointF4, pointF5, f12 * f13, true, f13);
            hashSet4.addAll(c32443OooOOOOnEraserEvent.f116638OooOo0o);
            hashSet3.addAll(c32443OooOOOOnEraserEvent.f116637OooOo);
            pointF3 = pointF6;
            pointF = pointF4;
            pointF2 = pointF5;
        }
        if (hashSet3.size() <= 0) {
            return new DrawResult(1, drawResult.getItem(), null, c34434OooOoO, null, false, false, null, null, true, null, 1524, null);
        }
        ArrayList arrayList8 = new ArrayList(C34428OooOOo.OooOOoo(hashSet3, 10));
        Iterator it7 = hashSet3.iterator();
        while (it7.hasNext()) {
            arrayList8.add(((InterfaceC31284OooO0O0) it7.next()).getId());
        }
        final C31254OooOOo c31254OooOOo = new C31254OooOOo(oOo000Oo.OooOo.o0OO00O(arrayList8), 0);
        hashSet.removeIf(new Predicate() { // from class: o0oo0Oo.OooOOoo
            @Override // java.util.function.Predicate
            public final boolean test(Object obj3) {
                return ((Boolean) c31254OooOOo.invoke(obj3)).booleanValue();
            }
        });
        hashSet.addAll(hashSet3);
        ArrayList arrayList9 = new ArrayList(C34428OooOOo.OooOOoo(hashSet4, 10));
        Iterator it8 = hashSet4.iterator();
        while (it8.hasNext()) {
            arrayList9.add(((InterfaceC31284OooO0O0) it8.next()).getId());
        }
        final C31259OooOo00 c31259OooOo00 = new C31259OooOo00(oOo000Oo.OooOo.o0OO00O(arrayList9), 0);
        hashSet2.removeIf(new Predicate() { // from class: o0oo0Oo.OooOo0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj3) {
                return ((Boolean) c31259OooOo00.invoke(obj3)).booleanValue();
            }
        });
        hashSet2.addAll(hashSet4);
        if (hashSet3.isEmpty() || !hashSet4.isEmpty()) {
            float f14 = this.f111591OooOo00;
            float f15 = (f12 * this.f111594OooOoO) / f11;
            float f16 = this.f111590OooOo0;
            RectF rectF3 = new RectF(f14 - f15, f16 - f15, f14 + f15, f15 + f16);
            float f17 = (f12 * this.f111594OooOoO) / f11;
            rectF3.union(new RectF(f - f17, f2 - f17, f + f17, f17 + f2));
            rectF = rectF3;
        } else {
            rectF = new RectF();
        }
        return new DrawResult(3, drawResult.getItem(), oOo000Oo.OooOo.o0ooOO0(hashSet4), oOo000Oo.OooOo.o0ooOO0(hashSet3), null, true, false, null, rectF, true, null, 1232, null);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0Oo() {
        return 0;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0o() {
        return this.f111594OooOoO;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0oO() {
        return 3;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0oo() {
        return this.f111587OooOOo0;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0(o0O0oo00.OooO0O0<T> target, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
        if (z && this.f111596OooOoOO) {
            this.f111585OooOOOo.OooOo00(target);
            float f = (this.f111587OooOOo0 * this.f111594OooOoO) / 2;
            float f2 = this.f111589OooOo;
            float f3 = this.f111595OooOoO0;
            o0O0oo00.OooO00o<T> oooO00o = this.f111585OooOOOo;
            OooO00o.C19734OooO00o.OooO00o(oooO00o, f111583OooOooO, 1.0f, 0, -1, false, 16);
            oooO00o.OooOOOo(f2, f3, f);
            oooO00o.OooOOOO(1.0f);
            oooO00o.reset();
            OooO00o.C19734OooO00o.OooO00o(oooO00o, f111584OooOooo, 0.0f, 1, -1, false, 16);
            oooO00o.OooOOOo(f2, f3, f - 1);
            oooO00o.OooOOOO(1.0f);
            oooO00o.reset();
        }
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0O() {
        this.f111596OooOoOO = false;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0o(float f) {
        this.f111594OooOoO = f;
    }
}
