package com.aspose.slides.internal.p409sv;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p023ak.C1389to;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p111em.InterfaceC3760kk;
import com.aspose.slides.internal.p150gi.C4265c5;
import com.aspose.slides.internal.p150gi.C4270dy;
import com.aspose.slides.internal.p150gi.C4272f9;
import com.aspose.slides.internal.p150gi.C4279jd;
import com.aspose.slides.internal.p150gi.C4290rv;
import com.aspose.slides.internal.p150gi.InterfaceC4260ak;
import com.aspose.slides.internal.p455v4.InterfaceC11601k4;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.sv.kk */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10779kk extends AbstractC3524ks implements InterfaceC4260ak {

    /* JADX INFO: renamed from: c5 */
    private InterfaceC1984kk f37714c5;

    /* JADX INFO: renamed from: ck */
    private InterfaceC1984kk f37715ck;

    /* JADX INFO: renamed from: dy */
    private C4279jd f37716dy;

    /* JADX INFO: renamed from: fa */
    private int f37717fa;

    /* JADX INFO: renamed from: h4 */
    private C4270dy f37718h4;

    /* JADX INFO: renamed from: jd */
    private int f37719jd;

    /* JADX INFO: renamed from: ks */
    private String f37720ks;

    /* JADX INFO: renamed from: m9 */
    private C4265c5 f37721m9;

    /* JADX INFO: renamed from: rv */
    private C4290rv f37722rv;

    /* JADX INFO: renamed from: up */
    private InterfaceC11601k4 f37723up;

    /* JADX INFO: renamed from: x6 */
    private C12003du f37724x6;

    /* JADX INFO: renamed from: yj */
    private C4272f9 f37725yj;

    public AbstractC10779kk(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f37724x6 = new C12003du();
    }

    /* JADX INFO: renamed from: bz */
    public final C12003du m52271bz() {
        return this.f37724x6;
    }

    /* JADX INFO: renamed from: e0 */
    public final C4279jd m52272e0() {
        return this.f37716dy;
    }

    /* JADX INFO: renamed from: f9 */
    public final String m52273f9() {
        return this.f37720ks;
    }

    /* JADX INFO: renamed from: g8 */
    public final InterfaceC11601k4 m52274g8() {
        return this.f37723up;
    }

    /* JADX INFO: renamed from: gi */
    public final C4265c5 m52275gi() {
        return this.f37721m9;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public Stack<C1389to> mo14086k4(Stack<C1389to> stack, C1389to c1389to) {
        if (c1389to != null) {
            c1389to.m8274k4((char) 65532, (AbstractC3511c5) this);
        }
        return stack;
    }

    /* JADX INFO: renamed from: kp */
    public final int m52276kp() {
        return this.f37717fa;
    }

    /* JADX INFO: renamed from: qm */
    public final C4290rv m52277qm() {
        return this.f37722rv;
    }

    /* JADX INFO: renamed from: s7 */
    public final C4272f9 m52278s7() {
        return this.f37725yj;
    }

    /* JADX INFO: renamed from: ss */
    public final InterfaceC1984kk m52279ss() {
        return this.f37715ck;
    }

    /* JADX INFO: renamed from: sv */
    public final InterfaceC1984kk m52280sv() {
        return this.f37714c5;
    }

    @Override // com.aspose.slides.internal.p150gi.InterfaceC4260ak
    /* JADX INFO: renamed from: ts */
    public final C4270dy mo17117ts() {
        return this.f37718h4;
    }

    /* JADX INFO: renamed from: wp */
    public final int m52281wp() {
        return this.f37719jd;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f37718h4 = C4270dy.m17199k4(abstractC3533um);
        this.f37721m9 = abstractC3533um.m14401to();
        this.f37716dy = abstractC3533um.m14384ck();
        this.f37714c5 = abstractC3533um.m14402to(3).mo9877dy();
        this.f37719jd = abstractC3533um.m14402to(4).mo17251du();
        this.f37715ck = abstractC3533um.m14402to(15).mo9877dy();
        this.f37717fa = abstractC3533um.m14402to(88).mo17251du();
        this.f37725yj = abstractC3533um.m14402to(144).mo17204rv();
        this.f37720ks = abstractC3533um.m14402to(198).mo9926j_();
        this.f37722rv = abstractC3533um.m14388fa();
        abstractC3533um.m14402to(72).mo9923k4(m14111q_()).CloneTo(this.f37724x6);
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
        this.f37723up = interfaceC11601k4;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14098k4(String str, InterfaceC3757h4 interfaceC3757h4, InterfaceC3760kk interfaceC3760kk, AbstractC3533um abstractC3533um) {
        super.mo14098k4(str, interfaceC3757h4, interfaceC3760kk, abstractC3533um);
        if (mo14110p_() || !C14113y2.m67411k4(this.f37720ks)) {
            return;
        }
        m14104kk("ref-id");
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public boolean mo14101k4(int i) {
        return false;
    }
}
