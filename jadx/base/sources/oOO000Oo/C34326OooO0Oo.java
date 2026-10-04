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
import p619oO.C31905OooOoO0;

/* JADX INFO: renamed from: oOO000Oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34326OooO0Oo implements PublicKey {
    private static final long serialVersionUID = -5617456225328969766L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public transient C34032OooOo0O f123232OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public transient C31905OooOoO0 f123233OooOo0o;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        C31905OooOoO0 c31905OooOoO0 = (C31905OooOoO0) C34312OooO0OO.OooO00o(C34162OooOo00.OooO0oo((byte[]) objectInputStream.readObject()));
        this.f123233OooOo0o = c31905OooOoO0;
        this.f123232OooOo = C28476OooOOO.OooO0O0(c31905OooOoO0.f113663OooOo);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C34326OooO0Oo) {
            C34326OooO0Oo c34326OooO0Oo = (C34326OooO0Oo) obj;
            try {
                if (this.f123232OooOo.OooOO0o(c34326OooO0Oo.f123232OooOo)) {
                    if (Arrays.equals(this.f123233OooOo0o.getEncoded(), c34326OooO0Oo.f123233OooOo0o.getEncoded())) {
                        return true;
                    }
                }
            } catch (IOException unused) {
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
            return C34316OooO0Oo.OooO00o(this.f123233OooOo0o).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        try {
            return (C34332OooO00o.OooO0o0(this.f123233OooOo0o.getEncoded()) * 37) + this.f123232OooOo.f122357OooOo0o.hashCode();
        } catch (IOException unused) {
            return this.f123232OooOo.f122357OooOo0o.hashCode();
        }
    }
}
