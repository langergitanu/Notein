package com.aspose.slides.p559ms.System;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.huawei.hms.network.embedded.C18177fb;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.UUID;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.bz */
/* JADX INFO: loaded from: classes5.dex */
public final class C14047bz extends AbstractC7020m9<C14047bz> implements InterfaceC14061gi, Comparable<C14047bz> {

    /* JADX INFO: renamed from: k4 */
    public static final C14047bz f47172k4 = new C14047bz();

    /* JADX INFO: renamed from: c5 */
    private byte f47173c5;

    /* JADX INFO: renamed from: ck */
    private byte f47174ck;

    /* JADX INFO: renamed from: du */
    private byte f47175du;

    /* JADX INFO: renamed from: dy */
    private byte f47176dy;

    /* JADX INFO: renamed from: fa */
    private byte f47177fa;

    /* JADX INFO: renamed from: h4 */
    private byte f47178h4;

    /* JADX INFO: renamed from: jd */
    private byte f47179jd;

    /* JADX INFO: renamed from: kk */
    private short f47180kk;

    /* JADX INFO: renamed from: m9 */
    private byte f47181m9;

    /* JADX INFO: renamed from: to */
    private short f47182to;

    /* JADX INFO: renamed from: x1 */
    private int f47183x1;

    public C14047bz() {
        this.f47183x1 = 0;
        this.f47180kk = (short) 0;
        this.f47182to = (short) 0;
        this.f47175du = (byte) 0;
        this.f47178h4 = (byte) 0;
        this.f47181m9 = (byte) 0;
        this.f47176dy = (byte) 0;
        this.f47173c5 = (byte) 0;
        this.f47179jd = (byte) 0;
        this.f47174ck = (byte) 0;
        this.f47177fa = (byte) 0;
    }

    /* JADX INFO: renamed from: k4 */
    private static char m66529k4(int i) {
        int i2 = i & 15;
        return (char) (i2 > 9 ? i2 + 87 : i2 + 48);
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C14047bz) && m66535k4(this, (C14047bz) obj);
    }

    public int hashCode() {
        return (this.f47183x1 ^ (((this.f47180kk & 65535) << 16) | (65535 & this.f47182to))) ^ (((this.f47181m9 & 255) << 24) | (this.f47177fa & 255));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public C14047bz Clone() {
        C14047bz c14047bz = new C14047bz();
        CloneTo(c14047bz);
        return c14047bz;
    }

    public String toString() {
        return m66538k4("D");
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14047bz c14047bz) {
        if (c14047bz == null) {
            return 1;
        }
        int i = c14047bz.f47183x1;
        int i2 = this.f47183x1;
        if (i != i2) {
            return m66530k4(i2, i);
        }
        short s = c14047bz.f47180kk;
        short s2 = this.f47180kk;
        if (s != s2) {
            return m66530k4(s2, s);
        }
        short s3 = c14047bz.f47182to;
        short s4 = this.f47182to;
        if (s3 != s4) {
            return m66530k4(s4, s3);
        }
        byte b = c14047bz.f47175du;
        byte b2 = this.f47175du;
        if (b != b2) {
            return m66530k4(b2, b);
        }
        byte b3 = c14047bz.f47178h4;
        byte b4 = this.f47178h4;
        if (b3 != b4) {
            return m66530k4(b4, b3);
        }
        byte b5 = c14047bz.f47181m9;
        byte b6 = this.f47181m9;
        if (b5 != b6) {
            return m66530k4(b6, b5);
        }
        byte b7 = c14047bz.f47176dy;
        byte b8 = this.f47176dy;
        if (b7 != b8) {
            return m66530k4(b8, b7);
        }
        byte b9 = c14047bz.f47173c5;
        byte b10 = this.f47173c5;
        if (b9 != b10) {
            return m66530k4(b10, b9);
        }
        byte b11 = c14047bz.f47179jd;
        byte b12 = this.f47179jd;
        if (b11 != b12) {
            return m66530k4(b12, b11);
        }
        byte b13 = c14047bz.f47174ck;
        byte b14 = this.f47174ck;
        if (b13 != b14) {
            return m66530k4(b14, b13);
        }
        byte b15 = c14047bz.f47177fa;
        byte b16 = this.f47177fa;
        if (b15 != b16) {
            return m66530k4(b16, b15);
        }
        return 0;
    }

    public C14047bz(int i, short s, short s2, byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        this.f47183x1 = i;
        this.f47180kk = s;
        this.f47182to = s2;
        this.f47175du = b;
        this.f47178h4 = b2;
        this.f47181m9 = b3;
        this.f47176dy = b4;
        this.f47173c5 = b5;
        this.f47179jd = b6;
        this.f47174ck = b7;
        this.f47177fa = b8;
    }

    /* JADX INFO: renamed from: k4 */
    private int m66530k4(long j, long j2) {
        return j < j2 ? -1 : 1;
    }

    /* JADX INFO: renamed from: x1 */
    public static C14047bz m66536x1() {
        return m66533k4(UUID.randomUUID());
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C14047bz c14047bz) {
        c14047bz.f47183x1 = this.f47183x1;
        c14047bz.f47180kk = this.f47180kk;
        c14047bz.f47182to = this.f47182to;
        c14047bz.f47175du = this.f47175du;
        c14047bz.f47178h4 = this.f47178h4;
        c14047bz.f47181m9 = this.f47181m9;
        c14047bz.f47176dy = this.f47176dy;
        c14047bz.f47173c5 = this.f47173c5;
        c14047bz.f47179jd = this.f47179jd;
        c14047bz.f47174ck = this.f47174ck;
        c14047bz.f47177fa = this.f47177fa;
    }

    public C14047bz(long j, int i, int i2, short s, short s2, short s3, short s4, short s5, short s6, short s7, short s8) {
        this.f47183x1 = (int) j;
        this.f47180kk = (short) i;
        this.f47182to = (short) i2;
        this.f47175du = (byte) s;
        this.f47178h4 = (byte) s2;
        this.f47181m9 = (byte) s3;
        this.f47176dy = (byte) s4;
        this.f47173c5 = (byte) s5;
        this.f47179jd = (byte) s6;
        this.f47174ck = (byte) s7;
        this.f47177fa = (byte) s8;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m66531k4(String str, int[] iArr, int i) {
        int i2 = iArr[0];
        int iM67572k4 = (int) C14120zj.m67572k4(str, 16, 8192, iArr);
        if (iArr[0] - i2 == i) {
            return iM67572k4;
        }
        throw new IllegalStateException(OooO00o.OooO00o("Wrong Guid Format: Invalid Char: ", str));
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m66537x1(C14047bz c14047bz, C14047bz c14047bz2) {
        return !m66535k4(c14047bz, c14047bz2);
    }

    public C14047bz(long j, long j2) {
        this.f47183x1 = (int) (j >> 32);
        this.f47180kk = (short) (j >> 16);
        this.f47182to = (short) j;
        this.f47175du = (byte) (j2 >> 56);
        this.f47178h4 = (byte) (j2 >> 48);
        this.f47181m9 = (byte) (j2 >> 40);
        this.f47176dy = (byte) (j2 >> 32);
        this.f47173c5 = (byte) (j2 >> 24);
        this.f47179jd = (byte) (j2 >> 16);
        this.f47174ck = (byte) (j2 >> 8);
        this.f47177fa = (byte) j2;
    }

    public C14047bz(String str) {
        int i;
        String strM67397k4 = str;
        if (strM67397k4 == null) {
            throw new NullPointerException("g");
        }
        int[] iArr = {0};
        try {
            if (strM67397k4.indexOf(45, 0) < 0 && strM67397k4.length() == 32) {
                strM67397k4 = C14113y2.m67397k4(C14113y2.m67397k4(C14113y2.m67397k4(C14113y2.m67397k4(strM67397k4, 20, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR), 16, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR), 12, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR), 8, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
            }
            if (strM67397k4.indexOf(45, 0) < 0) {
                throw new IllegalStateException("Unsupported Guid Format: ".concat(strM67397k4));
            }
            String strTrim = strM67397k4.trim();
            if (strTrim.charAt(0) == '{') {
                if (strTrim.length() != 38 || strTrim.charAt(37) != '}') {
                    throw new IllegalStateException("Wrong Guid format sting length: ".concat(strM67397k4));
                }
            } else {
                if (strTrim.charAt(0) != '(') {
                    if (strTrim.length() != 36) {
                        throw new IllegalStateException("Wrong Guid format sting length: ".concat(strM67397k4));
                    }
                    i = 0;
                    if (strTrim.charAt(i + 8) == '-' || strTrim.charAt(i + 13) != '-' || strTrim.charAt(i + 18) != '-' || strTrim.charAt(i + 23) != '-') {
                        throw new IllegalStateException("Wrong format: missed or misplaced dashes: ".concat(strM67397k4));
                    }
                    iArr[0] = i;
                    this.f47183x1 = m66531k4(strTrim, iArr, 8);
                    iArr[0] = iArr[0] + 1;
                    this.f47180kk = (short) m66531k4(strTrim, iArr, 4);
                    iArr[0] = iArr[0] + 1;
                    this.f47182to = (short) m66531k4(strTrim, iArr, 4);
                    iArr[0] = iArr[0] + 1;
                    int iM66531k4 = m66531k4(strTrim, iArr, 4);
                    int i2 = iArr[0] + 1;
                    iArr[0] = i2;
                    long jM67572k4 = C14120zj.m67572k4(strTrim, 16, 8192, iArr);
                    if (iArr[0] - i2 != 12) {
                        throw new IllegalStateException("Wrong Guid format sting length: ".concat(strM67397k4));
                    }
                    this.f47175du = (byte) (iM66531k4 >> 8);
                    this.f47178h4 = (byte) iM66531k4;
                    int i3 = (int) (jM67572k4 >> 32);
                    this.f47181m9 = (byte) (i3 >> 8);
                    this.f47176dy = (byte) i3;
                    int i4 = (int) jM67572k4;
                    this.f47173c5 = (byte) (i4 >> 24);
                    this.f47179jd = (byte) (i4 >> 16);
                    this.f47174ck = (byte) (i4 >> 8);
                    this.f47177fa = (byte) i4;
                    return;
                }
                if (strTrim.length() != 38 || strTrim.charAt(37) != ')') {
                    throw new IllegalStateException("Wrong Guid format sting length: ".concat(strM67397k4));
                }
            }
            i = 1;
            if (strTrim.charAt(i + 8) == '-') {
            }
            throw new IllegalStateException("Wrong format: missed or misplaced dashes: ".concat(strM67397k4));
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalStateException("Format_GuidUnrecognized");
        }
    }

    public C14047bz(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("b");
        }
        if (bArr.length != 16) {
            throw new ArgumentException("Guid array ctor: b length should be 16.");
        }
        this.f47183x1 = (bArr[3] << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[0] & 255);
        this.f47180kk = (short) ((bArr[5] << 8) | (bArr[4] & 255));
        this.f47182to = (short) ((bArr[7] << 8) | (bArr[6] & 255));
        this.f47175du = bArr[8];
        this.f47178h4 = bArr[9];
        this.f47181m9 = bArr[10];
        this.f47176dy = bArr[11];
        this.f47173c5 = bArr[12];
        this.f47179jd = bArr[13];
        this.f47174ck = bArr[14];
        this.f47177fa = bArr[15];
    }

    /* JADX INFO: renamed from: k4 */
    private static int m66532k4(char[] cArr, int i, int i2, int i3) {
        cArr[i] = m66529k4(i2 >> 4);
        cArr[i + 1] = m66529k4(i2);
        int i4 = i + 3;
        cArr[i + 2] = m66529k4(i3 >> 4);
        int i5 = i + 4;
        cArr[i4] = m66529k4(i3);
        return i5;
    }

    /* JADX INFO: renamed from: k4 */
    public static C14047bz m66533k4(UUID uuid) {
        return uuid == null ? new C14047bz() : new C14047bz(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    /* JADX INFO: renamed from: k4 */
    public String m66538k4(String str) {
        int i;
        char[] cArr;
        boolean z;
        if (str == null || str.length() == 0) {
            str = "D";
        }
        int i2 = 1;
        if (str.length() != 1) {
            throw new IllegalStateException("Format_InvalidGuidFormatSpecification");
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'D' || cCharAt == 'd') {
            i = 36;
            cArr = new char[36];
            z = true;
            i2 = 0;
        } else if (cCharAt == 'N' || cCharAt == 'n') {
            i = 32;
            cArr = new char[32];
            z = false;
            i2 = 0;
        } else {
            i = 38;
            if (cCharAt == 'B' || cCharAt == 'b') {
                cArr = new char[38];
                cArr[0] = '{';
                cArr[37] = '}';
            } else {
                if (cCharAt != 'P' && cCharAt != 'p') {
                    throw new IllegalStateException("Format_InvalidGuidFormatSpecification");
                }
                cArr = new char[38];
                cArr[0] = '(';
                cArr[37] = ')';
            }
            z = true;
        }
        int i3 = this.f47183x1;
        int iM66532k4 = m66532k4(cArr, i2, i3 >> 24, i3 >> 16);
        int i4 = this.f47183x1;
        int iM66532k42 = m66532k4(cArr, iM66532k4, i4 >> 8, i4);
        if (z) {
            cArr[iM66532k42] = '-';
            iM66532k42++;
        }
        short s = this.f47180kk;
        int iM66532k43 = m66532k4(cArr, iM66532k42, s >> 8, s);
        if (z) {
            cArr[iM66532k43] = '-';
            iM66532k43++;
        }
        short s2 = this.f47182to;
        int iM66532k44 = m66532k4(cArr, iM66532k43, s2 >> 8, s2);
        if (z) {
            cArr[iM66532k44] = '-';
            iM66532k44++;
        }
        int iM66532k45 = m66532k4(cArr, iM66532k44, this.f47175du, this.f47178h4);
        if (z) {
            cArr[iM66532k45] = '-';
            iM66532k45++;
        }
        m66532k4(cArr, m66532k4(cArr, m66532k4(cArr, iM66532k45, this.f47181m9, this.f47176dy), this.f47173c5, this.f47179jd), this.f47174ck, this.f47177fa);
        return new String(cArr, 0, i);
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14061gi
    /* JADX INFO: renamed from: k4 */
    public String mo66517k4(String str, InterfaceC14073kp interfaceC14073kp) {
        return m66538k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public static UUID m66534k4(C14047bz c14047bz) {
        if (c14047bz == null) {
            return null;
        }
        return new UUID((((long) c14047bz.f47183x1) << 32) | ((((long) c14047bz.f47180kk) & C18177fb.f54859s) << 16) | (((long) c14047bz.f47182to) & C18177fb.f54859s), ((((long) c14047bz.f47175du) & 255) << 56) | ((((long) c14047bz.f47178h4) & 255) << 48) | ((((long) c14047bz.f47181m9) & 255) << 40) | ((((long) c14047bz.f47176dy) & 255) << 32) | ((((long) c14047bz.f47173c5) & 255) << 24) | ((((long) c14047bz.f47179jd) & 255) << 16) | ((((long) c14047bz.f47174ck) & 255) << 8) | (((long) c14047bz.f47177fa) & 255));
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66535k4(C14047bz c14047bz, C14047bz c14047bz2) {
        if (c14047bz == c14047bz2) {
            return true;
        }
        return c14047bz != null && c14047bz2 != null && c14047bz.f47183x1 == c14047bz2.f47183x1 && c14047bz.f47180kk == c14047bz2.f47180kk && c14047bz.f47182to == c14047bz2.f47182to && c14047bz.f47175du == c14047bz2.f47175du && c14047bz.f47178h4 == c14047bz2.f47178h4 && c14047bz.f47181m9 == c14047bz2.f47181m9 && c14047bz.f47176dy == c14047bz2.f47176dy && c14047bz.f47173c5 == c14047bz2.f47173c5 && c14047bz.f47179jd == c14047bz2.f47179jd && c14047bz.f47174ck == c14047bz2.f47174ck && c14047bz.f47177fa == c14047bz2.f47177fa;
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m66539k4() {
        int i = this.f47183x1;
        short s = this.f47180kk;
        short s2 = this.f47182to;
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24), (byte) s, (byte) (s >> 8), (byte) s2, (byte) (s2 >> 8), this.f47175du, this.f47178h4, this.f47181m9, this.f47176dy, this.f47173c5, this.f47179jd, this.f47174ck, this.f47177fa};
    }
}
