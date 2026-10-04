package o0o00O0o;

import android.content.Context;
import android.view.View;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0o000oo.ViewOnClickListenerC29820OooOo0;
import o0oOo0o0.DialogC30986OooO0oo;

/* JADX INFO: renamed from: o0o00O0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class DialogC29876OooO0O0 extends DialogC30986OooO0oo implements InterfaceC29879OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ViewOnClickListenerC29820OooOo0 f106009OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C29880OooO0o0 f106010OooOoO0;

    public DialogC29876OooO0O0(Context context, ViewOnClickListenerC29820OooOo0 viewOnClickListenerC29820OooOo0) {
        super(context, R.layout.dialog_bottom_sheet_export_note);
        this.f106009OooOo = viewOnClickListenerC29820OooOo0;
        View view = this.f110684OooOo0o;
        C29880OooO0o0 c29880OooO0o0 = new C29880OooO0o0(view);
        ViewOnClickListenerC29875OooO00o viewOnClickListenerC29875OooO00o = new ViewOnClickListenerC29875OooO00o(this);
        view.findViewById(R.id.cl_export_single_page).setOnClickListener(viewOnClickListenerC29875OooO00o);
        view.findViewById(R.id.cl_export_multi_page).setOnClickListener(viewOnClickListenerC29875OooO00o);
        view.findViewById(R.id.cl_export_the_whole_note).setOnClickListener(viewOnClickListenerC29875OooO00o);
        this.f106010OooOoO0 = c29880OooO0o0;
    }

    @Override // o0o00O0o.InterfaceC29879OooO0o
    public final void OooO0OO(View anchor, boolean z) {
        OooOOO0.OooO0oO(anchor, "anchor");
        show();
    }

    @Override // o0o00O0o.InterfaceC29879OooO0o
    public final void OooO0o0(boolean z) {
        View viewFindViewById = this.f106010OooOoO0.f106015OooO00o.findViewById(R.id.cl_export_multi_page);
        OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
        viewFindViewById.setVisibility(z ? 0 : 8);
    }

    @Override // android.app.Dialog, o0o00O0o.InterfaceC29879OooO0o
    public final void hide() {
        dismiss();
    }
}
