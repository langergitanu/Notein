package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p077d8.C3083s7;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.to */
/* JADX INFO: loaded from: classes4.dex */
public class C8881to extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    private hzq f30813k4;

    /* JADX INFO: renamed from: x1 */
    private hzq f30814x1;

    public C8881to() {
    }

    /* JADX INFO: renamed from: k4 */
    public final hzq m41816k4() {
        if (this.f30813k4 != null) {
            throw new Exception("Only one <oleObj> element can be added.");
        }
        hzq hzqVar = new hzq();
        this.f30813k4 = hzqVar;
        return hzqVar;
    }

    /* JADX INFO: renamed from: kk */
    public final hzq m41817kk() {
        return this.f30813k4;
    }

    /* JADX INFO: renamed from: to */
    public final hzq m41818to() {
        return this.f30814x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final hzq m41819x1() {
        if (this.f30814x1 != null) {
            throw new Exception("Only one <oleObj> element can be added.");
        }
        hzq hzqVar = new hzq();
        this.f30814x1 = hzqVar;
        return hzqVar;
    }

    public C8881to(AbstractC13912i5 abstractC13912i5) {
        if (C3083s7.f9152k4.m12773k4("urn:schemas-microsoft-com:vml") && "v".equals(abstractC13912i5.mo65060yj())) {
            this.f30814x1 = new hzq(abstractC13912i5);
        } else {
            this.f30813k4 = new hzq(abstractC13912i5);
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        if (this.f30814x1 == null) {
            hzq hzqVar = this.f30813k4;
            if (hzqVar != null) {
                hzqVar.mo6846k4(str, c3059ii, "oleObj");
                return;
            }
            return;
        }
        c3059ii.mo12953k4("mc", "AlternateContent", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        if (this.f30814x1 != null) {
            c3059ii.mo12953k4("mc", "Choice", (String) null);
            c3059ii.m12954to("xmlns", "v", null, "urn:schemas-microsoft-com:vml");
            c3059ii.m12955x1("Requires", "v");
            this.f30814x1.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "oleObj");
            c3059ii.mo21898jd();
        }
        if (this.f30813k4 != null) {
            c3059ii.mo12953k4("mc", "Fallback", (String) null);
            this.f30813k4.mo6846k4(str, c3059ii, "oleObj");
            c3059ii.mo21898jd();
        }
        c3059ii.mo21898jd();
    }
}
