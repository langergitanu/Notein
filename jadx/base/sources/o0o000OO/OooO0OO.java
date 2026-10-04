package o0o000OO;

import android.view.View;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.noteeditor.textannoeditor.TextAnnoTextEditor;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.settings.appearance.AppearanceSettingsFragment;
import com.orion.penkit.tools.DrawToolFactory;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C29993OooOOOo;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f105512OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f105513OooOo0o;

    public /* synthetic */ OooO0OO(Object obj, int i) {
        this.f105513OooOo0o = i;
        this.f105512OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PenBox.OooO00o oooO00o;
        Object obj = this.f105512OooOo;
        switch (this.f105513OooOo0o) {
            case 0:
                int i = TextAnnoTextEditor.f76394OoooO0O;
                OooOO0O oooOO0O = (OooOO0O) obj;
                C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooOO0O), null, null, new C29771Oooo00o(oooOO0O, true, null), 3);
                break;
            case 1:
                C29993OooOOOo c29993OooOOOo = (C29993OooOOOo) obj;
                c29993OooOOOo.OooO0OO(DrawToolFactory.ERASER_TYPE_LASSO);
                C29936OooO0oO c29936OooO0oO = c29993OooOOOo.f106559Oooo0;
                if (c29936OooO0oO != null && (oooO00o = c29936OooO0oO.f106287OooO0o0) != null) {
                    oooO00o.OooO0O0(DrawToolFactory.ERASER_TYPE_LASSO);
                    break;
                }
                break;
            default:
                ((AppearanceSettingsFragment) obj).OooOoO().OooO0o0(2);
                break;
        }
    }
}
