package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ls */
/* JADX INFO: loaded from: classes4.dex */
public class C8208ls extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26496kk = new C7017h4("len", "hash");

    /* JADX INFO: renamed from: k4 */
    private long f26497k4;

    /* JADX INFO: renamed from: x1 */
    private long f26498x1;

    public C8208ls() {
        m36406to();
    }

    /* JADX INFO: renamed from: to */
    private void m36406to() {
        this.f26497k4 = 0L;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m36408k4() {
        return this.f26497k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m36410x1() {
        return this.f26498x1;
    }

    public C8208ls(AbstractC13912i5 abstractC13912i5) {
        m36406to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ls.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8208ls.f26496kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8208ls.this.f26497k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8208ls.this.f26498x1 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36409k4(long j) {
        this.f26497k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m36411x1(long j) {
        this.f26498x1 = j;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f26497k4;
        if ((4294967295L & j) != 0) {
            c3059ii.m12955x1("len", C13850af.m65147x1(j));
        }
        c3059ii.m12955x1("hash", C13850af.m65147x1(this.f26498x1));
        c3059ii.mo21898jd();
    }
}
