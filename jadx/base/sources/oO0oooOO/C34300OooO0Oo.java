package oO0oooOO;

import androidx.datastore.preferences.protobuf.o000oOoO;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: oO0oooOO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34300OooO0Oo extends AbstractC34303OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f123144OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C34296OooO f123145OooOoO0;

    public C34300OooO0Oo(int i, C34296OooO c34296OooO) {
        super(2);
        this.f123144OooOo = i;
        this.f123145OooOoO0 = c34296OooO;
    }

    public static C34300OooO0Oo OooO0Oo(Object obj) throws Throwable {
        if (obj instanceof C34300OooO0Oo) {
            return (C34300OooO0Oo) obj;
        }
        if (obj instanceof DataInputStream) {
            return new C34300OooO0Oo(((DataInputStream) obj).readInt(), C34296OooO.OooO0Oo(obj));
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return OooO0Oo(oOO00.OooO00o.OooO00o((InputStream) obj));
            }
            throw new IllegalArgumentException(o000oOoO.OooO00o(obj, "cannot parse "));
        }
        DataInputStream dataInputStream = null;
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                C34300OooO0Oo c34300OooO0OoOooO0Oo = OooO0Oo(dataInputStream2);
                dataInputStream2.close();
                return c34300OooO0OoOooO0Oo;
            } catch (Throwable th) {
                th = th;
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34300OooO0Oo.class != obj.getClass()) {
            return false;
        }
        C34300OooO0Oo c34300OooO0Oo = (C34300OooO0Oo) obj;
        if (this.f123144OooOo != c34300OooO0Oo.f123144OooOo) {
            return false;
        }
        return this.f123145OooOoO0.equals(c34300OooO0Oo.f123145OooOoO0);
    }

    @Override // oOO000oO.InterfaceC34334OooO0OO
    public final byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.f123144OooOo;
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
        try {
            byteArrayOutputStream.write(this.f123145OooOoO0.getEncoded());
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public final int hashCode() {
        return this.f123145OooOoO0.hashCode() + (this.f123144OooOo * 31);
    }
}
