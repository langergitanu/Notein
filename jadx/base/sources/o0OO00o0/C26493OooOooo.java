package o0OO00o0;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OO00o0.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.DualLinkRefLocalDataSource$deleteByNoteId$2", m80623f = "DualLinkRefLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26493OooOooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<oo0oO0.oo000o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f91063OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f91064OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26493OooOooo(String str, Continuation<? super C26493OooOooo> continuation) {
        super(2, continuation);
        this.f91063OooOo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26493OooOooo c26493OooOooo = new C26493OooOooo(this.f91063OooOo, continuation);
        c26493OooOooo.f91064OooOo0o = obj;
        return c26493OooOooo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(oo0oO0.oo000o oo000oVar, Continuation<? super C32460OooOooO> continuation) {
        return ((C26493OooOooo) create(oo000oVar, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        ((oo0oO0.oo000o) this.f91064OooOo0o).OooO0Oo(this.f91063OooOo);
        return C32460OooOooO.f116667OooO00o;
    }
}
