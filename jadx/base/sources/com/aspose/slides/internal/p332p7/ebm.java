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
public class ebm extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private List<zzn> f22053du;

    /* JADX INFO: renamed from: kk */
    private int f22054kk;

    /* JADX INFO: renamed from: to */
    private int f22055to;

    /* JADX INFO: renamed from: x1 */
    private String f22056x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f22052k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f22051h4 = new C7017h4("xlink:href", "xlink:type", "xlink:actuate", "font-face-format");

    public ebm() {
        m30870x1();
    }

    public ebm(final AbstractC13912i5 abstractC13912i5) {
        m30870x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ebm.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ebm.f22051h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    ebm.this.f22056x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    ebm.this.f22054kk = bhu.m28903k4(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                ebm.this.f22055to = x2a.m44176k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ebm.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (ebm.f22051h4.m27428k4(abstractC13912i5.mo65023fa()) != 3) {
                    return false;
                }
                ebm.this.f22053du.addItem(new zzn(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m30870x1() {
        this.f22054kk = f22052k4;
        this.f22055to = 0;
        this.f22053du = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("xlink:href", this.f22056x1);
        int i = this.f22054kk;
        if (i != f22052k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        int i2 = this.f22055to;
        if (i2 != 0) {
            c3059ii.m12955x1("xlink:actuate", x2a.m44177k4(i2));
        }
        List.Enumerator<zzn> it = this.f22053du.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("svg", c3059ii, "font-face-format");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
