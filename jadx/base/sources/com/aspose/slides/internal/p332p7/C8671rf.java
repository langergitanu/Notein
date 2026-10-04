package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.rf */
/* JADX INFO: loaded from: classes4.dex */
public class C8671rf extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f29268to = new C7017h4("entityName", "entityId", "entityType");

    /* JADX INFO: renamed from: k4 */
    private String f29269k4;

    /* JADX INFO: renamed from: kk */
    private int f29270kk;

    /* JADX INFO: renamed from: x1 */
    private String f29271x1;

    public C8671rf() {
        m39974x1();
    }

    public C8671rf(AbstractC13912i5 abstractC13912i5) {
        m39974x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.rf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8671rf.f29268to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8671rf.this.f29269k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8671rf.this.f29271x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C8671rf.this.f29270kk = C8798sr.m41220k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m39974x1() {
        this.f29270kk = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("entityName", this.f29269k4);
        c3059ii.m12955x1("entityId", this.f29271x1);
        c3059ii.m12955x1("entityType", C8798sr.m41221k4(this.f29270kk));
        c3059ii.mo21898jd();
    }
}
