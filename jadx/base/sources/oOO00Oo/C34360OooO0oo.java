package oOO00Oo;

import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;
import oOO00OOo.InterfaceC34352OooO0O0;
import oOO00Oo0.C34361OooO00o;
import oOO00Oo0.InterfaceC34362OooO0O0;

/* JADX INFO: renamed from: oOO00Oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34360OooO0oo implements InterfaceC34352OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public volatile InterfaceC34352OooO0O0 f123324OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f123325OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Method f123326OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Boolean f123327OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C34361OooO00o f123328OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final boolean f123329OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final LinkedBlockingQueue f123330OooOoo0;

    public C34360OooO0oo(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.f123325OooOo0o = str;
        this.f123330OooOoo0 = linkedBlockingQueue;
        this.f123329OooOoo = z;
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final boolean OooO(int i) {
        return OooOo0().OooO(i);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final boolean OooO00o() {
        return OooOo0().OooO00o();
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooO0O0(Object obj, String str) {
        OooOo0().OooO0O0(obj, str);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooO0OO(Object obj, String str) {
        OooOo0().OooO0OO(obj, str);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final boolean OooO0Oo() {
        return OooOo0().OooO0Oo();
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooO0o(Object obj, String str, Object obj2) {
        OooOo0().OooO0o(obj, str, obj2);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooO0o0(Object obj, String str, Object obj2) {
        OooOo0().OooO0o0(obj, str, obj2);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooO0oO(String str) {
        OooOo0().OooO0oO(str);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooO0oo(String str) {
        OooOo0().OooO0oo(str);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final boolean OooOO0() {
        return OooOo0().OooOO0();
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final boolean OooOO0O() {
        return OooOo0().OooOO0O();
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final boolean OooOO0o() {
        return OooOo0().OooOO0o();
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooOOO(Object obj, String str) {
        OooOo0().OooOOO(obj, str);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooOOO0(Object obj, String str, Object obj2) {
        OooOo0().OooOOO0(obj, str, obj2);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooOOOO(Object obj, String str, Object obj2) {
        OooOo0().OooOOOO(obj, str, obj2);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooOOOo(Object obj, String str, Object obj2) {
        OooOo0().OooOOOo(obj, str, obj2);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooOOo(String str) {
        OooOo0().OooOOo(str);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooOOo0(Object obj, String str) {
        OooOo0().OooOOo0(obj, str);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooOOoo(String str) {
        OooOo0().OooOOoo(str);
    }

    public final InterfaceC34352OooO0O0 OooOo0() {
        if (this.f123324OooOo != null) {
            return this.f123324OooOo;
        }
        if (this.f123329OooOoo) {
            return C34357OooO0Oo.f123321OooOo0o;
        }
        if (this.f123328OooOoOO == null) {
            C34361OooO00o c34361OooO00o = new C34361OooO00o();
            c34361OooO00o.f123335OooOo = this;
            c34361OooO00o.f123336OooOo0o = this.f123325OooOo0o;
            c34361OooO00o.f123337OooOoO0 = this.f123330OooOoo0;
            this.f123328OooOoOO = c34361OooO00o;
        }
        return this.f123328OooOoOO;
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooOo00(Object obj, String str) {
        OooOo0().OooOo00(obj, str);
    }

    public final boolean OooOo0O() {
        Boolean bool = this.f123327OooOoO0;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f123326OooOoO = this.f123324OooOo.getClass().getMethod("log", InterfaceC34362OooO0O0.class);
            this.f123327OooOoO0 = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f123327OooOoO0 = Boolean.FALSE;
        }
        return this.f123327OooOoO0.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C34360OooO0oo.class == obj.getClass() && this.f123325OooOo0o.equals(((C34360OooO0oo) obj).f123325OooOo0o);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final String getName() {
        return this.f123325OooOo0o;
    }

    public final int hashCode() {
        return this.f123325OooOo0o.hashCode();
    }
}
