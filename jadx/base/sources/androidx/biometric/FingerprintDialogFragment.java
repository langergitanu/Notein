package androidx.biometric;

import OooOOOo.C20456OooOOOo;
import OooOOOo.C20458OooOOo0;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC21484OooO0oO;
import androidx.biometric.C21590OooO0o0;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.C21996Oooo0OO;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes.dex */
public class FingerprintDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f63214OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C21592OooO0oO f63215OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f63216OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public TextView f63217OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public ImageView f63218OooOoo0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Handler f63213OooOo0o = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO00o f63212OooOo = new OooO00o();

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FingerprintDialogFragment fingerprintDialogFragment = FingerprintDialogFragment.this;
            Context context = fingerprintDialogFragment.getContext();
            if (context == null) {
                Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
            } else {
                fingerprintDialogFragment.f63215OooOoO0.OooO0oo(1);
                fingerprintDialogFragment.f63215OooOoO0.OooO0oO(context.getString(R.string.fingerprint_dialog_touch_sensor));
            }
        }
    }

    public class OooO0O0 implements DialogInterface.OnClickListener {
        public OooO0O0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            FingerprintDialogFragment.this.f63215OooOoO0.OooO(true);
        }
    }

    public static class OooO0OO {
        public static void OooO00o(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.FingerprintDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static class C21588OooO0Oo {
        public static int OooO00o() {
            return R.attr.colorError;
        }
    }

    private FingerprintDialogFragment() {
    }

    public static FingerprintDialogFragment OooOoOO(boolean z) {
        FingerprintDialogFragment fingerprintDialogFragment = new FingerprintDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("host_activity", z);
        fingerprintDialogFragment.setArguments(bundle);
        return fingerprintDialogFragment;
    }

    public final int OooOoO(int i) {
        Context context = getContext();
        if (context == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        C21592OooO0oO c21592OooO0oO = this.f63215OooOoO0;
        if (c21592OooO0oO.f63269OooOoO0 == null) {
            c21592OooO0oO.f63269OooOoO0 = new C21996Oooo0OO<>();
        }
        C21592OooO0oO.OooOO0(c21592OooO0oO.f63269OooOoO0, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C21592OooO0oO c21592OooO0oOOooO0O0 = C21590OooO0o0.OooO0O0(this, getArguments().getBoolean("host_activity", true));
        this.f63215OooOoO0 = c21592OooO0oOOooO0O0;
        if (c21592OooO0oOOooO0O0.f63270OooOoOO == null) {
            c21592OooO0oOOooO0O0.f63270OooOoOO = new C21996Oooo0OO<>();
        }
        c21592OooO0oOOooO0O0.f63270OooOoOO.OooO0Oo(this, new C20456OooOOOo(this));
        C21592OooO0oO c21592OooO0oO = this.f63215OooOoO0;
        if (c21592OooO0oO.f63271OooOoo0 == null) {
            c21592OooO0oO.f63271OooOoo0 = new C21996Oooo0OO<>();
        }
        c21592OooO0oO.f63271OooOoo0.OooO0Oo(this, new C20458OooOOo0(this));
        this.f63214OooOoO = OooOoO(C21588OooO0Oo.OooO00o());
        this.f63216OooOoOO = OooOoO(android.R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        DialogInterfaceC21484OooO0oO.OooO00o oooO00o = new DialogInterfaceC21484OooO0oO.OooO00o(requireContext());
        C21590OooO0o0.C21591OooO0Oo c21591OooO0Oo = this.f63215OooOoO0.f63249OooO0o;
        String string = null;
        oooO00o.setTitle(c21591OooO0Oo != null ? c21591OooO0Oo.f63238OooO00o : null);
        View viewInflate = LayoutInflater.from(oooO00o.getContext()).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            this.f63215OooOoO0.getClass();
            if (TextUtils.isEmpty(null)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText((CharSequence) null);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            C21590OooO0o0.C21591OooO0Oo c21591OooO0Oo2 = this.f63215OooOoO0.f63249OooO0o;
            String str = c21591OooO0Oo2 != null ? c21591OooO0Oo2.f63239OooO0O0 : null;
            if (TextUtils.isEmpty(str)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(str);
            }
        }
        this.f63218OooOoo0 = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.f63217OooOoo = (TextView) viewInflate.findViewById(R.id.fingerprint_error);
        if (androidx.biometric.OooO0OO.OooO00o(this.f63215OooOoO0.OooO0o0())) {
            string = getString(R.string.confirm_device_credential_password);
        } else {
            C21592OooO0oO c21592OooO0oO = this.f63215OooOoO0;
            String str2 = c21592OooO0oO.f63254OooOO0O;
            if (str2 != null) {
                string = str2;
            } else {
                C21590OooO0o0.C21591OooO0Oo c21591OooO0Oo3 = c21592OooO0oO.f63249OooO0o;
                if (c21591OooO0Oo3 != null && (string = c21591OooO0Oo3.f63240OooO0OO) == null) {
                    string = "";
                }
            }
        }
        oooO00o.setNegativeButton(string, new OooO0O0());
        oooO00o.setView(viewInflate);
        DialogInterfaceC21484OooO0oO dialogInterfaceC21484OooO0oOCreate = oooO00o.create();
        dialogInterfaceC21484OooO0oOCreate.setCanceledOnTouchOutside(false);
        return dialogInterfaceC21484OooO0oOCreate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f63213OooOo0o.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C21592OooO0oO c21592OooO0oO = this.f63215OooOoO0;
        c21592OooO0oO.f63268OooOoO = 0;
        c21592OooO0oO.OooO0oo(1);
        this.f63215OooOoO0.OooO0oO(getString(R.string.fingerprint_dialog_touch_sensor));
    }
}
