package oO00OOO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: oO00OOO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serializeNullable$fromExtension$2", m80623f = "KotlinxSerializationConverter.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C32233OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<oO00O0oO.OooO0OO, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f115753OooOo0o;

    public C32233OooO0oO() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C32233OooO0oO c32233OooO0oO = new C32233OooO0oO(2, continuation);
        c32233OooO0oO.f115753OooOo0o = obj;
        return c32233OooO0oO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(oO00O0oO.OooO0OO oooO0OO, Continuation<? super Boolean> continuation) {
        return ((C32233OooO0oO) create(oooO0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return Boolean.valueOf(((oO00O0oO.OooO0OO) this.f115753OooOo0o) != null);
    }
}
