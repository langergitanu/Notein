package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ru */
/* JADX INFO: loaded from: classes4.dex */
public class C8713ru extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f29739c5 = new C7017h4("shapeCheckSum", "textCheckSum", "shapeId", "fHybridRaster", "rot", "ver", "convChart", "bounds", "effectOffsets", "preciseEffectOffsets", "xlAnchor");

    /* JADX INFO: renamed from: du */
    private int f29740du;

    /* JADX INFO: renamed from: dy */
    private C7394ca f29741dy;

    /* JADX INFO: renamed from: h4 */
    private long f29742h4;

    /* JADX INFO: renamed from: k4 */
    private String f29743k4;

    /* JADX INFO: renamed from: kk */
    private long f29744kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f29745m9;

    /* JADX INFO: renamed from: to */
    private byte f29746to;

    /* JADX INFO: renamed from: x1 */
    private String f29747x1;

    public C8713ru() {
        m40555to();
    }

    /* JADX INFO: renamed from: to */
    private void m40555to() {
        this.f29744kk = 4294967295L;
        this.f29746to = (byte) -1;
        this.f29740du = 0;
        this.f29742h4 = 0L;
        this.f29745m9 = false;
    }

    public C8713ru(final AbstractC13912i5 abstractC13912i5) {
        m40555to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ru.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (C8713ru.f29739c5.m27428k4(str)) {
                    case 0:
                        C8713ru.this.f29743k4 = str2;
                        break;
                    case 1:
                        C8713ru.this.f29747x1 = str2;
                        break;
                    case 2:
                        C8713ru.this.f29744kk = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 3:
                        C8713ru.this.f29746to = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 4:
                        C8713ru.this.f29740du = C13850af.m65151yj(str2);
                        break;
                    case 5:
                        C8713ru.this.f29742h4 = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 6:
                        C8713ru.this.f29745m9 = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ru.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8713ru c8713ru;
                C7394ca c7394ca;
                switch (C8713ru.f29739c5.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 7:
                        c8713ru = C8713ru.this;
                        c7394ca = new C7394ca("bounds", new C9357zb(abstractC13912i5));
                        break;
                    case 8:
                        c8713ru = C8713ru.this;
                        c7394ca = new C7394ca("effectOffsets", new C8629qv(abstractC13912i5));
                        break;
                    case 9:
                        c8713ru = C8713ru.this;
                        c7394ca = new C7394ca("preciseEffectOffsets", new C7454d2(abstractC13912i5));
                        break;
                    case 10:
                        c8713ru = C8713ru.this;
                        c7394ca = new C7394ca("xlAnchor", new C9337z2(abstractC13912i5));
                        break;
                    default:
                        return false;
                }
                c8713ru.f29741dy = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final String m40563x1() {
        return this.f29747x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m40564x1(long j) {
        this.f29742h4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m40558k4() {
        return this.f29743k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m40565x1(String str) {
        this.f29747x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40559k4(byte b) {
        this.f29746to = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40560k4(long j) {
        this.f29744kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40561k4(C7394ca c7394ca) {
        this.f29741dy = c7394ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m40562k4(String str) {
        this.f29743k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("a", str2, "http://schemas.openxmlformats.org/drawingml/2006/main");
        c3059ii.m12955x1("shapeCheckSum", this.f29743k4);
        String str3 = this.f29747x1;
        if (str3 != null) {
            c3059ii.m12955x1("textCheckSum", str3);
        }
        long j = this.f29744kk;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("shapeId", C13850af.m65147x1(j));
        }
        byte b = this.f29746to;
        if (b != -1) {
            c3059ii.m12955x1("fHybridRaster", b == 1 ? "1" : "0");
        }
        int i = this.f29740du;
        if (i != 0) {
            c3059ii.m12955x1("rot", C13850af.m65103k4(i));
        }
        long j2 = this.f29742h4;
        if ((4294967295L & j2) != 0) {
            c3059ii.m12955x1("ver", C13850af.m65147x1(j2));
        }
        boolean z = this.f29745m9;
        if (z) {
            c3059ii.m12955x1("convChart", z ? "1" : "0");
        }
        C7394ca c7394ca = this.f29741dy;
        if (c7394ca != null) {
            switch (f29739c5.m27428k4(c7394ca.m29539k4())) {
                case 7:
                    ((C9357zb) this.f29741dy.m29541kk()).mo6846k4("a", c3059ii, this.f29741dy.m29539k4());
                    break;
                case 8:
                    ((C8629qv) this.f29741dy.m29541kk()).mo6846k4("a", c3059ii, this.f29741dy.m29539k4());
                    break;
                case 9:
                    ((C7454d2) this.f29741dy.m29541kk()).mo6846k4("a", c3059ii, this.f29741dy.m29539k4());
                    break;
                case 10:
                    ((C9337z2) this.f29741dy.m29541kk()).mo6846k4("a", c3059ii, this.f29741dy.m29539k4());
                    break;
            }
        }
        c3059ii.mo21898jd();
    }
}
