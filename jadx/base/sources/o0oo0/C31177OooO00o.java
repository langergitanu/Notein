package o0oo0;

import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import com.aspose.slides.C22201OooO0oO;
import com.orion.editor.PDFView;
import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import o000Oo.InterfaceC24508OooO00o;
import o000OoOO.C24537OooO00o;
import o000OoOo.C24542OooO0OO;
import o000OooO.C24550OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C31177OooO00o implements OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC24508OooO00o f111205OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public float f111206OooOo0o;

    public C31177OooO00o(PDFView view) {
        InterfaceC24508OooO00o c24542OooO0OO;
        OooOOO0.OooO0oO(view, "view");
        this.f111206OooOo0o = 0.6f;
        String BRAND = Build.BRAND;
        OooOOO0.OooO0o(BRAND, "BRAND");
        String upperCase = BRAND.toUpperCase(Locale.ROOT);
        OooOOO0.OooO0o(upperCase, "toUpperCase(...)");
        if (upperCase.equals("VIVO")) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DefaultEstimator");
            c20358OooO00o.OooO0o0("VIVO device detected, using built-in predictor to avoid system MotionPredictor issues.", new Object[0]);
            C24537OooO00o c24537OooO00oOooO00o = C24537OooO00o.OooO00o();
            OooOOO0.OooO0o(c24537OooO00oOooO00o, "getInstance(...)");
            c24542OooO0OO = new C24542OooO0OO(view.getContext(), c24537OooO00oOooO00o.f82995OooO0Oo);
        } else {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o2, "DefaultEstimator", "Using default system MotionEventPredictor for brand: ", upperCase, "."), new Object[0]);
            Context context = view.getContext();
            C24537OooO00o c24537OooO00oOooO00o2 = C24537OooO00o.OooO00o();
            c24542OooO0OO = (Build.VERSION.SDK_INT < 34 || c24537OooO00oOooO00o2.f82993OooO0O0) ? new C24542OooO0OO(context, c24537OooO00oOooO00o2.f82995OooO0Oo) : new C24550OooO00o(context, c24537OooO00oOooO00o2.f82995OooO0Oo);
        }
        this.f111205OooOo = c24542OooO0OO;
    }

    @Override // o0oo0.OooO0o
    public PointF OooO00o(MotionEvent motionEvent) {
        InterfaceC24508OooO00o interfaceC24508OooO00o = this.f111205OooOo;
        interfaceC24508OooO00o.OooO00o(motionEvent);
        MotionEvent motionEventOooO0O0 = interfaceC24508OooO00o.OooO0O0();
        PointF pointF = motionEventOooO0O0 != null ? new PointF(motionEventOooO0O0.getX(), motionEventOooO0O0.getY()) : null;
        if (motionEventOooO0O0 != null) {
            motionEventOooO0O0.recycle();
        }
        if (pointF == null) {
            return null;
        }
        PointF pointF2 = new PointF(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()));
        float f = this.f111206OooOo0o;
        float f2 = 1 - f;
        return new PointF((pointF.x * f) + (pointF2.x * f2), (f * pointF.y) + (f2 * pointF2.y));
    }

    @Override // o0oo0.OooO0o
    public final void OooO0O0(View changedView, int i) {
        OooOOO0.OooO0oO(changedView, "changedView");
    }

    @Override // o0oo0.OooO0o
    public final void OooO0OO(float f) {
        double d = f;
        if (0.0d > d || d > 1.0d) {
            this.f111206OooOo0o = 0.6f;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DefaultEstimator");
            c20358OooO00o.OooO0OO("predictionFactor must be in 0.0f to 1.0f.", new Object[0]);
            return;
        }
        this.f111206OooOo0o = f;
        C34406OooO00o.f123390OooO00o.OooO00o("predictionFactor set to " + f + ".", new Object[0]);
    }

    @Override // o0oo0.OooO0o
    public String getTypeName() {
        return "default";
    }
}
