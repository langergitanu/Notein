package o0oo0OoO;

import android.graphics.Matrix;
import androidx.ink.strokes.OooOOO0;
import androidx.ink.strokes.StrokeInput;
import java.util.Map;
import o000OO00.C24485OoooO;
import o0O0oOo0.C26146OooO00o;
import o0O0oo00.OooO00o;

/* JADX INFO: renamed from: o0oo0OoO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31270OooO0OO implements com.orion.ni_render_engine.impl.ink.OooO0o {
    @Override // com.orion.ni_render_engine.impl.ink.OooO0o
    public final boolean OooO00o(OooOOO0 stroke) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(stroke, "stroke");
        String strOooO00o = stroke.f65486OooO00o.f82632OooO0O0.OooO00o();
        return "notein-ballpoint-v1".equals(strOooO00o) || kotlin.jvm.internal.OooOOO0.OooO0O0(C24485OoooO.OooO0O0().OooO00o(), strOooO00o);
    }

    @Override // com.orion.ni_render_engine.impl.ink.OooO0o
    public final void OooO0O0(C26146OooO00o c26146OooO00o, OooOOO0 stroke, Matrix matrix, Map map) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(stroke, "stroke");
        androidx.ink.strokes.OooO00o oooO00o = stroke.f65488OooO0OO;
        int iOooO0OO = oooO00o.OooO0OO();
        if (iOooO0OO == 0) {
            return;
        }
        StrokeInput strokeInput = new StrokeInput();
        o000OO00.OooO0O0 oooO0O0 = stroke.f65486OooO00o;
        float fOooO0o = oooO0O0.OooO0o();
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[4];
        float f4 = fArr[1];
        OooO00o.C19734OooO00o.OooO00o(c26146OooO00o, oooO0O0.OooO0O0(), fOooO0o * ((((float) Math.sqrt((f2 * f2) + (f * f))) + ((float) Math.sqrt((f4 * f4) + (f3 * f3)))) / 2.0f), 0, 0, false, 24);
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iOooO0OO; i++) {
            oooO00o.OooO0o0(i, strokeInput);
            float[] fArr2 = {strokeInput.f65490OooO00o, strokeInput.f65491OooO0O0};
            matrix.mapPoints(fArr2);
            float f7 = fArr2[0];
            float f8 = fArr2[1];
            if (i == 0) {
                c26146OooO00o.moveTo(f7, f8);
            } else if (i == iOooO0OO - 1) {
                c26146OooO00o.lineTo(f7, f8);
            } else {
                float f9 = 2;
                c26146OooO00o.OooO0O0(f5, f6, (f5 + f7) / f9, (f6 + f8) / f9);
            }
            f5 = f7;
            f6 = f8;
        }
        c26146OooO00o.OooOOOO(1.0f);
    }
}
