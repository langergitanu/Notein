package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class a3u extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f19814dy = new C7017h4("text:id", "text:key1", "text:key2", "text:string-value-phonetic", "text:key1-phonetic", "text:key2-phonetic", "text:main-entry");

    /* JADX INFO: renamed from: du */
    private String f19815du;

    /* JADX INFO: renamed from: h4 */
    private String f19816h4;

    /* JADX INFO: renamed from: k4 */
    private String f19817k4;

    /* JADX INFO: renamed from: kk */
    private String f19818kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f19819m9;

    /* JADX INFO: renamed from: to */
    private String f19820to;

    /* JADX INFO: renamed from: x1 */
    private String f19821x1;

    public a3u() {
        m27922x1();
    }

    public a3u(AbstractC13912i5 abstractC13912i5) {
        m27922x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.a3u.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (a3u.f19814dy.m27428k4(str)) {
                    case 0:
                        a3u.this.f19817k4 = str2;
                        break;
                    case 1:
                        a3u.this.f19821x1 = str2;
                        break;
                    case 2:
                        a3u.this.f19818kk = str2;
                        break;
                    case 3:
                        a3u.this.f19820to = str2;
                        break;
                    case 4:
                        a3u.this.f19815du = str2;
                        break;
                    case 5:
                        a3u.this.f19816h4 = str2;
                        break;
                    case 6:
                        a3u.this.f19819m9 = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m27922x1() {
        this.f19819m9 = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:id", this.f19817k4);
        String str3 = this.f19821x1;
        if (str3 != null) {
            c3059ii.m12955x1("text:key1", str3);
        }
        String str4 = this.f19818kk;
        if (str4 != null) {
            c3059ii.m12955x1("text:key2", str4);
        }
        String str5 = this.f19820to;
        if (str5 != null) {
            c3059ii.m12955x1("text:string-value-phonetic", str5);
        }
        String str6 = this.f19815du;
        if (str6 != null) {
            c3059ii.m12955x1("text:key1-phonetic", str6);
        }
        String str7 = this.f19816h4;
        if (str7 != null) {
            c3059ii.m12955x1("text:key2-phonetic", str7);
        }
        boolean z = this.f19819m9;
        if (z) {
            c3059ii.m12955x1("text:main-entry", z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        c3059ii.mo21898jd();
    }
}
