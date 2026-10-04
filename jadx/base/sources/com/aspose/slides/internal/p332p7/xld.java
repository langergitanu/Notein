package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class xld extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f32924h4 = new C7017h4("form:current-selected", "form:selected", "form:label", "form:value");

    /* JADX INFO: renamed from: du */
    private String f32925du;

    /* JADX INFO: renamed from: k4 */
    private boolean f32926k4;

    /* JADX INFO: renamed from: kk */
    private String f32927kk;

    /* JADX INFO: renamed from: to */
    private String f32928to;

    /* JADX INFO: renamed from: x1 */
    private boolean f32929x1;

    public xld() {
        m44483x1();
    }

    public xld(AbstractC13912i5 abstractC13912i5) {
        m44483x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.xld.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = xld.f32924h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    xld.this.f32926k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    xld.this.f32929x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    xld.this.f32927kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                xld.this.f32928to = str2;
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    if (OooO0o.OooO0OO(abstractC13912i5, f32924h4)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f32925du = C14113y2.m67400k4(this.f32925du, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m44483x1() {
        this.f32926k4 = false;
        this.f32929x1 = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f32926k4;
        String str3 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            c3059ii.m12955x1("form:current-selected", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        boolean z2 = this.f32929x1;
        if (z2) {
            if (z2) {
                str3 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("form:selected", str3);
        }
        String str4 = this.f32927kk;
        if (str4 != null) {
            c3059ii.m12955x1("form:label", str4);
        }
        c3059ii.m12955x1("form:value", this.f32928to);
        String str5 = this.f32925du;
        if (str5 != null) {
            c3059ii.mo21918x1(str5);
        }
        c3059ii.mo21898jd();
    }
}
