package com.aspose.slides.internal.p409sv;

import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p048bv.C1856c5;
import com.aspose.slides.internal.p057c6.C1982jd;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p150gi.C4261ar;
import com.aspose.slides.internal.p523yd.C12814to;
import com.aspose.slides.p559ms.System.C14087rv;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.sv.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C10777jd extends AbstractC10778k4 {

    /* JADX INFO: renamed from: c5 */
    private int f37687c5;

    /* JADX INFO: renamed from: dy */
    private int f37688dy;

    /* JADX INFO: renamed from: h4 */
    private String f37689h4;

    /* JADX INFO: renamed from: jd */
    private InterfaceC1984kk f37690jd;

    /* JADX INFO: renamed from: m9 */
    private String f37691m9;

    public C10777jd(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
    }

    /* JADX INFO: renamed from: f9 */
    public final String m52260f9() {
        return this.f37689h4;
    }

    @Override // com.aspose.slides.internal.p409sv.AbstractC10778k4
    /* JADX INFO: renamed from: gi */
    public int mo52261gi() {
        return this.f37687c5;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        super.mo14083h4();
        mo14107n_().mo14180k4(this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 14;
    }

    @Override // com.aspose.slides.internal.p409sv.AbstractC10778k4, com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        C1856c5 c1856c5M9731k4;
        super.mo14090k4(abstractC3533um);
        String strMo9926j_ = abstractC3533um.m14385du(232).mo9926j_();
        this.f37689h4 = strMo9926j_;
        this.f37691m9 = C1982jd.m10107k4(strMo9926j_);
        C12814to c12814toM14111q_ = m14111q_();
        try {
            c1856c5M9731k4 = c12814toM14111q_.m59556du().m59541m9().m9731k4(this.f37691m9, c12814toM14111q_.m59558fa());
        } catch (IOException unused) {
            C14087rv.m67159k4().mo13326x1(C14113y2.m67408k4("Error: can't load image ", this.f37691m9));
            c1856c5M9731k4 = null;
        }
        if (c1856c5M9731k4 != null) {
            this.f37688dy = c1856c5M9731k4.m9710kk().m9725to();
            this.f37687c5 = c1856c5M9731k4.m9710kk().m9718du();
            if (c1856c5M9731k4.m9710kk().m9720k4() != 0) {
                this.f37690jd = C4261ar.m17118k4(-r3);
            }
        }
    }

    @Override // com.aspose.slides.internal.p409sv.AbstractC10778k4
    /* JADX INFO: renamed from: kp */
    public int mo52262kp() {
        return this.f37688dy;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "external-graphic";
    }

    @Override // com.aspose.slides.internal.p409sv.AbstractC10778k4
    /* JADX INFO: renamed from: s7 */
    public InterfaceC1984kk mo52263s7() {
        return this.f37690jd;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            m14103kk(interfaceC3757h4, str, str2);
        }
    }
}
