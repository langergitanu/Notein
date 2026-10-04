package oOO000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.util.Arrays;
import o000ooo.C24746OooO00o;
import oO0oOo0.C34162OooOo00;
import oO0ooooo.C34312OooO0OO;
import oO0ooooo.C34316OooO0Oo;
import oOO000oO.C34332OooO00o;
import oOo000OO.C34417OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 implements PublicKey {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public transient C34417OooO0O0 f123196OooOo0o;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f123196OooOo0o = (C34417OooO0O0) C34312OooO0OO.OooO00o(C34162OooOo00.OooO0oo((byte[]) objectInputStream.readObject()));
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
            C34417OooO0O0 c34417OooO0O0 = this.f123196OooOo0o;
            if (c34417OooO0O0.f123430OooOo == oooO0O0.f123196OooOo0o.f123430OooOo && Arrays.equals(C34332OooO00o.OooO00o(c34417OooO0O0.f123431OooOoO0), C34332OooO00o.OooO00o(oooO0O0.f123196OooOo0o.f123431OooOoO0))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return C24746OooO00o.OooO0o(this.f123196OooOo0o.f123430OooOo);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return C34316OooO0Oo.OooO00o(this.f123196OooOo0o).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        C34417OooO0O0 c34417OooO0O0 = this.f123196OooOo0o;
        return (C34332OooO00o.OooO0o0(C34332OooO00o.OooO00o(c34417OooO0O0.f123431OooOoO0)) * 37) + c34417OooO0O0.f123430OooOo;
    }
}
