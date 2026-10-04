package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class f8s extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f22720m9 = new C7017h4("number:decimal-replacement", "number:display-factor", "number:decimal-places", "number:min-integer-digits", "number:grouping", "embedded-text");

    /* JADX INFO: renamed from: du */
    private boolean f22721du;

    /* JADX INFO: renamed from: h4 */
    private List<yiz> f22722h4;

    /* JADX INFO: renamed from: k4 */
    private String f22723k4;

    /* JADX INFO: renamed from: kk */
    private int f22724kk;

    /* JADX INFO: renamed from: to */
    private int f22725to;

    /* JADX INFO: renamed from: x1 */
    private double f22726x1;

    public f8s() {
        m31673x1();
    }

    public f8s(final AbstractC13912i5 abstractC13912i5) {
        m31673x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.f8s.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = f8s.f22720m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    f8s.this.f22723k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    f8s.this.f22726x1 = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    f8s.this.f22724kk = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    f8s.this.f22725to = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                f8s.this.f22721du = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.f8s.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (f8s.f22720m9.m27428k4(abstractC13912i5.mo65023fa()) != 5) {
                    return false;
                }
                f8s.this.f22722h4.addItem(new yiz(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m31673x1() {
        this.f22726x1 = 1.0d;
        this.f22724kk = 0;
        this.f22725to = 0;
        this.f22721du = false;
        this.f22722h4 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (this.f22723k4 != null) {
            if (c3059ii.mo12952k4("http://www.w3.org/2001/XMLSchema") == null) {
                c3059ii.m12954to("xmlns", "xs", null, "http://www.w3.org/2001/XMLSchema");
            }
            c3059ii.m12955x1("number:decimal-replacement", this.f22723k4);
        }
        if (this.f22726x1 != 1.0d) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:display-factor", C13850af.m65101k4(this.f22726x1));
        }
        if (this.f22724kk != 0) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:decimal-places", C13850af.m65103k4(this.f22724kk));
        }
        if (this.f22725to != 0) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:min-integer-digits", C13850af.m65103k4(this.f22725to));
        }
        if (this.f22721du) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
                c3059ii.m12954to("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
            }
            c3059ii.m12955x1("number:grouping", this.f22721du ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        List.Enumerator<yiz> it = this.f22722h4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("number", c3059ii, "embedded-text");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
