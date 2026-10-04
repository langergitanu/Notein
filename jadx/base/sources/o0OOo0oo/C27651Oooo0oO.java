package o0OOo0oo;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.FolderBundleProcessor", m80623f = "CloudBundleProcessor.kt", m80624l = {382}, m80625m = "packMetaOnly-gIAlu-s")
public final class C27651Oooo0oO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f97250OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f97251OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f97252OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27647Oooo0O0 f97253OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27651Oooo0oO(C27647Oooo0O0 c27647Oooo0O0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97253OooOoO0 = c27647Oooo0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97250OooOo = obj;
        this.f97252OooOoO |= Integer.MIN_VALUE;
        Object objOooO00o = this.f97253OooOoO0.OooO00o(null, this);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : new C32445OooOOOO(objOooO00o);
    }
}
