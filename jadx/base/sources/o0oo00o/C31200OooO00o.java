package o0oo00o;

import Oooo0.C20860Ooooooo;
import android.graphics.ColorSpace;
import androidx.lifecycle.OooOo;
import com.miui.penengine.colorpick.MiuiColorPick;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import kotlin.jvm.internal.OooOOO0;
import o00oOOO0.C25582OooO0O0;
import o0OoO0oo.C28749o000000O;
import o0OoO0oo.C28982oo0o0Oo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oo00o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31200OooO00o implements MiuiColorPick.ColorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C31201OooO0O0 f111257OooO00o;

    public C31200OooO00o(C31201OooO0O0 c31201OooO0O0) {
        this.f111257OooO00o = c31201OooO0O0;
    }

    @Override // com.miui.penengine.colorpick.MiuiColorPick.ColorListener
    public final void onChange(ColorSpace colorSpace, int i) {
        OooOOO0.OooO0oO(colorSpace, "colorSpace");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO0o0(C20860Ooooooo.OooO0OO(c20358OooO00o, "XiaomiColorPickCapability", "Get pixel color = ", i), new Object[0]);
        C25582OooO0O0 c25582OooO0O0 = this.f111257OooO00o.f111258OooO00o;
        if (c25582OooO0O0 != null) {
            NoteEditorContainerFragment noteEditorContainerFragment = (NoteEditorContainerFragment) c25582OooO0O0.f87265OooO0O0;
            OooOo oooOoOooO00o = C28982oo0o0Oo.OooO00o(noteEditorContainerFragment, "getViewLifecycleOwner(...)");
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28749o000000O(noteEditorContainerFragment, i, null), 2);
        }
    }
}
