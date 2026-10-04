package o0oOo0O0;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.orion.editor.p600ui.zoom.DefaultZoomHandle;
import kotlin.jvm.internal.OooOOO0;
import o0O0oO0o.C26095OooO0O0;
import o0OoO0oo.C28839o00O0Oo0;
import oO00ooO.C32447OooOOo;
import oO0O00oo.OooOO0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oOo0O0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C30956OooO0o implements InterfaceC30953OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public C28839o00O0Oo0 f110618OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f110619OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public DefaultZoomHandle f110620OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f110621OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f110622OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C26095OooO0O0 f110623OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f110624OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Float f110625OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Float f110626OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public InterfaceC30952OooO00o f110627OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C32447OooOOo f110628OooOO0O;

    /* JADX INFO: renamed from: o0oOo0O0.OooO0o$OooO00o */
    public static final class OooO00o implements View.OnLayoutChangeListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            C30956OooO0o.this.OooO0OO();
        }
    }

    public C30956OooO0o(Context context) {
        OooOOO0.OooO0oO(context, "context");
        this.f110619OooO00o = context;
        this.f110627OooOO0 = C30954OooO0OO.f110616OooO00o;
        this.f110628OooOO0O = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0oOo0O0.OooO0Oo
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                C30956OooO0o c30956OooO0o = this.f110617OooOo0o;
                c30956OooO0o.getClass();
                return Integer.valueOf((int) TypedValue.applyDimension(1, 8, c30956OooO0o.f110619OooO00o.getResources().getDisplayMetrics()));
            }
        });
    }

    public final void OooO00o(float f, float f2) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("PrefMovableBehavior");
        c20358OooO00o.OooO0o0("applyBias <- h=" + f + " v=" + f2, new Object[0]);
        this.f110625OooO0oO = Float.valueOf(f);
        this.f110626OooO0oo = Float.valueOf(f2);
        OooO0OO();
    }

    public final int OooO0O0() {
        return ((Number) this.f110628OooOO0O.getValue()).intValue();
    }

    public final void OooO0OO() {
        Float f = this.f110625OooO0oO;
        if (f != null) {
            float fFloatValue = f.floatValue();
            Float f2 = this.f110626OooO0oo;
            if (f2 != null) {
                float fFloatValue2 = f2.floatValue();
                DefaultZoomHandle defaultZoomHandle = this.f110620OooO0O0;
                if (defaultZoomHandle == null) {
                    OooOOO0.OooOOOO("host");
                    throw null;
                }
                Object parent = defaultZoomHandle.getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null) {
                    return;
                }
                DefaultZoomHandle defaultZoomHandle2 = this.f110620OooO0O0;
                if (defaultZoomHandle2 == null) {
                    OooOOO0.OooOOOO("host");
                    throw null;
                }
                if (defaultZoomHandle2.getWidth() == 0 || view.getWidth() == 0) {
                    DefaultZoomHandle defaultZoomHandle3 = this.f110620OooO0O0;
                    if (defaultZoomHandle3 != null) {
                        defaultZoomHandle3.addOnLayoutChangeListener(new OooO00o());
                        return;
                    } else {
                        OooOOO0.OooOOOO("host");
                        throw null;
                    }
                }
                int width = view.getWidth();
                DefaultZoomHandle defaultZoomHandle4 = this.f110620OooO0O0;
                if (defaultZoomHandle4 == null) {
                    OooOOO0.OooOOOO("host");
                    throw null;
                }
                int width2 = (width - defaultZoomHandle4.getWidth()) - (OooO0O0() * 2);
                int height = view.getHeight();
                DefaultZoomHandle defaultZoomHandle5 = this.f110620OooO0O0;
                if (defaultZoomHandle5 == null) {
                    OooOOO0.OooOOOO("host");
                    throw null;
                }
                int height2 = (height - defaultZoomHandle5.getHeight()) - (OooO0O0() * 2);
                if (width2 <= 0 || height2 <= 0) {
                    return;
                }
                float fOooO0o0 = (OooOO0.OooO0o0(fFloatValue, 0.0f, 1.0f) * width2) + OooO0O0();
                float fOooO0o02 = (OooOO0.OooO0o0(fFloatValue2, 0.0f, 1.0f) * height2) + OooO0O0();
                DefaultZoomHandle defaultZoomHandle6 = this.f110620OooO0O0;
                if (defaultZoomHandle6 == null) {
                    OooOOO0.OooOOOO("host");
                    throw null;
                }
                defaultZoomHandle6.setX(fOooO0o0);
                DefaultZoomHandle defaultZoomHandle7 = this.f110620OooO0O0;
                if (defaultZoomHandle7 != null) {
                    defaultZoomHandle7.setY(fOooO0o02);
                } else {
                    OooOOO0.OooOOOO("host");
                    throw null;
                }
            }
        }
    }
}
