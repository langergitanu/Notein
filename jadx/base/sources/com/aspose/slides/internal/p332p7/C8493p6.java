package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.p6 */
/* JADX INFO: loaded from: classes4.dex */
public class C8493p6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f28227x1 = new C7017h4(TranslateLanguage.PORTUGUESE);

    /* JADX INFO: renamed from: k4 */
    private C7836hc f28228k4;

    public C8493p6() {
        this.f28228k4 = new C7836hc();
    }

    /* JADX INFO: renamed from: k4 */
    public final C7836hc m38624k4() {
        return this.f28228k4;
    }

    public C8493p6(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.p6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8493p6.f28227x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C8493p6.this.f28228k4 = new C7836hc(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f28228k4.mo6846k4("a", c3059ii, TranslateLanguage.PORTUGUESE);
        c3059ii.mo21898jd();
    }
}
