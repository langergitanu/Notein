package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class wzi extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f32666h4 = new C7017h4("number:min-numerator-digits", "number:min-denominator-digits", "number:denominator-value", "number:min-integer-digits", "number:grouping");

    /* JADX INFO: renamed from: du */
    private boolean f32667du;

    /* JADX INFO: renamed from: k4 */
    private int f32668k4;

    /* JADX INFO: renamed from: kk */
    private int f32669kk;

    /* JADX INFO: renamed from: to */
    private int f32670to;

    /* JADX INFO: renamed from: x1 */
    private int f32671x1;

    public wzi() {
        m44144x1();
    }

    public wzi(AbstractC13912i5 abstractC13912i5) {
        m44144x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.wzi.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = wzi.f32666h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    wzi.this.f32668k4 = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    wzi.this.f32671x1 = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    wzi.this.f32669kk = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    wzi.this.f32670to = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                wzi.this.f32667du = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m44144x1() {
        this.f32668k4 = 0;
        this.f32671x1 = 0;
        this.f32669kk = 0;
        this.f32670to = 0;
        this.f32667du = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (this.f32668k4 != 0) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:min-numerator-digits", C13850af.m65103k4(this.f32668k4));
        }
        if (this.f32671x1 != 0) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:min-denominator-digits", C13850af.m65103k4(this.f32671x1));
        }
        if (this.f32669kk != 0) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:denominator-value", C13850af.m65103k4(this.f32669kk));
        }
        if (this.f32670to != 0) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:min-integer-digits", C13850af.m65103k4(this.f32670to));
        }
        if (this.f32667du) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:grouping", this.f32667du ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        c3059ii.mo21898jd();
    }
}
