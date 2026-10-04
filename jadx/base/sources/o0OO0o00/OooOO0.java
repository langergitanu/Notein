package o0OO0o00;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.cloud.services.drive.Drive;
import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.coroutines.Continuation;
import o0OO0o00.OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiCloudService$downloadFileWithProgress$2", m80623f = "HuaweiCloudService.kt", m80624l = {184, 185}, m80625m = "invokeSuspend")
public final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f93189OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Drive f93190OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ long f93191OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO00o f93192OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ FileOutputStream f93193OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f93194OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o<Integer, C32460OooOooO> f93195OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f93196OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(OooO00o oooO00o, long j, FileOutputStream fileOutputStream, InterfaceC32507OooOO0o interfaceC32507OooOO0o, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f93192OooOoO0 = oooO00o;
        this.f93191OooOoO = j;
        this.f93193OooOoOO = fileOutputStream;
        this.f93195OooOoo0 = interfaceC32507OooOO0o;
        this.f93194OooOoo = str;
        this.f93196OooOooO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOO0(this.f93192OooOoO0, this.f93191OooOoO, this.f93193OooOoOO, this.f93195OooOoo0, this.f93194OooOoo, this.f93196OooOooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Drive drive;
        long j;
        OutputStream c19821OooO00o;
        String str;
        String str2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93189OooOo;
        OooO00o oooO00o = this.f93192OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f93189OooOo = 1;
            obj = OooO00o.OooO00o(oooO00o, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            drive = this.f93190OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            j = this.f93191OooOoO;
            FileOutputStream fileOutputStream = this.f93193OooOoOO;
            c19821OooO00o = fileOutputStream;
            if (j > 0) {
                c19821OooO00o = new OooO00o.C19821OooO00o(fileOutputStream, j, this.f93195OooOoo0);
            }
            str = this.f93196OooOooO;
            str2 = this.f93194OooOoo;
            if (str2 != null || str2.length() == 0) {
                Drive.Files.Get get = drive.files().get(str);
                get.setForm2(FirebaseAnalytics.Param.CONTENT);
                get.executeContentAndDownloadTo(c19821OooO00o);
                return C32460OooOooO.f116667OooO00o;
            }
            Drive.HistoryVersions.Get get2 = drive.historyVersions().get(str, str2);
            get2.setForm2(FirebaseAnalytics.Param.CONTENT);
            get2.executeContentAndDownloadTo(c19821OooO00o);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        Drive drive2 = (Drive) obj;
        OooO00o.OooO0O0 oooO0O0 = oooO00o.f93153OooO0o0;
        this.f93190OooOo0o = drive2;
        this.f93189OooOo = 2;
        if (oooO0O0.OooO00o(this) != enumC32485OooO00o) {
            drive = drive2;
            j = this.f93191OooOoO;
            FileOutputStream fileOutputStream2 = this.f93193OooOoOO;
            c19821OooO00o = fileOutputStream2;
            if (j > 0) {
            }
            str = this.f93196OooOooO;
            str2 = this.f93194OooOoo;
            if (str2 != null) {
            }
            Drive.Files.Get get3 = drive.files().get(str);
            get3.setForm2(FirebaseAnalytics.Param.CONTENT);
            get3.executeContentAndDownloadTo(c19821OooO00o);
            return C32460OooOooO.f116667OooO00o;
        }
        return enumC32485OooO00o;
    }
}
