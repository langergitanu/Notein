package o0OO0o00;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0o00.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiDriveSessionManager", m80623f = "HuaweiDriveSessionManager.kt", m80624l = {172, 176}, m80625m = "persistHuaweiCredentials-0E7RQCE")
public final class C26896Oooo0oO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f93302OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26889Oooo f93303OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f93304OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C26889Oooo f93305OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26896Oooo0oO(C26889Oooo c26889Oooo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93305OooOoO0 = c26889Oooo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93302OooOo = obj;
        this.f93304OooOoO |= Integer.MIN_VALUE;
        Object objOooO0o0 = this.f93305OooOoO0.OooO0o0(null, null, this);
        return objOooO0o0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o0 : new C32445OooOOOO(objOooO0o0);
    }
}
