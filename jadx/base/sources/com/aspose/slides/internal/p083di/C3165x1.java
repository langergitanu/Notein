package com.aspose.slides.internal.p083di;

import com.aspose.slides.internal.p420th.AbstractC10972up;
import com.aspose.slides.internal.p420th.C10950bv;
import com.aspose.slides.internal.p420th.C10955du;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p420th.C10974v4;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.di.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C3165x1 extends AbstractC10972up {

    /* JADX INFO: renamed from: k4 */
    private C11896dy f9406k4;

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13521k4(C10950bv c10950bv) {
        this.f9406k4.m55585yj();
    }

    /* JADX INFO: renamed from: x1 */
    public final C11896dy m13532x1() {
        return this.f9406k4;
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13523k4(C10955du c10955du) {
        if (C14116yg.m67477k4(c10955du.m52919k4().m53050k4().m56897x1(), 2) == C14116yg.m67477k4(c10955du.m52919k4().m53057x1().m56897x1(), 2) && C14116yg.m67477k4(c10955du.m52919k4().m53050k4().m56895kk(), 2) == C14116yg.m67477k4(c10955du.m52919k4().m53057x1().m56895kk(), 2) && C14116yg.m67477k4(c10955du.m52919k4().m53057x1().m56897x1(), 2) == C14116yg.m67477k4(c10955du.m52919k4().m53053kk().m56897x1(), 2) && C14116yg.m67477k4(c10955du.m52919k4().m53057x1().m56895kk(), 2) == C14116yg.m67477k4(c10955du.m52919k4().m53053kk().m56895kk(), 2) && C14116yg.m67477k4(c10955du.m52919k4().m53053kk().m56897x1(), 2) == C14116yg.m67477k4(c10955du.m52919k4().m53055to().m56897x1(), 2) && C14116yg.m67477k4(c10955du.m52919k4().m53053kk().m56895kk(), 2) == C14116yg.m67477k4(c10955du.m52919k4().m53055to().m56895kk(), 2)) {
            this.f9406k4.m55547k4(c10955du.m52919k4().m53050k4().Clone(), c10955du.m52919k4().m53055to().Clone());
        } else {
            this.f9406k4.m55548k4(c10955du.m52919k4().m53050k4().Clone(), c10955du.m52919k4().m53057x1().Clone(), c10955du.m52919k4().m53053kk().Clone(), c10955du.m52919k4().m53055to().Clone());
        }
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13529x1(C10950bv c10950bv) {
        if (c10950bv.m52896k4()) {
            this.f9406k4.m55567m9();
        }
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13528k4(C10974v4 c10974v4) {
        C12025x6[] array = c10974v4.m53117k4().toArray(new C12025x6[0]);
        if (array != null && array.length > 1) {
            C12025x6 c12025x6Clone = array[0].Clone();
            int i = 1;
            while (true) {
                if (i >= array.length) {
                    array[array.length - 1] = new C12025x6(c12025x6Clone.m56897x1() + 0.5f, c12025x6Clone.m56895kk());
                    break;
                } else if (C12025x6.m56888x1(c12025x6Clone, array[i])) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f9406k4.m55564kk(array);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13516x1(C10971um c10971um) {
        this.f9406k4 = new C11896dy(c10971um.m53097h4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13531k4(C11896dy c11896dy) {
        this.f9406k4 = c11896dy;
    }
}
