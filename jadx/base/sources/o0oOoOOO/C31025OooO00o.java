package o0oOoOOO;

import OooO0Oo.AbstractC20413OooOo0O;
import OooO0Oo.OooOo00;
import o0Oo0o0o.C28249OooOoo0;

/* JADX INFO: renamed from: o0oOoOOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31025OooO00o extends AbstractC20413OooOo0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C28249OooOoo0 f110761OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f110762OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31025OooO00o(C28249OooOoo0 c28249OooOoo0, OooOo00 oooOo00) {
        super(true);
        this.f110761OooO00o = c28249OooOoo0;
        this.f110762OooO0O0 = oooOo00;
    }

    @Override // OooO0Oo.AbstractC20413OooOo0O
    public final void handleOnBackPressed() {
        if (((Boolean) this.f110761OooO00o.invoke()).booleanValue()) {
            return;
        }
        setEnabled(false);
        this.f110762OooO0O0.getOnBackPressedDispatcher().OooO0OO();
        setEnabled(true);
    }
}
