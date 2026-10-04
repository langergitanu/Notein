package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.zd */
/* JADX INFO: loaded from: classes3.dex */
class C14881zd extends eca {

    /* JADX INFO: renamed from: du */
    private final klm[] f50534du;

    /* JADX INFO: renamed from: kk */
    private C13709k1[] f50535kk;

    /* JADX INFO: renamed from: to */
    private final bfq[] f50536to;

    public C14881zd(C0886d8[] c0886d8Arr) {
        this.f50535kk = new C13709k1[c0886d8Arr.length];
        double dM5402k4 = eca.m5402k4(AbstractC14092to.m67204k4((Object[]) c0886d8Arr));
        if (dM5402k4 > 0.0d) {
            int i = 0;
            while (true) {
                C13709k1[] c13709k1Arr = this.f50535kk;
                if (i >= c13709k1Arr.length) {
                    break;
                }
                C0886d8 c0886d8 = c0886d8Arr[i];
                c13709k1Arr[i] = new C13709k1(c0886d8, C14116yg.m67475k4(c0886d8.m4989k4()) / dM5402k4);
                i++;
            }
            m5415x1(dM5402k4);
            List list = new List();
            List list2 = new List();
            for (int i2 = 0; i2 < c0886d8Arr.length; i2++) {
                C0886d8 c0886d82 = c0886d8Arr[i2];
                C13709k1 c13709k1 = this.f50535kk[i2];
                if (c0886d82.m5003ks() != null && c0886d82.m5003ks().m4569up() && c13709k1.m4552c5() > 0.0d) {
                    list.addItem(new bfq(c13709k1, c0886d82));
                    list2.addItem(new klm(c0886d82));
                }
            }
            this.f50536to = (bfq[]) list.toArray(new bfq[0]);
            this.f50534du = (klm[]) list2.toArray(new klm[0]);
        } else {
            this.f50536to = new bfq[0];
            this.f50535kk = new C13709k1[0];
            this.f50534du = new klm[0];
        }
        for (C13709k1 c13709k12 : this.f50535kk) {
            m73215k4(c13709k12);
        }
        for (klm klmVar : this.f50534du) {
            m73215k4(klmVar);
        }
        for (bfq bfqVar : this.f50536to) {
            m73215k4(bfqVar);
        }
    }

    /* JADX INFO: renamed from: to */
    private void m74429to() {
        int i = 0;
        while (true) {
            klm[] klmVarArr = this.f50534du;
            if (i >= klmVarArr.length) {
                return;
            }
            klm klmVar = klmVarArr[i];
            if (klmVar.m63976to()) {
                bfq bfqVar = this.f50536to[i];
                C13709k1 c13709k1M4198u4 = bfqVar.m4198u4();
                klmVar.m63972k4(klmVar.m63973k4(bfqVar.m73209e0().Clone(), new C12025x6[]{new C12025x6(c13709k1M4198u4.m73227xk(), c13709k1M4198u4.m73223ts().m56895kk()), new C12025x6(c13709k1M4198u4.m73227xk() + c13709k1M4198u4.m73225wy(), c13709k1M4198u4.m73223ts().m56895kk())}, bfqVar.m67978x6()));
            }
            klmVar.m73220ss();
            i++;
        }
    }

    @Override // com.aspose.slides.eca
    /* JADX INFO: renamed from: k4 */
    public void mo5410k4(double d, cdv[] cdvVarArr) {
        ((eca) this).f4736x1 = d;
        m5409k4(0.0d);
        for (cdv cdvVar : cdvVarArr) {
            double dM67475k4 = C14116yg.m67475k4(cdvVar.m4553jd());
            m5409k4(m5414m9() + dM67475k4);
            cdvVar.m4554k4(dM67475k4 / d);
        }
    }

    @Override // com.aspose.slides.eca
    /* JADX INFO: renamed from: kk */
    public cdv[] mo5413kk() {
        return this.f50535kk;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.mo5524U_();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m74428k4(mxy mxyVar) {
        C12007ix c12007ix = new C12007ix(-mxyVar.m67814to(), -mxyVar.m67811du(), m73218lr().m73225wy(), m73218lr().m73203ak());
        int i = 0;
        while (true) {
            bfq[] bfqVarArr = this.f50536to;
            if (i >= bfqVarArr.length) {
                return;
            }
            bfq bfqVar = bfqVarArr[i];
            C13709k1 c13709k1M4198u4 = bfqVar.m4198u4();
            C12025x6 c12025x6 = new C12025x6();
            int iMo4194dy = bfqVar.mo4194dy();
            if (iMo4194dy != 2) {
                c12025x6 = iMo4194dy != 4 ? new C12025x6((bfqVar.m73225wy() / 2.0f) + c13709k1M4198u4.m73227xk() + c13709k1M4198u4.m73225wy() + 3.0f, c13709k1M4198u4.m73223ts().m56895kk()) : new C12025x6(c13709k1M4198u4.m73223ts().m56897x1(), (bfqVar.m73203ak() / 2.0f) + c13709k1M4198u4.m73206c6() + 3.0f);
            } else {
                c13709k1M4198u4.m73223ts().CloneTo(c12025x6);
            }
            C12025x6 c12025x6Clone = bfqVar.m67967k4(c12025x6.Clone(), c12007ix.Clone()).Clone();
            bfqVar.m73208du(c12025x6Clone.m56897x1());
            bfqVar.m73212h4(c12025x6Clone.m56895kk());
            bfqVar.m73220ss();
            this.f50534du[i].m63972k4((bfqVar.m67962c5() == 0.0f && bfqVar.m67966jd() == 0.0f) ? false : true);
            i++;
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        float fM73203ak = 0.0f;
        for (C13709k1 c13709k1 : this.f50535kk) {
            c13709k1.m73212h4(fM73203ak);
            fM73203ak += c13709k1.m73203ak();
            c13709k1.m73220ss();
        }
        m74428k4((mxy) c14713vw);
        m74429to();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        mxy mxyVar = (mxy) c14713vw;
        float fM67811du = mxyVar.m67811du();
        for (C13709k1 c13709k1 : this.f50535kk) {
            c13709k1.m73210fa(new mxy(mxyVar.m72555k4(), mxyVar.m72556x1() * ((float) (C14116yg.m67475k4(c13709k1.m4553jd()) / m5414m9())), mxyVar.m67814to(), fM67811du));
            fM67811du += c13709k1.m73203ak();
        }
        for (bfq bfqVar : this.f50536to) {
            bfqVar.m73210fa(bfqVar.m67979yj());
        }
        for (klm klmVar : this.f50534du) {
            klmVar.m73210fa(c14713vw);
        }
    }
}
