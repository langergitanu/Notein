package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7016dy;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.u4 */
/* JADX INFO: loaded from: classes.dex */
public class C3958u4 {

    /* JADX INFO: renamed from: to */
    private static final C7016dy<Dictionary<String, C3958u4>> f10712to = new C7016dy<>(null);

    /* JADX INFO: renamed from: k4 */
    public final String f10713k4;

    /* JADX INFO: renamed from: kk */
    private C7187kk f10714kk;

    /* JADX INFO: renamed from: x1 */
    private byte[] f10715x1;

    public C3958u4(String str) {
        if (C14113y2.m67448x1(str, "/")) {
            throw new ArgumentException(C14113y2.m67402k4("Illegal operator '{0}'. Reason: Not allowed to start with '/'", str));
        }
        this.f10713k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public static C3958u4 m15658k4(String str) {
        if ("ID".equals(str) || "BI".equals(str)) {
            return new C3958u4(str);
        }
        C7016dy<Dictionary<String, C3958u4>> c7016dy = f10712to;
        Dictionary<String, C3958u4> dictionary = c7016dy.get();
        if (dictionary == null) {
            dictionary = new Dictionary<>();
            c7016dy.set(dictionary);
        }
        C3958u4[] c3958u4Arr = {null};
        boolean zTryGetValue = dictionary.tryGetValue(str, c3958u4Arr);
        C3958u4 c3958u4 = c3958u4Arr[0];
        if (zTryGetValue) {
            return c3958u4;
        }
        C3958u4 c3958u42 = new C3958u4(str);
        dictionary.addItem(str, c3958u42);
        return c3958u42;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m15659k4(C7187kk c7187kk) {
        this.f10714kk = c7187kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m15660k4(byte[] bArr) {
        this.f10715x1 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m15661k4() {
        return this.f10715x1;
    }
}
