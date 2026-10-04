package com.aspose.slides.internal.p181ig;

import com.aspose.slides.Collections.Generic.List;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ig.m4 */
/* JADX INFO: loaded from: classes.dex */
public class C4847m4 extends List<C4861to> {
    /* JADX INFO: renamed from: k4 */
    public final boolean m20122k4() {
        if (size() == 0) {
            return true;
        }
        Iterator<C4861to> it = iterator();
        while (it.hasNext()) {
            if (!it.next().m20145x1()) {
                return false;
            }
        }
        return true;
    }
}
