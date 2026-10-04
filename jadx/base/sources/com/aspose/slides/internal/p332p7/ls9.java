package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class ls9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26501kk = new C7017h4("manifest:start-key-generation-name", "manifest:key-size");

    /* JADX INFO: renamed from: k4 */
    private String f26502k4;

    /* JADX INFO: renamed from: x1 */
    private long f26503x1;

    public ls9() {
        m36416kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m36416kk() {
        this.f26503x1 = 4294967295L;
    }

    public ls9(AbstractC13912i5 abstractC13912i5) {
        m36416kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ls9.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ls9.f26501kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    ls9.this.f26502k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                ls9.this.f26503x1 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m36418k4() {
        return this.f26502k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36419k4(long j) {
        this.f26503x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m36420k4(String str) {
        this.f26502k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("manifest:start-key-generation-name", this.f26502k4);
        long j = this.f26503x1;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("manifest:key-size", C13850af.m65147x1(j));
        }
        c3059ii.mo21898jd();
    }
}
