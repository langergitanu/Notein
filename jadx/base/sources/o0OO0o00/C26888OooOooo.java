package o0OO0o00;

import com.orion.notein.domain.models.cloudsync.CloudAuthCredentials;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OO0o00.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiDriveSessionManager", m80623f = "HuaweiDriveSessionManager.kt", m80624l = {90, 98, 113}, m80625m = "authorize")
public final class C26888OooOooo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public CloudAuthCredentials.Huawei f93259OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26889Oooo f93260OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26889Oooo f93261OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f93262OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f93263OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26888OooOooo(C26889Oooo c26889Oooo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93261OooOoO = c26889Oooo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93262OooOoO0 = obj;
        this.f93263OooOoOO |= Integer.MIN_VALUE;
        return this.f93261OooOoO.OooO00o(null, this);
    }
}
