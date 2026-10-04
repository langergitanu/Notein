package com.aspose.slides.internal.p036b6;

import com.aspose.slides.OooO00o;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.vh */
/* JADX INFO: loaded from: classes3.dex */
public class C1655vh {

    /* JADX INFO: renamed from: k4 */
    private byte[] f6363k4;

    /* JADX INFO: renamed from: x1 */
    private long f6364x1;

    public C1655vh(byte[] bArr, long j) {
        this.f6363k4 = bArr;
        this.f6364x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m8988k4() {
        return this.f6364x1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m9010kk(long j, C14093tq<Long> c14093tq) {
        this.f6364x1 = m8987k4(c14093tq, j);
        for (int i = 0; i < (4294967295L & j); i++) {
            m8989k4((byte) 0);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m9011x1(byte b, C14093tq<Long> c14093tq) {
        m8990k4(b, c14093tq);
    }

    /* JADX INFO: renamed from: k4 */
    private long m8987k4(C14093tq<Long> c14093tq, long j) {
        if (c14093tq == null || !c14093tq.m67302x1()) {
            long j2 = this.f6364x1;
            if ((((j2 & 4294967295L) + (j & 4294967295L)) & 4294967295L) <= this.f6363k4.length) {
                return j2;
            }
            throw new Exception("Wrong offset.");
        }
        boolean zM67302x1 = c14093tq.m67302x1();
        Class<?> cls = Long.TYPE;
        C14093tq c14093tqClone = (zM67302x1 ? new C14093tq(Long.valueOf((c14093tq.Clone().m67298k4(cls).longValue() & 4294967295L) + (j & 4294967295L))) : new C14093tq()).Clone();
        if (!c14093tqClone.m67302x1() || (((Long) c14093tqClone.m67298k4(cls)).longValue() & 4294967295L) > this.f6363k4.length) {
            throw new Exception("Wrong offset.");
        }
        return c14093tq.Clone().m67297k4().longValue();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m9012x1(int i, C14093tq<Long> c14093tq) {
        m9014x1(((long) i) & 4294967295L, c14093tq);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8989k4(byte b) {
        m8990k4(b, (C14093tq<Long>) null);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m9013x1(long j) {
        m9010kk(j, null);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8990k4(byte b, C14093tq<Long> c14093tq) {
        long jM8987k4 = m8987k4(c14093tq, 1L);
        this.f6364x1 = jM8987k4;
        this.f6363k4[(int) jM8987k4] = b;
        this.f6364x1 = 4294967295L & ((jM8987k4 & 4294967295L) + 1);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m9014x1(long j, C14093tq<Long> c14093tq) {
        this.f6364x1 = m8987k4(c14093tq, 4L);
        byte[] bArrM66776k4 = C14069jd.m66776k4(j);
        AbstractC14092to.m67248to(AbstractC14092to.m67208k4((Object) bArrM66776k4));
        byte[] bArr = this.f6363k4;
        long j2 = this.f6364x1;
        bArr[(int) j2] = bArrM66776k4[0];
        bArr[(int) (((j2 & 4294967295L) + 1) & 4294967295L)] = bArrM66776k4[1];
        bArr[(int) (((j2 & 4294967295L) + 2) & 4294967295L)] = bArrM66776k4[2];
        bArr[(int) (((j2 & 4294967295L) + 3) & 4294967295L)] = bArrM66776k4[3];
        this.f6364x1 = ((j2 & 4294967295L) + 4) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8991k4(char c) {
        m8992k4(c, (C14093tq<Long>) null);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8992k4(char c, C14093tq<Long> c14093tq) {
        this.f6364x1 = m8987k4(c14093tq, 1L);
        if (c > 127) {
            m8995k4((int) c);
        } else {
            m8989k4((byte) c);
        }
        this.f6364x1 = ((this.f6364x1 & 4294967295L) + 1) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8993k4(double d) {
        m8994k4(d, (C14093tq<Long>) null);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8994k4(double d, C14093tq<Long> c14093tq) {
        m9012x1(OooO00o.OooO00o(d, 65536.0d, 14), c14093tq);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8995k4(int i) {
        m8996k4(i, (C14093tq<Long>) null);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8996k4(int i, C14093tq<Long> c14093tq) {
        this.f6364x1 = m8987k4(c14093tq, 2L);
        byte[] bArrM66775k4 = C14069jd.m66775k4(i);
        AbstractC14092to.m67248to(AbstractC14092to.m67208k4((Object) bArrM66775k4));
        byte[] bArr = this.f6363k4;
        long j = this.f6364x1;
        bArr[(int) j] = bArrM66775k4[0];
        bArr[(int) (((j & 4294967295L) + 1) & 4294967295L)] = bArrM66775k4[1];
        this.f6364x1 = ((j & 4294967295L) + 2) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8997k4(int i, Object obj, long j) {
        m8998k4(i, obj, j, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8998k4(int i, Object obj, long j, boolean z) {
        if (i == 9) {
            m9002k4(((C14084qq) C7019kk.m27464to(obj, C14084qq.class)).Clone(), new C14093tq<>(Long.valueOf(j)));
            return;
        }
        if (i == 10) {
            m8992k4(((Character) C7019kk.m27464to(obj, Character.TYPE)).charValue(), new C14093tq<>(Long.valueOf(j)));
            return;
        }
        Class cls = Long.TYPE;
        if (i == 13) {
            m9000k4(((Long) C7019kk.m27464to(obj, cls)).longValue(), new C14093tq<>(Long.valueOf(j)));
            return;
        }
        Class cls2 = Byte.TYPE;
        Class cls3 = Integer.TYPE;
        switch (i) {
            case 0:
                m9011x1(((Byte) C7019kk.m27464to(obj, cls2)).byteValue(), new C14093tq<>(Long.valueOf(j)));
                break;
            case 1:
                m8990k4(((Byte) C7019kk.m27464to(obj, cls2)).byteValue(), new C14093tq<>(Long.valueOf(j)));
                break;
            case 2:
                m9006k4(((Short) C7019kk.m27464to(obj, Short.TYPE)).shortValue(), new C14093tq<>(Long.valueOf(j)));
                break;
            case 3:
                m8996k4(((Integer) C7019kk.m27464to(obj, cls3)).intValue(), new C14093tq<>(Long.valueOf(j)));
                break;
            case 4:
                m9012x1(((Integer) C7019kk.m27464to(obj, cls3)).intValue(), new C14093tq<>(Long.valueOf(j)));
                break;
            case 5:
                m9014x1(((Long) C7019kk.m27464to(obj, cls)).longValue(), new C14093tq<>(Long.valueOf(j)));
                break;
            case 6:
                m8994k4(((Double) C7019kk.m27464to(obj, Double.TYPE)).doubleValue(), new C14093tq<>(Long.valueOf(j)));
                break;
            default:
                long jM8902k4 = C1642qq.m8902k4(i);
                this.f6364x1 = m8987k4(new C14093tq<>(Long.valueOf(j)), jM8902k4);
                long j2 = jM8902k4 & 4294967295L;
                AbstractC14092to.m67218k4(AbstractC14092to.m67208k4(C7019kk.m27458kk(obj, byte[].class)), 0L, AbstractC14092to.m67208k4((Object) this.f6363k4), this.f6364x1 & 4294967295L, j2);
                this.f6364x1 = ((this.f6364x1 & 4294967295L) + j2) & 4294967295L;
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8999k4(long j) {
        m9014x1(j, (C14093tq<Long>) null);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9000k4(long j, C14093tq<Long> c14093tq) {
        this.f6364x1 = m8987k4(c14093tq, 3L);
        byte[] bArrM66776k4 = C14069jd.m66776k4(j);
        AbstractC14092to.m67248to(AbstractC14092to.m67208k4((Object) bArrM66776k4));
        byte[] bArr = this.f6363k4;
        long j2 = this.f6364x1;
        bArr[(int) j2] = bArrM66776k4[0];
        bArr[(int) (((j2 & 4294967295L) + 1) & 4294967295L)] = bArrM66776k4[1];
        bArr[(int) (((j2 & 4294967295L) + 2) & 4294967295L)] = bArrM66776k4[2];
        this.f6364x1 = ((j2 & 4294967295L) + 3) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9001k4(C14084qq c14084qq) {
        m9002k4(c14084qq, (C14093tq<Long>) null);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9002k4(C14084qq c14084qq, C14093tq<Long> c14093tq) {
        this.f6364x1 = m8987k4(c14093tq, 8L);
        long jM27435du = C7019kk.m27435du(Double.valueOf(C14116yg.m67497to((C7019kk.m27438h4(Double.valueOf(C14084qq.m67073c5(c14084qq.m67151uz(), new C14084qq(1970, 1, 1)).Clone().m66822m9() + 0.5d), 14) - (-2077545600000L)) / 1000.0d)), 14);
        m9014x1(0L, c14093tq);
        m9014x1(jM27435du, ((c14093tq == null || !c14093tq.m67302x1()) ? new C14093tq() : new C14093tq(Long.valueOf((c14093tq.Clone().m67298k4(Long.TYPE).longValue() & 4294967295L) + 4))).Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9003k4(String str) {
        m9004k4(str, (C14093tq<Long>) null, 0L);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9004k4(String str, C14093tq<Long> c14093tq, long j) {
        if ((j & 4294967295L) == 0) {
            j = ((long) str.length()) & 4294967295L;
        }
        this.f6364x1 = m8987k4(c14093tq, j);
        for (int i = 0; i < (j & 4294967295L); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt > 127) {
                m8995k4((int) cCharAt);
            } else {
                m8989k4((byte) cCharAt);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9005k4(short s) {
        m9006k4(s, (C14093tq<Long>) null);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9006k4(short s, C14093tq<Long> c14093tq) {
        m8996k4(s & 65535, c14093tq);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9007k4(byte[] bArr) {
        m9009k4(bArr, (C14093tq<Long>) null, 0L);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9008k4(byte[] bArr, C14093tq<Long> c14093tq) {
        m9009k4(bArr, c14093tq, 0L);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9009k4(byte[] bArr, C14093tq<Long> c14093tq, long j) {
        byte[] bArr2;
        long length;
        if ((j & 4294967295L) == 0) {
            bArr2 = bArr;
            length = ((long) bArr2.length) & 4294967295L;
        } else {
            bArr2 = bArr;
            length = j;
        }
        this.f6364x1 = m8987k4(c14093tq, length);
        long j2 = length & 4294967295L;
        AbstractC14092to.m67218k4(AbstractC14092to.m67208k4((Object) bArr2), 0L, AbstractC14092to.m67208k4((Object) this.f6363k4), this.f6364x1 & 4294967295L, j2);
        this.f6364x1 = 4294967295L & ((this.f6364x1 & 4294967295L) + j2);
    }
}
