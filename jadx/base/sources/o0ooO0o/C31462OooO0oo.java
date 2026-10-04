package o0ooO0o;

import Oooo0oO.C21023OooO0Oo;
import Oooo0oO.o0Oo0oo;
import android.util.Log;
import com.huawei.hms.network.embedded.C18177fb;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.BitSet;

/* JADX INFO: renamed from: o0ooO0o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31462OooO0oo implements Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final File f112520OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public RandomAccessFile f112522OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public File f112523OooOoO0;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public volatile byte[][] f112525OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final BitSet f112526OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final int f112527OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final int f112528OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final boolean f112529Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final boolean f112530Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public volatile boolean f112531Oooo00o;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Object f112521OooOo0o = new Object();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public volatile int f112524OooOoOO = 0;

    public C31462OooO0oo(C31456OooO0O0 c31456OooO0O0) throws IOException {
        BitSet bitSet = new BitSet();
        this.f112526OooOoo0 = bitSet;
        this.f112531Oooo00o = false;
        boolean z = !c31456OooO0O0.f112493OooO00o || c31456OooO0O0.f112495OooO0OO >= 0;
        this.f112530Oooo00O = z;
        this.f112529Oooo000 = z && c31456OooO0O0.f112494OooO0O0;
        this.f112520OooOo = null;
        long j = c31456OooO0O0.f112496OooO0Oo;
        int iMin = Integer.MAX_VALUE;
        this.f112528OooOooo = j > 0 ? (int) Math.min(2147483647L, j / 4096) : Integer.MAX_VALUE;
        if (c31456OooO0O0.f112493OooO00o) {
            long j2 = c31456OooO0O0.f112495OooO0OO;
            if (j2 >= 0) {
                iMin = (int) Math.min(2147483647L, j2 / 4096);
            }
        } else {
            iMin = 0;
        }
        this.f112527OooOooO = iMin;
        this.f112525OooOoo = new byte[z ? iMin : 100000][];
        bitSet.set(0, this.f112525OooOoo.length);
    }

    public static C31462OooO0oo OooOOO0() {
        try {
            return new C31462OooO0oo(new C31456OooO0O0(-1L, -1L, true, false));
        } catch (IOException e) {
            Log.e("PdfBox-Android", "Unexpected exception occurred creating main memory scratch file instance: " + e.getMessage());
            return null;
        }
    }

    public final void OooO00o() throws IOException {
        if (this.f112531Oooo00o) {
            throw new IOException("Scratch file already closed");
        }
    }

    public final void OooO0OO() throws IOException {
        synchronized (this.f112521OooOo0o) {
            try {
                OooO00o();
                if (this.f112524OooOoOO >= this.f112528OooOooo) {
                    return;
                }
                if (this.f112529Oooo000) {
                    if (this.f112522OooOoO == null) {
                        this.f112523OooOoO0 = File.createTempFile("PDFBox", ".tmp", this.f112520OooOo);
                        try {
                            this.f112522OooOoO = new RandomAccessFile(this.f112523OooOoO0, "rw");
                        } catch (IOException e) {
                            if (!this.f112523OooOoO0.delete()) {
                                Log.w("PdfBox-Android", "Error deleting scratch file: " + this.f112523OooOoO0.getAbsolutePath());
                            }
                            throw e;
                        }
                    }
                    long length = this.f112522OooOoO.length();
                    long j = (((long) this.f112524OooOoOO) - ((long) this.f112527OooOooO)) * 4096;
                    if (j != length) {
                        throw new IOException("Expected scratch file size of " + j + " but found " + length + " in file " + this.f112523OooOoO0);
                    }
                    if (this.f112524OooOoOO + 16 > this.f112524OooOoOO) {
                        long j2 = 65536 + length;
                        this.f112522OooOoO.setLength(j2);
                        if (j2 != this.f112522OooOoO.length()) {
                            long filePointer = this.f112522OooOoO.getFilePointer();
                            this.f112522OooOoO.seek(length + C18177fb.f54859s);
                            this.f112522OooOoO.write(0);
                            this.f112522OooOoO.seek(filePointer);
                            Log.d("PdfBox-Android", "fileLen after2:  " + j2 + ", raf length: " + this.f112522OooOoO.length() + ", file length: " + this.f112523OooOoO0.length());
                        }
                        this.f112526OooOoo0.set(this.f112524OooOoOO, this.f112524OooOoOO + 16);
                    }
                } else if (!this.f112530Oooo00O) {
                    int length2 = this.f112525OooOoo.length;
                    int iMin = (int) Math.min(((long) length2) * 2, 2147483647L);
                    if (iMin > length2) {
                        byte[][] bArr = new byte[iMin][];
                        System.arraycopy(this.f112525OooOoo, 0, bArr, 0, length2);
                        this.f112525OooOoo = bArr;
                        this.f112526OooOoo0.set(length2, iMin);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final byte[] OooOOo0(int i) throws IOException {
        byte[] bArr;
        if (i < 0 || i >= this.f112524OooOoOO) {
            OooO00o();
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Page index out of range: ", ". Max value: ");
            sbOooO0OO.append(this.f112524OooOoOO - 1);
            throw new IOException(sbOooO0OO.toString());
        }
        if (i < this.f112527OooOooO) {
            byte[] bArr2 = this.f112525OooOoo[i];
            if (bArr2 != null) {
                return bArr2;
            }
            OooO00o();
            throw new IOException(o0Oo0oo.OooO0O0(i, "Requested page with index ", " was not written before."));
        }
        synchronized (this.f112521OooOo0o) {
            try {
                RandomAccessFile randomAccessFile = this.f112522OooOoO;
                if (randomAccessFile == null) {
                    OooO00o();
                    throw new IOException("Missing scratch file to read page with index " + i + " from.");
                }
                bArr = new byte[4096];
                randomAccessFile.seek((((long) i) - ((long) this.f112527OooOooO)) * 4096);
                this.f112522OooOoO.readFully(bArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    public final void OooOOoo(int i, byte[] bArr) throws IOException {
        if (i < 0 || i >= this.f112524OooOoOO) {
            OooO00o();
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Page index out of range: ", ". Max value: ");
            sbOooO0OO.append(this.f112524OooOoOO - 1);
            throw new IOException(sbOooO0OO.toString());
        }
        if (bArr.length != 4096) {
            throw new IOException(C21023OooO0Oo.OooO0OO(". Expected: 4096", bArr.length, new StringBuilder("Wrong page size to write: ")));
        }
        if (i >= this.f112527OooOooO) {
            synchronized (this.f112521OooOo0o) {
                OooO00o();
                this.f112522OooOoO.seek((((long) i) - ((long) this.f112527OooOooO)) * 4096);
                this.f112522OooOoO.write(bArr);
            }
            return;
        }
        if (this.f112530Oooo00O) {
            this.f112525OooOoo[i] = bArr;
        } else {
            synchronized (this.f112521OooOo0o) {
                this.f112525OooOoo[i] = bArr;
            }
        }
        OooO00o();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.f112521OooOo0o) {
            try {
                if (this.f112531Oooo00o) {
                    return;
                }
                this.f112531Oooo00o = true;
                RandomAccessFile randomAccessFile = this.f112522OooOoO;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                        e = null;
                    } catch (IOException e) {
                        e = e;
                    }
                } else {
                    e = null;
                }
                File file = this.f112523OooOoO0;
                if (file != null && !file.delete() && this.f112523OooOoO0.exists() && e == null) {
                    e = new IOException("Error deleting scratch file: " + this.f112523OooOoO0.getAbsolutePath());
                }
                synchronized (this.f112526OooOoo0) {
                    this.f112526OooOoo0.clear();
                    this.f112524OooOoOO = 0;
                }
                if (e != null) {
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
