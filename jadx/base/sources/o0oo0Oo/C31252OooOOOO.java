package o0oo0Oo;

import Oooo0oO.C21081o00000o0;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.ink.geometry.AbstractC21964OooOo0;
import com.android.billingclient.api.C22172OooOoO;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.InkStrokeInfo;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o0O0oo00.OooO00o;
import o0Oo0ooO.C28460OooooO0;
import o0oo0o.InterfaceC31284OooO0O0;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0oo0Oo.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31252OooOOOO<T> extends AbstractC31239OooO00o<T> implements InterfaceC31263OooOoO0 {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final int f111537OooOoO0 = C28460OooooO0.OooO0O0(3);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o0O0oo00.OooO00o<T> f111538OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final int f111539OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final float f111540OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f111541OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final List<Integer> f111542OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final HashSet<InterfaceC31284OooO0O0> f111543OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final HashSet<InterfaceC31284OooO0O0> f111544OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final PointF f111545OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final PointF f111546OooOo0o;

    public C31252OooOOOO() {
        throw null;
    }

    public C31252OooOOOO(List list, o0O0oo00.OooO00o oooO00o) {
        int color = Color.parseColor("#007AFF");
        float fOooO00o = C28460OooooO0.OooO00o(1.5f);
        this.f111538OooOOOo = oooO00o;
        this.f111540OooOOo0 = fOooO00o;
        this.f111539OooOOo = color;
        new PointF();
        this.f111544OooOo00 = new HashSet<>();
        this.f111543OooOo0 = new HashSet<>();
        this.f111545OooOo0O = new PointF();
        this.f111546OooOo0o = new PointF();
        this.f111542OooOo = C21081o00000o0.OooO0oO(list);
        OooO00o.C19734OooO00o.OooO00o(oooO00o, color, fOooO00o, 0, -1, false, 16);
        oooO00o.OooO0oo(new float[]{C28460OooooO0.OooO00o(4.0f), C28460OooooO0.OooO00o(4.0f)});
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> displayItems) {
        HashSet<InterfaceC31284OooO0O0> hashSet;
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItems, "displayItems");
        DrawResult drawResultOooO = super.OooO(f, f2, f3, i, displayItems);
        if (i == 0) {
            this.f111541OooOOoo = 1;
            this.f111544OooOo00.clear();
            this.f111543OooOo0.clear();
            new PointF(0.0f, 0.0f);
            this.f111545OooOo0O.set(f, f2);
            this.f111546OooOo0o.set(f, f2);
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    this.f111541OooOOoo = 0;
                    return drawResultOooO;
                }
            } else if (this.f111541OooOOoo == 1) {
                this.f111546OooOo0o.set(f, f2);
                return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
            }
        } else if (this.f111541OooOOoo == 1) {
            this.f111541OooOOoo = 0;
            RectF rectFOooOOOO = OooOOOO();
            float f4 = rectFOooOOOO.right - rectFOooOOOO.left;
            float f5 = f111537OooOoO0;
            if (f4 <= f5 && rectFOooOOOO.bottom - rectFOooOOOO.top <= f5) {
                return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
            }
            RectF rectFOooOOOO2 = OooOOOO();
            ArrayList arrayList = new ArrayList();
            for (T t : displayItems) {
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) t;
                List<Integer> list = this.f111542OooOo;
                if (list.isEmpty() || list.contains(Integer.valueOf(interfaceC31284OooO0O0.getItemType()))) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((InterfaceC31284OooO0O0) obj).getBoundingBox(1.0f).intersects(rectFOooOOOO2.left, rectFOooOOOO2.top, rectFOooOOOO2.right, rectFOooOOOO2.bottom)) {
                    arrayList2.add(obj);
                }
            }
            List<? extends PointF> listOooOO0o = C34429OooOOo0.OooOO0o(new PointF(rectFOooOOOO2.left, rectFOooOOOO2.top), new PointF(rectFOooOOOO2.right, rectFOooOOOO2.top), new PointF(rectFOooOOOO2.right, rectFOooOOOO2.bottom), new PointF(rectFOooOOOO2.left, rectFOooOOOO2.bottom));
            List<AbstractC21964OooOo0> listComputeLassoTriangles = InkStrokeInfo.INSTANCE.computeLassoTriangles(listOooOO0o);
            Iterator it = arrayList2.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                hashSet = this.f111544OooOo00;
                if (!zHasNext) {
                    break;
                }
                InterfaceC31284OooO0O0 interfaceC31284OooO0O02 = (InterfaceC31284OooO0O0) it.next();
                if (interfaceC31284OooO0O02 instanceof InkStrokeInfo ? ((InkStrokeInfo) interfaceC31284OooO0O02).onLassoEventWithTriangles(listOooOO0o, listComputeLassoTriangles) : interfaceC31284OooO0O02.onLassoEvent(listOooOO0o)) {
                    hashSet.add(interfaceC31284OooO0O02);
                }
            }
            RectF rectFOooOOOO3 = OooOOOO();
            int i2 = (int) rectFOooOOOO3.left;
            int i3 = (int) rectFOooOOOO3.right;
            int i4 = (int) rectFOooOOOO3.top;
            List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(hashSet);
            float fCenterX = rectFOooOOOO2.centerX();
            float fCenterY = rectFOooOOOO2.centerY();
            RectF rectF = new RectF(fCenterX - 3000.0f, fCenterY - 3000.0f, fCenterX + 3000.0f, fCenterY + 3000.0f);
            ArrayList arrayList3 = new ArrayList();
            for (T t2 : listO0ooOO0) {
                if (rectF.contains(((InterfaceC31284OooO0O0) t2).getBoundingBox(1.0f))) {
                    arrayList3.add(t2);
                }
            }
            return new DrawResult(1, drawResultOooO.getItem(), null, null, arrayList3, false, true, new Point((i2 + i3) / 2, i4), null, false, null, 1836, null);
        }
        return drawResultOooO;
    }

    @Override // o0oo0Oo.InterfaceC31263OooOoO0
    public final RectF OooO00o() {
        return OooOOOO();
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0Oo() {
        return this.f111539OooOOo;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final Bundle OooO0o0() {
        return C22172OooOoO.OooO00o(C18437z2.f56754h, DrawToolFactory.LASSO_TYPE_RECT);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0oO() {
        return 4;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0oo() {
        return this.f111540OooOOo0;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0(o0O0oo00.OooO0O0<T> target, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
        if (z) {
            o0O0oo00.OooO00o<T> oooO00o = this.f111538OooOOOo;
            oooO00o.OooOo00(target);
            oooO00o.OooO0Oo();
            oooO00o.OooOOoo(OooOOOO());
            oooO00o.OooOOOO(1.0f);
            oooO00o.OooO0o0();
        }
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0O() {
        this.f111541OooOOoo = 0;
        this.f111544OooOo00.clear();
        this.f111543OooOo0.clear();
        new PointF(0.0f, 0.0f);
        this.f111545OooOo0O.set(0.0f, 0.0f);
        this.f111546OooOo0o.set(0.0f, 0.0f);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0o(float f) {
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOOO(List<? extends InterfaceC31284OooO0O0> list) {
        HashSet<InterfaceC31284OooO0O0> hashSet = this.f111544OooOo00;
        hashSet.clear();
        hashSet.addAll(list);
    }

    public final RectF OooOOOO() {
        PointF pointF = this.f111545OooOo0O;
        float f = pointF.x;
        PointF pointF2 = this.f111546OooOo0o;
        return new RectF(Math.min(f, pointF2.x), Math.min(pointF.y, pointF2.y), Math.max(pointF.x, pointF2.x), Math.max(pointF.y, pointF2.y));
    }
}
