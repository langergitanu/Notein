package com.orion.notein.p607ui.noteeditor.addtext.textstylebox;

import android.widget.TextView;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.C23383OooO0Oo;
import kotlin.jvm.internal.OooOOO0;
import o0OoOOO0.C29051OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o implements C23383OooO0Oo.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TextStyleBox f74124OooO00o;

    public OooO0o(TextStyleBox textStyleBox) {
        this.f74124OooO00o = textStyleBox;
    }

    @Override // com.orion.notein.p607ui.noteeditor.addtext.textstylebox.C23383OooO0Oo.OooO00o
    public final void OooO00o(int i) {
        TextView textView = this.f74124OooO00o.f74133OooOo;
        if (textView != null) {
            textView.setActivated(i == 0);
        } else {
            OooOOO0.OooOOOO("tvTextBoxFontSize");
            throw null;
        }
    }

    @Override // com.orion.notein.p607ui.noteeditor.addtext.textstylebox.C23383OooO0Oo.OooO00o
    public final void OooO0O0(int i) {
        C29051OooOO0o c29051OooOO0o = this.f74124OooO00o.f74153OoooO;
        if (c29051OooOO0o != null) {
            c29051OooOO0o.OooOO0O(i);
        } else {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
    }
}
