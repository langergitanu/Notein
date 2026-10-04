package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class xlu extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f32942h4 = new C7017h4("draw:recreate-on-edit", "svg:width", "svg:height", "svg:viewBox", "draw:points");

    /* JADX INFO: renamed from: du */
    private String f32943du;

    /* JADX INFO: renamed from: k4 */
    private boolean f32944k4;

    /* JADX INFO: renamed from: kk */
    private String f32945kk;

    /* JADX INFO: renamed from: to */
    private String f32946to;

    /* JADX INFO: renamed from: x1 */
    private String f32947x1;

    public xlu() {
    }

    public xlu(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.xlu.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = xlu.f32942h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    xlu.this.f32944k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    xlu.this.f32947x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    xlu.this.f32945kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    xlu.this.f32946to = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                xlu.this.f32943du = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("draw:recreate-on-edit", this.f32944k4 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        String str3 = this.f32947x1;
        if (str3 != null) {
            c3059ii.m12955x1("svg:width", str3);
        }
        String str4 = this.f32945kk;
        if (str4 != null) {
            c3059ii.m12955x1("svg:height", str4);
        }
        c3059ii.m12955x1("svg:viewBox", this.f32946to);
        c3059ii.m12955x1("draw:points", this.f32943du);
        c3059ii.mo21898jd();
    }
}
