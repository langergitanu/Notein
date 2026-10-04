package oOO000OO;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;
import oO0oO0Oo.AbstractC34040OooOooo;
import oO0oO0Oo.C34032OooOo0O;
import oO0oOOOO.C34116OooO0o;
import oO0oooO.C34288OooO0oo;
import oO0ooooo.C34310OooO00o;
import oO0ooooo.C34311OooO0O0;
import oOO000oO.C34332OooO00o;
import oOo00o00.C34550OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o implements PrivateKey, Key {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public transient C34550OooO0O0 f123219OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public transient C34032OooOo0O f123220OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public transient AbstractC34040OooOooo f123221OooOoO0;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        C34116OooO0o c34116OooO0oOooO0oo = C34116OooO0o.OooO0oo((byte[]) objectInputStream.readObject());
        this.f123221OooOoO0 = c34116OooO0oOooO0oo.f122586OooOoO;
        this.f123220OooOo0o = C34288OooO0oo.OooO0oo(c34116OooO0oOooO0oo.f122584OooOo.f122684OooOo).f123105OooOo.f122685OooOo0o;
        this.f123219OooOo = (C34550OooO0O0) C34310OooO00o.OooO00o(c34116OooO0oOooO0oo);
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
            if (this.f123220OooOo0o.OooOO0o(oooO00o.f123220OooOo0o) && Arrays.equals(C34332OooO00o.OooO00o(this.f123219OooOo.f123791OooOoO0), C34332OooO00o.OooO00o(oooO00o.f123219OooOo.f123791OooOoO0))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            C34550OooO0O0 c34550OooO0O0 = this.f123219OooOo;
            String str = c34550OooO0O0.f123790OooOo;
            return C34311OooO0O0.OooO00o(c34550OooO0O0, this.f123221OooOoO0).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (C34332OooO00o.OooO0o0(C34332OooO00o.OooO00o(this.f123219OooOo.f123791OooOoO0)) * 37) + this.f123220OooOo0o.f122357OooOo0o.hashCode();
    }
}
