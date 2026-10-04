package o0OOo0oo;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0oo.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.FolderBundleProcessor", m80623f = "CloudBundleProcessor.kt", m80624l = {437}, m80625m = "restoreContentUnsafe")
public final class C27642Oooo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27647Oooo0O0 f97212OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f97213OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f97214OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27642Oooo(C27647Oooo0O0 c27647Oooo0O0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97212OooOo = c27647Oooo0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97213OooOo0o = obj;
        this.f97214OooOoO0 |= Integer.MIN_VALUE;
        return this.f97212OooOo.OooO(null, null, this);
    }
}
