package com.aspose.slides.internal.p409sv;

import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p150gi.C4270dy;
import com.aspose.slides.internal.p150gi.InterfaceC4260ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.sv.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C10774fa extends AbstractC3524ks implements InterfaceC4260ak {

    /* JADX INFO: renamed from: dy */
    private C10789up f37670dy;

    /* JADX INFO: renamed from: h4 */
    private C4270dy f37671h4;

    /* JADX INFO: renamed from: m9 */
    private C10780ks f37672m9;

    public C10774fa(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f37672m9 = null;
    }

    /* JADX INFO: renamed from: bz */
    public final C10789up m52247bz() {
        return this.f37670dy;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        super.mo14081dy();
        if (this.f37672m9 == null || this.f37670dy == null) {
            m14123x1("(inline,footnote-body)");
        }
        mo14107n_().mo14205x1(this);
    }

    /* JADX INFO: renamed from: e0 */
    public final C10780ks m52248e0() {
        return this.f37672m9;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        mo14107n_().mo14178k4(this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 24;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14089k4(AbstractC3511c5 abstractC3511c5) {
        if (abstractC3511c5.mo14084ix() == 35) {
            this.f37672m9 = (C10780ks) abstractC3511c5;
        } else if (abstractC3511c5.mo14084ix() == 25) {
            this.f37670dy = (C10789up) abstractC3511c5;
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "footnote";
    }

    @Override // com.aspose.slides.internal.p150gi.InterfaceC4260ak
    /* JADX INFO: renamed from: ts */
    public final C4270dy mo17117ts() {
        return this.f37671h4;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        this.f37671h4 = C4270dy.m17199k4(abstractC3533um);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            if (C14113y2.m67363du(str2, "inline")) {
                if (this.f37672m9 != null) {
                    m14093k4(interfaceC3757h4, "fo:inline");
                }
            } else if (!C14113y2.m67363du(str2, "footnote-body")) {
                m14103kk(interfaceC3757h4, str, str2);
            } else if (this.f37672m9 == null) {
                m14122x1(interfaceC3757h4, "fo:inline", "fo:footnote-body");
            } else if (this.f37670dy != null) {
                m14093k4(interfaceC3757h4, "fo:footnote-body");
            }
        }
    }
}
