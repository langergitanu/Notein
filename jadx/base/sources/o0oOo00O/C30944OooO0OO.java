package o0oOo00O;

import kotlin.coroutines.Continuation;
import o0000oOO.C24332OooO;
import o0OOOO0o.C27129OoooOOO;
import o0OOOO0o.C27139Oooooo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0oOo00O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.storage.StorageOptimizationViewModel$setHasClearedPdfFiles$2", m80623f = "StorageOptimizationViewModel.kt", m80624l = {30}, m80625m = "invokeSuspend")
public final class C30944OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30945OooO0Oo f110591OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110592OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30944OooO0OO(C30945OooO0Oo c30945OooO0Oo, Continuation<? super C30944OooO0OO> continuation) {
        super(2, continuation);
        this.f110591OooOo = c30945OooO0Oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30944OooO0OO(this.f110591OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30944OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110592OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30945OooO0Oo c30945OooO0Oo = this.f110591OooOo;
            this.f110592OooOo0o = 1;
            C27129OoooOOO c27129OoooOOO = c30945OooO0Oo.f110594OooO0o0;
            c27129OoooOOO.getClass();
            Object objOooO00o = C24332OooO.OooO00o(c27129OoooOOO.f94597OooO0O0, new C27139Oooooo(2, null), this);
            if (objOooO00o != obj2) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o == obj2) {
                return obj2;
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
