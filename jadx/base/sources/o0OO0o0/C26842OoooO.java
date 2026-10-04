package o0OO0o0;

import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0o0.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveDriveSessionManager", m80623f = "OneDriveDriveSessionManager.kt", m80624l = {164}, m80625m = "persistAuthority-gIAlu-s")
public final class C26842OoooO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26837Oooo0OO f92927OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f92928OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f92929OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26842OoooO(C26837Oooo0OO c26837Oooo0OO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f92927OooOo = c26837Oooo0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f92928OooOo0o = obj;
        this.f92929OooOoO0 |= Integer.MIN_VALUE;
        AbstractC24338OooO0o0.OooO00o<String> oooO00o = C26837Oooo0OO.f92904OooO0o;
        Object objOooO0oo = this.f92927OooOo.OooO0oo(null, this);
        return objOooO0oo == EnumC32485OooO00o.f116726OooOo0o ? objOooO0oo : new C32445OooOOOO(objOooO0oo);
    }
}
