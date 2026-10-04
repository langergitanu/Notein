package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3083s7;
import com.aspose.slides.internal.p332p7.C9164x1;
import com.orion.notein.domain.models.backup.BackupEvent;

/* JADX INFO: loaded from: classes3.dex */
class bkf {
    /* JADX INFO: renamed from: k4 */
    public static void m4241k4(IChart iChart, C9164x1 c9164x1) {
        if (c9164x1 == null) {
            iChart.setStyle(1);
        } else {
            iChart.setStyle((!C3083s7.f9152k4.m12773k4("http://schemas.microsoft.com/office/drawing/2007/8/2/chart") || c9164x1.m44163to() == null) ? (c9164x1.m44162kk().m42004k4() & 255) - 1 : (c9164x1.m44163to().m28104k4() & 255) + BackupEvent.ERROR_INVALID_TOKEN);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m4242x1(IChart iChart, C9164x1 c9164x1) {
        c9164x1.m44164x1().m28105k4((byte) ((((byte) iChart.getStyle()) & 255) + 101));
        c9164x1.m44161k4().m42005k4((byte) ((((byte) iChart.getStyle()) & 255) + 1));
    }
}
