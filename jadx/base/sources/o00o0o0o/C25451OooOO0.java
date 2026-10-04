package o00o0o0o;

import OooOoo0.OooOo00;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: o00o0o0o.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25451OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f86737OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC25443OooO00o f86738OooO0O0;

    public C25451OooOO0(InterfaceC25443OooO00o interfaceC25443OooO00o) {
        OooOo00.OooO0O0(true);
        this.f86737OooO00o = 16384;
        this.f86738OooO0O0 = interfaceC25443OooO00o;
    }

    public final void OooO00o(InputStream inputStream, OutputStream outputStream) throws IOException {
        InterfaceC25443OooO00o interfaceC25443OooO00o = this.f86738OooO0O0;
        int i = this.f86737OooO00o;
        byte[] bArr = interfaceC25443OooO00o.get(i);
        while (true) {
            try {
                int i2 = inputStream.read(bArr, 0, i);
                if (i2 == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, i2);
                }
            } finally {
                interfaceC25443OooO00o.release(bArr);
            }
        }
    }
}
