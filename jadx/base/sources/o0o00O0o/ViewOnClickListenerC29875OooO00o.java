package o0o00O0o;

import android.view.View;
import kotlin.jvm.internal.OooOOO0;
import o0o000oo.ViewOnClickListenerC29820OooOo0;

/* JADX INFO: renamed from: o0o00O0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ViewOnClickListenerC29875OooO00o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ DialogC29876OooO0O0 f106008OooOo0o;

    public ViewOnClickListenerC29875OooO00o(DialogC29876OooO0O0 dialogC29876OooO0O0) {
        this.f106008OooOo0o = dialogC29876OooO0O0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        OooOOO0.OooO0oO(v, "v");
        DialogC29876OooO0O0 dialogC29876OooO0O0 = this.f106008OooOo0o;
        ViewOnClickListenerC29820OooOo0 viewOnClickListenerC29820OooOo0 = dialogC29876OooO0O0.f106009OooOo;
        if (viewOnClickListenerC29820OooOo0 != null) {
            viewOnClickListenerC29820OooOo0.onClick(v);
        }
        dialogC29876OooO0O0.dismiss();
    }
}
