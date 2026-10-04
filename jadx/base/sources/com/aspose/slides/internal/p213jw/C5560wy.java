package com.aspose.slides.internal.p213jw;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p149gf.C4256k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p435u5.C11284k4;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14089ss;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.wy */
/* JADX INFO: loaded from: classes.dex */
public class C5560wy implements InterfaceC14089ss<C5560wy> {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<String, C5560wy> f15311k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private static final Dictionary<String, C5560wy> f15312x1 = new Dictionary<>();

    /* JADX INFO: renamed from: du */
    private final boolean f15313du;

    /* JADX INFO: renamed from: h4 */
    private final boolean f15314h4;

    /* JADX INFO: renamed from: kk */
    private final String f15315kk;

    /* JADX INFO: renamed from: to */
    private final String f15316to;

    static {
        for (String str : C4256k4.k4.f11566k4) {
            C5560wy c5560wy = new C5560wy(C14113y2.m67361du(C14113y2.m67440x1(str)), true, true);
            f15311k4.addItem(c5560wy.m22852x1(), c5560wy);
        }
    }

    private C5560wy(String str, boolean z, boolean z2) {
        this.f15315kk = str;
        this.f15316to = C14113y2.m67371jd(str);
        this.f15313du = z;
        this.f15314h4 = z2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C5560wy m22847k4(String str) {
        C5560wy c5560wy;
        C11284k4.m54244k4((Object) str, "name");
        C5560wy[] c5560wyArr = {null};
        Dictionary<String, C5560wy> dictionary = f15311k4;
        boolean zTryGetValue = dictionary.tryGetValue(str, c5560wyArr);
        C5560wy c5560wy2 = c5560wyArr[0];
        if (zTryGetValue) {
            return c5560wy2;
        }
        c5560wyArr[0] = c5560wy2;
        Dictionary<String, C5560wy> dictionary2 = f15312x1;
        boolean zTryGetValue2 = dictionary2.tryGetValue(str, c5560wyArr);
        C5560wy c5560wy3 = c5560wyArr[0];
        if (zTryGetValue2) {
            return c5560wy3;
        }
        String strM67361du = C14113y2.m67361du(C14113y2.m67440x1(str));
        C11284k4.m54245k4(strM67361du, "name");
        c5560wyArr[0] = c5560wy3;
        boolean zTryGetValue3 = dictionary.tryGetValue(strM67361du, c5560wyArr);
        C5560wy c5560wy4 = c5560wyArr[0];
        if (zTryGetValue3) {
            return c5560wy4;
        }
        c5560wyArr[0] = c5560wy4;
        boolean zTryGetValue4 = dictionary2.tryGetValue(strM67361du, c5560wyArr);
        C5560wy c5560wy5 = c5560wyArr[0];
        if (zTryGetValue4) {
            return c5560wy5;
        }
        synchronized (dictionary2) {
            try {
                c5560wyArr[0] = c5560wy5;
                boolean zTryGetValue5 = dictionary2.tryGetValue(strM67361du, c5560wyArr);
                c5560wy = c5560wyArr[0];
                if (!zTryGetValue5) {
                    c5560wy = new C5560wy(strM67361du, false, false);
                    dictionary2.addItem(strM67361du, c5560wy);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5560wy;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14089ss
    public boolean equals(Object obj) {
        return m22850k4((C5560wy) C7019kk.m27452k4(obj, C5560wy.class));
    }

    public int hashCode() {
        return (((this.f15315kk.hashCode() * 31) + (this.f15313du ? 1 : 0)) * 31) + (this.f15314h4 ? 1 : 0);
    }

    /* JADX INFO: renamed from: kk */
    public final String m22851kk() {
        return this.f15316to;
    }

    public String toString() {
        return this.f15315kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m22852x1() {
        return this.f15315kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m22848k4() {
        return this.f15313du;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m22849k4(C5543ix c5543ix) {
        return m22850k4(c5543ix.m22719to());
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m22850k4(C5560wy c5560wy) {
        return C14067j2.m66729x1(this, c5560wy);
    }
}
