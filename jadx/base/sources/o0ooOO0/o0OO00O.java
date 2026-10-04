package o0ooOO0;

import Oooo0oO.C21105o000OoO;
import OoooOoO.InterfaceC21235OooO0oO;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O implements InterfaceC21235OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f112917OooOo0o = C21105o000OoO.OooO0OO(Float.valueOf(1.0f), Oooo0oO.o000O0O0.f61218OooO00o);

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <R> R fold(R r, InterfaceC32508OooOOOo<? super R, ? super InterfaceC34415OooO0oo.OooO0O0, ? extends R> interfaceC32508OooOOOo) {
        return interfaceC32508OooOOOo.invoke(r, this);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <E extends InterfaceC34415OooO0oo.OooO0O0> E get(InterfaceC34415OooO0oo.OooO0OO<E> key) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        return (E) InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0O0(this, key);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo minusKey(InterfaceC34415OooO0oo.OooO0OO<?> key) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0OO(this, key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // OoooOoO.InterfaceC21235OooO0oO
    public final float o00000OO() {
        return ((Number) this.f112917OooOo0o.getValue()).floatValue();
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo plus(InterfaceC34415OooO0oo context) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        return InterfaceC34415OooO0oo.OooO00o.OooO00o(this, context);
    }
}
