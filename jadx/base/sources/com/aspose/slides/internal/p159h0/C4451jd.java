package com.aspose.slides.internal.p159h0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Queue;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.jd */
/* JADX INFO: loaded from: classes.dex */
public final class C4451jd {

    /* JADX INFO: renamed from: k4 */
    private C4444f9 f12234k4;

    public C4451jd(C4444f9 c4444f9) {
        this.f12234k4 = c4444f9;
    }

    /* JADX INFO: renamed from: kk */
    private int m18217kk() {
        C4488yj c4488yj = new C4488yj();
        int iM18482k4 = this.f12234k4.m18187x1().m18482k4();
        for (int i = 0; i < iM18482k4; i++) {
            if (this.f12234k4.m18187x1().m18493x1(i).m18385kk()) {
                c4488yj.m18485k4(this.f12234k4.m18187x1().m18493x1(i));
            }
        }
        m18216k4(this.f12234k4.m18180du().m18293x1().m18493x1(0).m18379du(), 0);
        C4455ks c4455ks = new C4455ks();
        c4455ks.m18246k4(new C4488yj());
        c4455ks.m18246k4(new C4488yj());
        int iM18482k42 = c4488yj.m18482k4();
        for (int i2 = 0; i2 < iM18482k42; i2++) {
            ((c4488yj.m18493x1(i2).m18388x1()[0].m18428kk() == 0 || c4488yj.m18493x1(i2).m18388x1()[1].m18428kk() == 0) ? c4455ks.m18244k4(0) : c4455ks.m18244k4(1)).m18485k4(c4488yj.m18493x1(i2));
        }
        int i3 = 0;
        int i4 = 0;
        while (c4455ks.m18244k4(i3).m18482k4() > 0) {
            for (int i5 = 0; i5 < c4455ks.m18244k4(i3).m18482k4(); i5++) {
                C4481wp c4481wpM18214k4 = m18214k4(c4455ks, i3, i5);
                if (c4481wpM18214k4 != null) {
                    int i6 = i3 + 1;
                    m18216k4(c4481wpM18214k4, i6);
                    if (i6 % 2 == 1) {
                        i4++;
                    }
                }
            }
            int i7 = i3 + 1;
            C4488yj c4488yjM18244k4 = c4455ks.m18244k4(i7);
            c4455ks.m18245k4(i7, new C4488yj());
            c4455ks.m18246k4(new C4488yj());
            for (int i8 = 0; i8 < c4488yjM18244k4.m18482k4(); i8++) {
                ((c4488yjM18244k4.m18493x1(i8).m18388x1()[0].m18428kk() == i7 || c4488yjM18244k4.m18493x1(i8).m18388x1()[1].m18428kk() == i7) ? c4455ks.m18244k4(i7) : c4455ks.m18244k4(i3 + 2)).m18485k4(c4488yjM18244k4.m18493x1(i8));
            }
            i3 = i7;
        }
        return i4;
    }

    /* JADX INFO: renamed from: to */
    private void m18219to() {
        C4444f9 c4444f9;
        C4481wp c4481wp;
        Queue queue = new Queue(this.f12234k4.m18187x1().m18482k4());
        for (int i = 0; i < this.f12234k4.m18187x1().m18482k4(); i++) {
            queue.enqueue(this.f12234k4.m18187x1().m18493x1(i));
        }
        int size = queue.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4474up c4474up = (C4474up) queue.dequeue();
            if (!c4474up.m18385kk()) {
                if (c4474up.m18388x1()[0] != null && c4474up.m18388x1()[1] != null && c4474up.m18388x1()[0].m18428kk() % 2 == 0 && c4474up.m18388x1()[1].m18428kk() % 2 == 0) {
                    C4477vh.m18398k4(this.f12234k4, c4474up, false);
                }
                if ((c4474up.m18388x1()[0] == null && c4474up.m18388x1()[1] != null && c4474up.m18388x1()[1].m18428kk() % 2 == 0) || (c4474up.m18388x1()[1] == null && c4474up.m18388x1()[0] != null && c4474up.m18388x1()[0].m18428kk() % 2 == 0)) {
                    C4477vh.m18398k4(this.f12234k4, c4474up, false);
                }
            }
        }
        int iM18482k4 = this.f12234k4.m18187x1().m18482k4();
        for (int i3 = 0; i3 < iM18482k4; i3++) {
            C4474up c4474upM18493x1 = this.f12234k4.m18187x1().m18493x1(i3);
            if (c4474upM18493x1.m18385kk() && c4474upM18493x1.m18388x1()[0] != null && c4474upM18493x1.m18388x1()[1] != null) {
                if (c4474upM18493x1.m18388x1()[0].m18428kk() % 2 == 0) {
                    c4444f9 = this.f12234k4;
                    c4481wp = c4474upM18493x1.m18388x1()[0];
                } else if (c4474upM18493x1.m18388x1()[1].m18428kk() % 2 == 0) {
                    c4444f9 = this.f12234k4;
                    c4481wp = c4474upM18493x1.m18388x1()[1];
                }
                C4477vh.m18399k4(c4444f9, c4481wp, true);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private int m18220x1() {
        if (this.f12234k4.m18180du() == null) {
            return -1;
        }
        int iM18217kk = m18217kk();
        m18219to();
        return iM18217kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4445fa m18222k4() {
        int[] iArr = {0};
        C4445fa c4445faM18213k4 = m18213k4(iArr);
        int i = iArr[0];
        return i <= 1 ? c4445faM18213k4 : m18212k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    private C4445fa m18212k4(int i) {
        int iM18321k4 = this.f12234k4.m18186to().m18321k4();
        for (int i2 = 0; i2 < iM18321k4; i2++) {
            this.f12234k4.m18186to().m18327x1(i2).m18426k4(-1);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < iM18321k4; i4++) {
            if (this.f12234k4.m18186to().m18327x1(i4).m18428kk() == -1) {
                m18216k4(this.f12234k4.m18186to().m18327x1(i4), i3);
                i3++;
            }
        }
        C4432bs c4432bsM18221x1 = m18221x1(i);
        C4455ks c4455ksM18218kk = m18218kk(i);
        C4445fa c4445fa = new C4445fa(i);
        for (int i5 = 0; i5 < i; i5++) {
            C4438ck c4438ck = new C4438ck(c4432bsM18221x1.m18072k4(i5), c4455ksM18218kk.m18244k4(i5));
            new C4451jd(c4438ck).m18220x1();
            c4445fa.m18190k4(c4438ck);
        }
        return c4445fa;
    }

    /* JADX INFO: renamed from: kk */
    private C4455ks m18218kk(int i) {
        int iM18428kk;
        C4455ks c4455ks = new C4455ks(i);
        for (int i2 = 0; i2 < i; i2++) {
            c4455ks.m18246k4(new C4488yj());
        }
        int iM18482k4 = this.f12234k4.m18187x1().m18482k4();
        for (int i3 = 0; i3 < iM18482k4; i3++) {
            if (this.f12234k4.m18187x1().m18493x1(i3).m18385kk()) {
                C4474up c4474upM18493x1 = this.f12234k4.m18187x1().m18493x1(i3);
                C4481wp c4481wp = c4474upM18493x1.m18388x1()[0];
                C4481wp c4481wp2 = c4474upM18493x1.m18388x1()[1];
                if (c4481wp == null || c4481wp2 == null) {
                    if (c4481wp == null || c4481wp2 != null) {
                        if (c4481wp != null || c4481wp2 == null) {
                        }
                        iM18428kk = c4481wp2.m18428kk();
                    }
                    iM18428kk = c4481wp.m18428kk();
                } else {
                    if (c4481wp.m18428kk() != c4481wp2.m18428kk()) {
                        m18215k4(c4455ks, c4474upM18493x1, c4481wp.m18428kk());
                        iM18428kk = c4481wp2.m18428kk();
                    }
                    iM18428kk = c4481wp.m18428kk();
                }
                m18215k4(c4455ks, c4474upM18493x1, iM18428kk);
            }
        }
        return c4455ks;
    }

    /* JADX INFO: renamed from: x1 */
    private C4432bs m18221x1(int i) {
        C4432bs c4432bs = new C4432bs(i);
        for (int i2 = 0; i2 < i; i2++) {
            c4432bs.m18073k4(new C4437ca());
        }
        List list = new List();
        int iM18116k4 = this.f12234k4.m18182k4().m18116k4();
        for (int i3 = 0; i3 < iM18116k4; i3++) {
            list.clear();
            int iM18321k4 = this.f12234k4.m18182k4().m18125x1(i3).m18309to().m18321k4();
            for (int i4 = 0; i4 < iM18321k4; i4++) {
                if (list.indexOf(Integer.valueOf(this.f12234k4.m18182k4().m18125x1(i3).m18309to().m18327x1(i4).m18428kk())) == -1) {
                    list.addItem(Integer.valueOf(this.f12234k4.m18182k4().m18125x1(i3).m18309to().m18327x1(i4).m18428kk()));
                }
            }
            int size = list.size();
            this.f12234k4.m18182k4().m18125x1(i3).m18305k4(new C4463ri[i]);
            for (int i5 = 0; i5 < size; i5++) {
                C4463ri c4463ri = new C4463ri(this.f12234k4.m18182k4().m18125x1(i3));
                this.f12234k4.m18182k4().m18125x1(i3).m18302h4()[((Integer) list.get_Item(i5)).intValue()] = c4463ri;
                c4432bs.m18072k4(((Integer) list.get_Item(i5)).intValue()).m18121k4(c4463ri);
            }
        }
        return c4432bs;
    }

    /* JADX INFO: renamed from: k4 */
    private C4445fa m18213k4(int[] iArr) {
        int iM18220x1 = m18220x1();
        iArr[0] = iM18220x1;
        if (iM18220x1 != 1 && iM18220x1 != 0) {
            return null;
        }
        C4445fa c4445fa = new C4445fa(1);
        c4445fa.m18190k4(this.f12234k4.m18181h4());
        return c4445fa;
    }

    /* JADX INFO: renamed from: k4 */
    private C4481wp m18214k4(C4455ks c4455ks, int i, int i2) {
        return c4455ks.m18244k4(i).m18493x1(i2).m18388x1()[1].m18428kk() == -1 ? c4455ks.m18244k4(i).m18493x1(i2).m18388x1()[1] : c4455ks.m18244k4(i).m18493x1(i2).m18388x1()[0].m18428kk() == -1 ? c4455ks.m18244k4(i).m18493x1(i2).m18388x1()[0] : null;
    }

    /* JADX INFO: renamed from: k4 */
    private void m18215k4(C4455ks c4455ks, C4474up c4474up, int i) {
        if (c4474up.m18384k4()[0].m18302h4()[i].m18306k4(c4474up.m18384k4()[1].m18302h4()[i])) {
            return;
        }
        c4455ks.m18244k4(i).m18485k4(new C4474up(c4474up.m18384k4()[0].m18302h4()[i], c4474up.m18384k4()[1].m18302h4()[i]));
    }

    /* JADX INFO: renamed from: k4 */
    private void m18216k4(C4481wp c4481wp, int i) {
        C4481wp c4481wpM18382k4;
        C4454kp c4454kp = new C4454kp(this.f12234k4.m18186to().m18321k4());
        c4481wp.m18426k4(i);
        C4481wp c4481wpM18242k4 = c4481wp;
        int i2 = 0;
        while (true) {
            for (int i3 = 0; i3 < 3; i3++) {
                if (!c4481wpM18242k4.m18432x1()[i3].m18385kk() && (c4481wpM18382k4 = c4481wpM18242k4.m18432x1()[i3].m18382k4(c4481wpM18242k4)) != null && c4481wpM18382k4.m18428kk() == -1) {
                    c4481wpM18382k4.m18426k4(i);
                    c4454kp.m18243k4(c4481wpM18382k4);
                    i2++;
                }
            }
            i2--;
            if (i2 < 0) {
                c4481wp.m18426k4(i);
                return;
            }
            c4481wpM18242k4 = c4454kp.m18242k4();
        }
    }
}
