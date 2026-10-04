package o0OO0o00;

import androidx.appcompat.widget.C21532OooOOo;
import com.huawei.cloud.base.http.HttpResponseException;
import com.huawei.cloud.services.drive.Drive;
import com.huawei.cloud.services.drive.model.About;
import com.huawei.hms.network.embedded.C18358t1;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiCloudService$checkServiceAvailable$2", m80623f = "HuaweiCloudService.kt", m80624l = {376}, m80625m = "invokeSuspend")
public final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f93166OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f93167OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(OooO00o oooO00o, Continuation<? super OooO0OO> continuation) {
        super(2, continuation);
        this.f93166OooOo = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0OO(this.f93166OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93167OooOo0o;
        boolean z = true;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooO00o oooO00o = this.f93166OooOo;
                this.f93167OooOo0o = 1;
                obj = OooO00o.OooO00o(oooO00o, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            About aboutExecute = ((Drive) obj).about().get().setFields2(C18358t1.g.f56183c).execute();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("HuaweiCloudSyncDS");
            c20358OooO00o.OooO00o("checkServiceAvailable: response=" + aboutExecute, new Object[0]);
        } catch (HttpResponseException e) {
            if (e.getStatusCode() != 401) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("HuaweiCloudSyncDS");
                c20358OooO00o2.OooO0Oo(e, C21532OooOOo.OooO0OO(e.getStatusCode(), "checkServiceAvailable: failed, statusCode="), new Object[0]);
                throw e;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("HuaweiCloudSyncDS");
            c20358OooO00o3.OooOO0o(e, "checkServiceAvailable: 401 Unauthorized", new Object[0]);
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
