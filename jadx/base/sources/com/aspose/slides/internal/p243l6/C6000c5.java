package com.aspose.slides.internal.p243l6;

import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.l6.c5 */
/* JADX INFO: loaded from: classes.dex */
public class C6000c5 {

    /* JADX INFO: renamed from: k4 */
    private long f16939k4 = 0;

    /* JADX INFO: renamed from: x1 */
    private long f16941x1 = 0;

    /* JADX INFO: renamed from: kk */
    private boolean f16940kk = false;

    /* JADX INFO: renamed from: k4 */
    public static C6000c5 m24231k4() {
        C6000c5 c6000c5 = new C6000c5();
        c6000c5.m24234h4();
        return c6000c5;
    }

    /* JADX INFO: renamed from: x1 */
    public static long m24232x1() {
        return C14084qq.m67081jd().m67130fa();
    }

    /* JADX INFO: renamed from: du */
    public final long m24233du() {
        return this.f16940kk ? (m24232x1() - this.f16941x1) + this.f16939k4 : this.f16939k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m24234h4() {
        if (this.f16940kk) {
            return;
        }
        this.f16941x1 = m24232x1();
        this.f16940kk = true;
    }

    /* JADX INFO: renamed from: kk */
    public final C14077m4 m24235kk() {
        return C14077m4.m66801k4(m24233du());
    }

    /* JADX INFO: renamed from: m9 */
    public final void m24236m9() {
        if (this.f16940kk) {
            this.f16939k4 = (m24232x1() - this.f16941x1) + this.f16939k4;
            this.f16940kk = false;
        }
    }

    /* JADX INFO: renamed from: to */
    public final long m24237to() {
        return (long) m24235kk().m66822m9();
    }
}
