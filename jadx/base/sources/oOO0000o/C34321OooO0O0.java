package oOO0000o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;
import oO0oOo0.C34162OooOo00;
import oO0oooOo.C34308OooO0O0;
import oO0ooooo.C34312OooO0OO;
import oO0ooooo.C34316OooO0Oo;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oOO0000o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34321OooO0O0 implements Key, PublicKey {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public transient C34308OooO0O0 f123208OooOo0o;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f123208OooOo0o = (C34308OooO0O0) C34312OooO0OO.OooO00o(C34162OooOo00.OooO0oo((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C34321OooO0O0)) {
            return false;
        }
        return Arrays.equals(C34332OooO00o.OooO00o(this.f123208OooOo0o.f123176OooOo), C34332OooO00o.OooO00o(((C34321OooO0O0) obj).f123208OooOo0o.f123176OooOo));
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return C34316OooO0Oo.OooO00o(this.f123208OooOo0o).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return C34332OooO00o.OooO0o0(C34332OooO00o.OooO00o(this.f123208OooOo0o.f123176OooOo));
    }
}
