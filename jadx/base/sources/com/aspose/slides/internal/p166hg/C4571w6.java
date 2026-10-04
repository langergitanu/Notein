package com.aspose.slides.internal.p166hg;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hg.w6 */
/* JADX INFO: loaded from: classes.dex */
public class C4571w6 {

    /* JADX INFO: renamed from: k4 */
    static Hashtable f12783k4 = new Hashtable();

    /* JADX INFO: renamed from: x1 */
    static final Object f12784x1 = new Object();

    /* JADX INFO: renamed from: k4 */
    private static C4552os m18905k4(AbstractC4523ai abstractC4523ai, boolean z) {
        byte[] bArrM18630c5;
        if (abstractC4523ai == null || (bArrM18630c5 = abstractC4523ai.m18630c5()) == null || bArrM18630c5.length == 0) {
            return null;
        }
        String strM66770k4 = C14069jd.m66770k4(bArrM18630c5);
        C4552os c4552os = (C4552os) f12783k4.get_Item(strM66770k4);
        if (c4552os == null || !C14113y2.m67363du(abstractC4523ai.m18639fa().m18835k4(), c4552os.m18824k4())) {
            return null;
        }
        if (!z || c4552os.m18826kk()) {
            return c4552os;
        }
        c4552os.dispose();
        f12783k4.removeItem(strM66770k4);
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m18909x1(AbstractC4523ai abstractC4523ai) {
        synchronized (f12784x1) {
            try {
                C4552os c4552osM18905k4 = m18905k4(abstractC4523ai, true);
                if (c4552osM18905k4 == null) {
                    return false;
                }
                c4552osM18905k4.m18828x1(abstractC4523ai);
                c4552osM18905k4.m18827to();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m18906k4(String str, byte[] bArr) {
        Hashtable hashtable;
        C4552os c4552os;
        synchronized (f12784x1) {
            try {
                String strM66770k4 = C14069jd.m66770k4(bArr);
                C4552os c4552os2 = (C4552os) f12783k4.get_Item(strM66770k4);
                if (c4552os2 == null) {
                    hashtable = f12783k4;
                    c4552os = new C4552os(str, bArr);
                } else if (C14113y2.m67363du(c4552os2.m18824k4(), str)) {
                    c4552os2.m18827to();
                } else {
                    c4552os2.dispose();
                    f12783k4.removeItem(strM66770k4);
                    hashtable = f12783k4;
                    c4552os = new C4552os(str, bArr);
                }
                hashtable.addItem(strM66770k4, c4552os);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m18907k4(AbstractC4523ai abstractC4523ai) {
        synchronized (f12784x1) {
            try {
                C4552os c4552osM18905k4 = m18905k4(abstractC4523ai, false);
                if (c4552osM18905k4 == null) {
                    return false;
                }
                c4552osM18905k4.m18825k4(abstractC4523ai);
                c4552osM18905k4.m18827to();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m18908k4(String str) {
        synchronized (f12784x1) {
            try {
                for (C4552os c4552os : f12783k4.getValues()) {
                    if (C14113y2.m67363du(c4552os.m18824k4(), str) && c4552os.m18826kk()) {
                        c4552os.m18827to();
                        return c4552os.m18829x1();
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
