package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class pcw extends AbstractC7361bz {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f28378ck = new C7017h4("text:level", "text:style-name", "style:num-format", "style:num-letter-sync", "style:num-prefix", "style:num-suffix", "text:display-levels", "text:start-value", "list-level-properties", "text-properties");

    /* JADX INFO: renamed from: c5 */
    private gwj f28379c5;

    /* JADX INFO: renamed from: du */
    private String f28380du;

    /* JADX INFO: renamed from: dy */
    private long f28381dy;

    /* JADX INFO: renamed from: h4 */
    private String f28382h4;

    /* JADX INFO: renamed from: jd */
    private zob f28383jd;

    /* JADX INFO: renamed from: k4 */
    private long f28384k4;

    /* JADX INFO: renamed from: kk */
    private String f28385kk;

    /* JADX INFO: renamed from: m9 */
    private long f28386m9;

    /* JADX INFO: renamed from: to */
    private byte f28387to;

    /* JADX INFO: renamed from: x1 */
    private String f28388x1;

    public pcw() {
        m38843ck();
    }

    /* JADX INFO: renamed from: ck */
    private void m38843ck() {
        this.f28387to = (byte) -1;
        this.f28386m9 = 1L;
        this.f28381dy = 1L;
    }

    /* JADX INFO: renamed from: c5 */
    public final zob m38855c5() {
        return this.f28383jd;
    }

    /* JADX INFO: renamed from: du */
    public final String m38856du() {
        return this.f28380du;
    }

    /* JADX INFO: renamed from: dy */
    public final gwj m38857dy() {
        return this.f28379c5;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m38858h4() {
        return this.f28382h4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m38862kk() {
        return this.f28384k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m38864m9() {
        return this.f28381dy;
    }

    /* JADX INFO: renamed from: to */
    public final String m38865to() {
        return this.f28385kk;
    }

    public pcw(final AbstractC13912i5 abstractC13912i5) {
        m38843ck();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.pcw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (pcw.f28378ck.m27428k4(str)) {
                    case 0:
                        pcw.this.f28384k4 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 1:
                        pcw.this.f28388x1 = str2;
                        break;
                    case 2:
                        pcw.this.f28385kk = str2;
                        break;
                    case 3:
                        pcw.this.f28387to = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 4:
                        pcw.this.f28380du = str2;
                        break;
                    case 5:
                        pcw.this.f28382h4 = str2;
                        break;
                    case 6:
                        pcw.this.f28386m9 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 7:
                        pcw.this.f28381dy = AbstractC7361bz.m29295ne(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.pcw.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = pcw.f28378ck.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 8) {
                    pcw.this.f28379c5 = new gwj(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 9) {
                    return false;
                }
                pcw.this.f28383jd = new zob(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final zob m38866x1() {
        if (this.f28383jd != null) {
            throw new Exception("Only one <text_properties> element can be added.");
        }
        zob zobVar = new zob();
        this.f28383jd = zobVar;
        return zobVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final gwj m38859k4() {
        if (this.f28379c5 != null) {
            throw new Exception("Only one <list_level_properties> element can be added.");
        }
        gwj gwjVar = new gwj();
        this.f28379c5 = gwjVar;
        return gwjVar;
    }

    /* JADX INFO: renamed from: kk */
    public final void m38863kk(String str) {
        this.f28382h4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m38867x1(long j) {
        this.f28381dy = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m38868x1(String str) {
        this.f28380du = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38860k4(long j) {
        this.f28384k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38861k4(String str) {
        this.f28385kk = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:level", C13850af.m65147x1(this.f28384k4));
        String str3 = this.f28388x1;
        if (str3 != null) {
            c3059ii.m12955x1("text:style-name", str3);
        }
        String str4 = this.f28385kk;
        if (str4 != null) {
            c3059ii.m12955x1("style:num-format", str4);
        }
        byte b = this.f28387to;
        if (b != -1) {
            c3059ii.m12955x1("style:num-letter-sync", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str5 = this.f28380du;
        if (str5 != null) {
            c3059ii.m12955x1("style:num-prefix", str5);
        }
        String str6 = this.f28382h4;
        if (str6 != null) {
            c3059ii.m12955x1("style:num-suffix", str6);
        }
        long j = this.f28386m9;
        if ((j & 4294967295L) != 1) {
            c3059ii.m12955x1("text:display-levels", C13850af.m65147x1(j));
        }
        long j2 = this.f28381dy;
        if ((4294967295L & j2) != 1) {
            c3059ii.m12955x1("text:start-value", C13850af.m65147x1(j2));
        }
        gwj gwjVar = this.f28379c5;
        if (gwjVar != null) {
            gwjVar.mo6846k4("style", c3059ii, "list-level-properties");
        }
        zob zobVar = this.f28383jd;
        if (zobVar != null) {
            zobVar.mo6846k4("style", c3059ii, "text-properties");
        }
        c3059ii.mo21898jd();
    }
}
