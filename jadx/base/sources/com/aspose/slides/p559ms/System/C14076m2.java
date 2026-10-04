package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.NullReferenceException;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.m2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14076m2 {
    /* JADX INFO: renamed from: k4 */
    public static C14077m4 m66792k4(TimeZone timeZone, C14084qq c14084qq) {
        if (timeZone != null) {
            return C14077m4.m66794du(c14084qq.m67127du() == 1 ? 0 : timeZone.getOffset(c14084qq.m67132ix()));
        }
        throw new NullReferenceException();
    }
}
