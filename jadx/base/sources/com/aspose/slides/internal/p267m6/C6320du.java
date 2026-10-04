package com.aspose.slides.internal.p267m6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.m6.du */
/* JADX INFO: loaded from: classes4.dex */
public class C6320du extends AbstractC7020m9<C6320du> {

    /* JADX INFO: renamed from: du */
    private String f17970du;

    /* JADX INFO: renamed from: h4 */
    private List<String> f17971h4;

    /* JADX INFO: renamed from: k4 */
    private String f17972k4;

    /* JADX INFO: renamed from: kk */
    private String f17973kk;

    /* JADX INFO: renamed from: m9 */
    private int f17974m9;

    /* JADX INFO: renamed from: to */
    private String f17975to;

    /* JADX INFO: renamed from: x1 */
    private String f17976x1;

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
        if (obj instanceof C6320du) {
            return m25878x1((C6320du) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25879k4() {
        this.f17974m9 = 0;
        this.f17970du = null;
    }

    /* JADX INFO: renamed from: kk */
    public final String m25882kk() {
        int i = this.f17974m9;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? C14113y2.m67408k4(this.f17971h4.toArray(new String[0])) : C14113y2.m67408k4(this.f17972k4, this.f17976x1, this.f17973kk, this.f17975to) : C14113y2.m67408k4(this.f17972k4, this.f17976x1, this.f17973kk) : C14113y2.m67408k4(this.f17972k4, this.f17976x1) : this.f17972k4 : C14113y2.f47374k4;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] */
    public C6320du Clone() {
        C6320du c6320du = new C6320du();
        CloneTo(c6320du);
        return c6320du;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m25884x1() {
        return this.f17974m9;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m25878x1(C6320du c6320du) {
        return C14067j2.m66728k4(c6320du.f17972k4, this.f17972k4) && C14067j2.m66728k4(c6320du.f17976x1, this.f17976x1) && C14067j2.m66728k4(c6320du.f17973kk, this.f17973kk) && C14067j2.m66728k4(c6320du.f17975to, this.f17975to) && C14067j2.m66728k4(c6320du.f17970du, this.f17970du) && C14067j2.m66728k4(c6320du.f17971h4, this.f17971h4) && c6320du.f17974m9 == this.f17974m9;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C6320du c6320du) {
        if (c6320du == null) {
            c6320du = new C6320du();
        }
        c6320du.f17972k4 = this.f17972k4;
        c6320du.f17976x1 = this.f17976x1;
        c6320du.f17973kk = this.f17973kk;
        c6320du.f17975to = this.f17975to;
        c6320du.f17970du = this.f17970du;
        c6320du.f17971h4 = this.f17971h4;
        c6320du.f17974m9 = this.f17974m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25881k4(String str) {
        int i = this.f17974m9;
        if (i == 0) {
            this.f17972k4 = str;
        } else if (i == 1) {
            this.f17976x1 = str;
        } else if (i == 2) {
            this.f17973kk = str;
        } else if (i != 3) {
            if (i == 4) {
                List<String> list = this.f17971h4;
                List<String> list2 = new List<>(list == null ? 8 : list.size());
                this.f17971h4 = list2;
                list2.addItem(this.f17972k4);
                list2.addItem(this.f17976x1);
                list2.addItem(this.f17973kk);
                list2.addItem(this.f17975to);
            }
            this.f17971h4.addItem(str);
        } else {
            this.f17975to = str;
        }
        this.f17974m9++;
    }
}
