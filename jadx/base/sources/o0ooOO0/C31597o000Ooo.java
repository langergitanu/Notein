package o0ooOO0;

import androidx.compose.p002ui.platform.AbstractComposeView;
import androidx.lifecycle.AbstractC21979OooOOo0;

/* JADX INFO: renamed from: o0ooOO0.o000Ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31597o000Ooo {
    public static final C31595o000OoO OooO00o(AbstractComposeView abstractComposeView, AbstractC21979OooOOo0 abstractC21979OooOOo0) {
        if (abstractC21979OooOOo0.OooO0O0().compareTo(AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o) > 0) {
            C31585o000O0o c31585o000O0o = new C31585o000O0o(abstractComposeView);
            abstractC21979OooOOo0.OooO00o(c31585o000O0o);
            return new C31595o000OoO(abstractC21979OooOOo0, c31585o000O0o);
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + abstractC21979OooOOo0 + "is already destroyed").toString());
    }
}
