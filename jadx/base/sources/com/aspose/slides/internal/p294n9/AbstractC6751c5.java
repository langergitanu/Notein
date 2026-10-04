package com.aspose.slides.internal.p294n9;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.c5 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6751c5 {

    /* JADX INFO: renamed from: k4 */
    private static AtomicReference<AbstractC6751c5> f18636k4 = new AtomicReference<>();

    /* JADX INFO: renamed from: x1 */
    private static AtomicReference<AbstractC6751c5> f18637x1 = new AtomicReference<>();

    /* JADX INFO: renamed from: kk */
    public static AbstractC6751c5 m26732kk() {
        AbstractC6751c5 abstractC6751c5 = f18636k4.get();
        if (abstractC6751c5 != null) {
            return abstractC6751c5;
        }
        f18636k4.set(new C6758fa());
        AbstractC6751c5 abstractC6751c52 = f18636k4.get();
        return abstractC6751c52 != null ? abstractC6751c52 : f18636k4.get();
    }

    /* JADX INFO: renamed from: to */
    public static AbstractC6751c5 m26733to() {
        AbstractC6751c5 abstractC6751c5 = f18637x1.get();
        if (abstractC6751c5 != null) {
            return abstractC6751c5;
        }
        f18637x1.set(new C6768m9());
        AbstractC6751c5 abstractC6751c52 = f18637x1.get();
        return abstractC6751c52 != null ? abstractC6751c52 : f18637x1.get();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC6762jd mo26734k4();

    /* JADX INFO: renamed from: x1 */
    public abstract int mo26735x1();
}
