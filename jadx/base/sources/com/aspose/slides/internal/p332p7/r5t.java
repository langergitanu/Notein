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
public class r5t extends AbstractC7361bz {

    /* JADX INFO: renamed from: yj */
    private static final C7017h4 f29161yj = new C7017h4("text:note-class", "text:citation-style-name", "text:citation-body-style-name", "text:default-style-name", "text:master-page-name", "text:start-value", "style:num-prefix", "style:num-suffix", "style:num-format", "style:num-letter-sync", "text:start-numbering-at", "text:footnotes-position", "note-continuation-notice-forward", "note-continuation-notice-backward");

    /* JADX INFO: renamed from: c5 */
    private String f29162c5;

    /* JADX INFO: renamed from: ck */
    private int f29163ck;

    /* JADX INFO: renamed from: du */
    private String f29164du;

    /* JADX INFO: renamed from: dy */
    private String f29165dy;

    /* JADX INFO: renamed from: fa */
    private int f29166fa;

    /* JADX INFO: renamed from: h4 */
    private long f29167h4;

    /* JADX INFO: renamed from: jd */
    private byte f29168jd;

    /* JADX INFO: renamed from: k4 */
    private int f29169k4;

    /* JADX INFO: renamed from: kk */
    private String f29170kk;

    /* JADX INFO: renamed from: m9 */
    private String f29171m9;

    /* JADX INFO: renamed from: to */
    private String f29172to;

    /* JADX INFO: renamed from: up */
    private List<C7394ca> f29173up;

    /* JADX INFO: renamed from: x1 */
    private String f29174x1;

    public r5t() {
        m39881x1();
    }

    public r5t(final AbstractC13912i5 abstractC13912i5) {
        m39881x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.r5t.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (r5t.f29161yj.m27428k4(str)) {
                    case 0:
                        r5t.this.f29169k4 = olk.m38334k4(str2);
                        break;
                    case 1:
                        r5t.this.f29174x1 = str2;
                        break;
                    case 2:
                        r5t.this.f29170kk = str2;
                        break;
                    case 3:
                        r5t.this.f29172to = str2;
                        break;
                    case 4:
                        r5t.this.f29164du = str2;
                        break;
                    case 5:
                        r5t.this.f29167h4 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 6:
                        r5t.this.f29171m9 = str2;
                        break;
                    case 7:
                        r5t.this.f29165dy = str2;
                        break;
                    case 8:
                        r5t.this.f29162c5 = str2;
                        break;
                    case 9:
                        r5t.this.f29168jd = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 10:
                        r5t.this.f29163ck = vjj.m43130k4(str2);
                        break;
                    case 11:
                        r5t.this.f29166fa = r0b.m39805k4(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.r5t.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                String strMo65042rv;
                List list;
                String str;
                int iM27428k4 = r5t.f29161yj.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 12) {
                    abstractC13912i5.mo65026h4();
                    strMo65042rv = abstractC13912i5.mo65042rv();
                    list = r5t.this.f29173up;
                    str = "note-continuation-notice-forward";
                } else {
                    if (iM27428k4 != 13) {
                        return false;
                    }
                    abstractC13912i5.mo65026h4();
                    strMo65042rv = abstractC13912i5.mo65042rv();
                    list = r5t.this.f29173up;
                    str = "note-continuation-notice-backward";
                }
                OooOO0O.OooO0O0(str, strMo65042rv, list);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m39881x1() {
        this.f29169k4 = 0;
        this.f29167h4 = 4294967295L;
        this.f29168jd = (byte) -1;
        this.f29163ck = 0;
        this.f29166fa = 0;
        this.f29173up = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        String str3;
        String str4;
        Object objM29541kk;
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:note-class", olk.m38335k4(this.f29169k4));
        String str5 = this.f29174x1;
        if (str5 != null) {
            c3059ii.m12955x1("text:citation-style-name", str5);
        }
        String str6 = this.f29170kk;
        if (str6 != null) {
            c3059ii.m12955x1("text:citation-body-style-name", str6);
        }
        String str7 = this.f29172to;
        if (str7 != null) {
            c3059ii.m12955x1("text:default-style-name", str7);
        }
        String str8 = this.f29164du;
        if (str8 != null) {
            c3059ii.m12955x1("text:master-page-name", str8);
        }
        long j = this.f29167h4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("text:start-value", C13850af.m65147x1(j));
        }
        String str9 = this.f29171m9;
        if (str9 != null) {
            c3059ii.m12955x1("style:num-prefix", str9);
        }
        String str10 = this.f29165dy;
        if (str10 != null) {
            c3059ii.m12955x1("style:num-suffix", str10);
        }
        String str11 = this.f29162c5;
        if (str11 != null) {
            c3059ii.m12955x1("style:num-format", str11);
        }
        byte b = this.f29168jd;
        if (b != -1) {
            c3059ii.m12955x1("style:num-letter-sync", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        int i = this.f29163ck;
        if (i != 0) {
            c3059ii.m12955x1("text:start-numbering-at", vjj.m43131k4(i));
        }
        int i2 = this.f29166fa;
        if (i2 != 0) {
            c3059ii.m12955x1("text:footnotes-position", r0b.m39806k4(i2));
        }
        List.Enumerator<C7394ca> it = this.f29173up.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f29161yj.m27428k4(next.m29539k4());
                if (iM27428k4 == 12) {
                    str3 = "text";
                    str4 = "note-continuation-notice-forward";
                    objM29541kk = next.m29541kk();
                } else if (iM27428k4 == 13) {
                    str3 = "text";
                    str4 = "note-continuation-notice-backward";
                    objM29541kk = next.m29541kk();
                }
                m29301k4(str3, c3059ii, str4, (String) objM29541kk, false);
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        c3059ii.mo21898jd();
    }
}
