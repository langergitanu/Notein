package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ij */
/* JADX INFO: loaded from: classes4.dex */
public final class C7935ij extends AbstractC8619qq {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f24720x1 = new C7017h4("multiLvlStrRef", "numRef", "strRef", "numLit", "strLit");

    /* JADX INFO: renamed from: k4 */
    private C7394ca f24721k4;

    public C7935ij() {
    }

    /* JADX INFO: renamed from: du */
    public final C7394ca m34166du() {
        return this.f24721k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8619qq
    /* JADX INFO: renamed from: k4 */
    public int mo34167k4() {
        int iM27428k4 = f24720x1.m27428k4(m34166du().m29539k4());
        if (iM27428k4 == 0 || iM27428k4 == 1 || iM27428k4 == 2) {
            return 0;
        }
        if (iM27428k4 == 3) {
            return 2;
        }
        if (iM27428k4 == 4) {
            return 1;
        }
        throw new Exception(C14113y2.m67408k4("Unknown element \"", m34166du().m29539k4(), "\""));
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8619qq
    /* JADX INFO: renamed from: kk */
    public AbstractC7414ck mo34169kk() {
        int iM27428k4 = f24720x1.m27428k4(m34166du().m29539k4());
        if (iM27428k4 == 0) {
            return ((C8555px) m34166du().m29541kk()).m39183to();
        }
        if (iM27428k4 == 1) {
            return ((C8089ki) m34166du().m29541kk()).m35405to();
        }
        if (iM27428k4 == 2) {
            return ((C7626f0) m34166du().m29541kk()).m31516to();
        }
        if (iM27428k4 == 3) {
            return ((C7402cf) m34166du().m29541kk()).m29585h4();
        }
        if (iM27428k4 == 4) {
            return ((C8583q7) m34166du().m29541kk()).m39370du();
        }
        throw new Exception(C14113y2.m67408k4("Unknown element \"", m34166du().m29539k4(), "\""));
    }

    /* JADX INFO: renamed from: to */
    public String m34170to() {
        C7402cf c7402cfM35404kk;
        int iM27428k4 = f24720x1.m27428k4(m34166du().m29539k4());
        if (iM27428k4 != 0) {
            if (iM27428k4 == 1) {
                C8089ki c8089ki = (C8089ki) m34166du().m29541kk();
                if (c8089ki.m35404kk() != null) {
                    c7402cfM35404kk = c8089ki.m35404kk();
                    return c7402cfM35404kk.m29588kk();
                }
            } else if (iM27428k4 != 2) {
                if (iM27428k4 == 3) {
                    c7402cfM35404kk = (C7402cf) m34166du().m29541kk();
                    return c7402cfM35404kk.m29588kk();
                }
                if (iM27428k4 != 4) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", m34166du().m29539k4(), "\""));
                }
            }
        }
        return "";
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8619qq
    /* JADX INFO: renamed from: x1 */
    public String mo34171x1() {
        if (m34166du() == null) {
            return "";
        }
        int iM27428k4 = f24720x1.m27428k4(m34166du().m29539k4());
        if (iM27428k4 == 0) {
            return ((C8555px) m34166du().m29541kk()).m39184x1();
        }
        if (iM27428k4 == 1) {
            return ((C8089ki) m34166du().m29541kk()).m35406x1();
        }
        if (iM27428k4 == 2) {
            return ((C7626f0) m34166du().m29541kk()).m31517x1();
        }
        if (iM27428k4 == 3 || iM27428k4 == 4) {
            throw new Exception();
        }
        throw new Exception(C14113y2.m67408k4("Unknown element \"", m34166du().m29539k4(), "\""));
    }

    public C7935ij(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ij.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C7935ij c7935ij;
                C7394ca c7394ca;
                int iM27428k4 = C7935ij.f24720x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    c7935ij = C7935ij.this;
                    c7394ca = new C7394ca("multiLvlStrRef", new C8555px(abstractC13912i5));
                } else if (iM27428k4 == 1) {
                    c7935ij = C7935ij.this;
                    c7394ca = new C7394ca("numRef", new C8089ki(abstractC13912i5));
                } else if (iM27428k4 == 2) {
                    c7935ij = C7935ij.this;
                    c7394ca = new C7394ca("strRef", new C7626f0(abstractC13912i5));
                } else if (iM27428k4 == 3) {
                    c7935ij = C7935ij.this;
                    c7394ca = new C7394ca("numLit", new C7402cf(abstractC13912i5));
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    c7935ij = C7935ij.this;
                    c7394ca = new C7394ca("strLit", new C8583q7(abstractC13912i5));
                }
                c7935ij.f24721k4 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m34168k4(String str) {
        C7394ca c7394ca;
        if (this.f24721k4 != null) {
            throw new Exception("AxisDataSource already is initialized.");
        }
        int iM27428k4 = f24720x1.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("multiLvlStrRef", new C8555px());
        } else if (iM27428k4 == 1) {
            c7394ca = new C7394ca("numRef", new C8089ki());
        } else if (iM27428k4 == 2) {
            c7394ca = new C7394ca("strRef", new C7626f0());
        } else if (iM27428k4 == 3) {
            c7394ca = new C7394ca("numLit", new C7402cf());
        } else {
            if (iM27428k4 != 4) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("strLit", new C8583q7());
        }
        this.f24721k4 = c7394ca;
        return this.f24721k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7394ca c7394ca = this.f24721k4;
        if (c7394ca != null) {
            int iM27428k4 = f24720x1.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 0) {
                ((C8555px) this.f24721k4.m29541kk()).mo6846k4("c", c3059ii, this.f24721k4.m29539k4());
            } else if (iM27428k4 == 1) {
                ((C8089ki) this.f24721k4.m29541kk()).mo6846k4("c", c3059ii, this.f24721k4.m29539k4());
            } else if (iM27428k4 == 2) {
                ((C7626f0) this.f24721k4.m29541kk()).mo6846k4("c", c3059ii, this.f24721k4.m29539k4());
            } else if (iM27428k4 == 3) {
                ((C7402cf) this.f24721k4.m29541kk()).mo6846k4("c", c3059ii, this.f24721k4.m29539k4());
            } else if (iM27428k4 == 4) {
                ((C8583q7) this.f24721k4.m29541kk()).mo6846k4("c", c3059ii, this.f24721k4.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
