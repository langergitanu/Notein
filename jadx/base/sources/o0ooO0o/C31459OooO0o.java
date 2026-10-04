package o0ooO0o;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: o0ooO0o.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31459OooO0o extends OutputStream {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31454OooO f112517OooOo0o;

    public C31459OooO0o(C31454OooO c31454OooO) {
        this.f112517OooOo0o = c31454OooO;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f112517OooOo0o.OooOooo(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f112517OooOo0o.OooOOoo(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f112517OooOo0o.OooOOo0(i);
    }
}
