package com.aspose.slides.internal.p418tf;

import com.aspose.slides.internal.p229ki.C5688d4;
import com.aspose.slides.internal.p229ki.C5738tq;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.tf.kk */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10928kk {
    /* JADX INFO: renamed from: k4 */
    public static AbstractC10928kk m52701k4(String str) {
        return m52702k4(str, null);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo23219k4(C13950o3 c13950o3);

    /* JADX INFO: renamed from: k4 */
    public static AbstractC10928kk m52702k4(String str, InterfaceC13980t6 interfaceC13980t6) {
        boolean[] zArr = {false};
        C5688d4 c5688d4 = new C5688d4(new C5738tq().m23339k4(str, zArr), str, zArr[0]);
        if (interfaceC13980t6 != null) {
            c5688d4.m23220k4(interfaceC13980t6);
        }
        return c5688d4;
    }
}
