package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p077d8.C3083s7;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C9164x1 extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    private C8909ty f32685k4;

    /* JADX INFO: renamed from: x1 */
    private C7230ac f32686x1;

    public C9164x1() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C8909ty m44161k4() {
        if (this.f32685k4 != null) {
            throw new Exception("Only one <style> element can be added.");
        }
        C8909ty c8909ty = new C8909ty();
        this.f32685k4 = c8909ty;
        return c8909ty;
    }

    /* JADX INFO: renamed from: kk */
    public final C8909ty m44162kk() {
        return this.f32685k4;
    }

    /* JADX INFO: renamed from: to */
    public final C7230ac m44163to() {
        return this.f32686x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7230ac m44164x1() {
        if (this.f32686x1 != null) {
            throw new Exception("Only one <style> element can be added.");
        }
        C7230ac c7230ac = new C7230ac();
        this.f32686x1 = c7230ac;
        return c7230ac;
    }

    public C9164x1(AbstractC13912i5 abstractC13912i5) {
        if (C3083s7.f9152k4.m12773k4("http://schemas.microsoft.com/office/drawing/2007/8/2/chart") && "c14".equals(abstractC13912i5.mo65060yj())) {
            this.f32686x1 = new C7230ac(abstractC13912i5);
        } else {
            this.f32685k4 = new C8909ty(abstractC13912i5);
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        if (this.f32686x1 == null) {
            C8909ty c8909ty = this.f32685k4;
            if (c8909ty != null) {
                c8909ty.mo6846k4(str, c3059ii, "style");
                return;
            }
            return;
        }
        c3059ii.mo12953k4("mc", "AlternateContent", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        if (this.f32686x1 != null) {
            c3059ii.mo12953k4("mc", "Choice", (String) null);
            c3059ii.m12954to("xmlns", "c14", null, "http://schemas.microsoft.com/office/drawing/2007/8/2/chart");
            c3059ii.m12955x1("Requires", "c14");
            this.f32686x1.mo6846k4("cht14", c3059ii, "style");
            c3059ii.mo21898jd();
        }
        if (this.f32685k4 != null) {
            c3059ii.mo12953k4("mc", "Fallback", (String) null);
            this.f32685k4.mo6846k4(str, c3059ii, "style");
            c3059ii.mo21898jd();
        }
        c3059ii.mo21898jd();
    }
}
