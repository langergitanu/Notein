package o0ooOO0O;

import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: o0ooOO0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31606OooO00o extends FilterOutputStream {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f112959OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f112960OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final byte[] f112958OooOoO0 = {13, 10};

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final byte[] f112957OooOoO = {10};

    public final void OooO00o() throws IOException {
        if (this.f112959OooOo) {
            return;
        }
        write(f112957OooOoO);
        this.f112959OooOo = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f112959OooOo = false;
        ((FilterOutputStream) this).out.write(i);
        this.f112960OooOo0o++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f112959OooOo = false;
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.f112960OooOo0o += (long) i2;
    }
}
