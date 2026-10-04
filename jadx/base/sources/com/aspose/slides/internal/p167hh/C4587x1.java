package com.aspose.slides.internal.p167hh;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.aspose.slides.internal.hh.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C4587x1 {

    /* JADX INFO: renamed from: k4 */
    private final String f12809k4;

    /* JADX INFO: renamed from: x1 */
    private final Map<Integer, AbstractC4584k4> f12810x1 = new HashMap();

    public C4587x1(String str) {
        this.f12809k4 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f12809k4.equals(((C4587x1) obj).f12809k4);
    }

    public int hashCode() {
        return this.f12809k4.hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4584k4 m18946k4(int i, boolean z) {
        AbstractC4584k4 next;
        AbstractC4584k4 abstractC4584k4 = this.f12810x1.get(Integer.valueOf(i));
        if (abstractC4584k4 != null) {
            return abstractC4584k4;
        }
        if (z) {
            return null;
        }
        Iterator<Map.Entry<Integer, AbstractC4584k4>> it = this.f12810x1.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                Map.Entry<Integer, AbstractC4584k4> next2 = it.next();
                if ((next2.getKey().intValue() | i) == i) {
                    next = next2.getValue();
                    break;
                }
            } else {
                Iterator<AbstractC4584k4> it2 = this.f12810x1.values().iterator();
                if (!it2.hasNext()) {
                    return null;
                }
                next = it2.next();
            }
        }
        return next;
    }

    /* JADX INFO: renamed from: kk */
    public int m18949kk() {
        return this.f12810x1.size();
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC4584k4[] m18950x1() {
        return (AbstractC4584k4[]) this.f12810x1.values().toArray(new AbstractC4584k4[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public String m18947k4() {
        return this.f12809k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m18948k4(AbstractC4584k4 abstractC4584k4) {
        this.f12810x1.put(Integer.valueOf(abstractC4584k4.m18936to()), abstractC4584k4);
    }
}
