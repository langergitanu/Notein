package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p431ty.C11241kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class jk9 extends eca {

    /* JADX INFO: renamed from: du */
    private final klm[] f45508du;

    /* JADX INFO: renamed from: h4 */
    private final eh0[] f45509h4;

    /* JADX INFO: renamed from: kk */
    private int f45510kk;

    /* JADX INFO: renamed from: to */
    private final bfq[] f45511to;

    /* JADX INFO: renamed from: com.aspose.slides.jk9$k4 */
    public static class C13690k4 implements Comparator<bfq> {

        /* JADX INFO: renamed from: k4 */
        private final double f45512k4;

        public C13690k4(double d) {
            this.f45512k4 = d;
        }

        /* JADX INFO: renamed from: k4 */
        private double m63386k4(bfq bfqVar) {
            if (C14044b3.m66437kk(this.f45512k4)) {
                return bfqVar.m4197to().m5538yj();
            }
            double dM5538yj = this.f45512k4 - bfqVar.m4197to().m5538yj();
            if (dM5538yj > 180.0d) {
                dM5538yj -= 360.0d;
            }
            if (dM5538yj < -180.0d) {
                dM5538yj += 360.0d;
            }
            return -dM5538yj;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public final int compare(bfq bfqVar, bfq bfqVar2) {
            double dM63386k4 = m63386k4(bfqVar);
            double dM63386k42 = m63386k4(bfqVar2);
            if (dM63386k4 > dM63386k42) {
                return 1;
            }
            return dM63386k4 < dM63386k42 ? -1 : 0;
        }
    }

    public jk9(double d, ChartSeries chartSeries, C0886d8[] c0886d8Arr) {
        double dM5402k4 = eca.m5402k4(AbstractC14092to.m67204k4((Object[]) c0886d8Arr));
        if (dM5402k4 > 0.0d) {
            this.f45509h4 = new eh0[c0886d8Arr.length];
            double[] dArr = {0.0d};
            double[] dArr2 = {0.0d};
            m5411k4(AbstractC14092to.m67204k4((Object[]) c0886d8Arr), dArr, dArr2);
            double d2 = dArr[0];
            double d3 = dArr2[0];
            double d4 = d;
            boolean z = true;
            int iM67507x1 = -1;
            int i = 0;
            while (i < c0886d8Arr.length) {
                if (c0886d8Arr[i].m4988jd() == null || c0886d8Arr[i].m4988jd().getExplosion() == -1) {
                    z = false;
                } else {
                    iM67507x1 = C14116yg.m67507x1(c0886d8Arr[i].m4988jd().getExplosion(), iM67507x1);
                }
                int i2 = iM67507x1;
                C0886d8 c0886d8 = c0886d8Arr[i];
                double dM67475k4 = C14116yg.m67475k4(c0886d8.m4989k4()) / dM5402k4;
                double dM54224k4 = (dM67475k4 >= 1.0E-9d || !c0886d8.m4983dy()) ? C11241kk.m54224k4(360.0d * dM67475k4, d2, d3) : 0.0d;
                this.f45509h4[i] = new eh0(c0886d8, d4, dM54224k4, dM67475k4, c0886d8.m4989k4());
                d4 += dM54224k4;
                i++;
                iM67507x1 = i2;
            }
            this.f45510kk = z ? iM67507x1 : C14116yg.m67483k4(iM67507x1, chartSeries.getExplosion());
            m5412k4(chartSeries.getNumberFormatOfValues());
            m5415x1(dM5402k4);
            List list = new List();
            List list2 = new List();
            for (int i3 = 0; i3 < c0886d8Arr.length; i3++) {
                C0886d8 c0886d82 = c0886d8Arr[i3];
                eh0 eh0Var = this.f45509h4[i3];
                if (c0886d82.m5003ks() != null && c0886d82.m5003ks().m4569up() && eca.m5403k4(eh0Var, c0886d82)) {
                    list.addItem(new bfq(eh0Var, c0886d82));
                    if (c0886d82.m5003ks().m4570x1().getDataLabelFormat().getShowLeaderLines() || c0886d82.m5012up().m64945h4().getLabels().getDefaultDataLabelFormat().getShowLeaderLines()) {
                        list2.addItem(new klm(c0886d82));
                    }
                }
            }
            this.f45511to = (bfq[]) list.toArray(new bfq[0]);
            this.f45508du = (klm[]) list2.toArray(new klm[0]);
        } else {
            this.f45511to = new bfq[0];
            this.f45509h4 = new eh0[0];
            this.f45508du = new klm[0];
        }
        for (eh0 eh0Var2 : this.f45509h4) {
            m73215k4(eh0Var2);
        }
        for (klm klmVar : this.f45508du) {
            m73215k4(klmVar);
        }
        for (bfq bfqVar : this.f45511to) {
            m73215k4(bfqVar);
        }
    }

    /* JADX INFO: renamed from: c5 */
    private void m63372c5() {
        int i = 0;
        while (true) {
            klm[] klmVarArr = this.f45508du;
            if (i >= klmVarArr.length) {
                return;
            }
            klm klmVar = klmVarArr[i];
            if (klmVar.m63976to()) {
                bfq bfqVar = this.f45511to[i];
                eh0 eh0VarM4197to = bfqVar.m4197to();
                C12025x6[] c12025x6Arr = {eh0VarM4197to.m5536x1(eh0VarM4197to.m5525ck() + 0.5d)};
                C12025x6 c12025x6 = new C12025x6();
                C12025x6 c12025x62 = new C12025x6();
                C12025x6[] c12025x6Arr2 = {c12025x6};
                C12025x6[] c12025x6Arr3 = {c12025x62};
                boolean zM63974k4 = klmVar.m63974k4(bfqVar.m73209e0().Clone(), c12025x6Arr, bfqVar.m4196qq(), true, c12025x6Arr2, c12025x6Arr3);
                c12025x6Arr2[0].CloneTo(c12025x6);
                c12025x6Arr3[0].CloneTo(c12025x62);
                if (zM63974k4) {
                    klmVar.m63972k4(!C14873z5.m74328k4(c12025x6.Clone(), c12025x62.Clone(), eh0VarM4197to.m73223ts().Clone(), eh0VarM4197to.m5525ck()));
                } else {
                    klmVar.m63972k4(false);
                }
            }
            klmVar.m73220ss();
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static List<List<bfq>> m63373k4(List<bfq> list) {
        List.Enumerator it;
        List<List<bfq>> list2 = new List<>();
        List list3 = new List();
        List.Enumerator<bfq> it2 = list.iterator();
        while (true) {
            try {
                if (!it2.hasNext()) {
                    break;
                }
                bfq next = it2.next();
                List list4 = new List();
                if (next.m67963ck().m5003ks().m4570x1().getDataLabelFormat().getShowLeaderLines() || next.m67963ck().m5003ks().m4570x1().getDataLabelFormat().getFormat().getFill().getFillType() == 1) {
                    list4.addItem(next.m67971ks());
                } else {
                    C12007ix[] c12007ixArrM67975up = next.m67975up();
                    for (int i = 0; i < c12007ixArrM67975up.length; i++) {
                        jjy jjyVar = new jjy(c12007ixArrM67975up[i].Clone());
                        jjyVar.m63354k4(new C12025x6(next.m73223ts().m56897x1(), (c12007ixArrM67975up[i].m56575x1() / 2.0f) + (c12007ixArrM67975up[i].m56575x1() * i) + next.m73206c6()));
                        list4.addItem(jjyVar);
                    }
                }
                int size = -1;
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    it = list4.iterator();
                    while (true) {
                        try {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((jjy) it.next()).m63355k4((IGenericEnumerable<jjy>) list3.get_Item(i2), next.m67963ck().m5003ks().m4557ck() * 0.125f)) {
                                size = i2;
                                break;
                            }
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
                if (size == -1) {
                    size = list2.size();
                    list2.addItem(new List<>());
                    list3.addItem(new List());
                }
                list2.get_Item(size).addItem(next);
                it = list4.iterator();
                while (it.hasNext()) {
                    try {
                        ((List) list3.get_Item(size)).addItem((jjy) it.next());
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        for (int i3 = 0; i3 < list2.size(); i3++) {
            List<bfq> list5 = list2.get_Item(i3);
            if (list5.size() > 1) {
                list5.sort(new C13690k4(Double.NaN));
                double dM5538yj = list5.get_Item(0).m4197to().m5538yj() - ((bfq) OooO0O0.OooO00o(list5, 1)).m4197to().m5538yj();
                double d = dM5538yj < 0.0d ? dM5538yj + 360.0d : 0.0d;
                double dM5538yj2 = list5.get_Item(0).m4197to().m5538yj();
                double dM5538yj3 = (d / 2.0d) + ((bfq) OooO0O0.OooO00o(list5, 1)).m4197to().m5538yj();
                int i4 = 1;
                while (i4 < list5.size()) {
                    double dM5538yj4 = list5.get_Item(i4).m4197to().m5538yj() % 360.0d;
                    double d2 = dM5538yj4 - dM5538yj2;
                    if (d2 > d) {
                        dM5538yj3 = (d2 / 2.0d) + dM5538yj2;
                        d = d2;
                    }
                    i4++;
                    dM5538yj2 = dM5538yj4;
                }
                list5.sort(new C13690k4((dM5538yj3 + 180.0d) % 360.0d));
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: kk */
    private mxy m63383kk(mxy mxyVar) {
        if (mxyVar == null) {
            throw new ArgumentNullException("area");
        }
        float fM72555k4 = mxyVar.m72555k4() / 2.0f;
        int i = this.f45510kk;
        if (i > 0) {
            fM72555k4 /= (i / 100.0f) + 1.0f;
        }
        float f = fM72555k4 * 2.0f;
        return mxyVar.m67813k4(f, f);
    }

    /* JADX INFO: renamed from: to */
    public final eh0[] m63385to() {
        return this.f45509h4;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.mo5524U_();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m63384x1(mxy mxyVar) {
        C12025x6 c12025x6M5536x1;
        List list = new List();
        C12007ix c12007ix = new C12007ix(-mxyVar.m67814to(), -mxyVar.m67811du(), m73218lr().m73225wy(), m73218lr().m73203ak());
        int i = 0;
        while (true) {
            bfq[] bfqVarArr = this.f45511to;
            if (i >= bfqVarArr.length) {
                m63376k4((List<bfq>) list, c12007ix.Clone());
                return;
            }
            bfq bfqVar = bfqVarArr[i];
            eh0 eh0VarM4197to = bfqVar.m4197to();
            C12025x6 c12025x6 = new C12025x6();
            int iMo4194dy = bfqVar.mo4194dy();
            if (iMo4194dy == 2) {
                c12025x6M5536x1 = eh0VarM4197to.m5536x1(eh0VarM4197to.m5525ck() * 0.5d);
            } else if (iMo4194dy != 4) {
                if (iMo4194dy != 6) {
                    C12025x6[] c12025x6Arr = {c12025x6};
                    boolean zM63380k4 = m63380k4(bfqVar, c12025x6Arr, c12007ix.Clone());
                    c12025x6Arr[0].CloneTo(c12025x6);
                    if (!zM63380k4) {
                        list.addItem(bfqVar);
                        klm[] klmVarArr = this.f45508du;
                        if (i < klmVarArr.length) {
                            klmVarArr[i].m63972k4(true);
                        }
                    }
                } else {
                    eh0VarM4197to.m5537x1(bfqVar.m73209e0().m56570m9().Clone(), ((double) ((float) eh0VarM4197to.m5525ck())) * 1.04d).CloneTo(c12025x6);
                    list.addItem(bfqVar);
                    bfqVar.m4195kk(true);
                }
                C12025x6 c12025x6Clone = bfqVar.m67967k4(c12025x6.Clone(), c12007ix.Clone()).Clone();
                bfqVar.m73208du(c12025x6Clone.m56897x1());
                bfqVar.m73212h4(c12025x6Clone.m56895kk());
                bfqVar.m73220ss();
                if (i >= this.f45508du.length && (bfqVar.m67962c5() != 0.0f || bfqVar.m67966jd() != 0.0f)) {
                    this.f45508du[i].m63972k4(true);
                    bfqVar.m4195kk(true);
                }
                eh0VarM4197to.m5536x1(eh0VarM4197to.m5525ck()).CloneTo(c12025x6);
                bfqVar.m67969k4(new C12025x6(c12025x6.m56897x1() - bfqVar.m73205bz(), c12025x6.m56895kk() - bfqVar.m73219qm()));
                i++;
            } else {
                c12025x6M5536x1 = eh0VarM4197to.m5529k4(bfqVar.m73209e0().m56570m9().Clone(), ((double) ((float) eh0VarM4197to.m5525ck())) * 0.96d);
            }
            c12025x6M5536x1.CloneTo(c12025x6);
            C12025x6 c12025x6Clone2 = bfqVar.m67967k4(c12025x6.Clone(), c12007ix.Clone()).Clone();
            bfqVar.m73208du(c12025x6Clone2.m56897x1());
            bfqVar.m73212h4(c12025x6Clone2.m56895kk());
            bfqVar.m73220ss();
            if (i >= this.f45508du.length) {
            }
            eh0VarM4197to.m5536x1(eh0VarM4197to.m5525ck()).CloneTo(c12025x6);
            bfqVar.m67969k4(new C12025x6(c12025x6.m56897x1() - bfqVar.m73205bz(), c12025x6.m56895kk() - bfqVar.m73219qm()));
            i++;
        }
    }

    @Override // com.aspose.slides.eca
    /* JADX INFO: renamed from: kk */
    public cdv[] mo5413kk() {
        return this.f45509h4;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        mxy mxyVar = (mxy) c14713vw;
        m63379k4(mxyVar);
        m63384x1(mxyVar);
        m63372c5();
    }

    /* JADX INFO: renamed from: k4 */
    private static C12025x6 m63374k4(bfq bfqVar, jjy jjyVar, eh0 eh0Var, jjy jjyVar2) {
        C12025x6 c12025x6Clone = C12025x6.f40591k4.Clone();
        C12025x6 c12025x6Clone2 = eh0Var.m73223ts().Clone();
        C12025x6 c12025x6Clone3 = C14873z5.m74319k4(eh0Var.m5538yj(), eh0Var.m5525ck(), c12025x6Clone2.Clone()).Clone();
        jjy jjyVarM67974rv = bfqVar.m67974rv();
        jjyVarM67974rv.m63354k4(new C12025x6(c12025x6Clone3.m56897x1(), (jjyVarM67974rv.m63358kk() / 2.0f) + c12025x6Clone3.m56895kk()));
        double d = 0.98f;
        if (!m63382k4(jjyVarM67974rv, eh0Var.m73223ts().Clone(), eh0Var.m5525ck() * d)) {
            return jjyVarM67974rv.m63352du();
        }
        jjyVarM67974rv.m63354k4(new C12025x6(c12025x6Clone3.m56897x1() - (jjyVarM67974rv.m63360x1() / 2.0f), c12025x6Clone3.m56895kk()));
        if (!m63382k4(jjyVarM67974rv, eh0Var.m73223ts().Clone(), eh0Var.m5525ck() * d)) {
            return jjyVarM67974rv.m63352du();
        }
        jjyVarM67974rv.m63354k4(new C12025x6(c12025x6Clone3.m56897x1(), c12025x6Clone3.m56895kk() - (jjyVarM67974rv.m63358kk() / 2.0f)));
        if (!m63382k4(jjyVarM67974rv, eh0Var.m73223ts().Clone(), eh0Var.m5525ck() * d)) {
            return jjyVarM67974rv.m63352du();
        }
        jjyVarM67974rv.m63354k4(new C12025x6((jjyVarM67974rv.m63360x1() / 2.0f) + c12025x6Clone3.m56897x1(), c12025x6Clone3.m56895kk()));
        if (!m63382k4(jjyVarM67974rv, eh0Var.m73223ts().Clone(), eh0Var.m5525ck() * d)) {
            return jjyVarM67974rv.m63352du();
        }
        C12015qq c12015qq = new C12015qq(jjyVar.m63360x1(), jjyVar.m63358kk());
        jjyVar.m63354k4(c12025x6Clone3.Clone());
        for (double d2 = bfqVar.m67972m9() ? 1.02d : 1.04d; d2 < 1.5d; d2 += 0.01d) {
            m63375k4(c12025x6Clone2.Clone(), eh0Var.m5538yj(), eh0Var.m5525ck() * d2, c12015qq.Clone()).CloneTo(c12025x6Clone);
            jjyVar.m63354k4(c12025x6Clone.Clone());
            if (jjyVar.m63362x1(jjyVar2)) {
                return c12025x6Clone;
            }
        }
        return c12025x6Clone;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12025x6 m63375k4(C12025x6 c12025x6, double d, double d2, C12015qq c12015qq) {
        C12025x6 c12025x6Clone = C14873z5.m74319k4(d, d2, c12025x6.Clone()).Clone();
        double d3 = d * 0.017453292519943295d;
        double dM67470dy = C14116yg.m67470dy(d3);
        double dM67495m9 = C14116yg.m67495m9(d3);
        return C14873z5.m74322k4(c12025x6Clone.Clone(), (float) ((dM67470dy * ((double) c12015qq.m56699x1())) / 2.0d), (float) ((dM67495m9 * ((double) c12015qq.m56697kk())) / 2.0d));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63376k4(List<bfq> list, C12007ix c12007ix) {
        if (list.size() > 0) {
            List<List<bfq>> listM63373k4 = m63373k4(list);
            int i = 0;
            while (listM63373k4.size() != list.size() && i < 50) {
                List.Enumerator<List<bfq>> it = listM63373k4.iterator();
                while (it.hasNext()) {
                    try {
                        m63378k4(c12007ix.Clone(), it.next());
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                i++;
                listM63373k4 = m63373k4(list);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e2  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m63377k4(bfq bfqVar, List<bfq> list, C12007ix c12007ix, int i) {
        if (list.size() != 1 || m63382k4(bfqVar.m67971ks(), bfqVar.m4197to().m73223ts().Clone(), bfqVar.m4197to().m5525ck())) {
            double dM4557ck = bfqVar.m67963ck().m5003ks().m4557ck() / 4.0f;
            double dM4557ck2 = bfqVar.m67963ck().m5003ks().m4557ck() / 4.0f;
            double dM4192ar = bfqVar.m4192ar() + dM4557ck;
            double dM67471fa = i == 0 ? 0.0d : (C14116yg.m67471fa(dM4557ck2 / dM4192ar) * 180.0d) / 3.141592653589793d;
            double dM4199um = bfqVar.m4199um();
            double d = (i == -1 ? dM4199um - dM67471fa : dM4199um + dM67471fa) % 360.0d;
            C12025x6 c12025x6Clone = C14873z5.m74319k4(d, dM4192ar, bfqVar.m4197to().m73223ts().Clone()).Clone();
            C12025x6 c12025x6 = new C12025x6(c12025x6Clone.m56897x1() - (bfqVar.m73225wy() / 2.0f), c12025x6Clone.m56895kk() - (bfqVar.m73203ak() / 2.0f));
            if (c12025x6.m56897x1() < c12007ix.m56557jd() || c12025x6.m56895kk() < c12007ix.m56551ck()) {
                C14873z5.m74319k4(d, bfqVar.m4192ar(), bfqVar.m4197to().m73223ts().Clone()).CloneTo(c12025x6Clone);
                c12025x6 = new C12025x6(c12025x6Clone.m56897x1() - (bfqVar.m73225wy() / 2.0f), c12025x6Clone.m56895kk() - (bfqVar.m73203ak() / 2.0f));
            } else {
                if (c12025x6.m56897x1() + bfqVar.m73225wy() <= c12007ix.m56550c5() + c12007ix.m56557jd()) {
                    if (c12025x6.m56895kk() + bfqVar.m73203ak() > c12007ix.m56575x1() + c12007ix.m56551ck()) {
                    }
                }
            }
            bfqVar.m73208du(c12025x6.m56897x1());
            bfqVar.m73212h4(c12025x6.m56895kk());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63378k4(C12007ix c12007ix, List<bfq> list) {
        boolean z = list.size() % 2 > 0;
        int size = list.size() / 2;
        if (!z) {
            size--;
        }
        for (int i = size; i >= 0; i--) {
            bfq bfqVar = list.get_Item(i);
            if (!bfqVar.m4193bv()) {
                if ((i == size && z) || list.size() == 1) {
                    m63377k4(bfqVar, list, c12007ix.Clone(), 0);
                } else {
                    m63377k4(bfqVar, list, c12007ix.Clone(), -1);
                }
            }
        }
        for (int i2 = size + 1; i2 < list.size(); i2++) {
            bfq bfqVar2 = list.get_Item(i2);
            if (!bfqVar2.m4193bv()) {
                m63377k4(bfqVar2, list, c12007ix.Clone(), 1);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m63379k4(mxy mxyVar) {
        for (eh0 eh0Var : this.f45509h4) {
            if (this.f45510kk > 0) {
                C12025x6 c12025x6 = new C12025x6(mxyVar.m72555k4() / 2.0f, mxyVar.m72556x1() / 2.0f);
                C12025x6 c12025x6Clone = C14873z5.m74319k4(eh0Var.m5538yj(), ((double) (mxyVar.m72555k4() / 2.0f)) - eh0Var.m5525ck(), C12025x6.f40591k4.Clone()).Clone();
                C12025x6 c12025x6Clone2 = C14873z5.m74322k4(c12025x6.Clone(), c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk()).Clone();
                C12025x6 c12025x62 = new C12025x6(eh0Var.m73225wy() / 2.0f, eh0Var.m73203ak() / 2.0f);
                eh0Var.m73208du(c12025x6Clone2.m56897x1() - c12025x62.m56897x1());
                eh0Var.m73212h4(c12025x6Clone2.m56895kk() - c12025x62.m56895kk());
            }
            if (eh0Var.m5533ks() >= 0) {
                C12025x6 c12025x6Clone3 = eh0Var.m5528k4(eh0Var.m5525ck() * (((double) (eh0Var.m5533ks() - this.f45510kk)) / 100.0d), mxyVar).Clone();
                eh0Var.m73208du(c12025x6Clone3.m56897x1() + eh0Var.m73205bz());
                eh0Var.m73212h4(c12025x6Clone3.m56895kk() + eh0Var.m73219qm());
            }
            eh0Var.m73220ss();
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        mxy mxyVarM63383kk = m63383kk((mxy) c14713vw);
        for (eh0 eh0Var : this.f45509h4) {
            eh0Var.m73210fa(mxyVarM63383kk);
        }
        for (bfq bfqVar : this.f45511to) {
            bfqVar.m73210fa(bfqVar.m67979yj());
        }
        for (klm klmVar : this.f45508du) {
            klmVar.m73210fa(c14713vw);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m63380k4(bfq bfqVar, C12025x6[] c12025x6Arr, C12007ix c12007ix) {
        eh0 eh0VarM4197to = bfqVar.m4197to();
        jjy jjyVarM67971ks = bfqVar.m67971ks();
        if (m63381k4(jjyVarM67971ks, eh0VarM4197to, eh0VarM4197to.m5530k4(0.98d, 0.98d), c12025x6Arr) || m63381k4(jjyVarM67971ks, eh0VarM4197to, bfqVar.m4197to().m5530k4(1.0d, 1.0d), c12025x6Arr)) {
            return true;
        }
        m63374k4(bfqVar, jjyVarM67971ks, eh0VarM4197to, bfqVar.m4197to().m5530k4(1.02d, 1.0d)).CloneTo(c12025x6Arr[0]);
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m63381k4(jjy jjyVar, eh0 eh0Var, jjy jjyVar2, C12025x6[] c12025x6Arr) {
        C12025x6.f40591k4.CloneTo(c12025x6Arr[0]);
        C12015qq c12015qq = new C12015qq(jjyVar.m63360x1(), jjyVar.m63358kk());
        C12025x6 c12025x6Clone = eh0Var.m73223ts().Clone();
        double dM5535up = eh0Var.m5535up() <= 45.0d ? eh0Var.m5535up() : 45.0d;
        for (double d = 0.0d; d < dM5535up / 2.0d; d += 1.0d) {
            for (double d2 = 0.99d; d2 > 0.2d; d2 -= 0.01d) {
                double dM5525ck = eh0Var.m5525ck() * d2;
                m63375k4(c12025x6Clone.Clone(), eh0Var.m5538yj() + d, dM5525ck, c12015qq.Clone()).CloneTo(c12025x6Arr[0]);
                jjyVar.m63354k4(c12025x6Arr[0].Clone());
                if (jjyVar.m63356k4(jjyVar2)) {
                    return true;
                }
                if (d > 0.0d) {
                    m63375k4(c12025x6Clone.Clone(), eh0Var.m5538yj() - d, dM5525ck, c12015qq.Clone()).CloneTo(c12025x6Arr[0]);
                    jjyVar.m63354k4(c12025x6Arr[0].Clone());
                    if (jjyVar.m63356k4(jjyVar2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m63382k4(jjy jjyVar, C12025x6 c12025x6, double d) {
        for (C12025x6 c12025x62 : jjyVar.m63357k4()) {
            double dM56897x1 = c12025x6.m56897x1() - c12025x62.m56897x1();
            double dM56895kk = c12025x6.m56895kk() - c12025x62.m56895kk();
            if ((dM56895kk * dM56895kk) + (dM56897x1 * dM56897x1) < d * d) {
                return true;
            }
        }
        return false;
    }
}
