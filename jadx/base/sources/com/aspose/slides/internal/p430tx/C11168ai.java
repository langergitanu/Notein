package com.aspose.slides.internal.p430tx;

import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.ai */
/* JADX INFO: loaded from: classes4.dex */
public class C11168ai extends AbstractC11197k4 {

    /* JADX INFO: renamed from: k4 */
    protected C13890ei f38453k4;

    /* JADX INFO: renamed from: x1 */
    protected C11207os f38454x1;

    /* JADX INFO: renamed from: k4 */
    public final AbstractC11197k4 m53667k4(AbstractC10925du abstractC10925du) {
        int iMo21857kk = abstractC10925du.mo21857kk();
        if (iMo21857kk == 0 || iMo21857kk == 1) {
            return C11217to.m54018k4(this.f38453k4);
        }
        if (iMo21857kk == 2 || iMo21857kk == 4 || iMo21857kk == 5 || iMo21857kk == 6) {
            return C11202m2.m53854k4();
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        AbstractC11197k4 abstractC11197k4M53875x1;
        if (this.f38453k4 != null) {
            C11207os c11207os = this.f38454x1;
            abstractC11197k4M53875x1 = c11207os == null ? c11234xw.m54205x1().m53863k4(c11234xw, c11231x1.m54088du(), this.f38453k4) : c11207os.m53876x1(c11234xw, c11231x1.m54088du(), this.f38453k4);
        } else {
            C11207os c11207os2 = this.f38454x1;
            abstractC11197k4M53875x1 = c11207os2 == null ? c11234xw.m54205x1().m53875x1(c11234xw, c11231x1.m54088du()) : c11207os2.m53872kk(c11234xw, c11231x1.m54088du());
        }
        if (abstractC11197k4M53875x1 == null) {
            abstractC11197k4M53875x1 = m53667k4(c11231x1.m54088du());
        }
        if (abstractC11197k4M53875x1 != null) {
            c11231x1.m54098k4(abstractC11197k4M53875x1);
        } else {
            c11231x1.m54091jd();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53669k4(C13890ei c13890ei, C11207os c11207os) {
        this.f38453k4 = c13890ei;
        this.f38454x1 = c11207os;
    }
}
