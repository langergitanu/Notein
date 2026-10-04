package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class omq extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f28040du = new C7017h4("svg:x", "svg:y", "svg:width", "svg:height");

    /* JADX INFO: renamed from: k4 */
    private String f28041k4;

    /* JADX INFO: renamed from: kk */
    private String f28042kk;

    /* JADX INFO: renamed from: to */
    private String f28043to;

    /* JADX INFO: renamed from: x1 */
    private String f28044x1;

    public omq() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m38378k4() {
        return this.f28041k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m38379kk() {
        return this.f28042kk;
    }

    /* JADX INFO: renamed from: to */
    public final String m38380to() {
        return this.f28043to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m38381x1() {
        return this.f28044x1;
    }

    public omq(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.omq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = omq.f28040du.m27428k4(str);
                if (iM27428k4 == 0) {
                    omq.this.f28041k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    omq.this.f28044x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    omq.this.f28042kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                omq.this.f28043to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f28041k4;
        if (str3 != null) {
            c3059ii.m12955x1("svg:x", str3);
        }
        String str4 = this.f28044x1;
        if (str4 != null) {
            c3059ii.m12955x1("svg:y", str4);
        }
        String str5 = this.f28042kk;
        if (str5 != null) {
            c3059ii.m12955x1("svg:width", str5);
        }
        String str6 = this.f28043to;
        if (str6 != null) {
            c3059ii.m12955x1("svg:height", str6);
        }
        c3059ii.mo21898jd();
    }
}
