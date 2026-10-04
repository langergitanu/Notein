package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class wd3 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f32274kk = new C7017h4("Identifier", "Description");

    /* JADX INFO: renamed from: k4 */
    private String f32275k4;

    /* JADX INFO: renamed from: x1 */
    private String f32276x1;

    public wd3() {
    }

    public wd3(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.wd3.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = wd3.f32274kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    wd3.this.f32275k4 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            wd3 wd3Var = wd3.this;
                            wd3Var.f32275k4 = C14113y2.m67400k4(wd3Var.f32275k4, abstractC13912i5.mo65052v4());
                        }
                    }
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    wd3.this.f32276x1 = abstractC13912i5.mo65052v4();
                    if (!abstractC13912i5.mo65048u4()) {
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            wd3 wd3Var2 = wd3.this;
                            wd3Var2.f32276x1 = C14113y2.m67400k4(wd3Var2.f32276x1, abstractC13912i5.mo65052v4());
                        }
                    }
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final void m43632x1(String str) {
        this.f32276x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43631k4(String str) {
        this.f32275k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        m29301k4("xd", c3059ii, "Identifier", this.f32275k4, false);
        String str3 = this.f32276x1;
        if (str3 != null) {
            m29301k4("xd", c3059ii, "Description", str3, false);
        }
        c3059ii.mo21898jd();
    }
}
