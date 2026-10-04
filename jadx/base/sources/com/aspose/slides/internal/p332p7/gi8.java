package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class gi8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private double f23450du;

    /* JADX INFO: renamed from: dy */
    private List<az5> f23451dy;

    /* JADX INFO: renamed from: h4 */
    private double f23452h4;

    /* JADX INFO: renamed from: kk */
    private double f23453kk;

    /* JADX INFO: renamed from: m9 */
    private double f23454m9;

    /* JADX INFO: renamed from: to */
    private double f23455to;

    /* JADX INFO: renamed from: x1 */
    private int f23456x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f23449k4 = edg.m30915k4("linear");

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f23448c5 = new C7017h4(C18437z2.f56754h, "degree", "left", "right", "top", "bottom", "stop");

    public gi8() {
        m32556x1();
    }

    public gi8(final AbstractC13912i5 abstractC13912i5) {
        m32556x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.gi8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = gi8.f23448c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    gi8.this.f23456x1 = edg.m30915k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    gi8.this.f23453kk = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    gi8.this.f23455to = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    gi8.this.f23450du = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 == 4) {
                    gi8.this.f23452h4 = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                gi8.this.f23454m9 = AbstractC7361bz.m29300yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.gi8.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (gi8.f23448c5.m27428k4(abstractC13912i5.mo65023fa()) != 6) {
                    return false;
                }
                gi8.this.f23451dy.addItem(new az5(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m32556x1() {
        this.f23456x1 = f23449k4;
        this.f23453kk = 0.0d;
        this.f23455to = 0.0d;
        this.f23450du = 0.0d;
        this.f23452h4 = 0.0d;
        this.f23454m9 = 0.0d;
        this.f23451dy = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f23456x1;
        if (i != f23449k4) {
            c3059ii.m12955x1(C18437z2.f56754h, edg.m30916k4(i));
        }
        double d = this.f23453kk;
        if (d != 0.0d) {
            c3059ii.m12955x1("degree", C13850af.m65101k4(d));
        }
        double d2 = this.f23455to;
        if (d2 != 0.0d) {
            c3059ii.m12955x1("left", C13850af.m65101k4(d2));
        }
        double d3 = this.f23450du;
        if (d3 != 0.0d) {
            c3059ii.m12955x1("right", C13850af.m65101k4(d3));
        }
        double d4 = this.f23452h4;
        if (d4 != 0.0d) {
            c3059ii.m12955x1("top", C13850af.m65101k4(d4));
        }
        double d5 = this.f23454m9;
        if (d5 != 0.0d) {
            c3059ii.m12955x1("bottom", C13850af.m65101k4(d5));
        }
        List.Enumerator<az5> it = this.f23451dy.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "stop");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
