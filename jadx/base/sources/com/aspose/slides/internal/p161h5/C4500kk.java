package com.aspose.slides.internal.p161h5;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14084qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.h5.kk */
/* JADX INFO: loaded from: classes.dex */
public class C4500kk extends AbstractC3150x6 {

    /* JADX INFO: renamed from: kk */
    static C14084qq f12453kk = new C14084qq(1970, 1, 1, 0, 0, 0, 1L);

    /* JADX INFO: renamed from: to */
    static AbstractC6747ar f12454to = null;

    /* JADX INFO: renamed from: c5 */
    private String f12455c5;

    /* JADX INFO: renamed from: du */
    private int f12456du;

    /* JADX INFO: renamed from: dy */
    private String f12457dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f12458h4;

    /* JADX INFO: renamed from: jd */
    private int f12459jd;

    /* JADX INFO: renamed from: k4 */
    public C14084qq f12460k4;

    /* JADX INFO: renamed from: m9 */
    private boolean f12461m9;

    /* JADX INFO: renamed from: x1 */
    C4502m9 f12462x1;

    public C4500kk(AbstractC3150x6 abstractC3150x6, int i) {
        this(abstractC3150x6, i, 6, false);
    }

    /* JADX INFO: renamed from: kk */
    private int m18556kk() {
        if (f12454to == null) {
            f12454to = AbstractC6747ar.m26640kk("iso-8859-1");
        }
        byte[] bArrMo26677to = m18557k4() == null ? null : f12454to.mo26677to(m18557k4());
        byte[] bArrMo26677to2 = m18559x1() != null ? f12454to.mo26677to(m18559x1()) : null;
        int length = m18557k4() == null ? 0 : bArrMo26677to.length + 1;
        int length2 = m18559x1() == null ? 0 : bArrMo26677to2.length + 1;
        int i = length + 10 + length2;
        byte[] bArr = new byte[i];
        bArr[0] = 31;
        bArr[1] = -117;
        bArr[2] = 8;
        byte b = m18557k4() != null ? (byte) 16 : (byte) 0;
        if (m18559x1() != null) {
            b = (byte) (b ^ 8);
        }
        bArr[3] = b;
        if (this.f12460k4.equals(C14084qq.f47299x1)) {
            C14084qq.m67081jd().CloneTo(this.f12460k4);
        }
        System.arraycopy(C14069jd.m66785x1((int) C14084qq.m67073c5(this.f12460k4, f12453kk).Clone().m66811c5()), 0, bArr, 4, 4);
        bArr[8] = 0;
        bArr[9] = -1;
        int i2 = 10;
        if (length2 != 0) {
            System.arraycopy(bArrMo26677to2, 0, bArr, 10, length2 - 1);
            i2 = length2 + 10;
            bArr[length2 + 9] = 0;
        }
        if (length != 0) {
            int i3 = length - 1;
            System.arraycopy(bArrMo26677to, 0, bArr, i2, i3);
            bArr[i2 + i3] = 0;
        }
        this.f12462x1.f12474ck.write(bArr, 0, i);
        return i;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        if (this.f12458h4) {
            throw new ObjectDisposedException("GZipStream");
        }
        return this.f12462x1.f12474ck.canRead();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return false;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        if (this.f12458h4) {
            throw new ObjectDisposedException("GZipStream");
        }
        return this.f12462x1.f12474ck.canWrite();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void dispose(boolean z) {
        C4502m9 c4502m9;
        try {
            if (!this.f12458h4) {
                if (z && (c4502m9 = this.f12462x1) != null) {
                    c4502m9.close();
                    this.f12459jd = this.f12462x1.m18572k4();
                }
                this.f12458h4 = true;
            }
            super.dispose(z);
        } catch (Throwable th) {
            super.dispose(z);
            throw th;
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
        if (this.f12458h4) {
            throw new ObjectDisposedException("GZipStream");
        }
        this.f12462x1.flush();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        C4502m9 c4502m9 = this.f12462x1;
        int i = c4502m9.f12488x1;
        if (i == 0) {
            return c4502m9.f12480k4.f12504dy + ((long) this.f12456du);
        }
        if (i == 1) {
            return c4502m9.f12480k4.f12512to + ((long) c4502m9.f12485rv);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k4 */
    public String m18557k4() {
        return this.f12455c5;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        if (this.f12458h4) {
            throw new ObjectDisposedException("GZipStream");
        }
        int i3 = this.f12462x1.read(bArr, i, i2);
        if (!this.f12461m9) {
            this.f12461m9 = true;
            m18560x1(this.f12462x1.f12487up);
            m18558k4(this.f12462x1.f12490yj);
        }
        return i3;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        if (this.f12458h4) {
            throw new ObjectDisposedException("GZipStream");
        }
        C4502m9 c4502m9 = this.f12462x1;
        if (c4502m9.f12488x1 == 2) {
            if (!c4502m9.m18573x1()) {
                throw new IllegalStateException();
            }
            this.f12456du = m18556kk();
        }
        this.f12462x1.write(bArr, i, i2);
    }

    /* JADX INFO: renamed from: x1 */
    public String m18559x1() {
        return this.f12457dy;
    }

    public C4500kk(AbstractC3150x6 abstractC3150x6, int i, int i2, boolean z) {
        this.f12460k4 = C14084qq.f47299x1.Clone();
        this.f12462x1 = new C4502m9(abstractC3150x6, i, i2, 1952, z);
    }

    /* JADX INFO: renamed from: k4 */
    public void m18558k4(String str) {
        if (this.f12458h4) {
            throw new ObjectDisposedException("GZipStream");
        }
        this.f12455c5 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public void m18560x1(String str) {
        if (this.f12458h4) {
            throw new ObjectDisposedException("GZipStream");
        }
        this.f12457dy = str;
        if (str == null) {
            return;
        }
        if (str.indexOf("/") != -1) {
            this.f12457dy = this.f12457dy.replace("/", "\\");
        }
        if (this.f12457dy.endsWith("\\")) {
            throw new RuntimeException("Illegal filename");
        }
        if (this.f12457dy.indexOf("\\") != -1) {
            this.f12457dy = C3141rv.m13403k4(this.f12457dy);
        }
    }
}
