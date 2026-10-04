package com.aspose.slides.internal.p332p7;

import Oooo0o0.C20986OooO0o0;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes4.dex */
public class eng extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private C8952ug f22316h4;

    /* JADX INFO: renamed from: m9 */
    private ltr f22318m9;

    /* JADX INFO: renamed from: to */
    private int f22319to;

    /* JADX INFO: renamed from: k4 */
    public static final int f22314k4 = v3t.m42712k4(AppMeasurementSdk.ConditionalUserProperty.ACTIVE);

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f22313dy = new C7017h4("id", "authorId", "status", "created", "txBody", "extLst");

    /* JADX INFO: renamed from: x1 */
    private C14047bz f22320x1 = new C14047bz();

    /* JADX INFO: renamed from: kk */
    private C14047bz f22317kk = new C14047bz();

    /* JADX INFO: renamed from: du */
    private C14084qq f22315du = new C14084qq();

    public eng() {
        m31174h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m31174h4() {
        C14047bz c14047bz = C14047bz.f47172k4;
        c14047bz.CloneTo(this.f22320x1);
        c14047bz.CloneTo(this.f22317kk);
        this.f22319to = f22314k4;
        C14084qq.f47299x1.CloneTo(this.f22315du);
    }

    /* JADX INFO: renamed from: kk */
    public final C14084qq m31184kk() {
        return this.f22315du;
    }

    /* JADX INFO: renamed from: to */
    public final C8952ug m31185to() {
        return this.f22316h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C14047bz m31186x1() {
        return this.f22317kk;
    }

    public eng(final AbstractC13912i5 abstractC13912i5) {
        m31174h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.eng.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = eng.f22313dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    eng.this.f22320x1 = new C14047bz(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    eng.this.f22317kk = new C14047bz(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    eng.this.f22319to = v3t.m42712k4(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(eng.this.f22315du);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.eng.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = eng.f22313dy.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 4) {
                    eng.this.f22316h4 = new C8952ug(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                eng.this.f22318m9 = new ltr(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8952ug m31181k4() {
        if (this.f22316h4 != null) {
            throw new Exception("Only one <txBody> element can be added.");
        }
        C8952ug c8952ug = new C8952ug();
        this.f22316h4 = c8952ug;
        return c8952ug;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m31187x1(C14047bz c14047bz) {
        c14047bz.CloneTo(this.f22317kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31182k4(C14047bz c14047bz) {
        c14047bz.CloneTo(this.f22320x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31183k4(C14084qq c14084qq) {
        c14084qq.CloneTo(this.f22315du);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("id", C14113y2.m67408k4("{", OooOO0.OooO00o(this.f22320x1), "}"));
        c3059ii.m12955x1("authorId", C14113y2.m67408k4("{", OooOO0.OooO00o(this.f22317kk), "}"));
        int i = this.f22319to;
        if (i != f22314k4) {
            c3059ii.m12955x1("status", v3t.m42713k4(i));
        }
        C20986OooO0o0.OooO0O0(this.f22315du, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "created");
        C8952ug c8952ug = this.f22316h4;
        if (c8952ug != null) {
            c8952ug.mo6846k4("p188", c3059ii, "txBody");
        }
        ltr ltrVar = this.f22318m9;
        if (ltrVar != null) {
            ltrVar.mo6846k4("p188", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
