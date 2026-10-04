package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.v4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6781v4 {

    /* JADX INFO: renamed from: k4 */
    private static Object f18750k4 = new Object();

    /* JADX INFO: renamed from: x1 */
    private static volatile AbstractC6781v4[] f18751x1;

    /* JADX INFO: renamed from: x1 */
    public static AbstractC6747ar m26837x1(int i) {
        if (f18751x1 == null) {
            m26836k4(C6775to.m26826k4());
        }
        for (AbstractC6781v4 abstractC6781v4 : f18751x1) {
            AbstractC6747ar abstractC6747arMo26829k4 = abstractC6781v4.mo26829k4(i);
            if (abstractC6747arMo26829k4 != null) {
                return abstractC6747arMo26829k4;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC6747ar mo26829k4(int i);

    /* JADX INFO: renamed from: k4 */
    public AbstractC6747ar m26841k4(int i, AbstractC6769ne abstractC6769ne, AbstractC6751c5 abstractC6751c5) {
        AbstractC6747ar abstractC6747arMo26829k4 = mo26829k4(i);
        if (abstractC6747arMo26829k4 == null) {
            return abstractC6747arMo26829k4;
        }
        AbstractC6747ar abstractC6747ar = (AbstractC6747ar) mo26829k4(i).deepClone();
        abstractC6747ar.m26669k4(abstractC6769ne);
        abstractC6747ar.m26667k4(abstractC6751c5);
        return abstractC6747ar;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC6747ar mo26830k4(String str);

    /* JADX INFO: renamed from: x1 */
    public static AbstractC6747ar m26838x1(int i, AbstractC6769ne abstractC6769ne, AbstractC6751c5 abstractC6751c5) {
        if (f18751x1 == null) {
            m26836k4(C6775to.m26826k4());
        }
        for (AbstractC6781v4 abstractC6781v4 : f18751x1) {
            AbstractC6747ar abstractC6747arM26841k4 = abstractC6781v4.m26841k4(i, abstractC6769ne, abstractC6751c5);
            if (abstractC6747arM26841k4 != null) {
                return abstractC6747arM26841k4;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC6747ar m26842k4(String str, AbstractC6769ne abstractC6769ne, AbstractC6751c5 abstractC6751c5) {
        AbstractC6747ar abstractC6747arMo26830k4 = mo26830k4(str);
        if (abstractC6747arMo26830k4 == null) {
            return abstractC6747arMo26830k4;
        }
        AbstractC6747ar abstractC6747ar = (AbstractC6747ar) mo26830k4(str).deepClone();
        abstractC6747ar.m26669k4(abstractC6769ne);
        abstractC6747ar.m26667k4(abstractC6751c5);
        return abstractC6747ar;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m26836k4(AbstractC6781v4 abstractC6781v4) {
        if (abstractC6781v4 == null) {
            throw new ArgumentNullException("provider");
        }
        synchronized (f18750k4) {
            try {
                if (f18751x1 == null) {
                    f18751x1 = new AbstractC6781v4[]{abstractC6781v4};
                } else if (AbstractC14092to.m67201k4(f18751x1, abstractC6781v4) < 0) {
                    int length = f18751x1.length;
                    AbstractC6781v4[] abstractC6781v4Arr = new AbstractC6781v4[length + 1];
                    AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) f18751x1), AbstractC14092to.m67208k4((Object) abstractC6781v4Arr), f18751x1.length);
                    abstractC6781v4Arr[length] = abstractC6781v4;
                    f18751x1 = abstractC6781v4Arr;
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static AbstractC6747ar m26839x1(String str) {
        if (f18751x1 == null) {
            m26836k4(C6775to.m26826k4());
        }
        for (AbstractC6781v4 abstractC6781v4 : f18751x1) {
            AbstractC6747ar abstractC6747arMo26830k4 = abstractC6781v4.mo26830k4(str);
            if (abstractC6747arMo26830k4 != null) {
                return abstractC6747arMo26830k4;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public static AbstractC6747ar m26840x1(String str, AbstractC6769ne abstractC6769ne, AbstractC6751c5 abstractC6751c5) {
        if (f18751x1 == null) {
            m26836k4(C6775to.m26826k4());
        }
        for (AbstractC6781v4 abstractC6781v4 : f18751x1) {
            AbstractC6747ar abstractC6747arM26842k4 = abstractC6781v4.m26842k4(str, abstractC6769ne, abstractC6751c5);
            if (abstractC6747arM26842k4 != null) {
                return abstractC6747arM26842k4;
            }
        }
        return null;
    }
}
