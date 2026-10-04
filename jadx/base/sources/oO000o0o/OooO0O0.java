package oO000o0o;

import OooOooO.C20741OooOOoo;
import io.ktor.utils.p616io.C23968Oooo00o;
import io.ktor.utils.p616io.C24005o00o0O;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00O0o0.C32183OooO0Oo;
import oO00O0o0.C32194OooOo0o;
import oO00O0o0.OooOO0O;
import oO00O0oO.OooO0OO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33662Ooooooo;
import oO0o0OO.InterfaceC33672o00ooo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 extends OooO0OO.AbstractC20204OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC33672o00ooo f115079OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC32510OooOOo0<Long, Long, Continuation<? super C32460OooOooO>, Object> f115080OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC23986Ooooo0o f115081OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO f115082OooO0Oo;

    public OooO0O0(OooO0OO delegate, InterfaceC33672o00ooo callContext, InterfaceC32510OooOOo0 interfaceC32510OooOOo0) {
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0oOooO0o0;
        OooOOO0.OooO0oO(delegate, "delegate");
        OooOOO0.OooO0oO(callContext, "callContext");
        this.f115079OooO00o = callContext;
        this.f115080OooO0O0 = interfaceC32510OooOOo0;
        if (delegate instanceof OooO0OO.OooO00o) {
            interfaceC23986Ooooo0oOooO0o0 = C23968Oooo00o.OooO00o(((OooO0OO.OooO00o) delegate).OooO0o0());
        } else if (delegate instanceof OooO0OO.OooO0O0) {
            InterfaceC23986Ooooo0o.f80771OooO00o.getClass();
            interfaceC23986Ooooo0oOooO0o0 = (InterfaceC23986Ooooo0o) InterfaceC23986Ooooo0o.OooO00o.f80773OooO0O0.getValue();
        } else if (delegate instanceof OooO0OO.AbstractC20204OooO0OO) {
            interfaceC23986Ooooo0oOooO0o0 = ((OooO0OO.AbstractC20204OooO0OO) delegate).OooO0o0();
        } else {
            if (!(delegate instanceof OooO0OO.OooO0Oo)) {
                throw new C32442OooOO0o();
            }
            interfaceC23986Ooooo0oOooO0o0 = C24005o00o0O.OooO0OO(C33662Ooooooo.f121350OooOo0o, callContext, true, new C32102OooO00o(delegate, null)).f80790OooOo;
        }
        this.f115081OooO0OO = interfaceC23986Ooooo0oOooO0o0;
        this.f115082OooO0Oo = delegate;
    }

    @Override // oO00O0oO.OooO0OO
    public final Long OooO00o() {
        return this.f115082OooO0Oo.OooO00o();
    }

    @Override // oO00O0oO.OooO0OO
    public final C32183OooO0Oo OooO0O0() {
        return this.f115082OooO0Oo.OooO0O0();
    }

    @Override // oO00O0oO.OooO0OO
    public final OooOO0O OooO0OO() {
        return this.f115082OooO0Oo.OooO0OO();
    }

    @Override // oO00O0oO.OooO0OO
    public final C32194OooOo0o OooO0Oo() {
        return this.f115082OooO0Oo.OooO0Oo();
    }

    @Override // oO00O0oO.OooO0OO.AbstractC20204OooO0OO
    public final InterfaceC23986Ooooo0o OooO0o0() {
        return C20741OooOOoo.OooO0oo(this.f115081OooO0OO, this.f115079OooO00o, this.f115082OooO0Oo.OooO00o(), this.f115080OooO0O0);
    }
}
