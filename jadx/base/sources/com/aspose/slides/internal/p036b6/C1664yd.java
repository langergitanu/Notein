package com.aspose.slides.internal.p036b6;

import com.aspose.slides.Collections.Generic.Dictionary;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.yd */
/* JADX INFO: loaded from: classes3.dex */
public class C1664yd extends C1634k4 {
    public C1664yd(long j, long j2, long j3) {
        super("hhea", j, j2, j3);
        m9045h4();
    }

    /* JADX INFO: renamed from: h4 */
    public final void m9045h4() {
        Dictionary<String, Integer> dictionary = new Dictionary<>();
        this.f6308h4 = dictionary;
        dictionary.addItem("version", 6);
        this.f6308h4.addItem("ascent", 2);
        this.f6308h4.addItem("descent", 2);
        this.f6308h4.addItem("lineGap", 2);
        this.f6308h4.addItem("advanceWidthMax", 3);
        this.f6308h4.addItem("minLeftSideBearing", 2);
        this.f6308h4.addItem("minRightSideBearing", 2);
        this.f6308h4.addItem("xMaxExtent", 2);
        this.f6308h4.addItem("caretSlopeRise", 2);
        this.f6308h4.addItem("caretSlopeRun", 2);
        this.f6308h4.addItem("caretOffset", 2);
        this.f6308h4.addItem("reserved0", 2);
        this.f6308h4.addItem("reserved1", 2);
        this.f6308h4.addItem("reserved2", 2);
        this.f6308h4.addItem("reserved3", 2);
        this.f6308h4.addItem("metricDataFormat", 2);
        this.f6308h4.addItem("numOfLongHorMetrics", 3);
    }

    public C1664yd(Dictionary<String, Object> dictionary) {
        super("hhea");
        m9045h4();
        this.f6307dy = dictionary;
    }
}
