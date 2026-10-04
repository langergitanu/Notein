package o0oo0OoO;

import OooOoOO.C20519OooO0Oo;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.facebook.soloader.OooOo;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.ShapeInfo;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24457OooOOo;
import o000OO00.OooO0O0;
import o000oooo.C24761OooO;
import o0O0o00.C25927OooOo;
import o0O0oOo.AbstractC26133OooOO0o;
import o0O0oo00.OooO00o;
import o0oo0O0o.InterfaceC31224OooO00o;
import o0oo0Oo.AbstractC31239OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32444OooOOO0;
import oO00ooO.C32447OooOOo;
import oo0oOOo.C35004OooO00o;

/* JADX INFO: renamed from: o0oo0OoO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31273OooO0o0<T> extends AbstractC31268OooO00o<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final o0O0oo00.OooO00o<T> f111655OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Bundle f111656OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f111657OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final float f111658OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f111659OooOoOO = 1.0f;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C32447OooOOo f111660OooOoo0 = C20519OooO0Oo.OooO0OO(new C31271OooO0Oo());

    public C31273OooO0o0(float f, int i, Bundle bundle, o0O0oo00.OooO00o oooO00o) {
        this.f111656OooOo0o = bundle;
        this.f111655OooOo = oooO00o;
        this.f111658OooOoO0 = f;
        this.f111657OooOoO = i;
        OooO00o.C19734OooO00o.OooO00o(oooO00o, i, f, 0, 0, false, 24);
    }

    @Override // o0oo0OoO.AbstractC31268OooO00o, o0oo0Oo.AbstractC31239OooO00o
    public final DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> displayItems) {
        OooOOO0.OooO0oO(displayItems, "displayItems");
        throw new C32444OooOOO0("onDrawEvent is not implemented in InkBallPoint");
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0Oo() {
        return this.f111657OooOoO;
    }

    @Override // o0oo0OoO.AbstractC31268OooO00o, o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0o() {
        return this.f111659OooOoOO;
    }

    @Override // o0oo0OoO.AbstractC31268OooO00o, o0oo0Oo.AbstractC31239OooO00o
    public final Bundle OooO0o0() {
        return this.f111656OooOo0o;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0oO() {
        return 103;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0oo() {
        return this.f111658OooOoO0;
    }

    @Override // o0oo0OoO.AbstractC31268OooO00o, o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0(o0O0oo00.OooO0O0<T> target, boolean z) {
        OooOOO0.OooO0oO(target, "target");
        if (!this.f111652OooOo0O || this.f111648OooOOo0 == null) {
            super.OooOO0(target, z);
            return;
        }
        o0O0oo00.OooO00o<T> oooO00o = this.f111655OooOo;
        oooO00o.reset();
        oooO00o.OooOo00(target);
        float f = this.f111658OooOoO0 * this.f111659OooOoOO;
        OooO00o.C19734OooO00o.OooO00o(this.f111655OooOo, this.f111657OooOoO, f, 0, 0, false, 24);
        ShapeInfo shapeInfo = this.f111648OooOOo0;
        if (shapeInfo != null) {
            shapeInfo.setupRenderEngine(oooO00o);
        }
        oooO00o.OooOOOO(this.f111659OooOoOO);
    }

    @Override // o0oo0OoO.AbstractC31268OooO00o, o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0O() {
        this.f111655OooOo.reset();
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0o(float f) {
        this.f111659OooOoOO = f;
    }

    @Override // o0oo0OoO.AbstractC31268OooO00o
    public final o000OO00.OooO0O0 OooOOOo() {
        OooO0O0.OooO00o oooO00o = o000OO00.OooO0O0.f82629OooO0Oo;
        C24457OooOOo c24457OooOOo = (C24457OooOOo) this.f111660OooOoo0.getValue();
        int i = this.f111657OooOoO;
        float f = this.f111658OooOoO0;
        oooO00o.getClass();
        return OooO0O0.OooO00o.OooO00o(c24457OooOOo, i, f, 0.02f);
    }

    @Override // o0oo0OoO.AbstractC31268OooO00o
    public final C31267OooO OooOOo(MotionEvent event, MotionEvent motionEvent) {
        ShapeInfo shapeInfo;
        OooOOO0.OooO0oO(event, "event");
        int actionMasked = event.getActionMasked();
        C31267OooO c31267OooO = C31267OooO.f111642OooO0OO;
        C35004OooO00o c35004OooO00o = this.f111413OooO;
        if (actionMasked == 0) {
            c35004OooO00o.f125706OooO00o.clear();
            this.f111648OooOOo0 = null;
            this.f111652OooOo0O = false;
            this.f111649OooOOoo = SystemClock.uptimeMillis();
            this.f111651OooOo00 = event.getX();
            this.f111650OooOo0 = event.getY();
            Matrix matrix = new Matrix();
            float f = this.f111659OooOoOO;
            matrix.setScale(f, f);
            InterfaceC31224OooO00o.OooO0O0.OooO00o(OooOOo0(), event, OooOOOo(), matrix, null);
            PointF pointF = new PointF(event.getX(), event.getY());
            ArrayList arrayList = c35004OooO00o.f125706OooO00o;
            arrayList.add(pointF);
            c35004OooO00o.f125707OooO0O0 = arrayList;
            return c31267OooO;
        }
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return C31267OooO.f111643OooO0Oo;
                }
                this.f111652OooOo0O = false;
                this.f111648OooOOo0 = null;
                ((C25927OooOo) OooOOo0()).OooO0O0(event);
                return c31267OooO;
            }
            if (!this.f111652OooOo0O) {
                PointF pointF2 = new PointF(event.getX(), event.getY());
                ArrayList arrayList2 = c35004OooO00o.f125706OooO00o;
                arrayList2.add(pointF2);
                c35004OooO00o.f125707OooO0O0 = arrayList2;
                if (AbstractC31239OooO00o.f111412OooOOOO && OooOOoo(event.getX(), event.getY())) {
                    AbstractC26133OooOO0o abstractC26133OooOO0oOooO00o = c35004OooO00o.OooO00o();
                    if (abstractC26133OooOO0oOooO00o != null) {
                        int i = this.f111656OooOo0o.getInt(DrawToolFactory.EXTRA_OPACITY_OF_SHAPE_FILL_COLOR, 0);
                        shapeInfo = new ShapeInfo(C24761OooO.OooO00o("toString(...)"), this.f111657OooOoO, this.f111658OooOoO0, abstractC26133OooOO0oOooO00o.OooO0Oo(), abstractC26133OooOO0oOooO00o.OooO0o(), -1, null, 0L, i == 0 ? 0 : 2, false, i, false, 2752, null);
                    } else {
                        shapeInfo = null;
                    }
                    if (shapeInfo != null) {
                        ((C25927OooOo) OooOOo0()).OooO0O0(event);
                        this.f111652OooOo0O = true;
                        this.f111648OooOOo0 = shapeInfo;
                        this.f111647OooOOo = shapeInfo.getMinDistancePointIndex(new PointF(event.getX(), event.getY()));
                        return new C31267OooO(true, new DrawResult(1, shapeInfo, null, null, null, false, false, null, null, false, null, 2044, null));
                    }
                }
                ((C25927OooOo) OooOOo0()).OooO00o(event, motionEvent);
                return c31267OooO;
            }
            ShapeInfo shapeInfo2 = this.f111648OooOOo0;
            if (shapeInfo2 != null) {
                shapeInfo2.updateAnchorPoint(this.f111647OooOOo, new PointF(event.getX(), event.getY()));
                return new C31267OooO(true, new DrawResult(1, shapeInfo2, null, null, null, false, false, null, null, false, null, 2044, null));
            }
        } else {
            if (!this.f111652OooOo0O) {
                ((C25927OooOo) OooOOo0()).OooO0OO(event);
                return c31267OooO;
            }
            ShapeInfo shapeInfo3 = this.f111648OooOOo0;
            this.f111652OooOo0O = false;
            this.f111648OooOOo0 = null;
            if (shapeInfo3 != null) {
                return new C31267OooO(true, new DrawResult(3, shapeInfo3, OooOo.OooO0oO(shapeInfo3), null, null, false, false, null, null, false, null, 2040, null));
            }
        }
        return c31267OooO;
    }
}
