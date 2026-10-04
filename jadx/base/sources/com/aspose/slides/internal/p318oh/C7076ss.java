package com.aspose.slides.internal.p318oh;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p539z4.AbstractC13373f9;
import com.aspose.slides.internal.p539z4.C13360b3;
import com.aspose.slides.internal.p539z4.C13397os;
import com.aspose.slides.internal.p539z4.C13411um;
import com.aspose.slides.internal.p539z4.C13418wl;
import com.aspose.slides.internal.p539z4.C13420wy;
import com.aspose.slides.internal.p539z4.C13430yo;

/* JADX INFO: renamed from: com.aspose.slides.internal.oh.ss */
/* JADX INFO: loaded from: classes4.dex */
public class C7076ss extends AbstractC7052e0 {

    /* JADX INFO: renamed from: k4 */
    private final long f19217k4;

    public C7076ss(long j) {
        this.f19217k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC13373f9 m27597k4(C3134k4 c3134k4) {
        C13397os c13397os = new C13397os();
        if ((this.f19217k4 & 1) > 0) {
            c13397os.m62286k4((C13430yo) new C7073ri().m27594k4(c3134k4));
        }
        if ((this.f19217k4 & 2) > 0) {
            c13397os.m62281k4(((long) c3134k4.m13386x6()) & 4294967295L);
        }
        if ((this.f19217k4 & 4) > 0) {
            c13397os.m62298x1(((long) c3134k4.m13386x6()) & 4294967295L);
        }
        if ((this.f19217k4 & 8) > 0) {
            c13397os.m62280k4(c3134k4.m13386x6());
        }
        if ((this.f19217k4 & 16) > 0) {
            c13397os.m62279k4(c3134k4.m13374ix());
        }
        if ((this.f19217k4 & 32) > 0) {
            c13397os.m62297x1(c3134k4.m13386x6());
        }
        if ((this.f19217k4 & 64) > 0) {
            c13397os.m62290kk(c3134k4.m13386x6());
        }
        if ((this.f19217k4 & 128) > 0) {
            c13397os.m62296x1(c3134k4.m13374ix());
        }
        if ((this.f19217k4 & 256) > 0) {
            c13397os.m62285k4((C13420wy) new C7042ar().m27564k4(c3134k4));
        }
        if ((this.f19217k4 & 512) > 0) {
            c13397os.m62293to(c3134k4.m13386x6());
        }
        if ((this.f19217k4 & 1024) > 0) {
            c13397os.m62284k4((C13418wl) new C7074rv().m27595k4(c3134k4));
        }
        if ((this.f19217k4 & 2048) > 0) {
            c13397os.m62282k4((C13360b3) new C7071qq().m27592k4(c3134k4));
        }
        if ((this.f19217k4 & 4096) > 0) {
            c13397os.m62283k4((C13411um) new C7068ne().m27589k4(c3134k4));
        }
        return c13397os;
    }
}
