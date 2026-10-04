package OooOOOo;

import android.os.Handler;
import android.widget.TextView;
import androidx.biometric.FingerprintDialogFragment;
import androidx.lifecycle.InterfaceC21998Oooo0o0;

/* JADX INFO: renamed from: OooOOOo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20458OooOOo0 implements InterfaceC21998Oooo0o0<CharSequence> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FingerprintDialogFragment f58436OooOo0o;

    public C20458OooOOo0(FingerprintDialogFragment fingerprintDialogFragment) {
        this.f58436OooOo0o = fingerprintDialogFragment;
    }

    @Override // androidx.lifecycle.InterfaceC21998Oooo0o0
    public final void OooO0O0(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        FingerprintDialogFragment fingerprintDialogFragment = this.f58436OooOo0o;
        Handler handler = fingerprintDialogFragment.f63213OooOo0o;
        FingerprintDialogFragment.OooO00o oooO00o = fingerprintDialogFragment.f63212OooOo;
        handler.removeCallbacks(oooO00o);
        TextView textView = fingerprintDialogFragment.f63217OooOoo;
        if (textView != null) {
            textView.setText(charSequence2);
        }
        handler.postDelayed(oooO00o, 2000L);
    }
}
