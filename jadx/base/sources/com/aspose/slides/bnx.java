package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p021af.C1369x1;
import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p237ks.C5909to;
import com.aspose.slides.internal.p297ne.C6876k4;
import com.aspose.slides.internal.p297ne.C6877kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p453uz.C11579jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class bnx extends AbstractC14184nj {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<C12804k4, hof> f4223k4;

    /* JADX INFO: renamed from: x1 */
    private final List<C12804k4> f4224x1;

    public bnx(C14247oq c14247oq, C12804k4 c12804k4) {
        super(c14247oq, c12804k4);
        this.f4223k4 = new Dictionary<>();
        this.f4224x1 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    private static float m4275k4(float f) {
        return ((float) C14116yg.m67497to(f / 6.0f)) * 6.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public final Table m4279k4(ShapeCollection shapeCollection) {
        SortedList sortedList = new SortedList();
        SortedList sortedList2 = new SortedList();
        SortedList sortedList3 = new SortedList();
        SortedList sortedList4 = new SortedList();
        Dictionary.Enumerator<C12804k4, hof> it = this.f4223k4.iterator();
        while (it.hasNext()) {
            try {
                C12007ix c12007ixClone = C14915zu.m74817k4(m68059k4().m68752x1().mo8118x1((InterfaceC12769ix) it.next().getKey())).Clone();
                if (!c12007ixClone.m56568kk()) {
                    Float fValueOf = Float.valueOf(m4275k4(c12007ixClone.m56554dy()));
                    Boolean bool = Boolean.TRUE;
                    sortedList.set_Item(fValueOf, bool);
                    sortedList2.set_Item(Float.valueOf(m4275k4(c12007ixClone.m56558k4())), bool);
                    sortedList3.set_Item(Float.valueOf(m4275k4(c12007ixClone.m56571to())), bool);
                    sortedList4.set_Item(Float.valueOf(m4275k4(c12007ixClone.m56556h4())), bool);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (sortedList.size() < 1 || sortedList3.size() < 1) {
            return null;
        }
        int size = sortedList3.size();
        double[] dArr = new double[size];
        int size2 = sortedList.size();
        double[] dArr2 = new double[size2];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Float) sortedList4.getKeys().get_Item(i)).floatValue() - ((Float) sortedList3.getKeys().get_Item(i)).floatValue();
        }
        for (int i2 = 0; i2 < size2; i2++) {
            dArr2[i2] = ((Float) sortedList2.getKeys().get_Item(i2)).floatValue() - ((Float) sortedList.getKeys().get_Item(i2)).floatValue();
        }
        Table table = (Table) shapeCollection.addTable(m68061x1().m56897x1(), m68061x1().m56895kk(), dArr, dArr2);
        table.setStylePreset(3);
        List.Enumerator<C12804k4> it2 = this.f4224x1.iterator();
        while (it2.hasNext()) {
            try {
                C12804k4 next = it2.next();
                C1369x1 c1369x1Mo8118x1 = m68059k4().m68752x1().mo8118x1(next);
                C12007ix c12007ixClone2 = C14915zu.m74817k4(c1369x1Mo8118x1).Clone();
                if (!c12007ixClone2.m56568kk()) {
                    int iIndexOfKey = sortedList3.indexOfKey(Float.valueOf(m4275k4(c12007ixClone2.m56571to())));
                    int iIndexOfKey2 = sortedList4.indexOfKey(Float.valueOf(m4275k4(c12007ixClone2.m56556h4())));
                    int iIndexOfKey3 = sortedList.indexOfKey(Float.valueOf(m4275k4(c12007ixClone2.m56554dy())));
                    int iIndexOfKey4 = sortedList2.indexOfKey(Float.valueOf(m4275k4(c12007ixClone2.m56558k4())));
                    if (iIndexOfKey2 - iIndexOfKey > 0 || iIndexOfKey4 - iIndexOfKey3 > 0) {
                        table.mergeCells(table.get_Item(iIndexOfKey, iIndexOfKey3), table.get_Item(iIndexOfKey2, iIndexOfKey4), false);
                    }
                    Cell cell = (Cell) table.get_Item(iIndexOfKey, iIndexOfKey3);
                    m4276k4(cell, ((C1569kk) c1369x1Mo8118x1.m8125x1()).m8445t6());
                    cell.getTextFrame().getParagraphs().clear();
                    this.f4223k4.get_Item(next).m7258k4().m4001k4((TextFrame) cell.getTextFrame());
                    FontData fontData = new FontData("Times New Roman");
                    IGenericEnumerator<IParagraph> it3 = cell.getTextFrame().getParagraphs().iterator();
                    while (it3.hasNext()) {
                        try {
                            it3.next().getParagraphFormat().getDefaultPortionFormat().setLatinFont(fontData);
                        } catch (Throwable th) {
                            if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                it3.dispose();
                            }
                            throw th;
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                        it3.dispose();
                    }
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        return table;
    }

    /* JADX INFO: renamed from: k4 */
    private void m4276k4(Cell cell, C5909to c5909to) {
        int iM54572dy;
        ((TextFrameFormat) cell.getTextFrame().getTextFrameFormat()).m2953k4(xmh.f50156k4.Clone());
        cell.setMarginLeft(C14915zu.m74816k4(c5909to.m23852sv().m26937to(), (float) cell.getWidth(), 0.0f, 0.0f));
        cell.setMarginTop(C14915zu.m74816k4(c5909to.m23852sv().m26935k4(), (float) cell.getHeight(), 0.0f, 0.0f));
        cell.setMarginRight(C14915zu.m74816k4(c5909to.m23852sv().m26938x1(), (float) cell.getWidth(), 0.0f, 0.0f));
        cell.setMarginBottom(C14915zu.m74816k4(c5909to.m23852sv().m26936kk(), (float) cell.getHeight(), 0.0f, 0.0f));
        if (!c5909to.m23848ri().m54573m9() || (iM54572dy = c5909to.m23848ri().m54572dy()) == 5) {
            cell.getTextFrame().getTextFrameFormat().setAnchoringType((byte) 1);
        } else if (iM54572dy == 6 || iM54572dy == 7) {
            cell.getTextFrame().getTextFrameFormat().setAnchoringType((byte) 2);
        } else {
            cell.getTextFrame().getTextFrameFormat().setAnchoringType((byte) 0);
        }
        if (c5909to.m23847qw() == 2) {
            cell.setAnchorCenter(true);
        }
        m4278k4((LineFormat) cell.getCellFormat().getBorderLeft(), c5909to.m23831jd().m26941k4());
        m4278k4((LineFormat) cell.getCellFormat().getBorderTop(), c5909to.m23831jd().m26942kk());
        m4278k4((LineFormat) cell.getCellFormat().getBorderRight(), c5909to.m23831jd().m26945x1());
        m4278k4((LineFormat) cell.getCellFormat().getBorderBottom(), c5909to.m23831jd().m26944to());
        m4277k4((FillFormat) cell.getCellFormat().getFillFormat(), c5909to.m23818dy());
    }

    /* JADX INFO: renamed from: k4 */
    private void m4277k4(FillFormat fillFormat, C6876k4 c6876k4) {
        String strM64935k4;
        if (!c6876k4.m26916x1().m54602c5() && (strM64935k4 = m68059k4().m68750kk().m64935k4(m68059k4().m68751to(), c6876k4.m26916x1().m54604m9())) != null) {
            AbstractC3150x6 abstractC3150x6M64934k4 = m68059k4().m68750kk().m64934k4(strM64935k4);
            if (abstractC3150x6M64934k4 != null) {
                try {
                    IPPImage iPPImageM1721k4 = ((ImageCollection) m68059k4().m68748h4()).m1721k4(abstractC3150x6M64934k4);
                    fillFormat.setFillType((byte) 4);
                    fillFormat.getPictureFillFormat().setPictureFillMode(0);
                    fillFormat.getPictureFillFormat().getPicture().setImage(iPPImageM1721k4);
                    ((PictureFillFormat) fillFormat.getPictureFillFormat()).m2255m9().m74647k4(new tbp(C14915zu.m74816k4(c6876k4.m26914kk().m54606m9(), 0.0f, 0.0f, 0.0f), C14915zu.m74816k4(c6876k4.m26914kk().m54605dy(), 0.0f, 0.0f, 0.0f)).Clone());
                    ((PictureFillFormat) fillFormat.getPictureFillFormat()).m2255m9().m74646k4(new oju(C14915zu.m74816k4(c6876k4.m26912h4().m54575m9().m54597m9(), 0.0f, 0.0f, 0.0f) / iPPImageM1721k4.getWidth(), C14915zu.m74816k4(c6876k4.m26912h4().m54574dy().m54597m9(), 0.0f, 0.0f, 0.0f) / iPPImageM1721k4.getHeight()).Clone());
                } finally {
                    abstractC3150x6M64934k4.dispose();
                }
            }
            if (abstractC3150x6M64934k4 != null) {
            }
        }
        if (c6876k4.m26913k4().m56504dy()) {
            return;
        }
        fillFormat.setFillType((byte) 1);
        ((ColorFormat) fillFormat.getSolidFillColor()).m1080k4(c6876k4.m26913k4().Clone());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m4278k4(LineFormat lineFormat, C6877kk c6877kk) {
        boolean zM54586m9;
        switch (c6877kk.m26918kk()) {
            case 0:
                break;
            case 1:
                lineFormat.getFillFormat().setFillType((byte) 0);
                break;
            case 2:
                lineFormat.setStyle((byte) 0);
                lineFormat.setDashStyle((byte) 1);
                lineFormat.getFillFormat().setFillType((byte) 1);
                ((ColorFormat) lineFormat.getFillFormat().getSolidFillColor()).m1080k4(c6877kk.m26917k4().Clone());
                zM54586m9 = c6877kk.m26919x1().m54586m9();
                C11579jd c11579jdM26919x1 = c6877kk.m26919x1();
                if (!zM54586m9) {
                    int iM54585dy = c11579jdM26919x1.m54585dy();
                    if (iM54585dy == 0) {
                        lineFormat.setWidth(1.0d);
                        break;
                    } else if (iM54585dy == 1) {
                        lineFormat.setWidth(2.0d);
                        break;
                    } else if (iM54585dy == 2) {
                        lineFormat.setWidth(3.0d);
                        break;
                    }
                } else {
                    lineFormat.setWidth(C14915zu.m74816k4(c11579jdM26919x1.m54584c5(), 0.0f, 0.0f, 0.0f) / 0.75f);
                    break;
                }
                break;
            case 3:
                lineFormat.setStyle((byte) 0);
                lineFormat.setDashStyle((byte) 2);
                lineFormat.getFillFormat().setFillType((byte) 1);
                ((ColorFormat) lineFormat.getFillFormat().getSolidFillColor()).m1080k4(c6877kk.m26917k4().Clone());
                zM54586m9 = c6877kk.m26919x1().m54586m9();
                C11579jd c11579jdM26919x12 = c6877kk.m26919x1();
                if (!zM54586m9) {
                }
                break;
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
                lineFormat.setStyle((byte) 0);
                lineFormat.setDashStyle((byte) 0);
                lineFormat.getFillFormat().setFillType((byte) 1);
                ((ColorFormat) lineFormat.getFillFormat().getSolidFillColor()).m1080k4(c6877kk.m26917k4().Clone());
                zM54586m9 = c6877kk.m26919x1().m54586m9();
                C11579jd c11579jdM26919x122 = c6877kk.m26919x1();
                if (!zM54586m9) {
                }
                break;
            case 5:
                lineFormat.setStyle((byte) 1);
                lineFormat.setDashStyle((byte) 0);
                lineFormat.getFillFormat().setFillType((byte) 1);
                ((ColorFormat) lineFormat.getFillFormat().getSolidFillColor()).m1080k4(c6877kk.m26917k4().Clone());
                zM54586m9 = c6877kk.m26919x1().m54586m9();
                C11579jd c11579jdM26919x1222 = c6877kk.m26919x1();
                if (!zM54586m9) {
                }
                break;
            default:
                lineFormat.getFillFormat().setFillType((byte) 1);
                ((ColorFormat) lineFormat.getFillFormat().getSolidFillColor()).m1080k4(c6877kk.m26917k4().Clone());
                zM54586m9 = c6877kk.m26919x1().m54586m9();
                C11579jd c11579jdM26919x12222 = c6877kk.m26919x1();
                if (!zM54586m9) {
                }
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4280k4(C1369x1 c1369x1, AbstractC10973uz abstractC10973uz, C14915zu c14915zu) {
        C12804k4 c12804k4 = (C12804k4) c1369x1.m8125x1();
        hof[] hofVarArr = {null};
        boolean zTryGetValue = this.f4223k4.tryGetValue(c12804k4, hofVarArr);
        hof hofVar = hofVarArr[0];
        if (!zTryGetValue) {
            hofVar = new hof(c1369x1.m8124kk().Clone(), c12804k4, m68059k4());
            this.f4223k4.addItem(c12804k4, hofVar);
            this.f4224x1.addItem(c12804k4);
        }
        hofVar.m7259k4(abstractC10973uz);
    }
}
