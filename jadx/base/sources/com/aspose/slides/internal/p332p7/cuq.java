package com.aspose.slides.internal.p332p7;

import OoooooO.C21445Oooo;
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
public class cuq extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private int f21333du;

    /* JADX INFO: renamed from: dy */
    private List<C7394ca> f21334dy;

    /* JADX INFO: renamed from: h4 */
    private int f21335h4;

    /* JADX INFO: renamed from: kk */
    private String f21336kk;

    /* JADX INFO: renamed from: m9 */
    private String f21337m9;

    /* JADX INFO: renamed from: to */
    private int f21338to;

    /* JADX INFO: renamed from: x1 */
    private String f21339x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f21332k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f21331c5 = new C7017h4("draw:filter-name", "xlink:href", "xlink:type", "xlink:show", "xlink:actuate", "binary-data", ContextChain.TAG_PRODUCT, "list");

    public cuq() {
        m29919to();
    }

    /* JADX INFO: renamed from: to */
    private void m29919to() {
        this.f21338to = f21332k4;
        this.f21333du = 0;
        this.f21335h4 = 0;
        this.f21334dy = new List<>();
    }

    public cuq(final AbstractC13912i5 abstractC13912i5) {
        m29919to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.cuq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = cuq.f21331c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    cuq.this.f21339x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    cuq.this.f21336kk = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    cuq.this.f21338to = bhu.m28903k4(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    cuq.this.f21333du = bdd.m28828k4(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                cuq.this.f21335h4 = qs5.m39644k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.cuq.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = cuq.f21331c5.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 != 5) {
                    if (iM27428k4 == 6) {
                        C21445Oooo.OooO0OO(ContextChain.TAG_PRODUCT, new ok7(abstractC13912i5), cuq.this.f21334dy);
                        return true;
                    }
                    if (iM27428k4 != 7) {
                        return false;
                    }
                    C22239OooO0oo.OooO00o("list", new lxj(abstractC13912i5), cuq.this.f21334dy);
                    return true;
                }
                cuq.this.f21337m9 = abstractC13912i5.mo65052v4();
                if (abstractC13912i5.mo65048u4()) {
                    return true;
                }
                while (abstractC13912i5.mo65028jd() != 15) {
                    abstractC13912i5.mo65026h4();
                    cuq cuqVar = cuq.this;
                    cuqVar.f21337m9 = C14113y2.m67400k4(cuqVar.f21337m9, abstractC13912i5.mo65052v4());
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m29923k4() {
        return this.f21336kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m29926x1() {
        return this.f21337m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29924k4(int i) {
        this.f21333du = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m29927x1(int i) {
        this.f21335h4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29925k4(String str) {
        this.f21336kk = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m29928x1(String str) {
        this.f21337m9 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        cuq cuqVar;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f21339x1;
        if (str3 != null) {
            c3059ii.m12955x1("draw:filter-name", str3);
        }
        String str4 = this.f21336kk;
        if (str4 != null) {
            c3059ii.m12955x1("xlink:href", str4);
        }
        int i = this.f21338to;
        if (i != f21332k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        int i2 = this.f21333du;
        if (i2 != 0) {
            c3059ii.m12955x1("xlink:show", bdd.m28829k4(i2));
        }
        int i3 = this.f21335h4;
        if (i3 != 0) {
            c3059ii.m12955x1("xlink:actuate", qs5.m39645k4(i3));
        }
        String str5 = this.f21337m9;
        if (str5 != null) {
            cuqVar = this;
            c3059ii2 = c3059ii;
            cuqVar.m29301k4("office", c3059ii2, "binary-data", str5, false);
        } else {
            cuqVar = this;
            c3059ii2 = c3059ii;
        }
        List.Enumerator<C7394ca> it = cuqVar.f21334dy.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f21331c5.m27428k4(next.m29539k4());
                if (iM27428k4 == 6) {
                    ((ok7) next.m29541kk()).mo6846k4("text", c3059ii2, next.m29539k4());
                } else if (iM27428k4 == 7) {
                    ((lxj) next.m29541kk()).mo6846k4("text", c3059ii2, next.m29539k4());
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        c3059ii2.mo21898jd();
    }
}
