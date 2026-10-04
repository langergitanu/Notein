package o0OO0Ooo;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0Ooo.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.google.GoogleDriveSyncBackend", m80623f = "GoogleDriveSyncBackend.kt", m80624l = {89, 90}, m80625m = "ensureInitialized-IoAF18A")
public final class C26786OoooO0O extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f92627OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26791OoooOoO f92628OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f92629OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C26791OoooOoO f92630OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26786OoooO0O(C26791OoooOoO c26791OoooOoO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f92630OooOoO0 = c26791OoooOoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f92627OooOo = obj;
        this.f92629OooOoO |= Integer.MIN_VALUE;
        Object objOooOo0 = this.f92630OooOoO0.OooOo0(this);
        return objOooOo0 == EnumC32485OooO00o.f116726OooOo0o ? objOooOo0 : new C32445OooOOOO(objOooOo0);
    }
}
