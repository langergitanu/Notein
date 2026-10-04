package com.aspose.slides.internal.p430tx;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.uz */
/* JADX INFO: loaded from: classes4.dex */
public final class C11223uz extends AbstractC11197k4 {

    /* JADX INFO: renamed from: k4 */
    private static C11223uz f38712k4 = new C11223uz();

    /* JADX INFO: renamed from: k4 */
    public static C11223uz m54027k4() {
        return f38712k4;
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        while (c11234xw.m54211yj()) {
            int iM54107kk = c11231x1.m54107kk();
            if (iM54107kk == 0) {
                C11234xw c11234xw2 = c11234xw;
                if (!c11231x1.m54088du().mo21875x1(1)) {
                    c11231x1.m54091jd();
                    return;
                }
                c11231x1.m54094k4(2);
                if (!c11234xw2.m54188k4(3, null, c11231x1.m54088du().mo21867to(), c11231x1.m54088du().mo21843dy(), false)) {
                    return;
                }
                c11231x1.m54094k4(4);
                c11234xw = c11234xw2;
            } else if (iM54107kk == 2) {
                C11234xw c11234xw3 = c11234xw;
                if (!c11234xw3.m54188k4(3, null, c11231x1.m54088du().mo21867to(), c11231x1.m54088du().mo21843dy(), false)) {
                    return;
                }
                c11231x1.m54094k4(4);
                c11234xw = c11234xw3;
            } else if (iM54107kk != 4) {
                if (iM54107kk != 5) {
                    return;
                }
                if (!c11231x1.m54088du().mo21858kk(1)) {
                    c11231x1.m54088du().mo21864ne();
                    c11231x1.m54091jd();
                    return;
                }
                c11231x1.m54094k4(2);
            } else if (!c11234xw.m54163du(3)) {
                return;
            } else {
                c11231x1.m54094k4(5);
            }
        }
    }
}
