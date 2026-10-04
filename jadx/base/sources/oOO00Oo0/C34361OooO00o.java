package oOO00Oo0;

import java.util.concurrent.LinkedBlockingQueue;
import oOO00Oo.C34360OooO0oo;

/* JADX INFO: renamed from: oOO00Oo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34361OooO00o extends oOO00Oo.OooO0OO {
    private static final long serialVersionUID = -176083308134819629L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C34360OooO0oo f123335OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f123336OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public LinkedBlockingQueue f123337OooOoO0;

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final boolean OooO00o() {
        return true;
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final boolean OooO0Oo() {
        return true;
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final boolean OooOO0() {
        return true;
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final boolean OooOO0O() {
        return true;
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final boolean OooOO0o() {
        return true;
    }

    @Override // oOO00Oo.AbstractC34356OooO00o
    public final void OooOo0O(int i, Object[] objArr) {
        C34363OooO0OO c34363OooO0OO = new C34363OooO0OO();
        System.currentTimeMillis();
        c34363OooO0OO.f123338OooO00o = i;
        c34363OooO0OO.f123339OooO0O0 = this.f123335OooOo;
        Thread.currentThread().getName();
        c34363OooO0OO.f123340OooO0OO = objArr;
        this.f123337OooOoO0.add(c34363OooO0OO);
    }

    @Override // oOO00Oo.AbstractC34356OooO00o, oOO00OOo.InterfaceC34352OooO0O0
    public final String getName() {
        return this.f123336OooOo0o;
    }
}
