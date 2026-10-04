package o0o000OO;

import android.content.Intent;
import android.view.View;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.backup.BackupFragment;
import com.orion.notein.p607ui.noteeditor.textannoeditor.TextAnnoTextEditor;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.settings.appearance.AppearanceSettingsFragment;
import com.orion.penkit.tools.DrawToolFactory;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C29993OooOOOo;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0o000OO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29750OooO0O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f105510OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f105511OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29750OooO0O0(Object obj, int i) {
        this.f105511OooOo0o = i;
        this.f105510OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PenBox.OooO00o oooO00o;
        Object obj = this.f105510OooOo;
        switch (this.f105511OooOo0o) {
            case 0:
                int i = TextAnnoTextEditor.f76394OoooO0O;
                OooOO0O oooOO0O = (OooOO0O) obj;
                C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooOO0O), null, null, new C29771Oooo00o(oooOO0O, false, null), 3);
                break;
            case 1:
                C29993OooOOOo c29993OooOOOo = (C29993OooOOOo) obj;
                c29993OooOOOo.OooO0OO(DrawToolFactory.ERASER_TYPE_STROKE);
                C29936OooO0oO c29936OooO0oO = c29993OooOOOo.f106559Oooo0;
                if (c29936OooO0oO != null && (oooO00o = c29936OooO0oO.f106287OooO0o0) != null) {
                    oooO00o.OooO0O0(DrawToolFactory.ERASER_TYPE_STROKE);
                    break;
                }
                break;
            case 2:
                ((AppearanceSettingsFragment) obj).OooOoO().OooO0o0(1);
                break;
            default:
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("application/zip");
                intent.setFlags(1);
                ((BackupFragment) obj).f70482Oooo0O0.OooO00o(intent);
                break;
        }
    }
}
