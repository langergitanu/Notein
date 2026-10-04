package com.aspose.slides.internal.p481wp;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p111em.InterfaceC3760kk;
import com.aspose.slides.internal.p150gi.C4264bz;
import com.aspose.slides.internal.p150gi.C4265c5;
import com.aspose.slides.internal.p150gi.C4266c6;
import com.aspose.slides.internal.p150gi.InterfaceC4307wy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.wp.yd */
/* JADX INFO: loaded from: classes5.dex */
public class C12243yd extends AbstractC12237uz implements InterfaceC4307wy {

    /* JADX INFO: renamed from: c5 */
    private C4265c5 f40792c5;

    /* JADX INFO: renamed from: dy */
    private C4264bz f40793dy;

    /* JADX INFO: renamed from: ix */
    private C4266c6 f40794ix;

    /* JADX INFO: renamed from: jd */
    private int f40795jd;

    /* JADX INFO: renamed from: ne */
    private C4266c6 f40796ne;

    /* JADX INFO: renamed from: rv */
    private int f40797rv;

    /* JADX INFO: renamed from: u4 */
    private C4266c6 f40798u4;

    /* JADX INFO: renamed from: x6 */
    private InterfaceC1984kk f40799x6;

    public C12243yd(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12237uz
    /* JADX INFO: renamed from: bz */
    public AbstractC12228lr mo57061bz() {
        return (AbstractC12228lr) this.f9752k4;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        super.mo14081dy();
        mo14107n_().mo14222x1(this);
    }

    /* JADX INFO: renamed from: g8 */
    public final C4266c6 m57188g8() {
        return this.f40794ix;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        super.mo14083h4();
        mo14107n_().mo14196k4(this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 79;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14089k4(AbstractC3511c5 abstractC3511c5) {
        if (!mo14110p_()) {
            m57147k4((C12234u4) abstractC3511c5, ((AbstractC12228lr) m14115s_()).m57064k4(this));
        }
        super.mo14089k4(abstractC3511c5);
    }

    /* JADX INFO: renamed from: kp */
    public final C4264bz m57189kp() {
        return this.f40793dy;
    }

    /* JADX INFO: renamed from: qm */
    public final C4266c6 m57190qm() {
        return this.f40798u4;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: r_ */
    public void mo14113r_() {
        if (this.f9851to == null) {
            m14123x1("(table-cell+)");
        }
        if (mo14110p_()) {
            return;
        }
        ((AbstractC12237uz) this).f40750h4 = null;
        ((AbstractC12237uz) this).f40751m9 = null;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "table-row";
    }

    @Override // com.aspose.slides.internal.p150gi.InterfaceC4307wy
    /* JADX INFO: renamed from: ss */
    public final int mo17279ss() {
        return this.f40797rv;
    }

    /* JADX INFO: renamed from: sv */
    public final C4266c6 m57191sv() {
        return this.f40796ne;
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12235um
    /* JADX INFO: renamed from: vj */
    public C4265c5 mo57067vj() {
        return this.f40792c5;
    }

    @Override // com.aspose.slides.internal.p150gi.InterfaceC4307wy
    /* JADX INFO: renamed from: wp */
    public final int mo17280wp() {
        return this.f40795jd;
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12237uz, com.aspose.slides.internal.p481wp.AbstractC12235um, com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        this.f40793dy = abstractC3533um.m14402to(17).mo17130k_();
        this.f40792c5 = abstractC3533um.m14401to();
        this.f40795jd = abstractC3533um.m14402to(58).mo17251du();
        this.f40797rv = abstractC3533um.m14402to(59).mo17251du();
        this.f40799x6 = abstractC3533um.m14402to(115).mo9877dy();
        this.f40796ne = abstractC3533um.m14402to(131).mo17190up();
        this.f40794ix = abstractC3533um.m14402to(132).mo17190up();
        this.f40798u4 = abstractC3533um.m14402to(133).mo17190up();
        super.mo14090k4(abstractC3533um);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            if (C14113y2.m67363du(str2, RequestParameters.MARKER)) {
                if (this.f9851to != null) {
                    m14122x1(interfaceC3757h4, "fo:marker", "(table-cell+)");
                }
            } else {
                if (C14113y2.m67363du(str2, "table-cell")) {
                    return;
                }
                m14103kk(interfaceC3757h4, str, str2);
            }
        }
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12235um, com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14098k4(String str, InterfaceC3757h4 interfaceC3757h4, InterfaceC3760kk interfaceC3760kk, AbstractC3533um abstractC3533um) {
        super.mo14098k4(str, interfaceC3757h4, interfaceC3760kk, abstractC3533um);
        if (mo14110p_()) {
            return;
        }
        AbstractC12228lr abstractC12228lr = (AbstractC12228lr) this.f9752k4;
        ((AbstractC12237uz) this).f40750h4 = ((AbstractC12237uz) abstractC12228lr).f40750h4;
        ((AbstractC12237uz) this).f40751m9 = ((AbstractC12237uz) abstractC12228lr).f40751m9;
    }
}
