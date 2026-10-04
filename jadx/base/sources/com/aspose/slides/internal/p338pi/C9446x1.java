package com.aspose.slides.internal.p338pi;

import com.aspose.slides.internal.p289n2.C6695m9;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;

/* JADX INFO: renamed from: com.aspose.slides.internal.pi.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C9446x1 {
    /* JADX INFO: renamed from: k4 */
    public static InterfaceC9443k4 m46238k4(int i, int i2, int i3, int[] iArr) {
        if (i == 2 && ((i2 == 1 || i2 == -1) && (i3 == 6 || i3 == -1 || i3 == 0))) {
            iArr[0] = 0;
            return new C9444kk();
        }
        if (i == 2 && i2 == 2 && i3 == 17) {
            iArr[0] = 0;
            return new C9445to();
        }
        iArr[0] = 10044;
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m46239k4(Selector selector) {
        try {
            selector.close();
        } catch (RuntimeException | Exception unused) {
        }
        for (SelectionKey selectionKey : selector.keys()) {
            C6695m9 c6695m9 = (C6695m9) selectionKey.attachment();
            selectionKey.cancel();
            if (c6695m9.m26483k4()) {
                c6695m9.m26482k4(true);
            }
        }
        try {
            selector.close();
        } catch (Exception unused2) {
        }
    }
}
