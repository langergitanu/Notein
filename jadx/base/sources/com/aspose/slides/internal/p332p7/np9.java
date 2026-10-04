package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class np9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f27526x1 = new C7017h4("customPr");

    /* JADX INFO: renamed from: k4 */
    private List<yin> f27527k4;

    public np9() {
        m37805x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m37805x1() {
        this.f27527k4 = new List<>();
    }

    public np9(final AbstractC13912i5 abstractC13912i5) {
        m37805x1();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.np9.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (np9.f27526x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                np9.this.f27527k4.addItem(new yin(abstractC13912i5));
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<yin> it = this.f27527k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "customPr");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
