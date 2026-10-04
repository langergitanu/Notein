package o0OO00o0;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34993o0ooOoOO;

/* JADX INFO: renamed from: o0OO00o0.o00o000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.StrokeLocalDataSource$deleteStrokesByPageId$2", m80623f = "StrokeLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26656o00o000o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34993o0ooOoOO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f91994OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f91995OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26656o00o000o(String str, Continuation<? super C26656o00o000o> continuation) {
        super(2, continuation);
        this.f91994OooOo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26656o00o000o c26656o00o000o = new C26656o00o000o(this.f91994OooOo, continuation);
        c26656o00o000o.f91995OooOo0o = obj;
        return c26656o00o000o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34993o0ooOoOO abstractC34993o0ooOoOO, Continuation<? super C32460OooOooO> continuation) {
        return ((C26656o00o000o) create(abstractC34993o0ooOoOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        ((AbstractC34993o0ooOoOO) this.f91995OooOo0o).OooO0Oo(this.f91994OooOo);
        return C32460OooOooO.f116667OooO00o;
    }
}
