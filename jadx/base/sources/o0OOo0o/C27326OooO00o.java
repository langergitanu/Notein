package o0OOo0o;

import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27291OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.AnalyticsUseCase$getStatsOfPalmDetection$2", m80623f = "AnalyticsUseCase.kt", m80624l = {168}, m80625m = "invokeSuspend")
public final class C27326OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27328OooO0OO f95082OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95083OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27326OooO00o(C27328OooO0OO c27328OooO0OO, Continuation continuation) {
        super(2, continuation);
        this.f95082OooOo = c27328OooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27326OooO00o(this.f95082OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C27326OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95083OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC27291OooO0o0 interfaceC27291OooO0o0 = this.f95082OooOo.f95090OooO0o0;
        this.f95083OooOo0o = 1;
        Object objOooO00o = interfaceC27291OooO0o0.OooO00o("palm_detection_of_double_tap", this);
        return objOooO00o == enumC32485OooO00o ? enumC32485OooO00o : objOooO00o;
    }
}
