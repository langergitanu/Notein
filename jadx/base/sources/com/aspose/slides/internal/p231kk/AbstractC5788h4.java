package com.aspose.slides.internal.p231kk;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.kk.h4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5788h4 {

    /* JADX INFO: renamed from: k4 */
    private final short f15857k4;

    public AbstractC5788h4(short s) {
        this.f15857k4 = s;
    }

    public boolean equals(Object obj) {
        return mo23416k4((AbstractC5788h4) C7019kk.m27452k4(obj, AbstractC5788h4.class));
    }

    /* JADX INFO: renamed from: h4 */
    public abstract String mo23414h4();

    /* JADX INFO: renamed from: k4 */
    public abstract void mo23415k4(String str);

    /* JADX INFO: renamed from: k4 */
    public boolean mo23416k4(AbstractC5788h4 abstractC5788h4) {
        if (C14067j2.m66729x1(null, abstractC5788h4)) {
            return false;
        }
        return C14067j2.m66729x1(this, abstractC5788h4) || this.f15857k4 == abstractC5788h4.f15857k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final short m23417m9() {
        return this.f15857k4;
    }

    public String toString() {
        return mo23414h4();
    }
}
