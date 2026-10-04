package com.aspose.slides.internal.p313oa;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.ix */
/* JADX INFO: loaded from: classes4.dex */
public class C6990ix {

    /* JADX INFO: renamed from: k4 */
    private C3134k4 f19009k4;

    public C6990ix(AbstractC3150x6 abstractC3150x6) {
        abstractC3150x6.setPosition(0L);
        this.f19009k4 = new C3134k4(abstractC3150x6);
    }

    /* JADX INFO: renamed from: h4 */
    private static int m27344h4(int i) {
        byte[] bArrM66775k4 = C14069jd.m66775k4(i);
        return C7019kk.m27457kk(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(bArrM66775k4[1]), 6) | (C7019kk.m27462to(Byte.valueOf(bArrM66775k4[0]), 6) << 8)), 9);
    }

    /* JADX INFO: renamed from: du */
    public long m27347du() {
        return this.f19009k4.m13371ck().getPosition();
    }

    /* JADX INFO: renamed from: k4 */
    public byte m27349k4() {
        return this.f19009k4.m13387yj();
    }

    /* JADX INFO: renamed from: kk */
    public long m27352kk() {
        return m27346x1(this.f19009k4.m13384uz());
    }

    /* JADX INFO: renamed from: to */
    public long m27354to() {
        return m27345kk(this.f19009k4.m13385wl());
    }

    /* JADX INFO: renamed from: x1 */
    public int m27356x1() {
        return m27344h4(this.f19009k4.m13382u4());
    }

    /* JADX INFO: renamed from: kk */
    private static long m27345kk(long j) {
        byte[] bArrM66780kk = C14069jd.m66780kk(j);
        AbstractC14092to.m67248to(AbstractC14092to.m67208k4((Object) bArrM66780kk));
        return C14069jd.m66779kk(bArrM66780kk, 0);
    }

    /* JADX INFO: renamed from: x1 */
    private static long m27346x1(long j) {
        byte[] bArrM66776k4 = C14069jd.m66776k4(j);
        AbstractC14092to.m67248to(AbstractC14092to.m67208k4((Object) bArrM66776k4));
        return C14069jd.m66784x1(bArrM66776k4, 0);
    }

    /* JADX INFO: renamed from: du */
    public long[] m27348du(int i) {
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = m27352kk();
        }
        return jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public void m27350k4(long j) {
        this.f19009k4.m13371ck().setPosition(j);
    }

    /* JADX INFO: renamed from: to */
    public float[] m27355to(int i) {
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = C7019kk.m27462to(Long.valueOf(m27352kk()), 10) / 65536.0f;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m27351k4(int i) {
        return this.f19009k4.m13372dy(i);
    }

    /* JADX INFO: renamed from: kk */
    public float[] m27353kk(int i) {
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = C7019kk.m27437dy(Integer.valueOf(m27356x1()), 8) / 65535.0f;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: x1 */
    public float[] m27357x1(int i) {
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = C7019kk.m27437dy(Byte.valueOf(m27349k4()), 6) / 255.0f;
        }
        return fArr;
    }
}
