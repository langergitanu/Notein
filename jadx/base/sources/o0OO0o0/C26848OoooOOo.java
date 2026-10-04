package o0OO0o0;

import com.aspose.words.StyleIdentifier;
import com.microsoft.identity.client.ISingleAccountPublicClientApplication;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OO0o0.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveDriveSessionManager", m80623f = "OneDriveDriveSessionManager.kt", m80624l = {StyleIdentifier.MEDIUM_GRID_1_ACCENT_6}, m80625m = "signOutIfNeeded")
public final class C26848OoooOOo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f92943OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ISingleAccountPublicClientApplication f92944OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f92945OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C26837Oooo0OO f92946OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26848OoooOOo(C26837Oooo0OO c26837Oooo0OO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f92946OooOoO0 = c26837Oooo0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f92943OooOo = obj;
        this.f92945OooOoO |= Integer.MIN_VALUE;
        AbstractC24338OooO0o0.OooO00o<String> oooO00o = C26837Oooo0OO.f92904OooO0o;
        return this.f92946OooOoO0.OooOO0(this);
    }
}
