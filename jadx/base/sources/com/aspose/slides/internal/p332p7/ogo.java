package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public final class ogo extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f27932kk = new C7017h4("relativeFrom", "align", "posOffset");

    /* JADX INFO: renamed from: k4 */
    private int f27933k4;

    /* JADX INFO: renamed from: x1 */
    private C7394ca f27934x1;

    public ogo() {
        this.f27933k4 = 0;
    }

    public ogo(final AbstractC13912i5 abstractC13912i5) {
        this();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ogo.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (ogo.f27932kk.m27428k4(str) != 0) {
                    return false;
                }
                ogo.this.f27933k4 = gqm.m32838k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ogo.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = ogo.f27932kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    abstractC13912i5.mo65026h4();
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    abstractC13912i5.mo65026h4();
                    ogo.this.f27934x1 = new C7394ca("posOffset", Integer.valueOf(C14057f9.m66582k4(abstractC13912i5.mo65042rv())));
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
        c3059ii.m12955x1("relativeFrom", gqm.m32839k4(this.f27933k4));
        C7394ca c7394ca = this.f27934x1;
        if (c7394ca == null || f27932kk.m27428k4(c7394ca.m29539k4()) != 2) {
            c3059ii2 = c3059ii;
        } else {
            c3059ii2 = c3059ii;
            m29301k4("wp", c3059ii2, "posOffset", C13850af.m65103k4(((Integer) C7019kk.m27464to(this.f27934x1.m29541kk(), Integer.TYPE)).intValue()), false);
        }
        c3059ii2.mo21898jd();
    }
}
