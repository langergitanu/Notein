package com.aspose.slides.internal.p167hh;

import com.aspose.slides.internal.p347px.AbstractC9608yj;
import com.aspose.slides.internal.p347px.C9579bv;
import com.aspose.slides.internal.p347px.C9581ck;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.aspose.slides.internal.hh.du */
/* JADX INFO: loaded from: classes.dex */
public class C4582du {

    /* JADX INFO: renamed from: k4 */
    private final Map<String, k4> f12795k4 = new LinkedHashMap();

    /* JADX INFO: renamed from: com.aspose.slides.internal.hh.du$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public Map<String, Map<Integer, C9579bv>> f12796k4;

        public k4(Map<String, Map<Integer, C9579bv>> map) {
            this.f12796k4 = map;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public C9579bv m18918k4(String str, int i, AbstractC9608yj abstractC9608yj) {
        C9579bv next;
        Map<Integer, C9579bv> map = m18920k4(abstractC9608yj).get(str);
        if (map != null) {
            next = map.get(Integer.valueOf(i));
            if (next == null) {
                next = map.values().iterator().next();
            }
        } else {
            next = null;
        }
        if (next != null) {
            return next;
        }
        throw new IllegalArgumentException("Not corresponding Font found");
    }

    /* JADX INFO: renamed from: k4 */
    public Collection<String> m18919k4() {
        return this.f12795k4.keySet();
    }

    /* JADX INFO: renamed from: k4 */
    public Map<String, Map<Integer, C9579bv>> m18920k4(AbstractC9608yj abstractC9608yj) {
        k4 k4Var;
        C9581ck c9581ck = abstractC9608yj instanceof C9581ck ? (C9581ck) abstractC9608yj : null;
        if (c9581ck != null && (k4Var = this.f12795k4.get(c9581ck.m46810k4())) != null) {
            return k4Var.f12796k4;
        }
        Map<String, Map<Integer, C9579bv>> mapM18922k4 = C4583h4.m18922k4(abstractC9608yj);
        if (c9581ck != null) {
            this.f12795k4.put(c9581ck.m46810k4(), new k4(mapM18922k4));
        }
        return mapM18922k4;
    }
}
