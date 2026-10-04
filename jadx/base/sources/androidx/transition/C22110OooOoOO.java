package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: androidx.transition.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22110OooOoOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C22115Oooo00O f66401OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o f66402OooO0O0;

    /* JADX INFO: renamed from: androidx.transition.OooOoOO$OooO00o */
    public class OooO00o extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(C22110OooOoOO.f66401OooO00o.OooO00o(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            float fFloatValue = f.floatValue();
            C22110OooOoOO.f66401OooO00o.OooO0O0(view, fFloatValue);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.OooOoOO$OooO0O0 */
    public class OooO0O0 extends Property<View, Rect> {
        @Override // android.util.Property
        public final Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f66401OooO00o = new C22116Oooo00o();
        } else {
            f66401OooO00o = new C22115Oooo00O();
        }
        f66402OooO0O0 = new OooO00o(Float.class, "translationAlpha");
        new OooO0O0(Rect.class, "clipBounds");
    }

    public static void OooO00o(View view, int i, int i2, int i3, int i4) {
        f66401OooO00o.OooO0o(view, i, i2, i3, i4);
    }

    public static void OooO0O0(View view, int i) {
        f66401OooO00o.OooO0OO(view, i);
    }
}
