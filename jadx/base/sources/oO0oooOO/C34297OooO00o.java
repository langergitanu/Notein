package oO0oooOO;

import java.io.ByteArrayOutputStream;
import oOO000oO.InterfaceC34334OooO0OO;

/* JADX INFO: renamed from: oO0oooOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34297OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ByteArrayOutputStream f123137OooO00o = new ByteArrayOutputStream();

    public final void OooO00o(InterfaceC34334OooO0OO interfaceC34334OooO0OO) {
        try {
            this.f123137OooO00o.write(interfaceC34334OooO0OO.getEncoded());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public final void OooO0O0(byte[] bArr) {
        try {
            this.f123137OooO00o.write(bArr);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public final void OooO0OO(int i) {
        ByteArrayOutputStream byteArrayOutputStream = this.f123137OooO00o;
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
    }
}
