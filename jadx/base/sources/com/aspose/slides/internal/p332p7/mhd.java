package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class mhd extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f26861h4 = new C7017h4("table:cell-range", "svg:x", "svg:y", "chart:style-name", ContextChain.TAG_PRODUCT);

    /* JADX INFO: renamed from: du */
    private ok7 f26862du;

    /* JADX INFO: renamed from: k4 */
    private String f26863k4;

    /* JADX INFO: renamed from: kk */
    private String f26864kk;

    /* JADX INFO: renamed from: to */
    private String f26865to;

    /* JADX INFO: renamed from: x1 */
    private String f26866x1;

    public mhd() {
    }

    /* JADX INFO: renamed from: k4 */
    public final ok7 m36953k4() {
        return this.f26862du;
    }

    public mhd(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.mhd.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = mhd.f26861h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    mhd.this.f26863k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    mhd.this.f26866x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    mhd.this.f26864kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                mhd.this.f26865to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.mhd.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (mhd.f26861h4.m27428k4(abstractC13912i5.mo65023fa()) != 4) {
                    return false;
                }
                mhd.this.f26862du = new ok7(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f26863k4;
        if (str3 != null) {
            c3059ii.m12955x1("table:cell-range", str3);
        }
        String str4 = this.f26866x1;
        if (str4 != null) {
            c3059ii.m12955x1("svg:x", str4);
        }
        String str5 = this.f26864kk;
        if (str5 != null) {
            c3059ii.m12955x1("svg:y", str5);
        }
        String str6 = this.f26865to;
        if (str6 != null) {
            c3059ii.m12955x1("chart:style-name", str6);
        }
        ok7 ok7Var = this.f26862du;
        if (ok7Var != null) {
            ok7Var.mo6846k4("text", c3059ii, ContextChain.TAG_PRODUCT);
        }
        c3059ii.mo21898jd();
    }
}
