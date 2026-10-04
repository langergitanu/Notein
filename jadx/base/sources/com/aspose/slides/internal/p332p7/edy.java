package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class edy extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private String f22109du;

    /* JADX INFO: renamed from: kk */
    private boolean f22110kk;

    /* JADX INFO: renamed from: to */
    private int f22111to;

    /* JADX INFO: renamed from: x1 */
    private boolean f22112x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f22108k4 = el1.m31122k4("short");

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f22107h4 = new C7017h4("number:textual", "number:possessive-form", "number:style", "number:calendar");

    public edy() {
        m30928x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m30928x1() {
        this.f22112x1 = false;
        this.f22110kk = false;
        this.f22111to = f22108k4;
    }

    public edy(AbstractC13912i5 abstractC13912i5) {
        m30928x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.edy.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = edy.f22107h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    edy.this.f22112x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    edy.this.f22110kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    edy.this.f22111to = el1.m31122k4(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                edy.this.f22109du = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f22112x1;
        String str3 = TelemetryEventStrings.Value.FALSE;
        if (z) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:textual", this.f22112x1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        if (this.f22110kk) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            if (this.f22110kk) {
                str3 = TelemetryEventStrings.Value.TRUE;
            }
            c3059ii.m12955x1("number:possessive-form", str3);
        }
        int i = this.f22111to;
        if (i != f22108k4) {
            c3059ii.m12955x1("number:style", el1.m31123k4(i));
        }
        if (this.f22109du != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0") == null) {
                c3059ii.m12954to("xmlns", "odfnum", null, "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0");
            }
            c3059ii.m12955x1("number:calendar", this.f22109du);
        }
        c3059ii.mo21898jd();
    }
}
