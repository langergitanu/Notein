package androidx.lifecycle;

import androidx.lifecycle.AbstractC21979OooOOo0;
import java.util.concurrent.CancellationException;
import oO0o0OO.InterfaceC33672o00ooo;

/* JADX INFO: renamed from: androidx.lifecycle.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21980OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC21979OooOOo0 f65543OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractC21979OooOOo0.OooO0O0 f65544OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO f65545OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C21978OooOOo f65546OooO0Oo;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.OooOOo, androidx.lifecycle.OooOoo0] */
    public C21980OooOOoo(AbstractC21979OooOOo0 lifecycle, AbstractC21979OooOOo0.OooO0O0 oooO0O0, OooO dispatchQueue, final InterfaceC33672o00ooo interfaceC33672o00ooo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(lifecycle, "lifecycle");
        kotlin.jvm.internal.OooOOO0.OooO0oO(dispatchQueue, "dispatchQueue");
        this.f65543OooO00o = lifecycle;
        this.f65544OooO0O0 = oooO0O0;
        this.f65545OooO0OO = dispatchQueue;
        ?? r3 = new InterfaceC21986OooOoOO() { // from class: androidx.lifecycle.OooOOo
            @Override // androidx.lifecycle.InterfaceC21986OooOoOO
            public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
                C21980OooOOoo this$0 = this.f65534OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                InterfaceC33672o00ooo interfaceC33672o00ooo2 = interfaceC33672o00ooo;
                if (interfaceC21987OooOoo.getLifecycle().OooO0O0() == AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o) {
                    interfaceC33672o00ooo2.cancel((CancellationException) null);
                    this$0.OooO00o();
                    return;
                }
                int iCompareTo = interfaceC21987OooOoo.getLifecycle().OooO0O0().compareTo(this$0.f65544OooO0O0);
                OooO oooO = this$0.f65545OooO0OO;
                if (iCompareTo < 0) {
                    oooO.f65500OooO00o = true;
                } else if (oooO.f65500OooO00o) {
                    if (oooO.f65501OooO0O0) {
                        throw new IllegalStateException("Cannot resume a finished dispatcher");
                    }
                    oooO.f65500OooO00o = false;
                    oooO.OooO00o();
                }
            }
        };
        this.f65546OooO0Oo = r3;
        if (lifecycle.OooO0O0() != AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o) {
            lifecycle.OooO00o(r3);
        } else {
            interfaceC33672o00ooo.cancel((CancellationException) null);
            OooO00o();
        }
    }

    public final void OooO00o() {
        this.f65543OooO00o.OooO0OO(this.f65546OooO0Oo);
        OooO oooO = this.f65545OooO0OO;
        oooO.f65501OooO0O0 = true;
        oooO.OooO00o();
    }
}
