package o0o0OoOo;

import android.net.Uri;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0o0OoOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.viewmodel.DebugViewModel", m80623f = "DebugViewModel.kt", m80624l = {708}, m80625m = "exportStorageReport")
public final class C30724OooO0OO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f109891OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Uri f109892OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f109893OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30722OooO00o f109894OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30724OooO0OO(C30722OooO00o c30722OooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f109894OooOoO0 = c30722OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f109891OooOo = obj;
        this.f109893OooOoO |= Integer.MIN_VALUE;
        return this.f109894OooOoO0.OooO0o(null, this);
    }
}
