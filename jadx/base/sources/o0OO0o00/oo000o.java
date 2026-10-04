package o0OO0o00;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiDriveSyncBackend", m80623f = "HuaweiDriveSyncBackend.kt", m80624l = {223, 230, 245, 255, StyleIdentifier.PLAIN_TABLE_1}, m80625m = "uploadContent-gIAlu-s")
public final class oo000o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f93442OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f93443OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f93444OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public CloudMetaRemoteEntity f93445OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public String f93446OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public String f93447OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public String f93448OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public String f93449OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public /* synthetic */ Object f93450OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ C26913Oooooo f93451Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f93452Oooo00O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(C26913Oooooo c26913Oooooo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93451Oooo000 = c26913Oooooo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93450OooOooo = obj;
        this.f93452Oooo00O |= Integer.MIN_VALUE;
        Object objOooOOO0 = this.f93451Oooo000.OooOOO0(null, this);
        return objOooOOO0 == EnumC32485OooO00o.f116726OooOo0o ? objOooOOO0 : new C32445OooOOOO(objOooOOO0);
    }
}
