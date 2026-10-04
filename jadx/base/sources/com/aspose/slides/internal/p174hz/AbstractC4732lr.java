package com.aspose.slides.internal.p174hz;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p525yi.C12820ck;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.lr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4732lr extends AbstractC4703bz {

    /* JADX INFO: renamed from: dy */
    private C12820ck f13198dy;

    /* JADX INFO: renamed from: h4 */
    private String f13199h4;

    /* JADX INFO: renamed from: m9 */
    private AbstractC4705c6 f13201m9;

    /* JADX INFO: renamed from: k4 */
    private boolean f13200k4 = false;

    /* JADX INFO: renamed from: c5 */
    private int f13197c5 = 64;

    /* JADX INFO: renamed from: jd */
    public static AbstractC4732lr m19671jd() {
        return m19673x1(C4764wy.class.getName());
    }

    /* JADX INFO: renamed from: x1 */
    public static AbstractC4732lr m19673x1(String str) {
        return (AbstractC4732lr) C4756up.m19759k4(str);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: c5 */
    public void mo18846c5() {
        if (this.f13200k4) {
            throw new ObjectDisposedException("HMAC");
        }
        this.f13127to = 0;
        m19677m9().m59611k4();
        byte[] bArrM19672k4 = m19672k4(mo19575h4(), PatternStyle.DiagonalCross);
        this.f13201m9.mo18846c5();
        m19677m9().m59612k4(bArrM19672k4);
        AbstractC14092to.m67225k4(bArrM19672k4, 0, bArrM19672k4.length);
    }

    /* JADX INFO: renamed from: du */
    public int m19674du() {
        return this.f13197c5;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: dy */
    public byte[] mo18847dy() {
        if (this.f13200k4) {
            throw new ObjectDisposedException("HMAC");
        }
        this.f13127to = 0;
        m19677m9().m59614x1();
        byte[] bArrM19584fa = this.f13201m9.m19584fa();
        byte[] bArrM19672k4 = m19672k4(mo19575h4(), (byte) 92);
        this.f13201m9.mo18846c5();
        this.f13201m9.mo19562k4(bArrM19672k4, 0, bArrM19672k4.length, bArrM19672k4, 0);
        this.f13201m9.mo19564k4(bArrM19584fa, 0, bArrM19584fa.length);
        byte[] bArrM19584fa2 = this.f13201m9.m19584fa();
        this.f13201m9.mo18846c5();
        AbstractC14092to.m67225k4(bArrM19672k4, 0, bArrM19672k4.length);
        AbstractC14092to.m67225k4(bArrM19584fa, 0, bArrM19584fa.length);
        return bArrM19584fa2;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4703bz
    /* JADX INFO: renamed from: h4 */
    public byte[] mo19575h4() {
        return (byte[]) super.mo19575h4().clone();
    }

    /* JADX INFO: renamed from: k4 */
    public void m19675k4(int i) {
        this.f13197c5 = i;
    }

    /* JADX INFO: renamed from: m9 */
    public C12820ck m19677m9() {
        if (this.f13198dy == null) {
            this.f13198dy = new C12820ck(this.f13201m9, m19674du() >> 3);
        }
        return this.f13198dy;
    }

    /* JADX INFO: renamed from: k4 */
    public void m19676k4(String str) {
        this.f13199h4 = str;
        this.f13201m9 = AbstractC4705c6.m19582kk(str);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: x1 */
    public void mo18849x1(byte[] bArr, int i, int i2) {
        if (this.f13200k4) {
            throw new ObjectDisposedException("HMACSHA1");
        }
        if (this.f13127to == 0) {
            mo18846c5();
            this.f13127to = 1;
        }
        m19677m9().m59613k4(bArr, i, i2);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4703bz, com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: k4 */
    public void mo19576k4(boolean z) {
        if (this.f13200k4) {
            return;
        }
        super.mo19576k4(z);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4703bz
    /* JADX INFO: renamed from: k4 */
    public void mo19577k4(byte[] bArr) {
        if (bArr == null || bArr.length <= m19674du()) {
            super.mo19577k4((byte[]) bArr.clone());
        } else {
            super.mo19577k4(this.f13201m9.m19588x1(bArr));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m19672k4(byte[] bArr, byte b) {
        byte[] bArr2 = new byte[m19674du()];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) ((bArr[i] & 255) ^ (b & 255));
        }
        for (int length = bArr.length; length < m19674du(); length++) {
            bArr2[length] = b;
        }
        return bArr2;
    }
}
