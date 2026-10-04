package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class oeg extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f27896kk = new C7017h4("cBhvr", "to");

    /* JADX INFO: renamed from: k4 */
    private no7 f27897k4;

    /* JADX INFO: renamed from: x1 */
    private ijy f27898x1;

    public oeg() {
        this.f27897k4 = new no7();
    }

    /* JADX INFO: renamed from: k4 */
    public final ijy m38214k4() {
        if (this.f27898x1 != null) {
            throw new Exception("Only one <to> element can be added.");
        }
        ijy ijyVar = new ijy();
        this.f27898x1 = ijyVar;
        return ijyVar;
    }

    /* JADX INFO: renamed from: kk */
    public final ijy m38215kk() {
        return this.f27898x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final no7 m38216x1() {
        return this.f27897k4;
    }

    public oeg(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.oeg.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = oeg.f27896kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    oeg.this.f27897k4 = new no7(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    oeg.this.f27898x1 = new ijy(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f27897k4.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cBhvr");
        ijy ijyVar = this.f27898x1;
        if (ijyVar != null) {
            ijyVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "to");
        }
        c3059ii.mo21898jd();
    }
}
