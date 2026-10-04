package oOO000Oo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import java.util.Arrays;
import oO0oO0Oo.AbstractC34040OooOooo;
import oO0oO0Oo.C34032OooOo0O;
import oO0oOOOO.C34116OooO0o;
import oO0oooO.C34280OooO;
import oO0ooooo.C34310OooO00o;
import oO0ooooo.C34311OooO0O0;
import oOO000oO.C34332OooO00o;
import p619oO.OooOo;

/* JADX INFO: renamed from: oOO000Oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34325OooO0OO implements PrivateKey {
    private static final long serialVersionUID = 8568701712864512338L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public transient C34032OooOo0O f123229OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public transient OooOo f123230OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public transient AbstractC34040OooOooo f123231OooOoO0;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        C34116OooO0o c34116OooO0oOooO0oo = C34116OooO0o.OooO0oo((byte[]) objectInputStream.readObject());
        this.f123231OooOoO0 = c34116OooO0oOooO0oo.f122586OooOoO;
        this.f123229OooOo = C34280OooO.OooO0oo(c34116OooO0oOooO0oo.f122584OooOo.f122684OooOo).f123061OooOoO0.f122685OooOo0o;
        this.f123230OooOo0o = (OooOo) C34310OooO00o.OooO00o(c34116OooO0oOooO0oo);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C34325OooO0OO) {
            C34325OooO0OO c34325OooO0OO = (C34325OooO0OO) obj;
            if (this.f123229OooOo.OooOO0o(c34325OooO0OO.f123229OooOo) && Arrays.equals(this.f123230OooOo0o.OooO0Oo(), c34325OooO0OO.f123230OooOo0o.OooO0Oo())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return C34311OooO0O0.OooO00o(this.f123230OooOo0o, this.f123231OooOoO0).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (C34332OooO00o.OooO0o0(this.f123230OooOo0o.OooO0Oo()) * 37) + this.f123229OooOo.f122357OooOo0o.hashCode();
    }
}
