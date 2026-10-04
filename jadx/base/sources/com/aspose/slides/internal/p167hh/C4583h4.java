package com.aspose.slides.internal.p167hh;

import com.aspose.slides.internal.p347px.AbstractC9608yj;
import com.aspose.slides.internal.p347px.C9579bv;
import com.aspose.slides.internal.p347px.C9591ks;
import com.aspose.slides.internal.p347px.C9592lr;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.aspose.slides.internal.hh.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C4583h4 {
    /* JADX INFO: renamed from: k4 */
    public static int m18921k4(String str) {
        int i = str.contains("Italic") ? 2 : 0;
        return str.contains("Bold") ? i | 1 : i;
    }

    /* JADX INFO: renamed from: k4 */
    public static Map<String, Map<Integer, C9579bv>> m18922k4(AbstractC9608yj abstractC9608yj) {
        HashMap map = new HashMap();
        C9592lr c9592lr = new C9592lr();
        C9591ks[] c9591ksArrM46871k4 = c9592lr.m46871k4(abstractC9608yj);
        if (c9591ksArrM46871k4 != null) {
            for (C9591ks c9591ks : c9591ksArrM46871k4) {
                if (c9591ks != null) {
                    C9579bv c9579bvM46869k4 = c9592lr.m46869k4(c9591ks.m46850kk(), c9591ks.m46852x1());
                    Map map2 = (Map) map.get(c9579bvM46869k4.m46778k4());
                    if (map2 == null) {
                        map2 = new HashMap();
                        map.put(c9579bvM46869k4.m46778k4(), map2);
                    }
                    map2.put(Integer.valueOf(c9579bvM46869k4.m46770h4()), c9579bvM46869k4);
                }
            }
        }
        return map;
    }
}
