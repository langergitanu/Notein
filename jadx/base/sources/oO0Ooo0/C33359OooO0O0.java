package oO0Ooo0;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: oO0Ooo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33359OooO0O0 implements InterfaceC33372OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ReentrantLock f120639OooO00o = new ReentrantLock();

    public C33359OooO0O0(int i) {
    }

    @Override // oO0Ooo0.InterfaceC33372OooOO0o
    public void lock() {
        this.f120639OooO00o.lock();
    }

    @Override // oO0Ooo0.InterfaceC33372OooOO0o
    public final void unlock() {
        this.f120639OooO00o.unlock();
    }
}
