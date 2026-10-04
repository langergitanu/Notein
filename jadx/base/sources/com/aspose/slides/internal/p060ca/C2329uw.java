package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Hashtable;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.uw */
/* JADX INFO: loaded from: classes3.dex */
public class C2329uw {

    /* JADX INFO: renamed from: x1 */
    private Object f8071x1 = new Object();

    /* JADX INFO: renamed from: k4 */
    private Hashtable f8070k4 = new Hashtable();

    /* JADX INFO: renamed from: k4 */
    public final C2254q3 m11542k4(String str) {
        if (this.f8070k4.containsKey(str)) {
            return (C2254q3) this.f8070k4.get_Item(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11543k4(String str, String[] strArr) {
        if (this.f8070k4.containsKey(str)) {
            return;
        }
        synchronized (this.f8071x1) {
            try {
                if (!this.f8070k4.containsKey(str)) {
                    C2254q3 c2254q3 = new C2254q3();
                    for (int i = 0; i < strArr.length; i++) {
                        c2254q3.m11260k4(i, strArr[i]);
                    }
                    this.f8070k4.addItem(str, c2254q3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
