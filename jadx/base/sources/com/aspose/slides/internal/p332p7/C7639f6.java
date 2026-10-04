package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.f6 */
/* JADX INFO: loaded from: classes4.dex */
public class C7639f6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f22682m9 = new C7017h4("Ignorable", "MustUnderstand", "ProcessContent", "Choice", "Fallback");

    /* JADX INFO: renamed from: du */
    private List<C7322bh> f22683du;

    /* JADX INFO: renamed from: h4 */
    private C9130wq f22684h4;

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, String> f22685k4;

    /* JADX INFO: renamed from: kk */
    private String f22686kk;

    /* JADX INFO: renamed from: to */
    private String f22687to;

    /* JADX INFO: renamed from: x1 */
    private String f22688x1;

    public C7639f6() {
        m31631h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m31631h4() {
        this.f22685k4 = new Dictionary<>();
        this.f22683du = new List<>();
    }

    /* JADX INFO: renamed from: to */
    public final C9130wq m31640to() {
        return this.f22684h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9130wq m31641x1() {
        if (this.f22684h4 != null) {
            throw new Exception("Only one <fallback> element can be added.");
        }
        C9130wq c9130wq = new C9130wq();
        this.f22684h4 = c9130wq;
        return c9130wq;
    }

    public C7639f6(final AbstractC13912i5 abstractC13912i5) {
        m31631h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.f6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7639f6.f22682m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7639f6.this.f22688x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7639f6.this.f22686kk = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C7639f6.this.f22687to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.f6.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7639f6.f22682m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    C7639f6.this.f22683du.addItem(new C7322bh(abstractC13912i5));
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                C7639f6.this.f22684h4 = new C9130wq(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7322bh m31637k4() {
        C7322bh c7322bh = new C7322bh();
        this.f22683du.addItem(c7322bh);
        return c7322bh;
    }

    /* JADX INFO: renamed from: kk */
    public final C7322bh[] m31639kk() {
        return this.f22683du.toArray(new C7322bh[0]);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        Dictionary.Enumerator<String, String> it = this.f22685k4.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (!C14113y2.m67363du(c3059ii.mo12952k4((String) next.getValue()), (String) next.getKey())) {
                    c3059ii.m12954to("xmlns", (String) next.getKey(), null, (String) next.getValue());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        String str3 = this.f22688x1;
        if (str3 != null) {
            c3059ii.m12955x1("mc:Ignorable", str3);
        }
        String str4 = this.f22686kk;
        if (str4 != null) {
            c3059ii.m12955x1("mc:MustUnderstand", str4);
        }
        String str5 = this.f22687to;
        if (str5 != null) {
            c3059ii.m12955x1("mc:ProcessContent", str5);
        }
        List.Enumerator<C7322bh> it2 = this.f22683du.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().mo6846k4("mc", c3059ii, "Choice");
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        C9130wq c9130wq = this.f22684h4;
        if (c9130wq != null) {
            c9130wq.mo6846k4("mc", c3059ii, "Fallback");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31638k4(String str, String str2) {
        this.f22685k4.addItem(str, str2);
    }
}
