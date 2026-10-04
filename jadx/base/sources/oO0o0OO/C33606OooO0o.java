package oO0o0OO;

import java.util.concurrent.locks.LockSupport;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33606OooO0o<T> extends AbstractC33602OooO00o<T> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Thread f121286OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final AbstractC33655OooooO0 f121287OooOoOO;

    public C33606OooO0o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, Thread thread, AbstractC33655OooooO0 abstractC33655OooooO0) {
        super(interfaceC34415OooO0oo, true, true);
        this.f121286OooOoO = thread;
        this.f121287OooOoOO = abstractC33655OooooO0;
    }

    @Override // oO0o0OO.o0ooOOo
    public final void OooOOo(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f121286OooOoO;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
