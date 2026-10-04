package o0oo0OoO;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Bundle;
import androidx.ink.strokes.OooOOO0;
import androidx.ink.strokes.StrokeInput;
import com.orion.ni_render_engine.impl.ink.InterfaceC22843OooO0oo;
import com.orion.penkit.models.PressurePoint;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import o0O0oOOO.C26120OooO0Oo;
import o0O0oOOO.C26121OooO0o0;
import o0oo0Oo.AbstractC31239OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0oo0OoO.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31277OooOO0O implements InterfaceC22843OooO0oo {
    public static void OooO0OO(Canvas canvas, OooOOO0 oooOOO0) {
        AbstractC31239OooO00o abstractC31239OooO00oCreateTool = DrawToolFactory.INSTANCE.createTool(12, oooOOO0.f65486OooO00o.OooO0O0(), oooOOO0.f65486OooO00o.OooO0o(), new Bundle(), new C26120OooO0Oo());
        ArrayList<PressurePoint> arrayList = new ArrayList();
        androidx.ink.strokes.OooO00o oooO00o = oooOOO0.f65488OooO0OO;
        int iOooO0OO = oooO00o.OooO0OO();
        StrokeInput strokeInput = new StrokeInput();
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= iOooO0OO) {
                break;
            }
            oooO00o.OooO0o0(i, strokeInput);
            if (i == 0) {
                i2 = 0;
            } else if (i != iOooO0OO - 1) {
                i2 = 2;
            }
            arrayList.add(new PressurePoint(strokeInput.f65490OooO00o, strokeInput.f65491OooO0O0, strokeInput.f65494OooO0o, i2));
            i++;
        }
        for (PressurePoint pressurePoint : arrayList) {
            abstractC31239OooO00oCreateTool.OooO(pressurePoint.getX(), pressurePoint.getY(), pressurePoint.getP(), pressurePoint.getAction(), C34434OooOoO.f123453OooOo0o);
            if (pressurePoint.getAction() == 1) {
                abstractC31239OooO00oCreateTool.OooOO0(new C26121OooO0o0(canvas, null), false);
            }
        }
    }

    @Override // com.orion.ni_render_engine.impl.ink.InterfaceC22843OooO0oo
    public final boolean OooO00o(OooOOO0 stroke) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(stroke, "stroke");
        return "notein-rainbow-v1".equals(stroke.f65486OooO00o.f82632OooO0O0.OooO00o());
    }

    @Override // com.orion.ni_render_engine.impl.ink.InterfaceC22843OooO0oo
    public final boolean OooO0O0(Canvas canvas, OooOOO0 stroke, Matrix transform) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        kotlin.jvm.internal.OooOOO0.OooO0oO(stroke, "stroke");
        kotlin.jvm.internal.OooOOO0.OooO0oO(transform, "transform");
        try {
            OooO0OO(canvas, stroke);
            return true;
        } catch (Exception e) {
            C34406OooO00o.f123390OooO00o.OooO0Oo(e, "Notein渲染失败", new Object[0]);
            return false;
        }
    }
}
