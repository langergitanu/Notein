package oO0oOo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import oO0oOo0.C34145OooO0Oo;
import oOO000oO.InterfaceC34334OooO0OO;

/* JADX INFO: renamed from: oO0oOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34138OooO0OO implements InterfaceC34334OooO0OO, Serializable {
    private static final long serialVersionUID = 20170722001L;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public transient C34145OooO0Oo f122678OooOo0o;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        C34145OooO0Oo c34145OooO0OoOooO0oo = C34145OooO0Oo.OooO0oo(objectInputStream.readObject());
        this.f122678OooOo0o = c34145OooO0OoOooO0oo;
        c34145OooO0OoOooO0oo.f122690OooOo0o.getClass();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f122678OooOo0o.getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C34138OooO0OO) {
            return this.f122678OooOo0o.equals(((C34138OooO0OO) obj).f122678OooOo0o);
        }
        return false;
    }

    @Override // oOO000oO.InterfaceC34334OooO0OO
    public final byte[] getEncoded() throws IOException {
        return this.f122678OooOo0o.getEncoded();
    }

    public final int hashCode() {
        return this.f122678OooOo0o.hashCode();
    }
}
