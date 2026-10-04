package oO0oooOO;

import androidx.datastore.preferences.protobuf.o000oOoO;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import oOO000oO.InterfaceC34334OooO0OO;

/* JADX INFO: renamed from: oO0oooOO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34301OooO0o implements InterfaceC34334OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final byte[] f123146OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34302OooO0o0 f123147OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final byte[] f123148OooOoO0;

    public C34301OooO0o(C34302OooO0o0 c34302OooO0o0, byte[] bArr, byte[] bArr2) {
        this.f123147OooOo0o = c34302OooO0o0;
        this.f123146OooOo = bArr;
        this.f123148OooOoO0 = bArr2;
    }

    public static C34301OooO0o OooO00o(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof C34301OooO0o) {
            return (C34301OooO0o) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            C34302OooO0o0 c34302OooO0o0 = C34302OooO0o0.f123149OooO0o0.get(Integer.valueOf(dataInputStream2.readInt()));
            c34302OooO0o0.getClass();
            byte[] bArr = new byte[32];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[c34302OooO0o0.f123152OooO0OO * 32];
            dataInputStream2.readFully(bArr2);
            return new C34301OooO0o(c34302OooO0o0, bArr, bArr2);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return OooO00o(oOO00.OooO00o.OooO00o((InputStream) obj));
            }
            throw new IllegalArgumentException(o000oOoO.OooO00o(obj, "cannot parse "));
        }
        DataInputStream dataInputStream3 = null;
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
        } catch (Throwable th) {
            th = th;
        }
        try {
            C34301OooO0o c34301OooO0oOooO00o = OooO00o(dataInputStream);
            dataInputStream.close();
            return c34301OooO0oOooO00o;
        } catch (Throwable th2) {
            th = th2;
            dataInputStream3 = dataInputStream;
            if (dataInputStream3 != null) {
                dataInputStream3.close();
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34301OooO0o.class != obj.getClass()) {
            return false;
        }
        C34301OooO0o c34301OooO0o = (C34301OooO0o) obj;
        C34302OooO0o0 c34302OooO0o0 = c34301OooO0o.f123147OooOo0o;
        C34302OooO0o0 c34302OooO0o02 = this.f123147OooOo0o;
        if (c34302OooO0o02 == null ? c34302OooO0o0 != null : !c34302OooO0o02.equals(c34302OooO0o0)) {
            return false;
        }
        if (Arrays.equals(this.f123146OooOo, c34301OooO0o.f123146OooOo)) {
            return Arrays.equals(this.f123148OooOoO0, c34301OooO0o.f123148OooOoO0);
        }
        return false;
    }

    @Override // oOO000oO.InterfaceC34334OooO0OO
    public final byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C34302OooO0o0 c34302OooO0o0 = this.f123147OooOo0o;
        byteArrayOutputStream.write((byte) 0);
        byteArrayOutputStream.write((byte) 0);
        byteArrayOutputStream.write((byte) 0);
        byteArrayOutputStream.write((byte) c34302OooO0o0.f123150OooO00o);
        try {
            byteArrayOutputStream.write(this.f123146OooOo);
            try {
                byteArrayOutputStream.write(this.f123148OooOoO0);
                return byteArrayOutputStream.toByteArray();
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public final int hashCode() {
        C34302OooO0o0 c34302OooO0o0 = this.f123147OooOo0o;
        return Arrays.hashCode(this.f123148OooOoO0) + ((Arrays.hashCode(this.f123146OooOo) + ((c34302OooO0o0 != null ? c34302OooO0o0.hashCode() : 0) * 31)) * 31);
    }
}
