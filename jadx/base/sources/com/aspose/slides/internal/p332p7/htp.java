package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes4.dex */
public class htp extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f24290h4 = new C7017h4("id", "min", "max", "man", TranslateLanguage.PORTUGUESE);

    /* JADX INFO: renamed from: du */
    private boolean f24291du;

    /* JADX INFO: renamed from: k4 */
    private long f24292k4;

    /* JADX INFO: renamed from: kk */
    private long f24293kk;

    /* JADX INFO: renamed from: to */
    private boolean f24294to;

    /* JADX INFO: renamed from: x1 */
    private long f24295x1;

    public htp() {
        m33618x1();
    }

    public htp(AbstractC13912i5 abstractC13912i5) {
        m33618x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.htp.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = htp.f24290h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    htp.this.f24292k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    htp.this.f24295x1 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    htp.this.f24293kk = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    htp.this.f24294to = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                htp.this.f24291du = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m33618x1() {
        this.f24292k4 = 0L;
        this.f24295x1 = 0L;
        this.f24293kk = 0L;
        this.f24294to = false;
        this.f24291du = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f24292k4;
        if ((j & 4294967295L) != 0) {
            c3059ii.m12955x1("id", C13850af.m65147x1(j));
        }
        long j2 = this.f24295x1;
        if ((j2 & 4294967295L) != 0) {
            c3059ii.m12955x1("min", C13850af.m65147x1(j2));
        }
        long j3 = this.f24293kk;
        if ((4294967295L & j3) != 0) {
            c3059ii.m12955x1("max", C13850af.m65147x1(j3));
        }
        boolean z = this.f24294to;
        if (z) {
            c3059ii.m12955x1("man", z ? "1" : "0");
        }
        boolean z2 = this.f24291du;
        if (z2) {
            c3059ii.m12955x1(TranslateLanguage.PORTUGUESE, z2 ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
