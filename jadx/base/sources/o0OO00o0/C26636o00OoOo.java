package o0OO00o0;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34967o00ooo00;

/* JADX INFO: renamed from: o0OO00o0.o00OoOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ShapeLocalDataSource$clearShapes$2", m80623f = "ShapeLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26636o00OoOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34967o00ooo00, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f91936OooOo0o;

    public C26636o00OoOo() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26636o00OoOo c26636o00OoOo = new C26636o00OoOo(2, continuation);
        c26636o00OoOo.f91936OooOo0o = obj;
        return c26636o00OoOo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34967o00ooo00 abstractC34967o00ooo00, Continuation<? super C32460OooOooO> continuation) {
        return ((C26636o00OoOo) create(abstractC34967o00ooo00, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        ((AbstractC34967o00ooo00) this.f91936OooOo0o).OooO00o();
        return C32460OooOooO.f116667OooO00o;
    }
}
