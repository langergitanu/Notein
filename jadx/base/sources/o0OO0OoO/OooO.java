package o0OO0OoO;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.CloudSyncRepoImpl", m80623f = "CloudSyncRepoImpl.kt", m80624l = {474, 478, 479}, m80625m = "fetchDriveSnapshot-gIAlu-s")
public final class OooO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f92303OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26740Oooo0oo f92304OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26740Oooo0oo f92305OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f92306OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f92307OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(C26740Oooo0oo c26740Oooo0oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f92305OooOoO = c26740Oooo0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f92306OooOoO0 = obj;
        this.f92307OooOoOO |= Integer.MIN_VALUE;
        Object objOooOo0O = this.f92305OooOoO.OooOo0O(null, this);
        return objOooOo0O == EnumC32485OooO00o.f116726OooOo0o ? objOooOo0O : new C32445OooOOOO(objOooOo0O);
    }
}
