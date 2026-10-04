package com.aspose.slides.internal.p071cz;

import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p071cz.AbstractC2878qv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.fu */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2732fu extends AbstractC2878qv {
    /* JADX INFO: renamed from: k4 */
    private double m12279k4(IGenericList<AbstractC2878qv.k4> iGenericList, C2730fk[] c2730fkArr, int[] iArr) {
        double d = 1.0d;
        int i = 0;
        for (int i2 = 0; i2 < c2730fkArr.length; i2++) {
            C2730fk c2730fk = c2730fkArr[i2];
            int i3 = iArr[i2];
            for (int i4 = 0; i4 < i3; i4++) {
                double dM12274k4 = c2730fk.m12274k4() / iGenericList.get_Item(i).m12513to();
                if (dM12274k4 < d) {
                    d = dM12274k4;
                }
                i++;
            }
        }
        return d;
    }

    /* JADX INFO: renamed from: k4 */
    private void m12280k4(List<AbstractC2878qv.k4> list, double d) {
        C2865q1 c2865q1Clone = AbstractC2878qv.k4.m12504k4(list).m12514x1().m12432c5().Clone();
        List.Enumerator<AbstractC2878qv.k4> it = list.iterator();
        while (it.hasNext()) {
            try {
                it.next().m12510k4(c2865q1Clone.Clone(), d);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    @Override // com.aspose.slides.internal.p071cz.AbstractC2878qv
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2857pd[] mo12234k4(List<AbstractC2878qv.k4> list) {
        double dM12506du;
        int i;
        C2730fk[] c2730fkArr;
        double dM12506du2;
        double d;
        List<AbstractC2878qv.k4> list2 = list;
        C2730fk[] c2730fkArrM12502m9 = m12502m9();
        int[] iArrM12497k4 = AbstractC2878qv.m12497k4(list2.size(), c2730fkArrM12502m9.length);
        double dM12279k4 = m12279k4(list2, c2730fkArrM12502m9, iArrM12497k4);
        if (dM12279k4 < 1.0d) {
            m12280k4(list2, dM12279k4);
        }
        List list3 = new List();
        int i2 = 0;
        int i3 = 0;
        while (i2 < c2730fkArrM12502m9.length) {
            C2730fk c2730fk = c2730fkArrM12502m9[i2];
            int i4 = iArrM12497k4[i2];
            double dM12508h4 = 0.0d;
            double dM12506du3 = 0.0d;
            for (int i5 = 0; i5 < i4; i5++) {
                AbstractC2878qv.k4 k4Var = list2.get_Item(i3 + i5);
                if (k4Var.m12508h4() > dM12508h4) {
                    dM12508h4 = k4Var.m12508h4();
                }
                if (k4Var.m12506du() > dM12506du3) {
                    dM12506du3 = k4Var.m12506du();
                }
            }
            if (c2730fkArrM12502m9.length == 1 && i4 > 1 && mo12120k4() == 10) {
                dM12506du = dM12506du3;
            } else {
                dM12506du = 0.0d;
                for (int i6 = 0; i6 < i4; i6++) {
                    AbstractC2878qv.k4 k4Var2 = list2.get_Item(i3 + i6);
                    dM12506du += k4Var2.m12506du();
                    if (k4Var2.m12506du() == 0.0d) {
                        dM12506du += dM12506du3;
                    }
                }
            }
            int i7 = 2;
            if (i2 != 2) {
                d = (i2 == 1 && i4 > 1) ? 0.75d : -1.0d;
                i = 0;
                while (i < i4) {
                    AbstractC2878qv.k4 k4Var3 = list2.get_Item(i3);
                    if (k4Var3.m12506du() == 0.0d) {
                        c2730fkArr = c2730fkArrM12502m9;
                        dM12506du2 = dM12506du3;
                    } else {
                        c2730fkArr = c2730fkArrM12502m9;
                        dM12506du2 = k4Var3.m12506du();
                    }
                    if (i2 != i7) {
                        dM12506du2 = -dM12506du2;
                    }
                    double d2 = dM12506du + dM12506du2;
                    list3.addRange(AbstractC14092to.m67204k4((Object[]) m12281k4(k4Var3, c2730fk.m12275k4(d2), dM12508h4)));
                    i3++;
                    i++;
                    dM12506du = d2;
                    c2730fkArrM12502m9 = c2730fkArr;
                    i7 = 2;
                    list2 = list;
                }
                i2++;
                list2 = list;
            }
            dM12506du *= d;
            i = 0;
            while (i < i4) {
            }
            i2++;
            list2 = list;
        }
        return (C2857pd[]) list3.toArray(new C2857pd[0]);
    }

    /* JADX INFO: renamed from: k4 */
    private C2857pd[] m12281k4(AbstractC2878qv.k4 k4Var, C2730fk c2730fk, double d) {
        List list = new List();
        double d2 = 2.0d;
        double dM12274k4 = k4Var.m12511kk() == 1 ? (c2730fk.m12274k4() - k4Var.m12513to()) / 2.0d : k4Var.m12511kk() == 2 ? c2730fk.m12274k4() - k4Var.m12513to() : 0.0d;
        C2968xo c2968xo = new C2968xo(m12498h4().m12516k4().m12210k4(), m12498h4().m12516k4().m12212x1());
        C2985yu[] c2985yuArrM12512m9 = k4Var.m12512m9();
        int length = c2985yuArrM12512m9.length;
        int i = 0;
        while (i < length) {
            C2985yu c2985yu = c2985yuArrM12512m9[i];
            c2730fk.m12274k4();
            double dM12441m9 = ((c2985yu.m12641x1().m12441m9() / d2) + dM12274k4) / c2730fk.m12274k4();
            C2865q1 c2865q1Clone = c2730fk.m12278x1(dM12441m9).Clone();
            C2968xo c2968xoClone = c2730fk.m12276k4(dM12441m9, 1.0d, true).Clone();
            C2968xo c2968xoClone2 = C2968xo.m12602x1(c2968xoClone.m12604du()).Clone();
            C2968xo.m12598k4(c2865q1Clone, c2968xo).CloneTo(c2865q1Clone);
            C2977y9[] c2977y9ArrM12286x1 = c2985yu.m12640to().m12463x1().m12286x1();
            double d3 = d2;
            int i2 = 0;
            while (i2 < c2977y9ArrM12286x1.length) {
                C2977y9 c2977y9 = c2977y9ArrM12286x1[i2];
                int i3 = i;
                double d4 = dM12274k4;
                C2865q1 c2865q1 = new C2865q1((c2985yu.m12641x1().m12441m9() / d3) + c2985yu.m12641x1().m12437k4(), C21825OoooOO0.OooO00o(d, 127.0d, 0.5d, c2985yu.m12641x1().m12442to()));
                int i4 = 0;
                while (i4 < c2977y9.m12626k4()) {
                    C2968xo c2968xoClone3 = C2865q1.m12475k4(c2865q1, c2977y9.m12627k4(i4)).Clone();
                    c2977y9.m12628k4(i4, C2968xo.m12598k4(c2865q1Clone, C2968xo.m12600k4(C2968xo.m12599k4(c2968xoClone2, c2968xoClone3.m12606k4()), C2968xo.m12599k4(c2968xoClone, c2968xoClone3.m12611x1())).Clone()).Clone());
                    i4++;
                    c2968xo = c2968xo;
                    c2865q1 = c2865q1;
                }
                i2++;
                dM12274k4 = d4;
                i = i3;
            }
            list.addItem(c2985yu.m12640to());
            dM12274k4 = c2985yu.m12641x1().m12441m9() + dM12274k4;
            i++;
            d2 = d3;
        }
        return (C2857pd[]) list.toArray(new C2857pd[0]);
    }
}
