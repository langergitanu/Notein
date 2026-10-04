package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class wpc extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f32445du = new C7017h4("applyStyles", "summaryBelow", "summaryRight", "showOutlineSymbols");

    /* JADX INFO: renamed from: k4 */
    private boolean f32446k4;

    /* JADX INFO: renamed from: kk */
    private boolean f32447kk;

    /* JADX INFO: renamed from: to */
    private boolean f32448to;

    /* JADX INFO: renamed from: x1 */
    private boolean f32449x1;

    public wpc() {
        m43848x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m43848x1() {
        this.f32446k4 = false;
        this.f32449x1 = true;
        this.f32447kk = true;
        this.f32448to = true;
    }

    public wpc(AbstractC13912i5 abstractC13912i5) {
        m43848x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.wpc.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = wpc.f32445du.m27428k4(str);
                if (iM27428k4 == 0) {
                    wpc.this.f32446k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    wpc.this.f32449x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    wpc.this.f32447kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                wpc.this.f32448to = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f32446k4;
        if (z) {
            c3059ii.m12955x1("applyStyles", z ? "1" : "0");
        }
        boolean z2 = this.f32449x1;
        if (!z2) {
            c3059ii.m12955x1("summaryBelow", z2 ? "1" : "0");
        }
        boolean z3 = this.f32447kk;
        if (!z3) {
            c3059ii.m12955x1("summaryRight", z3 ? "1" : "0");
        }
        boolean z4 = this.f32448to;
        if (!z4) {
            c3059ii.m12955x1("showOutlineSymbols", z4 ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
