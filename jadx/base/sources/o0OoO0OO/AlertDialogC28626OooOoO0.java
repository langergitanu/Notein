package o0OoO0OO;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.orion.notein.global.R;
import o0Oo0Ooo.ViewOnClickListenerC28139OooO0o;

/* JADX INFO: renamed from: o0OoO0OO.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class AlertDialogC28626OooOoO0 extends AlertDialog {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ImageView f101471OooOo0o;

    public AlertDialogC28626OooOoO0(Context context) {
        super(context);
        View viewInflate = getLayoutInflater().inflate(R.layout.fragment_dialog_qrcode, (ViewGroup) null);
        viewInflate.findViewById(R.id.cl_qr_code).setBackground(viewInflate.getContext().getDrawable(R.drawable.bg_qrcode_dialog));
        this.f101471OooOo0o = (ImageView) viewInflate.findViewById(R.id.iv_qrcode);
        viewInflate.findViewById(R.id.iv_close).setOnClickListener(new ViewOnClickListenerC28139OooO0o(this, 1));
        setCancelable(false);
        setView(viewInflate);
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }
}
