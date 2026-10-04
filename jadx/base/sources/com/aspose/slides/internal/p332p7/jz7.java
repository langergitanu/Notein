package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class jz7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f25418du = new C7017h4("number:min-exponent-digits", "number:decimal-places", "number:min-integer-digits", "number:grouping");

    /* JADX INFO: renamed from: k4 */
    private int f25419k4;

    /* JADX INFO: renamed from: kk */
    private int f25420kk;

    /* JADX INFO: renamed from: to */
    private boolean f25421to;

    /* JADX INFO: renamed from: x1 */
    private int f25422x1;

    public jz7() {
        m35069x1();
    }

    public jz7(AbstractC13912i5 abstractC13912i5) {
        m35069x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jz7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = jz7.f25418du.m27428k4(str);
                if (iM27428k4 == 0) {
                    jz7.this.f25419k4 = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    jz7.this.f25422x1 = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    jz7.this.f25420kk = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                jz7.this.f25421to = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m35069x1() {
        this.f25419k4 = 0;
        this.f25422x1 = 0;
        this.f25420kk = 0;
        this.f25421to = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (this.f25419k4 != 0) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:min-exponent-digits", C13850af.m65103k4(this.f25419k4));
        }
        if (this.f25422x1 != 0) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:decimal-places", C13850af.m65103k4(this.f25422x1));
        }
        if (this.f25420kk != 0) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:min-integer-digits", C13850af.m65103k4(this.f25420kk));
        }
        if (this.f25421to) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:grouping", this.f25421to ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        c3059ii.mo21898jd();
    }
}
