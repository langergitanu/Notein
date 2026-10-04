package com.aspose.slides.internal.p036b6;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14076m2;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.kp */
/* JADX INFO: loaded from: classes3.dex */
public class C1636kp {

    /* JADX INFO: renamed from: k4 */
    private byte[] f6316k4;

    /* JADX INFO: renamed from: x1 */
    private long f6317x1 = 0;

    public C1636kp(byte[] bArr) {
        this.f6316k4 = bArr;
    }

    /* JADX INFO: renamed from: ck */
    private long m8852ck(C14093tq<Long> c14093tq) {
        return m8853k4(c14093tq, 0L);
    }

    /* JADX INFO: renamed from: c5 */
    public final char m8854c5() {
        return m8855c5(null);
    }

    /* JADX INFO: renamed from: du */
    public final byte m8856du(C14093tq<Long> c14093tq) {
        return m8864k4(c14093tq);
    }

    /* JADX INFO: renamed from: dy */
    public final double m8858dy() {
        return m8859dy(null);
    }

    /* JADX INFO: renamed from: h4 */
    public final long m8860h4() {
        return m8875to(null);
    }

    /* JADX INFO: renamed from: jd */
    public final C14084qq m8862jd() {
        return m8863jd(null);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m8864k4(C14093tq<Long> c14093tq) {
        long jM8853k4 = m8853k4(c14093tq, 1L);
        this.f6317x1 = jM8853k4;
        byte b = this.f6316k4[(int) jM8853k4];
        this.f6317x1 = ((jM8853k4 & 4294967295L) + 1) & 4294967295L;
        return b;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m8870kk() {
        return m8864k4((C14093tq<Long>) null);
    }

    /* JADX INFO: renamed from: m9 */
    public final int m8872m9(C14093tq<Long> c14093tq) {
        return (int) m8875to(c14093tq);
    }

    /* JADX INFO: renamed from: to */
    public final int m8874to() {
        return m8876x1((C14093tq<Long>) null);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m8876x1(C14093tq<Long> c14093tq) {
        long jM8853k4 = m8853k4(c14093tq, 2L);
        this.f6317x1 = jM8853k4;
        byte[] bArr = this.f6316k4;
        byte b = bArr[(int) jM8853k4];
        byte b2 = bArr[((int) jM8853k4) + 1];
        this.f6317x1 = ((jM8853k4 & 4294967295L) + 2) & 4294967295L;
        return 65535 & (((b & 255) << 8) + (b2 & 255));
    }

    /* JADX INFO: renamed from: c5 */
    public final char m8855c5(C14093tq<Long> c14093tq) {
        return m8878x1(m8852ck(c14093tq), 1L).charAt(0);
    }

    /* JADX INFO: renamed from: du */
    public final long m8857du() {
        return m8871kk(null);
    }

    /* JADX INFO: renamed from: dy */
    public final double m8859dy(C14093tq<Long> c14093tq) {
        return C14116yg.m67501x1((((double) m8872m9(c14093tq)) / 65536.0d) * 100000.0d) / 100000.0d;
    }

    /* JADX INFO: renamed from: h4 */
    public final short m8861h4(C14093tq<Long> c14093tq) {
        return (short) m8876x1(c14093tq);
    }

    /* JADX INFO: renamed from: jd */
    public final C14084qq m8863jd(C14093tq<Long> c14093tq) {
        long jM8853k4 = m8853k4(c14093tq, 8L);
        this.f6317x1 = jM8853k4;
        long jM8875to = m8875to(new C14093tq<>(Long.valueOf((jM8853k4 & 4294967295L) + 4)));
        C14084qq c14084qq = new C14084qq(1970, 1, 1);
        c14084qq.m67142kk(((jM8875to & 4294967295L) * 1000) - 2077545600000L).CloneTo(c14084qq);
        c14084qq.m67138k4(C14076m2.m66792k4(TimeZone.getDefault(), c14084qq.Clone()).Clone()).CloneTo(c14084qq);
        return c14084qq;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m8865k4() {
        return this.f6317x1;
    }

    /* JADX INFO: renamed from: kk */
    public final long m8871kk(C14093tq<Long> c14093tq) {
        long jM8853k4 = m8853k4(c14093tq, 3L);
        this.f6317x1 = jM8853k4;
        byte[] bArr = this.f6316k4;
        byte b = bArr[(int) jM8853k4];
        byte b2 = bArr[((int) jM8853k4) + 1];
        byte b3 = bArr[((int) jM8853k4) + 2];
        this.f6317x1 = ((jM8853k4 & 4294967295L) + 3) & 4294967295L;
        return ((long) (((b & 255) << 16) + ((b2 & 255) << 8) + (b3 & 255))) & 4294967295L;
    }

    /* JADX INFO: renamed from: m9 */
    public final short m8873m9() {
        return m8861h4(null);
    }

    /* JADX INFO: renamed from: to */
    public final long m8875to(C14093tq<Long> c14093tq) {
        long jM8853k4 = m8853k4(c14093tq, 4L);
        this.f6317x1 = jM8853k4;
        byte[] bArr = this.f6316k4;
        byte b = bArr[(int) jM8853k4];
        byte b2 = bArr[((int) jM8853k4) + 1];
        byte b3 = bArr[((int) jM8853k4) + 2];
        byte b4 = bArr[((int) jM8853k4) + 3];
        this.f6317x1 = ((jM8853k4 & 4294967295L) + 4) & 4294967295L;
        return ((long) (((b & 255) << 24) + ((b2 & 255) << 16) + ((b3 & 255) << 8) + (b4 & 255))) & 4294967295L;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m8877x1() {
        return ((long) this.f6316k4.length) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    private long m8853k4(C14093tq<Long> c14093tq, long j) {
        if (c14093tq == null || !c14093tq.m67302x1()) {
            long j2 = this.f6317x1;
            if ((((j2 & 4294967295L) + (j & 4294967295L)) & 4294967295L) <= this.f6316k4.length) {
                return j2;
            }
            throw new Exception("Wrong offset.");
        }
        boolean zM67302x1 = c14093tq.m67302x1();
        Class<?> cls = Long.TYPE;
        C14093tq c14093tqClone = (zM67302x1 ? new C14093tq(Long.valueOf((c14093tq.Clone().m67298k4(cls).longValue() & 4294967295L) + (j & 4294967295L))) : new C14093tq()).Clone();
        if (!c14093tqClone.m67302x1() || (((Long) c14093tqClone.m67298k4(cls)).longValue() & 4294967295L) > this.f6316k4.length) {
            throw new Exception("Wrong offset.");
        }
        return c14093tq.Clone().m67297k4().longValue();
    }

    /* JADX INFO: renamed from: x1 */
    public final String m8878x1(long j, long j2) {
        this.f6317x1 = m8853k4(new C14093tq<>(Long.valueOf(j)), j2);
        String strM67441x1 = "";
        int i = 0;
        while (true) {
            long j3 = i;
            long j4 = j2 & 4294967295L;
            if (j3 >= j4) {
                this.f6317x1 = ((this.f6317x1 & 4294967295L) + j4) & 4294967295L;
                return strM67441x1;
            }
            strM67441x1 = C14113y2.m67441x1(strM67441x1, C14080ne.m67033x1(Byte.valueOf(this.f6316k4[(int) (((this.f6317x1 & 4294967295L) + j3) & 4294967295L)])));
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final Object m8866k4(int i, long j) {
        return m8867k4(i, j, false);
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m8879x1(long j) {
        return m8869k4(j, 0L);
    }

    /* JADX INFO: renamed from: k4 */
    public final Object m8867k4(int i, long j, boolean z) {
        if (i == 9) {
            return m8863jd(new C14093tq<>(Long.valueOf(j)));
        }
        if (i == 10) {
            return Character.valueOf(m8855c5(new C14093tq<>(Long.valueOf(j))));
        }
        if (i == 13) {
            return Long.valueOf(m8871kk(new C14093tq<>(Long.valueOf(j))));
        }
        switch (i) {
            case 0:
                return Byte.valueOf(m8856du(new C14093tq<>(Long.valueOf(j))));
            case 1:
                return Byte.valueOf(m8864k4(new C14093tq<>(Long.valueOf(j))));
            case 2:
                return Short.valueOf(m8861h4(new C14093tq<>(Long.valueOf(j))));
            case 3:
                return Integer.valueOf(m8876x1(new C14093tq<>(Long.valueOf(j))));
            case 4:
                return Integer.valueOf(m8872m9(new C14093tq<>(Long.valueOf(j))));
            case 5:
                return Long.valueOf(m8875to(new C14093tq<>(Long.valueOf(j))));
            case 6:
                return Double.valueOf(m8859dy(new C14093tq<>(Long.valueOf(j))));
            default:
                long jM8902k4 = C1642qq.m8902k4(i);
                this.f6317x1 = m8853k4(new C14093tq<>(Long.valueOf(j)), jM8902k4);
                long j2 = jM8902k4 & 4294967295L;
                byte[] bArr = new byte[(int) j2];
                AbstractC14092to.m67218k4(AbstractC14092to.m67208k4((Object) this.f6316k4), this.f6317x1 & 4294967295L, AbstractC14092to.m67208k4((Object) bArr), 0L, j2);
                this.f6317x1 = 4294967295L & ((this.f6317x1 & 4294967295L) + j2);
                return bArr;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8868k4(long j) {
        this.f6317x1 = m8852ck(new C14093tq<>(Long.valueOf(j)));
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m8869k4(long j, long j2) {
        long j3;
        long j4;
        if ((j2 & 4294967295L) == 0) {
            j3 = this.f6317x1;
            j4 = j;
        } else {
            j3 = j;
            j4 = j2;
        }
        this.f6317x1 = m8853k4(new C14093tq<>(Long.valueOf(j3)), j4);
        long j5 = j4 & 4294967295L;
        byte[] bArr = new byte[(int) j5];
        AbstractC14092to.m67218k4(AbstractC14092to.m67208k4((Object) this.f6316k4), this.f6317x1 & 4294967295L, AbstractC14092to.m67208k4((Object) bArr), 0L, j5);
        this.f6317x1 = 4294967295L & ((this.f6317x1 & 4294967295L) + j5);
        return bArr;
    }
}
