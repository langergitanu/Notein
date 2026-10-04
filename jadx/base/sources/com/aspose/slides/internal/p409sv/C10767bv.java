package com.aspose.slides.internal.p409sv;

import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.sv.bv */
/* JADX INFO: loaded from: classes4.dex */
public class C10767bv extends AbstractC3524ks {

    /* JADX INFO: renamed from: h4 */
    private static boolean f37609h4 = false;

    /* JADX INFO: renamed from: dy */
    private boolean f37610dy;

    /* JADX INFO: renamed from: m9 */
    private boolean f37611m9;

    public C10767bv(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f37611m9 = false;
        this.f37610dy = false;
        if (f37609h4) {
            return;
        }
        m14118up().mo14340h4(this, m14105ks(), m14105ks(), m14106m_());
        f37609h4 = true;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        if (this.f37611m9 && this.f37610dy) {
            return;
        }
        m14123x1("(multi-property-set+, wrapper)");
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 46;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            if (C14113y2.m67363du(str2, "multi-property-set")) {
                if (this.f37610dy) {
                    m14122x1(interfaceC3757h4, "fo:multi-property-set", "fo:wrapper");
                    return;
                } else {
                    this.f37611m9 = true;
                    return;
                }
            }
            if (!C14113y2.m67363du(str2, "wrapper")) {
                m14103kk(interfaceC3757h4, str, str2);
            } else if (this.f37610dy) {
                m14093k4(interfaceC3757h4, "fo:wrapper");
            } else {
                this.f37610dy = true;
            }
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "multi-properties";
    }
}
