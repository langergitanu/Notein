package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.w9 */
/* JADX INFO: loaded from: classes4.dex */
public class C9099w9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f32242kk = new C7017h4("idx", "v");

    /* JADX INFO: renamed from: k4 */
    private long f32243k4;

    /* JADX INFO: renamed from: x1 */
    private String f32244x1;

    public C9099w9() {
    }

    /* JADX INFO: renamed from: k4 */
    public final long m43589k4() {
        return this.f32243k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m43592x1() {
        return this.f32244x1;
    }

    public C9099w9(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.w9.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C9099w9.f32242kk.m27428k4(str) != 0) {
                    return false;
                }
                C9099w9.this.f32243k4 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.w9.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C9099w9.f32242kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                C9099w9.this.f32244x1 = abstractC13912i5.mo65052v4();
                if (!abstractC13912i5.mo65048u4()) {
                    while (abstractC13912i5.mo65028jd() != 15) {
                        abstractC13912i5.mo65026h4();
                        C9099w9 c9099w9 = C9099w9.this;
                        c9099w9.f32244x1 = C14113y2.m67400k4(c9099w9.f32244x1, abstractC13912i5.mo65052v4());
                    }
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43590k4(long j) {
        this.f32243k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43591k4(String str) {
        this.f32244x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("idx", C13850af.m65147x1(this.f32243k4));
        m29301k4("c", c3059ii, "v", this.f32244x1, false);
        c3059ii.mo21898jd();
    }
}
