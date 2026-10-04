package o0Oo0o00;

import com.orion.notein.domain.models.cloudsync.CloudAuthRequest;
import com.orion.notein.domain.models.cloudsync.CloudAuthResult;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.EnumC27285OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Oo0o00.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncSettingsViewModel$authorizeCloudSync$2", m80623f = "CloudSyncSettingsViewModel.kt", m80624l = {44}, m80625m = "invokeSuspend")
public final class C28190OoooO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super CloudAuthResult>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28194OoooOOO f99891OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99892OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ CloudAuthRequest f99893OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ EnumC27285OooO f99894OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28190OoooO0(C28194OoooOOO c28194OoooOOO, EnumC27285OooO enumC27285OooO, CloudAuthRequest cloudAuthRequest, Continuation<? super C28190OoooO0> continuation) {
        super(2, continuation);
        this.f99891OooOo = c28194OoooOOO;
        this.f99894OooOoO0 = enumC27285OooO;
        this.f99893OooOoO = cloudAuthRequest;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28190OoooO0(this.f99891OooOo, this.f99894OooOoO0, this.f99893OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super CloudAuthResult> continuation) {
        return ((C28190OoooO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99892OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        this.f99892OooOo0o = 1;
        Object objOooO0o0 = C28194OoooOOO.OooO0o0(this.f99891OooOo, this.f99894OooOoO0, this.f99893OooOoO, this);
        return objOooO0o0 == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o0;
    }
}
