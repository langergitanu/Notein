package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.xo */
/* JADX INFO: loaded from: classes4.dex */
public class C9220xo extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f32983h4 = new C7017h4("dpi", "rotWithShape", "blip", "srcRect", "tile", "stretch");

    /* JADX INFO: renamed from: du */
    private C7394ca f32984du;

    /* JADX INFO: renamed from: k4 */
    private long f32985k4;

    /* JADX INFO: renamed from: kk */
    private C8401o2 f32986kk;

    /* JADX INFO: renamed from: to */
    private C8629qv f32987to;

    /* JADX INFO: renamed from: x1 */
    private byte f32988x1;

    public C9220xo() {
        m44540c5();
    }

    /* JADX INFO: renamed from: c5 */
    private void m44540c5() {
        this.f32985k4 = 4294967295L;
        this.f32988x1 = (byte) -1;
    }

    /* JADX INFO: renamed from: du */
    public final C8401o2 m44547du() {
        return this.f32986kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8629qv m44548h4() {
        return this.f32987to;
    }

    /* JADX INFO: renamed from: kk */
    public final long m44553kk() {
        return this.f32985k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7394ca m44554m9() {
        return this.f32984du;
    }

    /* JADX INFO: renamed from: to */
    public final byte m44555to() {
        return this.f32988x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8629qv m44556x1() {
        if (this.f32987to != null) {
            throw new Exception("Only one <srcRect> element can be added.");
        }
        C8629qv c8629qv = new C8629qv();
        this.f32987to = c8629qv;
        return c8629qv;
    }

    public C9220xo(final AbstractC13912i5 abstractC13912i5) {
        m44540c5();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.xo.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9220xo.f32983h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9220xo.this.f32985k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C9220xo.this.f32988x1 = AbstractC7361bz.m29296rv(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xo.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C9220xo c9220xo;
                C7394ca c7394ca;
                int iM27428k4 = C9220xo.f32983h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    C9220xo.this.f32986kk = new C8401o2(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 3) {
                    C9220xo.this.f32987to = new C8629qv(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 4) {
                    c9220xo = C9220xo.this;
                    c7394ca = new C7394ca("tile", new C7516dv(abstractC13912i5));
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    c9220xo = C9220xo.this;
                    c7394ca = new C7394ca("stretch", new C9373zi(abstractC13912i5));
                }
                c9220xo.f32984du = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m44549k4(String str) {
        C7394ca c7394ca;
        if (this.f32984du != null) {
            throw new Exception("FillModeProperties already is initialized.");
        }
        int iM27428k4 = f32983h4.m27428k4(str);
        if (iM27428k4 == 4) {
            c7394ca = new C7394ca("tile", new C7516dv());
        } else {
            if (iM27428k4 != 5) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("stretch", new C9373zi());
        }
        this.f32984du = c7394ca;
        return this.f32984du;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8401o2 m44550k4() {
        if (this.f32986kk != null) {
            throw new Exception("Only one <blip> element can be added.");
        }
        C8401o2 c8401o2 = new C8401o2();
        this.f32986kk = c8401o2;
        return c8401o2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44551k4(byte b) {
        this.f32988x1 = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44552k4(long j) {
        this.f32985k4 = j;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, "a".equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main")) ? null : "http://schemas.openxmlformats.org/drawingml/2006/main");
        long j = this.f32985k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("dpi", C13850af.m65147x1(j));
        }
        byte b = this.f32988x1;
        if (b != -1) {
            c3059ii.m12955x1("rotWithShape", b == 1 ? "1" : "0");
        }
        C8401o2 c8401o2 = this.f32986kk;
        if (c8401o2 != null) {
            c8401o2.mo6846k4("a", c3059ii, "blip");
        }
        C8629qv c8629qv = this.f32987to;
        if (c8629qv != null) {
            c8629qv.mo6846k4("a", c3059ii, "srcRect");
        }
        C7394ca c7394ca = this.f32984du;
        if (c7394ca != null) {
            int iM27428k4 = f32983h4.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 4) {
                ((C7516dv) this.f32984du.m29541kk()).mo6846k4("a", c3059ii, this.f32984du.m29539k4());
            } else if (iM27428k4 == 5) {
                ((C9373zi) this.f32984du.m29541kk()).mo6846k4("a", c3059ii, this.f32984du.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
