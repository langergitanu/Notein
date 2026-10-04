package com.aspose.slides.exceptions;

import com.aspose.slides.internal.p242l0.C5999k4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class InvalidPrinterException extends SystemException {
    public InvalidPrinterException(C5999k4 c5999k4) {
        super(m5745k4(c5999k4));
    }

    /* JADX INFO: renamed from: k4 */
    private static String m5745k4(C5999k4 c5999k4) {
        return (c5999k4.m24230k4() == null || C14113y2.m67363du(c5999k4.m24230k4(), C14113y2.f47374k4)) ? "No Printers Installed" : C14113y2.m67402k4("Tried to access printer '{0}' with invalid settings.", c5999k4.m24230k4());
    }

    public InvalidPrinterException(String str) {
        super(C14113y2.m67402k4(str, new Object[0]));
    }
}
