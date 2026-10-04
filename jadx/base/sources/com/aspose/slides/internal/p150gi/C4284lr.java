package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p150gi.C4288qq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.lr */
/* JADX INFO: loaded from: classes.dex */
public class C4284lr extends C4288qq.k4 {

    /* JADX INFO: renamed from: m9 */
    private AbstractC4282kp[] f11695m9;

    public C4284lr(int i) {
        super(i);
        this.f11695m9 = null;
    }

    /* JADX INFO: renamed from: x1 */
    private AbstractC4282kp m17257x1(AbstractC4282kp abstractC4282kp, int i) {
        if (this.f11695m9 == null) {
            this.f11695m9 = new AbstractC4282kp[]{mo17217k4("ultra-condensed"), mo17217k4("extra-condensed"), mo17217k4("condensed"), mo17217k4("semi-condensed"), mo17217k4("normal"), mo17217k4("semi-expanded"), mo17217k4("expanded"), mo17217k4("extra-expanded"), mo17217k4("ultra-expanded")};
        }
        int iMo17251du = abstractC4282kp.mo17251du();
        int i2 = 0;
        while (true) {
            AbstractC4282kp[] abstractC4282kpArr = this.f11695m9;
            if (i2 >= abstractC4282kpArr.length) {
                return abstractC4282kpArr[4];
            }
            if (iMo17251du == abstractC4282kpArr[i2].mo17251du()) {
                return this.f11695m9[C14116yg.m67507x1(C14116yg.m67483k4(0, i2 + i), this.f11695m9.length - 1)];
            }
            i2++;
        }
    }

    @Override // com.aspose.slides.internal.p150gi.C4288qq.k4, com.aspose.slides.internal.p150gi.AbstractC4275gi
    /* JADX INFO: renamed from: x1 */
    public AbstractC4282kp mo17139x1(AbstractC4282kp abstractC4282kp, AbstractC3533um abstractC3533um, AbstractC3524ks abstractC3524ks) {
        AbstractC4282kp abstractC4282kpM14400m9;
        int i;
        if (abstractC4282kp.mo17251du() == 85) {
            abstractC4282kpM14400m9 = abstractC3533um.m14400m9(m17230x1());
            i = -1;
        } else {
            if (abstractC4282kp.mo17251du() != 160) {
                return super.mo17139x1(abstractC4282kp, abstractC3533um, abstractC3524ks);
            }
            abstractC4282kpM14400m9 = abstractC3533um.m14400m9(m17230x1());
            i = 1;
        }
        return m17257x1(abstractC4282kpM14400m9, i);
    }
}
