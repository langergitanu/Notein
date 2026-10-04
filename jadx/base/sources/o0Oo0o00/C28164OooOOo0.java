package o0Oo0o00;

import com.orion.notein.p607ui.datasync.CloudSyncDetailsFragment;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Oo0o00.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncDetailsFragment", m80623f = "CloudSyncDetailsFragment.kt", m80624l = {486}, m80625m = "handleStorageFull")
public final class C28164OooOOo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public oO0O000o.OooO00o f99803OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public CloudSyncDetailsFragment f99804OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ CloudSyncDetailsFragment f99805OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f99806OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f99807OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28164OooOOo0(CloudSyncDetailsFragment cloudSyncDetailsFragment, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f99805OooOoO = cloudSyncDetailsFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f99806OooOoO0 = obj;
        this.f99807OooOoOO |= Integer.MIN_VALUE;
        return CloudSyncDetailsFragment.OooOoo(this.f99805OooOoO, null, null, this);
    }
}
