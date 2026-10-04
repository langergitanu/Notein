package oO0o0Oo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oO0o0OoO.AbstractC33796OooO0oO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0Oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33719OooO0OO<T> extends AbstractC33796OooO0oO<T> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final AbstractC32476OooO f121510OooOoO;

    /* JADX WARN: Multi-variable type inference failed */
    public C33719OooO0OO(InterfaceC32508OooOOOo<? super InterfaceC33712OooOo0O<? super T>, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32508OooOOOo, InterfaceC34415OooO0oo interfaceC34415OooO0oo, int i, EnumC33692OooO0OO enumC33692OooO0OO) {
        super(interfaceC34415OooO0oo, i, enumC33692OooO0OO);
        this.f121510OooOoO = (AbstractC32476OooO) interfaceC32508OooOOOo;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO0o0OoO.AbstractC33796OooO0oO
    public Object OooO0O0(InterfaceC33712OooOo0O<? super T> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
        Object objInvoke = this.f121510OooOoO.invoke(interfaceC33712OooOo0O, continuation);
        return objInvoke == EnumC32485OooO00o.f116726OooOo0o ? objInvoke : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO0o0OoO.AbstractC33796OooO0oO
    public AbstractC33796OooO0oO<T> OooO0o0(InterfaceC34415OooO0oo interfaceC34415OooO0oo, int i, EnumC33692OooO0OO enumC33692OooO0OO) {
        return new C33719OooO0OO(this.f121510OooOoO, interfaceC34415OooO0oo, i, enumC33692OooO0OO);
    }

    @Override // oO0o0OoO.AbstractC33796OooO0oO
    public final String toString() {
        return "block[" + this.f121510OooOoO + "] -> " + super.toString();
    }
}
