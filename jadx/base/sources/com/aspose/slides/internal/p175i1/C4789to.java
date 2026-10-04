package com.aspose.slides.internal.p175i1;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.google.firebase.messaging.Constants;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.aspose.slides.internal.i1.to */
/* JADX INFO: loaded from: classes.dex */
class C4789to {

    /* JADX INFO: renamed from: k4 */
    private static final HashMap<Integer, WeakReference<Object>> f13374k4 = new HashMap<>();

    /* JADX INFO: renamed from: x1 */
    private static final Object f13377x1 = new Object();

    /* JADX INFO: renamed from: kk */
    private static int f13375kk = 0;

    /* JADX INFO: renamed from: to */
    private static BigInteger f13376to = BigInteger.ZERO;

    /* JADX INFO: renamed from: du */
    private static long f13373du = 0;

    /* JADX INFO: renamed from: k4 */
    public static int m19854k4(Object obj) {
        if (obj != null) {
            return m19855k4((WeakReference<Object>) new WeakReference(obj)).intValue();
        }
        throw new ArgumentNullException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
    }

    /* JADX INFO: renamed from: kk */
    private static int m19859kk() {
        int i = f13375kk;
        f13375kk = i == Integer.MAX_VALUE ? 0 : i + 1;
        return f13375kk;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m19860x1() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, WeakReference<Object>> entry : f13374k4.entrySet()) {
            if (entry.getValue().get() == null) {
                arrayList.add(entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f13374k4.remove((Integer) it.next());
        }
        f13373du = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: k4 */
    private static Integer m19855k4(WeakReference<Object> weakReference) {
        Integer numValueOf;
        HashMap<Integer, WeakReference<Object>> map;
        synchronized (f13377x1) {
            try {
                if (m19858k4()) {
                    m19860x1();
                }
                do {
                    numValueOf = Integer.valueOf(m19859kk());
                    map = f13374k4;
                } while (map.containsKey(numValueOf));
                map.put(numValueOf, weakReference);
                f13376to = f13376to.add(BigInteger.ONE);
            } catch (Throwable th) {
                throw th;
            }
        }
        return numValueOf;
    }

    /* JADX INFO: renamed from: k4 */
    public static Object m19856k4(int i) {
        synchronized (f13377x1) {
            try {
                HashMap<Integer, WeakReference<Object>> map = f13374k4;
                WeakReference<Object> weakReference = map.get(Integer.valueOf(i));
                if (weakReference == null) {
                    return null;
                }
                Object obj = weakReference.get();
                if (obj == null) {
                    map.remove(Integer.valueOf(i));
                }
                return obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m19857k4(Integer num) {
        synchronized (f13377x1) {
            f13374k4.remove(num);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m19858k4() {
        return f13374k4.size() > 100 && System.currentTimeMillis() - f13373du > 100;
    }
}
