package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p431ty.C11241kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.t4 */
/* JADX INFO: loaded from: classes3.dex */
class C14485t4 extends eca {

    /* JADX INFO: renamed from: du */
    private final C14407ro[] f49021du;

    /* JADX INFO: renamed from: h4 */
    private final int f49022h4;

    /* JADX INFO: renamed from: kk */
    private final bfq[] f49023kk;

    /* JADX INFO: renamed from: to */
    private final klm[] f49024to;

    public C14485t4(double d, int i, C0886d8[] c0886d8Arr) {
        this.f49022h4 = i;
        double dM5402k4 = eca.m5402k4(AbstractC14092to.m67204k4((Object[]) c0886d8Arr));
        if (dM5402k4 > 0.0d) {
            this.f49021du = new C14407ro[c0886d8Arr.length];
            double[] dArr = {0.0d};
            double[] dArr2 = {0.0d};
            m5411k4(AbstractC14092to.m67204k4((Object[]) c0886d8Arr), dArr, dArr2);
            double d2 = dArr[0];
            double d3 = dArr2[0];
            double d4 = d;
            for (int i2 = 0; i2 < c0886d8Arr.length; i2++) {
                C0886d8 c0886d8 = c0886d8Arr[i2];
                double dM67475k4 = C14116yg.m67475k4(c0886d8.m4989k4()) / dM5402k4;
                double dM54224k4 = (dM67475k4 >= 1.0E-9d || !c0886d8.m4983dy()) ? C11241kk.m54224k4(dM67475k4 * 360.0d, d2, d3) : 0.0d;
                this.f49021du[i2] = new C14407ro(c0886d8, d4, dM54224k4, dM67475k4, c0886d8.m4989k4());
                d4 += dM54224k4;
            }
            m5415x1(dM5402k4);
            List list = new List();
            List list2 = new List();
            for (int i3 = 0; i3 < c0886d8Arr.length; i3++) {
                C0886d8 c0886d82 = c0886d8Arr[i3];
                C14407ro c14407ro = this.f49021du[i3];
                if (c0886d82.m5003ks() != null && c0886d82.m5003ks().m4569up() && eca.m5403k4(c14407ro, c0886d82)) {
                    list.addItem(new bfq(c14407ro, c0886d82));
                    if (c0886d82.m5003ks().m4570x1().getDataLabelFormat().getShowLeaderLines() || c0886d82.m5012up().m64945h4().getLabels().getDefaultDataLabelFormat().getShowLeaderLines()) {
                        list2.addItem(new klm(c0886d82));
                    }
                }
            }
            this.f49023kk = (bfq[]) list.toArray(new bfq[0]);
            this.f49024to = (klm[]) list2.toArray(new klm[0]);
        } else {
            this.f49023kk = new bfq[0];
            this.f49021du = new C14407ro[0];
            this.f49024to = new klm[0];
        }
        for (C14407ro c14407ro2 : this.f49021du) {
            m73215k4(c14407ro2);
        }
        for (klm klmVar : this.f49024to) {
            m73215k4(klmVar);
        }
        for (bfq bfqVar : this.f49023kk) {
            m73215k4(bfqVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m70933k4(mxy mxyVar) {
        for (C14407ro c14407ro : this.f49021du) {
            if (this.f49022h4 >= 0) {
                C12025x6 c12025x6Clone = c14407ro.m5528k4(c14407ro.m5525ck() * (((double) (c14407ro.m5533ks() < 0 ? this.f49022h4 : c14407ro.m5533ks())) / 100.0d), mxyVar).Clone();
                c14407ro.m73208du(c12025x6Clone.m56897x1());
                c14407ro.m73212h4(c12025x6Clone.m56895kk());
            }
            c14407ro.m73220ss();
        }
    }

    /* JADX INFO: renamed from: to */
    private void m70934to() {
        int i = 0;
        while (true) {
            klm[] klmVarArr = this.f49024to;
            if (i >= klmVarArr.length) {
                return;
            }
            klm klmVar = klmVarArr[i];
            if (klmVar.m63976to()) {
                bfq bfqVar = this.f49023kk[i];
                klmVar.m63972k4(klmVar.m63973k4(bfqVar.m73209e0().Clone(), new C12025x6[]{bfqVar.m4200uz().m70189m9()}, bfqVar.m67978x6()));
            }
            klmVar.m73220ss();
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m70935x1(mxy mxyVar) {
        C12025x6 c12025x6M5537x1;
        C12007ix c12007ix = new C12007ix(-mxyVar.m67814to(), -mxyVar.m67811du(), m73218lr().m73225wy(), m73218lr().m73203ak());
        boolean z = ((C14840ya) m73228yd()).m73785to() == 0;
        int i = 0;
        while (true) {
            bfq[] bfqVarArr = this.f49023kk;
            if (i >= bfqVarArr.length) {
                return;
            }
            bfq bfqVar = bfqVarArr[i];
            C14407ro c14407roM4200uz = bfqVar.m4200uz();
            C12025x6 c12025x6 = new C12025x6();
            if (z) {
                double dM5525ck = c14407roM4200uz.m5525ck() - ((double) c14407roM4200uz.m70190to());
                int iMo4194dy = bfqVar.mo4194dy();
                c12025x6M5537x1 = iMo4194dy != 2 ? iMo4194dy != 4 ? c14407roM4200uz.m5537x1(bfqVar.m73209e0().m56570m9().Clone(), (dM5525ck * 1.04d) + ((double) c14407roM4200uz.m70190to())) : c14407roM4200uz.m5529k4(bfqVar.m73209e0().m56570m9().Clone(), (dM5525ck * 0.96d) + ((double) c14407roM4200uz.m70190to())) : c14407roM4200uz.m70189m9();
            }
            c12025x6M5537x1.CloneTo(c12025x6);
            C12025x6 c12025x6Clone = bfqVar.m67967k4(c12025x6.Clone(), c12007ix.Clone()).Clone();
            bfqVar.m73208du(c12025x6Clone.m56897x1());
            bfqVar.m73212h4(c12025x6Clone.m56895kk());
            bfqVar.m73220ss();
            klm[] klmVarArr = this.f49024to;
            if (i < klmVarArr.length) {
                klmVarArr[i].m63972k4((bfqVar.m67962c5() == 0.0f && bfqVar.m67966jd() == 0.0f) ? false : true);
            }
            i++;
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: U_ */
    public void mo5524U_() {
        if (mo3221T_()) {
            for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
                abstractC14770x9.mo5524U_();
            }
        }
    }

    @Override // com.aspose.slides.eca
    /* JADX INFO: renamed from: kk */
    public cdv[] mo5413kk() {
        return this.f49021du;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        for (C14407ro c14407ro : this.f49021du) {
            c14407ro.m73210fa(c14713vw);
        }
        for (bfq bfqVar : this.f49023kk) {
            bfqVar.m73210fa(bfqVar.m67979yj());
        }
        for (klm klmVar : this.f49024to) {
            klmVar.m73210fa(c14713vw);
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        mxy mxyVar = (mxy) c14713vw;
        m70933k4(mxyVar);
        m70935x1(mxyVar);
        m70934to();
    }
}
