package com.aspose.slides.internal.p353q7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p505xn.C12564kk;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C9761c5 {

    /* JADX INFO: renamed from: k4 */
    private C12564kk f35269k4;

    /* JADX INFO: renamed from: kk */
    private long f35270kk;

    /* JADX INFO: renamed from: to */
    private Dictionary<Long, Long> f35271to = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private long f35272x1;

    public C9761c5(C12564kk c12564kk, long j) {
        this.f35269k4 = c12564kk;
        this.f35272x1 = c12564kk.m58602k4().getPosition();
        this.f35270kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<Long, Long> m48018k4() {
        return this.f35271to;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m48019x1() {
        this.f35269k4.m58602k4().setPosition(this.f35270kk);
        int i = 65535;
        int iM58600du = this.f35269k4.m58600du() & 65535;
        int iM58600du2 = this.f35269k4.m58600du() & 65535;
        if (iM58600du == 1) {
            for (long j = 0; (j & 4294967295L) < iM58600du2; j++) {
                this.f35271to.addItem(Long.valueOf(j), Long.valueOf(((long) this.f35269k4.m58600du()) & C18177fb.f54859s));
            }
        } else {
            int i2 = 0;
            while (i2 < iM58600du2) {
                long jM58600du = this.f35269k4.m58600du() & i;
                long jM58600du2 = this.f35269k4.m58600du() & i;
                int i3 = iM58600du2;
                long jM58600du3 = this.f35269k4.m58600du() & i;
                long j2 = 0;
                while (true) {
                    long j3 = j2 & 4294967295L;
                    long j4 = jM58600du & 4294967295L;
                    if (j3 < (((((jM58600du2 & 4294967295L) - j4) & 4294967295L) + 1) & 4294967295L)) {
                        this.f35271to.addItem(Long.valueOf(((jM58600du3 & 4294967295L) + j3) & 4294967295L), Long.valueOf((j4 + j3) & 4294967295L));
                        j2++;
                    }
                }
                i2++;
                iM58600du2 = i3;
                i = 65535;
            }
        }
        this.f35269k4.m58602k4().setPosition(this.f35272x1);
    }
}
