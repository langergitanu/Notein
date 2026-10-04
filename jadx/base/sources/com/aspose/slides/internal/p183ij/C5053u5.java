package com.aspose.slides.internal.p183ij;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.u5 */
/* JADX INFO: loaded from: classes.dex */
public class C5053u5 extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private int f13872k4;

    /* JADX INFO: renamed from: kk */
    private int f13873kk;

    /* JADX INFO: renamed from: to */
    private int f13874to;

    /* JADX INFO: renamed from: x1 */
    private int f13875x1;

    public C5053u5(C5061vw c5061vw) {
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
        return m21506k4((C5053u5) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (((((((super.hashCode() * 397) ^ this.f13872k4) * 397) ^ this.f13875x1) * 397) ^ this.f13873kk) * 397) ^ this.f13874to;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m21504k4() {
        return this.f13872k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m21507kk() {
        return this.f13873kk;
    }

    /* JADX INFO: renamed from: to */
    public final int m21509to() {
        return this.f13874to;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, XNum: {1}, XDenom: {2}, YNum: {3}, YDenom: {4}", super.toString(), Integer.valueOf(m21504k4()), Integer.valueOf(m21511x1()), Integer.valueOf(m21507kk()), Integer.valueOf(m21509to()));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m21511x1() {
        return this.f13875x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21505k4(int i) {
        this.f13872k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m21508kk(int i) {
        this.f13873kk = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m21510to(int i) {
        this.f13874to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21512x1(int i) {
        this.f13875x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21506k4(C5053u5 c5053u5) {
        return m21559k4((C5061vw) c5053u5) && this.f13872k4 == c5053u5.f13872k4 && this.f13875x1 == c5053u5.f13875x1 && this.f13873kk == c5053u5.f13873kk && this.f13874to == c5053u5.f13874to;
    }
}
