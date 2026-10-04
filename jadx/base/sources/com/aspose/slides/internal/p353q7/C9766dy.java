package com.aspose.slides.internal.p353q7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p505xn.C12564kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C9766dy {

    /* JADX INFO: renamed from: k4 */
    private C12564kk f35284k4;

    /* JADX INFO: renamed from: kk */
    private long f35285kk;

    /* JADX INFO: renamed from: to */
    private Dictionary<Long, List<Long>> f35286to = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private long f35287x1;

    public C9766dy(C12564kk c12564kk, long j) {
        this.f35284k4 = c12564kk;
        this.f35287x1 = c12564kk.m58602k4().getPosition();
        this.f35285kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<Long, List<Long>> m48044k4() {
        return this.f35286to;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m48045x1() {
        this.f35284k4.m58602k4().setPosition(this.f35285kk);
        long j = 0;
        this.f35286to.addItem(0L, new List<>());
        int i = 65535;
        long j2 = 4294967295L;
        if ((this.f35284k4.m58600du() & 65535) == 1) {
            long jM58600du = this.f35284k4.m58600du() & 65535;
            long jM58600du2 = this.f35284k4.m58600du() & 65535;
            while (true) {
                long j3 = j & 4294967295L;
                if (j3 >= (jM58600du2 & 4294967295L)) {
                    break;
                }
                int i2 = i;
                long jM58600du3 = this.f35284k4.m58600du() & i;
                if (this.f35286to.containsKey(Long.valueOf(jM58600du3))) {
                    this.f35286to.get_Item(Long.valueOf(jM58600du3)).addItem(Long.valueOf(((jM58600du & 4294967295L) + j3) & 4294967295L));
                } else {
                    List<Long> list = new List<>();
                    list.addItem(Long.valueOf(((jM58600du & 4294967295L) + j3) & 4294967295L));
                    this.f35286to.addItem(Long.valueOf(jM58600du3), list);
                }
                j++;
                i = i2;
            }
        } else {
            long jM58600du4 = this.f35284k4.m58600du() & 65535;
            int i3 = 0;
            while (i3 < (jM58600du4 & j2)) {
                long jM58600du5 = this.f35284k4.m58600du() & 65535;
                long jM58600du6 = this.f35284k4.m58600du() & 65535;
                long jM58600du7 = this.f35284k4.m58600du() & 65535;
                long j4 = j;
                while (true) {
                    long j5 = j4 & j2;
                    long j6 = jM58600du5 & j2;
                    if (j5 < (((((jM58600du6 & j2) - j6) & j2) + 1) & j2)) {
                        if (this.f35286to.containsKey(Long.valueOf(jM58600du7))) {
                            this.f35286to.get_Item(Long.valueOf(jM58600du7)).addItem(Long.valueOf((j6 + j5) & j2));
                        } else {
                            List<Long> list2 = new List<>();
                            list2.addItem(Long.valueOf((j6 + j5) & j2));
                            this.f35286to.addItem(Long.valueOf(jM58600du7), list2);
                        }
                        j4++;
                        j2 = 4294967295L;
                    }
                }
                i3++;
                j = 0;
                j2 = 4294967295L;
            }
        }
        this.f35284k4.m58602k4().setPosition(this.f35287x1);
    }
}
