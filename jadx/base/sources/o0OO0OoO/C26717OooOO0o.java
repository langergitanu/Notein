package o0OO0OoO;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0OO0OoO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.CloudSyncRepoImpl", m80623f = "CloudSyncRepoImpl.kt", m80624l = {435, 439, 441}, m80625m = "fetchRemoteBundleWithProgress-hUnOzRk")
public final class C26717OooOO0o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f92349OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26740Oooo0oo f92350OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f92351OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f92352OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public InterfaceC32507OooOO0o f92353OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ Object f92354OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f92355OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ C26740Oooo0oo f92356OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f92357OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26717OooOO0o(C26740Oooo0oo c26740Oooo0oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f92356OooOooO = c26740Oooo0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f92354OooOoo = obj;
        this.f92357OooOooo |= Integer.MIN_VALUE;
        Object objOooOoo0 = this.f92356OooOooO.OooOoo0(null, null, null, 0L, null, this);
        return objOooOoo0 == EnumC32485OooO00o.f116726OooOo0o ? objOooOoo0 : new C32445OooOOOO(objOooOoo0);
    }
}
