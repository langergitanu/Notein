package o0OO0o00;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.cloud.services.drive.Drive;
import java.io.FileOutputStream;
import kotlin.coroutines.Continuation;
import o0OO0o00.OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiCloudService$downloadFile$2", m80623f = "HuaweiCloudService.kt", m80624l = {162, 163}, m80625m = "invokeSuspend")
public final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f93143OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Drive f93144OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f93145OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO00o f93146OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f93147OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ FileOutputStream f93148OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(OooO00o oooO00o, String str, String str2, FileOutputStream fileOutputStream, Continuation continuation) {
        super(2, continuation);
        this.f93146OooOoO0 = oooO00o;
        this.f93145OooOoO = str;
        this.f93147OooOoOO = str2;
        this.f93148OooOoo0 = fileOutputStream;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO(this.f93146OooOoO0, this.f93145OooOoO, this.f93147OooOoOO, this.f93148OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Drive drive;
        FileOutputStream fileOutputStream;
        String str;
        String str2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93143OooOo;
        OooO00o oooO00o = this.f93146OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f93143OooOo = 1;
            obj = OooO00o.OooO00o(oooO00o, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            drive = this.f93144OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            fileOutputStream = this.f93148OooOoo0;
            str = this.f93147OooOoOO;
            str2 = this.f93145OooOoO;
            if (str2 != null || str2.length() == 0) {
                Drive.Files.Get get = drive.files().get(str);
                get.setForm2(FirebaseAnalytics.Param.CONTENT);
                get.executeContentAndDownloadTo(fileOutputStream);
                return C32460OooOooO.f116667OooO00o;
            }
            Drive.HistoryVersions.Get get2 = drive.historyVersions().get(str, str2);
            get2.setForm2(FirebaseAnalytics.Param.CONTENT);
            get2.executeContentAndDownloadTo(fileOutputStream);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        Drive drive2 = (Drive) obj;
        OooO00o.OooO0O0 oooO0O0 = oooO00o.f93153OooO0o0;
        this.f93144OooOo0o = drive2;
        this.f93143OooOo = 2;
        if (oooO0O0.OooO00o(this) != enumC32485OooO00o) {
            drive = drive2;
            fileOutputStream = this.f93148OooOoo0;
            str = this.f93147OooOoOO;
            str2 = this.f93145OooOoO;
            if (str2 != null) {
            }
            Drive.Files.Get get3 = drive.files().get(str);
            get3.setForm2(FirebaseAnalytics.Param.CONTENT);
            get3.executeContentAndDownloadTo(fileOutputStream);
            return C32460OooOooO.f116667OooO00o;
        }
        return enumC32485OooO00o;
    }
}
