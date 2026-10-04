package o0OO0o00;

import com.aspose.words.StyleIdentifier;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0o00.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiDriveSyncBackend", m80623f = "HuaweiDriveSyncBackend.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5}, m80625m = "deleteFile-gIAlu-s")
public final class C26906OoooOoO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f93336OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f93337OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f93338OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C26913Oooooo f93339OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26906OoooOoO(C26913Oooooo c26913Oooooo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93339OooOoO0 = c26913Oooooo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93336OooOo = obj;
        this.f93338OooOoO |= Integer.MIN_VALUE;
        Object objOooOOOo = this.f93339OooOoO0.OooOOOo(null, this);
        return objOooOOOo == EnumC32485OooO00o.f116726OooOo0o ? objOooOOOo : new C32445OooOOOO(objOooOOOo);
    }
}
