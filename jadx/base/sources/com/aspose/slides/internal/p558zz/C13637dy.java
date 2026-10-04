package com.aspose.slides.internal.p558zz;

import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.p080dd.C3148wl;

/* JADX INFO: renamed from: com.aspose.slides.internal.zz.dy */
/* JADX INFO: loaded from: classes5.dex */
public class C13637dy extends C13641m9 {
    private C13637dy(C13637dy c13637dy, int i) {
        super(c13637dy, i);
    }

    /* JADX INFO: renamed from: fa */
    public static C13637dy m62959fa(int i) {
        AbstractC13639k4 c13636du;
        if (i > 0) {
            c13636du = new C13638h4(i);
            c13636du.m62981x1(i);
        } else {
            c13636du = new C13636du();
        }
        return new C13637dy(c13636du);
    }

    /* JADX INFO: renamed from: du */
    public final int m62960du(int i, int i2) {
        this.f45324k4.m62977k4(i, (byte) (i2 & 255));
        this.f45324k4.m62977k4(i + 1, (byte) ((i2 >> 8) & 255));
        return 2;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m62961k4(int i, byte b) {
        this.f45324k4.m62977k4(m63015k4(i), b);
        return 1;
    }

    /* JADX INFO: renamed from: kk */
    public final int m62966kk(int i, long j) {
        return m62962k4(i, j);
    }

    /* JADX INFO: renamed from: to */
    public final int m62968to(int i, int i2) {
        m62961k4(i, (byte) ((i2 >> 8) & 255));
        m62961k4(i + 1, (byte) (i2 & 255));
        return 2;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m62969x1(int i, long j) {
        this.f45324k4.m62977k4(i, (byte) (j & 255));
        this.f45324k4.m62977k4(i + 1, (byte) ((j >> 8) & 255));
        this.f45324k4.m62977k4(i + 2, (byte) ((j >> 16) & 255));
        this.f45324k4.m62977k4(i + 3, (byte) ((j >> 24) & 255));
        return 4;
    }

    private C13637dy(C13637dy c13637dy, int i, int i2) {
        super(c13637dy, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m62962k4(int i, long j) {
        m62961k4(i, (byte) ((j >> 24) & 255));
        m62961k4(i + 1, (byte) ((j >> 16) & 255));
        m62961k4(i + 2, (byte) ((j >> 8) & 255));
        m62961k4(i + 3, (byte) (j & 255));
        return 4;
    }

    @Override // com.aspose.slides.internal.p558zz.C13641m9
    /* JADX INFO: renamed from: kk */
    public AbstractC13643x1 mo62967kk(int i, int i2) {
        if (i < 0 || i + i2 > m63017x1()) {
            throw new IndexOutOfRangeException("Attempt to bind data outside of its limits.");
        }
        return new C13637dy(this, i, i2);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m62970x1(int i, byte[] bArr, int i2, int i3) {
        return this.f45324k4.m62982x1(m63015k4(i), bArr, i2, m63018x1(i, i3));
    }

    private C13637dy(AbstractC13639k4 abstractC13639k4) {
        super(abstractC13639k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m62963k4(int i, byte[] bArr) {
        return m62970x1(i, bArr, 0, bArr.length);
    }

    @Override // com.aspose.slides.internal.p558zz.C13641m9
    /* JADX INFO: renamed from: x1 */
    public AbstractC13643x1 mo62971x1(int i) {
        if (i < 0 || i > m63017x1()) {
            throw new IndexOutOfRangeException("Attempt to bind data outside of its limits.");
        }
        return new C13637dy(this, i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62964k4(C3148wl c3148wl) {
        this.f45324k4.m62978k4(c3148wl);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62965k4(C3148wl c3148wl, int i) {
        this.f45324k4.m62979k4(c3148wl, i);
    }
}
