package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.op */
/* JADX INFO: loaded from: classes4.dex */
public class C8461op extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f28056kk = new C7017h4("track", "time");

    /* JADX INFO: renamed from: k4 */
    private byte f28057k4;

    /* JADX INFO: renamed from: x1 */
    private long f28058x1;

    public C8461op() {
        m38399to();
    }

    /* JADX INFO: renamed from: to */
    private void m38399to() {
        this.f28058x1 = 0L;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m38400k4() {
        return this.f28057k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m38403x1() {
        return this.f28058x1;
    }

    public C8461op(AbstractC13912i5 abstractC13912i5) {
        m38399to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.op.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8461op.f28056kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8461op.this.f28057k4 = C13850af.m65126rv(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8461op.this.f28058x1 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38401k4(byte b) {
        this.f28057k4 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38402k4(long j) {
        this.f28058x1 = j;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("track", C13850af.m65145x1(this.f28057k4));
        long j = this.f28058x1;
        if ((4294967295L & j) != 0) {
            c3059ii.m12955x1("time", C13850af.m65147x1(j));
        }
        c3059ii.mo21898jd();
    }
}
