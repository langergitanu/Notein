package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class vpe extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f31965dy = new C7017h4("text:string-value", "text:key1", "text:key2", "text:string-value-phonetic", "text:key1-phonetic", "text:key2-phonetic", "text:main-entry");

    /* JADX INFO: renamed from: du */
    private String f31966du;

    /* JADX INFO: renamed from: h4 */
    private String f31967h4;

    /* JADX INFO: renamed from: k4 */
    private String f31968k4;

    /* JADX INFO: renamed from: kk */
    private String f31969kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f31970m9;

    /* JADX INFO: renamed from: to */
    private String f31971to;

    /* JADX INFO: renamed from: x1 */
    private String f31972x1;

    public vpe() {
        m43214x1();
    }

    public vpe(AbstractC13912i5 abstractC13912i5) {
        m43214x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.vpe.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (vpe.f31965dy.m27428k4(str)) {
                    case 0:
                        vpe.this.f31968k4 = str2;
                        break;
                    case 1:
                        vpe.this.f31972x1 = str2;
                        break;
                    case 2:
                        vpe.this.f31969kk = str2;
                        break;
                    case 3:
                        vpe.this.f31971to = str2;
                        break;
                    case 4:
                        vpe.this.f31966du = str2;
                        break;
                    case 5:
                        vpe.this.f31967h4 = str2;
                        break;
                    case 6:
                        vpe.this.f31970m9 = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m43214x1() {
        this.f31970m9 = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:string-value", this.f31968k4);
        String str3 = this.f31972x1;
        if (str3 != null) {
            c3059ii.m12955x1("text:key1", str3);
        }
        String str4 = this.f31969kk;
        if (str4 != null) {
            c3059ii.m12955x1("text:key2", str4);
        }
        String str5 = this.f31971to;
        if (str5 != null) {
            c3059ii.m12955x1("text:string-value-phonetic", str5);
        }
        String str6 = this.f31966du;
        if (str6 != null) {
            c3059ii.m12955x1("text:key1-phonetic", str6);
        }
        String str7 = this.f31967h4;
        if (str7 != null) {
            c3059ii.m12955x1("text:key2-phonetic", str7);
        }
        boolean z = this.f31970m9;
        if (z) {
            c3059ii.m12955x1("text:main-entry", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        c3059ii.mo21898jd();
    }
}
