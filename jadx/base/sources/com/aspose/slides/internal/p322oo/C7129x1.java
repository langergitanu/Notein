package com.aspose.slides.internal.p322oo;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p135fp.C4095jd;
import com.aspose.slides.internal.p135fp.C4106up;
import com.aspose.slides.internal.p135fp.C4108v4;
import com.aspose.slides.internal.p225ke.C5667to;

/* JADX INFO: renamed from: com.aspose.slides.internal.oo.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C7129x1 {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<Integer, k4> f19237k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private final C4106up f19238x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.oo.x1$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public final int[] f19239k4;

        private k4() {
            this.f19239k4 = new int[C5667to.f15654k4];
        }
    }

    public C7129x1(C4106up c4106up) {
        this.f19238x1 = c4106up;
        for (C4095jd c4095jd : c4106up.m16422to().m16362x1()) {
            this.f19237k4.set_Item(Integer.valueOf(c4095jd.m16317h4() & 255), new k4());
            Dictionary.ValueCollection.Enumerator<Integer, C4108v4> it = this.f19238x1.m16409jd().getValues().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C4108v4 next = it.next();
                if (next != null && (next.m16434x1() & 255) == (c4095jd.m16311ck() & 255)) {
                    System.arraycopy(next.f11261x1, 0, this.f19237k4.get_Item(Integer.valueOf(c4095jd.m16317h4() & 255)).f19239k4, 0, C5667to.f15654k4);
                    break;
                }
            }
        }
    }
}
