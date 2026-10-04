package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class gau {
    /* JADX INFO: renamed from: k4 */
    public static String m6460k4(byte b) {
        return b != 1 ? (b == 2 || b == 3 || b == 7) ? "dashed" : b != 8 ? "solid" : "dotted" : "dotted";
    }

    /* JADX INFO: renamed from: k4 */
    public static String m6461k4(ILineFormatEffectiveData iLineFormatEffectiveData) {
        return (iLineFormatEffectiveData.getStyle() == -1 || iLineFormatEffectiveData.getFillFormat().getFillType() != 1) ? "" : C14113y2.m67402k4("{0}px {1} {2}", Double.valueOf(iLineFormatEffectiveData.getWidth()), m6460k4(iLineFormatEffectiveData.getDashStyle()), C1126fz.m6356k4(((erk) iLineFormatEffectiveData.getFillFormat()).m5654x1().Clone()));
    }
}
