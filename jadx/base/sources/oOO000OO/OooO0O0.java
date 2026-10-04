package oOO000OO;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;
import oO0oO0Oo.C34032OooOo0O;
import oO0oOo0.C34162OooOo00;
import oO0oooO.C34288OooO0oo;
import oO0ooooo.C34312OooO0OO;
import oO0ooooo.C34316OooO0Oo;
import oOO000oO.C34332OooO00o;
import oOo00o00.C34551OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 implements PublicKey, Key {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public transient C34551OooO0OO f123222OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public transient C34032OooOo0O f123223OooOo0o;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        C34162OooOo00 c34162OooOo00OooO0oo = C34162OooOo00.OooO0oo((byte[]) objectInputStream.readObject());
        this.f123223OooOo0o = C34288OooO0oo.OooO0oo(c34162OooOo00OooO0oo.f122751OooOo0o.f122684OooOo).f123105OooOo.f122685OooOo0o;
        this.f123222OooOo = (C34551OooO0OO) C34312OooO0OO.OooO00o(c34162OooOo00OooO0oo);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooO0O0) {
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            if (this.f123223OooOo0o.OooOO0o(oooO0O0.f123223OooOo0o) && Arrays.equals(C34332OooO00o.OooO00o(this.f123222OooOo.f123792OooOoO0), C34332OooO00o.OooO00o(oooO0O0.f123222OooOo.f123792OooOoO0))) {
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
            C34551OooO0OO c34551OooO0OO = this.f123222OooOo;
            String str = c34551OooO0OO.f123790OooOo;
            return C34316OooO0Oo.OooO00o(c34551OooO0OO).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return (C34332OooO00o.OooO0o0(C34332OooO00o.OooO00o(this.f123222OooOo.f123792OooOoO0)) * 37) + this.f123223OooOo0o.f122357OooOo0o.hashCode();
    }
}
