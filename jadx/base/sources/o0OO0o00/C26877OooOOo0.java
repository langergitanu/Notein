package o0OO0o00;

import com.aspose.words.StyleIdentifier;
import com.huawei.cloud.services.drive.Drive;
import com.huawei.cloud.services.drive.model.File;
import com.huawei.hms.network.embedded.C18358t1;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OO0o00.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiCloudService$getFile$2", m80623f = "HuaweiCloudService.kt", m80624l = {StyleIdentifier.LIST_TABLE_3_ACCENT_1}, m80625m = "invokeSuspend")
public final class C26877OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f93221OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f93222OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f93223OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26877OooOOo0(String str, Continuation continuation, OooO00o oooO00o) {
        super(2, continuation);
        this.f93221OooOo = oooO00o;
        this.f93223OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26877OooOOo0(this.f93223OooOoO0, continuation, this.f93221OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super File> continuation) {
        return ((C26877OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93222OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f93222OooOo0o = 1;
            obj = OooO00o.OooO00o(this.f93221OooOo, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        Drive.Files.Get get = ((Drive) obj).files().get(this.f93223OooOoO0);
        get.setFields2(C18358t1.g.f56183c);
        return get.execute();
    }
}
