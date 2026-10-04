package o0OOo0oo;

import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0oo.o0000oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.ResolveRemoteNotFoundUseCase", m80623f = "ResolveRemoteNotFoundUseCase.kt", m80624l = {181}, m80625m = "isLocalContentPresent")
public final class C27687o0000oO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f97541OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public CloudMetaLocal f97542OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f97543OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o0000 f97544OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27687o0000oO(o0000 o0000Var, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97544OooOoO0 = o0000Var;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97541OooOo = obj;
        this.f97543OooOoO |= Integer.MIN_VALUE;
        return this.f97544OooOoO0.OooO0OO(null, this);
    }
}
