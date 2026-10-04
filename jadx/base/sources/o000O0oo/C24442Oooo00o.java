package o000O0oo;

import android.os.Looper;
import android.view.View;
import com.orion.notein.global.R;
import o000ooo0.InterfaceC24753OooO0o0;

/* JADX INFO: renamed from: o000O0oo.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24442Oooo00o {
    public static final void OooO00o() {
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(Looper.myLooper(), Looper.getMainLooper())) {
            return;
        }
        throw new IllegalStateException(("Should be running on the UI thread, but instead running on " + Thread.currentThread() + ".").toString());
    }

    public static final void OooO0O0(View view, InterfaceC24753OooO0o0 interfaceC24753OooO0o0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, interfaceC24753OooO0o0);
    }
}
