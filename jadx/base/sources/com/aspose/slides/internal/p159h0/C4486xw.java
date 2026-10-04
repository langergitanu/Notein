package com.aspose.slides.internal.p159h0;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p159h0.C4474up;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.xw */
/* JADX INFO: loaded from: classes.dex */
final class C4486xw {

    /* JADX INFO: renamed from: k4 */
    private C4444f9 f12339k4;

    public C4486xw(C4444f9 c4444f9) {
        this.f12339k4 = c4444f9;
    }

    /* JADX INFO: renamed from: k4 */
    private C4461qq m18465k4(C4463ri c4463ri, C4463ri c4463ri2, C4481wp c4481wp) {
        C4461qq c4461qq = new C4461qq(c4463ri2);
        c4481wp.m18425k4(c4463ri, c4461qq.m18390k4()).m18383k4(true);
        return c4461qq;
    }

    /* JADX INFO: renamed from: x1 */
    private void m18475x1() {
        C4466ss c4466ss = new C4466ss();
        for (int i = 0; i < this.f12339k4.m18187x1().m18482k4(); i++) {
            C4474up c4474upM18493x1 = this.f12339k4.m18187x1().m18493x1(i);
            if (!c4474upM18493x1.m18385kk() && c4474upM18493x1.m18388x1()[0] != null && c4474upM18493x1.m18388x1()[1] != null) {
                C4481wp c4481wp = c4474upM18493x1.m18388x1()[1];
                int iM18430x1 = c4481wp.m18430x1(c4474upM18493x1);
                if (!C4464rv.m18315k4(c4474upM18493x1.m18388x1()[0].m18423k4(c4474upM18493x1), c4481wp.m18427k4()[(iM18430x1 + 2) % 3], c4481wp.m18427k4()[iM18430x1], c4481wp.m18427k4()[(iM18430x1 + 1) % 3])) {
                    if (c4466ss.m18324kk(c4474upM18493x1.m18388x1()[0]) < 0) {
                        c4466ss.m18323k4(c4474upM18493x1.m18388x1()[0]);
                    }
                    if (c4466ss.m18324kk(c4474upM18493x1.m18388x1()[1]) < 0) {
                        c4466ss.m18323k4(c4474upM18493x1.m18388x1()[1]);
                    }
                }
            }
        }
        m18473k4(c4466ss);
    }

    /* JADX INFO: renamed from: k4 */
    private C4461qq m18466k4(C4480wl c4480wl, C4463ri c4463ri, C4470tq c4470tq) {
        C4474up c4474upM18420kk;
        C4474up c4474upM18421to;
        C4481wp c4481wpM18419du = c4480wl.m18419du();
        C4474up c4474upM18422x1 = c4480wl.m18422x1();
        C4463ri c4463riM18390k4 = c4480wl.m18390k4();
        C4488yj c4488yjM18350x1 = c4470tq.m18350x1();
        C4474up c4474up = new C4474up(c4463riM18390k4, c4463ri);
        c4488yjM18350x1.m18485k4(c4474up);
        c4474up.m18383k4(true);
        if (c4480wl.m18420kk().m18384k4()[0] == c4474upM18422x1.m18384k4()[0] || c4480wl.m18420kk().m18384k4()[1] == c4474upM18422x1.m18384k4()[0]) {
            c4474upM18420kk = c4480wl.m18420kk();
            c4474upM18421to = c4480wl.m18421to();
        } else {
            c4474upM18420kk = c4480wl.m18421to();
            c4474upM18421to = c4480wl.m18420kk();
        }
        c4470tq.m18348kk().m18320k4(new C4447gi(c4463ri, c4463riM18390k4, c4474upM18422x1.m18384k4()[0], c4474up, c4474upM18420kk, c4481wpM18419du.m18425k4(c4463ri, c4474upM18422x1.m18384k4()[0])));
        c4470tq.m18348kk().m18320k4(new C4447gi(c4463ri, c4463riM18390k4, c4474upM18422x1.m18384k4()[1], c4474up, c4474upM18421to, c4481wpM18419du.m18425k4(c4463ri, c4474upM18422x1.m18384k4()[1])));
        c4470tq.m18345du().m18323k4(c4481wpM18419du);
        return new C4461qq(c4463ri);
    }

    /* JADX INFO: renamed from: k4 */
    private C4463ri m18467k4(C4474up c4474up, C4463ri c4463ri) {
        if (c4474up != null && c4463ri != null && C4464rv.m18317k4(c4474up.m18384k4()[0].m18307kk().Clone(), c4463ri.m18307kk().Clone(), 1.0E-7d)) {
            return c4474up.m18384k4()[0];
        }
        if (c4474up == null || c4463ri == null || !C4464rv.m18317k4(c4474up.m18384k4()[1].m18307kk().Clone(), c4463ri.m18307kk().Clone(), 1.0E-7d)) {
            return null;
        }
        return c4474up.m18384k4()[1];
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC4475uz m18468k4(C4461qq c4461qq, C4474up c4474up, C4470tq c4470tq) {
        C4463ri c4463riM18390k4 = c4461qq.m18390k4();
        C4463ri c4463ri = null;
        C4474up c4474upM18424k4 = null;
        int i = 0;
        while (i < c4463riM18390k4.m18309to().m18321k4()) {
            c4474upM18424k4 = c4463riM18390k4.m18309to().m18327x1(i).m18424k4(c4463riM18390k4);
            C4463ri[] c4463riArr = {c4463ri};
            boolean z = C4464rv.m18311k4(c4463riM18390k4, c4474up.m18384k4()[1], c4474upM18424k4.m18384k4()[0], c4474upM18424k4.m18384k4()[1], c4463riArr) == 1;
            c4463ri = c4463riArr[0];
            if (z) {
                break;
            }
            i++;
        }
        C4481wp c4481wpM18327x1 = c4463riM18390k4.m18309to().m18327x1(i);
        C4463ri c4463riM18467k4 = m18467k4(c4474upM18424k4, c4463ri);
        return c4463riM18467k4 != null ? m18465k4(c4463riM18390k4, c4463riM18467k4, c4481wpM18327x1) : m18471k4(c4463riM18390k4, c4474upM18424k4, c4463ri, c4481wpM18327x1, c4470tq);
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC4475uz m18469k4(C4474up c4474up, AbstractC4475uz abstractC4475uz, C4470tq c4470tq) {
        if (C7019kk.m27469x1(abstractC4475uz, C4461qq.class)) {
            return m18468k4((C4461qq) abstractC4475uz, c4474up, c4470tq);
        }
        if (C7019kk.m27469x1(abstractC4475uz, C4480wl.class)) {
            return m18470k4((C4480wl) abstractC4475uz, c4474up, c4470tq);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC4475uz m18470k4(C4480wl c4480wl, C4474up c4474up, C4470tq c4470tq) {
        C4481wp c4481wpM18419du = c4480wl.m18419du();
        int i = 0;
        while (i < 3 && c4481wpM18419du.m18432x1()[i] != c4480wl.m18422x1()) {
            i++;
        }
        C4463ri c4463ri = c4474up.m18384k4()[0];
        C4463ri c4463ri2 = c4474up.m18384k4()[1];
        C4463ri c4463ri3 = null;
        C4474up c4474up2 = null;
        for (int i2 = 1; i2 <= 2; i2++) {
            c4474up2 = c4481wpM18419du.m18432x1()[(i + i2) % 3];
            C4463ri[] c4463riArr = {c4463ri3};
            boolean z = C4464rv.m18311k4(c4463ri, c4463ri2, c4474up2.m18384k4()[0], c4474up2.m18384k4()[1], c4463riArr) == 1;
            c4463ri3 = c4463riArr[0];
            if (z) {
                break;
            }
        }
        C4463ri c4463riM18467k4 = m18467k4(c4474up2, c4463ri3);
        return c4463riM18467k4 != null ? m18466k4(c4480wl, c4463riM18467k4, c4470tq) : m18472k4(c4480wl, c4474up2, c4463ri3, c4470tq);
    }

    /* JADX INFO: renamed from: k4 */
    private C4480wl m18471k4(C4463ri c4463ri, C4474up c4474up, C4463ri c4463ri2, C4481wp c4481wp, C4470tq c4470tq) {
        c4470tq.m18347k4().m18121k4(c4463ri2);
        C4488yj c4488yjM18350x1 = c4470tq.m18350x1();
        C4474up c4474up2 = new C4474up(c4463ri2, c4463ri);
        c4488yjM18350x1.m18485k4(c4474up2);
        c4474up2.m18383k4(true);
        C4488yj c4488yjM18350x12 = c4470tq.m18350x1();
        C4474up c4474up3 = new C4474up(c4463ri2, c4474up.m18384k4()[0]);
        c4488yjM18350x12.m18485k4(c4474up3);
        c4474up3.m18383k4(c4474up.m18385kk());
        C4488yj c4488yjM18350x13 = c4470tq.m18350x1();
        C4474up c4474up4 = new C4474up(c4463ri2, c4474up.m18384k4()[1]);
        c4488yjM18350x13.m18485k4(c4474up4);
        c4474up4.m18383k4(c4474up.m18385kk());
        c4470tq.m18348kk().m18320k4(new C4447gi(c4463ri, c4463ri2, c4474up.m18384k4()[0], c4474up2, c4474up3, c4481wp.m18425k4(c4463ri, c4474up.m18384k4()[0])));
        c4470tq.m18348kk().m18320k4(new C4447gi(c4463ri, c4463ri2, c4474up.m18384k4()[1], c4474up2, c4474up4, c4481wp.m18425k4(c4463ri, c4474up.m18384k4()[1])));
        c4470tq.m18349to().m18485k4(c4474up);
        c4470tq.m18345du().m18323k4(c4481wp);
        return new C4480wl(c4474up, c4463ri2, c4474up3, c4474up4, c4474up.m18382k4(c4481wp));
    }

    /* JADX INFO: renamed from: k4 */
    private C4480wl m18472k4(C4480wl c4480wl, C4474up c4474up, C4463ri c4463ri, C4470tq c4470tq) {
        C4463ri c4463ri2;
        C4474up c4474up2;
        C4474up c4474up3;
        C4474up c4474up4;
        C4463ri c4463ri3;
        C4474up c4474up5;
        C4481wp c4481wpM18419du = c4480wl.m18419du();
        C4474up c4474upM18422x1 = c4480wl.m18422x1();
        C4463ri c4463riM18423k4 = c4481wpM18419du.m18423k4(c4474up);
        C4463ri c4463riM18423k42 = c4481wpM18419du.m18423k4(c4474upM18422x1);
        int i = 0;
        while (true) {
            if (i >= 3) {
                c4463ri2 = null;
                break;
            }
            if (c4481wpM18419du.m18427k4()[i] != c4463riM18423k4 && c4481wpM18419du.m18427k4()[i] != c4463riM18423k42) {
                c4463ri2 = c4481wpM18419du.m18427k4()[i];
                break;
            }
            i++;
        }
        C4474up c4474upM18420kk = c4480wl.m18420kk();
        C4474up c4474upM18421to = c4480wl.m18421to();
        if (c4474upM18420kk.m18384k4()[0] == c4463ri2 || c4474upM18420kk.m18384k4()[1] == c4463ri2) {
            c4474up2 = c4474upM18420kk;
            c4474up3 = c4474upM18421to;
        } else if (c4474upM18421to.m18384k4()[0] == c4463ri2 || c4474upM18421to.m18384k4()[1] == c4463ri2) {
            c4474up3 = c4474upM18420kk;
            c4474up2 = c4474upM18421to;
        } else {
            c4474up3 = null;
            c4474up2 = null;
        }
        C4463ri c4463riM18390k4 = c4480wl.m18390k4();
        c4470tq.m18347k4().m18121k4(c4463ri);
        C4488yj c4488yjM18350x1 = c4470tq.m18350x1();
        C4474up c4474up6 = new C4474up(c4463ri2, c4463ri);
        c4488yjM18350x1.m18485k4(c4474up6);
        c4474up6.m18383k4(c4474up.m18385kk());
        C4488yj c4488yjM18350x12 = c4470tq.m18350x1();
        C4474up c4474up7 = new C4474up(c4463riM18390k4, c4463ri);
        c4488yjM18350x12.m18485k4(c4474up7);
        c4474up7.m18383k4(true);
        C4488yj c4488yjM18350x13 = c4470tq.m18350x1();
        C4474up c4474up8 = new C4474up(c4463ri, c4463riM18423k42);
        c4488yjM18350x13.m18485k4(c4474up8);
        c4474up8.m18383k4(c4474up.m18385kk());
        if (C4464rv.m18315k4(c4463riM18423k4, c4463riM18423k42, c4463ri, c4463riM18390k4)) {
            C4488yj c4488yjM18350x14 = c4470tq.m18350x1();
            C4474up c4474up9 = new C4474up(c4463riM18390k4, c4463riM18423k42);
            c4488yjM18350x14.m18485k4(c4474up9);
            C4465s7 c4465s7M18348kk = c4470tq.m18348kk();
            C4447gi c4447gi = new C4447gi(c4463riM18423k4, c4463riM18423k42, c4463riM18390k4, c4481wpM18419du.m18424k4(c4463ri2), c4474up9, c4474up3);
            c4463ri3 = c4463riM18390k4;
            c4465s7M18348kk.m18320k4(c4447gi);
            c4474up5 = c4474up7;
            c4470tq.m18348kk().m18320k4(new C4447gi(c4463riM18423k42, c4463ri, c4463ri3, c4474up8, c4474up5, c4474up9));
            c4474up4 = c4474up8;
        } else {
            C4474up c4474up10 = c4474up3;
            if (C4464rv.m18315k4(c4463riM18423k42, c4463riM18423k4, c4463riM18390k4, c4463ri)) {
                C4488yj c4488yjM18350x15 = c4470tq.m18350x1();
                C4474up c4474up11 = new C4474up(c4463ri, c4463riM18423k4);
                c4488yjM18350x15.m18485k4(c4474up11);
                c4474up4 = c4474up8;
                c4470tq.m18348kk().m18320k4(new C4447gi(c4463riM18423k4, c4463riM18423k42, c4463ri, c4481wpM18419du.m18424k4(c4463ri2), c4474up11, c4474up8));
                c4463ri3 = c4463riM18390k4;
                c4474up5 = c4474up7;
                c4470tq.m18348kk().m18320k4(new C4447gi(c4463riM18423k4, c4463ri, c4463ri3, c4474up10, c4474up5, c4474up11));
            } else {
                c4474up4 = c4474up8;
                c4463ri3 = c4463riM18390k4;
                c4474up5 = c4474up7;
            }
        }
        c4470tq.m18349to().m18485k4(c4474up);
        c4470tq.m18345du().m18323k4(c4481wpM18419du);
        c4470tq.m18348kk().m18320k4(new C4447gi(c4463ri3, c4463ri, c4463ri2, c4474up2, c4474up5, c4474up6));
        return new C4480wl(c4474up, c4463ri, c4474up4, c4474up6, c4474up.m18382k4(c4481wpM18419du));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18476k4() {
        this.f12339k4.m18187x1().m18487k4(new C4474up.k4());
        int i = 0;
        while (i < this.f12339k4.m18185kk().m18482k4()) {
            C4474up c4474upM18493x1 = this.f12339k4.m18185kk().m18493x1(i);
            C4474up c4474upM18400k4 = C4478vj.m18400k4(c4474upM18493x1, this.f12339k4.m18187x1());
            if (c4474upM18400k4 != null) {
                c4474upM18400k4.m18383k4(true);
            }
            if (c4474upM18400k4 == null) {
                C4470tq c4470tq = new C4470tq(this.f12339k4);
                int iM18116k4 = this.f12339k4.m18182k4().m18116k4() * 6;
                AbstractC4475uz c4461qq = new C4461qq(c4474upM18493x1.m18384k4()[0]);
                int i2 = 0;
                do {
                    c4461qq = m18469k4(c4474upM18493x1, c4461qq, c4470tq);
                    i2++;
                    if (i2 > iM18116k4) {
                        throw new Exception("Infinite loop");
                    }
                    if (c4461qq == null) {
                        break;
                    }
                } while (c4461qq.m18390k4() != c4474upM18493x1.m18384k4()[1]);
                C4463ri[] c4463riArr = {null};
                boolean zM18474k4 = m18474k4(c4470tq.m18350x1(), c4470tq.m18347k4(), c4463riArr);
                C4463ri c4463ri = c4463riArr[0];
                if (zM18474k4) {
                    C4474up c4474up = new C4474up(c4474upM18493x1.m18384k4()[0], c4463ri);
                    C4474up c4474up2 = new C4474up(c4463ri, c4474upM18493x1.m18384k4()[1]);
                    this.f12339k4.m18185kk().m18484k4(i, c4474up);
                    this.f12339k4.m18185kk().m18494x1(i + 1, c4474up2);
                    i--;
                } else {
                    m18473k4(c4470tq.m18346h4());
                }
            }
            i++;
        }
        m18475x1();
    }

    /* JADX INFO: renamed from: k4 */
    private void m18473k4(C4466ss c4466ss) {
        int iM18321k4 = c4466ss.m18321k4() * 6;
        int i = 0;
        int i2 = 0;
        while (i < c4466ss.m18321k4()) {
            int i3 = 0;
            while (true) {
                if (i3 < 3) {
                    C4474up c4474up = c4466ss.m18327x1(i).m18432x1()[i3];
                    if (!c4474up.m18385kk() && c4474up.m18388x1()[0] != null && c4474up.m18388x1()[1] != null) {
                        C4481wp c4481wpM18382k4 = c4474up.m18382k4(c4466ss.m18327x1(i));
                        int iM18430x1 = c4466ss.m18327x1(i).m18430x1(c4474up);
                        int iM18430x12 = c4481wpM18382k4.m18430x1(c4474up);
                        C4463ri c4463ri = c4466ss.m18327x1(i).m18427k4()[iM18430x1];
                        C4463ri c4463ri2 = c4481wpM18382k4.m18427k4()[(iM18430x12 + 2) % 3];
                        C4463ri c4463ri3 = c4481wpM18382k4.m18427k4()[iM18430x12];
                        C4463ri c4463ri4 = c4481wpM18382k4.m18427k4()[(iM18430x12 + 1) % 3];
                        C4474up c4474upM18424k4 = c4466ss.m18327x1(i).m18424k4(c4463ri4);
                        C4474up c4474upM18424k42 = c4481wpM18382k4.m18424k4(c4463ri4);
                        C4474up c4474upM18424k43 = c4481wpM18382k4.m18424k4(c4463ri2);
                        C4474up c4474upM18424k44 = c4466ss.m18327x1(i).m18424k4(c4463ri2);
                        if (!C4464rv.m18315k4(c4463ri, c4463ri2, c4463ri3, c4463ri4)) {
                            C4474up c4474up2 = new C4474up(c4463ri, c4463ri3);
                            C4477vh.m18398k4(this.f12339k4, c4474up, true);
                            c4466ss.m18328x1(c4474up.m18388x1()[0]);
                            c4466ss.m18328x1(c4474up.m18388x1()[1]);
                            this.f12339k4.m18187x1().m18491to(c4474up2);
                            C4466ss c4466ssM18186to = this.f12339k4.m18186to();
                            C4481wp c4481wp = new C4481wp(c4463ri, c4463ri2, c4463ri3, c4474upM18424k4, c4474upM18424k42, c4474up2);
                            c4466ssM18186to.m18323k4(c4481wp);
                            c4466ss.m18323k4(c4481wp);
                            C4466ss c4466ssM18186to2 = this.f12339k4.m18186to();
                            C4481wp c4481wp2 = new C4481wp(c4463ri3, c4463ri4, c4463ri, c4474upM18424k43, c4474upM18424k44, c4474up2);
                            c4466ssM18186to2.m18323k4(c4481wp2);
                            c4466ss.m18323k4(c4481wp2);
                            if (i > 0 && i2 <= iM18321k4) {
                                i -= 2;
                            }
                            i2++;
                        }
                    }
                    i3++;
                }
            }
            i++;
        }
        c4466ss.m18325kk();
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m18474k4(C4488yj c4488yj, C4437ca c4437ca, C4463ri[] c4463riArr) {
        for (int i = 0; i < c4488yj.m18482k4(); i++) {
            C4474up c4474upM18493x1 = c4488yj.m18493x1(i);
            if (c4474upM18493x1.m18386to() == 0.0d) {
                if (c4437ca.m18122kk(c4474upM18493x1.m18384k4()[0]) < 0) {
                    c4463riArr[0] = c4474upM18493x1.m18384k4()[0];
                    return true;
                }
                if (c4437ca.m18122kk(c4474upM18493x1.m18384k4()[1]) < 0) {
                    c4463riArr[0] = c4474upM18493x1.m18384k4()[1];
                    return true;
                }
            }
        }
        c4463riArr[0] = null;
        return false;
    }
}
