package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class w6f extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f32188h4 = new C7017h4("manifest:full-path", "manifest:size", "manifest:media-type", "manifest:preferred-view-mode", "encryption-data");

    /* JADX INFO: renamed from: du */
    private ks6 f32189du;

    /* JADX INFO: renamed from: k4 */
    private String f32190k4;

    /* JADX INFO: renamed from: kk */
    private String f32191kk;

    /* JADX INFO: renamed from: to */
    private String f32192to;

    /* JADX INFO: renamed from: x1 */
    private long f32193x1;

    public w6f() {
        m43512h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m43512h4() {
        this.f32193x1 = 4294967295L;
    }

    /* JADX INFO: renamed from: kk */
    public final long m43521kk() {
        return this.f32193x1;
    }

    /* JADX INFO: renamed from: to */
    public final ks6 m43522to() {
        return this.f32189du;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m43523x1() {
        return this.f32190k4;
    }

    public w6f(final AbstractC13912i5 abstractC13912i5) {
        m43512h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.w6f.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = w6f.f32188h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    w6f.this.f32190k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    w6f.this.f32193x1 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    w6f.this.f32191kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                w6f.this.f32192to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.w6f.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (w6f.f32188h4.m27428k4(abstractC13912i5.mo65023fa()) != 4) {
                    return false;
                }
                w6f.this.f32189du = new ks6(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final ks6 m43518k4() {
        if (this.f32189du != null) {
            throw new Exception("Only one <encryption_data> element can be added.");
        }
        ks6 ks6Var = new ks6();
        this.f32189du = ks6Var;
        return ks6Var;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m43524x1(String str) {
        this.f32191kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43519k4(long j) {
        this.f32193x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43520k4(String str) {
        this.f32190k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("manifest:full-path", this.f32190k4);
        long j = this.f32193x1;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("manifest:size", C13850af.m65147x1(j));
        }
        c3059ii.m12955x1("manifest:media-type", this.f32191kk);
        String str3 = this.f32192to;
        if (str3 != null) {
            c3059ii.m12955x1("manifest:preferred-view-mode", str3);
        }
        ks6 ks6Var = this.f32189du;
        if (ks6Var != null) {
            ks6Var.mo6846k4("manifest", c3059ii, "encryption-data");
        }
        c3059ii.mo21898jd();
    }
}
