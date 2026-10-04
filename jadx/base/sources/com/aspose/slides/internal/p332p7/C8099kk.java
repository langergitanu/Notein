package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p077d8.C3083s7;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C8099kk extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    private prv f25735k4;

    /* JADX INFO: renamed from: x1 */
    private prv f25736x1;

    public C8099kk() {
    }

    /* JADX INFO: renamed from: k4 */
    public final prv m35462k4() {
        if (this.f25735k4 != null) {
            throw new Exception("Only one <control> element can be added.");
        }
        prv prvVar = new prv();
        this.f25735k4 = prvVar;
        return prvVar;
    }

    /* JADX INFO: renamed from: kk */
    public final prv m35463kk() {
        return this.f25735k4;
    }

    /* JADX INFO: renamed from: to */
    public final prv m35464to() {
        return this.f25736x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final prv m35465x1() {
        if (this.f25736x1 != null) {
            throw new Exception("Only one <control> element can be added.");
        }
        prv prvVar = new prv();
        this.f25736x1 = prvVar;
        return prvVar;
    }

    public C8099kk(AbstractC13912i5 abstractC13912i5) {
        if (C3083s7.f9152k4.m12773k4("urn:schemas-microsoft-com:vml") && "v".equals(abstractC13912i5.mo65060yj())) {
            this.f25736x1 = new prv(abstractC13912i5);
        } else {
            this.f25735k4 = new prv(abstractC13912i5);
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        if (this.f25736x1 == null) {
            prv prvVar = this.f25735k4;
            if (prvVar != null) {
                prvVar.mo6846k4(str, c3059ii, "control");
                return;
            }
            return;
        }
        c3059ii.mo12953k4("mc", "AlternateContent", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        if (this.f25736x1 != null) {
            c3059ii.mo12953k4("mc", "Choice", (String) null);
            c3059ii.m12954to("xmlns", "v", null, "urn:schemas-microsoft-com:vml");
            c3059ii.m12955x1("Requires", "v");
            this.f25736x1.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "control");
            c3059ii.mo21898jd();
        }
        if (this.f25735k4 != null) {
            c3059ii.mo12953k4("mc", "Fallback", (String) null);
            this.f25735k4.mo6846k4(str, c3059ii, "control");
            c3059ii.mo21898jd();
        }
        c3059ii.mo21898jd();
    }
}
