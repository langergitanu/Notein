package o00o00Oo;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import o00o00oo.InterfaceC25293OooO;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: renamed from: o00o00Oo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25273OooOOoo implements InterfaceC25265OooOO0O {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Set<InterfaceC25293OooO<?>> f86021OooOo0o = Collections.newSetFromMap(new WeakHashMap());

    @Override // o00o00Oo.InterfaceC25265OooOO0O
    public final void onDestroy() {
        Iterator it = C25316OooOO0o.OooO0o0(this.f86021OooOo0o).iterator();
        while (it.hasNext()) {
            ((InterfaceC25293OooO) it.next()).onDestroy();
        }
    }

    @Override // o00o00Oo.InterfaceC25265OooOO0O
    public final void onStart() {
        Iterator it = C25316OooOO0o.OooO0o0(this.f86021OooOo0o).iterator();
        while (it.hasNext()) {
            ((InterfaceC25293OooO) it.next()).onStart();
        }
    }

    @Override // o00o00Oo.InterfaceC25265OooOO0O
    public final void onStop() {
        Iterator it = C25316OooOO0o.OooO0o0(this.f86021OooOo0o).iterator();
        while (it.hasNext()) {
            ((InterfaceC25293OooO) it.next()).onStop();
        }
    }
}
