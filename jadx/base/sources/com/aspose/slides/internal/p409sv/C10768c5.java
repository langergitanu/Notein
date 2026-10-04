package com.aspose.slides.internal.p409sv;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p023ak.C1389to;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3523kk;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4265c5;
import com.aspose.slides.internal.p150gi.C4266c6;
import com.aspose.slides.internal.p150gi.C4267ck;
import com.aspose.slides.internal.p150gi.C4272f9;
import com.aspose.slides.internal.p150gi.C4279jd;
import com.aspose.slides.internal.p150gi.C4290rv;
import com.aspose.slides.internal.p455v4.InterfaceC11601k4;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.StyleIdentifier;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: com.aspose.slides.internal.sv.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C10768c5 extends AbstractC3524ks {

    /* JADX INFO: renamed from: c5 */
    private InterfaceC1984kk f37612c5;

    /* JADX INFO: renamed from: ck */
    private InterfaceC1984kk f37613ck;

    /* JADX INFO: renamed from: dy */
    private C4267ck f37614dy;

    /* JADX INFO: renamed from: fa */
    private char f37615fa;

    /* JADX INFO: renamed from: h4 */
    private C4265c5 f37616h4;

    /* JADX INFO: renamed from: ix */
    private C4290rv f37617ix;

    /* JADX INFO: renamed from: jd */
    private int f37618jd;

    /* JADX INFO: renamed from: ks */
    private C4266c6 f37619ks;

    /* JADX INFO: renamed from: m9 */
    private C4279jd f37620m9;

    /* JADX INFO: renamed from: ne */
    private C4272f9 f37621ne;

    /* JADX INFO: renamed from: rv */
    private C4266c6 f37622rv;

    /* JADX INFO: renamed from: u4 */
    private AbstractC4282kp f37623u4;

    /* JADX INFO: renamed from: up */
    private C12003du f37624up;

    /* JADX INFO: renamed from: uz */
    private InterfaceC11601k4 f37625uz;

    /* JADX INFO: renamed from: x6 */
    private AbstractC4282kp f37626x6;

    /* JADX INFO: renamed from: yj */
    private int f37627yj;

    /* JADX INFO: renamed from: com.aspose.slides.internal.sv.c5$k4 */
    public static class k4 extends AbstractC3523kk {

        /* JADX INFO: renamed from: k4 */
        private boolean f37628k4 = true;

        /* JADX INFO: renamed from: x1 */
        private C10768c5 f37629x1;

        public k4(C10768c5 c10768c5) {
            this.f37629x1 = c10768c5;
        }

        @Override // com.aspose.slides.internal.p097e0.AbstractC3523kk, com.aspose.slides.internal.p048bv.InterfaceC1870up
        /* JADX INFO: renamed from: k4 */
        public void mo9758k4() {
            C10768c5 c10768c5 = this.f37629x1;
            c10768c5.f9752k4.mo14121x1(c10768c5);
        }

        @Override // com.aspose.slides.internal.p097e0.AbstractC3523kk
        /* JADX INFO: renamed from: to */
        public char mo14069to() {
            if (!this.f37628k4) {
                throw new Exception("The character element not found");
            }
            this.f37628k4 = false;
            return this.f37629x1.f37615fa;
        }

        @Override // com.aspose.slides.internal.p097e0.AbstractC3523kk, com.aspose.slides.internal.p048bv.InterfaceC1870up
        /* JADX INFO: renamed from: x1 */
        public boolean mo9764x1() {
            return this.f37628k4;
        }

        @Override // com.aspose.slides.internal.p097e0.AbstractC3523kk
        /* JADX INFO: renamed from: k4 */
        public void mo14067k4(char c) {
            this.f37629x1.f37615fa = c;
        }
    }

    public C10768c5(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f37624up = new C12003du();
    }

    /* JADX INFO: renamed from: bz */
    public final C4267ck m52198bz() {
        return this.f37614dy;
    }

    /* JADX INFO: renamed from: e0 */
    public final C4279jd m52199e0() {
        return this.f37620m9;
    }

    /* JADX INFO: renamed from: f9 */
    public final InterfaceC11601k4 m52200f9() {
        return this.f37625uz;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: fa */
    public AbstractC3523kk mo14082fa() {
        return new k4(this);
    }

    /* JADX INFO: renamed from: g8 */
    public final C12003du m52201g8() {
        return this.f37624up;
    }

    /* JADX INFO: renamed from: gi */
    public final AbstractC4282kp m52202gi() {
        return this.f37626x6;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        super.mo14083h4();
        mo14107n_().mo14174k4(this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 10;
    }

    /* JADX INFO: renamed from: kp */
    public final int m52203kp() {
        return this.f37627yj;
    }

    /* JADX INFO: renamed from: qm */
    public final char m52204qm() {
        return this.f37615fa;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return FirebaseAnalytics.Param.CHARACTER;
    }

    /* JADX INFO: renamed from: s7 */
    public final C4290rv m52205s7() {
        return this.f37617ix;
    }

    /* JADX INFO: renamed from: ss */
    public final InterfaceC1984kk m52206ss() {
        return this.f37613ck;
    }

    /* JADX INFO: renamed from: sv */
    public final InterfaceC1984kk m52207sv() {
        return this.f37612c5;
    }

    /* JADX INFO: renamed from: ts */
    public final C4265c5 m52208ts() {
        return this.f37616h4;
    }

    /* JADX INFO: renamed from: wp */
    public final int m52209wp() {
        return this.f37618jd;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public Stack<C1389to> mo14086k4(Stack<C1389to> stack, C1389to c1389to) {
        if (c1389to != null) {
            c1389to.m8275k4(mo14082fa(), this);
        }
        return stack;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f37616h4 = abstractC3533um.m14401to();
        this.f37620m9 = abstractC3533um.m14384ck();
        this.f37614dy = abstractC3533um.m14389h4();
        this.f37612c5 = abstractC3533um.m14402to(3).mo9877dy();
        this.f37618jd = abstractC3533um.m14402to(4).mo17251du();
        this.f37613ck = abstractC3533um.m14402to(15).mo9877dy();
        this.f37615fa = abstractC3533um.m14402to(69).mo17252h_();
        abstractC3533um.m14402to(72).mo9923k4(m14111q_()).CloneTo(this.f37624up);
        this.f37627yj = abstractC3533um.m14402to(88).mo17251du();
        this.f37619ks = abstractC3533um.m14402to(132).mo17190up();
        this.f37622rv = abstractC3533um.m14402to(133).mo17190up();
        this.f37626x6 = abstractC3533um.m14402to(141);
        this.f37621ne = abstractC3533um.m14402to(144).mo17204rv();
        this.f37617ix = abstractC3533um.m14388fa();
        this.f37623u4 = abstractC3533um.m14402to(StyleIdentifier.BIBLIOGRAPHY);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            m14103kk(interfaceC3757h4, str, str2);
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14097k4(InterfaceC11601k4 interfaceC11601k4) {
        this.f37625uz = interfaceC11601k4;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public boolean mo14101k4(int i) {
        return false;
    }
}
