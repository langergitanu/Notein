package com.aspose.slides.p559ms.backend.android.System.Drawing;

import android.graphics.Matrix;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to;

/* JADX INFO: renamed from: com.aspose.slides.ms.backend.android.System.Drawing.dy */
/* JADX INFO: loaded from: classes5.dex */
class C14129dy implements AbstractC14124to.du<Matrix> {
    @Override // com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to.du
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C11913yj mo67634k4(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new C11913yj(fArr[0], fArr[3], fArr[1], fArr[4], fArr[2], fArr[5]);
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to.du
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public Matrix mo67635k4(C11913yj c11913yj) {
        Matrix matrix = new Matrix();
        matrix.setValues(new float[]{(float) c11913yj.m55761jd(), (float) c11913yj.m55759fa(), (float) c11913yj.m55791yj(), (float) c11913yj.m55756ck(), (float) c11913yj.m55784up(), (float) c11913yj.m55779ks(), 0.0f, 0.0f, 1.0f});
        return matrix;
    }
}
