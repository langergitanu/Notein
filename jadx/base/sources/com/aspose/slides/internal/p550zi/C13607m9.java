package com.aspose.slides.internal.p550zi;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.m9 */
/* JADX INFO: loaded from: classes5.dex */
public class C13607m9 {

    /* JADX INFO: renamed from: h4 */
    private static boolean f45179h4;

    /* JADX INFO: renamed from: kk */
    private static int f45181kk;

    /* JADX INFO: renamed from: to */
    private static int f45182to;

    /* JADX INFO: renamed from: x1 */
    private static int f45183x1;

    /* JADX INFO: renamed from: k4 */
    private static final List<k4> f45180k4 = new List<>();

    /* JADX INFO: renamed from: du */
    private static String f45178du = C3141rv.m13402k4();

    /* JADX INFO: renamed from: com.aspose.slides.internal.zi.m9$k4 */
    public static final class k4 extends AbstractC3150x6 {

        /* JADX INFO: renamed from: k4 */
        private int f45184k4;

        /* JADX INFO: renamed from: kk */
        private AbstractC3150x6 f45185kk;

        /* JADX INFO: renamed from: x1 */
        private long f45186x1;

        public k4(AbstractC3150x6 abstractC3150x6, int i) {
            this.f45185kk = abstractC3150x6;
            this.f45184k4 = i;
            this.f45186x1 = abstractC3150x6.getLength();
        }

        /* JADX INFO: renamed from: kk */
        private void m62775kk() {
            this.f45185kk.dispose();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public boolean canRead() {
            return this.f45185kk.canRead();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public boolean canSeek() {
            return this.f45185kk.canSeek();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public boolean canWrite() {
            return this.f45185kk.canWrite();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void dispose(boolean z) {
            if (z) {
                try {
                    m62775kk();
                } finally {
                    C13607m9.m62773x1(this);
                }
            }
            super.dispose(z);
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void flush() {
            this.f45185kk.flush();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public long getLength() {
            return this.f45185kk.getLength();
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public long getPosition() {
            return this.f45185kk.getPosition();
        }

        /* JADX INFO: renamed from: k4 */
        public int m62776k4() {
            return this.f45184k4;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public int read(byte[] bArr, int i, int i2) {
            return this.f45185kk.read(bArr, i, i2);
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public long seek(long j, int i) {
            return this.f45185kk.seek(j, i);
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void setLength(long j) {
            if (j != this.f45185kk.getLength()) {
                C13607m9.m62774x1(this, j);
                this.f45185kk.setLength(j);
                this.f45186x1 = j;
            }
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void setPosition(long j) {
            this.f45185kk.setPosition(j);
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void write(byte[] bArr, int i, int i2) {
            long jM67486k4 = C14116yg.m67486k4(getPosition() + ((long) ((bArr == null || i < 0 || i2 < 0 || i + i2 > bArr.length) ? 0 : i2)), getLength());
            C13607m9.m62774x1(this, jM67486k4);
            this.f45185kk.write(bArr, i, i2);
            this.f45186x1 = jM67486k4;
        }

        @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
        public void writeByte(byte b) {
            long jM67486k4 = C14116yg.m67486k4(getPosition() + 1, getLength());
            C13607m9.m62774x1(this, jM67486k4);
            this.f45185kk.writeByte(b);
            this.f45186x1 = jM67486k4;
        }

        /* JADX INFO: renamed from: x1 */
        public long m62778x1() {
            return this.f45186x1;
        }

        /* JADX INFO: renamed from: k4 */
        public void m62777k4(AbstractC3150x6 abstractC3150x6, int i) {
            m62775kk();
            this.f45185kk = abstractC3150x6;
            this.f45184k4 = i;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static long m62763k4() {
        long jM62778x1 = 0;
        for (k4 k4Var : f45180k4) {
            if (k4Var.m62776k4() == 0) {
                jM62778x1 += k4Var.m62778x1();
            }
        }
        return jM62778x1;
    }

    /* JADX INFO: renamed from: kk */
    public static int m62769kk() {
        return f45183x1;
    }

    /* JADX INFO: renamed from: to */
    public static int m62770to() {
        return f45182to;
    }

    /* JADX INFO: renamed from: x1 */
    public static long m62771x1() {
        long jM62778x1 = 0;
        for (k4 k4Var : f45180k4) {
            if (k4Var.m62776k4() == 1) {
                jM62778x1 += k4Var.m62778x1();
            }
        }
        return jM62778x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static C13618wy m62764k4(long j) {
        k4 k4Var;
        int i;
        k4 k4Var2;
        int i2 = f45182to;
        k4 k4Var3 = null;
        if (i2 == 2 || i2 == 0) {
            if (f45183x1 == 0 || m62763k4() + j <= f45183x1) {
                try {
                    k4Var = new k4(new C3152yj(), 0);
                    try {
                        k4Var.setLength(j);
                        f45180k4.addItem(k4Var);
                        k4Var3 = k4Var;
                    } catch (RuntimeException e) {
                        e = e;
                        if (k4Var != null) {
                            k4Var.dispose();
                        } else {
                            k4Var3 = k4Var;
                        }
                        if (f45182to == 2) {
                            throw e;
                        }
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    k4Var = null;
                }
            } else if (f45182to == 2) {
                throw new OutOfMemoryException(C14113y2.m67402k4("Cannot allocate {0} bytes in-memory as upper limit has reached.", Long.valueOf(j)));
            }
        }
        if (k4Var3 == null && ((i = f45182to) == 1 || i == 0)) {
            AbstractC3150x6 abstractC3150x6M62772x1 = m62772x1(j);
            try {
                k4Var2 = new k4(abstractC3150x6M62772x1, 1);
            } catch (RuntimeException e3) {
                e = e3;
            }
            try {
                f45180k4.addItem(k4Var2);
                k4Var3 = k4Var2;
            } catch (RuntimeException e4) {
                e = e4;
                k4Var3 = k4Var2;
                if (k4Var3 != null) {
                    k4Var3.dispose();
                }
                abstractC3150x6M62772x1.dispose();
                throw e;
            }
        }
        return new C13618wy(k4Var3, true);
    }

    /* JADX INFO: renamed from: x1 */
    private static AbstractC3150x6 m62772x1(long j) {
        C3130fa c3130faM13350k4;
        String strM13412x1;
        if (f45181kk != 0 && m62771x1() + j > f45181kk) {
            throw new OutOfMemoryException(C14113y2.m67402k4("Cannot allocate {0} bytes on disk as upper limit has reached.", Long.valueOf(j)));
        }
        do {
            c3130faM13350k4 = null;
            try {
                strM13412x1 = C3141rv.m13412x1(f45178du, C14113y2.m67408k4(C14047bz.m66536x1().toString(), ".tmp"));
            } catch (RuntimeException e) {
                if (c3130faM13350k4 != null) {
                    c3130faM13350k4.dispose();
                }
                throw e;
            }
        } while (C3131h4.m13361kk(strM13412x1));
        c3130faM13350k4 = C3131h4.m13350k4(strM13412x1);
        c3130faM13350k4.setLength(j);
        return c3130faM13350k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m62765k4(AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62) {
        m62766k4(abstractC3150x6, abstractC3150x62, 4096, abstractC3150x6.getLength());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static void m62773x1(k4 k4Var) {
        f45180k4.removeItem(k4Var);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m62766k4(AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62, int i, long j) {
        int i2;
        int iMin = (int) Math.min(i, j);
        byte[] bArr = new byte[iMin];
        while (j > 0 && (i2 = abstractC3150x6.read(bArr, 0, (int) C14116yg.m67492kk(iMin, j))) > 0) {
            abstractC3150x62.write(bArr, 0, i2);
            j -= (long) i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static void m62774x1(k4 k4Var, long j) {
        long jM62778x1 = j - k4Var.m62778x1();
        if (!f45179h4 || jM62778x1 <= 0) {
            return;
        }
        if (k4Var.m62776k4() != 0) {
            if (f45181kk != 0 && m62771x1() + jM62778x1 > f45181kk) {
                throw new OutOfMemoryException(C14113y2.m67402k4("Cannot perform reallocate for additional {0} bytes on disk as upper limit has reached.", Long.valueOf(jM62778x1)));
            }
        } else {
            if (m62769kk() == 0 || m62763k4() + jM62778x1 <= m62769kk()) {
                return;
            }
            AbstractC3150x6 abstractC3150x6M62772x1 = m62772x1(k4Var.getLength());
            try {
                long position = k4Var.getPosition();
                k4Var.seek(0L, 0);
                m62765k4(k4Var, abstractC3150x6M62772x1);
                abstractC3150x6M62772x1.setPosition(0L);
                k4Var.m62777k4(abstractC3150x6M62772x1, 1);
                abstractC3150x6M62772x1.setPosition(position);
            } catch (RuntimeException e) {
                abstractC3150x6M62772x1.dispose();
                throw e;
            }
        }
    }
}
