package com.aspose.slides.internal.p205ji;

import com.aspose.slides.Collections.Generic.List;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.aspose.slides.internal.ji.rv */
/* JADX INFO: loaded from: classes.dex */
public class C5464rv {

    /* JADX INFO: renamed from: du */
    private static ThreadPoolExecutor f15030du = null;

    /* JADX INFO: renamed from: k4 */
    private static int f15033k4 = 500;

    /* JADX INFO: renamed from: kk */
    private static int f15034kk = 1000;

    /* JADX INFO: renamed from: to */
    private static int f15036to = 2;

    /* JADX INFO: renamed from: m9 */
    private static List<Future<?>> f15035m9 = new List<>();

    /* JADX INFO: renamed from: dy */
    private static AtomicBoolean f15031dy = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c5 */
    private static final Object f15029c5 = new Object();

    /* JADX INFO: renamed from: x1 */
    private static int f15037x1 = 2;

    /* JADX INFO: renamed from: h4 */
    private static C5474yd f15032h4 = new C5474yd(f15037x1);

    /* JADX INFO: renamed from: du */
    private static ThreadPoolExecutor m22541du() {
        if (f15030du == null) {
            int i = f15033k4;
            f15030du = new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        }
        return f15030du;
    }

    /* JADX INFO: renamed from: h4 */
    private static void m22542h4() {
        if (f15031dy.get()) {
            return;
        }
        f15031dy.set(true);
        new C5449c5(new C5462ne()).m22529du();
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m22545k4(int i, int i2) {
        f15037x1 = i;
        f15032h4.setCorePoolSize(i);
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m22546k4(AbstractC5448bv abstractC5448bv) {
        return m22547k4(abstractC5448bv, (Object) null);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m22547k4(AbstractC5448bv abstractC5448bv, Object obj) {
        synchronized (f15029c5) {
            f15035m9.add(m22541du().submit(new RunnableC5473x6(abstractC5448bv, obj)));
        }
        m22542h4();
        return true;
    }
}
