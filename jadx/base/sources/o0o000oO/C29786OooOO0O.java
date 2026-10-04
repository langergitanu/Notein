package o0o000oO;

import android.widget.TextView;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO0OO;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;
import o0OoOOO0.C29051OooOO0o;
import o0OoOOO0.C29064OooOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o000oO.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29786OooOO0O implements OooO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TextStyleBarChildFragment f105706OooO00o;

    public C29786OooOO0O(TextStyleBarChildFragment textStyleBarChildFragment) {
        this.f105706OooO00o = textStyleBarChildFragment;
    }

    @Override // com.orion.notein.ui.noteeditor.addtext.textstylebox.OooO0OO.OooO00o
    public final void OooO00o(int i) {
        TextView textView = this.f105706OooO00o.f76438Oooo0O0;
        if (textView != null) {
            textView.setActivated(i == 0);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("tvTextBoxFontLineHeight");
            throw null;
        }
    }

    @Override // com.orion.notein.ui.noteeditor.addtext.textstylebox.OooO0OO.OooO00o
    public final void OooO0O0(float f) {
        TextStyleBarChildFragment textStyleBarChildFragment = this.f105706OooO00o;
        textStyleBarChildFragment.OooOoOO().OooOOO(f);
        C29051OooOO0o c29051OooOO0oOooOoOO = textStyleBarChildFragment.OooOoOO();
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c29051OooOO0oOooOoOO);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29064OooOo0(c29051OooOO0oOooOoOO, f, null), 2);
    }
}
