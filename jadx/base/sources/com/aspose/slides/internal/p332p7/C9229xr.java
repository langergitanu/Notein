package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.xr */
/* JADX INFO: loaded from: classes4.dex */
public class C9229xr extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f33030jd = new C7017h4("orgChart", "chMax", "chPref", "bulletEnabled", "dir", "hierBranch", "animOne", "animLvl", "resizeHandles");

    /* JADX INFO: renamed from: c5 */
    private C7328bk f33031c5;

    /* JADX INFO: renamed from: du */
    private C7467d9 f33032du;

    /* JADX INFO: renamed from: dy */
    private C8165l8 f33033dy;

    /* JADX INFO: renamed from: h4 */
    private C8983ux f33034h4;

    /* JADX INFO: renamed from: k4 */
    private C7984ja f33035k4;

    /* JADX INFO: renamed from: kk */
    private C9007v8 f33036kk;

    /* JADX INFO: renamed from: m9 */
    private C7690fq f33037m9;

    /* JADX INFO: renamed from: to */
    private C8812sw f33038to;

    /* JADX INFO: renamed from: x1 */
    private C8943ud f33039x1;

    public C9229xr() {
    }

    /* JADX INFO: renamed from: c5 */
    public final C7690fq m44601c5() {
        return this.f33037m9;
    }

    /* JADX INFO: renamed from: ck */
    public final C7328bk m44602ck() {
        return this.f33031c5;
    }

    /* JADX INFO: renamed from: du */
    public final C9007v8 m44603du() {
        return this.f33036kk;
    }

    /* JADX INFO: renamed from: dy */
    public final C8983ux m44604dy() {
        return this.f33034h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8812sw m44605h4() {
        return this.f33038to;
    }

    /* JADX INFO: renamed from: jd */
    public final C8165l8 m44606jd() {
        return this.f33033dy;
    }

    /* JADX INFO: renamed from: kk */
    public final C7984ja m44608kk() {
        return this.f33035k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7467d9 m44609m9() {
        return this.f33032du;
    }

    /* JADX INFO: renamed from: to */
    public final C8943ud m44610to() {
        return this.f33039x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8983ux m44611x1() {
        if (this.f33034h4 != null) {
            throw new Exception("Only one <hierBranch> element can be added.");
        }
        C8983ux c8983ux = new C8983ux();
        this.f33034h4 = c8983ux;
        return c8983ux;
    }

    public C9229xr(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C9229xr.f33030jd.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C9229xr.this.f33035k4 = new C7984ja(abstractC13912i5);
                        return true;
                    case 1:
                        C9229xr.this.f33039x1 = new C8943ud(abstractC13912i5);
                        return true;
                    case 2:
                        C9229xr.this.f33036kk = new C9007v8(abstractC13912i5);
                        return true;
                    case 3:
                        C9229xr.this.f33038to = new C8812sw(abstractC13912i5);
                        return true;
                    case 4:
                        C9229xr.this.f33032du = new C7467d9(abstractC13912i5);
                        return true;
                    case 5:
                        C9229xr.this.f33034h4 = new C8983ux(abstractC13912i5);
                        return true;
                    case 6:
                        C9229xr.this.f33037m9 = new C7690fq(abstractC13912i5);
                        return true;
                    case 7:
                        C9229xr.this.f33033dy = new C8165l8(abstractC13912i5);
                        return true;
                    case 8:
                        C9229xr.this.f33031c5 = new C7328bk(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7467d9 m44607k4() {
        if (this.f33032du != null) {
            throw new Exception("Only one <dir> element can be added.");
        }
        C7467d9 c7467d9 = new C7467d9();
        this.f33032du = c7467d9;
        return c7467d9;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7984ja c7984ja = this.f33035k4;
        if (c7984ja != null) {
            c7984ja.mo6846k4("dgm", c3059ii, "orgChart");
        }
        C8943ud c8943ud = this.f33039x1;
        if (c8943ud != null) {
            c8943ud.mo6846k4("dgm", c3059ii, "chMax");
        }
        C9007v8 c9007v8 = this.f33036kk;
        if (c9007v8 != null) {
            c9007v8.mo6846k4("dgm", c3059ii, "chPref");
        }
        C8812sw c8812sw = this.f33038to;
        if (c8812sw != null) {
            c8812sw.mo6846k4("dgm", c3059ii, "bulletEnabled");
        }
        C7467d9 c7467d9 = this.f33032du;
        if (c7467d9 != null) {
            c7467d9.mo6846k4("dgm", c3059ii, "dir");
        }
        C8983ux c8983ux = this.f33034h4;
        if (c8983ux != null) {
            c8983ux.mo6846k4("dgm", c3059ii, "hierBranch");
        }
        C7690fq c7690fq = this.f33037m9;
        if (c7690fq != null) {
            c7690fq.mo6846k4("dgm", c3059ii, "animOne");
        }
        C8165l8 c8165l8 = this.f33033dy;
        if (c8165l8 != null) {
            c8165l8.mo6846k4("dgm", c3059ii, "animLvl");
        }
        C7328bk c7328bk = this.f33031c5;
        if (c7328bk != null) {
            c7328bk.mo6846k4("dgm", c3059ii, "resizeHandles");
        }
        c3059ii.mo21898jd();
    }
}
