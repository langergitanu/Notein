package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ge */
/* JADX INFO: loaded from: classes4.dex */
public class C7752ge extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f23387to = new C7017h4("seriesName", "categoryName", "value");

    /* JADX INFO: renamed from: k4 */
    private byte f23388k4;

    /* JADX INFO: renamed from: kk */
    private byte f23389kk;

    /* JADX INFO: renamed from: x1 */
    private byte f23390x1;

    public C7752ge() {
        m32472du();
    }

    /* JADX INFO: renamed from: du */
    private void m32472du() {
        this.f23388k4 = (byte) -1;
        this.f23390x1 = (byte) -1;
        this.f23389kk = (byte) -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m32477k4() {
        return this.f23388k4;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m32479kk() {
        return this.f23389kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m32481x1() {
        return this.f23390x1;
    }

    public C7752ge(AbstractC13912i5 abstractC13912i5) {
        m32472du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ge.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7752ge.f23387to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7752ge.this.f23388k4 = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7752ge.this.f23390x1 = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C7752ge.this.f23389kk = AbstractC7361bz.m29296rv(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32478k4(byte b) {
        this.f23388k4 = b;
    }

    /* JADX INFO: renamed from: kk */
    public final void m32480kk(byte b) {
        this.f23389kk = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m32482x1(byte b) {
        this.f23390x1 = b;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f23388k4;
        if (b != -1) {
            c3059ii.m12955x1("seriesName", b == 1 ? "1" : "0");
        }
        byte b2 = this.f23390x1;
        if (b2 != -1) {
            c3059ii.m12955x1("categoryName", b2 == 1 ? "1" : "0");
        }
        byte b3 = this.f23389kk;
        if (b3 != -1) {
            c3059ii.m12955x1("value", b3 == 1 ? "1" : "0");
        }
        c3059ii.mo21898jd();
    }
}
