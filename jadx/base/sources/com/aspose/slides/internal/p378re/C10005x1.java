package com.aspose.slides.internal.p378re;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14052dq;

/* JADX INFO: renamed from: com.aspose.slides.internal.re.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10005x1 {

    /* JADX INFO: renamed from: kk */
    private C10003kk f36020kk;

    /* JADX INFO: renamed from: k4 */
    private boolean f36019k4 = true;

    /* JADX INFO: renamed from: x1 */
    private boolean f36022x1 = true;

    /* JADX INFO: renamed from: to */
    private C6765kp f36021to = new C6765kp();

    /* JADX INFO: renamed from: k4 */
    public final void m49125k4(C10000du c10000du, C10003kk c10003kk) {
        this.f36019k4 = false;
        if (c10003kk.m49123k4()) {
            this.f36022x1 = false;
        }
        this.f36020kk = c10003kk;
        if (this.f36021to.m26807x1() == 0) {
            this.f36021to.m26792k4(c10000du.m49111x1());
        }
        this.f36021to.m26792k4(C14052dq.m66570kk()).m26791k4(c10003kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final String m49127x1() {
        C6765kp c6765kp;
        String str;
        if (this.f36021to.m26807x1() == 0) {
            if (m49126k4()) {
                c6765kp = this.f36021to;
                str = "Identical";
            } else {
                c6765kp = this.f36021to;
                str = "Equal";
            }
            c6765kp.m26792k4(str);
        }
        return this.f36021to.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m49126k4() {
        return this.f36019k4;
    }
}
