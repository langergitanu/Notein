package com.aspose.slides.internal.p243l6;

import java.util.HashMap;

/* JADX INFO: renamed from: com.aspose.slides.internal.l6.dy */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC6002dy {
    Hidden(1),
    Maximized(3),
    Minimized(2),
    Normal(0);


    /* JADX INFO: renamed from: h4 */
    private static HashMap<Integer, EnumC6002dy> f16942h4;

    /* JADX INFO: renamed from: du */
    private int f16948du;

    EnumC6002dy(int i) {
        this.f16948du = i;
        m24238k4().put(Integer.valueOf(i), this);
    }

    /* JADX INFO: renamed from: k4 */
    private static synchronized HashMap<Integer, EnumC6002dy> m24238k4() {
        try {
            if (f16942h4 == null) {
                f16942h4 = new HashMap<>();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f16942h4;
    }
}
