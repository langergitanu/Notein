package o0OOo0o;

import com.orion.notein.domain.models.NoteinFirebaseUser;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0o.o00ooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.VipFeatureUseCase", m80623f = "VipFeatureUseCase.kt", m80624l = {139}, m80625m = "whetherToAllowTheFeatureSyncByGoogleBilling")
public final class C27595o00ooOoo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public NoteinFirebaseUser f96905OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27597o00ooo00 f96906OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f96907OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f96908OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27597o00ooo00 f96909OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f96910OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27595o00ooOoo(C27597o00ooo00 c27597o00ooo00, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f96909OooOoOO = c27597o00ooo00;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f96907OooOoO = obj;
        this.f96910OooOoo0 |= Integer.MIN_VALUE;
        return C27597o00ooo00.OooO00o(this.f96909OooOoOO, 0, null, this);
    }
}
