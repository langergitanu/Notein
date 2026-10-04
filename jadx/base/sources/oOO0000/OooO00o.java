package oOO0000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;
import oO0oO0Oo.AbstractC34040OooOooo;
import oO0oOOOO.C34116OooO0o;
import oO0oooOO.AbstractC34303OooO0oO;
import oO0ooooo.C34310OooO00o;
import oO0ooooo.C34311OooO0O0;
import oOO000oO.C34332OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o implements PrivateKey, Key {
    private static final long serialVersionUID = 8568701712864512338L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public transient AbstractC34040OooOooo f123197OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public transient AbstractC34303OooO0oO f123198OooOo0o;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        C34116OooO0o c34116OooO0oOooO0oo = C34116OooO0o.OooO0oo((byte[]) objectInputStream.readObject());
        this.f123197OooOo = c34116OooO0oOooO0oo.f122586OooOoO;
        this.f123198OooOo0o = (AbstractC34303OooO0oO) C34310OooO00o.OooO00o(c34116OooO0oOooO0oo);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooO00o)) {
            return false;
        }
        try {
            return Arrays.equals(this.f123198OooOo0o.getEncoded(), ((OooO00o) obj).f123198OooOo0o.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to perform equals");
        }
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return C34311OooO0O0.OooO00o(this.f123198OooOo0o, this.f123197OooOo).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        try {
            return C34332OooO00o.OooO0o0(this.f123198OooOo0o.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to calculate hashCode");
        }
    }
}
