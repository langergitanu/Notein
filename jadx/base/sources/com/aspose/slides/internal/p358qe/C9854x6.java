package com.aspose.slides.internal.p358qe;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.aspose.slides.internal.qe.x6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9854x6 {

    /* JADX INFO: renamed from: k4 */
    private static final Map<Integer, AbstractC14068j5> f35676k4 = new HashMap();

    /* JADX INFO: renamed from: k4 */
    public static AbstractC14068j5 m48598k4(Class<?> cls) {
        AbstractC14068j5 c9855yj;
        if (cls == null) {
            throw new ArgumentNullException("aClass", "Class should be not null");
        }
        int iHashCode = cls.hashCode();
        Map<Integer, AbstractC14068j5> map = f35676k4;
        synchronized (map) {
            try {
                c9855yj = map.get(Integer.valueOf(iHashCode));
                if (c9855yj == null) {
                    c9855yj = new C9855yj(cls);
                    map.put(Integer.valueOf(iHashCode), c9855yj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9855yj;
    }
}
