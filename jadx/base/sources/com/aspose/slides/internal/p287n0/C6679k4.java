package com.aspose.slides.internal.p287n0;

import com.aspose.slides.internal.p040bg.AbstractC1694fa;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p349q3.C9749zj;
import com.aspose.slides.internal.p472w8.C11913yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.n0.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6679k4 extends AbstractC1694fa {
    @Override // com.aspose.slides.internal.p040bg.AbstractC1694fa
    /* JADX INFO: renamed from: h4 */
    public void mo9138h4(C9723vw c9723vw, C3585h4 c3585h4) {
        C9749zj c9749zj = (C9749zj) c9723vw;
        int iM47957k4 = (int) c9749zj.m47957k4();
        if (iM47957k4 == 1) {
            c3585h4.m14529kk(new C11913yj());
            return;
        }
        if (iM47957k4 == 2) {
            c3585h4.m14547t6().m55769k4(c9749zj.m47269x1().m25637dy(), 0);
        } else if (iM47957k4 == 3) {
            c3585h4.m14547t6().m55769k4(c9749zj.m47269x1().m25637dy(), 1);
        } else {
            if (iM47957k4 != 4) {
                return;
            }
            c3585h4.m14529kk(c9749zj.m47269x1().m25637dy());
        }
    }
}
