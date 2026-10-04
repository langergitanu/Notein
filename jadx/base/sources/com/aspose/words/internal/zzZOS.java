package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.o0Oo0oo;
import androidx.appcompat.widget.C21532OooOOo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class zzZOS extends zzZOP {
    private String zzZS;
    private zzZK5 zzZXB;
    private boolean zzZXC;

    public zzZOS(String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            throw new FileNotFoundException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Can't find read-only file: ", str));
        }
        this.zzZXC = false;
        this.zzZXB = new zzZK5(str, "r");
        this.zzZS = file.getPath();
    }

    @Override // com.aspose.words.internal.zzZOP
    public final boolean canRead() throws IOException {
        return true;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final boolean canWrite() {
        return this.zzZXC;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void close() throws IOException {
        this.zzZXB.close();
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void flush() throws IOException {
        this.zzZXB.flush();
    }

    public final String getFileName() {
        return this.zzZS;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final long getLength() throws IOException {
        return this.zzZXB.length();
    }

    public final String getName() {
        return this.zzZS;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final long getPosition() throws IOException {
        return this.zzZXB.getFilePointer();
    }

    @Override // com.aspose.words.internal.zzZOP
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zzZXB.read(bArr, i, i2);
        if (i3 == -1) {
            return 0;
        }
        return i3;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void setLength(long j) throws IOException {
        this.zzZXB.setLength(j);
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.zzZXB.write(bArr, i, i2);
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void writeByte(byte b) throws IOException {
        this.zzZXB.write(b);
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void zzH(long j) throws IOException {
        this.zzZXB.seek(j);
    }

    @Override // com.aspose.words.internal.zzZOP
    public final boolean zzRG() {
        return true;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final int zzRI() throws IOException {
        return this.zzZXB.read();
    }

    @Override // com.aspose.words.internal.zzZOP
    public final long zzU(long j, int i) throws IOException {
        if (i == 0) {
            this.zzZXB.seek(j);
        } else if (i == 1) {
            zzZK5 zzzk5 = this.zzZXB;
            zzzk5.seek(zzzk5.getFilePointer() + j);
        } else {
            if (i != 2) {
                throw new IllegalStateException("Unknown SeekOrigin type.");
            }
            zzZK5 zzzk52 = this.zzZXB;
            zzzk52.seek(zzzk52.length() + j);
        }
        return this.zzZXB.getFilePointer();
    }

    public zzZOS(String str, int i, int i2) throws IOException {
        String str2;
        if (str != null) {
            if ("".equals(str)) {
                throw new IllegalArgumentException("File path can't be \"\".");
            }
            if (i <= 0 || i > 6) {
                throw new IndexOutOfBoundsException(o0Oo0oo.OooO0O0(i, "Illegal FileMode: ", "."));
            }
            if (i2 > 0 && i2 <= 3) {
                if (i2 == 1) {
                    this.zzZXC = false;
                    str2 = "r";
                } else {
                    this.zzZXC = true;
                    str2 = "rw";
                }
                File file = new File(str);
                if (file.exists()) {
                    if (i != 1) {
                        if (i == 2 || i == 5) {
                            file.delete();
                        }
                        zzZK5 zzzk5 = new zzZK5(file, str2);
                        this.zzZXB = zzzk5;
                        if (i == 6) {
                            zzzk5.seek(zzzk5.length());
                        }
                    } else {
                        throw new IOException(C20593OooO0Oo.OooO0O0("Can't create new file. File '", str, "' already exist."));
                    }
                } else if (i != 3 && i != 5) {
                    this.zzZXB = new zzZK5(file, str2);
                } else {
                    throw new FileNotFoundException(C20593OooO0Oo.OooO0O0("Can't find file: ", str, "."));
                }
                this.zzZS = file.getPath();
                return;
            }
            throw new IndexOutOfBoundsException(C21532OooOOo.OooO0OO(i2, "access = "));
        }
        throw new NullPointerException("File path can't be null.");
    }
}
