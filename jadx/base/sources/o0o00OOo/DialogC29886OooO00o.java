package o0o00OOo;

import android.content.Context;
import android.widget.ImageView;
import com.orion.notein.global.R;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0o000oo.C29825OooOoO0;
import o0o00Oo0.C29909OooO0O0;
import o0oOo0o0.DialogC30986OooO0oo;

/* JADX INFO: renamed from: o0o00OOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class DialogC29886OooO00o extends DialogC30986OooO0oo implements InterfaceC29892OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C29825OooOoO0 f106024OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C29891OooO0o0 f106025OooOoO0;

    public DialogC29886OooO00o(Context context) {
        super(context, R.layout.dialog_bottom_sheet_eidtor_more_menu);
        this.f106025OooOoO0 = new C29891OooO0o0(this.f110684OooOo0o);
    }

    @Override // o0o00OOo.InterfaceC29892OooO0oO
    public final void OooO0o(List<C29909OooO0O0> list) {
        OooOOO0.OooO0oO(list, "list");
        C29891OooO0o0 c29891OooO0o0 = this.f106025OooOoO0;
        c29891OooO0o0.getClass();
        c29891OooO0o0.f106053OooOOoo.OooO0Oo(list);
    }

    @Override // o0o00OOo.InterfaceC29892OooO0oO
    public final void OooOO0O(C29825OooOoO0 c29825OooOoO0) {
        this.f106024OooOo = c29825OooOoO0;
        this.f106025OooOoO0.f106037OooO0O0 = c29825OooOoO0;
    }

    @Override // o0o00OOo.InterfaceC29892OooO0oO
    public final boolean OooOOO0(ImageView imageView, boolean z, boolean z2, boolean z3) {
        this.f106025OooOoO0.OooO00o(z, z2, z3);
        show();
        return true;
    }

    @Override // o0o00OOo.InterfaceC29892OooO0oO
    public final void OooOOOO(boolean z) {
        C29891OooO0o0 c29891OooO0o0 = this.f106025OooOoO0;
        c29891OooO0o0.getClass();
        c29891OooO0o0.f106049OooOOOO.setVisibility(z ? 4 : 0);
        c29891OooO0o0.f106050OooOOOo.setVisibility(z ? 0 : 8);
    }

    @Override // o0oOo0o0.DialogC30986OooO0oo, com.google.android.material.bottomsheet.BottomSheetDialog, OooO0Oo.OooOo00, android.app.Dialog
    public final void onStart() {
        super.onStart();
        C29825OooOoO0 c29825OooOoO0 = this.f106024OooOo;
        if (c29825OooOoO0 != null) {
            c29825OooOoO0.OooO0OO(true);
        }
    }

    @Override // androidx.appcompat.app.DialogC21495OooOoO, OooO0Oo.OooOo00, android.app.Dialog
    public final void onStop() {
        super.onStop();
        C29825OooOoO0 c29825OooOoO0 = this.f106024OooOo;
        if (c29825OooOoO0 != null) {
            c29825OooOoO0.OooO0OO(false);
        }
    }
}
