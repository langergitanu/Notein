package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.C7447cx;

/* JADX INFO: loaded from: classes3.dex */
class rzi {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f48736k4 = new C7017h4("strVal", "intVal", "fltVal", "boolVal", "clrVal");

    /* JADX INFO: renamed from: k4 */
    public static Object m70395k4(com.aspose.slides.internal.p332p7.ijy ijyVar) {
        int iM27428k4 = f48736k4.m27428k4(ijyVar.m34176k4().m29539k4());
        if (iM27428k4 == 0) {
            return ((com.aspose.slides.internal.p332p7.bc9) ijyVar.m34176k4().m29542x1()).m28815k4();
        }
        if (iM27428k4 == 1) {
            return Integer.valueOf(((com.aspose.slides.internal.p332p7.ql5) ijyVar.m34176k4().m29542x1()).m39532k4());
        }
        if (iM27428k4 == 2) {
            return Float.valueOf(((com.aspose.slides.internal.p332p7.mox) ijyVar.m34176k4().m29542x1()).m37034k4());
        }
        if (iM27428k4 == 3) {
            return Boolean.valueOf(((com.aspose.slides.internal.p332p7.oy7) ijyVar.m34176k4().m29542x1()).m38528k4());
        }
        if (iM27428k4 != 4) {
            throw new Exception();
        }
        C7447cx c7447cx = (C7447cx) ijyVar.m34176k4().m29542x1();
        ColorFormat colorFormat = new ColorFormat(null);
        C1246ib.m7611k4((IColorFormat) colorFormat, c7447cx);
        return colorFormat;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70396k4(Object obj, com.aspose.slides.internal.p332p7.ijy ijyVar) {
        if (obj instanceof String) {
            ((com.aspose.slides.internal.p332p7.bc9) ijyVar.m34177k4("strVal").m29542x1()).m28816k4((String) obj);
            return;
        }
        if (obj instanceof Integer) {
            ((com.aspose.slides.internal.p332p7.ql5) ijyVar.m34177k4("intVal").m29542x1()).m39533k4(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Float) {
            ((com.aspose.slides.internal.p332p7.mox) ijyVar.m34177k4("fltVal").m29542x1()).m37035k4(((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Boolean) {
            ((com.aspose.slides.internal.p332p7.oy7) ijyVar.m34177k4("boolVal").m29542x1()).m38527k4(((Boolean) obj).booleanValue());
        } else {
            if (!(obj instanceof IColorFormat)) {
                throw new Exception();
            }
            C1246ib.m7612x1((IColorFormat) obj, (C7447cx) ijyVar.m34177k4("clrVal").m29542x1());
        }
    }
}
