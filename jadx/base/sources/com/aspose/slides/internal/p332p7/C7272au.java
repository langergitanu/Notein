package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.au */
/* JADX INFO: loaded from: classes4.dex */
public class C7272au extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f20222to = new C7017h4("rig", "dir", "rot");

    /* JADX INFO: renamed from: k4 */
    private int f20223k4;

    /* JADX INFO: renamed from: kk */
    private C8243m5 f20224kk;

    /* JADX INFO: renamed from: x1 */
    private int f20225x1;

    public C7272au() {
        m28476h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m28476h4() {
        this.f20223k4 = -1;
        this.f20225x1 = -1;
    }

    /* JADX INFO: renamed from: kk */
    public final int m28482kk() {
        return this.f20225x1;
    }

    /* JADX INFO: renamed from: to */
    public final C8243m5 m28483to() {
        return this.f20224kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m28484x1() {
        return this.f20223k4;
    }

    public C7272au(final AbstractC13912i5 abstractC13912i5) {
        m28476h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.au.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7272au.f20222to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7272au.this.f20223k4 = C9066vt.m43246k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C7272au.this.f20225x1 = C9071vw.m43330k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.au.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7272au.f20222to.m27428k4(abstractC13912i5.mo65023fa()) != 2) {
                    return false;
                }
                C7272au.this.f20224kk = new C8243m5(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8243m5 m28480k4() {
        if (this.f20224kk != null) {
            throw new Exception("Only one <rot> element can be added.");
        }
        C8243m5 c8243m5 = new C8243m5();
        this.f20224kk = c8243m5;
        return c8243m5;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m28485x1(int i) {
        this.f20225x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28481k4(int i) {
        this.f20223k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("rig", C9066vt.m43247k4(this.f20223k4));
        c3059ii.m12955x1("dir", C9071vw.m43331k4(this.f20225x1));
        C8243m5 c8243m5 = this.f20224kk;
        if (c8243m5 != null) {
            c8243m5.mo6846k4("a", c3059ii, "rot");
        }
        c3059ii.mo21898jd();
    }
}
