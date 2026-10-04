package o0OOo0oo;

import com.orion.notein.domain.models.cloudsync.CloudMetaRemote;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.Oooo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.FetchCloudBundleUseCase", m80623f = "FetchCloudBundleUseCase.kt", m80624l = {129}, m80625m = "ensureRemoteBundle-0E7RQCE")
public final class C27644Oooo000 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f97218OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public CloudMetaRemote f97219OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27643Oooo0 f97220OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f97221OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f97222OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27644Oooo000(C27643Oooo0 c27643Oooo0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97220OooOoO = c27643Oooo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97221OooOoO0 = obj;
        this.f97222OooOoOO |= Integer.MIN_VALUE;
        Object objOooO00o = C27643Oooo0.OooO00o(this.f97220OooOoO, null, null, this);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : new C32445OooOOOO(objOooO00o);
    }
}
