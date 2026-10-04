package com.aspose.slides.internal.p409sv;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p455v4.InterfaceC11601k4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.sv.du */
/* JADX INFO: loaded from: classes4.dex */
public class C10772du extends AbstractC10795x6 {

    /* JADX INFO: renamed from: c5 */
    private int f37637c5;

    /* JADX INFO: renamed from: ck */
    private int f37638ck;

    /* JADX INFO: renamed from: dy */
    private InterfaceC1984kk f37639dy;

    /* JADX INFO: renamed from: fa */
    private InterfaceC11601k4 f37640fa;

    /* JADX INFO: renamed from: jd */
    private InterfaceC1984kk f37641jd;

    /* JADX INFO: renamed from: ks */
    private int f37642ks;

    /* JADX INFO: renamed from: rv */
    private int f37643rv;

    /* JADX INFO: renamed from: up */
    private String f37644up;

    /* JADX INFO: renamed from: x6 */
    private boolean f37645x6;

    /* JADX INFO: renamed from: yj */
    private String f37646yj;

    public C10772du(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f37645x6 = false;
    }

    /* JADX INFO: renamed from: bz */
    public final InterfaceC1984kk m52216bz() {
        return this.f37639dy;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3529rv, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        super.mo14081dy();
        mo14107n_().mo14203x1(this);
    }

    /* JADX INFO: renamed from: e0 */
    public final int m52217e0() {
        return this.f37643rv;
    }

    /* JADX INFO: renamed from: f9 */
    public final int m52218f9() {
        return this.f37642ks;
    }

    /* JADX INFO: renamed from: g8 */
    public final InterfaceC1984kk m52219g8() {
        return this.f37641jd;
    }

    /* JADX INFO: renamed from: gi */
    public final boolean m52220gi() {
        String str = this.f37646yj;
        return str != null && str.length() > 0;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        super.mo14083h4();
        mo14107n_().mo14176k4(this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 1;
    }

    @Override // com.aspose.slides.internal.p409sv.AbstractC10795x6, com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f37639dy = abstractC3533um.m14385du(3).mo9877dy();
        this.f37637c5 = abstractC3533um.m14385du(4).mo17251du();
        this.f37641jd = abstractC3533um.m14385du(15).mo9877dy();
        this.f37638ck = abstractC3533um.m14385du(88).mo17251du();
        this.f37644up = abstractC3533um.m14385du(94).mo9926j_();
        this.f37646yj = abstractC3533um.m14385du(128).mo9926j_();
        this.f37642ks = abstractC3533um.m14385du(219).mo17251du();
        this.f37643rv = abstractC3533um.m14402to(StyleIdentifier.TOC_HEADING).mo17251du();
        if (this.f37646yj.length() > 0) {
            this.f37644up = null;
        } else if (this.f37644up.length() == 0) {
            m14118up().mo14344k4(this, m14105ks(), this.f9753kk);
        }
    }

    /* JADX INFO: renamed from: kp */
    public final String m52221kp() {
        return this.f37644up;
    }

    /* JADX INFO: renamed from: qm */
    public final int m52222qm() {
        return this.f37637c5;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "basic-link";
    }

    /* JADX INFO: renamed from: s7 */
    public final boolean m52223s7() {
        String str = this.f37644up;
        return str != null && str.length() > 0;
    }

    /* JADX INFO: renamed from: ss */
    public final String m52224ss() {
        return this.f37646yj;
    }

    /* JADX INFO: renamed from: sv */
    public final int m52225sv() {
        return this.f37638ck;
    }

    /* JADX INFO: renamed from: wp */
    public final InterfaceC11601k4 m52226wp() {
        return this.f37640fa;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            if (C14113y2.m67363du(str2, RequestParameters.MARKER)) {
                if (this.f37645x6) {
                    m14122x1(interfaceC3757h4, "fo:marker", "(#PCDATA|%inline;|%block;)");
                }
            } else if (m14328to(str, str2)) {
                this.f37645x6 = true;
            } else {
                m14103kk(interfaceC3757h4, str, str2);
            }
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14097k4(InterfaceC11601k4 interfaceC11601k4) {
        this.f37640fa = interfaceC11601k4;
    }
}
