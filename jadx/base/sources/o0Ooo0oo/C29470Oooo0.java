package o0Ooo0oo;

import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.widget.crop.ImageCropView;
import o0o00o.C29924OooO0Oo;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0Ooo0oo.Oooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29470Oooo0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f104548OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104549OooOo0o;

    public /* synthetic */ C29470Oooo0(Object obj, int i) {
        this.f104549OooOo0o = i;
        this.f104548OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f104548OooOo;
        switch (this.f104549OooOo0o) {
            case 0:
                int i = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = (PenBarChildFragment) obj;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                InterfaceC21987OooOoo interfaceC21987OooOoo = penBarChildFragment.f75247OooOooO;
                if (interfaceC21987OooOoo != null) {
                    return new C29924OooO0Oo(oooO0O0Oooo0oO, interfaceC21987OooOoo, new PenBarChildFragment.C23475OooO0oo(2, penBarChildFragment, PenBarChildFragment.class, "showNonVipFeatureLimitedDialog", "showNonVipFeatureLimitedDialog(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
            default:
                int i2 = ImageCropView.f80139OooooO0;
                ImageCropView imageCropView = (ImageCropView) obj;
                imageCropView.OooO0o0();
                imageCropView.invalidate();
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
