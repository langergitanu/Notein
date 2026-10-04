package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public final class kkf extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f25743kk = new C7017h4("relativeFrom", "align", "posOffset");

    /* JADX INFO: renamed from: k4 */
    private int f25744k4;

    /* JADX INFO: renamed from: x1 */
    private C7394ca f25745x1;

    public kkf() {
        this.f25744k4 = 0;
    }

    public kkf(final AbstractC13912i5 abstractC13912i5) {
        this();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kkf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (kkf.f25743kk.m27428k4(str) != 0) {
                    return false;
                }
                kkf.this.f25744k4 = d1h.m30006k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.kkf.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = kkf.f25743kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    abstractC13912i5.mo65026h4();
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    abstractC13912i5.mo65026h4();
                    kkf.this.f25745x1 = new C7394ca("posOffset", Integer.valueOf(C14057f9.m66582k4(abstractC13912i5.mo65042rv())));
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("relativeFrom", d1h.m30007k4(this.f25744k4));
        C7394ca c7394ca = this.f25745x1;
        if (c7394ca == null || f25743kk.m27428k4(c7394ca.m29539k4()) != 2) {
            c3059ii2 = c3059ii;
        } else {
            c3059ii2 = c3059ii;
            m29301k4("wp", c3059ii2, "posOffset", C13850af.m65103k4(((Integer) C7019kk.m27464to(this.f25745x1.m29541kk(), Integer.TYPE)).intValue()), false);
        }
        c3059ii2.mo21898jd();
    }
}
