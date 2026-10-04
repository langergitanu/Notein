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
public class gqr extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private int f23689du;

    /* JADX INFO: renamed from: h4 */
    private int f23690h4;

    /* JADX INFO: renamed from: kk */
    private String f23691kk;

    /* JADX INFO: renamed from: m9 */
    private List<edw> f23692m9;

    /* JADX INFO: renamed from: to */
    private int f23693to;

    /* JADX INFO: renamed from: x1 */
    private String f23694x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f23688k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f23687dy = new C7017h4("draw:mime-type", "xlink:href", "xlink:type", "xlink:show", "xlink:actuate", "param");

    public gqr() {
        m32841h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m32841h4() {
        this.f23693to = f23688k4;
        this.f23689du = 0;
        this.f23690h4 = 0;
        this.f23692m9 = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final int m32851kk() {
        return this.f23689du;
    }

    /* JADX INFO: renamed from: to */
    public final edw[] m32853to() {
        return this.f23692m9.toArray(new edw[0]);
    }

    public gqr(final AbstractC13912i5 abstractC13912i5) {
        m32841h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.gqr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = gqr.f23687dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    gqr.this.f23694x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    gqr.this.f23691kk = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    gqr.this.f23693to = bhu.m28903k4(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    gqr.this.f23689du = bdd.m28828k4(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                gqr.this.f23690h4 = qs5.m39644k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.gqr.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (gqr.f23687dy.m27428k4(abstractC13912i5.mo65023fa()) != 5) {
                    return false;
                }
                gqr.this.f23692m9.addItem(new edw(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final String m32854x1() {
        return this.f23691kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final edw m32848k4() {
        edw edwVar = new edw();
        this.f23692m9.addItem(edwVar);
        return edwVar;
    }

    /* JADX INFO: renamed from: kk */
    public final void m32852kk(int i) {
        this.f23690h4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m32855x1(int i) {
        this.f23689du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32849k4(int i) {
        this.f23693to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m32856x1(String str) {
        this.f23691kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32850k4(String str) {
        this.f23694x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f23694x1;
        if (str3 != null) {
            c3059ii.m12955x1("draw:mime-type", str3);
        }
        c3059ii.m12955x1("xlink:href", this.f23691kk);
        int i = this.f23693to;
        if (i != f23688k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        int i2 = this.f23689du;
        if (i2 != 0) {
            c3059ii.m12955x1("xlink:show", bdd.m28829k4(i2));
        }
        int i3 = this.f23690h4;
        if (i3 != 0) {
            c3059ii.m12955x1("xlink:actuate", qs5.m39645k4(i3));
        }
        List.Enumerator<edw> it = this.f23692m9.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("draw", c3059ii, "param");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
