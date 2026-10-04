package com.facebook.imagepipeline.memory;

import OooOoo0.OooOo00;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import o00ooO0.C25749OooOoO0;
import o00ooO0.InterfaceC25747OooOo0o;
import o00ooOo0.C25787OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public class NativeMemoryChunk implements InterfaceC25747OooOo0o, Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f67259OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final long f67260OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f67261OooOoO0;

    static {
        C25787OooO00o.OooO0O0("imagepipeline");
    }

    public NativeMemoryChunk(int i) {
        if (!(i > 0)) {
            throw new IllegalArgumentException();
        }
        this.f67259OooOo = i;
        this.f67260OooOo0o = nativeAllocate(i);
        this.f67261OooOoO0 = false;
    }

    private static native long nativeAllocate(int i);

    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    private static native void nativeFree(long j);

    private static native void nativeMemcpy(long j, long j2, int i);

    private static native byte nativeReadByte(long j);

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final long OooO() {
        return this.f67260OooOo0o;
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final synchronized int OooO00o(int i, int i2, int i3, byte[] bArr) {
        int iOooO00o;
        OooOo00.OooO0o(!isClosed());
        iOooO00o = C25749OooOoO0.OooO00o(i, i3, this.f67259OooOo);
        C25749OooOoO0.OooO0OO(i, bArr.length, i2, iOooO00o, this.f67259OooOo);
        nativeCopyFromByteArray(this.f67260OooOo0o + ((long) i), bArr, i2, iOooO00o);
        return iOooO00o;
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final void OooO0OO(InterfaceC25747OooOo0o interfaceC25747OooOo0o, int i) {
        if (interfaceC25747OooOo0o.getUniqueId() == this.f67260OooOo0o) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(interfaceC25747OooOo0o)) + " which share the same address " + Long.toHexString(this.f67260OooOo0o));
            OooOo00.OooO0O0(Boolean.FALSE);
        }
        if (interfaceC25747OooOo0o.getUniqueId() < this.f67260OooOo0o) {
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
        OooOo00.OooO0o(!isClosed());
        iOooO00o = C25749OooOoO0.OooO00o(i, i3, this.f67259OooOo);
        C25749OooOoO0.OooO0OO(i, bArr.length, i2, iOooO00o, this.f67259OooOo);
        nativeCopyToByteArray(this.f67260OooOo0o + ((long) i), bArr, i2, iOooO00o);
        return iOooO00o;
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final ByteBuffer OooOO0o() {
        return null;
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final synchronized byte OooOOO(int i) {
        boolean z = true;
        OooOo00.OooO0o(!isClosed());
        if (!(i >= 0)) {
            throw new IllegalArgumentException();
        }
        if (i >= this.f67259OooOo) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException();
        }
        return nativeReadByte(this.f67260OooOo0o + ((long) i));
    }

    public final void OooOOO0(InterfaceC25747OooOo0o interfaceC25747OooOo0o, int i) {
        if (!(interfaceC25747OooOo0o instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        OooOo00.OooO0o(!isClosed());
        NativeMemoryChunk nativeMemoryChunk = (NativeMemoryChunk) interfaceC25747OooOo0o;
        OooOo00.OooO0o(!nativeMemoryChunk.isClosed());
        C25749OooOoO0.OooO0OO(0, nativeMemoryChunk.f67259OooOo, 0, i, this.f67259OooOo);
        long j = 0;
        nativeMemcpy(nativeMemoryChunk.f67260OooOo0o + j, this.f67260OooOo0o + j, i);
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.f67261OooOoO0) {
            this.f67261OooOoO0 = true;
            nativeFree(this.f67260OooOo0o);
        }
    }

    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final int getSize() {
        return this.f67259OooOo;
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final long getUniqueId() {
        return this.f67260OooOo0o;
    }

    @Override // o00ooO0.InterfaceC25747OooOo0o
    public final synchronized boolean isClosed() {
        return this.f67261OooOoO0;
    }

    public NativeMemoryChunk() {
        this.f67259OooOo = 0;
        this.f67260OooOo0o = 0L;
        this.f67261OooOoO0 = true;
    }
}
