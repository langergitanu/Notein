package o0OO0o00;

import com.aspose.words.StyleIdentifier;
import com.huawei.cloud.services.drive.Drive;
import com.huawei.cloud.services.drive.model.HistoryVersion;
import com.huawei.hms.network.embedded.C18358t1;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiCloudService$fetchFileHistoryVersions$2", m80623f = "HuaweiCloudService.kt", m80624l = {StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_5}, m80625m = "invokeSuspend")
public final class OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<HistoryVersion>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f93208OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f93209OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f93210OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(String str, Continuation continuation, OooO00o oooO00o) {
        super(2, continuation);
        this.f93208OooOo = oooO00o;
        this.f93210OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOOO(this.f93210OooOoO0, continuation, this.f93208OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<HistoryVersion>> continuation) {
        return ((OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93209OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f93209OooOo0o = 1;
            obj = OooO00o.OooO00o(this.f93208OooOo, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return ((Drive) obj).historyVersions().list(this.f93210OooOoO0).setPageSize(new Integer(30)).setFields2(C18358t1.g.f56183c).execute().historyVersions;
    }
}
