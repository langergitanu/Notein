package o0OO00o0;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.InterfaceC34757o0000Oo;

/* JADX INFO: renamed from: o0OO00o0.o000oo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.HyperLinkLocalDataSource$clearHyperLinks$2", m80623f = "HyperLinkLocalDataSource.kt", m80624l = {71}, m80625m = "invokeSuspend")
public final class C26578o000oo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34757o0000Oo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91601OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91602OooOo0o;

    public C26578o000oo0o() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26578o000oo0o c26578o000oo0o = new C26578o000oo0o(2, continuation);
        c26578o000oo0o.f91601OooOo = obj;
        return c26578o000oo0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34757o0000Oo interfaceC34757o0000Oo, Continuation<? super C32460OooOooO> continuation) {
        return ((C26578o000oo0o) create(interfaceC34757o0000Oo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91602OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC34757o0000Oo interfaceC34757o0000Oo = (InterfaceC34757o0000Oo) this.f91601OooOo;
            this.f91602OooOo0o = 1;
            if (interfaceC34757o0000Oo.OooO0Oo(this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
