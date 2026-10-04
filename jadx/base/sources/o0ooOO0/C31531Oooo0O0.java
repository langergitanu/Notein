package o0ooOO0;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import o00Ooo.C25072OooO00o;
import o00Ooo.C25073OooO0O0;
import o00Ooo.InterfaceC25083OooOOo0;

/* JADX INFO: renamed from: o0ooOO0.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31531Oooo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C31531Oooo0O0 f112726OooO00o = new C31531Oooo0O0();

    public final void OooO00o(View view, InterfaceC25083OooOOo0 interfaceC25083OooOOo0) {
        PointerIcon systemIcon;
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        if (interfaceC25083OooOOo0 instanceof C25072OooO00o) {
            ((C25072OooO00o) interfaceC25083OooOOo0).getClass();
            systemIcon = null;
        } else if (interfaceC25083OooOOo0 instanceof C25073OooO0O0) {
            Context context = view.getContext();
            ((C25073OooO0O0) interfaceC25083OooOOo0).getClass();
            systemIcon = PointerIcon.getSystemIcon(context, 1008);
            kotlin.jvm.internal.OooOOO0.OooO0o(systemIcon, "getSystemIcon(view.context, icon.type)");
        } else {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
            kotlin.jvm.internal.OooOOO0.OooO0o(systemIcon, "getSystemIcon(\n         …DEFAULT\n                )");
        }
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
