package com.aspose.slides.internal.p430tx;

import com.aspose.slides.internal.p418tf.AbstractC10925du;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.ix */
/* JADX INFO: loaded from: classes4.dex */
public final class C11192ix extends AbstractC11197k4 {

    /* JADX INFO: renamed from: k4 */
    private static C11192ix f38558k4 = new C11192ix();

    /* JADX INFO: renamed from: k4 */
    public static C11192ix m53805k4() {
        return f38558k4;
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m53807kk(C11234xw c11234xw, AbstractC10925du abstractC10925du) {
        return c11234xw.m54163du(2);
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m53808x1(C11234xw c11234xw, AbstractC10925du abstractC10925du) {
        return c11234xw.m54197kk(abstractC10925du.mo21843dy());
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        while (c11234xw.m54211yj()) {
            int iM54107kk = c11231x1.m54107kk();
            int i = 3;
            if (iM54107kk != 0) {
                if (iM54107kk != 2) {
                    if (iM54107kk != 3) {
                        i = 5;
                        if (iM54107kk != 4) {
                            if (iM54107kk != 5) {
                                return;
                            }
                            if (!c11231x1.m54088du().mo21861ks()) {
                                c11231x1.m54088du().mo21864ne();
                                c11231x1.m54091jd();
                                return;
                            }
                            c11231x1.m54094k4(2);
                        } else if (!m53807kk(c11234xw, c11231x1.m54088du())) {
                            return;
                        }
                    } else if (!m53808x1(c11234xw, c11231x1.m54088du())) {
                        return;
                    } else {
                        c11231x1.m54094k4(4);
                    }
                } else if (!m53806k4(c11234xw, c11231x1.m54088du())) {
                    return;
                }
            } else if (!c11231x1.m54088du().mo21872up() || !c11231x1.m54088du().mo21879yj()) {
                c11231x1.m54091jd();
                return;
            } else {
                c11231x1.m54094k4(2);
                if (!m53806k4(c11234xw, c11231x1.m54088du())) {
                    return;
                }
            }
            c11231x1.m54094k4(i);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m53806k4(C11234xw c11234xw, AbstractC10925du abstractC10925du) {
        return c11234xw.m54188k4(2, abstractC10925du.mo21863m9(), abstractC10925du.mo21867to(), abstractC10925du.mo21841du(), false);
    }
}
