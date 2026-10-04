package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class fwr extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f23075du = new C7017h4("draw:name", "draw:display-name", "svg:viewBox", "svg:d");

    /* JADX INFO: renamed from: k4 */
    private String f23076k4;

    /* JADX INFO: renamed from: kk */
    private String f23077kk;

    /* JADX INFO: renamed from: to */
    private String f23078to;

    /* JADX INFO: renamed from: x1 */
    private String f23079x1;

    public fwr() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m32114k4() {
        return this.f23076k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m32116kk() {
        return this.f23078to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m32118x1() {
        return this.f23077kk;
    }

    public fwr(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.fwr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = fwr.f23075du.m27428k4(str);
                if (iM27428k4 == 0) {
                    fwr.this.f23076k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    fwr.this.f23079x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    fwr.this.f23077kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                fwr.this.f23078to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32115k4(String str) {
        this.f23076k4 = str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m32117kk(String str) {
        this.f23078to = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m32119x1(String str) {
        this.f23077kk = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("draw:name", this.f23076k4);
        String str3 = this.f23079x1;
        if (str3 != null) {
            c3059ii.m12955x1("draw:display-name", str3);
        }
        c3059ii.m12955x1("svg:viewBox", this.f23077kk);
        c3059ii.m12955x1("svg:d", this.f23078to);
        c3059ii.mo21898jd();
    }
}
