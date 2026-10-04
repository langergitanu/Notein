package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class ozv extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f28177to = new C7017h4("movie", "control");

    /* JADX INFO: renamed from: k4 */
    private C8249m9 f28178k4;

    /* JADX INFO: renamed from: kk */
    private slx f28179kk;

    /* JADX INFO: renamed from: x1 */
    private hz2 f28180x1;

    public ozv() {
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8249m9 c8249m9 = this.f28178k4;
        if (c8249m9 != null) {
            c8249m9.mo6846k4("", c3059ii, "");
        }
        hz2 hz2Var = this.f28180x1;
        if (hz2Var != null) {
            hz2Var.mo6846k4("w", c3059ii, "movie");
        }
        slx slxVar = this.f28179kk;
        if (slxVar != null) {
            slxVar.mo6846k4("w", c3059ii, "control");
        }
        c3059ii.mo21898jd();
    }

    public ozv(AbstractC13912i5 abstractC13912i5) {
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() != 15 || !C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    if (abstractC13912i5.mo65028jd() == 1) {
                        int iM27428k4 = f28177to.m27428k4(abstractC13912i5.mo65023fa());
                        if (iM27428k4 == 0) {
                            this.f28180x1 = new hz2(abstractC13912i5);
                            break;
                        } else if (iM27428k4 == 1) {
                            this.f28179kk = new slx(abstractC13912i5);
                            break;
                        } else {
                            this.f28178k4 = new C8249m9(abstractC13912i5);
                            if (abstractC13912i5.mo65015ar()) {
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
