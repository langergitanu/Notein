package o000O00O;

import android.view.AttachedSurfaceControl;
import android.view.View;

/* JADX INFO: renamed from: o000O00O.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24401OooOoO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f82375OooO00o = new OooO00o();

    /* JADX INFO: renamed from: o000O00O.OooOoO0$OooO00o */
    public static final class OooO00o {
        public final int OooO00o(View view) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
            AttachedSurfaceControl rootSurfaceControl = view.getRootSurfaceControl();
            if (rootSurfaceControl != null) {
                return rootSurfaceControl.getBufferTransformHint();
            }
            return 0;
        }
    }
}
