package oO0oOo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Set;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oOo0.C34146OooO0o;
import oO0oOo0.C34151OooOO0O;
import oOO000oO.InterfaceC34334OooO0OO;

/* JADX INFO: renamed from: oO0oOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C34140OooO0o0 implements InterfaceC34334OooO0OO, Serializable {
    private static final long serialVersionUID = 20170722001L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public transient C34151OooOO0O f122680OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public transient C34146OooO0o f122681OooOo0o;

    public C34140OooO0o0(byte[] bArr) throws IOException {
        try {
            Set set = C34137OooO0O0.f122676OooO00o;
            AbstractC34036OooOoOO abstractC34036OooOoOOOooOOO = AbstractC34036OooOoOO.OooOOO(bArr);
            if (abstractC34036OooOoOOOooOOO == null) {
                throw new IOException("no content found");
            }
            C34146OooO0o c34146OooO0oOooO0oo = C34146OooO0o.OooO0oo(abstractC34036OooOoOOOooOOO);
            this.f122681OooOo0o = c34146OooO0oOooO0oo;
            this.f122680OooOo = c34146OooO0oOooO0oo.f122692OooOo.f122763Oooo00o;
        } catch (ClassCastException e) {
            throw new C34136OooO00o("malformed data: " + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new C34136OooO00o("malformed data: " + e2.getMessage(), e2);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        C34146OooO0o c34146OooO0oOooO0oo = C34146OooO0o.OooO0oo(objectInputStream.readObject());
        this.f122681OooOo0o = c34146OooO0oOooO0oo;
        this.f122680OooOo = c34146OooO0oOooO0oo.f122692OooOo.f122763Oooo00o;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f122681OooOo0o.getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C34140OooO0o0) {
            return this.f122681OooOo0o.equals(((C34140OooO0o0) obj).f122681OooOo0o);
        }
        return false;
    }

    @Override // oOO000oO.InterfaceC34334OooO0OO
    public final byte[] getEncoded() throws IOException {
        return this.f122681OooOo0o.getEncoded();
    }

    public final int hashCode() {
        return this.f122681OooOo0o.hashCode();
    }
}
