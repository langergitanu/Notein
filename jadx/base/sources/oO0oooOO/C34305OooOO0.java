package oO0oooOO;

import androidx.datastore.preferences.protobuf.o000oOoO;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import oOO000oO.InterfaceC34334OooO0OO;

/* JADX INFO: renamed from: oO0oooOO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34305OooOO0 implements InterfaceC34334OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34301OooO0o f123167OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f123168OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final byte[][] f123169OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C34306OooOO0O f123170OooOoO0;

    public C34305OooOO0(int i, C34301OooO0o c34301OooO0o, C34306OooOO0O c34306OooOO0O, byte[][] bArr) {
        this.f123168OooOo0o = i;
        this.f123167OooOo = c34301OooO0o;
        this.f123170OooOoO0 = c34306OooOO0O;
        this.f123169OooOoO = bArr;
    }

    public static C34305OooOO0 OooO00o(Object obj) throws Throwable {
        if (obj instanceof C34305OooOO0) {
            return (C34305OooOO0) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            int i = dataInputStream.readInt();
            C34301OooO0o c34301OooO0oOooO00o = C34301OooO0o.OooO00o(obj);
            C34306OooOO0O c34306OooOO0O = C34306OooOO0O.f123171OooO0Oo.get(Integer.valueOf(dataInputStream.readInt()));
            int i2 = c34306OooOO0O.f123173OooO0O0;
            byte[][] bArr = new byte[i2][];
            for (int i3 = 0; i3 < i2; i3++) {
                byte[] bArr2 = new byte[32];
                bArr[i3] = bArr2;
                dataInputStream.readFully(bArr2);
            }
            return new C34305OooOO0(i, c34301OooO0oOooO00o, c34306OooOO0O, bArr);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return OooO00o(oOO00.OooO00o.OooO00o((InputStream) obj));
            }
            throw new IllegalArgumentException(o000oOoO.OooO00o(obj, "cannot parse "));
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                C34305OooOO0 c34305OooOO0OooO00o = OooO00o(dataInputStream3);
                dataInputStream3.close();
                return c34305OooOO0OooO00o;
            } catch (Throwable th) {
                th = th;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
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
        if (obj == null || C34305OooOO0.class != obj.getClass()) {
            return false;
        }
        C34305OooOO0 c34305OooOO0 = (C34305OooOO0) obj;
        if (this.f123168OooOo0o != c34305OooOO0.f123168OooOo0o) {
            return false;
        }
        C34301OooO0o c34301OooO0o = c34305OooOO0.f123167OooOo;
        C34301OooO0o c34301OooO0o2 = this.f123167OooOo;
        if (c34301OooO0o2 == null ? c34301OooO0o != null : !c34301OooO0o2.equals(c34301OooO0o)) {
            return false;
        }
        C34306OooOO0O c34306OooOO0O = c34305OooOO0.f123170OooOoO0;
        C34306OooOO0O c34306OooOO0O2 = this.f123170OooOoO0;
        if (c34306OooOO0O2 == null ? c34306OooOO0O == null : c34306OooOO0O2.equals(c34306OooOO0O)) {
            return Arrays.deepEquals(this.f123169OooOoO, c34305OooOO0.f123169OooOoO);
        }
        return false;
    }

    @Override // oOO000oO.InterfaceC34334OooO0OO
    public final byte[] getEncoded() throws IOException {
        C34297OooO00o c34297OooO00o = new C34297OooO00o();
        c34297OooO00o.OooO0OO(this.f123168OooOo0o);
        c34297OooO00o.OooO0O0(this.f123167OooOo.getEncoded());
        c34297OooO00o.OooO0OO(this.f123170OooOoO0.f123172OooO00o);
        byte[][] bArr = this.f123169OooOoO;
        try {
            int length = bArr.length;
            int i = 0;
            while (true) {
                ByteArrayOutputStream byteArrayOutputStream = c34297OooO00o.f123137OooO00o;
                if (i >= length) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr[i]);
                i++;
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public final int hashCode() {
        int i = this.f123168OooOo0o * 31;
        C34301OooO0o c34301OooO0o = this.f123167OooOo;
        int iHashCode = (i + (c34301OooO0o != null ? c34301OooO0o.hashCode() : 0)) * 31;
        C34306OooOO0O c34306OooOO0O = this.f123170OooOoO0;
        return Arrays.deepHashCode(this.f123169OooOoO) + ((iHashCode + (c34306OooOO0O != null ? c34306OooOO0O.hashCode() : 0)) * 31);
    }
}
