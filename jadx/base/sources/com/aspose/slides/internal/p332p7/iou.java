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
public class iou extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f24856kk = new C7017h4("placeholder", "attr");

    /* JADX INFO: renamed from: k4 */
    private ef9 f24857k4;

    /* JADX INFO: renamed from: x1 */
    private List<rl8> f24858x1;

    public iou() {
        m34353x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m34353x1() {
        this.f24858x1 = new List<>();
    }

    public iou(final AbstractC13912i5 abstractC13912i5) {
        m34353x1();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.iou.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = iou.f24856kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    iou.this.f24857k4 = new ef9(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    iou.this.f24858x1.addItem(new rl8(abstractC13912i5));
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        ef9 ef9Var = this.f24857k4;
        if (ef9Var != null) {
            ef9Var.mo6846k4("w", c3059ii, "placeholder");
        }
        List.Enumerator<rl8> it = this.f24858x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("w", c3059ii, "attr");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
