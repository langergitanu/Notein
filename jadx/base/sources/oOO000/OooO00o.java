package oOO000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import java.util.Arrays;
import o000ooo.C24746OooO00o;
import oO0oO0Oo.AbstractC34040OooOooo;
import oO0oOOOO.C34116OooO0o;
import oO0ooooo.C34310OooO00o;
import oO0ooooo.C34311OooO0O0;
import oOO000oO.C34332OooO00o;
import oOo000OO.C34416OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o implements PrivateKey {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public transient AbstractC34040OooOooo f123194OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public transient C34416OooO00o f123195OooOo0o;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        C34116OooO0o c34116OooO0oOooO0oo = C34116OooO0o.OooO0oo((byte[]) objectInputStream.readObject());
        this.f123194OooOo = c34116OooO0oOooO0oo.f122586OooOoO;
        this.f123195OooOo0o = (C34416OooO00o) C34310OooO00o.OooO00o(c34116OooO0oOooO0oo);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooO00o) {
            OooO00o oooO00o = (OooO00o) obj;
            C34416OooO00o c34416OooO00o = this.f123195OooOo0o;
            if (c34416OooO00o.f123428OooOo == oooO00o.f123195OooOo0o.f123428OooOo && Arrays.equals(C34332OooO00o.OooO00o(c34416OooO00o.f123429OooOoO0), C34332OooO00o.OooO00o(oooO00o.f123195OooOo0o.f123429OooOoO0))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return C24746OooO00o.OooO0o(this.f123195OooOo0o.f123428OooOo);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return C34311OooO0O0.OooO00o(this.f123195OooOo0o, this.f123194OooOo).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        C34416OooO00o c34416OooO00o = this.f123195OooOo0o;
        return (C34332OooO00o.OooO0o0(C34332OooO00o.OooO00o(c34416OooO00o.f123429OooOoO0)) * 37) + c34416OooO00o.f123428OooOo;
    }
}
