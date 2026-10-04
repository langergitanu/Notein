package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.o4 */
/* JADX INFO: loaded from: classes4.dex */
public class C8403o4 extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f27695h4 = new C7017h4("flip", "rotWithShape", "gsLst", "lin", "path", "tileRect");

    /* JADX INFO: renamed from: du */
    private C8629qv f27696du;

    /* JADX INFO: renamed from: k4 */
    private int f27697k4;

    /* JADX INFO: renamed from: kk */
    private C9121wm f27698kk;

    /* JADX INFO: renamed from: to */
    private C7394ca f27699to;

    /* JADX INFO: renamed from: x1 */
    private byte f27700x1;

    public C8403o4() {
        m37975c5();
    }

    /* JADX INFO: renamed from: c5 */
    private void m37975c5() {
        this.f27697k4 = -1;
        this.f27700x1 = (byte) -1;
    }

    /* JADX INFO: renamed from: du */
    public final C9121wm m37982du() {
        return this.f27698kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final C7394ca m37983h4() {
        return this.f27699to;
    }

    /* JADX INFO: renamed from: kk */
    public final int m37988kk() {
        return this.f27697k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final C8629qv m37989m9() {
        return this.f27696du;
    }

    /* JADX INFO: renamed from: to */
    public final byte m37990to() {
        return this.f27700x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8629qv m37991x1() {
        if (this.f27696du != null) {
            throw new Exception("Only one <tileRect> element can be added.");
        }
        C8629qv c8629qv = new C8629qv();
        this.f27696du = c8629qv;
        return c8629qv;
    }

    public C8403o4(final AbstractC13912i5 abstractC13912i5) {
        m37975c5();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.o4.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8403o4.f27695h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8403o4.this.f27697k4 = C7265aq.m28408k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8403o4.this.f27700x1 = AbstractC7361bz.m29296rv(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.o4.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8403o4 c8403o4;
                C7394ca c7394ca;
                int iM27428k4 = C8403o4.f27695h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    C8403o4.this.f27698kk = new C9121wm(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 3) {
                    c8403o4 = C8403o4.this;
                    c7394ca = new C7394ca("lin", new C7892hz(abstractC13912i5));
                } else {
                    if (iM27428k4 != 4) {
                        if (iM27428k4 != 5) {
                            return false;
                        }
                        C8403o4.this.f27696du = new C8629qv(abstractC13912i5);
                        return true;
                    }
                    c8403o4 = C8403o4.this;
                    c7394ca = new C7394ca("path", new C9302yq(abstractC13912i5));
                }
                c8403o4.f27699to = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m37984k4(String str) {
        C7394ca c7394ca;
        if (this.f27699to != null) {
            throw new Exception("ShadeProperties already is initialized.");
        }
        int iM27428k4 = f27695h4.m27428k4(str);
        if (iM27428k4 == 3) {
            c7394ca = new C7394ca("lin", new C7892hz());
        } else {
            if (iM27428k4 != 4) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("path", new C9302yq());
        }
        this.f27699to = c7394ca;
        return this.f27699to;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9121wm m37985k4() {
        if (this.f27698kk != null) {
            throw new Exception("Only one <gsLst> element can be added.");
        }
        C9121wm c9121wm = new C9121wm();
        this.f27698kk = c9121wm;
        return c9121wm;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37986k4(byte b) {
        this.f27700x1 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m37987k4(int i) {
        this.f27697k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, "a".equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main")) ? null : "http://schemas.openxmlformats.org/drawingml/2006/main");
        int i = this.f27697k4;
        if (i != -1) {
            c3059ii.m12955x1("flip", C7265aq.m28409k4(i));
        }
        byte b = this.f27700x1;
        if (b != -1) {
            c3059ii.m12955x1("rotWithShape", b == 1 ? "1" : "0");
        }
        C9121wm c9121wm = this.f27698kk;
        if (c9121wm != null) {
            c9121wm.mo6846k4("a", c3059ii, "gsLst");
        }
        C7394ca c7394ca = this.f27699to;
        if (c7394ca != null) {
            int iM27428k4 = f27695h4.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 3) {
                ((C7892hz) this.f27699to.m29541kk()).mo6846k4("a", c3059ii, this.f27699to.m29539k4());
            } else if (iM27428k4 == 4) {
                ((C9302yq) this.f27699to.m29541kk()).mo6846k4("a", c3059ii, this.f27699to.m29539k4());
            }
        }
        C8629qv c8629qv = this.f27696du;
        if (c8629qv != null) {
            c8629qv.mo6846k4("a", c3059ii, "tileRect");
        }
        c3059ii.mo21898jd();
    }
}
