package o0OOo0oo;

import kotlin.coroutines.Continuation;
import o00Oo000.C25035OooO0O0;
import o0OOo0Oo.EnumC27285OooO;
import o0OOo0o0.InterfaceC27605OooO00o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.CloudSyncAuthUseCase$cancel$2", m80623f = "CloudSyncAuthUseCase.kt", m80624l = {57}, m80625m = "invokeSuspend")
public final class C27625OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends C32460OooOooO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f97143OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f97144OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ EnumC27285OooO f97145OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C25035OooO0O0 f97146OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27625OooOOOO(C25035OooO0O0 c25035OooO0O0, EnumC27285OooO enumC27285OooO, Continuation<? super C27625OooOOOO> continuation) {
        super(2, continuation);
        this.f97146OooOoO0 = c25035OooO0O0;
        this.f97145OooOoO = enumC27285OooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27625OooOOOO c27625OooOOOO = new C27625OooOOOO(this.f97146OooOoO0, this.f97145OooOoO, continuation);
        c27625OooOOOO.f97143OooOo = obj;
        return c27625OooOOOO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends C32460OooOooO>> continuation) {
        return ((C27625OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f97144OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C25035OooO0O0 c25035OooO0O0 = this.f97146OooOoO0;
                EnumC27285OooO enumC27285OooO = this.f97145OooOoO;
                InterfaceC27605OooO00o interfaceC27605OooO00o = (InterfaceC27605OooO00o) c25035OooO0O0.f85014OooO0O0;
                this.f97144OooOo0o = 1;
                if (interfaceC27605OooO00o.OooO0oo(enumC27285OooO, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            objOooO00o = C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        if (!(objOooO00o instanceof C32445OooOOOO.OooO00o)) {
            C34406OooO00o.f123390OooO00o.OooO00o("CloudSync cancel success", new Object[0]);
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CloudSyncAuthUseCase");
            c20358OooO00o.OooO0Oo(thOooO00o, "CloudSync cancel authorize failed", new Object[0]);
        }
        return new C32445OooOOOO(objOooO00o);
    }
}
