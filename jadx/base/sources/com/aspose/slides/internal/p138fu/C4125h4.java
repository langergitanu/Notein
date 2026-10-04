package com.aspose.slides.internal.p138fu;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p131fi.C3997k4;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p274mh.C6385kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.fu.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C4125h4 {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<String, C12004dy> f11290k4 = new Dictionary<>();

    static {
        for (C12004dy c12004dy : new C6385kk().m26211k4()) {
            f11290k4.set_Item(c12004dy.m56527du(), c12004dy);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int m16497k4(C12004dy c12004dy, int i) {
        if (c12004dy.m56529h4(i)) {
            return i;
        }
        if (i == 1 || i == 2) {
            if (c12004dy.m56529h4(3)) {
                return 3;
            }
        } else if (i == 3) {
            if (c12004dy.m56529h4(2)) {
                return 2;
            }
            if (c12004dy.m56529h4(1)) {
                return 1;
            }
        }
        if (c12004dy.m56529h4(0)) {
            return 0;
        }
        if (c12004dy.m56529h4(1)) {
            return 1;
        }
        if (c12004dy.m56529h4(2)) {
            return 2;
        }
        if (c12004dy.m56529h4(3)) {
            return 3;
        }
        throw new InvalidOperationException("No fonts of this family are available.");
    }

    /* JADX INFO: renamed from: x1 */
    private static C12004dy m16502x1(String str) {
        C12004dy[] c12004dyArr = {null};
        f11290k4.tryGetValue(str, c12004dyArr);
        return c12004dyArr[0];
    }

    /* JADX INFO: renamed from: k4 */
    private static C12004dy m16498k4() {
        Dictionary.ValueCollection.Enumerator<String, C12004dy> it = f11290k4.getValues().iterator();
        try {
            if (it.hasNext()) {
                return it.next();
            }
            if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                return null;
            }
            it.dispose();
            return null;
        } finally {
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C12004dy m16499k4(String str) {
        C12004dy c12004dyM16502x1 = m16502x1(str);
        if (c12004dyM16502x1 == null) {
            c12004dyM16502x1 = m16502x1("Times New Roman");
        }
        if (c12004dyM16502x1 == null) {
            c12004dyM16502x1 = m16498k4();
        }
        if (c12004dyM16502x1 != null) {
            return c12004dyM16502x1;
        }
        throw new InvalidOperationException("No fonts are installed on the system.");
    }

    /* JADX INFO: renamed from: k4 */
    public static C12013m9 m16500k4(C5659x1 c5659x1, C4126jd c4126jd) {
        if (!C3997k4.m15793x1().mo15795k4(c5659x1)) {
            try {
                C12004dy c12004dyM16507k4 = c4126jd.m16507k4(c5659x1);
                if (c12004dyM16507k4 != null) {
                    return new C12013m9(c12004dyM16507k4, c5659x1.m23114dy(), m16497k4(c12004dyM16507k4, c5659x1.m23125x1()), 3);
                }
            } catch (RuntimeException unused) {
            }
        }
        return m16501k4(c5659x1.m23123m9(), c5659x1.m23114dy(), c5659x1.m23125x1());
    }

    /* JADX INFO: renamed from: k4 */
    public static C12013m9 m16501k4(String str, float f, int i) {
        try {
            return new C12013m9(str, f, i, 3);
        } catch (RuntimeException unused) {
            C12004dy c12004dyM16499k4 = m16499k4(str);
            return new C12013m9(c12004dyM16499k4.m56527du(), f, m16497k4(c12004dyM16499k4, i), 3);
        }
    }
}
