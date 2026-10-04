package o0o00O;

import android.content.Context;
import android.widget.ImageView;
import com.orion.notein.global.R;
import o0o000oo.C29823OooOo0o;
import o0oOo0o0.DialogC30986OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 extends DialogC30986OooO0oo implements InterfaceC29862OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C29864OooO0o0 f105953OooOo;

    public OooO0O0(Context context) {
        super(context, R.layout.dialog_bottom_sheet_note_input_type);
        this.f105953OooOo = new C29864OooO0o0(this.f110684OooOo0o);
    }

    @Override // o0o00O.InterfaceC29862OooO00o
    public final void OooO0oO(C29823OooOo0o c29823OooOo0o) {
        this.f105953OooOo.f105960OooO0O0 = c29823OooOo0o;
    }

    @Override // o0o00O.InterfaceC29862OooO00o
    public final boolean OooOOOo(ImageView imageView, int i) {
        show();
        return true;
    }
}
