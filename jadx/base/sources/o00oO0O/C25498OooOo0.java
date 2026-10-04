package o00oO0O;

import Oooo0oO.C21105o000OoO;
import Oooo0oO.o000O0O0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import oo000o.InterfaceC34642OooOo0o;

/* JADX INFO: renamed from: o00oO0O.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25498OooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25503OooOoOO f86914OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f86915OooO0O0;

    public C25498OooOo0(C25503OooOoOO layoutNode) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(layoutNode, "layoutNode");
        this.f86914OooO00o = layoutNode;
        this.f86915OooO0O0 = C21105o000OoO.OooO0OO(null, o000O0O0.f61218OooO00o);
    }

    public final InterfaceC34642OooOo0o OooO00o() {
        InterfaceC34642OooOo0o interfaceC34642OooOo0o = (InterfaceC34642OooOo0o) this.f86915OooO0O0.getValue();
        if (interfaceC34642OooOo0o != null) {
            return interfaceC34642OooOo0o;
        }
        throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.");
    }
}
