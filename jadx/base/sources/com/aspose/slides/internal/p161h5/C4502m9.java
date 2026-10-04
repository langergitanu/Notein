package com.aspose.slides.internal.p161h5;

import Oooo0.C20856OooooOo;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p188ip.C5112k4;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.backup.BackupFile;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.aspose.slides.internal.h5.m9 */
/* JADX INFO: loaded from: classes.dex */
class C4502m9 extends AbstractC3150x6 {

    /* JADX INFO: renamed from: ck */
    AbstractC3150x6 f12474ck;

    /* JADX INFO: renamed from: du */
    int f12475du;

    /* JADX INFO: renamed from: dy */
    byte[] f12476dy;

    /* JADX INFO: renamed from: h4 */
    int f12478h4;

    /* JADX INFO: renamed from: m9 */
    boolean f12483m9;

    /* JADX INFO: renamed from: rv */
    int f12485rv;

    /* JADX INFO: renamed from: to */
    int f12486to;

    /* JADX INFO: renamed from: up */
    String f12487up;

    /* JADX INFO: renamed from: x6 */
    private C5112k4 f12489x6;

    /* JADX INFO: renamed from: yj */
    String f12490yj;

    /* JADX INFO: renamed from: k4 */
    C4505to f12480k4 = null;

    /* JADX INFO: renamed from: x1 */
    int f12488x1 = 2;

    /* JADX INFO: renamed from: c5 */
    int f12473c5 = 16384;

    /* JADX INFO: renamed from: jd */
    byte[] f12479jd = new byte[1];

    /* JADX INFO: renamed from: fa */
    int f12477fa = 0;

    /* JADX INFO: renamed from: ks */
    C14084qq f12482ks = new C14084qq();

    /* JADX INFO: renamed from: ne */
    private boolean f12484ne = false;

    /* JADX INFO: renamed from: kk */
    int f12481kk = 0;

    public C4502m9(AbstractC3150x6 abstractC3150x6, int i, int i2, int i3, boolean z) {
        this.f12474ck = abstractC3150x6;
        this.f12483m9 = z;
        this.f12475du = i;
        this.f12486to = i3;
        this.f12478h4 = i2;
        if (i3 == 1952) {
            this.f12489x6 = new C5112k4();
        }
    }

    /* JADX INFO: renamed from: du */
    private void m18566du() {
        boolean z;
        if (this.f12480k4 == null) {
            return;
        }
        int i = this.f12488x1;
        if (i == 0) {
            do {
                this.f12480k4.f12503du = m18571to();
                C4505to c4505to = this.f12480k4;
                c4505to.f12506h4 = 0;
                c4505to.f12511m9 = this.f12476dy.length;
                int iM18583x1 = m18573x1() ? this.f12480k4.m18583x1(4) : this.f12480k4.m18577k4(4);
                if (iM18583x1 != 1 && iM18583x1 != 0) {
                    String strM67408k4 = C14113y2.m67408k4(m18573x1() ? TranslateLanguage.GERMAN : BackupFile.EXTENSION_NOTEIN_FILE, "flating");
                    if (this.f12480k4.f12501c5 != null) {
                        throw new C4493du(C14113y2.m67408k4(strM67408k4, ": ", this.f12480k4.f12501c5));
                    }
                    throw new C4493du(C14113y2.m67402k4("{0}: (rc = {1})", strM67408k4, Integer.valueOf(iM18583x1)));
                }
                byte[] bArr = this.f12476dy;
                int length = bArr.length;
                int i2 = this.f12480k4.f12511m9;
                if (length - i2 > 0) {
                    this.f12474ck.write(bArr, 0, bArr.length - i2);
                }
                C4505to c4505to2 = this.f12480k4;
                z = c4505to2.f12509kk == 0 && c4505to2.f12511m9 != 0;
                if (this.f12486to == 1952 && !m18573x1()) {
                    C4505to c4505to3 = this.f12480k4;
                    z = c4505to3.f12509kk == 8 && c4505to3.f12511m9 != 0;
                }
            } while (!z);
            flush();
            if (this.f12486to == 1952) {
                if (!m18573x1()) {
                    throw new C4493du("Writing with decompression is not supported.");
                }
                this.f12474ck.write(C14069jd.m66785x1(this.f12489x6.m21958x1()), 0, 4);
                this.f12474ck.write(C14069jd.m66785x1((int) (this.f12489x6.m21956k4() & 4294967295L)), 0, 4);
                return;
            }
            return;
        }
        if (i == 1 && this.f12486to == 1952) {
            if (m18573x1()) {
                throw new C4493du("Reading with compression is not supported.");
            }
            C4505to c4505to4 = this.f12480k4;
            if (c4505to4.f12504dy == 0) {
                return;
            }
            byte[] bArr2 = new byte[8];
            int i3 = c4505to4.f12509kk;
            if (i3 < 8) {
                System.arraycopy(c4505to4.f12508k4, c4505to4.f12514x1, bArr2, 0, i3);
                int i4 = this.f12480k4.f12509kk;
                int i5 = 8 - i4;
                int i6 = this.f12474ck.read(bArr2, i4, i5);
                if (i5 != i6) {
                    throw new C4493du("Missing or incomplete GZIP trailer. Expected 8 bytes, got " + this.f12480k4.f12509kk + i6 + ".");
                }
            } else {
                System.arraycopy(c4505to4.f12508k4, c4505to4.f12514x1, bArr2, 0, 8);
            }
            int iM66765du = C14069jd.m66765du(bArr2, 0);
            int iM21958x1 = this.f12489x6.m21958x1();
            int iM66765du2 = C14069jd.m66765du(bArr2, 4);
            int i7 = (int) (4294967295L & this.f12480k4.f12504dy);
            if (iM21958x1 != iM66765du) {
                throw new C4493du(C20856OooooOo.OooO0O0("Bad CRC32 in GZIP trailer. (actual(", iM21958x1, ")!=expected(", "))", iM66765du));
            }
            if (i7 != iM66765du2) {
                throw new C4493du(C20856OooooOo.OooO0O0("Bad size in GZIP trailer. (actual(", i7, ")!=expected(", "))", iM66765du2));
            }
        }
    }

    /* JADX INFO: renamed from: dy */
    private int m18567dy() {
        byte[] bArr = new byte[10];
        int i = this.f12474ck.read(bArr, 0, 10);
        if (i == 0) {
            return 0;
        }
        if (i != 10) {
            throw new C4493du("Not a valid GZIP stream.");
        }
        if (bArr[0] != 31 || (bArr[1] & 255) != 139 || bArr[2] != 8) {
            throw new C4493du("Bad GZIP header.");
        }
        C4500kk.f12453kk.m67128du(C14069jd.m66765du(bArr, 4)).CloneTo(this.f12482ks);
        if ((bArr[3] & 4) == 4) {
            int i2 = this.f12474ck.read(bArr, 0, 2) + i;
            int i3 = (short) (((bArr[1] & 255) * 256) + (bArr[0] & 255));
            int i4 = this.f12474ck.read(new byte[i3], 0, i3);
            if (i4 != i3) {
                throw new C4493du("Unexpected end-of-file reading GZIP header.");
            }
            i = i2 + i4;
        }
        if ((bArr[3] & 8) == 8) {
            this.f12487up = m18570m9();
        }
        if ((bArr[3] & 16) == 16) {
            this.f12490yj = m18570m9();
        }
        if ((bArr[3] & 2) == 2) {
            read(this.f12479jd, 0, 1);
        }
        return i;
    }

    /* JADX INFO: renamed from: h4 */
    private void m18568h4() {
        if (m18569kk() == null) {
            return;
        }
        if (m18573x1()) {
            this.f12480k4.m18582x1();
        } else {
            this.f12480k4.m18576k4();
        }
        this.f12480k4 = null;
    }

    /* JADX INFO: renamed from: kk */
    private C4505to m18569kk() {
        if (this.f12480k4 == null) {
            boolean z = this.f12486to == 1950;
            C4505to c4505to = new C4505to();
            this.f12480k4 = c4505to;
            if (this.f12475du == 1) {
                c4505to.m18579k4(z);
            } else {
                c4505to.f12510ks = this.f12477fa;
                c4505to.m18584x1(this.f12478h4, z);
            }
        }
        return this.f12480k4;
    }

    /* JADX INFO: renamed from: m9 */
    private String m18570m9() {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (this.f12474ck.read(this.f12479jd, 0, 1) == 1) {
            byte b = this.f12479jd[0];
            if (b == 0) {
                z = true;
            } else {
                arrayList.add(Byte.valueOf(b));
            }
            if (z) {
                int size = arrayList.size();
                byte[] bArr = new byte[size];
                for (int i = 0; i < arrayList.size(); i++) {
                    bArr[i] = ((Byte) arrayList.get(i)).byteValue();
                }
                return C4500kk.f12454to.mo26682x1(bArr, 0, size);
            }
        }
        throw new C4493du("Unexpected EOF reading GZIP header.");
    }

    /* JADX INFO: renamed from: to */
    private byte[] m18571to() {
        if (this.f12476dy == null) {
            this.f12476dy = new byte[this.f12473c5];
        }
        return this.f12476dy;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        return this.f12474ck.canRead();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return this.f12474ck.canSeek();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        return this.f12474ck.canWrite();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void close() {
        if (this.f12474ck == null) {
            return;
        }
        try {
            m18566du();
        } finally {
            m18568h4();
            if (!this.f12483m9) {
                this.f12474ck.close();
            }
            this.f12474ck = null;
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
        this.f12474ck.flush();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        return this.f12474ck.getLength();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: k4 */
    public int m18572k4() {
        C5112k4 c5112k4 = this.f12489x6;
        if (c5112k4 == null) {
            return 0;
        }
        return c5112k4.m21958x1();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        int iM18583x1;
        boolean z;
        int iM18583x12;
        if (this.f12488x1 == 2) {
            if (!this.f12474ck.canRead()) {
                throw new C4493du("The stream is not readable.");
            }
            this.f12488x1 = 1;
            m18569kk().f12509kk = 0;
            if (this.f12486to == 1952) {
                int iM18567dy = m18567dy();
                this.f12485rv = iM18567dy;
                if (iM18567dy == 0) {
                    return 0;
                }
            }
        }
        if (this.f12488x1 != 1) {
            throw new C4493du("Cannot Read after Writing.");
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f12484ne && m18573x1()) {
            return 0;
        }
        if (bArr == null) {
            throw new IllegalArgumentException("buffer");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Parameter name: count");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Parameter name: offset");
        }
        if (i + i2 > bArr.length) {
            throw new IllegalArgumentException("Parameter name: count");
        }
        C4505to c4505to = this.f12480k4;
        c4505to.f12503du = bArr;
        c4505to.f12506h4 = i;
        c4505to.f12511m9 = i2;
        c4505to.f12508k4 = m18571to();
        do {
            C4505to c4505to2 = this.f12480k4;
            if (c4505to2.f12509kk == 0 && !this.f12484ne) {
                c4505to2.f12514x1 = 0;
                AbstractC3150x6 abstractC3150x6 = this.f12474ck;
                byte[] bArr2 = this.f12476dy;
                c4505to2.f12509kk = abstractC3150x6.read(bArr2, 0, bArr2.length);
                if (this.f12480k4.f12509kk == 0) {
                    this.f12484ne = true;
                }
            }
            iM18583x1 = m18573x1() ? this.f12480k4.m18583x1(this.f12481kk) : this.f12480k4.m18577k4(this.f12481kk);
            z = this.f12484ne;
            if (z && iM18583x1 == -5) {
                return 0;
            }
            if (iM18583x1 != 0 && iM18583x1 != 1) {
                throw new C4493du(C14113y2.m67402k4("{0}flating:  rc={1}  msg={2}", m18573x1() ? TranslateLanguage.GERMAN : BackupFile.EXTENSION_NOTEIN_FILE, Integer.valueOf(iM18583x1), this.f12480k4.f12501c5));
            }
            if (((z || iM18583x1 == 1) && this.f12480k4.f12511m9 == i2) || this.f12480k4.f12511m9 <= 0 || z) {
                break;
            }
        } while (iM18583x1 == 0);
        C4505to c4505to3 = this.f12480k4;
        if (c4505to3.f12511m9 > 0) {
            if (iM18583x1 == 0) {
                int i3 = c4505to3.f12509kk;
            }
            if (z && m18573x1() && (iM18583x12 = this.f12480k4.m18583x1(4)) != 0 && iM18583x12 != 1) {
                throw new C4493du(C14113y2.m67402k4("Deflating:  rc={0}  msg={1}", Integer.valueOf(iM18583x12), this.f12480k4.f12501c5));
            }
        }
        int i4 = i2 - this.f12480k4.f12511m9;
        C5112k4 c5112k4 = this.f12489x6;
        if (c5112k4 != null) {
            c5112k4.m21957k4(bArr, i, i4);
        }
        return i4;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        this.f12474ck.setLength(j);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        boolean z;
        C5112k4 c5112k4 = this.f12489x6;
        if (c5112k4 != null) {
            c5112k4.m21957k4(bArr, i, i2);
        }
        int i3 = this.f12488x1;
        if (i3 == 2) {
            this.f12488x1 = 0;
        } else if (i3 != 0) {
            throw new C4493du("Cannot Write after Reading.");
        }
        if (i2 == 0) {
            return;
        }
        m18569kk().f12508k4 = bArr;
        C4505to c4505to = this.f12480k4;
        c4505to.f12514x1 = i;
        c4505to.f12509kk = i2;
        do {
            this.f12480k4.f12503du = m18571to();
            C4505to c4505to2 = this.f12480k4;
            c4505to2.f12506h4 = 0;
            c4505to2.f12511m9 = this.f12476dy.length;
            int iM18583x1 = m18573x1() ? this.f12480k4.m18583x1(this.f12481kk) : this.f12480k4.m18577k4(this.f12481kk);
            if (iM18583x1 != 0 && iM18583x1 != 1) {
                throw new C4493du(C14113y2.m67408k4(m18573x1() ? TranslateLanguage.GERMAN : BackupFile.EXTENSION_NOTEIN_FILE, "flating: ", this.f12480k4.f12501c5));
            }
            AbstractC3150x6 abstractC3150x6 = this.f12474ck;
            byte[] bArr2 = this.f12476dy;
            abstractC3150x6.write(bArr2, 0, bArr2.length - this.f12480k4.f12511m9);
            C4505to c4505to3 = this.f12480k4;
            z = c4505to3.f12509kk == 0 && c4505to3.f12511m9 != 0;
            if (this.f12486to == 1952 && !m18573x1()) {
                C4505to c4505to4 = this.f12480k4;
                z = c4505to4.f12509kk == 8 && c4505to4.f12511m9 != 0;
            }
        } while (!z);
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m18573x1() {
        return this.f12475du == 0;
    }
}
