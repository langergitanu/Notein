package o0OO0OoO;

import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOo0Oo.EnumC27285OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33716OooO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OO0OoO.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.CloudSyncRepoImpl$getCurrentDriveIdFlow$$inlined$flatMapLatest$1", m80623f = "CloudSyncRepoImpl.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C26729OooOoo0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super String>, EnumC27285OooO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f92435OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92436OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26740Oooo0oo f92437OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f92438OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26729OooOoo0(Continuation continuation, C26740Oooo0oo c26740Oooo0oo) {
        super(3, continuation);
        this.f92437OooOoO = c26740Oooo0oo;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super String> interfaceC33723OooO0oO, EnumC27285OooO enumC27285OooO, Continuation<? super C32460OooOooO> continuation) {
        C26729OooOoo0 c26729OooOoo0 = new C26729OooOoo0(continuation, this.f92437OooOoO);
        c26729OooOoo0.f92435OooOo = interfaceC33723OooO0oO;
        c26729OooOoo0.f92438OooOoO0 = enumC27285OooO;
        return c26729OooOoo0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92436OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f92435OooOo;
            OooO00o oooO00o = (OooO00o) this.f92437OooOoO.f92494OooO0OO.get((EnumC27285OooO) this.f92438OooOoO0);
            InterfaceC33721OooO0o<String> c33716OooO = oooO00o == null ? new C33716OooO(null) : oooO00o.OooO0o0();
            this.f92436OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, c33716OooO, this) == enumC32485OooO00o) {
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
