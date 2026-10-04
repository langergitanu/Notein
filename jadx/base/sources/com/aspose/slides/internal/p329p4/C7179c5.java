package com.aspose.slides.internal.p329p4;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.OooO;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14093tq;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;

/* JADX INFO: renamed from: com.aspose.slides.internal.p4.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C7179c5 extends C7185jd {

    /* JADX INFO: renamed from: k4 */
    private C14093tq<Integer> f19325k4;

    /* JADX INFO: renamed from: x1 */
    private C14093tq<Float> f19326x1;

    public C7179c5(float f) {
        this.f19325k4 = new C14093tq<>();
        this.f19326x1 = new C14093tq<>();
        this.f19326x1 = new C14093tq<>(Float.valueOf(f));
    }

    /* JADX INFO: renamed from: k4 */
    public static C7179c5 m27750k4(String str) {
        int[] iArr = {0};
        boolean zM66590k4 = C14057f9.m66590k4(str, iArr);
        int i = iArr[0];
        if (zM66590k4) {
            return new C7179c5(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public static C7179c5 m27751x1(String str) {
        float[] fArr = {0.0f};
        boolean zM66713k4 = C14064he.m66713k4(str, FrameMetricsAggregator.EVERY_DURATION, C11697x1.m55250kk(), fArr);
        float f = fArr[0];
        if (zM66713k4) {
            return new C7179c5(f);
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final int m27752kk() {
        if (this.f19325k4.m67302x1() || this.f19326x1.m67302x1()) {
            return C14093tq.m67296x1(this.f19325k4, null) ? this.f19325k4.m67297k4().intValue() : OooO.OooO00o(m27753to(), 14);
        }
        return 0;
    }

    /* JADX INFO: renamed from: to */
    public final float m27753to() {
        if (this.f19325k4.m67302x1() || this.f19326x1.m67302x1()) {
            return C14093tq.m67296x1(this.f19326x1, null) ? this.f19326x1.m67297k4().floatValue() : m27752kk();
        }
        return 0.0f;
    }

    public String toString() {
        return this.f19325k4.m67302x1() ? C14057f9.m66591x1(this.f19325k4.m67297k4().intValue()) : this.f19326x1.m67302x1() ? C14064he.m66704h4(this.f19326x1.m67297k4().floatValue()) : CloudMetaExtra.DEFINE_NON_PARENT_ID;
    }

    public C7179c5(int i) {
        this.f19325k4 = new C14093tq<>();
        this.f19326x1 = new C14093tq<>();
        this.f19325k4 = new C14093tq<>(Integer.valueOf(i));
    }
}
