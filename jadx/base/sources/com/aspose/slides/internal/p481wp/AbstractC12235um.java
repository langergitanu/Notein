package com.aspose.slides.internal.p481wp;

import com.aspose.slides.OooO;
import com.aspose.slides.internal.p057c6.C1978ck;
import com.aspose.slides.internal.p057c6.InterfaceC1986to;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p111em.InterfaceC3760kk;
import com.aspose.slides.internal.p150gi.AbstractC4275gi;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4265c5;
import com.aspose.slides.internal.p150gi.C4288qq;
import com.aspose.slides.internal.p150gi.C4293sv;
import com.aspose.slides.internal.p150gi.C4305wl;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p371qw.AbstractC9956kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.wp.um */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12235um extends AbstractC3524ks {

    /* JADX INFO: renamed from: c5 */
    private InterfaceC1986to f40728c5;

    /* JADX INFO: renamed from: ck */
    public C12233to f40729ck;

    /* JADX INFO: renamed from: dy */
    private InterfaceC1986to f40730dy;

    /* JADX INFO: renamed from: fa */
    public C12233to f40731fa;

    /* JADX INFO: renamed from: h4 */
    private InterfaceC1986to f40732h4;

    /* JADX INFO: renamed from: ks */
    public AbstractC9956kk f40733ks;

    /* JADX INFO: renamed from: m9 */
    private InterfaceC1986to f40734m9;

    /* JADX INFO: renamed from: up */
    public C12225k4 f40735up;

    /* JADX INFO: renamed from: yj */
    public C12225k4 f40736yj;

    /* JADX INFO: renamed from: com.aspose.slides.internal.wp.um$k4 */
    public static class k4 extends AbstractC4275gi implements Cloneable {
        public k4(int i) {
            super(i);
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: k4 */
        public AbstractC4282kp mo17212k4(AbstractC3533um abstractC3533um) {
            return C4293sv.m17271x1(((InterfaceC12224jd) abstractC3533um.m14393k4().m14115s_()).mo57053k4().m57057k4());
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: x1 */
        public AbstractC4282kp mo17139x1(AbstractC4282kp abstractC4282kp, AbstractC3533um abstractC3533um, AbstractC3524ks abstractC3524ks) {
            if (C7019kk.m27469x1(abstractC4282kp, C4288qq.class)) {
                return C4305wl.m17278k4(abstractC4282kp);
            }
            Object objMo9924m9 = abstractC4282kp.mo9924m9();
            if (objMo9924m9 == null) {
                return mo14303k4(abstractC4282kp, abstractC3533um, abstractC3524ks);
            }
            int iOooO00o = OooO.OooO00o(C7019kk.m27469x1(objMo9924m9, Float.class) ? ((Float) C7019kk.m27464to(objMo9924m9, Float.TYPE)).floatValue() : ((Integer) objMo9924m9).intValue(), 14);
            int iMo14084ix = abstractC3533um.m14393k4().mo14084ix();
            if (iOooO00o <= 0) {
                int iM57057k4 = (iMo14084ix == 75 || iMo14084ix == 76) ? ((InterfaceC12224jd) abstractC3533um.m14404x1()).mo57053k4().m57057k4() : 1;
                C12214ar.m56996k4(abstractC3524ks.m14111q_().m59580u4()).mo57005k4(this, abstractC3533um.m14393k4().m14105ks(), objMo9924m9, iM57057k4, abstractC3533um.m14393k4().m14106m_());
                iOooO00o = iM57057k4;
            }
            return C4293sv.m17271x1(iOooO00o);
        }

        @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
        /* JADX INFO: renamed from: k4 */
        public AbstractC4282kp mo14415k4(AbstractC3533um abstractC3533um, String str, AbstractC3524ks abstractC3524ks) {
            AbstractC4282kp abstractC4282kpMo14415k4 = super.mo14415k4(abstractC3533um, str, abstractC3524ks);
            int iMo9884to = abstractC4282kpMo14415k4.mo9878h4().mo9884to();
            int iMo9884to2 = abstractC3533um.m14402to(165).mo9878h4().mo9884to();
            int iMo14084ix = abstractC3533um.m14393k4().mo14084ix();
            if (iMo14084ix == 76 || iMo14084ix == 75) {
                C12226kk c12226kkMo57053k4 = ((InterfaceC12224jd) abstractC3533um.m14404x1()).mo57053k4();
                int i = (iMo9884to - 1) + iMo9884to2;
                while (iMo9884to <= i) {
                    if (c12226kkMo57053k4.m57060k4(iMo9884to)) {
                        C12214ar.m56996k4(abstractC3524ks.m14111q_().m59580u4()).mo57011x1(this, abstractC3533um.m14393k4().m14105ks(), iMo9884to, abstractC3533um.m14393k4().m14106m_());
                    }
                    iMo9884to++;
                }
            }
            return abstractC4282kpMo14415k4;
        }
    }

    public AbstractC12235um(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
    }

    /* JADX INFO: renamed from: du */
    private void m57119du(int i) {
        C12225k4 c12225k4 = new C12225k4(mo57067vj().m17155k4(i), mo14084ix());
        if (i == 0) {
            this.f40729ck = new C12233to(c12225k4, this.f40733ks);
            return;
        }
        if (i == 1) {
            this.f40731fa = new C12233to(c12225k4, this.f40733ks);
        } else if (i == 2) {
            this.f40735up = c12225k4;
        } else {
            if (i != 3) {
                return;
            }
            this.f40736yj = c12225k4;
        }
    }

    /* JADX INFO: renamed from: e0 */
    public C12232rv mo57086e0() {
        return ((AbstractC12235um) this.f9752k4).mo57086e0();
    }

    /* JADX INFO: renamed from: he */
    public final void m57120he() {
        m57119du(2);
        m57119du(3);
        m57119du(0);
        m57119du(1);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f40732h4 = abstractC3533um.m14402to(20).mo9878h4();
        this.f40734m9 = abstractC3533um.m14402to(24).mo9878h4();
        this.f40730dy = abstractC3533um.m14402to(34).mo9878h4();
        this.f40728c5 = abstractC3533um.m14402to(48).mo9878h4();
        if (mo14084ix() == 71 || mo14084ix() == 75 || !mo57067vj().m17157k4(C1978ck.m10100k4())) {
            return;
        }
        C12214ar.m56996k4(m14111q_().m59580u4()).mo57008kk(this, m14105ks(), m14106m_());
    }

    /* JADX INFO: renamed from: vj */
    public abstract C4265c5 mo57067vj();

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14098k4(String str, InterfaceC3757h4 interfaceC3757h4, InterfaceC3760kk interfaceC3760kk, AbstractC3533um abstractC3533um) {
        super.mo14098k4(str, interfaceC3757h4, interfaceC3760kk, abstractC3533um);
        C12232rv c12232rvMo57086e0 = mo57086e0();
        if (mo14110p_() || c12232rvMo57086e0.m57102zj()) {
            return;
        }
        this.f40733ks = AbstractC9956kk.m48996k4(c12232rvMo57086e0.m57087em());
        m57120he();
    }
}
