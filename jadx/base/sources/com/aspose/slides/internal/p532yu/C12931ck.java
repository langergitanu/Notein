package com.aspose.slides.internal.p532yu;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.ck */
/* JADX INFO: loaded from: classes5.dex */
public class C12931ck {

    /* JADX INFO: renamed from: k4 */
    public String f43490k4;

    /* JADX INFO: renamed from: kk */
    public C13282xc f43491kk;

    /* JADX INFO: renamed from: to */
    private int f43492to;

    /* JADX INFO: renamed from: x1 */
    public C14062gk f43493x1;

    public C12931ck(String str, C13282xc c13282xc) {
        this.f43490k4 = str;
        C14062gk c14062gkM61725u4 = c13282xc.m61725u4();
        this.f43493x1 = c14062gkM61725u4;
        if (c14062gkM61725u4.m66694u4().length() == 0) {
            this.f43491kk = c13282xc;
        }
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        C12931ck c12931ck = (C12931ck) C7019kk.m27452k4(obj, C12931ck.class);
        return c12931ck != null && C14113y2.m67363du(this.f43490k4, c12931ck.f43490k4) && this.f43493x1.equals(c12931ck.f43493x1) && C14067j2.m66729x1(this.f43491kk, c12931ck.f43491kk);
    }

    public int hashCode() {
        if (this.f43492to == 0) {
            int iHashCode = this.f43493x1.hashCode() + this.f43490k4.hashCode();
            C13282xc c13282xc = this.f43491kk;
            this.f43492to = iHashCode + (c13282xc == null ? 0 : c13282xc.hashCode());
        }
        return this.f43492to;
    }
}
