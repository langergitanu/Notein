package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class ehe extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f22243to = new C7017h4("tnLst", "bldLst", "extLst");

    /* JADX INFO: renamed from: k4 */
    private rqz f22244k4;

    /* JADX INFO: renamed from: kk */
    private dnu f22245kk;

    /* JADX INFO: renamed from: x1 */
    private tif f22246x1;

    public ehe() {
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC7414ck m31092du() {
        return this.f22245kk;
    }

    /* JADX INFO: renamed from: kk */
    public final rqz m31097kk() {
        return this.f22244k4;
    }

    /* JADX INFO: renamed from: to */
    public final tif m31098to() {
        return this.f22246x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final tif m31099x1() {
        if (this.f22246x1 != null) {
            throw new Exception("Only one <bldLst> element can be added.");
        }
        tif tifVar = new tif();
        this.f22246x1 = tifVar;
        return tifVar;
    }

    public ehe(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ehe.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = ehe.f22243to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    ehe.this.f22244k4 = new rqz(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    ehe.this.f22246x1 = new tif(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    ehe.this.f22245kk = new dnu(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final rqz m31093k4() {
        if (this.f22244k4 != null) {
            throw new Exception("Only one <tnLst> element can be added.");
        }
        rqz rqzVar = new rqz();
        this.f22244k4 = rqzVar;
        return rqzVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31094k4(AbstractC7414ck abstractC7414ck) {
        this.f22245kk = (dnu) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31095k4(rqz rqzVar) {
        this.f22244k4 = rqzVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31096k4(tif tifVar) {
        this.f22246x1 = tifVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        rqz rqzVar = this.f22244k4;
        if (rqzVar != null) {
            rqzVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "tnLst");
        }
        tif tifVar = this.f22246x1;
        if (tifVar != null) {
            tifVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "bldLst");
        }
        dnu dnuVar = this.f22245kk;
        if (dnuVar != null) {
            dnuVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
