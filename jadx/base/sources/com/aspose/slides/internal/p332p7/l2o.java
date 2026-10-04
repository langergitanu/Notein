package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class l2o extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final byte f26057k4 = C9317yw.m45190k4("horz");

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26058kk = new C7017h4("dir");

    /* JADX INFO: renamed from: x1 */
    private byte f26059x1;

    public l2o() {
        m35830kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m35830kk() {
        this.f26059x1 = f26057k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m35832k4() {
        return this.f26059x1;
    }

    public l2o(AbstractC13912i5 abstractC13912i5) {
        m35830kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.l2o.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (l2o.f26058kk.m27428k4(str) != 0) {
                    return false;
                }
                l2o.this.f26059x1 = C9317yw.m45190k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35833k4(byte b) {
        this.f26059x1 = b;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f26059x1;
        if (b != f26057k4) {
            c3059ii.m12955x1("dir", C9317yw.m45191k4(b));
        }
        c3059ii.mo21898jd();
    }
}
