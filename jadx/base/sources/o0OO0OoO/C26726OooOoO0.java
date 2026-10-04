package o0OO0OoO;

import com.orion.notein.domain.models.cloud.NoteCloudQuota;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.EnumC27285OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33716OooO;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OO0OoO.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.CloudSyncRepoImpl$getCloudQuotaFlow$$inlined$flatMapLatest$1", m80623f = "CloudSyncRepoImpl.kt", m80624l = {193, 189}, m80625m = "invokeSuspend")
public final class C26726OooOoO0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super NoteCloudQuota>, EnumC27285OooO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f92422OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92423OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26740Oooo0oo f92424OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f92425OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26726OooOoO0(Continuation continuation, C26740Oooo0oo c26740Oooo0oo) {
        super(3, continuation);
        this.f92424OooOoO = c26740Oooo0oo;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super NoteCloudQuota> interfaceC33723OooO0oO, EnumC27285OooO enumC27285OooO, Continuation<? super C32460OooOooO> continuation) {
        C26726OooOoO0 c26726OooOoO0 = new C26726OooOoO0(continuation, this.f92424OooOoO);
        c26726OooOoO0.f92422OooOo = interfaceC33723OooO0oO;
        c26726OooOoO0.f92425OooOoO0 = enumC27285OooO;
        return c26726OooOoO0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (o00o00O0.C25252OooO0Oo.OooOOO0(r1, (oO0o0Oo.InterfaceC33721OooO0o) r7, r6) == r0) goto L18;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92423OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO = this.f92422OooOo;
            EnumC27285OooO enumC27285OooO = (EnumC27285OooO) this.f92425OooOoO0;
            if (enumC27285OooO != EnumC27285OooO.f95076OooOo0o) {
                OooO00o oooO00oOooo = this.f92424OooOoO.Oooo(enumC27285OooO);
                this.f92422OooOo = interfaceC33723OooO0oO;
                this.f92423OooOo0o = 1;
                obj = oooO00oOooo.OooO00o();
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            obj = new C33716OooO(null);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            interfaceC33723OooO0oO = this.f92422OooOo;
            C32446OooOOOo.OooO0O0(obj);
        }
        this.f92422OooOo = null;
        this.f92423OooOo0o = 2;
    }
}
