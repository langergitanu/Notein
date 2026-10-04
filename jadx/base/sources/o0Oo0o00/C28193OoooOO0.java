package o0Oo0o00;

import com.orion.notein.domain.models.cloudsync.CloudAuthCredentials;
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

/* JADX INFO: renamed from: o0Oo0o00.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncSettingsViewModel$finalizeHuaweiAuthorization$2", m80623f = "CloudSyncSettingsViewModel.kt", m80624l = {90}, m80625m = "invokeSuspend")
public final class C28193OoooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super CloudAuthResult>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f99902OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99903OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C28194OoooOOO f99904OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f99905OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28193OoooOO0(String str, String str2, C28194OoooOOO c28194OoooOOO, Continuation<? super C28193OoooOO0> continuation) {
        super(2, continuation);
        this.f99902OooOo = str;
        this.f99905OooOoO0 = str2;
        this.f99904OooOoO = c28194OoooOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28193OoooOO0(this.f99902OooOo, this.f99905OooOoO0, this.f99904OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super CloudAuthResult> continuation) {
        return ((C28193OoooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99903OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        CloudAuthRequest cloudAuthRequest = new CloudAuthRequest(new CloudAuthCredentials.Huawei(this.f99902OooOo, this.f99905OooOoO0));
        EnumC27285OooO enumC27285OooO = EnumC27285OooO.f95075OooOo;
        this.f99903OooOo0o = 1;
        Object objOooO0o0 = C28194OoooOOO.OooO0o0(this.f99904OooOoO, enumC27285OooO, cloudAuthRequest, this);
        return objOooO0o0 == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o0;
    }
}
