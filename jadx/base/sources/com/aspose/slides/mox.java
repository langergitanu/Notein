package com.aspose.slides;

import Oooo0.C20856OooooOo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p159h0.C4489zj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class mox {

    /* JADX INFO: renamed from: k4 */
    private final C14365qy f46282k4;

    public mox(C14365qy c14365qy) {
        this.f46282k4 = c14365qy;
    }

    /* JADX INFO: renamed from: k4 */
    private float m64929k4(C14365qy c14365qy, float f, int i, boolean z) {
        float fM64124x1 = (i * f) + c14365qy.m69833e0().m64124x1();
        return z ? (f / 2.0f) + fM64124x1 : fM64124x1;
    }

    /* JADX INFO: renamed from: k4 */
    private float m64930k4(C14787xi c14787xi, double d, C0886d8 c0886d8, float f, double d2, double d3, float[] fArr) {
        float fM73399kk = ((float) (d - c14787xi.m73399kk(c0886d8.m4989k4()))) / ((float) (d2 - d3));
        fArr[0] = fM73399kk;
        float f2 = f * fM73399kk;
        fArr[0] = -fM73399kk;
        return c14787xi.m73384dy().isPlotOrderReversed() ? -f2 : f2;
    }

    /* JADX INFO: renamed from: k4 */
    public final List<ijy> m64933k4(float f) {
        float f2;
        float f3;
        double dM73430x6;
        double d;
        int i;
        float f4;
        float f5;
        mox moxVar = this;
        Class<IDisposable> cls = IDisposable.class;
        int iM69819to = C14365qy.m69819to(moxVar.f46282k4.m69865up());
        C14787xi c14787xiM69854ne = moxVar.f46282k4.m69854ne();
        C14787xi c14787xiM69863u4 = moxVar.f46282k4.m69863u4();
        boolean z = c14787xiM69854ne.m73375b3() || moxVar.f46282k4.m69834fa().hasDataTable();
        int i2 = !z ? iM69819to == 1 ? 1 : iM69819to - 1 : iM69819to;
        IRotation3D rotation3D = moxVar.f46282k4.m69834fa().getRotation3D();
        float fM64121to = moxVar.f46282k4.m69833e0().m64121to() / i2;
        float depthPercents = ((rotation3D.getDepthPercents() & 65535) / 100.0f) * moxVar.f46282k4.m69833e0().m64102dy();
        float fOooO0O0 = ((OooOO0O.OooO0O0(moxVar.f46282k4.m69834fa(), 0) & 65535) / 100.0f) * depthPercents;
        double dM73432yj = c14787xiM69863u4.m73432yj();
        int i3 = 1;
        double dM73405ks = c14787xiM69863u4.m73405ks();
        if (c14787xiM69863u4.m73384dy().isLogarithmic()) {
            f2 = fOooO0O0;
            f3 = depthPercents;
            dM73430x6 = c14787xiM69863u4.m73391k4(moxVar.f46282k4.m69863u4().m73430x6());
        } else {
            f2 = fOooO0O0;
            f3 = depthPercents;
            dM73430x6 = moxVar.f46282k4.m69863u4().m73430x6();
        }
        List<C13847mr> listM69865up = moxVar.f46282k4.m69865up();
        float f6 = f3 + f2;
        float size = f6 / (listM69865up.size() - 1);
        List<ijy> list = new List<>();
        C12003du[] c12003duArrM73773k4 = y9j.m73773k4(moxVar.f46282k4.m69834fa());
        int i4 = 0;
        while (true) {
            int i5 = iM69819to;
            if (i4 >= listM69865up.size() - 1) {
                return list;
            }
            int iOooO00o = moxVar.f46282k4.m69868wl().m73384dy().isPlotOrderReversed() ? i4 : C20856OooooOo.OooO00o(i3, i4, listM69865up);
            int i6 = 0;
            while (true) {
                d = dM73430x6;
                int i7 = i5 - 1;
                if (i6 < i7) {
                    int i8 = c14787xiM69854ne.m73384dy().isPlotOrderReversed() ? i7 - i6 : i6;
                    if (moxVar.f46282k4.m69834fa().getRotation3D().getRightAngleAxes()) {
                        f4 = i4 * size;
                        i = i6;
                        f5 = (i4 + 1) * size;
                    } else {
                        i = i6;
                        f4 = (i4 * size) - f6;
                        f5 = ((i4 + 1) * size) - f6;
                    }
                    float f7 = f5;
                    List<C13847mr> list2 = listM69865up;
                    List<ijy> list3 = list;
                    Class<IDisposable> cls2 = cls;
                    C14787xi c14787xi = c14787xiM69854ne;
                    int i9 = i4;
                    float f8 = f4;
                    double d2 = dM73432yj;
                    int i10 = iOooO00o;
                    int i11 = i8;
                    dM73430x6 = d;
                    oy7 oy7VarM64932k4 = moxVar.m64932k4(dM73430x6, z, f, fM64121to, i10, i11, f8);
                    int i12 = i11 + 1;
                    moxVar = this;
                    oy7 oy7VarM64932k42 = moxVar.m64932k4(dM73430x6, z, f, fM64121to, i10, i12, f8);
                    int i13 = i10 - 1;
                    List<ijy> list4 = list3;
                    C14787xi c14787xi2 = c14787xiM69863u4;
                    List.Enumerator<bc9> it = moxVar.m64931k4(oy7VarM64932k4, oy7VarM64932k42, moxVar.m64932k4(dM73430x6, z, f, fM64121to, i13, i11, f7), moxVar.m64932k4(dM73430x6, z, f, fM64121to, i13, i12, f7)).iterator();
                    while (it.hasNext()) {
                        try {
                            bc9 next = it.next();
                            C14787xi c14787xi3 = c14787xi2;
                            ijy ijyVar = new ijy(next, new y9j((float) d2, (float) dM73405ks, c14787xi3.f50098m9.size(), next.m4135c5(), next.m4139jd(), c12003duArrM73773k4));
                            List<ijy> list5 = list4;
                            list5.addItem(ijyVar);
                            list4 = list5;
                            c14787xi2 = c14787xi3;
                        } catch (Throwable th) {
                            if (C7019kk.m27456k4((Iterator) it, cls2)) {
                                it.dispose();
                            }
                            throw th;
                        }
                    }
                    List<ijy> list6 = list4;
                    C14787xi c14787xi4 = c14787xi2;
                    if (C7019kk.m27456k4((Iterator) it, cls2)) {
                        it.dispose();
                    }
                    cls = cls2;
                    dM73432yj = d2;
                    c14787xiM69863u4 = c14787xi4;
                    c14787xiM69854ne = c14787xi;
                    i4 = i9;
                    iOooO00o = i10;
                    list = list6;
                    i6 = i + 1;
                    listM69865up = list2;
                }
            }
            dM73430x6 = d;
            i3 = 1;
            i4++;
            cls = cls;
            dM73432yj = dM73432yj;
            c14787xiM69854ne = c14787xiM69854ne;
            list = list;
            iM69819to = i5;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private List<bc9> m64931k4(oy7 oy7Var, oy7 oy7Var2, oy7 oy7Var3, oy7 oy7Var4) {
        bc9 bc9Var;
        bc9 bc9Var2;
        bc9 bc9Var3;
        C4489zj c4489zjClone = oy7Var.m68908x1().Clone();
        C4489zj c4489zjClone2 = oy7Var2.m68908x1().Clone();
        C4489zj c4489zjClone3 = oy7Var3.m68908x1().Clone();
        C4489zj c4489zjClone4 = oy7Var4.m68908x1().Clone();
        if (C14116yg.m67504x1(c4489zjClone.m18511x1(), c4489zjClone2.m18511x1()) <= C14116yg.m67504x1(c4489zjClone3.m18511x1(), c4489zjClone4.m18511x1())) {
            if (c4489zjClone.m18511x1() <= c4489zjClone2.m18511x1()) {
                bc9Var = new bc9(oy7Var4, oy7Var, oy7Var2);
                bc9Var3 = new bc9(oy7Var, oy7Var4, oy7Var3);
            } else {
                bc9Var = new bc9(oy7Var3, oy7Var, oy7Var2);
                bc9Var2 = new bc9(oy7Var2, oy7Var4, oy7Var3);
                bc9Var3 = bc9Var2;
            }
        } else if (c4489zjClone3.m18511x1() >= c4489zjClone4.m18511x1()) {
            bc9Var = new bc9(oy7Var, oy7Var2, oy7Var4);
            bc9Var3 = new bc9(oy7Var, oy7Var4, oy7Var3);
        } else {
            bc9Var = new bc9(oy7Var3, oy7Var, oy7Var2);
            bc9Var2 = new bc9(oy7Var2, oy7Var4, oy7Var3);
            bc9Var3 = bc9Var2;
        }
        List<bc9> list = new List<>();
        list.addItem(bc9Var);
        list.addItem(bc9Var3);
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private oy7 m64932k4(double d, boolean z, float f, float f2, int i, int i2, float f3) {
        float f4;
        List<C13847mr> listM69865up = this.f46282k4.m69865up();
        if (i >= listM69865up.size()) {
            throw new ArgumentOutOfRangeException("seriesIndex");
        }
        C13847mr c13847mr = listM69865up.get_Item(i);
        float fM64930k4 = 0.0f;
        if (i2 < c13847mr.m64944dy().size()) {
            C0886d8 c0886d8 = c13847mr.m64944dy().get_Item(i2);
            C14787xi c14787xiM69863u4 = this.f46282k4.m69863u4();
            float[] fArr = {0.0f};
            fM64930k4 = m64930k4(c14787xiM69863u4, d, c0886d8, this.f46282k4.m69833e0().m64100du(), c14787xiM69863u4.m73432yj(), c14787xiM69863u4.m73405ks(), fArr);
            f4 = fArr[0];
        } else {
            f4 = 0.0f;
        }
        return new oy7(new C4489zj(m64929k4(this.f46282k4, f2, i2, z), f + fM64930k4, f3).Clone(), f4);
    }
}
