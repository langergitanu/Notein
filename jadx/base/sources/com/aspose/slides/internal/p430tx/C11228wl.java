package com.aspose.slides.internal.p430tx;

import com.aspose.slides.internal.p418tf.AbstractC10925du;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.wl */
/* JADX INFO: loaded from: classes4.dex */
public final class C11228wl extends AbstractC11197k4 {

    /* JADX INFO: renamed from: k4 */
    private static C11228wl f38733k4 = new C11228wl();

    /* JADX INFO: renamed from: k4 */
    public static C11228wl m54076k4() {
        return f38733k4;
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m54078kk(C11234xw c11234xw, AbstractC10925du abstractC10925du) {
        return c11234xw.m54196kk(abstractC10925du);
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m54079x1(C11234xw c11234xw, AbstractC10925du abstractC10925du) {
        return c11234xw.m54210x1(abstractC10925du);
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        int i;
        while (c11234xw.m54211yj()) {
            int iM54107kk = c11231x1.m54107kk();
            if (iM54107kk != 0) {
                switch (iM54107kk) {
                    case 2:
                        if (!m54077k4(c11234xw, c11231x1.m54088du())) {
                        }
                        break;
                    case 3:
                        int iMo21857kk = c11231x1.m54088du().mo21857kk();
                        if (iMo21857kk == 1 || iMo21857kk == 0) {
                            c11234xw.m54181k4(C11223uz.m54027k4(), c11231x1.m54090h4());
                            i = 4;
                            c11231x1.m54094k4(i);
                        } else {
                            if (!m54079x1(c11234xw, c11231x1.m54088du())) {
                            }
                            c11231x1.m54094k4(7);
                        }
                        break;
                    case 4:
                        c11234xw.m54181k4(C11192ix.m53805k4(), c11231x1.m54090h4());
                        i = 5;
                        c11231x1.m54094k4(i);
                        break;
                    case 5:
                        if (!c11231x1.m54088du().mo21871u4()) {
                            c11231x1.m54094k4(7);
                            if (!m54078kk(c11234xw, c11231x1.m54088du())) {
                            }
                            c11231x1.m54094k4(0);
                        } else {
                            c11234xw.m54181k4(m54076k4(), c11231x1.m54088du().mo21845h4(9));
                            i = 6;
                            c11231x1.m54094k4(i);
                        }
                        break;
                    case 6:
                        c11231x1.m54094k4(7);
                        break;
                    case 7:
                        if (!m54078kk(c11234xw, c11231x1.m54088du())) {
                        }
                        c11231x1.m54094k4(0);
                        break;
                }
                return;
            }
            if (!c11231x1.m54116x1(c11234xw)) {
                c11231x1.m54091jd();
                return;
            } else {
                c11231x1.m54094k4(2);
                if (!m54077k4(c11234xw, c11231x1.m54088du())) {
                    return;
                }
            }
            c11231x1.m54094k4(3);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m54077k4(C11234xw c11234xw, AbstractC10925du abstractC10925du) {
        return c11234xw.m54191k4(abstractC10925du, abstractC10925du.mo21849jd());
    }
}
