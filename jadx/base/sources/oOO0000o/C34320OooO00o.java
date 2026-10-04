package oOO0000o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;
import oO0oO0Oo.AbstractC34040OooOooo;
import oO0oOOOO.C34116OooO0o;
import oO0oooOo.C34307OooO00o;
import oO0ooooo.C34310OooO00o;
import oO0ooooo.C34311OooO0O0;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oOO0000o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34320OooO00o implements Key, PrivateKey {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public transient AbstractC34040OooOooo f123206OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public transient C34307OooO00o f123207OooOo0o;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        C34116OooO0o c34116OooO0oOooO0oo = C34116OooO0o.OooO0oo((byte[]) objectInputStream.readObject());
        this.f123206OooOo = c34116OooO0oOooO0oo.f122586OooOoO;
        this.f123207OooOo0o = (C34307OooO00o) C34310OooO00o.OooO00o(c34116OooO0oOooO0oo);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C34320OooO00o) {
            return Arrays.equals(C34332OooO00o.OooO0O0(this.f123207OooOo0o.f123175OooOo), C34332OooO00o.OooO0O0(((C34320OooO00o) obj).f123207OooOo0o.f123175OooOo));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return C34311OooO0O0.OooO00o(this.f123207OooOo0o, this.f123206OooOo).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return C34332OooO00o.OooO0oO(C34332OooO00o.OooO0O0(this.f123207OooOo0o.f123175OooOo));
    }
}
