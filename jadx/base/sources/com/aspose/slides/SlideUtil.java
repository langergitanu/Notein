package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedDictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class SlideUtil {
    public static void alignShapes(int i, boolean z, IBaseSlide iBaseSlide) {
        int size = iBaseSlide.getShapes().size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = i2;
        }
        m2761k4(i, z, iBaseSlide.getShapes(), iArr);
    }

    public static void findAndReplaceText(IPresentation iPresentation, boolean z, String str, String str2) {
        findAndReplaceText(iPresentation, z, str, str2, null);
    }

    public static IShape findShape(IBaseSlide iBaseSlide, String str) {
        return m2757k4(iBaseSlide.getShapes(), str);
    }

    public static ITextFrame[] getAllTextBoxes(IBaseSlide iBaseSlide) {
        List list = new List();
        m2763k4(iBaseSlide.getShapes(), (List<ITextFrame>) list);
        return (ITextFrame[]) list.toArray(new ITextFrame[0]);
    }

    public static ITextFrame[] getAllTextFrames(IPresentation iPresentation, boolean z) {
        List list = new List();
        if (z) {
            for (int i = 0; i < iPresentation.getMasters().size(); i++) {
                m2763k4(iPresentation.getMasters().get_Item(i).getShapes(), (List<ITextFrame>) list);
            }
        }
        for (int i2 = 0; i2 < iPresentation.getSlides().size(); i2++) {
            m2763k4(iPresentation.getSlides().get_Item(i2).getShapes(), (List<ITextFrame>) list);
        }
        return (ITextFrame[]) list.toArray(new ITextFrame[0]);
    }

    /* JADX INFO: renamed from: k4 */
    private static IShape m2757k4(IShapeCollection iShapeCollection, String str) {
        IShape iShapeM2757k4;
        for (int i = 0; i < iShapeCollection.size(); i++) {
            IShape iShape = iShapeCollection.get_Item(i);
            if (C14113y2.m67366h4(iShape.getAlternativeText(), str) == 0) {
                return iShape;
            }
            if (C7019kk.m27469x1(iShape, GroupShape.class) && (iShapeM2757k4 = m2757k4(((GroupShape) iShape).getShapes(), str)) != null) {
                return iShapeM2757k4;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    private static xjy m2770x1(Presentation presentation, C12380dy c12380dy, IFindResultCallback iFindResultCallback) {
        xjy xjyVar = new xjy(c12380dy);
        for (ITextFrame iTextFrame : getAllTextFrames(presentation, false)) {
            TextFrame textFrame = (TextFrame) iTextFrame;
            textFrame.m2911k4(c12380dy, iFindResultCallback);
            if (textFrame.f3520kk.m70736du() > 0) {
                xjyVar.m73451k4(textFrame);
            }
        }
        return xjyVar;
    }

    public static void alignShapes(int i, boolean z, IBaseSlide iBaseSlide, int[] iArr) {
        m2761k4(i, z, iBaseSlide.getShapes(), iArr);
    }

    public static void findAndReplaceText(IPresentation iPresentation, boolean z, String str, String str2, PortionFormat portionFormat) {
        if (iPresentation == null) {
            throw new ArgumentNullException("presentation");
        }
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentException("String to find can not be null or empty", "find");
        }
        if (str2 == null) {
            throw new ArgumentNullException("replace");
        }
        if (C14113y2.m67363du(str, str2)) {
            throw new ArgumentException("String to find can not be equal to string to find");
        }
        for (ITextFrame iTextFrame : getAllTextFrames(iPresentation, z)) {
            m2764k4(iTextFrame, str, str2, portionFormat);
            iTextFrame.joinPortionsWithSameFormatting();
        }
    }

    public static IShape findShape(IPresentation iPresentation, String str) {
        for (int i = 0; i < iPresentation.getMasters().size(); i++) {
            IShape iShapeFindShape = findShape(iPresentation.getMasters().get_Item(i), str);
            if (iShapeFindShape != null) {
                return iShapeFindShape;
            }
        }
        for (int i2 = 0; i2 < iPresentation.getSlides().size(); i2++) {
            IShape iShapeFindShape2 = findShape(iPresentation.getSlides().get_Item(i2), str);
            if (iShapeFindShape2 != null) {
                return iShapeFindShape2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static xjy m2758k4(Presentation presentation, C12380dy c12380dy, IFindResultCallback iFindResultCallback) {
        if (c12380dy != null) {
            return m2770x1(presentation, c12380dy, iFindResultCallback);
        }
        throw new ArgumentException("Regex to highlight can not be null", "regex");
    }

    public static void alignShapes(int i, boolean z, IGroupShape iGroupShape) {
        int size = iGroupShape.getShapes().size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = i2;
        }
        m2761k4(i, z, iGroupShape.getShapes(), iArr);
    }

    /* JADX INFO: renamed from: k4 */
    private static xjy m2759k4(Presentation presentation, String str, ITextSearchOptions iTextSearchOptions, IFindResultCallback iFindResultCallback) {
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentException("Text to highlight can not be null or empty", "text");
        }
        int i = (iTextSearchOptions == null || iTextSearchOptions.getCaseSensitive()) ? 0 : 66;
        String strM57987kk = new C12380dy("\\-\\[\\]\\{\\}\\(\\)\\*\\+\\?\\.\\,\\\\\\^\\$\\|#\\s").m57987kk(str, "\\$0");
        if (iTextSearchOptions != null && iTextSearchOptions.getWholeWordsOnly()) {
            strM57987kk = C14113y2.m67408k4("\\b", strM57987kk, "\\b");
        }
        return m2770x1(presentation, new C12380dy(strM57987kk, i), iFindResultCallback);
    }

    public static void alignShapes(int i, boolean z, IGroupShape iGroupShape, int[] iArr) {
        m2761k4(i, z, iGroupShape.getShapes(), iArr);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m2760k4(IPresentation iPresentation, int[] iArr) {
        C6765kp c6765kp = new C6765kp();
        for (int i : iArr) {
            for (ITextFrame iTextFrame : getAllTextBoxes(iPresentation.getSlides().get_Item(i - 1))) {
                c6765kp.m26792k4(iTextFrame.getText());
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m2761k4(int i, boolean z, IShapeCollection iShapeCollection, int[] iArr) {
        if (iArr == null) {
            throw new ArgumentNullException("shapeIndexes");
        }
        if (iArr.length == 0) {
            throw new ArgumentException("Indexes of shapes to be aligned should not be empty", "shapeIndexes");
        }
        SortedDictionary sortedDictionary = new SortedDictionary();
        for (int i2 : iArr) {
            if (i2 < 0) {
                throw new ArgumentException("Indexes of shapes to be aligned should be positive", "shapeIndexes");
            }
            if (!sortedDictionary.containsKey(Integer.valueOf(i2))) {
                sortedDictionary.addItem(Integer.valueOf(i2), Integer.valueOf(i2));
            }
        }
        int size = sortedDictionary.size();
        Integer[] numArr = new Integer[size];
        sortedDictionary.getKeys().copyTo(numArr, 0);
        if (numArr[size - 1].intValue() > iShapeCollection.size() - 1) {
            throw new ArgumentException("Indexes of shapes to be aligned should correspond to slide shape indexes", "shapeIndexes");
        }
        List list = new List(sortedDictionary.getKeys().size());
        for (int i3 = 0; i3 < sortedDictionary.getKeys().size(); i3++) {
            list.addItem(iShapeCollection.get_Item(iArr[i3]));
        }
        vx6.m72570k4(i, z, (List<IShape>) list);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m2762k4(IParagraph iParagraph, String str, String str2, PortionFormat portionFormat) {
        if (C14113y2.m67363du(str, str2)) {
            return;
        }
        tnt tntVarM71253k4 = tnt.m71253k4(iParagraph);
        while (tntVarM71253k4.m71262k4(str, str2, portionFormat)) {
        }
        iParagraph.getPortions().clear();
        tntVarM71253k4.m71263x1(iParagraph);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m2763k4(IShapeCollection iShapeCollection, List<ITextFrame> list) {
        IGroupShape userShapes;
        for (int i = 0; i < iShapeCollection.size(); i++) {
            if (C7019kk.m27469x1(iShapeCollection.get_Item(i), IGroupShape.class)) {
                userShapes = (IGroupShape) iShapeCollection.get_Item(i);
            } else {
                IAutoShape iAutoShape = (IAutoShape) C7019kk.m27452k4((Object) iShapeCollection.get_Item(i), IAutoShape.class);
                if (iAutoShape != null) {
                    ITextFrame textFrame = iAutoShape.getTextFrame();
                    if (textFrame != null) {
                        list.addItem(textFrame);
                    }
                } else {
                    ITable iTable = (ITable) C7019kk.m27452k4((Object) iShapeCollection.get_Item(i), ITable.class);
                    if (iTable != null) {
                        for (int i2 = 0; i2 < iTable.getRows().size(); i2++) {
                            for (int i3 = 0; i3 < iTable.getColumns().size(); i3++) {
                                Cell cellMo484k4 = ((Row) iTable.getRows().get_Item(i2)).mo484k4(i3);
                                if (cellMo484k4.getTextFrame() != null) {
                                    list.addItem(cellMo484k4.getTextFrame());
                                }
                            }
                        }
                    } else {
                        IChart iChart = (IChart) C7019kk.m27452k4((Object) iShapeCollection.get_Item(i), IChart.class);
                        if (iChart == null || iChart.getUserShapes() == null) {
                            ISmartArt iSmartArt = (ISmartArt) C7019kk.m27452k4((Object) iShapeCollection.get_Item(i), ISmartArt.class);
                            if (iSmartArt != null) {
                                IGenericEnumerator<ISmartArtNode> it = iSmartArt.getAllNodes().iterator();
                                while (it.hasNext()) {
                                    try {
                                        list.addItem(it.next().getTextFrame());
                                    } finally {
                                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                            it.dispose();
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else {
                            userShapes = iChart.getUserShapes();
                        }
                    }
                }
            }
            m2763k4(userShapes.getShapes(), list);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m2764k4(ITextFrame iTextFrame, String str, String str2, PortionFormat portionFormat) {
        IGenericEnumerator<IParagraph> it = iTextFrame.getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                m2762k4(it.next(), str, str2, portionFormat);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m2765k4(Presentation presentation, C12380dy c12380dy, C12003du c12003du, IFindResultCallback iFindResultCallback) {
        xjy xjyVarM2758k4 = m2758k4(presentation, c12380dy, iFindResultCallback);
        List.Enumerator<TextFrame> it = xjyVarM2758k4.m73452x1().iterator();
        while (it.hasNext()) {
            try {
                it.next().m2912k4(xjyVarM2758k4.m73450k4(), c12003du.Clone());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m2766k4(Presentation presentation, C12380dy c12380dy, String str, IFindResultCallback iFindResultCallback) {
        xjy xjyVarM2758k4 = m2758k4(presentation, c12380dy, iFindResultCallback);
        List.Enumerator<TextFrame> it = xjyVarM2758k4.m73452x1().iterator();
        while (it.hasNext()) {
            try {
                it.next().m2914k4(xjyVarM2758k4.m73450k4(), str);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m2767k4(Presentation presentation, String str, C12003du c12003du, ITextSearchOptions iTextSearchOptions, IFindResultCallback iFindResultCallback) {
        xjy xjyVarM2759k4 = m2759k4(presentation, str, iTextSearchOptions, iFindResultCallback);
        List.Enumerator<TextFrame> it = xjyVarM2759k4.m73452x1().iterator();
        while (it.hasNext()) {
            try {
                it.next().m2912k4(xjyVarM2759k4.m73450k4(), c12003du.Clone());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m2768k4(Presentation presentation, String str, String str2, ITextSearchOptions iTextSearchOptions, IFindResultCallback iFindResultCallback) {
        xjy xjyVarM2759k4 = m2759k4(presentation, str, iTextSearchOptions, iFindResultCallback);
        List.Enumerator<TextFrame> it = xjyVarM2759k4.m73452x1().iterator();
        while (it.hasNext()) {
            try {
                it.next().m2914k4(xjyVarM2759k4.m73450k4(), str2);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static ITextFrame[] m2769k4(IPresentation iPresentation, int[] iArr, boolean z) {
        List list = new List();
        for (int i : iArr) {
            int i2 = i - 1;
            m2763k4(iPresentation.getSlides().get_Item(i2).getShapes(), (List<ITextFrame>) list);
            if (z) {
                m2763k4(iPresentation.getSlides().get_Item(i2).getLayoutSlide().getShapes(), (List<ITextFrame>) list);
                m2763k4(iPresentation.getSlides().get_Item(i2).getLayoutSlide().getMasterSlide().getShapes(), (List<ITextFrame>) list);
            }
        }
        return (ITextFrame[]) list.toArray(new ITextFrame[0]);
    }
}
