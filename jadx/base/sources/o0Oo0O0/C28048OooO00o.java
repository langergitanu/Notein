package o0Oo0O0;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0Oo0O0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C28048OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f99440OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f99441OooO0O0 = 0;

    public static final void OooO00o(View view) {
        OooOOO0.OooO0oO(view, "<this>");
        Object systemService = view.getContext().getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
