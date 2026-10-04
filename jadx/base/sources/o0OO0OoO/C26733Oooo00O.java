package o0OO0OoO;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0OoO.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.CloudSyncRepoImpl", m80623f = "CloudSyncRepoImpl.kt", m80624l = {396, 400, 403}, m80625m = "requestDeleteFile-gIAlu-s")
public final class C26733Oooo00O extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f92458OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26740Oooo0oo f92459OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26740Oooo0oo f92460OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f92461OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f92462OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26733Oooo00O(C26740Oooo0oo c26740Oooo0oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f92460OooOoO = c26740Oooo0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f92461OooOoO0 = obj;
        this.f92462OooOoOO |= Integer.MIN_VALUE;
        Object objOooOO0 = this.f92460OooOoO.OooOO0(null, this);
        return objOooOO0 == EnumC32485OooO00o.f116726OooOo0o ? objOooOO0 : new C32445OooOOOO(objOooOO0);
    }
}
