package o0OO0Ooo;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OO0Ooo.Oooo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.google.GoogleDriveSessionManager", m80623f = "GoogleDriveSessionManager.kt", m80624l = {52, 55, 57, 58}, m80625m = "migrateLegacyIfNeeded")
public final class C26774Oooo000 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f92587OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26773Oooo0 f92588OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f92589OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C26773Oooo0 f92590OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26774Oooo000(C26773Oooo0 c26773Oooo0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f92590OooOoO0 = c26773Oooo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f92587OooOo = obj;
        this.f92589OooOoO |= Integer.MIN_VALUE;
        return C26773Oooo0.OooO00o(this.f92590OooOoO0, this);
    }
}
