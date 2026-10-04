package o000oo0;

import java.util.concurrent.atomic.AtomicInteger;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo0000O.InterfaceC34412OooO0o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: o000oo0.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24685Oooo00O implements InterfaceC34415OooO0oo.OooO0O0 {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final OooO00o f83653OooOoO0 = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AtomicInteger f83654OooOo = new AtomicInteger(0);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34412OooO0o f83655OooOo0o;

    /* JADX INFO: renamed from: o000oo0.Oooo00O$OooO00o */
    public static final class OooO00o implements InterfaceC34415OooO0oo.OooO0OO<C24685Oooo00O> {
    }

    public C24685Oooo00O(InterfaceC34412OooO0o interfaceC34412OooO0o) {
        this.f83655OooOo0o = interfaceC34412OooO0o;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <R> R fold(R r, InterfaceC32508OooOOOo<? super R, ? super InterfaceC34415OooO0oo.OooO0O0, ? extends R> interfaceC32508OooOOOo) {
        return interfaceC32508OooOOOo.invoke(r, this);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <E extends InterfaceC34415OooO0oo.OooO0O0> E get(InterfaceC34415OooO0oo.OooO0OO<E> oooO0OO) {
        return (E) InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0O0(this, oooO0OO);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo.OooO0O0
    public final InterfaceC34415OooO0oo.OooO0OO<C24685Oooo00O> getKey() {
        return f83653OooOoO0;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo minusKey(InterfaceC34415OooO0oo.OooO0OO<?> oooO0OO) {
        return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0OO(this, oooO0OO);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo plus(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(this, interfaceC34415OooO0oo);
    }
}
