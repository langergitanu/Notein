package oO0oooOO;

import androidx.datastore.preferences.protobuf.o000oOoO;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oooOO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34296OooO extends AbstractC34303OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34306OooOO0O f123133OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final byte[] f123134OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C34302OooO0o0 f123135OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final byte[] f123136OooOoOO;

    public C34296OooO(C34306OooOO0O c34306OooOO0O, C34302OooO0o0 c34302OooO0o0, byte[] bArr, byte[] bArr2) {
        super(2);
        this.f123133OooOo = c34306OooOO0O;
        this.f123135OooOoO0 = c34302OooO0o0;
        this.f123134OooOoO = C34332OooO00o.OooO00o(bArr2);
        this.f123136OooOoOO = C34332OooO00o.OooO00o(bArr);
    }

    public static C34296OooO OooO0Oo(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof C34296OooO) {
            return (C34296OooO) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            C34306OooOO0O c34306OooOO0O = C34306OooOO0O.f123171OooO0Oo.get(Integer.valueOf(dataInputStream2.readInt()));
            C34302OooO0o0 c34302OooO0o0 = C34302OooO0o0.f123149OooO0o0.get(Integer.valueOf(dataInputStream2.readInt()));
            byte[] bArr = new byte[16];
            dataInputStream2.readFully(bArr);
            c34306OooOO0O.getClass();
            byte[] bArr2 = new byte[32];
            dataInputStream2.readFully(bArr2);
            return new C34296OooO(c34306OooOO0O, c34302OooO0o0, bArr2, bArr);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return OooO0Oo(oOO00.OooO00o.OooO00o((InputStream) obj));
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
            C34296OooO c34296OooOOooO0Oo = OooO0Oo(dataInputStream);
            dataInputStream.close();
            return c34296OooOOooO0Oo;
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
        if (obj == null || C34296OooO.class != obj.getClass()) {
            return false;
        }
        C34296OooO c34296OooO = (C34296OooO) obj;
        if (this.f123133OooOo.equals(c34296OooO.f123133OooOo) && this.f123135OooOoO0.equals(c34296OooO.f123135OooOoO0) && Arrays.equals(this.f123134OooOoO, c34296OooO.f123134OooOoO)) {
            return Arrays.equals(this.f123136OooOoOO, c34296OooO.f123136OooOoOO);
        }
        return false;
    }

    @Override // oOO000oO.InterfaceC34334OooO0OO
    public final byte[] getEncoded() throws IOException {
        C34297OooO00o c34297OooO00o = new C34297OooO00o();
        c34297OooO00o.OooO0OO(this.f123133OooOo.f123172OooO00o);
        c34297OooO00o.OooO0OO(this.f123135OooOoO0.f123150OooO00o);
        c34297OooO00o.OooO0O0(this.f123134OooOoO);
        c34297OooO00o.OooO0O0(this.f123136OooOoOO);
        return c34297OooO00o.f123137OooO00o.toByteArray();
    }

    public final int hashCode() {
        return C34332OooO00o.OooO0o0(this.f123136OooOoOO) + ((C34332OooO00o.OooO0o0(this.f123134OooOoO) + ((this.f123135OooOoO0.hashCode() + (this.f123133OooOo.hashCode() * 31)) * 31)) * 31);
    }
}
