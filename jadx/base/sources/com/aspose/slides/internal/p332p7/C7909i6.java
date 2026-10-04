package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.i6 */
/* JADX INFO: loaded from: classes4.dex */
public class C7909i6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f24495c5 = new C7017h4("xml:id", "contextRef", "brushRef", "annotationXML", "annotation", "traceView", "traceGroup", "trace");

    /* JADX INFO: renamed from: du */
    private List<C9063vs> f24496du;

    /* JADX INFO: renamed from: dy */
    private List<C8961uk> f24497dy;

    /* JADX INFO: renamed from: h4 */
    private List<C7644f8> f24498h4;

    /* JADX INFO: renamed from: k4 */
    private String f24499k4;

    /* JADX INFO: renamed from: kk */
    private String f24500kk;

    /* JADX INFO: renamed from: m9 */
    private List<C7909i6> f24501m9;

    /* JADX INFO: renamed from: to */
    private List<C8210lt> f24502to;

    /* JADX INFO: renamed from: x1 */
    private String f24503x1;

    public C7909i6() {
        m33867jd();
    }

    /* JADX INFO: renamed from: jd */
    private void m33867jd() {
        this.f24502to = new List<>();
        this.f24496du = new List<>();
        this.f24498h4 = new List<>();
        this.f24501m9 = new List<>();
        this.f24497dy = new List<>();
    }

    /* JADX INFO: renamed from: dy */
    public final C8961uk[] m33875dy() {
        return this.f24497dy.toArray(new C8961uk[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m33877k4() {
        return this.f24499k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7909i6[] m33886m9() {
        return this.f24501m9.toArray(new C7909i6[0]);
    }

    public C7909i6(final AbstractC13912i5 abstractC13912i5) {
        m33867jd();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.i6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7909i6.f24495c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7909i6.this.f24499k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7909i6.this.f24503x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C7909i6.this.f24500kk = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.i6.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                AbstractC7361bz c8210lt;
                List list;
                int iM27428k4 = C7909i6.f24495c5.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    c8210lt = new C8210lt(abstractC13912i5);
                    list = C7909i6.this.f24502to;
                } else if (iM27428k4 == 4) {
                    c8210lt = new C9063vs(abstractC13912i5);
                    list = C7909i6.this.f24496du;
                } else if (iM27428k4 == 5) {
                    c8210lt = new C7644f8(abstractC13912i5);
                    list = C7909i6.this.f24498h4;
                } else if (iM27428k4 == 6) {
                    c8210lt = new C7909i6(abstractC13912i5);
                    list = C7909i6.this.f24501m9;
                } else {
                    if (iM27428k4 != 7) {
                        return false;
                    }
                    c8210lt = new C8961uk(abstractC13912i5);
                    list = C7909i6.this.f24497dy;
                }
                list.addItem(c8210lt);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: du */
    public final C9063vs[] m33874du() {
        return this.f24496du.toArray(new C9063vs[0]);
    }

    /* JADX INFO: renamed from: h4 */
    public final C7644f8[] m33876h4() {
        return this.f24498h4.toArray(new C7644f8[0]);
    }

    /* JADX INFO: renamed from: kk */
    public final String m33884kk() {
        return this.f24500kk;
    }

    /* JADX INFO: renamed from: to */
    public final C8210lt[] m33887to() {
        return this.f24502to.toArray(new C8210lt[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final String m33888x1() {
        return this.f24503x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33878k4(C7644f8 c7644f8) {
        this.f24498h4.addItem(c7644f8);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33879k4(C7909i6 c7909i6) {
        this.f24501m9.addItem(c7909i6);
    }

    /* JADX INFO: renamed from: kk */
    public final void m33885kk(String str) {
        this.f24500kk = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m33889x1(String str) {
        this.f24503x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33880k4(C8210lt c8210lt) {
        this.f24502to.addItem(c8210lt);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33881k4(C8961uk c8961uk) {
        this.f24497dy.addItem(c8961uk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33882k4(C9063vs c9063vs) {
        this.f24496du.addItem(c9063vs);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33883k4(String str) {
        this.f24499k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f24499k4;
        if (str3 != null) {
            c3059ii.m12955x1("xml:id", str3);
        }
        String str4 = this.f24503x1;
        if (str4 != null) {
            c3059ii.m12955x1("contextRef", str4);
        }
        String str5 = this.f24500kk;
        if (str5 != null) {
            c3059ii.m12955x1("brushRef", str5);
        }
        List.Enumerator<C8210lt> it = this.f24502to.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("inkml", c3059ii, "annotationXML");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        List.Enumerator<C8961uk> it2 = this.f24496du.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().mo6846k4("inkml", c3059ii, "annotation");
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        List.Enumerator<C7644f8> it3 = this.f24498h4.iterator();
        while (it3.hasNext()) {
            try {
                it3.next().mo6846k4("inkml", c3059ii, "traceView");
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
            it3.dispose();
        }
        List.Enumerator<C7909i6> it4 = this.f24501m9.iterator();
        while (it4.hasNext()) {
            try {
                it4.next().mo6846k4("inkml", c3059ii, "traceGroup");
            } finally {
                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                    it4.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
            it4.dispose();
        }
        it2 = this.f24497dy.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().mo6846k4("inkml", c3059ii, "trace");
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
