package oOO000Oo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import java.util.Arrays;
import oO0oO0Oo.AbstractC34040OooOooo;
import oO0oO0Oo.C34032OooOo0O;
import oO0oOOOO.C34116OooO0o;
import oO0oooO.C34289OooOO0;
import oO0ooooo.C34310OooO00o;
import oO0ooooo.C34311OooO0O0;
import oOO000oO.C34332OooO00o;
import p619oO.C31900OooOOoo;

/* JADX INFO: renamed from: oOO000Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34323OooO00o implements PrivateKey {
    private static final long serialVersionUID = 7682140473044521395L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public transient C31900OooOOoo f123224OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public transient C34032OooOo0O f123225OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public transient AbstractC34040OooOooo f123226OooOoO0;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        C34116OooO0o c34116OooO0oOooO0oo = C34116OooO0o.OooO0oo((byte[]) objectInputStream.readObject());
        this.f123226OooOoO0 = c34116OooO0oOooO0oo.f122586OooOoO;
        this.f123225OooOo0o = C34289OooOO0.OooO0oo(c34116OooO0oOooO0oo.f122584OooOo.f122684OooOo).f123109OooOoO.f122685OooOo0o;
        this.f123224OooOo = (C31900OooOOoo) C34310OooO00o.OooO00o(c34116OooO0oOooO0oo);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C34323OooO00o) {
            C34323OooO00o c34323OooO00o = (C34323OooO00o) obj;
            if (this.f123225OooOo0o.OooOO0o(c34323OooO00o.f123225OooOo0o) && Arrays.equals(this.f123224OooOo.OooO0Oo(), c34323OooO00o.f123224OooOo.OooO0Oo())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return C34311OooO0O0.OooO00o(this.f123224OooOo, this.f123226OooOoO0).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (C34332OooO00o.OooO0o0(this.f123224OooOo.OooO0Oo()) * 37) + this.f123225OooOo0o.f122357OooOo0o.hashCode();
    }
}
