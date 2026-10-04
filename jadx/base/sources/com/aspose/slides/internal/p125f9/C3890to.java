package com.aspose.slides.internal.p125f9;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p393s7.C10163x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.f9.to */
/* JADX INFO: loaded from: classes.dex */
public class C3890to extends AbstractC3886k4 {

    /* JADX INFO: renamed from: kk */
    private static final int[] f10622kk = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 0, 600, 0, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 0, 600, 0, 0, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 0, 600, 600, 0, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 0, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600, 600};

    /* JADX INFO: renamed from: x1 */
    private static final List<String> f10623x1;

    /* JADX INFO: renamed from: to */
    private C10163x1 f10624to;

    static {
        List<String> list = new List<>();
        f10623x1 = list;
        list.addItem("Courier");
    }

    public C3890to() {
        this(false);
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: du */
    public int mo15564du(int i) {
        return i * 439;
    }

    @Override // com.aspose.slides.internal.p393s7.AbstractC10164x6
    /* JADX INFO: renamed from: k4 */
    public int mo15566k4(int i) {
        m49988h4();
        int iM49941k4 = this.f10624to.m49941k4(i);
        if (iM49941k4 != 0) {
            return iM49941k4;
        }
        m49989h4(i);
        return 35;
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: kk */
    public int mo15570kk(int i) {
        return i * 562;
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: to */
    public int mo15572to(int i) {
        return i * (-142);
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: x1 */
    public int mo15574x1(int i) {
        return i * 626;
    }

    public C3890to(boolean z) {
        this.f10624to = C10163x1.m49987k4("WinAnsiEncoding");
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: du */
    public Dictionary<Integer, Dictionary<Integer, Integer>> mo15565du() {
        return new Dictionary<>();
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: k4 */
    public int mo15567k4(int i, int i2) {
        return i2 * f10622kk[i];
    }

    @Override // com.aspose.slides.internal.p393s7.AbstractC10164x6
    /* JADX INFO: renamed from: kk */
    public String mo15571kk() {
        return "Courier Bold";
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: to */
    public boolean mo15573to() {
        return false;
    }

    @Override // com.aspose.slides.internal.p393s7.AbstractC10164x6, com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: x1 */
    public String mo15575x1() {
        return "Courier-Bold";
    }

    @Override // com.aspose.slides.internal.p393s7.AbstractC10164x6
    /* JADX INFO: renamed from: k4 */
    public String mo15568k4() {
        return "WinAnsiEncoding";
    }

    @Override // com.aspose.slides.internal.p393s7.AbstractC10164x6
    /* JADX INFO: renamed from: k4 */
    public boolean mo15569k4(char c) {
        return this.f10624to.m49941k4(c) > 0;
    }
}
