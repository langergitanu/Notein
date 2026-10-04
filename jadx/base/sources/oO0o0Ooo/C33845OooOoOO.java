package oO0o0Ooo;

import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0Ooo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33845OooOoOO implements InterfaceC34415OooO0oo.OooO0OO<C33843OooOoO<?>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ThreadLocal<?> f121961OooOo0o;

    public C33845OooOoOO(ThreadLocal<?> threadLocal) {
        this.f121961OooOo0o = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33845OooOoOO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f121961OooOo0o, ((C33845OooOoOO) obj).f121961OooOo0o);
    }

    public final int hashCode() {
        return this.f121961OooOo0o.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f121961OooOo0o + ')';
    }
}
