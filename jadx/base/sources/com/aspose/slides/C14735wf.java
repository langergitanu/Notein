package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.p559ms.System.AbstractC14070jw;

/* JADX INFO: renamed from: com.aspose.slides.wf */
/* JADX INFO: loaded from: classes3.dex */
final class C14735wf {

    /* JADX INFO: renamed from: kk */
    private static final Dictionary<String, C14735wf> f49792kk;

    /* JADX INFO: renamed from: k4 */
    private int f49793k4;

    /* JADX INFO: renamed from: x1 */
    private int f49794x1;

    static {
        Dictionary<String, C14735wf> dictionary = new Dictionary<>(AbstractC14070jw.m66790x1());
        f49792kk = dictionary;
        dictionary.addItem("arial black", new C14735wf(1, 0));
        dictionary.addItem("arial narrow bold", new C14735wf(0, 1));
        dictionary.addItem("franklin gothic medium", new C14735wf(1, 0));
        dictionary.addItem("aharoni", new C14735wf(0, 1));
        dictionary.addItem("Berlin Sans FB Demi", new C14735wf(0, 1));
        dictionary.addItem("Harlow Solid Italic", new C14735wf(0, 2));
    }

    private C14735wf(int i, int i2) {
        this.f49793k4 = ~i;
        this.f49794x1 = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m72694k4(String str, int i) {
        if (str != null) {
            C14735wf[] c14735wfArr = {null};
            f49792kk.tryGetValue(str, c14735wfArr);
            C14735wf c14735wf = c14735wfArr[0];
            if (c14735wf != null) {
                return c14735wf.f49794x1 | (i & c14735wf.f49793k4);
            }
        }
        return i;
    }
}
