package o0ooOO0;

import android.view.ViewParent;
import androidx.compose.p002ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: o0ooOO0.o000Oo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31593o000Oo0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C31593o000Oo0O f112896OooO00o = new C31593o000Oo0O();

    public final void OooO00o(AndroidComposeView ownerView) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(ownerView, "ownerView");
        ViewParent parent = ownerView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(ownerView, ownerView);
        }
    }
}
