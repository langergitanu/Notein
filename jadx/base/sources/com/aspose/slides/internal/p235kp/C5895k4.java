package com.aspose.slides.internal.p235kp;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p150gi.C4270dy;
import com.aspose.slides.internal.p150gi.InterfaceC4260ak;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.kp.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C5895k4 extends AbstractC3524ks implements InterfaceC4260ak {

    /* JADX INFO: renamed from: c5 */
    private String f16678c5;

    /* JADX INFO: renamed from: ck */
    private boolean f16679ck;

    /* JADX INFO: renamed from: dy */
    private C4270dy f16680dy;

    /* JADX INFO: renamed from: h4 */
    private C5897x1 f16681h4;

    /* JADX INFO: renamed from: jd */
    private String f16682jd;

    /* JADX INFO: renamed from: m9 */
    private List<C5895k4> f16683m9;

    public C5895k4(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f16683m9 = new List<>();
        this.f16679ck = true;
    }

    /* JADX INFO: renamed from: bz */
    public final String m23745bz() {
        return this.f16678c5;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        if (this.f16681h4 == null) {
            m14123x1("(bookmark-title, bookmark*)");
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final String m23746e0() {
        C5897x1 c5897x1 = this.f16681h4;
        return c5897x1 == null ? C14113y2.f47374k4 : c5897x1.m23750e0();
    }

    /* JADX INFO: renamed from: g8 */
    public final List<C5895k4> m23747g8() {
        return this.f16683m9;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 6;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14089k4(AbstractC3511c5 abstractC3511c5) {
        if (C7019kk.m27469x1(abstractC3511c5, C5897x1.class)) {
            this.f16681h4 = (C5897x1) abstractC3511c5;
        } else if (C7019kk.m27469x1(abstractC3511c5, C5895k4.class)) {
            this.f16683m9.addItem((C5895k4) C7019kk.m27452k4((Object) abstractC3511c5, C5895k4.class));
        }
    }

    /* JADX INFO: renamed from: qm */
    public final boolean m23748qm() {
        return this.f16679ck;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "bookmark";
    }

    @Override // com.aspose.slides.internal.p150gi.InterfaceC4260ak
    /* JADX INFO: renamed from: ts */
    public final C4270dy mo17117ts() {
        return this.f16680dy;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        this.f16680dy = C4270dy.m17199k4(abstractC3533um);
        this.f16682jd = abstractC3533um.m14402to(94).mo9926j_();
        this.f16678c5 = abstractC3533um.m14402to(128).mo9926j_();
        this.f16679ck = abstractC3533um.m14402to(234).mo17251du() == 130;
        if (this.f16678c5.length() > 0) {
            this.f16682jd = null;
        } else if (this.f16682jd.length() == 0) {
            m14118up().mo14344k4(this, m14105ks(), this.f9753kk);
        } else {
            m14118up().mo14340h4(this, m14105ks(), "external-destination", m14106m_());
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            if (C14113y2.m67363du(str2, "bookmark-title")) {
                if (this.f16681h4 != null) {
                    m14093k4(interfaceC3757h4, "fo:bookmark-title");
                }
            } else if (!C14113y2.m67363du(str2, "bookmark")) {
                m14103kk(interfaceC3757h4, str, str2);
            } else if (this.f16681h4 == null) {
                m14122x1(interfaceC3757h4, "fo:bookmark-title", "fo:bookmark");
            }
        }
    }
}
