package com.aspose.slides.internal.p036b6;

import com.aspose.slides.Collections.Generic.Dictionary;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C1638lr extends C1634k4 {
    public C1638lr(long j, long j2, long j3) {
        super("head", j, j2, j3);
        m8889h4();
    }

    /* JADX INFO: renamed from: h4 */
    public final void m8889h4() {
        Dictionary<String, Integer> dictionary = new Dictionary<>();
        this.f6308h4 = dictionary;
        dictionary.addItem("version", 6);
        this.f6308h4.addItem("fontRevision", 6);
        this.f6308h4.addItem("checkSumAdjustment", 5);
        this.f6308h4.addItem("magickNumber", 5);
        this.f6308h4.addItem("flags", 3);
        this.f6308h4.addItem("unitsPerEm", 3);
        this.f6308h4.addItem("created", 9);
        this.f6308h4.addItem("modified", 9);
        this.f6308h4.addItem("xMin", 2);
        this.f6308h4.addItem("yMin", 2);
        this.f6308h4.addItem("xMax", 2);
        this.f6308h4.addItem("yMax", 2);
        this.f6308h4.addItem("macStyle", 3);
        this.f6308h4.addItem("lowestRecPPEM", 3);
        this.f6308h4.addItem("fontDirectionHint", 2);
        this.f6308h4.addItem("indexToLocFormat", 2);
        this.f6308h4.addItem("glyphDataFormat", 2);
    }

    public C1638lr(Dictionary<String, Object> dictionary) {
        super("head");
        m8889h4();
        this.f6307dy = dictionary;
    }
}
