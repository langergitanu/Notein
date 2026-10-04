package o0OOooO0;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED}, m80625m = "reconcileContent-yxL6bBk")
public final class o00Ooo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f99025OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f99026OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f99027OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f99025OooOo = abstractC27907OooOo0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f99026OooOo0o = obj;
        this.f99027OooOoO0 |= Integer.MIN_VALUE;
        Object objO0OOO0o = this.f99025OooOo.o0OOO0o(null, null, null, 0, this);
        return objO0OOO0o == EnumC32485OooO00o.f116726OooOo0o ? objO0OOO0o : new C32445OooOOOO(objO0OOO0o);
    }
}
