package com.aspose.slides.internal.p051bz;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.C3521jd;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p481wp.AbstractC12235um;
import com.aspose.slides.internal.p481wp.C12226kk;
import com.aspose.slides.internal.p481wp.C12232rv;
import com.aspose.slides.internal.p481wp.C12234u4;
import com.aspose.slides.internal.p481wp.C12239wl;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.bz.c5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1907c5 extends AbstractC1914jd {
    @Override // com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: k4 */
    public int mo9856k4() {
        return 1;
    }

    @Override // com.aspose.slides.internal.p051bz.AbstractC1914jd, com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: kk */
    public boolean mo9870kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo9857k4(AbstractC4282kp[] abstractC4282kpArr, C1904ar c1904ar) {
        int iMo9884to;
        int iMo9884to2;
        AbstractC3524ks abstractC3524ksM14393k4 = c1904ar.m9854to().m14393k4();
        int iM17230x1 = abstractC4282kpArr.length == 0 ? c1904ar.m9848du().m17230x1() : C3521jd.m14273k4(abstractC4282kpArr[0].mo9926j_());
        if (iM17230x1 == -1) {
            throw new C1921qq("Incorrect parameter to from-table-column() function");
        }
        if (abstractC3524ksM14393k4.mo14084ix() != 75) {
            do {
                abstractC3524ksM14393k4 = (AbstractC3524ks) abstractC3524ksM14393k4.m14115s_();
                if (abstractC3524ksM14393k4.mo14084ix() == 75) {
                    break;
                }
            } while (abstractC3524ksM14393k4.mo14084ix() != 53);
            if (abstractC3524ksM14393k4.mo14084ix() != 75) {
                throw new C1921qq(C14113y2.m67408k4("from-table-column() may only be used on ", "fo:table-cell or its descendants."));
            }
            C12234u4 c12234u4 = (C12234u4) abstractC3524ksM14393k4;
            iMo9884to = c12234u4.m57108bz();
            iMo9884to2 = c12234u4.m57111g8();
        } else {
            iMo9884to = c1904ar.m9854to().m14385du(76).mo9878h4().mo9884to();
            iMo9884to2 = c1904ar.m9854to().m14385du(165).mo9878h4().mo9884to();
        }
        C12232rv c12232rvMo57086e0 = ((AbstractC12235um) abstractC3524ksM14393k4).mo57086e0();
        List<C12239wl> listM57089g8 = c12232rvMo57086e0.m57089g8();
        C12226kk c12226kkMo57053k4 = c12232rvMo57086e0.mo57053k4();
        if (listM57089g8 == null) {
            return c1904ar.m9854to().mo14063k4(iM17230x1, false, true);
        }
        if (c12226kkMo57053k4.m57060k4(iMo9884to)) {
            return listM57089g8.get_Item(iMo9884to - 1).m57151h4(iM17230x1);
        }
        do {
            iMo9884to2--;
            if (iMo9884to2 <= 0) {
                break;
            }
            iMo9884to++;
        } while (!c12226kkMo57053k4.m57060k4(iMo9884to));
        return c12226kkMo57053k4.m57060k4(iMo9884to) ? listM57089g8.get_Item(iMo9884to - 1).m57151h4(iM17230x1) : c1904ar.m9854to().mo14063k4(iM17230x1, false, true);
    }
}
