package o0OO0o00;

import com.aspose.words.StyleIdentifier;
import com.huawei.cloud.services.drive.model.File;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiDriveSyncBackend", m80623f = "HuaweiDriveSyncBackend.kt", m80624l = {StyleIdentifier.GRID_TABLE_4_ACCENT_2, StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_2, StyleIdentifier.GRID_TABLE_2_ACCENT_3, StyleIdentifier.GRID_TABLE_4_ACCENT_3}, m80625m = "uploadMeta-0E7RQCE")
public final class o00oO0o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f93427OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f93428OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public File f93429OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C26913Oooooo f93430OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public String f93431OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C26913Oooooo f93432OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f93433OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f93434OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(C26913Oooooo c26913Oooooo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93432OooOoo = c26913Oooooo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93433OooOoo0 = obj;
        this.f93434OooOooO |= Integer.MIN_VALUE;
        Object objOooO0oO = this.f93432OooOoo.OooO0oO(null, null, this);
        return objOooO0oO == EnumC32485OooO00o.f116726OooOo0o ? objOooO0oO : new C32445OooOOOO(objOooO0oO);
    }
}
