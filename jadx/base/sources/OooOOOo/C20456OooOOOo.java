package OooOOOo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;
import androidx.biometric.FingerprintDialogFragment;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.InterfaceC21998Oooo0o0;
import com.orion.notein.R$drawable;

/* JADX INFO: renamed from: OooOOOo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20456OooOOOo implements InterfaceC21998Oooo0o0<Integer> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FingerprintDialogFragment f58435OooOo0o;

    public C20456OooOOOo(FingerprintDialogFragment fingerprintDialogFragment) {
        this.f58435OooOo0o = fingerprintDialogFragment;
    }

    @Override // androidx.lifecycle.InterfaceC21998Oooo0o0
    public final void OooO0O0(Integer num) {
        Integer num2 = num;
        FingerprintDialogFragment fingerprintDialogFragment = this.f58435OooOo0o;
        Handler handler = fingerprintDialogFragment.f63213OooOo0o;
        FingerprintDialogFragment.OooO00o oooO00o = fingerprintDialogFragment.f63212OooOo;
        handler.removeCallbacks(oooO00o);
        int iIntValue = num2.intValue();
        if (fingerprintDialogFragment.f63218OooOoo0 != null) {
            int i = fingerprintDialogFragment.f63215OooOoO0.f63268OooOoO;
            Context context = fingerprintDialogFragment.getContext();
            Drawable drawable = null;
            if (context == null) {
                Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            } else {
                int i2 = R$drawable.fingerprint_dialog_fp_icon;
                if (i == 0 && iIntValue == 1) {
                    drawable = ContextCompat.getDrawable(context, i2);
                } else {
                    if (i == 1 && iIntValue == 2) {
                        i2 = R$drawable.fingerprint_dialog_error;
                    } else if ((i == 2 && iIntValue == 1) || (i == 1 && iIntValue == 3)) {
                    }
                    drawable = ContextCompat.getDrawable(context, i2);
                }
            }
            if (drawable != null) {
                fingerprintDialogFragment.f63218OooOoo0.setImageDrawable(drawable);
                if ((i != 0 || iIntValue != 1) && ((i == 1 && iIntValue == 2) || (i == 2 && iIntValue == 1))) {
                    FingerprintDialogFragment.OooO0OO.OooO00o(drawable);
                }
                fingerprintDialogFragment.f63215OooOoO0.f63268OooOoO = iIntValue;
            }
        }
        int iIntValue2 = num2.intValue();
        TextView textView = fingerprintDialogFragment.f63217OooOoo;
        if (textView != null) {
            textView.setTextColor(iIntValue2 == 2 ? fingerprintDialogFragment.f63214OooOoO : fingerprintDialogFragment.f63216OooOoOO);
        }
        handler.postDelayed(oooO00o, 2000L);
    }
}
