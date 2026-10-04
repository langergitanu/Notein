package o0OOooO;

import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27318Oooo00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOooO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.pagelayer.PageLayerUseCase$getAllItemsCountInLayer$2", m80623f = "PageLayerUseCase.kt", m80624l = {170}, m80625m = "invokeSuspend")
public final class C27877OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Long>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27881OooOO0O f98522OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f98523OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f98524OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f98525OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27877OooO0o0(C27881OooOO0O c27881OooOO0O, String str, String str2, Continuation<? super C27877OooO0o0> continuation) {
        super(2, continuation);
        this.f98522OooOo = c27881OooOO0O;
        this.f98525OooOoO0 = str;
        this.f98524OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27877OooO0o0(this.f98522OooOo, this.f98525OooOoO0, this.f98524OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Long> continuation) {
        return ((C27877OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98523OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC27318Oooo00o interfaceC27318Oooo00o = this.f98522OooOo.f98543OooO00o;
        this.f98523OooOo0o = 1;
        Object objOooOO0O = interfaceC27318Oooo00o.OooOO0O(this.f98525OooOoO0, this.f98524OooOoO, this);
        return objOooOO0O == enumC32485OooO00o ? enumC32485OooO00o : objOooOO0O;
    }
}
