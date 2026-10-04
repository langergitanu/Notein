package OooOOOo;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import androidx.biometric.BiometricFragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC21998Oooo0o0;
import androidx.lifecycle.OooOo;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.orion.editor.PDFView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import o000OOO.C24503OooOOo;
import o0OoO0oo.C28858o00OO0oO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: OooOOOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C20452OooO0o0 implements InterfaceC21998Oooo0o0, ObjectConstructor, o000OOO.OooO, PDFView.InterfaceC22834OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f58420OooOo0o;

    public /* synthetic */ C20452OooO0o0(Object obj) {
        this.f58420OooOo0o = obj;
    }

    @Override // o000OOO.OooO
    public double OooO00o(double d) {
        C24503OooOOo c24503OooOOo = (C24503OooOOo) this.f58420OooOo0o;
        double d2 = c24503OooOOo.f82864OooO0o0;
        double d3 = c24503OooOOo.f82862OooO0Oo;
        return d >= d2 * d3 ? (Math.pow(d, 1.0d / c24503OooOOo.f82859OooO00o) - c24503OooOOo.f82861OooO0OO) / c24503OooOOo.f82860OooO0O0 : d / d3;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae  */
    @Override // androidx.lifecycle.InterfaceC21998Oooo0o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OooO0O0(Object obj) {
        boolean z;
        C20450OooO00o c20450OooO00o = (C20450OooO00o) obj;
        final BiometricFragment biometricFragment = (BiometricFragment) this.f58420OooOo0o;
        if (c20450OooO00o != null) {
            final int i = c20450OooO00o.f58412OooO00o;
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                case 6:
                default:
                    i = 8;
                    break;
            }
            Context context = biometricFragment.getContext();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29 || (!(i == 7 || i == 9) || context == null)) {
                boolean zOooOoo0 = biometricFragment.OooOoo0();
                final CharSequence charSequenceOooO0Oo = c20450OooO00o.f58413OooO0O0;
                if (zOooOoo0) {
                    if (charSequenceOooO0Oo == null) {
                        charSequenceOooO0Oo = OooOOOO.OooO0Oo(biometricFragment.getContext(), i);
                    }
                    if (i == 5) {
                        int i3 = biometricFragment.f63207OooOo0o.f63255OooOO0o;
                        if (i3 == 0 || i3 == 3) {
                            biometricFragment.OooOooo(i, charSequenceOooO0Oo);
                        }
                        biometricFragment.dismiss();
                    } else {
                        if (biometricFragment.f63207OooOo0o.f63263OooOo) {
                            biometricFragment.OooOooO(i, charSequenceOooO0Oo);
                        } else {
                            biometricFragment.Oooo00O(charSequenceOooO0Oo);
                            Handler handler = biometricFragment.f63206OooOo;
                            Runnable runnable = new Runnable() { // from class: OooOOOo.OooOO0o
                                @Override // java.lang.Runnable
                                public final void run() {
                                    biometricFragment.OooOooO(i, charSequenceOooO0Oo);
                                }
                            };
                            Context context2 = biometricFragment.getContext();
                            if (context2 != null) {
                                String str = Build.MODEL;
                                if (i2 == 28 && str != null) {
                                    for (String str2 : context2.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                                        if (str.startsWith(str2)) {
                                            z = true;
                                            int i4 = z ? 0 : 2000;
                                            handler.postDelayed(runnable, i4);
                                        }
                                    }
                                    z = false;
                                    if (z) {
                                    }
                                    handler.postDelayed(runnable, i4);
                                } else {
                                    z = false;
                                    if (z) {
                                    }
                                    handler.postDelayed(runnable, i4);
                                }
                            }
                        }
                        biometricFragment.f63207OooOo0o.f63263OooOo = true;
                    }
                } else {
                    if (charSequenceOooO0Oo == null) {
                        charSequenceOooO0Oo = biometricFragment.getString(R.string.default_error_msg) + " " + i;
                    }
                    biometricFragment.OooOooO(i, charSequenceOooO0Oo);
                }
            } else {
                KeyguardManager keyguardManagerOooO00o = C20457OooOOo.OooO00o(context);
                if ((keyguardManagerOooO00o == null ? false : C20457OooOOo.OooO0O0(keyguardManagerOooO00o)) && androidx.biometric.OooO0OO.OooO00o(biometricFragment.f63207OooOo0o.OooO0o0())) {
                    biometricFragment.OooOoo();
                }
            }
            biometricFragment.f63207OooOo0o.OooO0o(null);
        }
    }

    public void OooO0OO(float f, float f2) {
        NoteEditorFragment noteEditorFragment = (NoteEditorFragment) this.f58420OooOo0o;
        noteEditorFragment.o00ooo(f2);
        InterfaceC21987OooOoo viewLifecycleOwner = noteEditorFragment.getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28858o00OO0oO(f, f2, noteEditorFragment, null), 2);
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        return ConstructorConstructor.lambda$newDefaultConstructor$6((String) this.f58420OooOo0o);
    }
}
