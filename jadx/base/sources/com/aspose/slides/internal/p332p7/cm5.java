package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class cm5 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f21132du = new C7017h4("manifest:key-derivation-name", "manifest:salt", "manifest:iteration-count", "manifest:key-size");

    /* JADX INFO: renamed from: k4 */
    private String f21133k4;

    /* JADX INFO: renamed from: kk */
    private long f21134kk;

    /* JADX INFO: renamed from: to */
    private long f21135to;

    /* JADX INFO: renamed from: x1 */
    private String f21136x1;

    public cm5() {
        m29672h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m29672h4() {
        this.f21135to = 4294967295L;
    }

    /* JADX INFO: renamed from: kk */
    public final long m29680kk() {
        return this.f21134kk;
    }

    /* JADX INFO: renamed from: to */
    public final long m29681to() {
        return this.f21135to;
    }

    public cm5(AbstractC13912i5 abstractC13912i5) {
        m29672h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.cm5.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = cm5.f21132du.m27428k4(str);
                if (iM27428k4 == 0) {
                    cm5.this.f21133k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    cm5.this.f21136x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    cm5.this.f21134kk = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                cm5.this.f21135to = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m29677k4() {
        return this.f21133k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m29682x1() {
        return this.f21136x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29678k4(long j) {
        this.f21134kk = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m29683x1(long j) {
        this.f21135to = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29679k4(String str) {
        this.f21133k4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m29684x1(String str) {
        this.f21136x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("manifest:key-derivation-name", this.f21133k4);
        c3059ii.m12955x1("manifest:salt", this.f21136x1);
        c3059ii.m12955x1("manifest:iteration-count", C13850af.m65147x1(this.f21134kk));
        long j = this.f21135to;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("manifest:key-size", C13850af.m65147x1(j));
        }
        c3059ii.mo21898jd();
    }
}
