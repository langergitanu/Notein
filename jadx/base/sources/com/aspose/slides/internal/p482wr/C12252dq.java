package com.aspose.slides.internal.p482wr;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18293o1;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: renamed from: com.aspose.slides.internal.wr.dq */
/* JADX INFO: loaded from: classes5.dex */
public class C12252dq extends AbstractC3150x6 {

    /* JADX INFO: renamed from: ck */
    public AbstractC3150x6 f40831ck;

    /* JADX INFO: renamed from: du */
    public int f40832du;

    /* JADX INFO: renamed from: dy */
    public byte[] f40833dy;

    /* JADX INFO: renamed from: h4 */
    public int f40835h4;

    /* JADX INFO: renamed from: m9 */
    public boolean f40840m9;

    /* JADX INFO: renamed from: rv */
    public int f40842rv;

    /* JADX INFO: renamed from: to */
    public int f40843to;

    /* JADX INFO: renamed from: up */
    public String f40844up;

    /* JADX INFO: renamed from: x6 */
    private C12263m9 f40846x6;

    /* JADX INFO: renamed from: yj */
    public String f40847yj;

    /* JADX INFO: renamed from: k4 */
    public C12278xk f40837k4 = null;

    /* JADX INFO: renamed from: x1 */
    public int f40845x1 = 2;

    /* JADX INFO: renamed from: c5 */
    public int f40830c5 = 8192;

    /* JADX INFO: renamed from: jd */
    public byte[] f40836jd = new byte[1];

    /* JADX INFO: renamed from: fa */
    public int f40834fa = 0;

    /* JADX INFO: renamed from: ks */
    public C14084qq f40839ks = new C14084qq();

    /* JADX INFO: renamed from: ne */
    private boolean f40841ne = false;

    /* JADX INFO: renamed from: kk */
    public int f40838kk = 0;

    public C12252dq(AbstractC3150x6 abstractC3150x6, int i, int i2, int i3, boolean z) {
        this.f40831ck = abstractC3150x6;
        this.f40840m9 = z;
        this.f40832du = i;
        this.f40843to = i3;
        this.f40835h4 = i2;
        if (i3 == 1952) {
            this.f40846x6 = new C12263m9();
        }
    }

    /* JADX INFO: renamed from: du */
    private void m57209du() {
        boolean z;
        if (this.f40837k4 == null) {
            return;
        }
        int i = this.f40845x1;
        if (i != 0) {
            if (i == 1 && this.f40843to == 1952) {
                if (m57216x1()) {
                    throw new C12250c6("Reading with compression is not supported.");
                }
                C12278xk c12278xk = this.f40837k4;
                if (c12278xk.f41124dy == 0) {
                    return;
                }
                byte[] bArr = new byte[8];
                if (c12278xk.f41129kk != 8) {
                    throw new C12250c6(C14113y2.m67402k4("Protocol error. AvailableBytesIn={0}, expected 8", Integer.valueOf(this.f40837k4.f41129kk)));
                }
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) c12278xk.f41128k4), this.f40837k4.f41134x1, AbstractC14092to.m67208k4((Object) bArr), 0, 8);
                int iM66765du = C14069jd.m66765du(bArr, 0);
                int iM57378x1 = this.f40846x6.m57378x1();
                int iM66765du2 = C14069jd.m66765du(bArr, 4);
                int i2 = (int) (4294967295L & this.f40837k4.f41124dy);
                if (iM57378x1 != iM66765du) {
                    throw new C12250c6(C14113y2.m67402k4("Bad CRC32 in GZIP stream. (actual({0:X8})!=expected({1:X8}))", Integer.valueOf(iM57378x1), Integer.valueOf(iM66765du)));
                }
                if (i2 != iM66765du2) {
                    throw new C12250c6(C14113y2.m67402k4("Bad size in GZIP stream. (actual({0})!=expected({1}))", Integer.valueOf(i2), Integer.valueOf(iM66765du2)));
                }
                return;
            }
            return;
        }
        do {
            this.f40837k4.f41123du = m57214to();
            C12278xk c12278xk2 = this.f40837k4;
            c12278xk2.f41126h4 = 0;
            c12278xk2.f41131m9 = this.f40833dy.length;
            int iM57533x1 = m57216x1() ? this.f40837k4.m57533x1(4) : this.f40837k4.m57527k4(4);
            if (iM57533x1 != 1 && iM57533x1 != 0) {
                throw new C12250c6(C14113y2.m67408k4(m57216x1() ? TranslateLanguage.GERMAN : BackupFile.EXTENSION_NOTEIN_FILE, "flating: ", this.f40837k4.f41121c5));
            }
            byte[] bArr2 = this.f40833dy;
            int length = bArr2.length;
            int i3 = this.f40837k4.f41131m9;
            if (length - i3 > 0) {
                this.f40831ck.write(bArr2, 0, bArr2.length - i3);
            }
            C12278xk c12278xk3 = this.f40837k4;
            z = c12278xk3.f41129kk == 0 && c12278xk3.f41131m9 != 0;
            if (this.f40843to == 1952 && !m57216x1()) {
                C12278xk c12278xk4 = this.f40837k4;
                z = c12278xk4.f41129kk == 8 && c12278xk4.f41131m9 != 0;
            }
        } while (!z);
        flush();
        if (this.f40843to == 1952) {
            if (!m57216x1()) {
                throw new C12250c6("Writing with decompression is not supported.");
            }
            this.f40831ck.write(C14069jd.m66785x1(this.f40846x6.m57378x1()), 0, 4);
            this.f40831ck.write(C14069jd.m66785x1((int) (this.f40846x6.m57376k4() & 4294967295L)), 0, 4);
        }
    }

    /* JADX INFO: renamed from: dy */
    private int m57210dy() {
        byte[] bArr = new byte[10];
        int i = this.f40831ck.read(bArr, 0, 10);
        if (i == 0) {
            return 0;
        }
        if (i != 10) {
            throw new C12250c6("Not a valid GZIP stream.");
        }
        if ((bArr[0] & 255) != 31 || (bArr[1] & 255) != 139 || (bArr[2] & 255) != 8) {
            throw new C12250c6("Bad GZIP header.");
        }
        C12271up.f41033kk.m67128du(C14069jd.m66765du(bArr, 4)).CloneTo(this.f40839ks);
        if ((bArr[3] & 4) == 4) {
            int i2 = this.f40831ck.read(bArr, 0, 2) + i;
            int i3 = (short) (((bArr[1] & 255) * 256) + (bArr[0] & 255));
            int i4 = this.f40831ck.read(new byte[i3], 0, i3);
            if (i4 != i3) {
                throw new C12250c6("Unexpected end-of-file reading GZIP header.");
            }
            i = i2 + i4;
        }
        if ((bArr[3] & 8) == 8) {
            this.f40844up = m57213m9();
        }
        if ((bArr[3] & 16) == 16) {
            this.f40847yj = m57213m9();
        }
        if ((bArr[3] & 2) == 2) {
            read(this.f40836jd, 0, 1);
        }
        return i;
    }

    /* JADX INFO: renamed from: h4 */
    private void m57211h4() {
        if (m57212kk() == null) {
            return;
        }
        if (m57216x1()) {
            this.f40837k4.m57532x1();
        } else {
            this.f40837k4.m57526k4();
        }
        this.f40837k4 = null;
    }

    /* JADX INFO: renamed from: kk */
    private C12278xk m57212kk() {
        if (this.f40837k4 == null) {
            boolean z = this.f40843to == 1950;
            C12278xk c12278xk = new C12278xk();
            this.f40837k4 = c12278xk;
            if (this.f40832du == 1) {
                c12278xk.m57529k4(z);
            } else {
                c12278xk.f41130ks = this.f40834fa;
                c12278xk.m57534x1(this.f40835h4, z);
            }
        }
        return this.f40837k4;
    }

    /* JADX INFO: renamed from: m9 */
    private String m57213m9() {
        C3152yj c3152yj = new C3152yj();
        boolean z = false;
        while (this.f40831ck.read(this.f40836jd, 0, 1) == 1) {
            byte b = this.f40836jd[0];
            if ((b & 255) == 0) {
                z = true;
            } else {
                c3152yj.writeByte(b);
            }
            if (z) {
                byte[] array = c3152yj.toArray();
                return C12271up.f41034to.mo26682x1(array, 0, array.length);
            }
        }
        throw new C12250c6("Unexpected EOF reading GZIP header.");
    }

    /* JADX INFO: renamed from: to */
    private byte[] m57214to() {
        if (this.f40833dy == null) {
            this.f40833dy = new byte[this.f40830c5];
        }
        return this.f40833dy;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        return this.f40831ck.canRead();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return this.f40831ck.canSeek();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        return this.f40831ck.canWrite();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void close() {
        if (this.f40831ck == null) {
            return;
        }
        try {
            m57209du();
        } finally {
            m57211h4();
            if (!this.f40840m9) {
                this.f40831ck.close();
            }
            this.f40831ck = null;
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
        this.f40831ck.flush();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        return this.f40831ck.getLength();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        return this.f40831ck.getPosition();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m57215k4() {
        C12263m9 c12263m9 = this.f40846x6;
        if (c12263m9 == null) {
            return 0;
        }
        return c12263m9.m57378x1();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        int iM57533x1;
        boolean z;
        int iM57533x12;
        if (this.f40845x1 == 2) {
            if (!this.f40831ck.canRead()) {
                throw new C12250c6("The stream is not readable.");
            }
            this.f40845x1 = 1;
            m57212kk().f41129kk = 0;
            if (this.f40843to == 1952) {
                int iM57210dy = m57210dy();
                this.f40842rv = iM57210dy;
                if (iM57210dy == 0) {
                    return 0;
                }
            }
        }
        if (this.f40845x1 != 1) {
            throw new C12250c6("Cannot Read after Writing.");
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f40841ne && m57216x1()) {
            return 0;
        }
        if (bArr == null) {
            throw new ArgumentNullException("buffer");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f);
        }
        if (i < AbstractC14092to.m67208k4((Object) bArr).m67279x1(0)) {
            throw new ArgumentOutOfRangeException("offset");
        }
        if (i + i2 > AbstractC14092to.m67208k4((Object) bArr).m67266du(0)) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f);
        }
        C12278xk c12278xk = this.f40837k4;
        c12278xk.f41123du = bArr;
        c12278xk.f41126h4 = i;
        c12278xk.f41131m9 = i2;
        c12278xk.f41128k4 = m57214to();
        do {
            C12278xk c12278xk2 = this.f40837k4;
            if (c12278xk2.f41129kk == 0 && !this.f40841ne) {
                c12278xk2.f41134x1 = 0;
                AbstractC3150x6 abstractC3150x6 = this.f40831ck;
                byte[] bArr2 = this.f40833dy;
                c12278xk2.f41129kk = abstractC3150x6.read(bArr2, 0, bArr2.length);
                if (this.f40837k4.f41129kk == 0) {
                    this.f40841ne = true;
                }
            }
            iM57533x1 = m57216x1() ? this.f40837k4.m57533x1(this.f40838kk) : this.f40837k4.m57527k4(this.f40838kk);
            z = this.f40841ne;
            if (z && iM57533x1 == -5) {
                return 0;
            }
            if (iM57533x1 != 0 && iM57533x1 != 1) {
                throw new C12250c6(C14113y2.m67402k4("{0}flating:  rc={1}  msg={2}", m57216x1() ? TranslateLanguage.GERMAN : BackupFile.EXTENSION_NOTEIN_FILE, Integer.valueOf(iM57533x1), this.f40837k4.f41121c5));
            }
            if (((z || iM57533x1 == 1) && this.f40837k4.f41131m9 == i2) || this.f40837k4.f41131m9 <= 0 || z) {
                break;
            }
        } while (iM57533x1 == 0);
        C12278xk c12278xk3 = this.f40837k4;
        if (c12278xk3.f41131m9 > 0) {
            if (iM57533x1 == 0) {
                int i3 = c12278xk3.f41129kk;
            }
            if (z && m57216x1() && (iM57533x12 = this.f40837k4.m57533x1(4)) != 0 && iM57533x12 != 1) {
                throw new C12250c6(C14113y2.m67402k4("Deflating:  rc={0}  msg={1}", Integer.valueOf(iM57533x12), this.f40837k4.f41121c5));
            }
        }
        int i4 = i2 - this.f40837k4.f41131m9;
        C12263m9 c12263m9 = this.f40846x6;
        if (c12263m9 != null) {
            c12263m9.m57377k4(bArr, i, i4);
        }
        return i4;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        this.f40831ck.setLength(j);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        this.f40831ck.setPosition(j);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        boolean z;
        C12263m9 c12263m9 = this.f40846x6;
        if (c12263m9 != null) {
            c12263m9.m57377k4(bArr, i, i2);
        }
        int i3 = this.f40845x1;
        if (i3 == 2) {
            this.f40845x1 = 0;
        } else if (i3 != 0) {
            throw new C12250c6("Cannot Write after Reading.");
        }
        if (i2 == 0) {
            return;
        }
        m57212kk().f41128k4 = bArr;
        C12278xk c12278xk = this.f40837k4;
        c12278xk.f41134x1 = i;
        c12278xk.f41129kk = i2;
        do {
            this.f40837k4.f41123du = m57214to();
            C12278xk c12278xk2 = this.f40837k4;
            c12278xk2.f41126h4 = 0;
            c12278xk2.f41131m9 = this.f40833dy.length;
            int iM57533x1 = m57216x1() ? this.f40837k4.m57533x1(this.f40838kk) : this.f40837k4.m57527k4(this.f40838kk);
            if (iM57533x1 != 0 && iM57533x1 != 1) {
                throw new C12250c6(C14113y2.m67408k4(m57216x1() ? TranslateLanguage.GERMAN : BackupFile.EXTENSION_NOTEIN_FILE, "flating: ", this.f40837k4.f41121c5));
            }
            AbstractC3150x6 abstractC3150x6 = this.f40831ck;
            byte[] bArr2 = this.f40833dy;
            abstractC3150x6.write(bArr2, 0, bArr2.length - this.f40837k4.f41131m9);
            C12278xk c12278xk3 = this.f40837k4;
            z = c12278xk3.f41129kk == 0 && c12278xk3.f41131m9 != 0;
            if (this.f40843to == 1952 && !m57216x1()) {
                C12278xk c12278xk4 = this.f40837k4;
                z = c12278xk4.f41129kk == 8 && c12278xk4.f41131m9 != 0;
            }
        } while (!z);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m57216x1() {
        return this.f40832du == 0;
    }
}
