package o0OOo0oo;

import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0oo.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.FolderBundleProcessor", m80623f = "CloudBundleProcessor.kt", m80624l = {444, 460}, m80625m = "restoreMetaUnsafe")
public final class C27654OoooO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f97262OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27647Oooo0O0 f97263OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f97264OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public CloudMetaExtra f97265OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27647Oooo0O0 f97266OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f97267OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27654OoooO0(C27647Oooo0O0 c27647Oooo0O0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97266OooOoOO = c27647Oooo0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97264OooOoO = obj;
        this.f97267OooOoo0 |= Integer.MIN_VALUE;
        return this.f97266OooOoOO.OooOO0(null, null, this);
    }
}
