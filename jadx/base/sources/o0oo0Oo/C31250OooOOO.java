package o0oo0Oo;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.ink.geometry.AbstractC21964OooOo0;
import com.android.billingclient.api.C22172OooOoO;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.InkStrokeInfo;
import com.orion.penkit.models.ShapeInfo;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o0O0oo00.OooO00o;
import o0Oo0ooO.C28460OooooO0;
import o0oo0o.InterfaceC31284OooO0O0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34435OooOoO0;

/* JADX INFO: renamed from: o0oo0Oo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31250OooOOO<T> extends AbstractC31239OooO00o<T> implements InterfaceC31263OooOoO0 {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final int f111518OooOoOO = C28460OooooO0.OooO0O0(3);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o0O0oo00.OooO00o<T> f111519OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final int f111520OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final float f111521OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f111522OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f111523OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public ArrayList<PointF> f111524OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final PointF f111525OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final RectF f111526OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final HashSet<InterfaceC31284OooO0O0> f111527OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ArrayList f111528OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final HashSet<InterfaceC31284OooO0O0> f111529OooOoO0;

    public C31250OooOOO() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C31250OooOOO(o0O0oo00.OooO00o oooO00o) {
        Integer num;
        int color = Color.parseColor("#007AFF");
        float fOooO00o = C28460OooooO0.OooO00o(1.5f);
        this.f111519OooOOOo = oooO00o;
        this.f111521OooOOo0 = fOooO00o;
        this.f111520OooOOo = color;
        this.f111525OooOo00 = new PointF();
        new PointF();
        new PointF();
        this.f111524OooOo0 = new ArrayList<>();
        this.f111526OooOo0O = new RectF();
        this.f111527OooOo0o = new HashSet<>();
        this.f111529OooOoO0 = new HashSet<>();
        ArrayList arrayList = new ArrayList();
        C34435OooOoO0 c34435OooOoO0 = C34435OooOoO0.f123454OooOo0o;
        while (c34435OooOoO0.hasNext()) {
            String str = (String) c34435OooOoO0.next();
            int iHashCode = str.hashCode();
            if (iHashCode != -891980232) {
                if (iHashCode != 100313435) {
                    num = (iHashCode == 109399969 && str.equals("shape")) ? 2 : null;
                } else if (str.equals("image")) {
                    num = 5;
                }
            } else if (str.equals("stroke")) {
                num = 0;
            }
            if (num != null) {
                arrayList.add(num);
            }
        }
        this.f111528OooOoO = arrayList;
        OooO00o.C19734OooO00o.OooO00o(this.f111519OooOOOo, color, fOooO00o, 0, -1, false, 16);
        this.f111519OooOOOo.OooO0oo(new float[]{C28460OooooO0.OooO00o(4.0f), C28460OooooO0.OooO00o(4.0f)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> displayItems) {
        ?? arrayList;
        ArrayList arrayList2;
        List<AbstractC21964OooOo0> listComputeLassoTriangles;
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItems, "displayItems");
        DrawResult drawResultOooO = super.OooO(f, f2, f3, i, displayItems);
        if (i == 0) {
            this.f111522OooOOoo = 1;
            this.f111523OooOo = true;
            OooOOOO(f, f2);
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        RectF rectF = this.f111526OooOo0O;
        o0O0oo00.OooO00o<T> oooO00o = this.f111519OooOOOo;
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    this.f111522OooOOoo = 0;
                    return drawResultOooO;
                }
            } else if (this.f111522OooOOoo == 1) {
                this.f111524OooOo0.add(new PointF(f, f2));
                o00OO0O0.OooO0O0.OooO0o0(rectF, f, f2, 0.0f);
                oooO00o.lineTo(f, f2);
                return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
            }
        } else if (this.f111522OooOOoo == 1) {
            this.f111522OooOOoo = 0;
            float f4 = rectF.right - rectF.left;
            float f5 = f111518OooOoOO;
            if (f4 <= f5 && rectF.bottom - rectF.top <= f5) {
                this.f111524OooOo0 = new ArrayList<>();
                oooO00o.reset();
                return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
            }
            this.f111524OooOo0.add(new PointF(f, f2));
            oooO00o.lineTo(f, f2);
            PointF pointF = this.f111525OooOo00;
            oooO00o.lineTo(pointF.x, pointF.y);
            DrawToolFactory drawToolFactory = DrawToolFactory.INSTANCE;
            if (drawToolFactory.getEnableEraseHighLighterOnly()) {
                arrayList2 = new ArrayList();
                for (T t : displayItems) {
                    InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) t;
                    if (!(interfaceC31284OooO0O0 instanceof ShapeInfo) || ((ShapeInfo) interfaceC31284OooO0O0).getBlendMode() == -1) {
                        if (interfaceC31284OooO0O0 instanceof DrawRecord) {
                            DrawRecord drawRecord = (DrawRecord) interfaceC31284OooO0O0;
                            if (drawRecord.getType() == 2 || drawRecord.getType() == 9 || drawRecord.getType() == 6) {
                            }
                        }
                    }
                    arrayList2.add(t);
                }
            } else {
                if (drawToolFactory.getEnableEraseTapeOnly()) {
                    arrayList = new ArrayList();
                    for (T t2 : displayItems) {
                        InterfaceC31284OooO0O0 interfaceC31284OooO0O02 = (InterfaceC31284OooO0O0) t2;
                        boolean z = (interfaceC31284OooO0O02 instanceof ShapeInfo) && ((ShapeInfo) interfaceC31284OooO0O02).getTapeLike();
                        boolean z2 = (interfaceC31284OooO0O02 instanceof DrawRecord) && ((DrawRecord) interfaceC31284OooO0O02).getType() == 11;
                        if (z || z2) {
                            arrayList.add(t2);
                        }
                    }
                } else {
                    arrayList = displayItems;
                }
                ArrayList arrayList3 = new ArrayList();
                for (T t3 : (Iterable) arrayList) {
                    InterfaceC31284OooO0O0 interfaceC31284OooO0O03 = (InterfaceC31284OooO0O0) t3;
                    if (interfaceC31284OooO0O03.getItemType() != 7) {
                        ArrayList arrayList4 = this.f111528OooOoO;
                        if (arrayList4.isEmpty() || arrayList4.contains(Integer.valueOf(interfaceC31284OooO0O03.getItemType()))) {
                            arrayList3.add(t3);
                        }
                    }
                }
                arrayList2 = new ArrayList();
                for (Object obj : arrayList3) {
                    if (((InterfaceC31284OooO0O0) obj).getBoundingBox(1.0f).intersects(rectF.left, rectF.top, rectF.right, rectF.bottom)) {
                        arrayList2.add(obj);
                    }
                }
            }
            boolean zIsEmpty = arrayList2.isEmpty();
            C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
            if (zIsEmpty) {
                listComputeLassoTriangles = c34434OooOoO;
            } else {
                Iterator<T> it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC31284OooO0O0) it.next()) instanceof InkStrokeInfo) {
                        listComputeLassoTriangles = InkStrokeInfo.INSTANCE.computeLassoTriangles(this.f111524OooOo0);
                        break;
                    }
                }
                listComputeLassoTriangles = c34434OooOoO;
            }
            Iterator<T> it2 = arrayList2.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                HashSet<InterfaceC31284OooO0O0> hashSet = this.f111527OooOo0o;
                if (!zHasNext) {
                    this.f111523OooOo = false;
                    return new DrawResult(3, drawResultOooO.getItem(), null, oOo000Oo.OooOo.o0ooOO0(hashSet), c34434OooOoO, true, false, null, null, false, null, 1988, null);
                }
                InterfaceC31284OooO0O0 interfaceC31284OooO0O04 = (InterfaceC31284OooO0O0) it2.next();
                if (interfaceC31284OooO0O04 instanceof InkStrokeInfo ? ((InkStrokeInfo) interfaceC31284OooO0O04).onLassoEventWithTriangles(this.f111524OooOo0, listComputeLassoTriangles) : interfaceC31284OooO0O04.onLassoEvent(this.f111524OooOo0)) {
                    hashSet.add(interfaceC31284OooO0O04);
                }
            }
        }
        return drawResultOooO;
    }

    @Override // o0oo0Oo.InterfaceC31263OooOoO0
    public final RectF OooO00o() {
        return new RectF(this.f111526OooOo0O);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0Oo() {
        return this.f111520OooOOo;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final Bundle OooO0o0() {
        return C22172OooOoO.OooO00o(C18437z2.f56754h, DrawToolFactory.LASSO_TYPE_FREE);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0oO() {
        return 3;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0oo() {
        return this.f111521OooOOo0;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0(o0O0oo00.OooO0O0<T> target, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
        if (z && this.f111523OooOo) {
            o0O0oo00.OooO00o<T> oooO00o = this.f111519OooOOOo;
            oooO00o.OooOo00(target);
            oooO00o.OooO0Oo();
            oooO00o.OooOOOO(1.0f);
            oooO00o.OooO0o0();
        }
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0O() {
        this.f111522OooOOoo = 0;
        OooOOOO(0.0f, 0.0f);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0o(float f) {
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOOO(List<? extends InterfaceC31284OooO0O0> list) {
        HashSet<InterfaceC31284OooO0O0> hashSet = this.f111527OooOo0o;
        hashSet.clear();
        hashSet.addAll(list);
    }

    public final void OooOOOO(float f, float f2) {
        this.f111524OooOo0 = new ArrayList<>();
        this.f111527OooOo0o.clear();
        this.f111529OooOoO0.clear();
        o0O0oo00.OooO00o<T> oooO00o = this.f111519OooOOOo;
        oooO00o.reset();
        this.f111524OooOo0.add(new PointF(f, f2));
        this.f111526OooOo0O.set(f, f2, f, f2);
        this.f111525OooOo00.set(f, f2);
        new PointF(0.0f, 0.0f);
        new PointF(0.0f, 0.0f);
        oooO00o.moveTo(f, f2);
    }
}
