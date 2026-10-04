package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.f8 */
/* JADX INFO: loaded from: classes4.dex */
public class C7644f8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f22707du = new C7017h4("xml:id", "traceDataRef", Constants.MessagePayloadKeys.FROM, "to");

    /* JADX INFO: renamed from: k4 */
    private String f22708k4;

    /* JADX INFO: renamed from: kk */
    private String f22709kk;

    /* JADX INFO: renamed from: to */
    private String f22710to;

    /* JADX INFO: renamed from: x1 */
    private String f22711x1;

    public C7644f8() {
    }

    public C7644f8(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.f8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7644f8.f22707du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7644f8.this.f22708k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7644f8.this.f22711x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C7644f8.this.f22709kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C7644f8.this.f22710to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f22708k4;
        if (str3 != null) {
            c3059ii.m12955x1("xml:id", str3);
        }
        String str4 = this.f22711x1;
        if (str4 != null) {
            c3059ii.m12955x1("traceDataRef", str4);
        }
        String str5 = this.f22709kk;
        if (str5 != null) {
            c3059ii.m12955x1(Constants.MessagePayloadKeys.FROM, str5);
        }
        String str6 = this.f22710to;
        if (str6 != null) {
            c3059ii.m12955x1("to", str6);
        }
        c3059ii.mo21898jd();
    }
}
