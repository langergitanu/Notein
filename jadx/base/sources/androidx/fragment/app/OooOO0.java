package androidx.fragment.app;

import Oooo0.o000000O;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.google.firebase.firestore.local.LocalStore;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f64967OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f64968OooOo0o;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f64968OooOo0o = i;
        this.f64967OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f64968OooOo0o) {
            case 0:
                C21919OoooO00.OooO0OO(4, (ArrayList) this.f64967OooOo);
                return;
            case 1:
                ((LocalStore) this.f64967OooOo).lambda$startMutationQueue$1();
                return;
            default:
                PenBoxChildFragment penBoxChildFragment = (PenBoxChildFragment) this.f64967OooOo;
                View view = penBoxChildFragment.f75363Oooo0;
                if (view == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
                    throw null;
                }
                Object parent = view.getParent();
                kotlin.jvm.internal.OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.View");
                View view2 = (View) parent;
                View view3 = penBoxChildFragment.f75363Oooo0;
                if (view3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
                    throw null;
                }
                int iOooO0o = o000000O.OooO0o(28);
                int iOooO0o2 = o000000O.OooO0o(8);
                Rect rect = new Rect();
                view3.getHitRect(rect);
                rect.left -= iOooO0o;
                rect.top -= iOooO0o2;
                rect.right += iOooO0o;
                rect.bottom += iOooO0o2;
                View view4 = penBoxChildFragment.f75363Oooo0;
                if (view4 != null) {
                    view2.setTouchDelegate(new TouchDelegate(rect, view4));
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
                    throw null;
                }
        }
    }
}
