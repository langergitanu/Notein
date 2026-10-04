package com.aspose.slides.internal.p294n9;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.ne */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6769ne {

    /* JADX INFO: renamed from: k4 */
    private static AtomicReference<AbstractC6769ne> f18703k4 = new AtomicReference<>();

    /* JADX INFO: renamed from: x1 */
    private static AtomicReference<AbstractC6769ne> f18704x1 = new AtomicReference<>();

    /* JADX INFO: renamed from: kk */
    public static AbstractC6769ne m26820kk() {
        if (f18703k4.get() == null) {
            f18703k4.set(new C6782wl());
        }
        return f18703k4.get();
    }

    /* JADX INFO: renamed from: to */
    public static AbstractC6769ne m26821to() {
        if (f18704x1.get() == null) {
            f18704x1.set(new C6772rv());
        }
        return f18704x1.get();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC6761ix mo26736k4();

    /* JADX INFO: renamed from: x1 */
    public abstract int mo26737x1();
}
