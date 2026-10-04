package com.aspose.slides.internal.p441ui;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.OooO;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p186in.C5105k4;
import com.aspose.slides.internal.p214k0.C5569to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p374qz.C9966k4;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p533yv.C13335k4;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ui.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C11320x1 {

    /* JADX INFO: renamed from: k4 */
    private C5105k4 f38991k4;

    /* JADX INFO: renamed from: x1 */
    private C11317kk f38993x1 = null;

    /* JADX INFO: renamed from: kk */
    private C12023wl f38992kk = new C12023wl();

    public C11320x1(C5105k4 c5105k4, C5569to c5569to) {
        this.f38991k4 = c5105k4;
        c5569to.m22901kk().CloneTo(this.f38992kk);
    }

    /* JADX INFO: renamed from: k4 */
    private float m54486k4(int i) {
        return (i / this.f38991k4.mo21939c5()) * 96.0f;
    }

    /* JADX INFO: renamed from: x1 */
    private C11317kk m54488x1() {
        int iM67483k4;
        int iM67483k42;
        C1752sv c1752sv;
        boolean z = true;
        C11315h4 c11315h4 = new C11315h4(this.f38991k4.mo12733x1() == 2);
        C11316k4 c11316k4 = new C11316k4();
        C12009k4 c12009k4 = new C12009k4(this.f38992kk.m56865x1(), this.f38992kk.m56862kk());
        try {
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
            try {
                c11315h4.m54430k4(new Object[this.f38991k4.m21944jd().m9444h4()]);
                c11315h4.m54414k4(8);
                c11315h4.m54461x1(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()));
                c11315h4.m54420k4(c11315h4.m54431kk().Clone());
                IGenericEnumerator<C3023to> it = this.f38991k4.m12729k4().iterator();
                do {
                    try {
                        if (!it.hasNext()) {
                            break;
                        }
                        c1752sv = (C1752sv) it.next();
                        C11316k4 c11316k4Mo23714k4 = C13335k4.m61989k4(c1752sv.m9405yj()).mo23714k4(c1752sv, abstractC12008jdM56582k4, c11315h4);
                        if (c11316k4Mo23714k4.m54474x1()) {
                            C12014ne c12014neClone = c11316k4Mo23714k4.m54472k4().Clone();
                            c12014neClone.m56672k4(c11315h4.m54393b3().Clone());
                            if (c11316k4.m54474x1()) {
                                c11316k4.m54473k4(C12014ne.m56662x1(m54487k4(c12014neClone.Clone(), abstractC12008jdM56582k4, c11315h4).Clone(), c11316k4.m54472k4().Clone()).Clone());
                            } else {
                                c11316k4 = new C11316k4(m54487k4(c12014neClone.Clone(), abstractC12008jdM56582k4, c11315h4).Clone());
                            }
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                } while (c1752sv.m9405yj() != 0);
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                C9966k4[] c9966k4ArrM21951yj = this.f38991k4.m21951yj();
                if (c9966k4ArrM21951yj.length > 0) {
                    iM67483k4 = 0;
                    iM67483k42 = 0;
                    for (C9966k4 c9966k4 : c9966k4ArrM21951yj) {
                        iM67483k4 = C14116yg.m67483k4(iM67483k4, c9966k4.mo21943h4());
                        iM67483k42 = C14116yg.m67483k4(iM67483k42, c9966k4.mo21949m9());
                    }
                } else {
                    z = false;
                    iM67483k4 = 0;
                    iM67483k42 = 0;
                }
                C12014ne c12014neClone2 = c11315h4.m54456x1().Clone();
                if (c12014neClone2.m56663c5() < 0) {
                    c12014neClone2.m56676kk(c12014neClone2.m56669jd() + c12014neClone2.m56663c5());
                    c12014neClone2.m56684x1(-c12014neClone2.m56663c5());
                }
                if (c12014neClone2.m56683x1() < 0) {
                    c12014neClone2.m56682to(c12014neClone2.m56664ck() + c12014neClone2.m56683x1());
                    c12014neClone2.m56671k4(-c12014neClone2.m56683x1());
                }
                if (!c11316k4.m54474x1()) {
                    C11317kk c11317kk = new C11317kk(C12014ne.m56661x1(C12007ix.m56544k4(c12014neClone2).Clone()).Clone(), new C12014ne(0, 0, 2, 2));
                    if (abstractC12008jdM56582k4 != null) {
                        abstractC12008jdM56582k4.dispose();
                    }
                    return c11317kk;
                }
                if (z) {
                    C11317kk c11317kk2 = new C11317kk(C12014ne.m56661x1(C12007ix.m56544k4(c12014neClone2).Clone()).Clone(), new C12014ne(0, 0, iM67483k4, iM67483k42));
                    if (abstractC12008jdM56582k4 != null) {
                        abstractC12008jdM56582k4.dispose();
                    }
                    return c11317kk2;
                }
                if (c11316k4.m54472k4().m56679kk()) {
                    C11317kk c11317kk3 = new C11317kk(c12014neClone2.Clone(), c11315h4.m54431kk().Clone());
                    if (abstractC12008jdM56582k4 != null) {
                        abstractC12008jdM56582k4.dispose();
                    }
                    return c11317kk3;
                }
                C11317kk c11317kk4 = new C11317kk(c12014neClone2.Clone(), c12014neClone2.Clone(), c11315h4.m54431kk().Clone(), c11316k4.m54472k4().Clone());
                if (abstractC12008jdM56582k4 != null) {
                    abstractC12008jdM56582k4.dispose();
                }
                return c11317kk4;
            } catch (Throwable th) {
                if (abstractC12008jdM56582k4 != null) {
                    abstractC12008jdM56582k4.dispose();
                }
                throw th;
            }
        } finally {
            c12009k4.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C11317kk m54489k4() {
        if (this.f38993x1 == null) {
            if (this.f38991k4.m21940ck() != null) {
                C12014ne c12014neClone = this.f38991k4.m21940ck().m9425k4().m58223h4().Clone();
                if (c12014neClone.m56663c5() != 0 && c12014neClone.m56683x1() != 0) {
                    return new C11317kk(c12014neClone.Clone(), new C12014ne(0, 0, OooO.OooO00o(m54486k4(c12014neClone.m56663c5()), 14), OooO.OooO00o(m54486k4(c12014neClone.m56683x1()), 14)));
                }
            }
            this.f38993x1 = m54488x1();
        }
        return this.f38993x1;
    }

    /* JADX INFO: renamed from: k4 */
    private C12014ne m54487k4(C12014ne c12014ne, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        C12018u4 c12018u4 = new C12018u4(c12014ne.Clone());
        c12018u4.m56771x1(c11315h4.m54400dq());
        return C12014ne.m56661x1(c12018u4.m56749k4(abstractC12008jd).Clone());
    }
}
