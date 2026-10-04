package o000O0o;

import android.widget.EditText;
import androidx.core.util.Preconditions;

/* JADX INFO: renamed from: o000O0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24403OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C19614OooO00o f82382OooO00o;

    /* JADX INFO: renamed from: o000O0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C19614OooO00o extends OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final EditText f82383OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C24406OooO0oO f82384OooO0O0;

        public C19614OooO00o(EditText editText) {
            this.f82383OooO00o = editText;
            C24406OooO0oO c24406OooO0oO = new C24406OooO0oO(editText);
            this.f82384OooO0O0 = c24406OooO0oO;
            editText.addTextChangedListener(c24406OooO0oO);
            if (o000O0o.OooO0O0.f82386OooO0O0 == null) {
                synchronized (o000O0o.OooO0O0.f82385OooO00o) {
                    try {
                        if (o000O0o.OooO0O0.f82386OooO0O0 == null) {
                            o000O0o.OooO0O0 oooO0O0 = new o000O0o.OooO0O0();
                            try {
                                o000O0o.OooO0O0.f82387OooO0OO = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, o000O0o.OooO0O0.class.getClassLoader());
                            } catch (Throwable unused) {
                            }
                            o000O0o.OooO0O0.f82386OooO0O0 = oooO0O0;
                        }
                    } finally {
                    }
                }
            }
            editText.setEditableFactory(o000O0o.OooO0O0.f82386OooO0O0);
        }
    }

    /* JADX INFO: renamed from: o000O0o.OooO00o$OooO0O0 */
    public static class OooO0O0 {
    }

    public C24403OooO00o(EditText editText) {
        Preconditions.checkNotNull(editText, "editText cannot be null");
        this.f82382OooO00o = new C19614OooO00o(editText);
    }
}
