package androidx.lifecycle;

import oO0o0OO.AbstractC33630OooOooO;
import oO0o0OO.C33649OoooOOo;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: androidx.lifecycle.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21999Oooo0oO extends AbstractC33630OooOooO {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO f65597OooOoO0 = new OooO();

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final boolean o000OOO(InterfaceC34415OooO0oo context) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        if (C33833OooOOOO.f121946OooO00o.o000OOoO().o000OOO(context)) {
            return true;
        }
        OooO oooO = this.f65597OooOoO0;
        return !(oooO.f65501OooO0O0 || !oooO.f65500OooO00o);
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final void o0OoO0o(InterfaceC34415OooO0oo context, final Runnable block) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        kotlin.jvm.internal.OooOOO0.OooO0oO(block, "block");
        final OooO oooO = this.f65597OooOoO0;
        oooO.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        AbstractC33687OooO0oO abstractC33687OooO0oOO000OOoO = C33833OooOOOO.f121946OooO00o.o000OOoO();
        if (!abstractC33687OooO0oOO000OOoO.o000OOO(context)) {
            if (!(oooO.f65501OooO0O0 || !oooO.f65500OooO00o)) {
                if (!oooO.f65503OooO0Oo.offer(block)) {
                    throw new IllegalStateException("cannot enqueue any more runnables");
                }
                oooO.OooO00o();
                return;
            }
        }
        abstractC33687OooO0oOO000OOoO.o0OoO0o(context, new Runnable() { // from class: androidx.lifecycle.OooO0oo
            @Override // java.lang.Runnable
            public final void run() {
                OooO this$0 = oooO;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                Runnable runnable = block;
                kotlin.jvm.internal.OooOOO0.OooO0oO(runnable, "$runnable");
                if (!this$0.f65503OooO0Oo.offer(runnable)) {
                    throw new IllegalStateException("cannot enqueue any more runnables");
                }
                this$0.OooO00o();
            }
        });
    }
}
