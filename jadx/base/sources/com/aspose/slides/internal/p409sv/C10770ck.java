package com.aspose.slides.internal.p409sv;

import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p150gi.C4266c6;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.sv.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C10770ck extends AbstractC3524ks {

    /* JADX INFO: renamed from: c5 */
    private C4266c6 f37631c5;

    /* JADX INFO: renamed from: dy */
    private C4266c6 f37632dy;

    /* JADX INFO: renamed from: h4 */
    private int f37633h4;

    /* JADX INFO: renamed from: m9 */
    private C4266c6 f37634m9;

    public C10770ck(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
    }

    /* JADX INFO: renamed from: bz */
    public final C4266c6 m52210bz() {
        return this.f37631c5;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        if (this.f9851to == null) {
            m14123x1("(%block;)+");
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final C4266c6 m52211e0() {
        return this.f37632dy;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 15;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f37633h4 = abstractC3533um.m14402to(95).mo17251du();
        this.f37634m9 = abstractC3533um.m14402to(133).mo17190up();
        this.f37632dy = abstractC3533um.m14402to(131).mo17190up();
        this.f37631c5 = abstractC3533um.m14402to(132).mo17190up();
    }

    /* JADX INFO: renamed from: qm */
    public final int m52212qm() {
        return this.f37633h4;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "float";
    }

    /* JADX INFO: renamed from: ts */
    public final C4266c6 m52213ts() {
        return this.f37634m9;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (!C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str) || m14332x1(str, str2)) {
            return;
        }
        m14103kk(interfaceC3757h4, str, str2);
    }
}
