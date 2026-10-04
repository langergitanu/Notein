package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.C14095u1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18358t1;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.q3 */
/* JADX INFO: loaded from: classes5.dex */
public class C13956q3 extends AbstractC13911hq {

    /* JADX INFO: renamed from: c5 */
    private boolean f46762c5;

    /* JADX INFO: renamed from: ck */
    private int f46763ck;

    /* JADX INFO: renamed from: du */
    private String f46764du;

    /* JADX INFO: renamed from: dy */
    private AbstractC13901ga f46765dy;

    /* JADX INFO: renamed from: fa */
    private C14095u1 f46766fa;

    /* JADX INFO: renamed from: h4 */
    private AbstractC13901ga f46767h4;

    /* JADX INFO: renamed from: jd */
    private boolean f46768jd;

    /* JADX INFO: renamed from: k4 */
    private String f46769k4;

    /* JADX INFO: renamed from: kk */
    private String f46770kk;

    /* JADX INFO: renamed from: m9 */
    private int f46771m9;

    /* JADX INFO: renamed from: to */
    private String f46772to;

    /* JADX INFO: renamed from: x1 */
    private int f46773x1;

    private C13956q3(AbstractC13901ga abstractC13901ga) {
        this.f46767h4 = abstractC13901ga;
        this.f46771m9 = -1;
        this.f46765dy = abstractC13901ga;
        this.f46773x1 = 0;
        this.f46762c5 = false;
        this.f46768jd = true;
        this.f46763ck = -1;
        this.f46766fa = new C14095u1(new C13860bg(abstractC13901ga.getDocument(), this));
    }

    /* JADX INFO: renamed from: kk */
    private AbstractC13901ga m65783kk(AbstractC13901ga abstractC13901ga) {
        AbstractC13901ga previousSibling = abstractC13901ga.getPreviousSibling();
        while (previousSibling != null && previousSibling.getLastChild() != null) {
            previousSibling = previousSibling.getLastChild();
        }
        if (previousSibling == null) {
            previousSibling = abstractC13901ga.getParentNode();
        }
        if (previousSibling == this.f46767h4) {
            return null;
        }
        return previousSibling;
    }

    /* JADX INFO: renamed from: to */
    private boolean m65784to(AbstractC13901ga abstractC13901ga) {
        if (abstractC13901ga.getNodeType() != 1) {
            return false;
        }
        String str = this.f46770kk;
        if (str != null) {
            return C13851ai.m65152k4(str, this.f46769k4) || C13851ai.m65152k4(abstractC13901ga.getName(), this.f46770kk);
        }
        if (C13851ai.m65152k4(this.f46772to, this.f46769k4) || C13851ai.m65152k4(abstractC13901ga.getLocalName(), this.f46772to)) {
            return C13851ai.m65152k4(this.f46764du, this.f46769k4) || C14113y2.m67363du(abstractC13901ga.getNamespaceURI(), this.f46764du);
        }
        return false;
    }

    public void finalize() throws Throwable {
        try {
            m65788k4(false);
        } finally {
            super.finalize();
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13911hq, java.lang.Iterable
    public IEnumerator iterator() {
        return this.f46762c5 ? new C13877d3(this) : new C13889e8(this);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13911hq
    /* JADX INFO: renamed from: k4 */
    public int mo23932k4() {
        int i = 0;
        if (this.f46762c5) {
            return 0;
        }
        if (this.f46763ck < 0) {
            int i2 = this.f46773x1;
            AbstractC13901ga abstractC13901gaM65781k4 = this.f46767h4;
            while (true) {
                abstractC13901gaM65781k4 = m65781k4(abstractC13901gaM65781k4, true);
                if (abstractC13901gaM65781k4 == null) {
                    break;
                }
                i++;
            }
            if (i2 != this.f46773x1) {
                return i;
            }
            this.f46763ck = i;
        }
        return this.f46763ck;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m65789x1() {
        return this.f46773x1;
    }

    public C13956q3(AbstractC13901ga abstractC13901ga, String str) {
        this(abstractC13901ga);
        AbstractC13883dt nameTable = abstractC13901ga.getDocument().getNameTable();
        this.f46769k4 = nameTable.mo65266k4(C18358t1.g.f56183c);
        this.f46770kk = nameTable.mo65266k4(str);
        this.f46772to = null;
        this.f46764du = null;
    }

    /* JADX INFO: renamed from: x1 */
    private AbstractC13901ga m65785x1(AbstractC13901ga abstractC13901ga) {
        AbstractC13901ga firstChild = abstractC13901ga.getFirstChild();
        if (firstChild == null) {
            while (abstractC13901ga != null && abstractC13901ga != this.f46767h4 && abstractC13901ga.getNextSibling() == null) {
                abstractC13901ga = abstractC13901ga.getParentNode();
            }
            firstChild = (abstractC13901ga == null || abstractC13901ga == this.f46767h4) ? abstractC13901ga : abstractC13901ga.getNextSibling();
        }
        if (firstChild == this.f46767h4) {
            return null;
        }
        return firstChild;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13911hq
    /* JADX INFO: renamed from: k4 */
    public AbstractC13901ga mo23933k4(int i) {
        if (this.f46767h4 != null && i >= 0) {
            if (this.f46762c5) {
                return null;
            }
            int i2 = this.f46771m9;
            if (i2 == i) {
                return this.f46765dy;
            }
            int i3 = i - i2;
            boolean z = i3 > 0;
            if (i3 < 0) {
                i3 = -i3;
            }
            AbstractC13901ga abstractC13901gaM65782k4 = m65782k4(this.f46765dy, z, i3);
            if (abstractC13901gaM65782k4 != null) {
                this.f46771m9 = i;
                this.f46765dy = abstractC13901gaM65782k4;
                return abstractC13901gaM65782k4;
            }
        }
        return null;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13911hq
    /* JADX INFO: renamed from: kk */
    public void mo65458kk() {
        C14094ts.m67303k4(this);
        m65788k4(true);
    }

    public C13956q3(AbstractC13901ga abstractC13901ga, String str, String str2) {
        this(abstractC13901ga);
        AbstractC13883dt nameTable = abstractC13901ga.getDocument().getNameTable();
        this.f46769k4 = nameTable.mo65266k4(C18358t1.g.f56183c);
        this.f46772to = nameTable.mo65268x1(str);
        String strMo65268x1 = nameTable.mo65268x1(str2);
        this.f46764du = strMo65268x1;
        if (this.f46772to == null || strMo65268x1 == null) {
            this.f46762c5 = true;
            this.f46768jd = false;
            this.f46772to = str;
            this.f46764du = str2;
        }
        this.f46770kk = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13901ga m65786k4(AbstractC13901ga abstractC13901ga) {
        if (this.f46762c5) {
            return null;
        }
        if (abstractC13901ga == null) {
            abstractC13901ga = this.f46767h4;
        }
        return m65781k4(abstractC13901ga, true);
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC13901ga m65781k4(AbstractC13901ga abstractC13901ga, boolean z) {
        do {
            abstractC13901ga = z ? m65785x1(abstractC13901ga) : m65783kk(abstractC13901ga);
            if (abstractC13901ga == null) {
                break;
            }
        } while (!m65784to(abstractC13901ga));
        return abstractC13901ga;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC13901ga m65782k4(AbstractC13901ga abstractC13901ga, boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            abstractC13901ga = m65781k4(abstractC13901ga, z);
            if (abstractC13901ga == null) {
                return null;
            }
        }
        return abstractC13901ga;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65787k4(C13979sz c13979sz) {
        if (!this.f46768jd) {
            AbstractC13883dt nameTable = this.f46767h4.getDocument().getNameTable();
            this.f46772to = nameTable.mo65266k4(this.f46772to);
            this.f46764du = nameTable.mo65266k4(this.f46764du);
            this.f46768jd = true;
        }
        if (m65784to(c13979sz.m65894x1())) {
            this.f46773x1++;
            this.f46771m9 = -1;
            this.f46765dy = this.f46767h4;
            if (c13979sz.m65893k4() == 0) {
                this.f46762c5 = false;
            }
        }
        this.f46763ck = -1;
    }

    /* JADX INFO: renamed from: k4 */
    public void m65788k4(boolean z) {
        C14095u1 c14095u1 = this.f46766fa;
        if (c14095u1 != null) {
            C13860bg c13860bg = (C13860bg) c14095u1.m67304k4();
            if (c13860bg != null) {
                c13860bg.m65190k4();
            }
            this.f46766fa = null;
        }
    }
}
