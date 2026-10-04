package com.aspose.slides.internal.p316of;

import com.aspose.slides.internal.p475wh.C12004dy;
import java.util.HashMap;

/* JADX INFO: renamed from: com.aspose.slides.internal.of.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C7033h4 {

    /* JADX INFO: renamed from: k4 */
    private static HashMap<Integer, C12004dy> f19148k4 = new HashMap<>(3);

    /* JADX INFO: renamed from: x1 */
    private static String[] f19151x1 = {"Helvetica", "Helv", "Arial", "MS Sans Serif", "Microsoft Sans Serif", "Pragmatica", "Swiss 721", "Nimbus Sans", "Nimbus Sans L", "CNN Sans", "FreeSans", "CG Triumvirate", "Liberation Sans", "Europa Grotesk", "Arial Narrow", "Arial Black"};

    /* JADX INFO: renamed from: kk */
    private static String[] f19149kk = {"Times New Roman", "Times", "Georgia", "Nimbus Roman", "Times Roman"};

    /* JADX INFO: renamed from: to */
    private static String[] f19150to = {"Courier New", "Courier", "Courier New Baltic", "Courier New CE", "Courier New Cyr", "Courier New Greek", "Courier New Tur", "Courier Final Draft", "Dark Courier", "Courier 10 Pitch BT", "Courier Prime", "Nimbus Mono L", "Nimbus Mono", "FreeMono", "Liberation Mono"};

    /* JADX INFO: renamed from: k4 */
    public static C12004dy m27486k4(int i) {
        if (!f19148k4.containsKey(Integer.valueOf(i))) {
            f19148k4.put(Integer.valueOf(i), m27487x1(i));
        }
        return f19148k4.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: x1 */
    private static C12004dy m27487x1(int i) {
        int i2 = 0;
        if (i == 0) {
            String[] strArr = f19149kk;
            int length = strArr.length;
            while (i2 < length) {
                C12004dy c12004dyM27502x1 = C7035kk.m27502x1(strArr[i2]);
                if (c12004dyM27502x1 != null) {
                    return c12004dyM27502x1;
                }
                i2++;
            }
            return null;
        }
        if (i != 1) {
            String[] strArr2 = f19150to;
            int length2 = strArr2.length;
            while (i2 < length2) {
                C12004dy c12004dyM27502x12 = C7035kk.m27502x1(strArr2[i2]);
                if (c12004dyM27502x12 != null) {
                    return c12004dyM27502x12;
                }
                i2++;
            }
            return null;
        }
        String[] strArr3 = f19151x1;
        int length3 = strArr3.length;
        while (i2 < length3) {
            C12004dy c12004dyM27502x13 = C7035kk.m27502x1(strArr3[i2]);
            if (c12004dyM27502x13 != null) {
                return c12004dyM27502x13;
            }
            i2++;
        }
        return null;
    }
}
