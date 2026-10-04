package com.aspose.slides.internal.p532yu;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.dl */
/* JADX INFO: loaded from: classes5.dex */
public class C12948dl extends AbstractC7020m9<C12948dl> {

    /* JADX INFO: renamed from: k4 */
    public int f43529k4;

    /* JADX INFO: renamed from: x1 */
    public Object f43530x1;

    public C12948dl() {
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m60238x1(C12948dl c12948dl) {
        return c12948dl.f43529k4 == this.f43529k4 && C14067j2.m66728k4(c12948dl.f43530x1, this.f43530x1);
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
        if (obj instanceof C12948dl) {
            return m60238x1((C12948dl) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C12948dl Clone() {
        C12948dl c12948dl = new C12948dl();
        CloneTo(c12948dl);
        return c12948dl;
    }

    public C12948dl(int i, Object obj) {
        this.f43529k4 = i;
        this.f43530x1 = obj;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C12948dl c12948dl) {
        if (c12948dl == null) {
            c12948dl = new C12948dl();
        }
        c12948dl.f43529k4 = this.f43529k4;
        c12948dl.f43530x1 = this.f43530x1;
    }
}
