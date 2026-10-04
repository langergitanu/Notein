package com.aspose.slides.internal.p401sl;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p482wr.C12268ts;

/* JADX INFO: renamed from: com.aspose.slides.internal.sl.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C10233c5 {

    /* JADX INFO: renamed from: dy */
    private final AbstractC3150x6 f36679dy;

    /* JADX INFO: renamed from: k4 */
    private static final byte[] f36674k4 = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: x1 */
    private static final byte[] f36678x1 = m50115k4("IHDR");

    /* JADX INFO: renamed from: kk */
    private static final byte[] f36675kk = m50115k4("iCCP");

    /* JADX INFO: renamed from: to */
    private static final byte[] f36677to = m50115k4("PLTE");

    /* JADX INFO: renamed from: du */
    private static final byte[] f36672du = m50115k4("IDAT");

    /* JADX INFO: renamed from: h4 */
    private static final byte[] f36673h4 = m50115k4("IEND");

    /* JADX INFO: renamed from: m9 */
    private static final long[] f36676m9 = m50116x1();

    public C10233c5(AbstractC3150x6 abstractC3150x6) {
        this.f36679dy = abstractC3150x6;
        byte[] bArr = f36674k4;
        abstractC3150x6.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: k4 */
    private static long m50113k4(long j, byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = j & 4294967295L;
            j = ((j2 >> 8) ^ f36676m9[(int) ((((long) (bArr[i3 + i] & 255)) ^ j2) & 255)]) & 4294967295L;
        }
        return j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50123x1(byte[] bArr) {
        m50122k4(f36677to, bArr);
    }

    /* JADX INFO: renamed from: x1 */
    private static long[] m50116x1() {
        long[] jArr = new long[256];
        for (long j = 0; (j & 4294967295L) < 256; j++) {
            long j2 = j;
            for (int i = 0; i < 8; i++) {
                long j3 = j2 & 4294967295L;
                j2 = ((j2 & 1) != 0 ? (j3 >> 1) ^ 3988292384L : j3 >> 1) & 4294967295L;
            }
            jArr[(int) j] = j2;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50117k4() {
        m50122k4(f36673h4, new byte[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50118k4(int i) {
        m50114k4(i, this.f36679dy);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50119k4(int i, int i2, int i3, int i4) {
        C3152yj c3152yj = new C3152yj();
        try {
            m50114k4(i, c3152yj);
            m50114k4(i2, c3152yj);
            c3152yj.writeByte((byte) i3);
            c3152yj.writeByte((byte) i4);
            c3152yj.writeByte((byte) 0);
            c3152yj.writeByte((byte) 0);
            c3152yj.writeByte((byte) 0);
            m50122k4(f36678x1, c3152yj.toArray());
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m50114k4(int i, AbstractC3150x6 abstractC3150x6) {
        abstractC3150x6.writeByte((byte) (i >> 24));
        abstractC3150x6.writeByte((byte) (i >> 16));
        abstractC3150x6.writeByte((byte) (i >> 8));
        abstractC3150x6.writeByte((byte) i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50120k4(byte[] bArr) {
        C3152yj c3152yj = new C3152yj();
        try {
            c3152yj.writeByte((byte) 73);
            c3152yj.writeByte((byte) 67);
            c3152yj.writeByte((byte) 67);
            c3152yj.writeByte((byte) 0);
            c3152yj.writeByte((byte) 0);
            C12268ts c12268ts = new C12268ts(c3152yj, 0);
            try {
                c12268ts.write(bArr, 0, bArr.length);
                c12268ts.dispose();
                m50122k4(f36675kk, c3152yj.toArray());
            } catch (Throwable th) {
                c12268ts.dispose();
                throw th;
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50121k4(byte[] bArr, int i) {
        C3152yj c3152yj = new C3152yj();
        try {
            C12268ts c12268ts = new C12268ts(c3152yj, 0);
            int i2 = 0;
            while (i2 < bArr.length - i) {
                try {
                    c12268ts.writeByte((byte) 0);
                    c12268ts.write(bArr, i2, i);
                    i2 += i;
                } catch (Throwable th) {
                    c12268ts.dispose();
                    throw th;
                }
            }
            int length = bArr.length - i2;
            if (length > 0) {
                c12268ts.writeByte((byte) 0);
                c12268ts.write(bArr, i2, length);
            }
            c12268ts.dispose();
            m50122k4(f36672du, c3152yj.toArray());
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50122k4(byte[] bArr, byte[] bArr2) {
        m50118k4(bArr2.length);
        this.f36679dy.write(bArr, 0, 4);
        this.f36679dy.write(bArr2, 0, bArr2.length);
        m50118k4((int) ((m50113k4(m50113k4(4294967295L, bArr, 0, bArr.length), bArr2, 0, bArr2.length) ^ 4294967295L) & 4294967295L));
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m50115k4(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }
}
