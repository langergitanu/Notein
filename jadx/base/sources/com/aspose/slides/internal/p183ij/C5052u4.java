package com.aspose.slides.internal.p183ij;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p075d5.AbstractC3024x1;
import com.aspose.slides.internal.p100e4.C3569ks;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14088s7;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.u4 */
/* JADX INFO: loaded from: classes.dex */
public class C5052u4 extends C5019ne {

    /* JADX INFO: renamed from: du */
    private long f13866du;

    /* JADX INFO: renamed from: h4 */
    private AbstractC3024x1 f13867h4;

    /* JADX INFO: renamed from: k4 */
    private int f13868k4;

    /* JADX INFO: renamed from: kk */
    private long f13869kk;

    /* JADX INFO: renamed from: to */
    private int f13870to;

    /* JADX INFO: renamed from: x1 */
    private short f13871x1;

    public C5052u4(C5019ne c5019ne) {
        super(c5019ne);
        m21310x1(c5019ne.m21309x1());
        m21308kk(c5019ne.m21307kk());
    }

    /* JADX INFO: renamed from: c5 */
    public final long m21491c5() {
        return this.f13866du;
    }

    /* JADX INFO: renamed from: du */
    public final void m21492du(long j) {
        this.f13866du = j;
    }

    /* JADX INFO: renamed from: dy */
    public final int m21493dy() {
        return this.f13870to;
    }

    @Override // com.aspose.slides.internal.p183ij.C5019ne, com.aspose.slides.internal.p183ij.C4996ix, com.aspose.slides.internal.p183ij.C5061vw
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
        return m21501k4((C5052u4) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final short m21494h4() {
        return this.f13871x1;
    }

    @Override // com.aspose.slides.internal.p183ij.C5019ne, com.aspose.slides.internal.p183ij.C4996ix, com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((((((((((super.hashCode() * 397) ^ (this.f13868k4 & 65535)) * 397) ^ C14088s7.m67172k4(this.f13871x1)) * 397) ^ ((int) this.f13869kk)) * 397) ^ this.f13870to) * 397) ^ ((int) this.f13866du)) * 397;
        AbstractC3024x1 abstractC3024x1 = this.f13867h4;
        return iHashCode ^ (abstractC3024x1 != null ? abstractC3024x1.hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final AbstractC3024x1 m21495jd() {
        return this.f13867h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m21496k4() {
        return this.f13868k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m21502m9() {
        return this.f13869kk;
    }

    @Override // com.aspose.slides.internal.p183ij.C5019ne, com.aspose.slides.internal.p183ij.C4996ix, com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Version: {1}, Reserved: {2}, Checksum: {3}, Flags: {4}, WinMetafileSize: {5}, WinMetafile: {6}", super.toString(), C14042ak.m66410k4(C3569ks.class, m21496k4()), Short.valueOf(m21494h4()), Long.valueOf(m21502m9()), Integer.valueOf(m21493dy()), Long.valueOf(m21491c5()), m21495jd());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21503x1(int i) {
        if (i != 0) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f13870to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21497k4(int i) {
        this.f13868k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21498k4(long j) {
        this.f13869kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21499k4(AbstractC3024x1 abstractC3024x1) {
        this.f13867h4 = abstractC3024x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21500k4(short s) {
        if (s != 0) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f13871x1 = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21501k4(C5052u4 c5052u4) {
        return m21306k4((C5019ne) c5052u4) && this.f13868k4 == c5052u4.f13868k4 && this.f13871x1 == c5052u4.f13871x1 && this.f13869kk == c5052u4.f13869kk && this.f13870to == c5052u4.f13870to && this.f13866du == c5052u4.f13866du && C14067j2.m66728k4(this.f13867h4, c5052u4.f13867h4);
    }
}
