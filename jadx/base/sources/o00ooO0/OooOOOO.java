package o00ooO0;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOOO implements InterfaceC25747OooOo0o, Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f87861OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ByteBuffer f87862OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final long f87863OooOoO0 = System.identityHashCode(this);

    public OooOOOO(int i) {
        this.f87862OooOo0o = ByteBuffer.allocateDirect(i);
        this.f87861OooOo = i;
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final long OooO() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final synchronized int OooO00o(int i, int i2, int i3, byte[] bArr) {
        int iOooO00o;
        OooOoo0.OooOo00.OooO0o(!isClosed());
        this.f87862OooOo0o.getClass();
        iOooO00o = C25749OooOoO0.OooO00o(i, i3, this.f87861OooOo);
        C25749OooOoO0.OooO0OO(i, bArr.length, i2, iOooO00o, this.f87861OooOo);
        this.f87862OooOo0o.position(i);
        this.f87862OooOo0o.put(bArr, i2, iOooO00o);
        return iOooO00o;
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final void OooO0OO(InterfaceC25747OooOo0o interfaceC25747OooOo0o, int i) {
        if (interfaceC25747OooOo0o.getUniqueId() == this.f87863OooOoO0) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(this.f87863OooOoO0) + " to BufferMemoryChunk " + Long.toHexString(interfaceC25747OooOo0o.getUniqueId()) + " which are the same ");
            OooOoo0.OooOo00.OooO0O0(Boolean.FALSE);
        }
        if (interfaceC25747OooOo0o.getUniqueId() < this.f87863OooOoO0) {
            synchronized (interfaceC25747OooOo0o) {
                synchronized (this) {
                    OooOOO0(interfaceC25747OooOo0o, i);
                }
            }
        } else {
            synchronized (this) {
                synchronized (interfaceC25747OooOo0o) {
                    OooOOO0(interfaceC25747OooOo0o, i);
                }
            }
        }
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final synchronized int OooO0Oo(int i, int i2, int i3, byte[] bArr) {
        int iOooO00o;
        OooOoo0.OooOo00.OooO0o(!isClosed());
        this.f87862OooOo0o.getClass();
        iOooO00o = C25749OooOoO0.OooO00o(i, i3, this.f87861OooOo);
        C25749OooOoO0.OooO0OO(i, bArr.length, i2, iOooO00o, this.f87861OooOo);
        this.f87862OooOo0o.position(i);
        this.f87862OooOo0o.get(bArr, i2, iOooO00o);
        return iOooO00o;
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final synchronized ByteBuffer OooOO0o() {
        return this.f87862OooOo0o;
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final synchronized byte OooOOO(int i) {
        OooOoo0.OooOo00.OooO0o(!isClosed());
        OooOoo0.OooOo00.OooO0O0(Boolean.valueOf(i >= 0));
        OooOoo0.OooOo00.OooO0O0(Boolean.valueOf(i < this.f87861OooOo));
        this.f87862OooOo0o.getClass();
        return this.f87862OooOo0o.get(i);
    }

    public final void OooOOO0(InterfaceC25747OooOo0o interfaceC25747OooOo0o, int i) {
        if (!(interfaceC25747OooOo0o instanceof OooOOOO)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        OooOoo0.OooOo00.OooO0o(!isClosed());
        OooOOOO oooOOOO = (OooOOOO) interfaceC25747OooOo0o;
        OooOoo0.OooOo00.OooO0o(!oooOOOO.isClosed());
        this.f87862OooOo0o.getClass();
        C25749OooOoO0.OooO0OO(0, oooOOOO.f87861OooOo, 0, i, this.f87861OooOo);
        this.f87862OooOo0o.position(0);
        ByteBuffer byteBufferOooOO0o = oooOOOO.OooOO0o();
        byteBufferOooOO0o.getClass();
        byteBufferOooOO0o.position(0);
        byte[] bArr = new byte[i];
        this.f87862OooOo0o.get(bArr, 0, i);
        byteBufferOooOO0o.put(bArr, 0, i);
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f87862OooOo0o = null;
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final int getSize() {
        return this.f87861OooOo;
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final long getUniqueId() {
        return this.f87863OooOoO0;
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final synchronized boolean isClosed() {
        return this.f87862OooOo0o == null;
    }
}
