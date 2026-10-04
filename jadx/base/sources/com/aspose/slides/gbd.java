package com.aspose.slides;

import androidx.core.view.InputDeviceCompat;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p077d8.C3046du;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3111yg;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p193iv.C5133k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p356qb.C9816ck;
import com.aspose.slides.internal.p356qb.C9820h4;
import com.aspose.slides.internal.p464vq.C11701ai;
import com.aspose.slides.internal.p464vq.C11705av;
import com.aspose.slides.internal.p464vq.C11712bs;
import com.aspose.slides.internal.p464vq.C11713bu;
import com.aspose.slides.internal.p464vq.C11719ca;
import com.aspose.slides.internal.p464vq.C11745g9;
import com.aspose.slides.internal.p464vq.C11792ou;
import com.aspose.slides.internal.p464vq.C11804ri;
import com.aspose.slides.internal.p464vq.C11805rq;
import com.aspose.slides.internal.p464vq.C11833v0;
import com.aspose.slides.internal.p464vq.C11852xi;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p505xn.C12563k4;
import com.aspose.slides.internal.p541z6.C13452x1;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.firebase.messaging.Constants;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class gbd {

    /* JADX INFO: renamed from: k4 */
    private static final SortedList<String, qdi> f5188k4;

    /* JADX INFO: renamed from: x1 */
    private static final SortedList<C14047bz, String> f5189x1;

    static {
        SortedList<String, qdi> sortedList = new SortedList<>();
        f5188k4 = sortedList;
        SortedList<C14047bz, String> sortedList2 = new SortedList<>();
        f5189x1 = sortedList2;
        sortedList.addItem("excel.sheet.12", new qdi(".xlsx", new C11712bs(), "1", "Microsoft Excel Worksheet"));
        sortedList.addItem("excel.sheet.8", new qdi(".xls", new C11719ca(), "1", "Microsoft Excel 97-2003 Worksheet"));
        sortedList.addItem("excel.chart.8", new qdi(".xls", new C11719ca(), "1", "Microsoft Excel 97-2003  Worksheet"));
        sortedList.addItem("word.document.12", new qdi(".docx", new C11833v0(), "1", "Microsoft Word Document"));
        sortedList.addItem("word.document.8", new qdi(".doc", new C11745g9(), "1", "Microsoft Word 97-2003 Document"));
        sortedList.addItem("powerpoint.show.12", new qdi(".pptx", new C11852xi(), "1", "Microsoft PowerPoint Presentation"));
        sortedList.addItem("powerpoint.showmacroenabled.12", new qdi(".pptm", new C11705av(), "1", "Microsoft PowerPoint Macro-Enabled Presentation"));
        sortedList.addItem("powerpoint.show.8", new qdi(".ppt", new C11792ou(), "1", "Microsoft PowerPoint 97-2003 Presentation"));
        sortedList.addItem("powerpoint.slide.12", new qdi(".sldx", new C11713bu(), "1", "Microsoft PowerPoint Slide"));
        sortedList.addItem("powerpoint.slide.8", new qdi(".ppt", new C11713bu(), "1", "Microsoft PowerPoint Slide"));
        sortedList.addItem("excel.sheetmacroenabled.12", new qdi(".xlsm", new C11804ri(), "1", "Microsoft Excel Macro-Enabled Worksheet"));
        sortedList.addItem("excel.sheetbinarymacroenabled.12", new qdi(".xlsb", new C11701ai(), "1", "Microsoft Excel Binary Worksheet"));
        sortedList.addItem("paint.picture", new qdi(".jpg", new C11805rq(), "0", "Bitmap Image"));
        sortedList.addItem("wordpad.document.1", new qdi(".rtf", new C11805rq(), "0", "WordPad Document"));
        sortedList.addItem("msgraph.chart.8", new qdi(".gra", new C11805rq(), "1", "Microsoft Graph Chart"));
        sortedList.addItem("opendocument.mathdocument.1", new qdi(".binn", new C11805rq(), "1", "OpenDocument Math Document"));
        sortedList.addItem("package", new qdi(".bin", new C11805rq(), "0", "Packager Shell Object"));
        sortedList.addItem("acroexch.document.dc", new qdi(".pdf", new C11805rq(), "0", "Acrobat Document"));
        sortedList.addItem("word.opendocumenttext.12", new qdi(".odt", new C11805rq(), "0", "OpenDocument Text"));
        sortedList.addItem("excel.opendocumentspreadsheet.12", new qdi(".ods", new C11805rq(), "0", "OpenDocument Spreadsheet"));
        sortedList.addItem("powerpoint.opendocumentpresentation.12", new qdi(".odp", new C11805rq(), "0", "OpenDocument Presentation"));
        sortedList.addItem("msphotoed.3", new qdi(".bin", new C11805rq(), "0", "Microsoft Photo Editor Photo"));
        sortedList.addItem("prism10.document", new qdi(".prism", new C11805rq(), "0", "Prism 10 Document"));
        sortedList2.addItem(new C14047bz("{0003000c-0000-0000-c000-000000000046}"), "package");
        sortedList2.addItem(new C14047bz("{f20da720-c02f-11ce-927b-0800095ae340}"), "package");
        sortedList2.addItem(new C14047bz("{b801ca65-a1fc-11d0-85ad-444553540000}"), "acroexch.document.dc");
        sortedList2.addItem(new C14047bz("{f4754c9b-64f5-4b40-8af4-679732ac0607}"), "word.document.12");
        sortedList2.addItem(new C14047bz("{73fddc80-aea9-101a-98a7-00aa00374959}"), "wordpad.document.1");
        sortedList2.addItem(new C14047bz("{0003000a-0000-0000-c000-000000000046}"), "paint.picture");
        sortedList2.addItem(new C14047bz("{00020803-0000-0000-c000-000000000046}"), "msgraph.chart.8");
        sortedList2.addItem(new C14047bz("{64818d11-4f9b-11cf-86ea-00aa00b929e8}"), "powerpoint.slide.8");
        sortedList2.addItem(new C14047bz("{cf4f55f4-8f87-4d47-80bb-5808164bb3f8}"), "powerpoint.show.12");
        sortedList2.addItem(new C14047bz("{00020820-0000-0000-c000-000000000046}"), "excel.sheet.8");
        sortedList2.addItem(new C14047bz("{00020833-0000-0000-c000-000000000046}"), "excel.sheetbinarymacroenabled.12");
        sortedList2.addItem(new C14047bz("{00020830-0000-0000-c000-000000000046}"), "excel.sheet.12");
        sortedList2.addItem(new C14047bz("{64818d10-4f9b-11cf-86ea-00aa00b929e8}"), "powerpoint.show.8");
        sortedList2.addItem(new C14047bz("{00020906-0000-0000-c000-000000000046}"), "word.document.8");
        sortedList2.addItem(new C14047bz("{d2d59cd1-0a6a-4d36-ae20-47817077d57c}"), "opendocument.mathdocument.1");
        sortedList2.addItem(new C14047bz("{10ff84f8-c7e4-43b3-8613-e9cb9c5c442b}"), "prism10.document");
    }

    /* JADX INFO: renamed from: k4 */
    private static ChartDataCell m6465k4(ChartDataWorksheet chartDataWorksheet) {
        IGenericEnumerator<KeyValuePair<String, SortedList<Long, SortedList<String, ChartDataCell>>>> it = chartDataWorksheet.m703x1().iterator();
        ChartDataCell chartDataCell = null;
        while (it.hasNext()) {
            try {
                IGenericEnumerator<SortedList<String, ChartDataCell>> it2 = it.next().getValue().getValues().iterator();
                while (it2.hasNext()) {
                    try {
                        IGenericEnumerator<KeyValuePair<String, ChartDataCell>> it3 = it2.next().iterator();
                        while (it3.hasNext()) {
                            try {
                                KeyValuePair<String, ChartDataCell> next = it3.next();
                                if (next.getValue().getValue() != null) {
                                    chartDataCell = (ChartDataCell) (chartDataCell == null ? next.getValue() : m6469k4(chartDataCell.m561du(), next.getValue().m561du(), chartDataCell, next.getValue()));
                                }
                            } finally {
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            it3.dispose();
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return chartDataCell;
    }

    /* JADX INFO: renamed from: kk */
    private static C9820h4 m6480kk() {
        C3152yj c3152yj = new C3152yj();
        try {
            C3149x1 c3149x1 = new C3149x1(c3152yj);
            try {
                c3149x1.m13455x1(InputDeviceCompat.SOURCE_HDMI);
                c3149x1.m13450k4(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
                c3149x1.dispose();
                C9820h4 c9820h4 = new C9820h4("\u0001Ole");
                c9820h4.m48409k4(c3152yj.toArray());
                return c9820h4;
            } catch (Throwable th) {
                c3149x1.dispose();
                throw th;
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: to */
    private static C9820h4 m6484to() {
        C3152yj c3152yj = new C3152yj();
        try {
            C3149x1 c3149x1 = new C3149x1(c3152yj);
            try {
                c3149x1.m13450k4(new byte[]{1, 0, -2, -1});
                c3149x1.m13450k4(new byte[]{3, 10, 0, 0});
                c3149x1.m13450k4(new byte[]{-1, -1, -1, -1, 12, 0, 3, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70});
                c3149x1.m13455x1(12);
                for (byte b : AbstractC6747ar.m26650yj().mo26677to("OLE Package")) {
                    c3149x1.m13443k4(b);
                }
                c3149x1.m13443k4((byte) 0);
                c3149x1.m13447k4(0L);
                c3149x1.dispose();
                C9820h4 c9820h4 = new C9820h4("\u0001CompObj");
                c9820h4.m48409k4(c3152yj.toArray());
                return c9820h4;
            } catch (Throwable th) {
                c3149x1.dispose();
                throw th;
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static ChartDataWorksheet m6486x1(ChartDataWorkbook chartDataWorkbook) {
        IGenericEnumerator<IChartDataWorksheet> it = chartDataWorkbook.getWorksheets().iterator();
        ChartDataWorksheet chartDataWorksheet = null;
        while (it.hasNext()) {
            try {
                ChartDataWorksheet chartDataWorksheet2 = (ChartDataWorksheet) it.next();
                if (chartDataWorksheet == null || (chartDataWorksheet.m701kk() & 4294967295L) > (4294967295L & chartDataWorksheet2.m701kk())) {
                    chartDataWorksheet = chartDataWorksheet2;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return chartDataWorksheet;
    }

    /* JADX INFO: renamed from: k4 */
    public static SortedList<String, qdi> m6466k4() {
        return f5188k4;
    }

    /* JADX INFO: renamed from: kk */
    private static byte[] m6481kk(ChartDataWorkbook chartDataWorkbook) {
        C3152yj c3152yj = new C3152yj();
        try {
            chartDataWorkbook.m680k4(c3152yj);
            return c3152yj.toArray();
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: to */
    private static C9820h4 m6485to(byte[] bArr, String str) {
        C3152yj c3152yj = new C3152yj();
        try {
            C3149x1 c3149x1 = new C3149x1(c3152yj);
            try {
                String strM67408k4 = C14113y2.m67408k4(m6472k4(bArr), m6466k4().get_Item(C14113y2.m67361du(str)).m69541k4());
                c3149x1.m13455x1(((((((strM67408k4.length() + 7) + strM67408k4.length()) + 9) + strM67408k4.length()) + 5) + bArr.length) - 4);
                c3149x1.m13448k4((short) 2);
                C3085sv.m13081k4(c3149x1, strM67408k4);
                C3085sv.m13081k4(c3149x1, strM67408k4);
                c3149x1.m13443k4((byte) 0);
                c3149x1.m13443k4((byte) 0);
                c3149x1.m13448k4((short) 3);
                c3149x1.m13455x1(strM67408k4.length() + 1);
                C3085sv.m13081k4(c3149x1, strM67408k4);
                c3149x1.m13455x1(bArr.length);
                c3149x1.m13450k4(bArr);
                c3149x1.dispose();
                C9820h4 c9820h4 = new C9820h4("\u0001Ole10Native");
                c9820h4.m48409k4(c3152yj.toArray());
                return c9820h4;
            } catch (Throwable th) {
                c3149x1.dispose();
                throw th;
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static SortedList<C14047bz, String> m6487x1() {
        return f5189x1;
    }

    /* JADX INFO: renamed from: k4 */
    private static C9820h4 m6467k4(String str) {
        qdi qdiVar = m6466k4().get_Item(C14113y2.m67361du(str));
        C3152yj c3152yj = new C3152yj();
        try {
            C3149x1 c3149x1 = new C3149x1(c3152yj);
            try {
                c3149x1.m13450k4(new byte[]{1, 0, -2, -1});
                c3149x1.m13450k4(new byte[]{3, 10, 0, 0});
                c3149x1.m13450k4(new byte[]{-1, -1, -1, -1, 101, -54, 1, -72, -4, -95, -48, 17, -123, -83, 68, 69, 83, 84, 0, 0});
                String strM69540du = qdiVar.m69540du();
                c3149x1.m13455x1(strM69540du.length() + 1);
                for (byte b : AbstractC6747ar.m26650yj().mo26677to(strM69540du)) {
                    c3149x1.m13443k4(b);
                }
                c3149x1.m13443k4((byte) 0);
                c3149x1.m13447k4(0L);
                c3149x1.m13455x1(str.length() + 1);
                for (byte b2 : AbstractC6747ar.m26650yj().mo26677to(str)) {
                    c3149x1.m13443k4(b2);
                }
                c3149x1.m13443k4((byte) 0);
                c3149x1.m13450k4(new byte[]{-12, 57, -78, 113, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
                c3149x1.dispose();
                C9820h4 c9820h4 = new C9820h4("\u0001CompObj");
                c9820h4.m48409k4(c3152yj.toArray());
                return c9820h4;
            } catch (Throwable th) {
                c3149x1.dispose();
                throw th;
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: kk */
    private static byte[] m6482kk(byte[] bArr, String str) {
        C9816ck c9816ck = new C9816ck();
        c9816ck.m48360k4().m48389x1(new C14047bz("{0003000C-0000-0000-C000-000000000046}").m66539k4());
        c9816ck.m48360k4().m48340du(m6484to());
        c9816ck.m48360k4().m48340du(m6485to(bArr, str));
        C3152yj c3152yj = new C3152yj();
        try {
            c9816ck.m48362x1(c3152yj);
            return c3152yj.toArray();
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static C9820h4 m6488x1(byte[] bArr, String str) {
        C3152yj c3152yj = new C3152yj();
        try {
            C3149x1 c3149x1 = new C3149x1(c3152yj);
            try {
                c3149x1.m13450k4(bArr);
                c3149x1.dispose();
                C9820h4 c9820h4 = new C9820h4(str);
                c9820h4.m48409k4(c3152yj.toArray());
                return c9820h4;
            } catch (Throwable th) {
                c3149x1.dispose();
                throw th;
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C9820h4 m6468k4(byte[] bArr, String str) {
        C3152yj c3152yj = new C3152yj();
        try {
            C3149x1 c3149x1 = new C3149x1(c3152yj);
            try {
                c3149x1.m13450k4(new byte[]{-1, -1, -1, -1});
                c3149x1.m13455x1(3);
                c3149x1.m13455x1(4);
                c3149x1.m13455x1(4);
                c3149x1.m13450k4(new byte[]{-1, -1, -1, -1});
                c3149x1.m13455x1(7);
                c3149x1.m13455x1(0);
                C3152yj c3152yjM1714x1 = ImageCollection.m1714x1(C5133k4.m21997k4("OleIconTemplate.wmf"));
                AbstractC12002ck abstractC12002ckM56312k4 = AbstractC12002ck.m56312k4(c3152yjM1714x1);
                c3149x1.m13455x1(abstractC12002ckM56312k4.mo15760yj());
                c3149x1.m13455x1(abstractC12002ckM56312k4.mo15757m9());
                c3149x1.m13455x1((int) c3152yjM1714x1.getLength());
                c3149x1.m13450k4(c3152yjM1714x1.toArray());
                c3149x1.m13450k4(new byte[]{73, 78, 65, 78});
                c3149x1.m13455x1(0);
                c3149x1.dispose();
                C9820h4 c9820h4 = new C9820h4("\u0002OlePres000");
                c9820h4.m48409k4(c3152yj.toArray());
                return c9820h4;
            } catch (Throwable th) {
                c3149x1.dispose();
                throw th;
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: kk */
    private static byte[] m6483kk(byte[] bArr, String str, C14047bz c14047bz) {
        C9816ck c9816ck = new C9816ck();
        c9816ck.m48360k4().m48389x1(c14047bz.m66539k4());
        c9816ck.m48360k4().m48340du(m6480kk());
        c9816ck.m48360k4().m48340du(m6488x1(bArr, "CONTENTS"));
        c9816ck.m48360k4().m48340du(m6467k4(str));
        c9816ck.m48360k4().m48340du(m6468k4(bArr, str));
        C3152yj c3152yj = new C3152yj();
        try {
            c9816ck.m48362x1(c3152yj);
            return c3152yj.toArray();
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m6489x1(byte[] bArr) {
        byte[] bArr2 = {-48, -49, 17, -32, -95, -79, 26, -31};
        if (bArr.length < 24) {
            return false;
        }
        return C12563k4.m58598k4(bArr, bArr2, 8);
    }

    /* JADX INFO: renamed from: k4 */
    private static <T> T m6469k4(String str, String str2, T t, T t2) {
        return (str.length() >= str2.length() && (str2.length() < str.length() || C14113y2.m67360du(str, str2, (short) 4) >= 0)) ? t : t2;
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m6490x1(byte[] bArr, String str, C14047bz c14047bz) {
        C9816ck c9816ck = new C9816ck();
        c9816ck.m48360k4().m48389x1(c14047bz.m66539k4());
        c9816ck.m48360k4().m48340du(m6488x1(bArr, "Package"));
        c9816ck.m48360k4().m48340du(m6467k4(str));
        C3152yj c3152yj = new C3152yj();
        try {
            c9816ck.m48362x1(c3152yj);
            return c3152yj.toArray();
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static String m6470k4(ChartDataCell chartDataCell, com.aspose.slides.internal.p332p7.flt fltVar) {
        if (!C14113y2.m67359c5(fltVar.m31833k4(), chartDataCell.m561du())) {
            throw new InvalidOperationException();
        }
        String[] strArrM67414k4 = C14113y2.m67414k4(fltVar.m31833k4(), ':');
        if (strArrM67414k4.length == 2) {
            return !C14113y2.m67363du(strArrM67414k4[0], chartDataCell.m561du()) ? strArrM67414k4[0] : strArrM67414k4[1];
        }
        throw new InvalidOperationException();
    }

    /* JADX INFO: renamed from: k4 */
    private static String m6471k4(String str, String str2) {
        return (String) m6469k4(str, str2, str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m6472k4(byte[] bArr) {
        C3111yg c3111yg = new C3111yg(bArr);
        if (c3111yg.m13263k4()) {
            return C14113y2.m67402k4("video.{0}", c3111yg.m13264kk());
        }
        C3046du c3046du = new C3046du(bArr);
        return c3046du.m12842kk() ? C14113y2.m67402k4("audio.{0}", c3046du.m12843x1()) : "package.bin";
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6473k4(ChartDataWorkbook chartDataWorkbook, ChartDataWorksheet chartDataWorksheet) {
        String strM44561k4;
        String strM561du;
        ChartDataCell chartDataCellM6465k4 = m6465k4(chartDataWorksheet);
        if (chartDataCellM6465k4 != null) {
            com.aspose.slides.internal.p332p7.flt[] fltVarArr = {null};
            boolean zM6475k4 = m6475k4(chartDataCellM6465k4, chartDataWorksheet, fltVarArr);
            com.aspose.slides.internal.p332p7.flt fltVar = fltVarArr[0];
            if (zM6475k4) {
                strM561du = m6471k4(chartDataCellM6465k4.m561du(), m6470k4(chartDataCellM6465k4, fltVar));
            } else {
                strM561du = chartDataCellM6465k4.m561du();
            }
            strM44561k4 = C14113y2.m67402k4("A1:{0}", strM561du);
        } else if (chartDataWorksheet.m694du().m72466x1() == null) {
            return;
        } else {
            strM44561k4 = chartDataWorksheet.m694du().m72466x1().m44561k4();
        }
        m6474k4(chartDataWorkbook, strM44561k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6474k4(ChartDataWorkbook chartDataWorkbook, String str) {
        if (chartDataWorkbook.m671h4().m70105jd() == null) {
            chartDataWorkbook.m671h4().m70108k4(new com.aspose.slides.internal.p332p7.cs8());
        }
        chartDataWorkbook.m671h4().m70105jd().m29769k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m6475k4(ChartDataCell chartDataCell, ChartDataWorksheet chartDataWorksheet, com.aspose.slides.internal.p332p7.flt[] fltVarArr) {
        fltVarArr[0] = null;
        if (chartDataWorksheet.m694du().m72472yj() == null) {
            return false;
        }
        for (com.aspose.slides.internal.p332p7.flt fltVar : chartDataWorksheet.m694du().m72472yj().m37881k4()) {
            if (C14113y2.m67359c5(fltVar.m31833k4(), chartDataCell.m561du())) {
                fltVarArr[0] = fltVar;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m6476k4(ChartDataWorkbook chartDataWorkbook) {
        return (chartDataWorkbook.m671h4().m70105jd() == null || C14113y2.m67411k4(chartDataWorkbook.m671h4().m70105jd().m29768k4())) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m6477k4(String str, IOleEmbeddedDataInfo iOleEmbeddedDataInfo, C13452x1 c13452x1) {
        String strM67361du = C14113y2.m67361du(iOleEmbeddedDataInfo.getEmbeddedFileExtension());
        String strM67361du2 = C14113y2.m67361du(str);
        if (iOleEmbeddedDataInfo.getEmbeddedFileData() == null) {
            throw new ArgumentNullException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        if (!m6466k4().containsKey(strM67361du2)) {
            strM67361du2 = "package";
        }
        return ("excel.sheet.12".equals(strM67361du2) || "xlsx".equals(strM67361du)) ? m6478k4(iOleEmbeddedDataInfo.getEmbeddedFileData(), c13452x1) : ("acroexch.document.dc".equals(strM67361du2) || "pdf".equals(strM67361du)) ? m6483kk(iOleEmbeddedDataInfo.getEmbeddedFileData(), strM67361du2, new C14047bz("{b801ca65-a1fc-11d0-85ad-444553540000}")) : ("prism10.document".equals(strM67361du2) || "prism".equals(strM67361du)) ? m6483kk(iOleEmbeddedDataInfo.getEmbeddedFileData(), strM67361du2, new C14047bz("{10ff84f8-c7e4-43b3-8613-e9cb9c5c442b}")) : (!"0".equals(f5188k4.get_Item(strM67361du2).m69542kk()) || m6489x1(iOleEmbeddedDataInfo.getEmbeddedFileData())) ? iOleEmbeddedDataInfo.getEmbeddedFileData() : m6482kk(iOleEmbeddedDataInfo.getEmbeddedFileData(), strM67361du2);
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m6478k4(byte[] bArr, C13452x1 c13452x1) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            ChartDataWorkbook chartDataWorkbook = new ChartDataWorkbook(null, c3152yj, c13452x1, InterruptionToken.getNone());
            if (m6476k4(chartDataWorkbook)) {
                return bArr;
            }
            ChartDataWorksheet chartDataWorksheetM6486x1 = m6486x1(chartDataWorkbook);
            if (chartDataWorksheetM6486x1 == null) {
                return bArr;
            }
            m6473k4(chartDataWorkbook, chartDataWorksheetM6486x1);
            return m6481kk(chartDataWorkbook);
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m6479k4(byte[] bArr, String str, C14047bz c14047bz) {
        C9816ck c9816ck = new C9816ck();
        c9816ck.m48360k4().m48389x1(c14047bz.m66539k4());
        c9816ck.m48360k4().m48340du(m6480kk());
        c9816ck.m48360k4().m48340du(m6488x1(bArr, "EmbeddedOdf"));
        c9816ck.m48360k4().m48340du(m6467k4(str));
        C3152yj c3152yj = new C3152yj();
        try {
            c9816ck.m48362x1(c3152yj);
            return c3152yj.toArray();
        } finally {
            c3152yj.dispose();
        }
    }
}
