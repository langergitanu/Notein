package o0OO0OoO;

import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import java.util.List;
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
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OO0OoO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.CloudSyncRepoImpl$getAllCloudMetaLocalsFlow$$inlined$flatMapLatest$1", m80623f = "CloudSyncRepoImpl.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C26718OooOOOo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends CloudMetaLocal>>, EnumC27285OooO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f92371OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92372OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26740Oooo0oo f92373OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f92374OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f92375OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26718OooOOOo(Continuation continuation, C26740Oooo0oo c26740Oooo0oo, String str) {
        super(3, continuation);
        this.f92373OooOoO = c26740Oooo0oo;
        this.f92375OooOoOO = str;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends CloudMetaLocal>> interfaceC33723OooO0oO, EnumC27285OooO enumC27285OooO, Continuation<? super C32460OooOooO> continuation) {
        C26718OooOOOo c26718OooOOOo = new C26718OooOOOo(continuation, this.f92373OooOoO, this.f92375OooOoOO);
        c26718OooOOOo.f92371OooOo = interfaceC33723OooO0oO;
        c26718OooOOOo.f92374OooOoO0 = enumC27285OooO;
        return c26718OooOOOo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92372OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f92371OooOo;
            EnumC27285OooO enumC27285OooO = (EnumC27285OooO) this.f92374OooOoO0;
            C26740Oooo0oo c26740Oooo0oo = this.f92373OooOoO;
            OooO00o oooO00o = (OooO00o) c26740Oooo0oo.f92494OooO0OO.get(enumC27285OooO);
            InterfaceC33721OooO0o c33716OooO = oooO00o == null ? new C33716OooO(C34434OooOoO.f123453OooOo0o) : new C26720OooOOo0(oooO00o.OooOOoo(this.f92375OooOoOO), c26740Oooo0oo);
            this.f92372OooOo0o = 1;
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
