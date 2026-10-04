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
public class cii extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f21091to = new C7017h4("edited", "start", "lineTo");

    /* JADX INFO: renamed from: k4 */
    private byte f21092k4;

    /* JADX INFO: renamed from: kk */
    private List<C9391zp> f21093kk;

    /* JADX INFO: renamed from: x1 */
    private C9391zp f21094x1;

    public cii() {
        m29632x1();
        this.f21094x1 = new C9391zp();
    }

    /* JADX INFO: renamed from: x1 */
    private void m29632x1() {
        this.f21092k4 = (byte) -1;
        this.f21093kk = new List<>();
    }

    public cii(final AbstractC13912i5 abstractC13912i5) {
        m29632x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.cii.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (cii.f21091to.m27428k4(str) != 0) {
                    return false;
                }
                cii.this.f21092k4 = AbstractC7361bz.m29296rv(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.cii.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = cii.f21091to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    cii.this.f21094x1 = new C9391zp(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    cii.this.f21093kk.addItem(new C9391zp(abstractC13912i5));
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f21092k4;
        if (b != -1) {
            c3059ii.m12955x1("edited", b == 1 ? "1" : "0");
        }
        this.f21094x1.mo6846k4("wp", c3059ii, "start");
        List.Enumerator<C9391zp> it = this.f21093kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("wp", c3059ii, "lineTo");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
