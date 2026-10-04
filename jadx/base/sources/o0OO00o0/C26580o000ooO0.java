package o0OO00o0;

import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.InterfaceC34757o0000Oo;

/* JADX INFO: renamed from: o0OO00o0.o000ooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.HyperLinkLocalDataSource$deleteHyperLinkByIdList$2", m80623f = "HyperLinkLocalDataSource.kt", m80624l = {91}, m80625m = "invokeSuspend")
public final class C26580o000ooO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34757o0000Oo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91606OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91607OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<String> f91608OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26580o000ooO0(List<String> list, Continuation<? super C26580o000ooO0> continuation) {
        super(2, continuation);
        this.f91608OooOoO0 = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26580o000ooO0 c26580o000ooO0 = new C26580o000ooO0(this.f91608OooOoO0, continuation);
        c26580o000ooO0.f91606OooOo = obj;
        return c26580o000ooO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34757o0000Oo interfaceC34757o0000Oo, Continuation<? super C32460OooOooO> continuation) {
        return ((C26580o000ooO0) create(interfaceC34757o0000Oo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91607OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC34757o0000Oo interfaceC34757o0000Oo = (InterfaceC34757o0000Oo) this.f91606OooOo;
            this.f91607OooOo0o = 1;
            if (interfaceC34757o0000Oo.OooO0o0(this.f91608OooOoO0, this) == enumC32485OooO00o) {
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
