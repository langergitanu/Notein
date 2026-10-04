package Ooooo0o;

import androidx.compose.p002ui.platform.AndroidComposeView;
import java.util.LinkedHashSet;
import o00oO0O.InterfaceC25492OooO0oo;

/* JADX INFO: renamed from: Ooooo0o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21261OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AndroidComposeView.C21600OooO0o0 f61652OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LinkedHashSet f61653OooO0O0 = new LinkedHashSet();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LinkedHashSet f61654OooO0OO = new LinkedHashSet();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinkedHashSet f61655OooO0Oo = new LinkedHashSet();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C21260OooO0oO f61656OooO0o0 = new C21260OooO0oO(this);

    public C21261OooO0oo(AndroidComposeView.C21600OooO0o0 c21600OooO0o0) {
        this.f61652OooO00o = c21600OooO0o0;
    }

    public final void OooO00o(LinkedHashSet linkedHashSet, InterfaceC25492OooO0oo interfaceC25492OooO0oo) {
        if (linkedHashSet.contains(interfaceC25492OooO0oo)) {
            return;
        }
        linkedHashSet.add(interfaceC25492OooO0oo);
        if (this.f61655OooO0Oo.size() + this.f61654OooO0OO.size() + this.f61653OooO0O0.size() == 1) {
            this.f61652OooO00o.invoke(this.f61656OooO0o0);
        }
    }
}
