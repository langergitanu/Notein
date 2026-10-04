package com.aspose.slides.internal.p409sv;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p023ak.C1389to;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p150gi.C4264bz;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.sv.ix */
/* JADX INFO: loaded from: classes4.dex */
public class C10776ix extends AbstractC10795x6 {

    /* JADX INFO: renamed from: c5 */
    private int f37677c5;

    /* JADX INFO: renamed from: ck */
    private int f37678ck;

    /* JADX INFO: renamed from: dy */
    private InterfaceC1984kk f37679dy;

    /* JADX INFO: renamed from: fa */
    private int f37680fa;

    /* JADX INFO: renamed from: jd */
    private InterfaceC1984kk f37681jd;

    /* JADX INFO: renamed from: ks */
    private InterfaceC1984kk f37682ks;

    /* JADX INFO: renamed from: rv */
    private int f37683rv;

    /* JADX INFO: renamed from: up */
    private C4264bz f37684up;

    /* JADX INFO: renamed from: x6 */
    private InterfaceC1984kk f37685x6;

    /* JADX INFO: renamed from: yj */
    private int f37686yj;

    public C10776ix(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
    }

    /* JADX INFO: renamed from: bz */
    public final InterfaceC1984kk m52251bz() {
        return this.f37685x6;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3529rv, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        super.mo14081dy();
        mo14107n_().mo14206x1(this);
    }

    /* JADX INFO: renamed from: e0 */
    public final int m52252e0() {
        return this.f37683rv;
    }

    /* JADX INFO: renamed from: g8 */
    public final int m52253g8() {
        return this.f37686yj;
    }

    /* JADX INFO: renamed from: gi */
    public final int m52254gi() {
        return this.f37678ck;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        super.mo14083h4();
        mo14107n_().mo14179k4(this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 39;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public Stack<C1389to> mo14086k4(Stack<C1389to> stack, C1389to c1389to) {
        if (c1389to != null) {
            if (this.f37686yj == 158) {
                return super.mo14086k4(stack, c1389to);
            }
            c1389to.m8274k4((char) 65532, (AbstractC3511c5) this);
        }
        return stack;
    }

    /* JADX INFO: renamed from: kp */
    public final InterfaceC1984kk m52255kp() {
        return this.f37681jd;
    }

    /* JADX INFO: renamed from: qm */
    public final C4264bz m52256qm() {
        return this.f37684up;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "leader";
    }

    /* JADX INFO: renamed from: ss */
    public final int m52257ss() {
        return this.f37677c5;
    }

    /* JADX INFO: renamed from: sv */
    public final InterfaceC1984kk m52258sv() {
        return this.f37682ks;
    }

    /* JADX INFO: renamed from: wp */
    public final InterfaceC1984kk m52259wp() {
        return this.f37679dy;
    }

    @Override // com.aspose.slides.internal.p409sv.AbstractC10795x6, com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f37679dy = abstractC3533um.m14402to(3).mo9877dy();
        this.f37677c5 = abstractC3533um.m14402to(4).mo17251du();
        this.f37681jd = abstractC3533um.m14402to(15).mo9877dy();
        this.f37678ck = abstractC3533um.m14402to(88).mo17251du();
        this.f37680fa = abstractC3533um.m14402to(136).mo17251du();
        this.f37684up = abstractC3533um.m14402to(137).mo17130k_();
        this.f37686yj = abstractC3533um.m14402to(138).mo17251du();
        this.f37682ks = abstractC3533um.m14402to(139).mo9877dy();
        this.f37685x6 = AbstractC3524ks.m14312x1(214).mo17212k4(abstractC3533um).mo9877dy();
        int i = this.f37686yj;
        if (i != 35) {
            if (i == 123) {
                this.f37683rv = abstractC3533um.m14402to(213).mo17251du();
                this.f37685x6 = abstractC3533um.m14402to(214).mo9877dy();
            } else if (i != 134 && i != 158) {
                throw new Exception(C14113y2.m67408k4("Invalid leader pattern: ", C14057f9.m66591x1(this.f37686yj)));
            }
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            if (C14113y2.m67363du(str2, "leader") || C14113y2.m67363du(str2, "inline-container") || C14113y2.m67363du(str2, "block-container") || C14113y2.m67363du(str2, "float") || C14113y2.m67363du(str2, RequestParameters.MARKER) || !m14324kk(str, str2)) {
                m14103kk(interfaceC3757h4, str, str2);
            }
        }
    }
}
