package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.vu */
/* JADX INFO: loaded from: classes4.dex */
public class C9069vu extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f32036to = new C7017h4("idx", "formatCode", "v");

    /* JADX INFO: renamed from: k4 */
    private long f32037k4;

    /* JADX INFO: renamed from: kk */
    private String f32038kk;

    /* JADX INFO: renamed from: x1 */
    private String f32039x1;

    public C9069vu() {
    }

    /* JADX INFO: renamed from: k4 */
    public final long m43317k4() {
        return this.f32037k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m43320kk() {
        return this.f32038kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m43321x1() {
        return this.f32039x1;
    }

    public C9069vu(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.vu.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9069vu.f32036to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9069vu.this.f32037k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C9069vu.this.f32039x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.vu.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C9069vu.f32036to.m27428k4(abstractC13912i5.mo65023fa()) != 2) {
                    return false;
                }
                C9069vu.this.f32038kk = abstractC13912i5.mo65052v4();
                if (abstractC13912i5.mo65048u4()) {
                    return true;
                }
                while (abstractC13912i5.mo65028jd() != 15) {
                    abstractC13912i5.mo65026h4();
                    C9069vu c9069vu = C9069vu.this;
                    c9069vu.f32038kk = C14113y2.m67400k4(c9069vu.f32038kk, abstractC13912i5.mo65052v4());
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final void m43322x1(String str) {
        this.f32038kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43318k4(long j) {
        this.f32037k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43319k4(String str) {
        this.f32039x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("idx", C13850af.m65147x1(this.f32037k4));
        String str3 = this.f32039x1;
        if (str3 != null) {
            c3059ii.m12955x1("formatCode", str3);
        }
        m29301k4("c", c3059ii, "v", this.f32038kk, false);
        c3059ii.mo21898jd();
    }
}
