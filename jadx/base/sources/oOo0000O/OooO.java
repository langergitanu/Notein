package oOo0000O;

import java.io.Serializable;
import kotlin.jvm.internal.OooOOO0;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO implements InterfaceC34415OooO0oo, Serializable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO f123416OooOo0o = new OooO();
    private static final long serialVersionUID = 0;

    private final Object readResolve() {
        return f123416OooOo0o;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <R> R fold(R r, InterfaceC32508OooOOOo<? super R, ? super InterfaceC34415OooO0oo.OooO0O0, ? extends R> interfaceC32508OooOOOo) {
        return r;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <E extends InterfaceC34415OooO0oo.OooO0O0> E get(InterfaceC34415OooO0oo.OooO0OO<E> key) {
        OooOOO0.OooO0oO(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo minusKey(InterfaceC34415OooO0oo.OooO0OO<?> key) {
        OooOOO0.OooO0oO(key, "key");
        return this;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo plus(InterfaceC34415OooO0oo context) {
        OooOOO0.OooO0oO(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
