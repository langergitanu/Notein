package o000O0oO;

import androidx.ink.authoring.InProgressStrokesView;
import androidx.ink.strokes.OooOOO0;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: o000O0oO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24413OooO0oo implements OooO0OO<OooOOO0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ InProgressStrokesView f82423OooO00o;

    public C24413OooO0oo(InProgressStrokesView inProgressStrokesView) {
        this.f82423OooO00o = inProgressStrokesView;
    }

    @Override // o000O0oO.OooO0OO
    public final void OooO00o(LinkedHashMap linkedHashMap) {
        Iterator it = this.f82423OooO00o.f65174OooOoO0.iterator();
        while (it.hasNext()) {
            ((InterfaceC24411OooO0o0) it.next()).OooO00o(linkedHashMap);
        }
    }
}
