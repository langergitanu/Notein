package com.huawei.hms.network.embedded;

import android.util.Log;
import com.huawei.hms.network.embedded.C18156e4;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.z3 */
/* JADX INFO: loaded from: classes9.dex */
public class C18438z3 extends InputStream {

    /* JADX INFO: renamed from: h */
    public static final String f56772h = "DecryptInputStream";

    /* JADX INFO: renamed from: i */
    public static final int f56773i = 28;

    /* JADX INFO: renamed from: j */
    public static final int f56774j = 8220;

    /* JADX INFO: renamed from: a */
    public InputStream f56775a;

    /* JADX INFO: renamed from: b */
    public C18095a f56776b;

    /* JADX INFO: renamed from: c */
    public String f56777c;

    /* JADX INFO: renamed from: d */
    public int f56778d;

    /* JADX INFO: renamed from: e */
    public int f56779e;

    /* JADX INFO: renamed from: f */
    public byte[] f56780f = new byte[8192];

    /* JADX INFO: renamed from: g */
    public byte[] f56781g = new byte[f56774j];

    public C18438z3(C18095a c18095a, String str, InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("delegrate == null");
        }
        this.f56775a = inputStream;
        this.f56776b = c18095a;
        this.f56777c = str;
    }

    /* JADX INFO: renamed from: a */
    private IOException m80029a(IOException iOException) {
        if (iOException == null) {
            return new IOException("DecryptInputStream Exception");
        }
        IOException iOException2 = new IOException(iOException.getMessage());
        iOException2.initCause(iOException);
        return iOException2;
    }

    /* JADX INFO: renamed from: s */
    private void m80031s() throws IOException {
        int i = this.f56775a.read(this.f56781g);
        if (i == -1) {
            this.f56778d = 0;
        } else {
            m80030a(i, this.f56781g);
            this.f56778d = this.f56780f.length;
        }
        this.f56779e = 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f56775a.close();
    }

    public boolean isDecryptable() {
        try {
            m80031s();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private void m80030a(int i, byte[] bArr) throws IOException {
        if (i != 8220) {
            bArr = Arrays.copyOfRange(bArr, 0, i);
        }
        try {
            this.f56780f = C18156e4.decryptBody(bArr);
        } catch (C18156e4.a e) {
            Log.w(f56772h, "Decrypt body failed, the requested cache files are deleted");
            this.f56776b.m77798d(this.f56777c);
            close();
            throw m80029a(e);
        } catch (C18156e4.b e2) {
            Log.w(f56772h, "WorkKey is invalid, all requested cache files are deleted");
            this.f56776b.m77800s();
            close();
            throw m80029a(e2);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int length = this.f56778d - this.f56779e;
        if (length <= 0) {
            m80031s();
            if (bArr.length > 8192) {
                byte[] bArr2 = this.f56780f;
                System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                return this.f56780f.length;
            }
            length = this.f56778d - this.f56779e;
            if (length <= 0) {
                return -1;
            }
        }
        if (length >= bArr.length) {
            length = bArr.length;
        }
        System.arraycopy(this.f56780f, this.f56779e, bArr, 0, length);
        this.f56779e += length;
        return length;
    }
}
