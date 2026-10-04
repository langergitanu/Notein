package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.sh */
/* JADX INFO: loaded from: classes4.dex */
public class C8771sh extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f30121x1 = new C7017h4("Transform");

    /* JADX INFO: renamed from: k4 */
    private List<C8276mo> f30122k4;

    public C8771sh() {
        m41019to();
    }

    /* JADX INFO: renamed from: to */
    private void m41019to() {
        this.f30122k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final C8276mo[] m41021x1() {
        return this.f30122k4.toArray(new C8276mo[0]);
    }

    public C8771sh(final AbstractC13912i5 abstractC13912i5) {
        m41019to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.sh.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8771sh.f30121x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C8771sh.this.f30122k4.addItem(new C8276mo(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8276mo m41020k4() {
        C8276mo c8276mo = new C8276mo();
        this.f30122k4.addItem(c8276mo);
        return c8276mo;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C8276mo> it = this.f30122k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("", c3059ii, "Transform");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
