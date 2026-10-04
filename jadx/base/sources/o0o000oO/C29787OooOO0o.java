package o0o000oO;

import android.widget.TextView;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.C23383OooO0Oo;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;

/* JADX INFO: renamed from: o0o000oO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29787OooOO0o implements C23383OooO0Oo.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TextStyleBarChildFragment f105707OooO00o;

    public C29787OooOO0o(TextStyleBarChildFragment textStyleBarChildFragment) {
        this.f105707OooO00o = textStyleBarChildFragment;
    }

    @Override // com.orion.notein.p607ui.noteeditor.addtext.textstylebox.C23383OooO0Oo.OooO00o
    public final void OooO00o(int i) {
        TextView textView = this.f105707OooO00o.f76434Oooo0;
        if (textView != null) {
            textView.setActivated(i == 0);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("tvTextBoxFontSize");
            throw null;
        }
    }

    @Override // com.orion.notein.p607ui.noteeditor.addtext.textstylebox.C23383OooO0Oo.OooO00o
    public final void OooO0O0(int i) {
        this.f105707OooO00o.OooOoOO().OooOO0O(i);
    }
}
