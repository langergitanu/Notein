package androidx.room;

import androidx.room.OooO0OO;
import java.lang.ref.WeakReference;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends OooO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0OO f66174OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final WeakReference<OooO0OO.OooO00o> f66175OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(OooO0OO oooO0OO, C22082OooO0oO delegate) {
        super(delegate.f66192OooO00o);
        OooOOO0.OooO0oO(delegate, "delegate");
        this.f66174OooO0O0 = oooO0OO;
        this.f66175OooO0OO = new WeakReference<>(delegate);
    }

    @Override // androidx.room.OooO0OO.OooO00o
    public final void OooO00o(Set<String> tables) {
        OooOOO0.OooO0oO(tables, "tables");
        OooO0OO.OooO00o oooO00o = this.f66175OooO0OO.get();
        if (oooO00o == null) {
            this.f66174OooO0O0.OooO0O0(this);
        } else {
            oooO00o.OooO00o(tables);
        }
    }
}
