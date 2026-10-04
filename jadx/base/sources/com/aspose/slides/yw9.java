package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p077d8.C3073my;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p332p7.AbstractC8917u4;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes3.dex */
class yw9 {
    /* JADX INFO: renamed from: k4 */
    private static float m74118k4(Dictionary<String, String> dictionary, String str) {
        if (dictionary.containsKey(str)) {
            return new C3073my(dictionary.get_Item(str)).m12995jd();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: x1 */
    private static float m74123x1(Dictionary<String, String> dictionary, String str) {
        if (dictionary.containsKey(str)) {
            return new C3073my(dictionary.get_Item(str)).m13004to();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public static ShapeFrame m74119k4(String str) {
        byte b;
        byte b2;
        Dictionary<String, String> dictionaryM74124x1 = m74124x1(str);
        float fM74118k4 = m74118k4(dictionaryM74124x1, "left");
        float fM74118k42 = m74118k4(dictionaryM74124x1, "top");
        float fM74118k43 = m74118k4(dictionaryM74124x1, "width");
        float fM74118k44 = m74118k4(dictionaryM74124x1, "height");
        float fM74123x1 = m74123x1(dictionaryM74124x1, "rotation");
        String[] strArr = {null};
        boolean zTryGetValue = dictionaryM74124x1.tryGetValue("flip", strArr);
        String str2 = strArr[0];
        byte b3 = -1;
        if (zTryGetValue) {
            C3073my c3073my = new C3073my(str2);
            byte b4 = -1;
            while (true) {
                String strM13008x1 = c3073my.m13008x1();
                if ("".equals(strM13008x1)) {
                    break;
                }
                if ("x".equals(strM13008x1)) {
                    b3 = 1;
                } else if ("y".equals(strM13008x1)) {
                    b4 = 1;
                }
            }
            b2 = b4;
            b = b3;
        } else {
            b = -1;
            b2 = -1;
        }
        return new ShapeFrame(fM74118k4, fM74118k42, fM74118k43, fM74118k44, b, b2, fM74123x1);
    }

    /* JADX INFO: renamed from: x1 */
    public static Dictionary<String, String> m74124x1(String str) {
        int i;
        Dictionary<String, String> dictionary = new Dictionary<>();
        int i2 = 0;
        while (i2 < str.length()) {
            while (i2 < str.length() && str.charAt(i2) <= ' ') {
                i2++;
            }
            int i3 = i2;
            while (i3 < str.length() && str.charAt(i3) != ':' && str.charAt(i3) != ';') {
                i3++;
            }
            if (str.charAt(i3) == ';') {
                i = i3 + 1;
            } else {
                int i4 = i3;
                while (i2 < i4 && str.charAt(i4 - 1) <= ' ') {
                    i4--;
                }
                do {
                    i3++;
                    if (i3 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i3) <= ' ');
                int i5 = i3;
                while (i5 < str.length() && str.charAt(i5) != ';') {
                    i5++;
                }
                int i6 = i5;
                while (i3 < i6 && str.charAt(i6 - 1) <= ' ') {
                    i6--;
                }
                if (i2 < i4 && i3 < i6) {
                    dictionary.set_Item(C14113y2.m67368h4(C14113y2.m67443x1(str, i2, i4 - i2)), C14113y2.m67443x1(str, i3, i6 - i3));
                }
                i = i5;
            }
            i2 = i + 1;
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74120k4(IControl iControl, String str) {
        iControl.setFrame(m74119k4(str));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74121k4(IShape iShape, String str) {
        iShape.setRawFrame(m74119k4(str));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74122k4(AbstractC8917u4 abstractC8917u4, IShapeFrame iShapeFrame) {
        C6765kp c6765kp = new C6765kp("position:absolute");
        if (!C14064he.m66715kk(iShapeFrame.getX())) {
            c6765kp.m26796k4(";left:{0}pt", C13850af.m65102k4(iShapeFrame.getX()));
        }
        if (!C14064he.m66715kk(iShapeFrame.getY())) {
            c6765kp.m26796k4(";top:{0}pt", C13850af.m65102k4(iShapeFrame.getY()));
        }
        if (!C14064he.m66715kk(iShapeFrame.getWidth())) {
            c6765kp.m26796k4(";width:{0}pt", C13850af.m65102k4(iShapeFrame.getWidth()));
        }
        if (!C14064he.m66715kk(iShapeFrame.getHeight())) {
            c6765kp.m26796k4(";height:{0}pt", C13850af.m65102k4(iShapeFrame.getHeight()));
        }
        if (!C14064he.m66715kk(iShapeFrame.getRotation()) && iShapeFrame.getRotation() != 0.0f) {
            c6765kp.m26796k4(";rotation:{0}", C13850af.m65102k4(iShapeFrame.getRotation()));
        }
        if (iShapeFrame.getFlipH() == 1 || iShapeFrame.getFlipV() == 1) {
            c6765kp.m26792k4(";flip:");
            if (iShapeFrame.getFlipH() == 1) {
                c6765kp.m26792k4(" x");
            }
            if (iShapeFrame.getFlipV() == 1) {
                c6765kp.m26792k4(" y");
            }
        }
        abstractC8917u4.mo29895kk(c6765kp.toString());
    }
}
