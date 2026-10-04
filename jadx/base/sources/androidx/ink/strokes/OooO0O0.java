package androidx.ink.strokes;

import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import o0o00o.C29924OooO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f65464OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f65465OooOo0o;

    public /* synthetic */ OooO0O0(Object obj, int i) {
        this.f65465OooOo0o = i;
        this.f65464OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f65464OooOo;
        switch (this.f65465OooOo0o) {
            case 0:
                return Long.valueOf(InProgressStrokeNative.f65457OooO00o.newStrokeFromCopy(((C21967OooO0Oo) obj).OooO0o0()));
            default:
                int i = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = (PenBoxChildFragment) obj;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                InterfaceC21987OooOoo interfaceC21987OooOoo = penBoxChildFragment.f75364Oooo000;
                if (interfaceC21987OooOoo != null) {
                    return new C29924OooO0Oo(oooO0O0Oooo0o, interfaceC21987OooOoo, new PenBoxChildFragment.OooO0o(2, penBoxChildFragment, PenBoxChildFragment.class, "showNonVipFeatureLimitedDialog", "showNonVipFeatureLimitedDialog(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
        }
    }
}
