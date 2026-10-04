package o0o0O0oO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0o0O0oO.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListViewModel$reloadPages$1", m80623f = "TrashBinListViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C30349Oooo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30351Oooo0oO f108217OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108218OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30349Oooo0o(C30351Oooo0oO c30351Oooo0oO, Continuation<? super C30349Oooo0o> continuation) {
        super(2, continuation);
        this.f108217OooOo = c30351Oooo0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30349Oooo0o(this.f108217OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30349Oooo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108218OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33781o00o0O c33781o00o0O = this.f108217OooOo.f108244OooOo0O;
            Boolean boolValueOf = Boolean.valueOf(!((Boolean) c33781o00o0O.getValue()).booleanValue());
            this.f108218OooOo0o = 1;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, boolValueOf);
            if (C32460OooOooO.f116667OooO00o == enumC32485OooO00o) {
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
