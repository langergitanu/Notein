package o00ooO0;

import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0o implements InterfaceC25747OooOo0o, Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ByteBuffer f87828OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public SharedMemory f87829OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final long f87830OooOoO0;

    public OooO0o(int i) {
        if (!(i > 0)) {
            throw new IllegalArgumentException();
        }
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i);
            this.f87829OooOo0o = sharedMemoryCreate;
            this.f87828OooOo = sharedMemoryCreate.mapReadWrite();
            this.f87830OooOoO0 = System.identityHashCode(this);
        } catch (ErrnoException e) {
            throw new RuntimeException("Fail to create AshmemMemory", e);
        }
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final long OooO() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final synchronized int OooO00o(int i, int i2, int i3, byte[] bArr) {
        int iOooO00o;
        this.f87828OooOo.getClass();
        iOooO00o = C25749OooOoO0.OooO00o(i, i3, getSize());
        C25749OooOoO0.OooO0OO(i, bArr.length, i2, iOooO00o, getSize());
        this.f87828OooOo.position(i);
        this.f87828OooOo.put(bArr, i2, iOooO00o);
        return iOooO00o;
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final void OooO0OO(InterfaceC25747OooOo0o interfaceC25747OooOo0o, int i) {
        if (interfaceC25747OooOo0o.getUniqueId() == this.f87830OooOoO0) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(this.f87830OooOoO0) + " to AshmemMemoryChunk " + Long.toHexString(interfaceC25747OooOo0o.getUniqueId()) + " which are the same ");
            OooOoo0.OooOo00.OooO0O0(Boolean.FALSE);
        }
        if (interfaceC25747OooOo0o.getUniqueId() < this.f87830OooOoO0) {
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
        this.f87828OooOo.getClass();
        iOooO00o = C25749OooOoO0.OooO00o(i, i3, getSize());
        C25749OooOoO0.OooO0OO(i, bArr.length, i2, iOooO00o, getSize());
        this.f87828OooOo.position(i);
        this.f87828OooOo.get(bArr, i2, iOooO00o);
        return iOooO00o;
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final ByteBuffer OooOO0o() {
        return this.f87828OooOo;
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final synchronized byte OooOOO(int i) {
        OooOoo0.OooOo00.OooO0o(!isClosed());
        OooOoo0.OooOo00.OooO0O0(Boolean.valueOf(i >= 0));
        OooOoo0.OooOo00.OooO0O0(Boolean.valueOf(i < getSize()));
        this.f87828OooOo.getClass();
        return this.f87828OooOo.get(i);
    }

    public final void OooOOO0(InterfaceC25747OooOo0o interfaceC25747OooOo0o, int i) {
        if (!(interfaceC25747OooOo0o instanceof OooO0o)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        OooOoo0.OooOo00.OooO0o(!isClosed());
        OooO0o oooO0o = (OooO0o) interfaceC25747OooOo0o;
        OooOoo0.OooOo00.OooO0o(!oooO0o.isClosed());
        this.f87828OooOo.getClass();
        oooO0o.f87828OooOo.getClass();
        C25749OooOoO0.OooO0OO(0, oooO0o.getSize(), 0, i, getSize());
        this.f87828OooOo.position(0);
        oooO0o.f87828OooOo.position(0);
        byte[] bArr = new byte[i];
        this.f87828OooOo.get(bArr, 0, i);
        oooO0o.f87828OooOo.put(bArr, 0, i);
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.f87829OooOo0o;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.f87828OooOo;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.f87828OooOo = null;
                this.f87829OooOo0o = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final int getSize() {
        this.f87829OooOo0o.getClass();
        return this.f87829OooOo0o.getSize();
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final long getUniqueId() {
        return this.f87830OooOoO0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000e  */
    @Override // o00ooO0.InterfaceC25747OooOo0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean isClosed() {
        boolean z;
        if (this.f87828OooOo != null) {
            z = this.f87829OooOo0o == null;
        }
        return z;
    }
}
