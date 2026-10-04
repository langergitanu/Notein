package com.aspose.slides;

import com.aspose.slides.internal.p151gj.C4329x6;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.w6 */
/* JADX INFO: loaded from: classes3.dex */
class C14725w6 {
    /* JADX INFO: renamed from: k4 */
    public static C4329x6 m72635k4(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? new C4329x6(0, 0) : new C4329x6(1, 0) : new C4329x6(0, -1) : new C4329x6(0, 1) : new C4329x6(-1, 0);
    }

    /* JADX INFO: renamed from: x1 */
    public static C4329x6 m72639x1(int i) {
        switch (i) {
            case 0:
                return new C4329x6(-1, -1);
            case 1:
                return new C4329x6(-1, 1);
            case 2:
                return new C4329x6(1, -1);
            case 3:
                return new C4329x6(1, 1);
            case 4:
                return new C4329x6(-1, 0);
            case 5:
                return new C4329x6(0, 1);
            case 6:
                return new C4329x6(0, -1);
            case 7:
                return new C4329x6(1, 0);
            default:
                return new C4329x6(0, 0);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static oju m72636k4(IShape iShape) {
        IShapeFrame frame = iShape.getFrame();
        return new oju(frame.getX(), frame.getY());
    }

    /* JADX INFO: renamed from: k4 */
    public static oju m72637k4(C12015qq c12015qq) {
        return new oju(c12015qq.m56699x1(), c12015qq.m56697kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static oju m72638k4(C12025x6 c12025x6) {
        return new oju(c12025x6.m56897x1(), c12025x6.m56895kk());
    }
}
