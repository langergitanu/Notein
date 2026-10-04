package oO0o0OoO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.AbstractC33630OooOooO;
import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OoO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33798OooOO0<T> extends AbstractC33789OooO<T, T> {
    public C33798OooOO0(InterfaceC33721OooO0o interfaceC33721OooO0o, AbstractC33630OooOooO abstractC33630OooOooO, int i, EnumC33692OooO0OO enumC33692OooO0OO, int i2) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? EnumC33692OooO0OO.f121452OooOo0o : enumC33692OooO0OO, interfaceC33721OooO0o, (i2 & 2) != 0 ? oOo0000O.OooO.f123416OooOo0o : abstractC33630OooOooO);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // oO0o0OoO.AbstractC33789OooO
    public final Object OooO(InterfaceC33723OooO0oO<? super T> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        Object objCollect = this.f121820OooOoO.collect((InterfaceC33723OooO0oO<? super S>) interfaceC33723OooO0oO, continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }

    @Override // oO0o0OoO.AbstractC33796OooO0oO
    public final AbstractC33796OooO0oO<T> OooO0o0(InterfaceC34415OooO0oo interfaceC34415OooO0oo, int i, EnumC33692OooO0OO enumC33692OooO0OO) {
        return new C33798OooOO0(i, enumC33692OooO0OO, this.f121820OooOoO, interfaceC34415OooO0oo);
    }

    @Override // oO0o0OoO.AbstractC33796OooO0oO
    public final InterfaceC33721OooO0o<T> OooO0oO() {
        return (InterfaceC33721OooO0o<T>) this.f121820OooOoO;
    }
}
