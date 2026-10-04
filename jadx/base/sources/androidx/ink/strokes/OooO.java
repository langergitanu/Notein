package androidx.ink.strokes;

import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.p607ui.p609vo.ThemeVO;
import com.orion.notein.p607ui.paperconfig.MyTemplateFragment;
import com.orion.notein.ui.paperconfig.MyTemplateFragment.OooO0OO;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f65460OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f65461OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f65462OooOoO0;

    public /* synthetic */ OooO(int i, Object obj, Object obj2) {
        this.f65461OooOo0o = i;
        this.f65460OooOo = obj;
        this.f65462OooOoO0 = obj2;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f65461OooOo0o) {
            case 0:
                return Long.valueOf(StrokeNative.f65499OooO00o.createWithBrushAndInputs(((o000OO00.OooO0O0) this.f65460OooOo).OooO0o0(), ((OooOOO) this.f65462OooOoO0).OooO0O0()));
            default:
                PaperTheme paperTheme = ((ThemeVO) this.f65460OooOo).getPaperTheme();
                if (paperTheme != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("MyTemplateFragment");
                    c20358OooO00o.OooO00o("handleStarClick: saving theme=" + paperTheme, new Object[0]);
                    MyTemplateFragment myTemplateFragment = (MyTemplateFragment) this.f65462OooOoO0;
                    InterfaceC21987OooOoo viewLifecycleOwner = myTemplateFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, myTemplateFragment.new OooO0OO(paperTheme, null), 3);
                }
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
