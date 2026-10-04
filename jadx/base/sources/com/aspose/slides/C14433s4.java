package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14067j2;
import java.util.Comparator;

/* JADX INFO: renamed from: com.aspose.slides.s4 */
/* JADX INFO: loaded from: classes3.dex */
class C14433s4 implements Comparator<C13847mr> {
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final int compare(C13847mr c13847mr, C13847mr c13847mr2) {
        if (C14067j2.m66729x1(c13847mr, c13847mr2)) {
            return 0;
        }
        if (C14067j2.m66729x1(null, c13847mr2)) {
            return 1;
        }
        if (C14067j2.m66729x1(null, c13847mr)) {
            return -1;
        }
        if (C14067j2.m66729x1(c13847mr.m64945h4(), c13847mr2.m64945h4())) {
            return 0;
        }
        if (C14067j2.m66729x1(null, c13847mr2.m64945h4())) {
            return 1;
        }
        if (C14067j2.m66729x1(null, c13847mr.m64945h4())) {
            return -1;
        }
        return C14057f9.m66580k4(c13847mr.m64945h4().getOrder(), c13847mr2.m64945h4().getOrder());
    }
}
