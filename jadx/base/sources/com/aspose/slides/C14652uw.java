package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p407st.C10469hn;
import com.aspose.slides.internal.p407st.C10483iu;
import com.aspose.slides.internal.p407st.C10591pk;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.internal.p407st.C10641ss;
import com.aspose.slides.internal.p407st.C10706x4;

/* JADX INFO: renamed from: com.aspose.slides.uw */
/* JADX INFO: loaded from: classes3.dex */
class C14652uw {

    /* JADX INFO: renamed from: c5 */
    private C10706x4 f49408c5;

    /* JADX INFO: renamed from: k4 */
    private Presentation f49412k4;

    /* JADX INFO: renamed from: kk */
    private final InterruptionToken f49413kk;

    /* JADX INFO: renamed from: x1 */
    private C10591pk f49416x1;

    /* JADX INFO: renamed from: to */
    private Dictionary<Integer, p7y> f49415to = new Dictionary<>();

    /* JADX INFO: renamed from: du */
    private SortedList<Integer, uki> f49409du = new SortedList<>();

    /* JADX INFO: renamed from: h4 */
    private SortedList<Integer, uki> f49411h4 = new SortedList<>();

    /* JADX INFO: renamed from: m9 */
    private Dictionary<PPImage, uki> f49414m9 = new Dictionary<>();

    /* JADX INFO: renamed from: dy */
    private Dictionary<Byte, tl4> f49410dy = new Dictionary<>();

    public C14652uw(C10591pk c10591pk, Presentation presentation, InterruptionToken interruptionToken) {
        this.f49416x1 = c10591pk;
        this.f49412k4 = presentation;
        this.f49413kk = interruptionToken;
        C10706x4 c10706x4 = new C10706x4();
        this.f49408c5 = c10706x4;
        c10706x4.m51407kk((short) 255);
    }

    /* JADX INFO: renamed from: c5 */
    public final SortedList<Integer, uki> m71939c5() {
        return this.f49409du;
    }

    /* JADX INFO: renamed from: ck */
    public final Dictionary<PPImage, uki> m71940ck() {
        return this.f49414m9;
    }

    /* JADX INFO: renamed from: du */
    public final byte[] m71941du() {
        return this.f49416x1.m51493x1();
    }

    /* JADX INFO: renamed from: dy */
    public final Dictionary<Integer, p7y> m71942dy() {
        return this.f49415to;
    }

    /* JADX INFO: renamed from: fa */
    public final Dictionary<Byte, tl4> m71943fa() {
        return this.f49410dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final C10469hn m71944h4() {
        return this.f49416x1.m51488kk();
    }

    /* JADX INFO: renamed from: jd */
    public final SortedList<Integer, uki> m71945jd() {
        return this.f49411h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final Presentation m71946k4() {
        return this.f49412k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C10483iu m71950kk() {
        return this.f49416x1.m51483du();
    }

    /* JADX INFO: renamed from: m9 */
    public final C10641ss m71951m9() {
        return m71950kk().m50965m9();
    }

    /* JADX INFO: renamed from: to */
    public final byte[] m71952to() {
        return this.f49416x1.m51487k4();
    }

    /* JADX INFO: renamed from: up */
    public final C10706x4 m71953up() {
        return this.f49408c5;
    }

    /* JADX INFO: renamed from: x1 */
    public final C10591pk m71954x1() {
        return this.f49416x1;
    }

    /* JADX INFO: renamed from: yj */
    public final InterruptionToken m71955yj() {
        return this.f49413kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final tl4 m71947k4(C10609qn c10609qn, byte b) {
        if (c10609qn == null) {
            return null;
        }
        tl4 tl4Var = this.f49410dy.containsKey(Byte.valueOf(b)) ? this.f49410dy.get_Item(Byte.valueOf(b)) : new tl4(b, this);
        tl4Var.m71721k4(c10609qn);
        return tl4Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final uki m71948k4(IPPImage iPPImage) {
        if (iPPImage == null) {
            return null;
        }
        PPImage pPImage = (PPImage) iPPImage;
        return (this.f49414m9.containsKey(pPImage) && this.f49414m9.get_Item(pPImage).m71717h4() == 1) ? this.f49414m9.get_Item(pPImage) : new uki(pPImage, 1, this);
    }

    /* JADX INFO: renamed from: k4 */
    public final uki m71949k4(C10609qn c10609qn, IPPImage iPPImage) {
        if (iPPImage == null || c10609qn == null) {
            return null;
        }
        PPImage pPImage = (PPImage) iPPImage;
        uki ukiVar = (this.f49414m9.containsKey(pPImage) && this.f49414m9.get_Item(pPImage).m71717h4() == 0) ? this.f49414m9.get_Item(pPImage) : new uki(pPImage, 0, this);
        ukiVar.m71721k4(c10609qn);
        return ukiVar;
    }
}
