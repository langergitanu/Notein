package com.aspose.slides.internal.p085dk;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.p559ms.System.C14113y2;
import java.io.InputStream;

/* JADX INFO: renamed from: com.aspose.slides.internal.dk.c5 */
/* JADX INFO: loaded from: classes3.dex */
public class C3168c5 {
    /* JADX INFO: renamed from: k4 */
    public static InputStream m13536k4(Class cls, String str) {
        return cls.getResourceAsStream(str);
    }

    /* JADX INFO: renamed from: x1 */
    public static AbstractC3150x6 m13537x1(Class cls, String str) {
        String strReplace = str.replace("/Aspose/Foundation/Resources/", "");
        InputStream inputStreamM13536k4 = m13536k4(cls, strReplace);
        if (inputStreamM13536k4 != null) {
            return AbstractC3150x6.fromJava(inputStreamM13536k4);
        }
        throw new IllegalStateException(C14113y2.m67402k4("Cannot find resource '{0}'.", strReplace));
    }
}
