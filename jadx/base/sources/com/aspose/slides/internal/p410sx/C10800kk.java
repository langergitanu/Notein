package com.aspose.slides.internal.p410sx;

import com.aspose.slides.internal.p167hh.AbstractC4584k4;
import com.aspose.slides.internal.p167hh.C4587x1;
import com.aspose.slides.internal.p274mh.AbstractC6384k4;
import com.aspose.slides.internal.p475wh.C12004dy;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.aspose.slides.internal.sx.kk */
/* JADX INFO: loaded from: classes4.dex */
public final class C10800kk {

    /* JADX INFO: renamed from: k4 */
    private AbstractC6384k4 f37845k4;

    /* JADX INFO: renamed from: kk */
    private C12004dy[] f37846kk;

    /* JADX INFO: renamed from: x1 */
    private final Map<String, C4587x1> f37847x1;

    public C10800kk(AbstractC6384k4 abstractC6384k4, Map<String, C4587x1> map) {
        this.f37845k4 = abstractC6384k4;
        this.f37847x1 = map;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4584k4 m52370k4(String str, int i) {
        C4587x1 c4587x1M52371k4 = m52371k4(str);
        if (c4587x1M52371k4 == null) {
            return null;
        }
        return c4587x1M52371k4.m18946k4(i, false);
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC4584k4[] m52374x1(String str) {
        C4587x1 c4587x1M52371k4;
        if (str == null || (c4587x1M52371k4 = m52371k4(C10799k4.m52365k4(str))) == null) {
            return null;
        }
        return c4587x1M52371k4.m18950x1();
    }

    /* JADX INFO: renamed from: k4 */
    public C4587x1 m52371k4(String str) {
        return this.f37847x1.get(str);
    }

    /* JADX INFO: renamed from: k4 */
    public void m52372k4(C4587x1 c4587x1) {
        if (!this.f37847x1.containsKey(c4587x1.m18947k4())) {
            this.f37846kk = null;
        }
        this.f37847x1.put(c4587x1.m18947k4(), c4587x1);
    }

    /* JADX INFO: renamed from: k4 */
    public C12004dy[] m52373k4() {
        if (this.f37846kk == null) {
            this.f37846kk = new C12004dy[this.f37847x1.size()];
            Iterator<String> it = this.f37847x1.keySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                this.f37846kk[i] = new C12004dy(it.next(), this.f37845k4);
                i++;
            }
        }
        return this.f37846kk;
    }
}
