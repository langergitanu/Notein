package com.aspose.slides.internal.p410sx;

import com.aspose.slides.internal.p167hh.AbstractC4584k4;
import com.aspose.slides.internal.p167hh.C4587x1;
import com.aspose.slides.p559ms.System.AbstractC14070jw;
import com.aspose.slides.p559ms.backend.System.Drawing.GraphicsEnv;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.aspose.slides.internal.sx.k4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10799k4 {
    /* JADX INFO: renamed from: k4 */
    public static String m52365k4(String str) {
        return str;
    }

    /* JADX INFO: renamed from: kk */
    private static AbstractC4584k4[] m52368kk(String str) {
        AbstractC4584k4 abstractC4584k4;
        AbstractC4584k4[] abstractC4584k4Arr = new AbstractC4584k4[4];
        for (int i = 0; i <= 3; i++) {
            abstractC4584k4Arr[i] = GraphicsEnv.m67573du().mo67579k4(str, str, 1.0f, i);
        }
        int i2 = 0;
        while (true) {
            if (i2 > 3) {
                abstractC4584k4 = null;
                break;
            }
            if (str.equals(abstractC4584k4Arr[i2].m18932k4())) {
                abstractC4584k4 = abstractC4584k4Arr[i2];
                break;
            }
            i2++;
        }
        if (abstractC4584k4 != null) {
            for (int i3 = 0; i3 <= 3; i3++) {
                if (!str.equals(abstractC4584k4Arr[i3].m18932k4())) {
                    abstractC4584k4Arr[i3] = abstractC4584k4.mo18931k4(i3);
                }
            }
        }
        return abstractC4584k4Arr;
    }

    /* JADX INFO: renamed from: x1 */
    private static C4587x1 m52369x1(String str) {
        C4587x1 c4587x1 = new C4587x1(str);
        for (AbstractC4584k4 abstractC4584k4 : m52368kk(str)) {
            c4587x1.m18948k4(abstractC4584k4);
        }
        return c4587x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static Map<String, C4587x1> m52366k4(Map<String, C4587x1> map) {
        TreeMap treeMap = new TreeMap(AbstractC14070jw.m66787k4());
        for (String str : map.keySet()) {
            if (str != null) {
                treeMap.put(str, m52369x1(str));
            }
        }
        return treeMap;
    }

    /* JADX INFO: renamed from: k4 */
    public static TreeMap<String, C4587x1> m52367k4() {
        return new TreeMap<>(AbstractC14070jw.m66787k4());
    }
}
