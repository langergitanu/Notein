package oOO0000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;
import oO0oOo0.C34162OooOo00;
import oO0oooOO.AbstractC34303OooO0oO;
import oO0ooooo.C34312OooO0OO;
import oO0ooooo.C34316OooO0Oo;
import oOO000oO.C34332OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 implements PublicKey, Key {
    private static final long serialVersionUID = -5617456225328969766L;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public transient AbstractC34303OooO0oO f123199OooOo0o;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f123199OooOo0o = (AbstractC34303OooO0oO) C34312OooO0OO.OooO00o(C34162OooOo00.OooO0oo((byte[]) objectInputStream.readObject()));
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
            try {
                return Arrays.equals(this.f123199OooOo0o.getEncoded(), ((OooO0O0) obj).f123199OooOo0o.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return C34316OooO0Oo.OooO00o(this.f123199OooOo0o).getEncoded();
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
            return C34332OooO00o.OooO0o0(this.f123199OooOo0o.getEncoded());
        } catch (IOException unused) {
            return -1;
        }
    }
}
