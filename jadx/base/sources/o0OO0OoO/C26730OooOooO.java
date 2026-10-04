package o0OO0OoO;

import com.orion.notein.domain.models.cloudsync.CloudEvent;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOo0Oo.EnumC27285OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33722OooO0o0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OO0OoO.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.CloudSyncRepoImpl$observeSyncEvents$$inlined$flatMapLatest$1", m80623f = "CloudSyncRepoImpl.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C26730OooOooO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super CloudEvent>, EnumC27285OooO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f92439OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92440OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26740Oooo0oo f92441OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f92442OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26730OooOooO(Continuation continuation, C26740Oooo0oo c26740Oooo0oo) {
        super(3, continuation);
        this.f92441OooOoO = c26740Oooo0oo;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super CloudEvent> interfaceC33723OooO0oO, EnumC27285OooO enumC27285OooO, Continuation<? super C32460OooOooO> continuation) {
        C26730OooOooO c26730OooOooO = new C26730OooOooO(continuation, this.f92441OooOoO);
        c26730OooOooO.f92439OooOo = interfaceC33723OooO0oO;
        c26730OooOooO.f92442OooOoO0 = enumC27285OooO;
        return c26730OooOooO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92440OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f92439OooOo;
            OooO00o oooO00o = (OooO00o) this.f92441OooOoO.f92494OooO0OO.get((EnumC27285OooO) this.f92442OooOoO0);
            InterfaceC33721OooO0o interfaceC33721OooO0oOooO0oO = oooO00o != null ? oooO00o.OooO0oO() : C33722OooO0o0.f121519OooOo0o;
            this.f92440OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, interfaceC33721OooO0oOooO0oO, this) == enumC32485OooO00o) {
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
