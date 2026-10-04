package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.sb */
/* JADX INFO: loaded from: classes4.dex */
public class C8754sb extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f30013kk = new C7017h4("f", "v");

    /* JADX INFO: renamed from: k4 */
    private C8212lu f30014k4;

    /* JADX INFO: renamed from: x1 */
    private String f30015x1;

    public C8754sb() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C8212lu m40878k4() {
        return this.f30014k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m40881x1() {
        return this.f30015x1;
    }

    public C8754sb(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.sb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8754sb.f30013kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8754sb.this.f30014k4 = new C8212lu(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C8754sb.this.f30015x1 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C8754sb c8754sb = C8754sb.this;
                            c8754sb.f30015x1 = C14113y2.m67400k4(c8754sb.f30015x1, abstractC13912i5.mo65052v4());
                        }
                    }
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40879k4(C8212lu c8212lu) {
        this.f30014k4 = c8212lu;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40880k4(String str) {
        this.f30015x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        C8212lu c8212lu = this.f30014k4;
        if (c8212lu != null) {
            c8212lu.mo6846k4("cx", c3059ii, "f");
        }
        String str3 = this.f30015x1;
        if (str3 != null) {
            c3059ii2 = c3059ii;
            m29301k4("cx", c3059ii2, "v", str3, false);
        } else {
            c3059ii2 = c3059ii;
        }
        c3059ii2.mo21898jd();
    }
}
