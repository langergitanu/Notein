package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.AbstractC14074ks;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.sb */
/* JADX INFO: loaded from: classes3.dex */
class C14442sb {
    /* JADX INFO: renamed from: k4 */
    public static <T> String m70498k4(IFillFormatEffectiveData iFillFormatEffectiveData, TemplateContext<T> templateContext) throws Throwable {
        byte fillType = iFillFormatEffectiveData.getFillType();
        if (fillType == 1) {
            return C14113y2.m67402k4("background-color: {0};", C1126fz.m6356k4(((C14176nc) iFillFormatEffectiveData).m67938m9().Clone()));
        }
        if (fillType == 2) {
            return C14113y2.m67402k4("background: {0};", m70500x1(iFillFormatEffectiveData.getGradientFormat()));
        }
        if (fillType == 3) {
            return C14113y2.m67402k4("background: url('{0}') repeat;", s2v.m70432k4(iFillFormatEffectiveData.getPatternFormat().getPatternStyle(), ((n9i) iFillFormatEffectiveData.getPatternFormat()).m67907x1().Clone(), ((n9i) iFillFormatEffectiveData.getPatternFormat()).m67905kk().Clone()));
        }
        if (fillType != 4) {
            return "";
        }
        IPictureFillFormatEffectiveData pictureFillFormat = iFillFormatEffectiveData.getPictureFillFormat();
        Shape shape = (Shape) C7019kk.m27452k4((Object) templateContext.getObject(), Shape.class);
        if (shape == null || pictureFillFormat.getPictureFillMode() != 0) {
            return C14113y2.m67402k4("background-image: url('{0}');", jgi.m63307k4(iFillFormatEffectiveData.getPictureFillFormat().getPicture().getImage(), templateContext));
        }
        C12009k4 c12009k4M63306k4 = jgi.m63306k4(shape, iFillFormatEffectiveData);
        String strM13412x1 = C3141rv.m13412x1((String) templateContext.getGlobal().get("imagesPath"), C14113y2.m67402k4("tileimage{0}.png", Long.valueOf(shape.getUniqueId())));
        c12009k4M63306k4.m56343x1(strM13412x1);
        return C14113y2.m67402k4("background-image: url('{0}');", alz.m3667k4(strM13412x1, (String) templateContext.getGlobal().get("slidesPath")));
    }

    /* JADX INFO: renamed from: x1 */
    private static String m70500x1(IGradientFormatEffectiveData iGradientFormatEffectiveData) {
        String strM70499k4 = m70499k4(iGradientFormatEffectiveData);
        if (iGradientFormatEffectiveData.getGradientShape() == 0) {
            return C14113y2.m67402k4("linear-gradient({0}deg{1})", Float.valueOf(iGradientFormatEffectiveData.getLinearGradientAngle() + 90.0f), strM70499k4);
        }
        if (iGradientFormatEffectiveData.getGradientShape() != 2) {
            return "";
        }
        int gradientDirection = iGradientFormatEffectiveData.getGradientDirection();
        return C14113y2.m67402k4("radial-gradient(circle at {0}{1})", gradientDirection != 0 ? gradientDirection != 1 ? gradientDirection != 2 ? gradientDirection != 3 ? "center" : "bottom right" : "bottom left" : "top right" : "top left", strM70499k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static String m70499k4(IGradientFormatEffectiveData iGradientFormatEffectiveData) {
        List list = new List();
        IGenericEnumerator<IGradientStopEffectiveData> it = iGradientFormatEffectiveData.getGradientStops().iterator();
        while (it.hasNext()) {
            try {
                list.addItem(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        list.sort(new AbstractC14074ks<IGradientStopEffectiveData>() { // from class: com.aspose.slides.sb.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14074ks
            /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public int mo1193k4(IGradientStopEffectiveData iGradientStopEffectiveData, IGradientStopEffectiveData iGradientStopEffectiveData2) {
                if (iGradientStopEffectiveData.getPosition() - iGradientStopEffectiveData2.getPosition() < 0.0f) {
                    return -1;
                }
                return iGradientStopEffectiveData.getPosition() - iGradientStopEffectiveData2.getPosition() > 0.0f ? 1 : 0;
            }
        });
        List.Enumerator it2 = list.iterator();
        String strM67400k4 = "";
        while (it2.hasNext()) {
            try {
                IGradientStopEffectiveData iGradientStopEffectiveData = (IGradientStopEffectiveData) it2.next();
                strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67402k4(", {0}", C1126fz.m6356k4(((GradientStopEffectiveData) iGradientStopEffectiveData).m1634k4().Clone())));
                if (iGradientStopEffectiveData.getPosition() > 0.0f && iGradientStopEffectiveData.getPosition() < 1.0f) {
                    strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67402k4(" {0}%", Float.valueOf(iGradientStopEffectiveData.getPosition() * 100.0f)));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        return strM67400k4;
    }
}
