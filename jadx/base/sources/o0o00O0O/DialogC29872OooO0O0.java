package o0o00O0O;

import android.content.Context;
import android.view.View;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0o000oo.C29821OooOo00;
import o0oOo0o0.DialogC30986OooO0oo;

/* JADX INFO: renamed from: o0o00O0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class DialogC29872OooO0O0 extends DialogC30986OooO0oo implements OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C29821OooOo00 f106000OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C29874OooO0o0 f106001OooOoO0;

    public DialogC29872OooO0O0(Context context, C29821OooOo00 c29821OooOo00) {
        super(context, R.layout.dialog_bottom_sheet_change_template);
        this.f106000OooOo = c29821OooOo00;
        C29874OooO0o0 c29874OooO0o0 = new C29874OooO0o0(this.f110684OooOo0o);
        c29874OooO0o0.f106007OooO0O0 = new C29871OooO00o(this);
        this.f106001OooOoO0 = c29874OooO0o0;
    }

    @Override // o0o00O0O.OooO0o
    public final void OooO0OO(View anchor, boolean z) {
        OooOOO0.OooO0oO(anchor, "anchor");
        show();
    }

    @Override // o0o00O0O.OooO0o
    public final void OooO0oo(boolean z, boolean z2) {
        this.f106001OooOoO0.OooO00o(z, z2);
    }

    @Override // android.app.Dialog, o0o00O0O.OooO0o
    public final void hide() {
        dismiss();
    }
}
