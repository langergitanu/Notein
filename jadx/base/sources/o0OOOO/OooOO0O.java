package o0OOOO;

import com.orion.notein.App;
import com.orion.notein.data.p602db.entity.NoteinFirebaseUserEntity;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o000oo0o.C24718OooOO0o;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.datasource.NoteinFirebaseUserLocalDataSource$special$$inlined$flatMapLatest$1", m80623f = "NoteinFirebaseUserLocalDataSource.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class OooOO0O extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super NoteinFirebaseUserEntity>, AbstractC24338OooO0o0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f94286OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94287OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27081OooOO0o f94288OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f94289OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(Continuation continuation, C27081OooOO0o c27081OooOO0o) {
        super(3, continuation);
        this.f94288OooOoO = c27081OooOO0o;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super NoteinFirebaseUserEntity> interfaceC33723OooO0oO, AbstractC24338OooO0o0 abstractC24338OooO0o0, Continuation<? super C32460OooOooO> continuation) {
        OooOO0O oooOO0O = new OooOO0O(continuation, this.f94288OooOoO);
        oooOO0O.f94286OooOo = interfaceC33723OooO0oO;
        oooOO0O.f94289OooOoO0 = abstractC24338OooO0o0;
        return oooOO0O.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94287OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f94286OooOo;
            String str = (String) ((AbstractC24338OooO0o0) this.f94289OooOoO0).OooO0OO(App.f69544OooOooO);
            if (str == null) {
                str = "";
            }
            C24718OooOO0o c24718OooOO0oOooO0O0 = this.f94288OooOoO.f94290OooO00o.OooO0O0(str);
            this.f94287OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, c24718OooOO0oOooO0O0, this) == enumC32485OooO00o) {
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
