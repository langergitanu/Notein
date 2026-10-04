package o0OO0Ooo;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0Ooo.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.google.GoogleDriveSyncBackend", m80623f = "GoogleDriveSyncBackend.kt", m80624l = {201, 205, 206}, m80625m = "fetchAllExistedFileIds-IoAF18A")
public final class C26787OoooOO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f92631OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26791OoooOoO f92632OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f92633OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C26791OoooOoO f92634OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26787OoooOO0(C26791OoooOoO c26791OoooOoO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f92634OooOoO0 = c26791OoooOoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f92631OooOo = obj;
        this.f92633OooOoO |= Integer.MIN_VALUE;
        Object objOooOO0O = this.f92634OooOoO0.OooOO0O(this);
        return objOooOO0O == EnumC32485OooO00o.f116726OooOo0o ? objOooOO0O : new C32445OooOOOO(objOooOO0O);
    }
}
