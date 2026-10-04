package com.aspose.slides.internal.p268m7;

import com.aspose.slides.internal.p316of.C7035kk;
import com.aspose.slides.internal.p475wh.C12004dy;
import java.util.HashMap;

/* JADX INFO: renamed from: com.aspose.slides.internal.m7.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C6326kk {

    /* JADX INFO: renamed from: k4 */
    private static HashMap<Integer, C12004dy> f17993k4 = new HashMap<>(3);

    /* JADX INFO: renamed from: k4 */
    public static C12004dy m25892k4(int i) {
        if (!f17993k4.containsKey(Integer.valueOf(i))) {
            f17993k4.put(Integer.valueOf(i), m25893x1(i));
        }
        return f17993k4.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: x1 */
    private static C12004dy m25893x1(int i) {
        return C7035kk.m27502x1(i != 0 ? i != 1 ? "Courier New" : "Microsoft Sans Serif" : "Times New Roman");
    }
}
