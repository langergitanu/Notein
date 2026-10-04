package oOO000Oo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.util.Arrays;
import o0Oo0ooo.C28476OooOOO;
import oO0oO0Oo.C34032OooOo0O;
import oO0oOo0.C34162OooOo00;
import oO0ooooo.C34312OooO0OO;
import oO0ooooo.C34316OooO0Oo;
import oOO000oO.C34332OooO00o;
import p619oO.OooOo00;

/* JADX INFO: renamed from: oOO000Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34324OooO0O0 implements PublicKey {
    private static final long serialVersionUID = 3230324130542413475L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public transient OooOo00 f123227OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public transient C34032OooOo0O f123228OooOo0o;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        OooOo00 oooOo00 = (OooOo00) C34312OooO0OO.OooO00o(C34162OooOo00.OooO0oo((byte[]) objectInputStream.readObject()));
        this.f123227OooOo = oooOo00;
        this.f123228OooOo0o = C28476OooOOO.OooO0O0(oooOo00.f113669OooOo);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C34324OooO0O0) {
            C34324OooO0O0 c34324OooO0O0 = (C34324OooO0O0) obj;
            if (this.f123228OooOo0o.OooOO0o(c34324OooO0O0.f123228OooOo0o) && Arrays.equals(this.f123227OooOo.OooO0Oo(), c34324OooO0O0.f123227OooOo.OooO0Oo())) {
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
            return C34316OooO0Oo.OooO00o(this.f123227OooOo).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return (C34332OooO00o.OooO0o0(this.f123227OooOo.OooO0Oo()) * 37) + this.f123228OooOo0o.f122357OooOo0o.hashCode();
    }
}
