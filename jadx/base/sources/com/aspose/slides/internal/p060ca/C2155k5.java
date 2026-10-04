package com.aspose.slides.internal.p060ca;

import androidx.core.content.OooO0O0;
import com.aspose.slides.OooO0OO;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.k5 */
/* JADX INFO: loaded from: classes3.dex */
public class C2155k5 {

    /* JADX INFO: renamed from: c5 */
    private int f7445c5;

    /* JADX INFO: renamed from: ck */
    private int f7446ck;

    /* JADX INFO: renamed from: du */
    private C2294so f7447du;

    /* JADX INFO: renamed from: dy */
    private int f7448dy;

    /* JADX INFO: renamed from: fa */
    private String f7449fa;

    /* JADX INFO: renamed from: h4 */
    private int f7450h4;

    /* JADX INFO: renamed from: ix */
    private String f7451ix;

    /* JADX INFO: renamed from: jd */
    private long f7452jd;

    /* JADX INFO: renamed from: k4 */
    private long f7453k4;

    /* JADX INFO: renamed from: kk */
    private C2041d3 f7454kk;

    /* JADX INFO: renamed from: ks */
    private String f7455ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f7456m9;

    /* JADX INFO: renamed from: ne */
    private long f7457ne;

    /* JADX INFO: renamed from: qq */
    private long[] f7458qq;

    /* JADX INFO: renamed from: rv */
    private String f7459rv;

    /* JADX INFO: renamed from: to */
    private int f7460to;

    /* JADX INFO: renamed from: u4 */
    private String f7461u4;

    /* JADX INFO: renamed from: up */
    private long f7462up;

    /* JADX INFO: renamed from: uz */
    private long[] f7463uz;

    /* JADX INFO: renamed from: wl */
    private long[] f7464wl;

    /* JADX INFO: renamed from: x1 */
    private long f7465x1;

    /* JADX INFO: renamed from: x6 */
    private String f7466x6;

    /* JADX INFO: renamed from: yj */
    private long f7467yj;

    public C2155k5() {
        this(null);
    }

    /* JADX INFO: renamed from: x1 */
    private static long m10872x1(byte[] bArr) {
        long j = 0;
        for (byte b : bArr) {
            j = ((j & 4294967295L) + ((long) (b & 255))) & 4294967295L;
        }
        return (j ^ 1346851650) & 4294967295L;
    }

    /* JADX INFO: renamed from: du */
    public final int m10874du() {
        return this.f7450h4;
    }

    /* JADX INFO: renamed from: dy */
    public final long m10878dy() {
        return this.f7452jd;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m10879h4() {
        return this.f7451ix;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m10882k4() {
        return this.f7465x1;
    }

    /* JADX INFO: renamed from: kk */
    public final int m10891kk() {
        return this.f7460to;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m10896m9() {
        return this.f7467yj;
    }

    /* JADX INFO: renamed from: to */
    public final C2294so m10897to() {
        return this.f7447du;
    }

    public C2155k5(C3134k4 c3134k4) {
        this.f7454kk = new C2041d3();
        if (c3134k4 != null) {
            m10887k4(c3134k4);
        }
    }

    /* JADX INFO: renamed from: kk */
    private static String m10871kk(byte[] bArr) {
        String strM26681x1 = AbstractC6747ar.m26643rv().m26681x1(bArr);
        return (strM26681x1.length() <= 0 || OooO0O0.OooO00o(1, strM26681x1) != 0) ? strM26681x1 : OooO0OO.OooO00o(1, 0, strM26681x1, strM26681x1);
    }

    /* JADX INFO: renamed from: du */
    public final void m10875du(int i) {
        this.f7446ck = i;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m10880h4(long j) {
        this.f7452jd = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10883k4(int i) {
        this.f7460to = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m10898to(int i) {
        this.f7445c5 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final C2041d3 m10901x1() {
        return this.f7454kk;
    }

    /* JADX INFO: renamed from: x1 */
    private String m10873x1(C3134k4 c3134k4) {
        return m10871kk(c3134k4.m13372dy(c3134k4.m13382u4() & 65535));
    }

    /* JADX INFO: renamed from: du */
    public final void m10876du(long j) {
        this.f7462up = j;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m10881h4(String str) {
        this.f7449fa = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10884k4(long j) {
        this.f7453k4 = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m10899to(long j) {
        this.f7467yj = j;
    }

    /* JADX INFO: renamed from: du */
    public final void m10877du(String str) {
        this.f7455ks = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10885k4(C2041d3 c2041d3) {
        c2041d3.CloneTo(this.f7454kk);
    }

    /* JADX INFO: renamed from: to */
    public final void m10900to(String str) {
        this.f7466x6 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10902x1(int i) {
        this.f7450h4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10886k4(C2294so c2294so) {
        this.f7447du = c2294so;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10903x1(long j) {
        this.f7465x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10887k4(C3134k4 c3134k4) {
        if (c3134k4 == null) {
            throw new ArgumentNullException("reader");
        }
        m10884k4(c3134k4.m13384uz());
        m10903x1(c3134k4.m13384uz());
        m10885k4(C2041d3.m10346k4(c3134k4.m13384uz()).Clone());
        m10883k4((int) c3134k4.m13384uz());
        m10886k4(new C2294so(c3134k4.m13372dy(10)));
        m10902x1(c3134k4.m13387yj() & 255);
        m10889k4((c3134k4.m13387yj() & 255) == 1);
        m10892kk((int) c3134k4.m13384uz());
        m10898to(c3134k4.m13382u4() & 65535);
        if ((c3134k4.m13382u4() & 65535) != 20556) {
            throw new InvalidOperationException("Magic number for EOT file is incorrect. Maybe file is corrupted");
        }
        m10890k4(m10870k4(c3134k4, 4));
        m10905x1(m10870k4(c3134k4, 2));
        m10893kk(c3134k4.m13384uz());
        m10895kk(m10870k4(c3134k4, 4));
        if ((c3134k4.m13382u4() & 65535) != 0) {
            throw new InvalidOperationException("Padding1 is not zero. Maybe file is corrupted");
        }
        m10888k4(m10873x1(c3134k4));
        if ((c3134k4.m13382u4() & 65535) != 0) {
            throw new InvalidOperationException("Padding2 is not zero. Maybe file is corrupted");
        }
        m10904x1(m10873x1(c3134k4));
        if ((c3134k4.m13382u4() & 65535) != 0) {
            throw new InvalidOperationException("Padding3 is not zero. Maybe file is corrupted");
        }
        m10894kk(m10873x1(c3134k4));
        if ((c3134k4.m13382u4() & 65535) != 0) {
            throw new InvalidOperationException("Padding4 is not zero. Maybe file is corrupted");
        }
        m10900to(m10873x1(c3134k4));
        if ((m10901x1().m10350k4() & 65535) == 2) {
            if ((c3134k4.m13382u4() & 65535) != 0) {
                throw new InvalidOperationException("Padding5 is not zero. Maybe file is corrupted");
            }
            byte[] bArrM13372dy = c3134k4.m13372dy(c3134k4.m13382u4() & 65535);
            m10877du(m10871kk(bArrM13372dy));
            if ((m10901x1().m10353x1() & 65535) == 2) {
                m10899to(c3134k4.m13384uz());
                if ((m10896m9() & 4294967295L) != (4294967295L & m10872x1(bArrM13372dy))) {
                    throw new InvalidOperationException("RootString checksum is incorrect. Maybe file is corrupted");
                }
                m10876du(c3134k4.m13384uz());
                if ((c3134k4.m13382u4() & 65535) != 0) {
                    throw new InvalidOperationException("Padding6 is not zero. Maybe file is corrupted");
                }
                m10881h4(m10873x1(c3134k4));
                m10875du((int) c3134k4.m13384uz());
                m10880h4(c3134k4.m13384uz());
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10904x1(String str) {
        this.f7461u4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10888k4(String str) {
        this.f7451ix = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10905x1(long[] jArr) {
        if (jArr == null) {
            throw new ArgumentNullException("value");
        }
        if (jArr.length != 2) {
            throw new ArgumentException("Length of array must be 2");
        }
        this.f7458qq = jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10889k4(boolean z) {
        this.f7456m9 = z;
    }

    /* JADX INFO: renamed from: kk */
    public final void m10892kk(int i) {
        this.f7448dy = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10890k4(long[] jArr) {
        if (jArr == null) {
            throw new ArgumentNullException("value");
        }
        if (jArr.length != 4) {
            throw new ArgumentException("Length of array must be 4");
        }
        this.f7463uz = jArr;
    }

    /* JADX INFO: renamed from: kk */
    public final void m10893kk(long j) {
        this.f7457ne = j;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m10869k4(byte[] bArr) {
        if (bArr == null || bArr.length < 36) {
            return false;
        }
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            C3134k4 c3134k4 = new C3134k4(c3152yj);
            try {
                c3134k4.m13384uz();
                c3134k4.m13384uz();
                c3134k4.m13384uz();
                c3134k4.m13384uz();
                c3134k4.m13372dy(10);
                c3134k4.m13387yj();
                c3134k4.m13387yj();
                c3134k4.m13384uz();
                c3134k4.m13382u4();
                return c3134k4.m13382u4() == 20556;
            } finally {
                c3134k4.dispose();
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m10894kk(String str) {
        this.f7459rv = str;
    }

    /* JADX INFO: renamed from: k4 */
    private static long[] m10870k4(C3134k4 c3134k4, int i) {
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = c3134k4.m13384uz();
        }
        return jArr;
    }

    /* JADX INFO: renamed from: kk */
    public final void m10895kk(long[] jArr) {
        if (jArr == null) {
            throw new ArgumentNullException("value");
        }
        if (jArr.length != 4) {
            throw new ArgumentException("Length of array must be 4");
        }
        this.f7464wl = jArr;
    }
}
