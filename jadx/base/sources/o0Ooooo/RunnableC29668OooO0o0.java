package o0Ooooo;

import com.orion.notein.p607ui.noteeditor.propertypanel.preview.EditorPreviewFragment;
import ooOOOOoo.C35064OooO0Oo;
import ooOOOOoo.C35077OooOo0O;

/* JADX INFO: renamed from: o0Ooooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class RunnableC29668OooO0o0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f105190OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f105191OooOo0o;

    public /* synthetic */ RunnableC29668OooO0o0(Object obj, int i) {
        this.f105191OooOo0o = i;
        this.f105190OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f105191OooOo0o) {
            case 0:
                EditorPreviewFragment.OooOoO((EditorPreviewFragment) this.f105190OooOo);
                break;
            default:
                ooOOOOoo.OooOO0 oooOO02 = (ooOOOOoo.OooOO0) this.f105190OooOo;
                oooOO02.OooO0O0(oooOO02.f125974OooOO0);
                C35077OooOo0O.OooO0O0("HH", "unbind Handoff Service", null);
                try {
                    oooOO02.f125970OooO0o.f113561OooO00o.unbindService(oooOO02.f125972OooO0oO);
                    break;
                } catch (Throwable unused) {
                }
                C35064OooO0Oo c35064OooO0Oo = oooOO02.f125966OooO00o;
                c35064OooO0Oo.getClass();
                C35077OooOo0O.OooO0o0("HD", "release", null);
                c35064OooO0Oo.f125955OooO00o.quitSafely();
                c35064OooO0Oo.f125957OooO0OO = null;
                break;
        }
    }
}
