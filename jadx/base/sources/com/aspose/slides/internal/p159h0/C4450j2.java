package com.aspose.slides.internal.p159h0;

import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.j2 */
/* JADX INFO: loaded from: classes.dex */
final class C4450j2 {

    /* JADX INFO: renamed from: k4 */
    private C4444f9 f12233k4;

    public C4450j2(C4444f9 c4444f9) {
        this.f12233k4 = c4444f9;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m18210x1(C4463ri c4463ri, C4488yj c4488yj, C4437ca c4437ca, C4481wp[] c4481wpArr) {
        int i = 0;
        if (c4481wpArr[0] == null) {
            c4481wpArr[0] = this.f12233k4.m18186to().m18327x1(0);
        }
        int[] iArr = {0};
        C4481wp c4481wpM18401k4 = C4478vj.m18401k4(c4463ri, c4481wpArr[0], this.f12233k4.m18182k4().m18116k4(), iArr);
        c4481wpArr[0] = c4481wpM18401k4;
        if (iArr[0] == 2) {
            m18208k4(c4463ri, c4481wpM18401k4);
            return false;
        }
        c4488yj.m18490kk();
        c4488yj.m18488k4(c4481wpM18401k4.m18432x1());
        c4437ca.m18123kk();
        c4437ca.m18119k4(AbstractC14092to.m67204k4((Object[]) c4481wpM18401k4.m18427k4()));
        while (i < c4488yj.m18482k4()) {
            C4481wp c4481wpM18382k4 = c4488yj.m18482k4() == 3 ? c4488yj.m18493x1(i).m18382k4(c4481wpM18401k4) : c4488yj.m18493x1(i).m18379du();
            if (c4481wpM18382k4 != null) {
                int iM18430x1 = c4481wpM18382k4.m18430x1(c4488yj.m18493x1(i));
                if (!C4464rv.m18315k4(c4463ri, c4481wpM18382k4.m18427k4()[(iM18430x1 + 2) % 3], c4481wpM18382k4.m18427k4()[iM18430x1], c4481wpM18382k4.m18427k4()[(iM18430x1 + 1) % 3])) {
                    int i2 = i + 1;
                    c4437ca.m18118k4(i2, c4481wpM18382k4.m18423k4(c4488yj.m18493x1(i)));
                    C4474up c4474upM18493x1 = c4488yj.m18493x1(i);
                    c4488yj.m18484k4(i, c4481wpM18382k4.m18429kk(c4488yj.m18493x1(i)));
                    c4488yj.m18494x1(i2, c4481wpM18382k4.m18429kk(c4488yj.m18493x1(i)));
                    C4477vh.m18398k4(this.f12233k4, c4474upM18493x1, true);
                    i--;
                    c4481wpM18401k4 = null;
                }
            }
            i++;
        }
        if (c4488yj.m18482k4() == 3) {
            C4477vh.m18399k4(this.f12233k4, c4481wpM18401k4, true);
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18211k4() {
        C4488yj c4488yj = new C4488yj();
        C4437ca c4437ca = new C4437ca();
        C4481wp c4481wp = null;
        int i = 0;
        boolean z = false;
        while (i < this.f12233k4.m18182k4().m18116k4()) {
            C4463ri c4463riM18125x1 = this.f12233k4.m18182k4().m18125x1(i);
            if (!c4463riM18125x1.m18308m9()) {
                if (z) {
                    C4481wp[] c4481wpArr = {c4481wp};
                    boolean zM18210x1 = m18210x1(c4463riM18125x1, c4488yj, c4437ca, c4481wpArr);
                    c4481wp = c4481wpArr[0];
                    if (!zM18210x1) {
                        i--;
                    }
                } else {
                    c4488yj.m18486k4(this.f12233k4.m18180du().m18293x1());
                    c4437ca.m18120k4(this.f12233k4.m18180du().m18292k4());
                    z = true;
                }
                C4481wp[] c4481wpArr2 = {c4481wp};
                m18209k4(c4463riM18125x1, c4488yj, c4437ca, c4481wpArr2);
                c4481wp = c4481wpArr2[0];
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m18208k4(C4463ri c4463ri, C4481wp c4481wp) {
        C4463ri c4463ri2;
        int i = 0;
        while (true) {
            if (i >= 3) {
                c4463ri2 = null;
                break;
            } else {
                if (c4481wp.m18427k4()[i].m18306k4(c4463ri)) {
                    c4463ri2 = c4481wp.m18427k4()[i];
                    break;
                }
                i++;
            }
        }
        for (int i2 = 0; i2 < this.f12233k4.m18185kk().m18482k4(); i2++) {
            if (this.f12233k4.m18185kk().m18493x1(i2).m18384k4()[0] == c4463ri) {
                this.f12233k4.m18185kk().m18493x1(i2).m18384k4()[0] = c4463ri2;
            }
            if (this.f12233k4.m18185kk().m18493x1(i2).m18384k4()[1] == c4463ri) {
                this.f12233k4.m18185kk().m18493x1(i2).m18384k4()[1] = c4463ri2;
            }
        }
        this.f12233k4.m18182k4().m18126x1(c4463ri);
    }

    /* JADX INFO: renamed from: k4 */
    private void m18209k4(C4463ri c4463ri, C4488yj c4488yj, C4437ca c4437ca, C4481wp[] c4481wpArr) {
        C4463ri c4463ri2 = c4463ri;
        C4474up c4474up = new C4474up(c4463ri2, c4437ca.m18125x1(0));
        this.f12233k4.m18187x1().m18485k4(c4474up);
        C4474up c4474up2 = c4474up;
        int i = 1;
        while (i < c4437ca.m18116k4()) {
            C4466ss c4466ssM18186to = this.f12233k4.m18186to();
            int i2 = i - 1;
            C4463ri c4463riM18125x1 = c4437ca.m18125x1(i2);
            C4463ri c4463riM18125x12 = c4437ca.m18125x1(i);
            C4474up c4474upM18493x1 = c4488yj.m18493x1(i2);
            C4474up c4474up3 = new C4474up(c4463ri2, c4437ca.m18125x1(i));
            c4466ssM18186to.m18323k4(new C4481wp(c4463ri2, c4463riM18125x1, c4463riM18125x12, c4474up2, c4474upM18493x1, c4474up3));
            this.f12233k4.m18187x1().m18485k4(c4474up3);
            i++;
            c4463ri2 = c4463ri;
            c4474up2 = c4474up3;
        }
        C4466ss c4466ssM18186to2 = this.f12233k4.m18186to();
        C4481wp c4481wp = new C4481wp(c4463ri, c4437ca.m18125x1(c4437ca.m18116k4() - 1), c4437ca.m18125x1(0), c4474up2, c4488yj.m18493x1(c4488yj.m18482k4() - 1), c4474up);
        c4481wpArr[0] = c4481wp;
        c4466ssM18186to2.m18323k4(c4481wp);
    }
}
