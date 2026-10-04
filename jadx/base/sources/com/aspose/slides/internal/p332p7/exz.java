package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class exz extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f22511k4 = xk2.m44457k4("visible");

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f22512m9 = new C7017h4("table:number-rows-repeated", "table:style-name", "table:default-cell-style-name", "table:visibility", "table-cell", "covered-table-cell");

    /* JADX INFO: renamed from: du */
    private int f22513du;

    /* JADX INFO: renamed from: h4 */
    private List<C7394ca> f22514h4;

    /* JADX INFO: renamed from: kk */
    private String f22515kk;

    /* JADX INFO: renamed from: to */
    private String f22516to;

    /* JADX INFO: renamed from: x1 */
    private long f22517x1;

    public exz() {
        m31413du();
    }

    /* JADX INFO: renamed from: du */
    private void m31413du() {
        this.f22517x1 = 1L;
        this.f22513du = f22511k4;
        this.f22514h4 = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    public final List<C7394ca> m31422kk() {
        return this.f22514h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m31423x1() {
        return this.f22516to;
    }

    public exz(final AbstractC13912i5 abstractC13912i5) {
        m31413du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.exz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = exz.f22512m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    exz.this.f22517x1 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    exz.this.f22515kk = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    exz.this.f22516to = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                exz.this.f22513du = xk2.m44457k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.exz.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                int iM27428k4 = exz.f22512m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 4) {
                    t1m t1mVar = new t1m(abstractC13912i5);
                    list = exz.this.f22514h4;
                    c7394ca = new C7394ca("table-cell", t1mVar);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    btk btkVar = new btk(abstractC13912i5);
                    list = exz.this.f22514h4;
                    c7394ca = new C7394ca("covered-table-cell", btkVar);
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final void m31424x1(String str) {
        this.f22515kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m31420k4(String str) {
        C7394ca c7394ca;
        int iM27428k4 = f22512m9.m27428k4(str);
        if (iM27428k4 == 4) {
            c7394ca = new C7394ca("table-cell", new t1m());
        } else {
            if (iM27428k4 != 5) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("covered-table-cell", new btk());
        }
        this.f22514h4.addItem(c7394ca);
        return c7394ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m31421k4() {
        return this.f22515kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f22517x1;
        if ((4294967295L & j) != 1) {
            c3059ii.m12955x1("table:number-rows-repeated", C13850af.m65147x1(j));
        }
        String str3 = this.f22515kk;
        if (str3 != null) {
            c3059ii.m12955x1("table:style-name", str3);
        }
        String str4 = this.f22516to;
        if (str4 != null) {
            c3059ii.m12955x1("table:default-cell-style-name", str4);
        }
        int i = this.f22513du;
        if (i != f22511k4) {
            c3059ii.m12955x1("table:visibility", xk2.m44458k4(i));
        }
        List.Enumerator<C7394ca> it = this.f22514h4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f22512m9.m27428k4(next.m29539k4());
                if (iM27428k4 == 4) {
                    ((t1m) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 5) {
                    ((btk) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        c3059ii.mo21898jd();
    }
}
