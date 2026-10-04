package com.aspose.slides.internal.p416tb;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.internal.p082dg.AbstractC3158h4;
import com.aspose.slides.internal.p082dg.AbstractC3162x1;
import com.aspose.slides.internal.p082dg.C3159k4;
import com.aspose.slides.internal.p082dg.C3160kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tb.to */
/* JADX INFO: loaded from: classes4.dex */
public class C10911to extends AbstractC10914up implements InterfaceC10904kk {

    /* JADX INFO: renamed from: du */
    private String f37939du;

    /* JADX INFO: renamed from: k4 */
    private final C12007ix f37940k4;

    /* JADX INFO: renamed from: kk */
    private final AbstractC3158h4 f37941kk;

    /* JADX INFO: renamed from: to */
    private int f37942to;

    public C10911to(C10898dy c10898dy, C12007ix c12007ix, AbstractC3158h4 abstractC3158h4) {
        super(c10898dy);
        C12007ix c12007ixClone = C12007ix.f40519k4.Clone();
        this.f37940k4 = c12007ixClone;
        this.f37942to = -1;
        c12007ix.CloneTo(c12007ixClone);
        this.f37941kk = abstractC3158h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52521k4(int i) {
        this.f37942to = i;
    }

    @Override // com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        c10922yj.m52676k4(this);
        c10922yj.m52643dy();
        c10922yj.m52666kk("/Type", "/Annot");
        c10922yj.m52666kk("/Subtype", "/Link");
        int i = this.f37942to;
        if (i > -1) {
            c10922yj.m52652k4("/StructParent", i);
        }
        if (!C14113y2.m67411k4(this.f37939du)) {
            c10922yj.m52670to("/Contents", this.f37939du);
        }
        if (this.f37962x1.m52454fa()) {
            c10922yj.m52652k4("/F", 28);
        }
        c10922yj.m52654k4("/Rect", this.f37940k4.Clone());
        if (!this.f37962x1.m52464x1().m52610jd()) {
            c10922yj.m52666kk("/BS", "<</Type/Border/S/S/W 0>>");
        }
        AbstractC3158h4 abstractC3158h4 = this.f37941kk;
        if (abstractC3158h4 != null) {
            abstractC3158h4.mo13511k4(c10922yj);
        }
        c10922yj.m52640c5();
        c10922yj.m52678x1();
    }

    @Override // com.aspose.slides.internal.p416tb.InterfaceC10904kk
    /* JADX INFO: renamed from: k4 */
    public final void mo52501k4(C10922yj c10922yj, IGenericDictionary<String, C10895c5> iGenericDictionary, IGenericDictionary<String, C10895c5> iGenericDictionary2) {
        AbstractC3158h4 abstractC3158h4 = this.f37941kk;
        if (abstractC3158h4 != null) {
            AbstractC3162x1 abstractC3162x1 = (AbstractC3162x1) C7019kk.m27452k4((Object) abstractC3158h4, C3159k4.class);
            if (abstractC3162x1 != null) {
                abstractC3162x1.mo13513k4(iGenericDictionary2);
            }
            AbstractC3162x1 abstractC3162x12 = (AbstractC3162x1) C7019kk.m27452k4((Object) this.f37941kk, C3160kk.class);
            if (abstractC3162x12 != null) {
                abstractC3162x12.mo13513k4(iGenericDictionary);
            }
        }
        mo9082k4(c10922yj);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52522k4(String str) {
        this.f37939du = str;
    }
}
