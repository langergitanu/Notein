package o0oo0OoO;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.orion.ni_render_engine.impl.ink.C22840OooO0Oo;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.InkStrokeInfo;
import com.orion.penkit.models.ShapeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.OooOOO0;
import o000O0oO.C24410OooO0Oo;
import o0O0o00.C25927OooOo;
import o0O0oOOO.C26121OooO0o0;
import o0oo0O0o.InterfaceC31224OooO00o;
import o0oo0Oo.AbstractC31239OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32444OooOOO0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0oo0OoO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31268OooO00o<T> extends AbstractC31239OooO00o<T> {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public InterfaceC31224OooO00o f111646OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f111647OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public ShapeInfo f111648OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f111649OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public float f111650OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f111651OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f111652OooOo0O;

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> displayItems) {
        OooOOO0.OooO0oO(displayItems, "displayItems");
        throw new C32444OooOOO0("onDrawEvent is not implemented in AbstractInkTool");
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public float OooO0o() {
        return 1.0f;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public Bundle OooO0o0() {
        return new Bundle();
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public void OooOO0(o0O0oo00.OooO0O0<T> target, boolean z) {
        OooOOO0.OooO0oO(target, "target");
        InterfaceC31224OooO00o interfaceC31224OooO00o = this.f111646OooOOOo;
        if (interfaceC31224OooO00o == null) {
            return;
        }
        ArrayList<InkStrokeInfo> arrayList = new ArrayList();
        Iterator<Map.Entry<C24410OooO0Oo, InkStrokeInfo>> it = ((C25927OooOo) interfaceC31224OooO00o).f88506OooO0oO.entrySet().iterator();
        while (it.hasNext()) {
            InkStrokeInfo value = it.next().getValue();
            if (value != null) {
                arrayList.add(value);
            }
        }
        if (target instanceof C26121OooO0o0) {
            Canvas canvasOooO0OO = ((C26121OooO0o0) target).OooO0OO();
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((InkStrokeInfo) it2.next()).getStroke());
            }
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            for (InkStrokeInfo inkStrokeInfo : arrayList) {
                Matrix matrix = new Matrix();
                matrix.setConcat(inkStrokeInfo.getWorldToViewTransform(), inkStrokeInfo.getStrokeToWorldTransform());
                arrayList3.add(matrix);
            }
            com.orion.ni_render_engine.impl.ink.OooO00o oooO00o = C22840OooO0Oo.f69449OooO00o;
            o0O0oo00.OooO0OO oooO0OO = o0O0oo00.OooO0OO.f89535OooOo0o;
            if (arrayList2.size() != arrayList3.size()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("InkToolRender");
                c20358OooO00o.OooO0OO("笔画数量与变换矩阵数量不匹配", new Object[0]);
            } else {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    C22840OooO0Oo.OooO0O0(canvasOooO0OO, (androidx.ink.strokes.OooOOO0) arrayList2.get(i), (Matrix) arrayList3.get(i), oooO0OO);
                }
            }
        }
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public void OooOO0O() {
    }

    public Map<String, Float> OooOOOO() {
        return null;
    }

    public abstract o000OO00.OooO0O0 OooOOOo();

    public C31267OooO OooOOo(MotionEvent event, MotionEvent motionEvent) {
        OooOOO0.OooO0oO(event, "event");
        int actionMasked = event.getActionMasked();
        C31267OooO c31267OooO = C31267OooO.f111642OooO0OO;
        if (actionMasked == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(OooO0o(), OooO0o());
            InterfaceC31224OooO00o.OooO0O0.OooO00o(OooOOo0(), event, OooOOOo(), matrix, OooOOOO());
            return c31267OooO;
        }
        if (actionMasked == 1) {
            ((C25927OooOo) OooOOo0()).OooO0OO(event);
            return c31267OooO;
        }
        if (actionMasked == 2) {
            ((C25927OooOo) OooOOo0()).OooO00o(event, motionEvent);
            return c31267OooO;
        }
        if (actionMasked != 3) {
            return C31267OooO.f111643OooO0Oo;
        }
        ((C25927OooOo) OooOOo0()).OooO0O0(event);
        return c31267OooO;
    }

    public final InterfaceC31224OooO00o OooOOo0() {
        InterfaceC31224OooO00o interfaceC31224OooO00o = this.f111646OooOOOo;
        if (interfaceC31224OooO00o != null) {
            return interfaceC31224OooO00o;
        }
        throw new IllegalStateException("InkStrokeController not set");
    }

    public final boolean OooOOoo(float f, float f2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = jUptimeMillis - this.f111649OooOOoo;
        double d = 2;
        float fSqrt = (float) Math.sqrt(((float) Math.pow(f - this.f111651OooOo00, d)) + ((float) Math.pow(f2 - this.f111650OooOo0, d)));
        if (fSqrt < 5.0f && j >= 600) {
            return true;
        }
        if (fSqrt < 5.0f) {
            return false;
        }
        this.f111649OooOOoo = jUptimeMillis;
        this.f111651OooOo00 = f;
        this.f111650OooOo0 = f2;
        return false;
    }
}
