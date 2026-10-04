package com.aspose.slides.internal.p539z4;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.bz */
/* JADX INFO: loaded from: classes5.dex */
public class C13363bz extends AbstractC13405sv {

    /* JADX INFO: renamed from: k4 */
    private int f44724k4;

    /* JADX INFO: renamed from: kk */
    private int f44725kk;

    /* JADX INFO: renamed from: x1 */
    private int f44726x1;

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
        return m62049k4((C13363bz) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 12;
    }

    public int hashCode() {
        return (((m62047k4() * 397) ^ m62052x1()) * 397) ^ m62050kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m62047k4() {
        return this.f44724k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m62050kk() {
        return this.f44725kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m62052x1() {
        return this.f44726x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62048k4(int i) {
        this.f44724k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m62051kk(int i) {
        this.f44725kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62053x1(int i) {
        this.f44726x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62049k4(C13363bz c13363bz) {
        return m62047k4() == c13363bz.m62047k4() && m62052x1() == c13363bz.m62052x1() && m62050kk() == c13363bz.m62050kk();
    }
}
