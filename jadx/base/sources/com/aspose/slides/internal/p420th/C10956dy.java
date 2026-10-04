package com.aspose.slides.internal.p420th;

import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.th.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C10956dy extends AbstractC10981yj {

    /* JADX INFO: renamed from: kk */
    private static final C5659x1 f38173kk = C9763ck.m48030to().m48331k4("Times New Roman", 12.0f, 0);

    /* JADX INFO: renamed from: k4 */
    private String f38174k4;

    /* JADX INFO: renamed from: to */
    private C5659x1 f38175to;

    /* JADX INFO: renamed from: x1 */
    private C12015qq f38176x1;

    public C10956dy() {
        this.f38176x1 = new C12015qq();
        this.f38175to = f38173kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12015qq m52922k4() {
        return this.f38176x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C5659x1 m52925kk() {
        return this.f38175to;
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10981yj
    /* JADX INFO: renamed from: to */
    public C12007ix mo52867to() {
        return new C12007ix(m53142h4().Clone(), this.f38176x1.Clone());
    }

    /* JADX INFO: renamed from: x1 */
    public final String m52926x1() {
        return this.f38174k4;
    }

    public C10956dy(C12025x6 c12025x6, String str, C12015qq c12015qq) {
        super(c12025x6.Clone(), str);
        C12015qq c12015qq2 = new C12015qq();
        this.f38176x1 = c12015qq2;
        this.f38175to = f38173kk;
        c12015qq.CloneTo(c12015qq2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52923k4(C5659x1 c5659x1) {
        this.f38175to = c5659x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52924k4(String str) {
        this.f38174k4 = str;
    }
}
