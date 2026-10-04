package com.aspose.slides.internal.p166hg;

import com.aspose.slides.internal.p118ex.C3817h4;
import com.aspose.slides.internal.p118ex.C3819jd;
import com.aspose.slides.internal.p419tg.C10945x1;
import com.aspose.slides.internal.p525yi.C12824h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hg.ss */
/* JADX INFO: loaded from: classes.dex */
public final class C4558ss {

    /* JADX INFO: renamed from: kk */
    private C3817h4 f12727kk;

    /* JADX INFO: renamed from: to */
    private C12824h4 f12728to;

    /* JADX INFO: renamed from: x1 */
    private C3819jd f12729x1 = new C3819jd();

    /* JADX INFO: renamed from: k4 */
    private String f12726k4 = C14113y2.f47374k4;

    /* JADX INFO: renamed from: k4 */
    public String m18835k4() {
        return this.f12726k4;
    }

    /* JADX INFO: renamed from: kk */
    public C3817h4 m18839kk() {
        return this.f12727kk;
    }

    /* JADX INFO: renamed from: to */
    public void m18840to() {
        if (this.f12727kk == null) {
            this.f12728to = null;
            return;
        }
        C10945x1 c10945x1 = new C10945x1(this.f12727kk.m15278ck());
        C12824h4 c12824h4 = new C12824h4(c10945x1.m52826dy().mo19591k4());
        this.f12728to = c12824h4;
        c12824h4.mo19639k4(c10945x1.m52826dy().mo19642x1(false).Clone());
    }

    /* JADX INFO: renamed from: x1 */
    public C3819jd m18841x1() {
        return this.f12729x1;
    }

    /* JADX INFO: renamed from: k4 */
    public void m18836k4(C3817h4 c3817h4) {
        this.f12727kk = c3817h4;
        m18840to();
    }

    /* JADX INFO: renamed from: k4 */
    public void m18837k4(C3819jd c3819jd) {
        this.f12729x1 = c3819jd;
    }

    /* JADX INFO: renamed from: k4 */
    public void m18838k4(String str) {
        this.f12726k4 = str;
    }
}
