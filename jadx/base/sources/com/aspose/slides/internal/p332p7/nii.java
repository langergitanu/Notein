package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class nii extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f27356jd = new C7017h4("table:source-field-name", "table:orientation", "table:selected-page", "table:is-data-layout-field", "table:function", "table:used-hierarchy", "data-pilot-level", "data-pilot-field-reference", "data-pilot-groups");

    /* JADX INFO: renamed from: c5 */
    private lwh f27357c5;

    /* JADX INFO: renamed from: du */
    private String f27358du;

    /* JADX INFO: renamed from: dy */
    private kke f27359dy;

    /* JADX INFO: renamed from: h4 */
    private int f27360h4;

    /* JADX INFO: renamed from: k4 */
    private String f27361k4;

    /* JADX INFO: renamed from: kk */
    private String f27362kk;

    /* JADX INFO: renamed from: m9 */
    private f7k f27363m9;

    /* JADX INFO: renamed from: to */
    private String f27364to;

    /* JADX INFO: renamed from: x1 */
    private int f27365x1;

    public nii() {
        m37580x1();
    }

    public nii(final AbstractC13912i5 abstractC13912i5) {
        m37580x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.nii.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = nii.f27356jd.m27428k4(str);
                if (iM27428k4 == 0) {
                    nii.this.f27361k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    nii.this.f27365x1 = gq5.m32827k4(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    nii.this.f27362kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    nii.this.f27364to = str2;
                    return true;
                }
                if (iM27428k4 == 4) {
                    nii.this.f27358du = str2;
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                nii.this.f27360h4 = C13850af.m65151yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.nii.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = nii.f27356jd.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 6) {
                    nii.this.f27363m9 = new f7k(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 7) {
                    nii.this.f27359dy = new kke(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 8) {
                    return false;
                }
                nii.this.f27357c5 = new lwh(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m37580x1() {
        this.f27365x1 = 0;
        this.f27364to = TelemetryEventStrings.Value.FALSE;
        this.f27360h4 = -1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:source-field-name", this.f27361k4);
        c3059ii.m12955x1("table:orientation", gq5.m32828k4(this.f27365x1));
        String str3 = this.f27362kk;
        if (str3 != null) {
            c3059ii.m12955x1("table:selected-page", str3);
        }
        if (!TelemetryEventStrings.Value.FALSE.equals(this.f27364to)) {
            c3059ii.m12955x1("table:is-data-layout-field", this.f27364to);
        }
        String str4 = this.f27358du;
        if (str4 != null) {
            c3059ii.m12955x1("table:function", str4);
        }
        int i = this.f27360h4;
        if (i != -1) {
            c3059ii.m12955x1("table:used-hierarchy", C13850af.m65103k4(i));
        }
        f7k f7kVar = this.f27363m9;
        if (f7kVar != null) {
            f7kVar.mo6846k4("table", c3059ii, "data-pilot-level");
        }
        kke kkeVar = this.f27359dy;
        if (kkeVar != null) {
            kkeVar.mo6846k4("table", c3059ii, "data-pilot-field-reference");
        }
        lwh lwhVar = this.f27357c5;
        if (lwhVar != null) {
            lwhVar.mo6846k4("table", c3059ii, "data-pilot-groups");
        }
        c3059ii.mo21898jd();
    }
}
