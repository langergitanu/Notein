package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.hp */
/* JADX INFO: loaded from: classes4.dex */
public class C7873hp extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f24252kk = new C7017h4("ds:itemID", "schemaRefs");

    /* JADX INFO: renamed from: k4 */
    private C14047bz f24253k4 = new C14047bz();

    /* JADX INFO: renamed from: x1 */
    private C8602qi f24254x1;

    public C7873hp() {
        m33561du();
    }

    /* JADX INFO: renamed from: du */
    private void m33561du() {
        C14047bz.f47172k4.CloneTo(this.f24253k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final C8602qi m33565k4() {
        if (this.f24254x1 != null) {
            throw new Exception("Only one <schemaRefs> element can be added.");
        }
        C8602qi c8602qi = new C8602qi();
        this.f24254x1 = c8602qi;
        return c8602qi;
    }

    /* JADX INFO: renamed from: kk */
    public final C8602qi m33567kk() {
        return this.f24254x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C14047bz m33568x1() {
        return this.f24253k4;
    }

    public C7873hp(final AbstractC13912i5 abstractC13912i5) {
        m33561du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.hp.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7873hp.f24252kk.m27428k4(str) != 0) {
                    return false;
                }
                C7873hp.this.f24253k4 = new C14047bz(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.hp.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7873hp.f24252kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                C7873hp.this.f24254x1 = new C8602qi(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33566k4(C14047bz c14047bz) {
        c14047bz.CloneTo(this.f24253k4);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("ds", str2, "http://schemas.openxmlformats.org/officeDocument/2006/customXml");
        c3059ii.m12955x1("ds:itemID", C14113y2.m67408k4("{", OooOO0.OooO00o(this.f24253k4), "}"));
        C8602qi c8602qi = this.f24254x1;
        if (c8602qi != null) {
            c8602qi.mo6846k4("ds", c3059ii, "schemaRefs");
        }
        c3059ii.mo21898jd();
    }
}
