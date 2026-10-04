package com.aspose.slides.internal.p420th;

import Oooo0o0.C21009OooOooO;
import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.th.to */
/* JADX INFO: loaded from: classes4.dex */
public class C10969to extends AbstractC7020m9<C10969to> {

    /* JADX INFO: renamed from: k4 */
    private C12025x6 f38240k4;

    /* JADX INFO: renamed from: kk */
    private C12025x6 f38241kk;

    /* JADX INFO: renamed from: to */
    private C12025x6 f38242to;

    /* JADX INFO: renamed from: x1 */
    private C12025x6 f38243x1;

    public C10969to() {
        this.f38240k4 = new C12025x6();
        this.f38243x1 = new C12025x6();
        this.f38241kk = new C12025x6();
        this.f38242to = new C12025x6();
    }

    /* JADX INFO: renamed from: du */
    private boolean m53041du(C10969to c10969to) {
        return C14067j2.m66728k4(c10969to.f38240k4, this.f38240k4) && C14067j2.m66728k4(c10969to.f38243x1, this.f38243x1) && C14067j2.m66728k4(c10969to.f38241kk, this.f38241kk) && C14067j2.m66728k4(c10969to.f38242to, this.f38242to);
    }

    /* JADX INFO: renamed from: k4 */
    private static float m53042k4(float f, float f2) {
        return C21009OooOooO.OooO00o(f2, 2.0f, f, 3.0f);
    }

    /* JADX INFO: renamed from: kk */
    private static C10964lr m53045kk(C10969to c10969to) {
        C10964lr c10964lr = new C10964lr();
        c10964lr.m53012k4(c10969to.m53050k4().Clone());
        c10964lr.m53016x1(m53043k4(c10969to.m53057x1().Clone(), c10969to.m53053kk().Clone()).Clone());
        c10964lr.m53014kk(c10969to.m53055to().Clone());
        return c10964lr;
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C10969to) {
            return m53041du((C10969to) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: h4, reason: merged with bridge method [inline-methods] */
    public C10969to Clone() {
        C10969to c10969to = new C10969to();
        CloneTo(c10969to);
        return c10969to;
    }

    /* JADX INFO: renamed from: to */
    public final C12025x6 m53055to() {
        return this.f38242to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12025x6 m53057x1() {
        return this.f38243x1;
    }

    public C10969to(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63) {
        this.f38240k4 = new C12025x6();
        this.f38243x1 = new C12025x6();
        this.f38241kk = new C12025x6();
        this.f38242to = new C12025x6();
        c12025x6.CloneTo(this.f38240k4);
        this.f38243x1 = new C12025x6(m53042k4(c12025x6.m56897x1(), c12025x62.m56897x1()), m53042k4(c12025x6.m56895kk(), c12025x62.m56895kk()));
        this.f38241kk = new C12025x6(m53042k4(c12025x63.m56897x1(), c12025x62.m56897x1()), m53042k4(c12025x63.m56895kk(), c12025x62.m56895kk()));
        c12025x63.CloneTo(this.f38242to);
    }

    /* JADX INFO: renamed from: du */
    public final C10964lr[] m53048du() {
        return m53047x1(Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final C12025x6 m53050k4() {
        return this.f38240k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12025x6 m53053kk() {
        return this.f38241kk;
    }

    /* JADX INFO: renamed from: to */
    public final void m53056to(C12025x6 c12025x6) {
        c12025x6.CloneTo(this.f38242to);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53058x1(C12025x6 c12025x6) {
        c12025x6.CloneTo(this.f38243x1);
    }

    /* JADX INFO: renamed from: k4 */
    private static C12025x6 m53043k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        return new C12025x6((c12025x62.m56897x1() + c12025x6.m56897x1()) / 2.0f, (c12025x62.m56895kk() + c12025x6.m56895kk()) / 2.0f);
    }

    /* JADX INFO: renamed from: to */
    private static C10969to[] m53046to(C10969to c10969to) {
        C10969to[] c10969toArr = (C10969to[]) C22200OooO0o0.OooO00o(C10969to.class, 2);
        C12025x6 c12025x6Clone = m53043k4(c10969to.m53050k4().Clone(), c10969to.m53057x1().Clone()).Clone();
        C12025x6 c12025x6Clone2 = m53043k4(c10969to.m53057x1().Clone(), c10969to.m53053kk().Clone()).Clone();
        C12025x6 c12025x6Clone3 = m53043k4(c10969to.m53053kk().Clone(), c10969to.m53055to().Clone()).Clone();
        C12025x6 c12025x6Clone4 = m53043k4(c12025x6Clone.Clone(), c12025x6Clone2.Clone()).Clone();
        C12025x6 c12025x6Clone5 = m53043k4(c12025x6Clone2.Clone(), c12025x6Clone3.Clone()).Clone();
        C12025x6 c12025x6Clone6 = m53043k4(c12025x6Clone4.Clone(), c12025x6Clone5.Clone()).Clone();
        C10969to c10969to2 = new C10969to();
        c10969toArr[0] = c10969to2;
        c10969to2.m53052k4(c10969to.m53050k4().Clone());
        c10969toArr[0].m53058x1(c12025x6Clone.Clone());
        c10969toArr[0].m53054kk(c12025x6Clone4.Clone());
        c10969toArr[0].m53056to(c12025x6Clone6.Clone());
        C10969to c10969to3 = new C10969to();
        c10969toArr[1] = c10969to3;
        c10969to3.m53052k4(c12025x6Clone6.Clone());
        c10969toArr[1].m53058x1(c12025x6Clone5.Clone());
        c10969toArr[1].m53054kk(c12025x6Clone3.Clone());
        c10969toArr[1].m53056to(c10969to.m53055to().Clone());
        return c10969toArr;
    }

    /* JADX INFO: renamed from: x1 */
    private static C10964lr[] m53047x1(C10969to c10969to) {
        List list = new List();
        m53044k4(c10969to.Clone(), 4, list);
        C10964lr[] c10964lrArr = (C10964lr[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C10964lr.class), list.size()));
        for (int i = 0; i < list.size(); i++) {
            m53045kk(((C10969to) list.get_Item(i)).Clone()).CloneTo(c10964lrArr[i]);
        }
        return c10964lrArr;
    }

    /* JADX INFO: renamed from: kk */
    public final void m53054kk(C12025x6 c12025x6) {
        c12025x6.CloneTo(this.f38241kk);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C10969to c10969to) {
        this.f38240k4.CloneTo(c10969to.f38240k4);
        this.f38243x1.CloneTo(c10969to.f38243x1);
        this.f38241kk.CloneTo(c10969to.f38241kk);
        this.f38242to.CloneTo(c10969to.f38242to);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m53044k4(C10969to c10969to, int i, List<C10969to> list) {
        C10969to[] c10969toArrM53046to = m53046to(c10969to.Clone());
        int i2 = 0;
        if (i <= 2) {
            int length = c10969toArrM53046to.length;
            while (i2 < length) {
                list.addItem(c10969toArrM53046to[i2].Clone());
                i2++;
            }
            return;
        }
        int i3 = i / 2;
        int length2 = c10969toArrM53046to.length;
        while (i2 < length2) {
            m53044k4(c10969toArrM53046to[i2].Clone(), i3, list);
            i2++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53052k4(C12025x6 c12025x6) {
        c12025x6.CloneTo(this.f38240k4);
    }
}
