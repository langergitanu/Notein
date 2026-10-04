package o00oo0Oo;

import OooooO0.C21294OooOO0O;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.facebook.imagepipeline.producers.C22294OoooOOo;
import com.orion.niui.components.button.SelectableSymbolButtonView;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.widget.crop.ImageCropView;
import o00ooO.C25732OooO0O0;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0o00o.C29929OooOOOo;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o00oo0Oo.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C25707OooOoO0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f87754OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f87755OooOo0o;

    public /* synthetic */ C25707OooOoO0(Object obj, int i) {
        this.f87755OooOo0o = i;
        this.f87754OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f87754OooOo;
        switch (this.f87755OooOo0o) {
            case 0:
                C25722OoooO00 this$0 = (C25722OoooO00) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                C25732OooO0O0.OooO00o();
                return new C22294OoooOOo(this$0.OooO0O0());
            case 1:
                SelectableSymbolButtonView.OooO0oo((SelectableSymbolButtonView) obj);
                return C32460OooOooO.f116667OooO00o;
            case 2:
                return C21294OooOO0O.OooO0Oo((AbstractApplicationC26277OooOoOO) obj, "notein-toolbox-sp");
            case 3:
                int i = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = (PenBarChildFragment) obj;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                InterfaceC21987OooOoo interfaceC21987OooOoo = penBarChildFragment.f75247OooOooO;
                if (interfaceC21987OooOoo != null) {
                    return new C29929OooOOOo(oooO0O0Oooo0oO, interfaceC21987OooOoo);
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
