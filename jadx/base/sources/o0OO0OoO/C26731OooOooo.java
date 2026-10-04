package o0OO0OoO;

import com.huawei.cloud.base.http.HttpResponseException;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OO0OoO.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.CloudSyncRepoImpl", m80623f = "CloudSyncRepoImpl.kt", m80624l = {656}, m80625m = "parseHuaweiHttpError")
public final class C26731OooOooo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f92443OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public HttpResponseException f92444OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f92445OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C26740Oooo0oo f92446OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26731OooOooo(C26740Oooo0oo c26740Oooo0oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f92446OooOoO0 = c26740Oooo0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f92443OooOo = obj;
        this.f92445OooOoO |= Integer.MIN_VALUE;
        return this.f92446OooOoO0.Oooo0oO(null, this);
    }
}
