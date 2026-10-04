package com.huawei.hms.network.embedded;

import com.huawei.hms.network.httpclient.ResponseBody;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.w3 */
/* JADX INFO: loaded from: classes9.dex */
public class C18399w3 extends InputStream {

    /* JADX INFO: renamed from: h */
    public static final String f56523h = "CacheInputStream";

    /* JADX INFO: renamed from: a */
    public final InputStream f56524a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC18373u3 f56525b;

    /* JADX INFO: renamed from: f */
    public int f56529f;

    /* JADX INFO: renamed from: c */
    public byte[] f56526c = new byte[8192];

    /* JADX INFO: renamed from: d */
    public int f56527d = 0;

    /* JADX INFO: renamed from: e */
    public int f56528e = 0;

    /* JADX INFO: renamed from: g */
    public int f56530g = 0;

    public C18399w3(ResponseBody responseBody, InterfaceC18373u3 interfaceC18373u3) {
        if (responseBody == null || responseBody.getInputStream() == null) {
            throw new IllegalArgumentException("ResponseBody delegrate == null");
        }
        this.f56524a = responseBody.getInputStream();
        this.f56525b = interfaceC18373u3;
    }

    private void write(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            this.f56525b.write(bArr);
        } catch (IOException e) {
            this.f56525b.abort();
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f56524a.close();
        InterfaceC18373u3 interfaceC18373u3 = this.f56525b;
        if (interfaceC18373u3 != null) {
            interfaceC18373u3.close();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (this.f56525b == null) {
            return this.f56524a.read(bArr, 0, bArr.length);
        }
        int i = this.f56524a.read(bArr, 0, bArr.length);
        this.f56529f = i;
        if (i == -1) {
            int i2 = this.f56527d;
            if (i2 > 0) {
                write(C18156e4.encryptBody(Arrays.copyOfRange(this.f56526c, 0, i2)));
                this.f56527d = 0;
            }
            return this.f56529f;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i);
        int i3 = this.f56530g + this.f56529f;
        this.f56530g = i3;
        if (i3 > 16777216) {
            this.f56525b.abort();
            this.f56530g = 0;
        }
        int i4 = this.f56527d;
        int i5 = 8192 - i4;
        this.f56528e = i5;
        int i6 = this.f56529f;
        if (i6 < i5) {
            System.arraycopy(bArrCopyOfRange, 0, this.f56526c, i4, i6);
            this.f56527d += this.f56529f;
        } else {
            System.arraycopy(bArrCopyOfRange, 0, this.f56526c, i4, i5);
            write(C18156e4.encryptBody(this.f56526c));
            int i7 = this.f56529f;
            int i8 = this.f56528e;
            int i9 = i7 - i8;
            System.arraycopy(bArrCopyOfRange, i8, this.f56526c, 0, i9);
            this.f56527d = i9;
        }
        return this.f56529f;
    }
}
