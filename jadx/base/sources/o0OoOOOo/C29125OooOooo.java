package o0OoOOOo;

import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import o0OoOOO0.C29051OooOO0o;

/* JADX INFO: renamed from: o0OoOOOo.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29125OooOooo implements PenBox.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TextStyleBox f103242OooO00o;

    public C29125OooOooo(TextStyleBox textStyleBox) {
        this.f103242OooO00o = textStyleBox;
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.PenBox.OooO0o
    public final void OooO00o(int i, int i2, int i3) {
        C29051OooOO0o c29051OooOO0o = this.f103242OooO00o.f74153OoooO;
        if (c29051OooOO0o != null) {
            c29051OooOO0o.OooO(i3);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
            throw null;
        }
    }
}
