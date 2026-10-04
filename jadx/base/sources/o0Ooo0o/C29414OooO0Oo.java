package o0Ooo0o;

import com.orion.notein.p607ui.noteeditor.toolbox.colorpicker.ColorPickerView;
import o0oOOO0o.C30832OooOO0O;

/* JADX INFO: renamed from: o0Ooo0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29414OooO0Oo implements ColorPickerView.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C29415OooO0o f104303OooO00o;

    public C29414OooO0Oo(C29415OooO0o c29415OooO0o) {
        this.f104303OooO00o = c29415OooO0o;
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.colorpicker.ColorPickerView.OooO00o
    public final void OooO00o(int i) {
        C30832OooOO0O c30832OooOO0O;
        C29415OooO0o c29415OooO0o = this.f104303OooO00o;
        if (c29415OooO0o.f104317OooOO0O || (c30832OooOO0O = c29415OooO0o.f104319OooOOO0) == null) {
            return;
        }
        c30832OooOO0O.OooO00o(i);
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.colorpicker.ColorPickerView.OooO00o
    public final void OooO0O0(int i) {
        C29415OooO0o c29415OooO0o = this.f104303OooO00o;
        c29415OooO0o.OooO0o0((i & 16777215) | (((c29415OooO0o.f104318OooOO0o >> 24) & 255) << 24));
    }
}
