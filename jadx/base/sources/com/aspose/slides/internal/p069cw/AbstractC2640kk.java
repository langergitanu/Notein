package com.aspose.slides.internal.p069cw;

import com.aspose.slides.internal.p171hq.AbstractC4619du;
import com.aspose.slides.internal.p171hq.C4657to;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.cw.kk */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2640kk {
    /* JADX INFO: renamed from: k4 */
    public final void m12098k4(C6045bz c6045bz, C2638du c2638du) {
        mo12099x1(c6045bz, c2638du);
    }

    /* JADX INFO: renamed from: x1 */
    public abstract void mo12099x1(C6045bz c6045bz, C2638du c2638du);

    /* JADX INFO: renamed from: k4 */
    public static C12007ix[] m12096k4(AbstractC4619du[] abstractC4619duArr) {
        if (abstractC4619duArr == null) {
            return null;
        }
        C12007ix[] c12007ixArr = (C12007ix[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12007ix.class), abstractC4619duArr.length));
        for (int i = 0; i < abstractC4619duArr.length; i++) {
            abstractC4619duArr[i].mo19058k4().CloneTo(c12007ixArr[i]);
        }
        return c12007ixArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6[] m12097k4(C4657to[] c4657toArr) {
        if (c4657toArr == null) {
            return null;
        }
        C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), c4657toArr.length));
        for (int i = 0; i < c4657toArr.length; i++) {
            c4657toArr[i].mo19089k4().CloneTo(c12025x6Arr[i]);
        }
        return c12025x6Arr;
    }
}
