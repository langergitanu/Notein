package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class gwj extends AbstractC7361bz {

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f23768fa = new C7017h4("fo:text-align", "text:space-before", "text:min-label-width", "text:min-label-distance", "style:font-name", "fo:width", "fo:height", "style:vertical-rel", "style:vertical-pos", "svg:y");

    /* JADX INFO: renamed from: c5 */
    private int f23769c5;

    /* JADX INFO: renamed from: ck */
    private List<C8249m9> f23770ck;

    /* JADX INFO: renamed from: du */
    private String f23771du;

    /* JADX INFO: renamed from: dy */
    private int f23772dy;

    /* JADX INFO: renamed from: h4 */
    private String f23773h4;

    /* JADX INFO: renamed from: jd */
    private String f23774jd;

    /* JADX INFO: renamed from: k4 */
    private int f23775k4;

    /* JADX INFO: renamed from: kk */
    private String f23776kk;

    /* JADX INFO: renamed from: m9 */
    private String f23777m9;

    /* JADX INFO: renamed from: to */
    private String f23778to;

    /* JADX INFO: renamed from: x1 */
    private String f23779x1;

    public gwj() {
        m32955du();
    }

    public gwj(AbstractC13912i5 abstractC13912i5) {
        m32955du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.gwj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (gwj.f23768fa.m27428k4(str)) {
                    case 0:
                        gwj.this.f23775k4 = ycd.m44926k4(str2);
                        break;
                    case 1:
                        gwj.this.f23779x1 = str2;
                        break;
                    case 2:
                        gwj.this.f23776kk = str2;
                        break;
                    case 3:
                        gwj.this.f23778to = str2;
                        break;
                    case 4:
                        gwj.this.f23771du = str2;
                        break;
                    case 5:
                        gwj.this.f23773h4 = str2;
                        break;
                    case 6:
                        gwj.this.f23777m9 = str2;
                        break;
                    case 7:
                        gwj.this.f23772dy = rew.m39968k4(str2);
                        break;
                    case 8:
                        gwj.this.f23769c5 = vnj.m43187k4(str2);
                        break;
                    case 9:
                        gwj.this.f23774jd = str2;
                        break;
                }
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            do {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    f23768fa.m27428k4(abstractC13912i5.mo65023fa());
                    this.f23770ck.addItem(new C8249m9(abstractC13912i5));
                }
            } while (!abstractC13912i5.mo65015ar());
        }
    }

    /* JADX INFO: renamed from: du */
    private void m32955du() {
        this.f23775k4 = 0;
        this.f23772dy = 0;
        this.f23769c5 = 0;
        this.f23770ck = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m32966k4() {
        return this.f23779x1;
    }

    /* JADX INFO: renamed from: kk */
    public final String m32969kk() {
        return this.f23773h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m32972x1() {
        return this.f23776kk;
    }

    /* JADX INFO: renamed from: to */
    public final void m32971to(String str) {
        this.f23777m9 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32967k4(int i) {
        this.f23772dy = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m32970kk(String str) {
        this.f23773h4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m32973x1(int i) {
        this.f23769c5 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32968k4(String str) {
        this.f23779x1 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m32974x1(String str) {
        this.f23776kk = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f23775k4;
        if (i != 0) {
            c3059ii.m12955x1("fo:text-align", ycd.m44927k4(i));
        }
        String str3 = this.f23779x1;
        if (str3 != null) {
            c3059ii.m12955x1("text:space-before", str3);
        }
        String str4 = this.f23776kk;
        if (str4 != null) {
            c3059ii.m12955x1("text:min-label-width", str4);
        }
        String str5 = this.f23778to;
        if (str5 != null) {
            c3059ii.m12955x1("text:min-label-distance", str5);
        }
        String str6 = this.f23771du;
        if (str6 != null) {
            c3059ii.m12955x1("style:font-name", str6);
        }
        String str7 = this.f23773h4;
        if (str7 != null) {
            c3059ii.m12955x1("fo:width", str7);
        }
        String str8 = this.f23777m9;
        if (str8 != null) {
            c3059ii.m12955x1("fo:height", str8);
        }
        int i2 = this.f23772dy;
        if (i2 != 0) {
            c3059ii.m12955x1("style:vertical-rel", rew.m39969k4(i2));
        }
        int i3 = this.f23769c5;
        if (i3 != 0) {
            c3059ii.m12955x1("style:vertical-pos", vnj.m43188k4(i3));
        }
        String str9 = this.f23774jd;
        if (str9 != null) {
            c3059ii.m12955x1("svg:y", str9);
        }
        List.Enumerator<C8249m9> it = this.f23770ck.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("", c3059ii, "");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
