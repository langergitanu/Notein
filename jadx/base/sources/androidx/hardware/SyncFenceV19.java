package androidx.hardware;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import o000OO0O.InterfaceC24492OooO0Oo;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0083 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0003H\u0083 ¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0083 ¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m80612d2 = {"Landroidx/hardware/SyncFenceV19;", "Ljava/lang/AutoCloseable;", "Lo000OO0O/OooO0Oo;", "", "dupeFileDescriptor", "()I", "fd", "timeoutMillis", "", "nWait", "(II)Z", "LoO00ooO/OooOooO;", "nClose", "(I)V", "nDup", "(I)I", "graphics-core_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class SyncFenceV19 implements AutoCloseable, InterfaceC24492OooO0Oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ReentrantLock f65153OooOo = new ReentrantLock();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f65154OooOo0o;

    static {
        System.loadLibrary("graphics-core");
    }

    public SyncFenceV19(int i) {
        this.f65154OooOo0o = i;
    }

    private final int dupeFileDescriptor() {
        ReentrantLock reentrantLock = this.f65153OooOo;
        reentrantLock.lock();
        try {
            return OooOOO0() ? nDup(this.f65154OooOo0o) : -1;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final native void nClose(int fd);

    private final native int nDup(int fd);

    private final native boolean nWait(int fd, int timeoutMillis);

    @Override // o000OO0O.InterfaceC24492OooO0Oo
    public final long OooO00o() {
        ReentrantLock reentrantLock = this.f65153OooOo;
        reentrantLock.lock();
        try {
            return OooOOO0() ? SyncFenceBindings.f65152OooO00o.nGetSignalTime(this.f65154OooOo0o) : -1L;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o000OO0O.InterfaceC24492OooO0Oo
    public final boolean OooO0OO() {
        ReentrantLock reentrantLock = this.f65153OooOo;
        reentrantLock.lock();
        try {
            if (OooOOO0()) {
                return nWait(this.f65154OooOo0o, -1);
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean OooOOO0() {
        ReentrantLock reentrantLock = this.f65153OooOo;
        reentrantLock.lock();
        try {
            return this.f65154OooOo0o != -1;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.lang.AutoCloseable, o000OO0O.InterfaceC24492OooO0Oo
    public final void close() {
        ReentrantLock reentrantLock = this.f65153OooOo;
        reentrantLock.lock();
        try {
            if (OooOOO0()) {
                nClose(this.f65154OooOo0o);
                this.f65154OooOo0o = -1;
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void finalize() {
        close();
    }
}
