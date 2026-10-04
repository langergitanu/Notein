package com.aspose.slides.internal.p183ij;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.sq */
/* JADX INFO: loaded from: classes.dex */
public class C5041sq extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private int f13838k4;

    /* JADX INFO: renamed from: kk */
    private int f13839kk;

    /* JADX INFO: renamed from: to */
    private int f13840to;

    /* JADX INFO: renamed from: x1 */
    private int f13841x1;

    public C5041sq(C5061vw c5061vw) {
        super(c5061vw);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m21433k4((C5041sq) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (((((((super.hashCode() * 397) ^ this.f13838k4) * 397) ^ this.f13841x1) * 397) ^ this.f13839kk) * 397) ^ this.f13840to;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m21431k4() {
        return this.f13838k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m21434kk() {
        return this.f13839kk;
    }

    /* JADX INFO: renamed from: to */
    public final int m21436to() {
        return this.f13840to;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, XNum: {1}, XDenom: {2}, YNum: {3}, YDenom: {4}", super.toString(), Integer.valueOf(m21431k4()), Integer.valueOf(m21438x1()), Integer.valueOf(m21434kk()), Integer.valueOf(m21436to()));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m21438x1() {
        return this.f13841x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21432k4(int i) {
        this.f13838k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m21435kk(int i) {
        this.f13839kk = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m21437to(int i) {
        this.f13840to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21439x1(int i) {
        this.f13841x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21433k4(C5041sq c5041sq) {
        return m21559k4((C5061vw) c5041sq) && this.f13838k4 == c5041sq.f13838k4 && this.f13841x1 == c5041sq.f13841x1 && this.f13839kk == c5041sq.f13839kk && this.f13840to == c5041sq.f13840to;
    }
}
