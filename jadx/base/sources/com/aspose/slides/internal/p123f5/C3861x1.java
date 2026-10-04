package com.aspose.slides.internal.p123f5;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.OooO;
import com.aspose.slides.internal.p086dl.C3180k4;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p146g9.C4230to;
import com.aspose.slides.internal.p276ml.AbstractC6397x1;
import com.aspose.slides.internal.p276ml.C6396k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p454v0.C11600k4;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.f5.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C3861x1 {

    /* JADX INFO: renamed from: k4 */
    private C11600k4 f10577k4;

    /* JADX INFO: renamed from: x1 */
    private C3858kk f10579x1 = null;

    /* JADX INFO: renamed from: kk */
    private C12023wl f10578kk = new C12023wl();

    public C3861x1(C11600k4 c11600k4, C4230to c4230to) {
        this.f10577k4 = c11600k4;
        c4230to.m17058to().CloneTo(this.f10578kk);
    }

    /* JADX INFO: renamed from: k4 */
    private float m15560k4(int i) {
        return (i / this.f10577k4.mo13500c5()) * 96.0f;
    }

    /* JADX INFO: renamed from: x1 */
    private C3858kk m15562x1() {
        int iM67483k4;
        int iM67483k42;
        C4047sv c4047sv;
        boolean z = true;
        C3856h4 c3856h4 = new C3856h4(this.f10577k4.mo13625x1() == 2);
        C3857k4 c3857k4 = new C3857k4();
        C12009k4 c12009k4 = new C12009k4(this.f10578kk.m56865x1(), this.f10578kk.m56862kk());
        try {
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
            try {
                c3856h4.m15500k4(new Object[this.f10577k4.m54628ck().m16111h4()]);
                c3856h4.m15484k4(8);
                c3856h4.m15532x1(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()));
                c3856h4.m15489k4(c3856h4.m15501kk().Clone());
                IGenericEnumerator<C12535to> it = this.f10577k4.m58364k4().iterator();
                do {
                    try {
                        if (!it.hasNext()) {
                            break;
                        }
                        c4047sv = (C4047sv) it.next();
                        AbstractC6397x1 abstractC6397x1M26251k4 = C6396k4.m26251k4(c4047sv.m16063ks());
                        C3857k4 c3857k4M15543kk = abstractC6397x1M26251k4 == null ? C3857k4.m15543kk() : abstractC6397x1M26251k4.mo26252k4(c4047sv, abstractC12008jdM56582k4, c3856h4);
                        if (c3857k4M15543kk.m15546x1()) {
                            C12014ne c12014neClone = c3857k4M15543kk.m15544k4().Clone();
                            c12014neClone.m56672k4(c3856h4.m15459ak().Clone());
                            if (c3857k4.m15546x1()) {
                                c3857k4.m15545k4(C12014ne.m56662x1(m15561k4(c12014neClone.Clone(), abstractC12008jdM56582k4, c3856h4).Clone(), c3857k4.m15544k4().Clone()).Clone());
                            } else {
                                c3857k4 = new C3857k4(m15561k4(c12014neClone.Clone(), abstractC12008jdM56582k4, c3856h4).Clone());
                            }
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                } while (c4047sv.m16063ks() != 0);
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                C3180k4[] c3180k4ArrM54633ks = this.f10577k4.m54633ks();
                if (c3180k4ArrM54633ks.length > 0) {
                    iM67483k4 = 0;
                    iM67483k42 = 0;
                    for (C3180k4 c3180k4 : c3180k4ArrM54633ks) {
                        iM67483k4 = C14116yg.m67483k4(iM67483k4, c3180k4.mo13502h4());
                        iM67483k42 = C14116yg.m67483k4(iM67483k42, c3180k4.mo13504m9());
                    }
                } else {
                    z = false;
                    iM67483k4 = 0;
                    iM67483k42 = 0;
                }
                C12014ne c12014neClone2 = c3856h4.m15526x1().Clone();
                if (c12014neClone2.m56663c5() < 0) {
                    c12014neClone2.m56676kk(c12014neClone2.m56669jd() + c12014neClone2.m56663c5());
                    c12014neClone2.m56684x1(-c12014neClone2.m56663c5());
                }
                if (c12014neClone2.m56683x1() < 0) {
                    c12014neClone2.m56682to(c12014neClone2.m56664ck() + c12014neClone2.m56683x1());
                    c12014neClone2.m56671k4(-c12014neClone2.m56683x1());
                }
                if (!c3857k4.m15546x1()) {
                    C3858kk c3858kk = new C3858kk(C12014ne.m56661x1(C12007ix.m56544k4(c12014neClone2).Clone()).Clone(), new C12014ne(0, 0, 2, 2));
                    if (abstractC12008jdM56582k4 != null) {
                        abstractC12008jdM56582k4.dispose();
                    }
                    return c3858kk;
                }
                if (z) {
                    C3858kk c3858kk2 = new C3858kk(C12014ne.m56661x1(C12007ix.m56544k4(c12014neClone2).Clone()).Clone(), new C12014ne(0, 0, iM67483k4, iM67483k42));
                    if (abstractC12008jdM56582k4 != null) {
                        abstractC12008jdM56582k4.dispose();
                    }
                    return c3858kk2;
                }
                if (c3857k4.m15544k4().m56679kk()) {
                    C3858kk c3858kk3 = new C3858kk(c12014neClone2.Clone(), c3856h4.m15501kk().Clone());
                    if (abstractC12008jdM56582k4 != null) {
                        abstractC12008jdM56582k4.dispose();
                    }
                    return c3858kk3;
                }
                C3858kk c3858kk4 = new C3858kk(c12014neClone2.Clone(), c12014neClone2.Clone(), c3856h4.m15501kk().Clone(), c3857k4.m15544k4().Clone());
                if (abstractC12008jdM56582k4 != null) {
                    abstractC12008jdM56582k4.dispose();
                }
                return c3858kk4;
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
    public final C3858kk m15563k4() {
        if (this.f10579x1 == null) {
            if (this.f10577k4.m54629fa() != null) {
                C12014ne c12014neClone = this.f10577k4.m54629fa().m16098x1().m57807h4().Clone();
                if (c12014neClone.m56663c5() != 0 && c12014neClone.m56683x1() != 0) {
                    return new C3858kk(c12014neClone.Clone(), new C12014ne(0, 0, OooO.OooO00o(m15560k4(c12014neClone.m56663c5()), 14), OooO.OooO00o(m15560k4(c12014neClone.m56683x1()), 14)));
                }
            }
            this.f10579x1 = m15562x1();
        }
        return this.f10579x1;
    }

    /* JADX INFO: renamed from: k4 */
    private C12014ne m15561k4(C12014ne c12014ne, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C12018u4 c12018u4 = new C12018u4(c12014ne.Clone());
        c12018u4.m56771x1(c3856h4.m15466c6());
        return C12014ne.m56661x1(c12018u4.m56749k4(abstractC12008jd).Clone());
    }
}
