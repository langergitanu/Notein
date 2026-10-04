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
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.InkStrokeInfo;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import o0O0oo00.OooO00o;
import o0OOo0o.o0000O;
import o0Oo0ooO.C28460OooooO0;
import o0oo0o.InterfaceC31284OooO0O0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0oo0Oo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31249OooOO0o<T> extends AbstractC31239OooO00o<T> implements InterfaceC31263OooOoO0 {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final int f111506OooOoOO = C28460OooooO0.OooO0O0(3);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final List<String> f111507OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final float f111508OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final o0O0oo00.OooO00o<T> f111509OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final int f111510OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final LinkedHashSet<InterfaceC31284OooO0O0> f111511OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final PointF f111512OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f111513OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public ArrayList<PointF> f111514OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final RectF f111515OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final List<Integer> f111516OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final LinkedHashSet<InterfaceC31284OooO0O0> f111517OooOoO0;

    public C31249OooOO0o() {
        throw null;
    }

    public C31249OooOO0o(List list, o0O0oo00.OooO00o oooO00o) {
        int color = Color.parseColor("#007AFF");
        float fOooO00o = C28460OooooO0.OooO00o(1.5f);
        this.f111507OooOOOo = list;
        this.f111509OooOOo0 = oooO00o;
        this.f111508OooOOo = fOooO00o;
        this.f111510OooOOoo = color;
        this.f111512OooOo0 = new PointF();
        new PointF();
        new PointF();
        this.f111514OooOo0O = new ArrayList<>();
        this.f111515OooOo0o = new RectF();
        this.f111511OooOo = new LinkedHashSet<>();
        this.f111517OooOoO0 = new LinkedHashSet<>();
        this.f111516OooOoO = C21081o00000o0.OooO0oO(list);
        OooO00o.C19734OooO00o.OooO00o(oooO00o, color, fOooO00o, 0, -1, false, 16);
        oooO00o.OooO0oo(new float[]{C28460OooooO0.OooO00o(4.0f), C28460OooooO0.OooO00o(4.0f)});
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> displayItems) {
        List<AbstractC21964OooOo0> listComputeLassoTriangles;
        LinkedHashSet<InterfaceC31284OooO0O0> linkedHashSet;
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItems, "displayItems");
        DrawResult drawResultOooO = super.OooO(f, f2, f3, i, displayItems);
        if (i == 0) {
            this.f111513OooOo00 = 1;
            OooOOOO(f, f2);
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        RectF rectF = this.f111515OooOo0o;
        o0O0oo00.OooO00o<T> oooO00o = this.f111509OooOOo0;
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    this.f111513OooOo00 = 0;
                    return drawResultOooO;
                }
            } else if (this.f111513OooOo00 == 1) {
                this.f111514OooOo0O.add(new PointF(f, f2));
                o00OO0O0.OooO0O0.OooO0o0(rectF, f, f2, 0.0f);
                oooO00o.lineTo(f, f2);
                return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
            }
        } else if (this.f111513OooOo00 == 1) {
            this.f111513OooOo00 = 0;
            float f4 = rectF.right - rectF.left;
            float f5 = f111506OooOoOO;
            if (f4 <= f5 && rectF.bottom - rectF.top <= f5) {
                this.f111514OooOo0O = new ArrayList<>();
                oooO00o.reset();
                return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
            }
            this.f111514OooOo0O.add(new PointF(f, f2));
            oooO00o.lineTo(f, f2);
            PointF pointF = this.f111512OooOo0;
            oooO00o.lineTo(pointF.x, pointF.y);
            ArrayList arrayList = new ArrayList();
            for (T t : displayItems) {
                if (this.f111516OooOoO.contains(Integer.valueOf(((InterfaceC31284OooO0O0) t).getItemType()))) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj;
                if (!(interfaceC31284OooO0O0 instanceof DrawRecord) || !((DrawRecord) interfaceC31284OooO0O0).isConvertedFromShape()) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (((InterfaceC31284OooO0O0) obj2).getBoundingBox(1.0f).intersects(rectF.left, rectF.top, rectF.right, rectF.bottom)) {
                    arrayList3.add(obj2);
                }
            }
            if (arrayList3.isEmpty()) {
                listComputeLassoTriangles = C34434OooOoO.f123453OooOo0o;
            } else {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC31284OooO0O0) it.next()) instanceof InkStrokeInfo) {
                        listComputeLassoTriangles = InkStrokeInfo.INSTANCE.computeLassoTriangles(this.f111514OooOo0O);
                        break;
                    }
                }
                listComputeLassoTriangles = C34434OooOoO.f123453OooOo0o;
            }
            Iterator it2 = arrayList3.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                linkedHashSet = this.f111511OooOo;
                if (!zHasNext) {
                    break;
                }
                InterfaceC31284OooO0O0 interfaceC31284OooO0O02 = (InterfaceC31284OooO0O0) it2.next();
                if (interfaceC31284OooO0O02 instanceof InkStrokeInfo ? ((InkStrokeInfo) interfaceC31284OooO0O02).onLassoEventWithTriangles(this.f111514OooOo0O, listComputeLassoTriangles) : interfaceC31284OooO0O02.onLassoEvent(this.f111514OooOo0O)) {
                    linkedHashSet.add(interfaceC31284OooO0O02);
                }
            }
            Iterator<PointF> it3 = this.f111514OooOo0O.iterator();
            if (!it3.hasNext()) {
                throw new NoSuchElementException();
            }
            float fMin = it3.next().x;
            while (it3.hasNext()) {
                fMin = Math.min(fMin, it3.next().x);
            }
            int i2 = (int) fMin;
            Iterator<PointF> it4 = this.f111514OooOo0O.iterator();
            if (!it4.hasNext()) {
                throw new NoSuchElementException();
            }
            float fMax = it4.next().x;
            while (it4.hasNext()) {
                fMax = Math.max(fMax, it4.next().x);
            }
            int i3 = (int) fMax;
            Iterator<PointF> it5 = this.f111514OooOo0O.iterator();
            if (!it5.hasNext()) {
                throw new NoSuchElementException();
            }
            float fMin2 = it5.next().y;
            while (it5.hasNext()) {
                fMin2 = Math.min(fMin2, it5.next().y);
            }
            int i4 = (int) fMin2;
            List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(linkedHashSet);
            float fCenterX = rectF.centerX();
            float fCenterY = rectF.centerY();
            RectF rectF2 = new RectF(fCenterX - 3000.0f, fCenterY - 3000.0f, fCenterX + 3000.0f, fCenterY + 3000.0f);
            ArrayList arrayList4 = new ArrayList();
            for (T t2 : listO0ooOO0) {
                if (rectF2.contains(((InterfaceC31284OooO0O0) t2).getBoundingBox(1.0f))) {
                    arrayList4.add(t2);
                }
            }
            return new DrawResult(1, drawResultOooO.getItem(), null, null, arrayList4, false, true, new Point((i2 + i3) / 2, i4), null, false, null, 1836, null);
        }
        return drawResultOooO;
    }

    @Override // o0oo0Oo.InterfaceC31263OooOoO0
    public final RectF OooO00o() {
        return new RectF(this.f111515OooOo0o);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0Oo() {
        return this.f111510OooOOoo;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final Bundle OooO0o0() {
        Bundle bundleOooO00o = C22172OooOoO.OooO00o(C18437z2.f56754h, DrawToolFactory.LASSO_TYPE_FREE);
        bundleOooO00o.putString("filter", oOo000Oo.OooOo.o000oOoO(this.f111507OooOOOo, ",", null, null, new o0000O(1), 30));
        return bundleOooO00o;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0oO() {
        return 4;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0oo() {
        return this.f111508OooOOo;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0(o0O0oo00.OooO0O0<T> target, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
        if (z) {
            o0O0oo00.OooO00o<T> oooO00o = this.f111509OooOOo0;
            oooO00o.OooOo00(target);
            oooO00o.OooO0Oo();
            oooO00o.OooOOOO(1.0f);
            oooO00o.OooO0o0();
        }
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0O() {
        this.f111513OooOo00 = 0;
        OooOOOO(0.0f, 0.0f);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0o(float f) {
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOOO(List<? extends InterfaceC31284OooO0O0> list) {
        LinkedHashSet<InterfaceC31284OooO0O0> linkedHashSet = this.f111511OooOo;
        linkedHashSet.clear();
        linkedHashSet.addAll(list);
    }

    public final void OooOOOO(float f, float f2) {
        this.f111514OooOo0O = new ArrayList<>();
        this.f111511OooOo.clear();
        this.f111517OooOoO0.clear();
        o0O0oo00.OooO00o<T> oooO00o = this.f111509OooOOo0;
        oooO00o.reset();
        this.f111514OooOo0O.add(new PointF(f, f2));
        this.f111515OooOo0o.set(f, f2, f, f2);
        this.f111512OooOo0.set(f, f2);
        new PointF(0.0f, 0.0f);
        new PointF(0.0f, 0.0f);
        oooO00o.moveTo(f, f2);
    }
}
