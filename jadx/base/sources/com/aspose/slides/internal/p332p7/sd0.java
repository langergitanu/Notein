package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class sd0 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f30035x1 = new C7017h4("attrName");

    /* JADX INFO: renamed from: k4 */
    private List<String> f30036k4;

    public sd0() {
        m40901kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m40901kk() {
        this.f30036k4 = new List<>();
    }

    public sd0(final AbstractC13912i5 abstractC13912i5) {
        m40901kk();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.sd0.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (sd0.f30035x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                String strMo65052v4 = abstractC13912i5.mo65052v4();
                if (abstractC13912i5.mo65048u4()) {
                    return true;
                }
                while (abstractC13912i5.mo65028jd() != 15) {
                    abstractC13912i5.mo65026h4();
                    strMo65052v4 = C14113y2.m67400k4(strMo65052v4, abstractC13912i5.mo65052v4());
                }
                sd0.this.f30036k4.addItem(strMo65052v4);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40903k4(String str) {
        this.f30036k4.addItem(str);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<String> it = this.f30036k4.iterator();
        while (it.hasNext()) {
            try {
                C3059ii c3059ii2 = c3059ii;
                m29301k4(ContextChain.TAG_PRODUCT, c3059ii2, "attrName", it.next(), false);
                c3059ii = c3059ii2;
            } finally {
            }
        }
        C3059ii c3059ii3 = c3059ii;
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        c3059ii3.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final String[] m40904k4() {
        return this.f30036k4.toArray(new String[0]);
    }
}
