package com.aspose.slides.internal.p359qf;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p421tk.C10988bz;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p539z4.AbstractC13369du;
import com.aspose.slides.internal.p539z4.C13407to;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.qf.kk */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9858kk {
    /* JADX INFO: renamed from: k4 */
    public final void m48686k4(C10988bz c10988bz, C9856du c9856du) {
        mo7795x1(c10988bz, c9856du);
    }

    /* JADX INFO: renamed from: x1 */
    public abstract void mo7795x1(C10988bz c10988bz, C9856du c9856du);

    /* JADX INFO: renamed from: k4 */
    public static C12007ix[] m48684k4(AbstractC13369du[] abstractC13369duArr) {
        if (abstractC13369duArr == null) {
            return null;
        }
        C12007ix[] c12007ixArr = (C12007ix[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12007ix.class), abstractC13369duArr.length));
        for (int i = 0; i < abstractC13369duArr.length; i++) {
            abstractC13369duArr[i].mo62062k4().CloneTo(c12007ixArr[i]);
        }
        return c12007ixArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6[] m48685k4(C13407to[] c13407toArr) {
        if (c13407toArr == null) {
            return null;
        }
        C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), c13407toArr.length));
        for (int i = 0; i < c13407toArr.length; i++) {
            c13407toArr[i].mo62092k4().CloneTo(c12025x6Arr[i]);
        }
        return c12025x6Arr;
    }
}
