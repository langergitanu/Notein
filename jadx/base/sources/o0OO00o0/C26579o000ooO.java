package o0OO00o0;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.InterfaceC34757o0000Oo;

/* JADX INFO: renamed from: o0OO00o0.o000ooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.HyperLinkLocalDataSource$deleteHyperLinksByPageId$2", m80623f = "HyperLinkLocalDataSource.kt", m80624l = {65}, m80625m = "invokeSuspend")
public final class C26579o000ooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34757o0000Oo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91603OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91604OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f91605OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26579o000ooO(String str, Continuation<? super C26579o000ooO> continuation) {
        super(2, continuation);
        this.f91605OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26579o000ooO c26579o000ooO = new C26579o000ooO(this.f91605OooOoO0, continuation);
        c26579o000ooO.f91603OooOo = obj;
        return c26579o000ooO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34757o0000Oo interfaceC34757o0000Oo, Continuation<? super C32460OooOooO> continuation) {
        return ((C26579o000ooO) create(interfaceC34757o0000Oo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91604OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC34757o0000Oo interfaceC34757o0000Oo = (InterfaceC34757o0000Oo) this.f91603OooOo;
            this.f91604OooOo0o = 1;
            if (interfaceC34757o0000Oo.OooO0O0(this.f91605OooOoO0, this) == enumC32485OooO00o) {
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
