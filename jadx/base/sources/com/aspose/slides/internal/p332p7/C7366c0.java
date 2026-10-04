package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.c0 */
/* JADX INFO: loaded from: classes4.dex */
public class C7366c0 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f20836to = new C7017h4("effectLst", "effectDag", "scene3d", "sp3d");

    /* JADX INFO: renamed from: k4 */
    private C7394ca f20837k4;

    /* JADX INFO: renamed from: kk */
    private C8638qy f20838kk;

    /* JADX INFO: renamed from: x1 */
    private C8820sx f20839x1;

    public C7366c0() {
    }

    /* JADX INFO: renamed from: du */
    public final C8638qy m29341du() {
        return this.f20838kk;
    }

    /* JADX INFO: renamed from: kk */
    public final C7394ca m29344kk() {
        return this.f20837k4;
    }

    /* JADX INFO: renamed from: to */
    public final C8820sx m29345to() {
        return this.f20839x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8638qy m29346x1() {
        if (this.f20838kk != null) {
            throw new Exception("Only one <sp3d> element can be added.");
        }
        C8638qy c8638qy = new C8638qy();
        this.f20838kk = c8638qy;
        return c8638qy;
    }

    public C7366c0(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.c0.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C7366c0 c7366c0;
                C7394ca c7394ca;
                int iM27428k4 = C7366c0.f20836to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    c7366c0 = C7366c0.this;
                    c7394ca = new C7394ca("effectLst", new C8490p3(abstractC13912i5));
                } else {
                    if (iM27428k4 != 1) {
                        if (iM27428k4 == 2) {
                            C7366c0.this.f20839x1 = new C8820sx(abstractC13912i5);
                        } else {
                            if (iM27428k4 != 3) {
                                return false;
                            }
                            C7366c0.this.f20838kk = new C8638qy(abstractC13912i5);
                        }
                        return true;
                    }
                    c7366c0 = C7366c0.this;
                    c7394ca = new C7394ca("effectDag", new C9295yl(abstractC13912i5));
                }
                c7366c0.f20837k4 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m29342k4(String str) {
        C7394ca c7394ca;
        if (this.f20837k4 != null) {
            throw new Exception("EffectProperties already is initialized.");
        }
        int iM27428k4 = f20836to.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("effectLst", new C8490p3());
        } else {
            if (iM27428k4 != 1) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("effectDag", new C9295yl());
        }
        this.f20837k4 = c7394ca;
        return this.f20837k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8820sx m29343k4() {
        if (this.f20839x1 != null) {
            throw new Exception("Only one <scene3d> element can be added.");
        }
        C8820sx c8820sx = new C8820sx();
        this.f20839x1 = c8820sx;
        return c8820sx;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7394ca c7394ca = this.f20837k4;
        if (c7394ca != null) {
            int iM27428k4 = f20836to.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 0) {
                ((C8490p3) this.f20837k4.m29541kk()).mo6846k4("a", c3059ii, this.f20837k4.m29539k4());
            } else if (iM27428k4 == 1) {
                ((C9295yl) this.f20837k4.m29541kk()).mo6846k4("a", c3059ii, this.f20837k4.m29539k4());
            }
        }
        C8820sx c8820sx = this.f20839x1;
        if (c8820sx != null) {
            c8820sx.mo6846k4("a", c3059ii, "scene3d");
        }
        C8638qy c8638qy = this.f20838kk;
        if (c8638qy != null) {
            c8638qy.mo6846k4("a", c3059ii, "sp3d");
        }
        c3059ii.mo21898jd();
    }
}
