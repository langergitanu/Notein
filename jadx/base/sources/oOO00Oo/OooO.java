package oOO00Oo;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import oOO00OOo.InterfaceC34351OooO00o;
import oOO00OOo.InterfaceC34352OooO0O0;
import oOO00Oo0.C34363OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO implements InterfaceC34351OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile boolean f123317OooO00o = false;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentHashMap f123318OooO0O0 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LinkedBlockingQueue<C34363OooO0OO> f123319OooO0OO = new LinkedBlockingQueue<>();

    @Override // oOO00OOo.InterfaceC34351OooO00o
    public final synchronized InterfaceC34352OooO0O0 OooO00o(String str) {
        C34360OooO0oo c34360OooO0oo;
        c34360OooO0oo = (C34360OooO0oo) this.f123318OooO0O0.get(str);
        if (c34360OooO0oo == null) {
            c34360OooO0oo = new C34360OooO0oo(str, this.f123319OooO0OO, this.f123317OooO00o);
            this.f123318OooO0O0.put(str, c34360OooO0oo);
        }
        return c34360OooO0oo;
    }
}
