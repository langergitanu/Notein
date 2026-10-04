package com.aspose.slides.internal.p558zz;

import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.p080dd.C3123ar;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.zz.k4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13639k4 {

    /* JADX INFO: renamed from: k4 */
    private final int f45313k4;

    /* JADX INFO: renamed from: kk */
    private boolean f45314kk;

    /* JADX INFO: renamed from: x1 */
    private int f45315x1;

    public AbstractC13639k4(int i, int i2) {
        this(i, i2, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m62972k4() {
        return this.f45315x1;
    }

    /* JADX INFO: renamed from: kk */
    public abstract int mo62955kk(int i);

    /* JADX INFO: renamed from: kk */
    public abstract int mo62956kk(int i, byte[] bArr, int i2, int i3);

    /* JADX INFO: renamed from: to */
    public abstract int mo62957to(int i, byte[] bArr, int i2, int i3);

    public final String toString() {
        return m62976k4(0, 0);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m62980x1() {
        return this.f45313k4;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract void mo62958x1(int i, byte b);

    public AbstractC13639k4(int i, int i2, boolean z) {
        this.f45313k4 = i2;
        m62981x1(i);
        this.f45314kk = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m62973k4(int i) {
        if (i < 0 || i >= this.f45315x1) {
            return -1;
        }
        return mo62955kk(i) & 255;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m62981x1(int i) {
        int iM67507x1 = C14116yg.m67507x1(i, this.f45313k4);
        this.f45315x1 = iM67507x1;
        return iM67507x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m62974k4(int i, AbstractC13639k4 abstractC13639k4, int i2, int i3) {
        byte[] bArr = new byte[8192];
        int iM67507x1 = C14116yg.m67507x1(8192, i3);
        int i4 = 0;
        while (true) {
            int iM62975k4 = m62975k4(i4 + i2, bArr, 0, iM67507x1);
            if (iM62975k4 <= 0) {
                return i4;
            }
            abstractC13639k4.m62982x1(i4 + i, bArr, 0, iM62975k4);
            i4 += iM62975k4;
            i3 -= iM62975k4;
            iM67507x1 = C14116yg.m67507x1(8192, i3);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final int m62982x1(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i >= m62980x1()) {
            throw new IndexOutOfRangeException("Attempt to write outside the bounds of the data.");
        }
        int iMo62956kk = mo62956kk(i, bArr, i2, C14116yg.m67507x1(i3, m62980x1() - i));
        this.f45315x1 = C14116yg.m67483k4(this.f45315x1, i + iMo62956kk);
        return iMo62956kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m62975k4(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i >= (i4 = this.f45315x1)) {
            return 0;
        }
        return mo62957to(i, bArr, i2, C14116yg.m67507x1(i3, i4 - i));
    }

    /* JADX INFO: renamed from: k4 */
    public int mo62954k4(C3123ar c3123ar, int i, int i2) {
        byte[] bArr = new byte[8192];
        int iM67507x1 = C14116yg.m67507x1(8192, i2);
        int i3 = 0;
        while (true) {
            int iM62975k4 = m62975k4(i3 + i, bArr, 0, iM67507x1);
            if (iM62975k4 <= 0) {
                return i3;
            }
            c3123ar.m13301k4().write(bArr, 0, iM62975k4);
            i3 += iM62975k4;
            iM67507x1 = C14116yg.m67507x1(8192, i2 - i3);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final String m62976k4(int i, int i2) {
        if (i2 == -1) {
            i2 = m62972k4();
        }
        int iM67507x1 = C14116yg.m67507x1(i2, m62972k4());
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(C14113y2.m67408k4("[l=", C14057f9.m66591x1(this.f45315x1), ", s=", C14057f9.m66591x1(m62980x1()), "]"));
        if (iM67507x1 > 0) {
            c6765kp.m26792k4(IOUtils.LINE_SEPARATOR_UNIX);
        }
        for (int i3 = 0; i3 < iM67507x1; i3++) {
            int iM62973k4 = m62973k4(i3 + i);
            if (iM62973k4 < 16) {
                c6765kp.m26792k4("0");
            }
            c6765kp.m26792k4(C14113y2.m67402k4("{0:x}", Integer.valueOf(iM62973k4)));
            c6765kp.m26792k4(" ");
            if (i3 > 0 && (i3 + 1) % 16 == 0) {
                c6765kp.m26792k4(IOUtils.LINE_SEPARATOR_UNIX);
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62977k4(int i, byte b) {
        if (i < 0 || i >= m62980x1()) {
            throw new IndexOutOfRangeException("Attempt to write outside the bounds of the data.");
        }
        mo62958x1(i, b);
        this.f45315x1 = C14116yg.m67483k4(this.f45315x1, i + 1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62978k4(C3148wl c3148wl) {
        byte[] bArr = new byte[8192];
        int i = 0;
        while (true) {
            int i2 = c3148wl.mo13437k4().read(bArr, 0, 8192);
            if (i2 <= 0) {
                return;
            }
            if (m62982x1(i, bArr, 0, i2) != i2) {
                throw new IOException("Error writing bytes.");
            }
            i += i2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62979k4(C3148wl c3148wl, int i) {
        byte[] bArr = new byte[8192];
        int iM67507x1 = C14116yg.m67507x1(8192, i);
        int i2 = 0;
        while (true) {
            int i3 = c3148wl.mo13437k4().read(bArr, 0, iM67507x1);
            if (i3 <= 0) {
                return;
            }
            if (m62982x1(i2, bArr, 0, i3) != i3) {
                throw new IOException("Error writing bytes.");
            }
            i2 += i3;
            i -= i3;
            iM67507x1 = C14116yg.m67507x1(8192, i);
        }
    }
}
