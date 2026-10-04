package com.aspose.slides.internal.p071cz;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p071cz.AbstractC2878qv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.nv */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2837nv extends AbstractC2878qv {
    /* JADX INFO: renamed from: k4 */
    private C2828n2[] m12422k4(AbstractC2878qv.k4[] k4VarArr, double[] dArr) {
        C2842o2[] c2842o2Arr = (C2842o2[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C2842o2.class), k4VarArr.length));
        for (int i = 0; i < c2842o2Arr.length; i++) {
            k4VarArr[i].m12509k4().m12412k4().CloneTo(c2842o2Arr[i]);
        }
        if (k4VarArr.length > 1) {
            double dM12434dy = c2842o2Arr[0].m12434dy();
            double dM12441m9 = c2842o2Arr[0].m12441m9() / dArr[0];
            for (int i2 = 1; i2 < c2842o2Arr.length; i2++) {
                C2842o2 c2842o2Clone = c2842o2Arr[i2].Clone();
                if (c2842o2Clone.m12434dy() > dM12434dy) {
                    dM12434dy = c2842o2Clone.m12434dy();
                }
                double dM12441m92 = c2842o2Clone.m12441m9() / dArr[i2];
                if (dM12441m92 > dM12441m9) {
                    dM12441m9 = dM12441m92;
                }
            }
            for (int i3 = 0; i3 < c2842o2Arr.length; i3++) {
                C2842o2 c2842o2Clone2 = c2842o2Arr[i3].Clone();
                double dM12434dy2 = dM12434dy - c2842o2Clone2.m12434dy();
                double dM12441m93 = (dArr[i3] * dM12441m9) - c2842o2Clone2.m12441m9();
                if (k4VarArr[i3].m12511kk() == 1) {
                    double d = dM12441m93 / 2.0d;
                    double d2 = dM12434dy2 / 2.0d;
                    c2842o2Arr[i3] = new C2842o2(c2842o2Clone2.m12437k4() - d, c2842o2Clone2.m12443x1() - d2, c2842o2Clone2.m12440kk() + d, c2842o2Clone2.m12442to() + d2);
                } else if (k4VarArr[i3].m12511kk() == 2) {
                    double d3 = dM12434dy2 / 2.0d;
                    c2842o2Arr[i3] = new C2842o2(c2842o2Clone2.m12437k4() - dM12441m93, c2842o2Clone2.m12443x1() - d3, c2842o2Clone2.m12440kk(), c2842o2Clone2.m12442to() + d3);
                } else {
                    double d4 = dM12434dy2 / 2.0d;
                    c2842o2Arr[i3] = new C2842o2(c2842o2Clone2.m12437k4(), c2842o2Clone2.m12443x1() - d4, c2842o2Clone2.m12440kk() + dM12441m93, c2842o2Clone2.m12442to() + d4);
                }
            }
        }
        C2828n2[] c2828n2Arr = new C2828n2[c2842o2Arr.length];
        for (int i4 = 0; i4 < c2842o2Arr.length; i4++) {
            c2828n2Arr[i4] = new C2828n2(c2842o2Arr[i4].Clone());
        }
        return c2828n2Arr;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2878qv
    /* JADX INFO: renamed from: k4 */
    public C2857pd[] mo12234k4(List<AbstractC2878qv.k4> list) {
        C2730fk[] c2730fkArrM12502m9 = m12502m9();
        int length = c2730fkArrM12502m9.length / 2;
        List<AbstractC2878qv.k4> listM12505x1 = AbstractC2878qv.k4.m12505x1(list);
        int[] iArrM12497k4 = AbstractC2878qv.m12497k4(listM12505x1.size(), length);
        AbstractC2878qv.k4[] k4VarArr = new AbstractC2878qv.k4[length];
        double[] dArr = new double[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArrM12497k4[i2];
            AbstractC2878qv.k4[] k4VarArr2 = new AbstractC2878qv.k4[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                k4VarArr2[i4] = listM12505x1.get_Item(i);
                i++;
            }
            k4VarArr[i2] = AbstractC2878qv.k4.m12504k4(AbstractC14092to.m67204k4((Object[]) k4VarArr2));
            int i5 = i2 * 2;
            dArr[i2] = (c2730fkArrM12502m9[i5].m12274k4() + c2730fkArrM12502m9[i5 + 1].m12274k4()) / 2.0d;
        }
        C2828n2[] c2828n2ArrM12422k4 = m12422k4(k4VarArr, dArr);
        List list2 = new List();
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = i6 * 2;
            list2.addRange(AbstractC14092to.m67204k4((Object[]) m12501k4(k4VarArr[i6].m12512m9(), c2828n2ArrM12422k4[i6], c2730fkArrM12502m9[i7], c2730fkArrM12502m9[i7 + 1])));
        }
        return (C2857pd[]) list2.toArray(new C2857pd[0]);
    }
}
