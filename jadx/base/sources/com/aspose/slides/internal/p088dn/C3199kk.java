package com.aspose.slides.internal.p088dn;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* JADX INFO: renamed from: com.aspose.slides.internal.dn.kk */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class C3199kk {
    /* JADX INFO: renamed from: k4 */
    private static <V> V m13776k4(Class<V> cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        if (Number.class.isAssignableFrom(cls)) {
            return cls.getConstructor(Integer.TYPE).newInstance(0);
        }
        if (AbstractC7020m9.class.isAssignableFrom(cls)) {
            return cls.newInstance();
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static <K, V> boolean m13777k4(Map<K, V> map, K k, V[] vArr) {
        boolean zContainsKey = map.containsKey(k);
        if (zContainsKey) {
            vArr[0] = map.get(k);
            return zContainsKey;
        }
        try {
            vArr[0] = m13776k4(vArr.getClass().getComponentType());
            return zContainsKey;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
