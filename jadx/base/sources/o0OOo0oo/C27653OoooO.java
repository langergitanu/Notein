package o0OOo0oo;

import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0oo.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.FolderDirtyDetector", m80623f = "LocalDirtyDetector.kt", m80624l = {112}, m80625m = "isLocalModified")
public final class C27653OoooO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f97258OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public CloudMetaLocal f97259OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f97260OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27657OoooOO0 f97261OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27653OoooO(C27657OoooOO0 c27657OoooOO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97261OooOoO0 = c27657OoooOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97258OooOo = obj;
        this.f97260OooOoO |= Integer.MIN_VALUE;
        return this.f97261OooOoO0.OooO00o(null, this);
    }
}
