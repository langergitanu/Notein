package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.iq */
/* JADX INFO: loaded from: classes3.dex */
final class C13646iq implements IGenericEnumerable<KeyValuePair<String, SortedList<Long, SortedList<String, ChartDataCell>>>> {

    /* JADX INFO: renamed from: du */
    private int f45332du;

    /* JADX INFO: renamed from: dy */
    private int f45333dy;

    /* JADX INFO: renamed from: h4 */
    private int f45334h4;

    /* JADX INFO: renamed from: m9 */
    private int f45337m9;

    /* JADX INFO: renamed from: x1 */
    ChartDataWorksheet f45339x1;

    /* JADX INFO: renamed from: kk */
    SortedList<Long, Boolean> f45336kk = new SortedList<>();

    /* JADX INFO: renamed from: to */
    SortedList<Long, Boolean> f45338to = new SortedList<>();

    /* JADX INFO: renamed from: k4 */
    SortedList<String, SortedList<Long, SortedList<String, ChartDataCell>>> f45335k4 = new SortedList<>();

    public C13646iq(ChartDataWorksheet chartDataWorksheet) {
        this.f45339x1 = chartDataWorksheet;
        m63037m9();
    }

    /* JADX INFO: renamed from: m9 */
    private void m63037m9() {
        m63033k4(Integer.MAX_VALUE);
        m63036kk(Integer.MAX_VALUE);
        m63039x1(Integer.MIN_VALUE);
        m63038to(Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: du */
    public final void m63040du() {
        this.f45335k4.clear();
        m63037m9();
    }

    /* JADX INFO: renamed from: h4 */
    public final int m63041h4() {
        return this.f45335k4.size();
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<KeyValuePair<String, SortedList<Long, SortedList<String, ChartDataCell>>>> iterator() {
        return this.f45335k4.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m63042k4() {
        return this.f45332du;
    }

    /* JADX INFO: renamed from: kk */
    public final int m63048kk() {
        return this.f45337m9;
    }

    /* JADX INFO: renamed from: to */
    public final int m63049to() {
        return this.f45333dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m63050x1() {
        return this.f45334h4;
    }

    /* JADX INFO: renamed from: kk */
    private int m63034kk(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: to */
    private void m63038to(int i) {
        this.f45333dy = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final ChartDataCell m63043k4(int i, int i2) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("row");
        }
        if (i2 >= 0) {
            return m63044k4(m63035kk(i, i2));
        }
        throw new ArgumentOutOfRangeException("column");
    }

    /* JADX INFO: renamed from: x1 */
    public final ChartDataCell m63051x1(int i, int i2) {
        return m63052x1(m63035kk(i, i2));
    }

    /* JADX INFO: renamed from: kk */
    public static String m63035kk(int i, int i2) {
        String strM67407k4;
        int i3 = i2 / 26;
        if (i3 > 26) {
            strM67407k4 = C14113y2.m67407k4(C14117yj.m67537ne("ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(((r0 / 26) - 1) % 26)), Character.valueOf("ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt((i3 - 1) % 26)), Character.valueOf("ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(i2 % 26)));
        } else {
            strM67407k4 = i3 > 0 ? C14113y2.m67407k4(C14117yj.m67537ne("ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(i3 - 1)), Character.valueOf("ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(i2 - (i3 * 26)))) : C14117yj.m67537ne("ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(i2));
        }
        return C14113y2.m67408k4(strM67407k4, C14057f9.m66591x1(i + 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final ChartDataCell m63044k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("cellName");
        }
        if (C14113y2.m67363du(str, C14113y2.f47374k4)) {
            throw new ArgumentException("The argument is empty string.", "cellName");
        }
        int iM63034kk = m63034kk(str);
        if (iM63034kk == -1) {
            throw new ArgumentException("The argument has not correct format.", "cellName");
        }
        String strM67443x1 = C14113y2.m67443x1(str, 0, iM63034kk);
        String strM67422kk = C14113y2.m67422kk(str, iM63034kk);
        long jM27435du = C7019kk.m27435du(Double.valueOf(C14116yg.m67490kk(((double) C14080ne.m67015to(strM67422kk)) / 1000.0d)), 14);
        SortedList[] sortedListArr = {null};
        boolean zTryGetValue = this.f45335k4.tryGetValue(strM67443x1, sortedListArr);
        SortedList sortedList = sortedListArr[0];
        if (!zTryGetValue) {
            return null;
        }
        SortedList[] sortedListArr2 = {null};
        boolean zTryGetValue2 = sortedList.tryGetValue(Long.valueOf(jM27435du), sortedListArr2);
        SortedList sortedList2 = sortedListArr2[0];
        if (!zTryGetValue2) {
            return null;
        }
        ChartDataCell[] chartDataCellArr = {null};
        sortedList2.tryGetValue(strM67422kk, chartDataCellArr);
        return chartDataCellArr[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final ChartDataCell m63052x1(String str) {
        int iM67384k4 = C14113y2.m67384k4(str, new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'});
        String strM67358c5 = C14113y2.m67358c5(C14113y2.m67443x1(str, 0, iM67384k4));
        String strM67422kk = C14113y2.m67422kk(str, iM67384k4);
        long jM27435du = C7019kk.m27435du(Double.valueOf(C14116yg.m67490kk(((double) C14080ne.m67015to(strM67422kk)) / 1000.0d)), 14);
        SortedList[] sortedListArr = {null};
        boolean zTryGetValue = this.f45335k4.tryGetValue(strM67358c5, sortedListArr);
        SortedList sortedList = sortedListArr[0];
        if (zTryGetValue) {
            SortedList[] sortedListArr2 = {null};
            boolean zTryGetValue2 = sortedList.tryGetValue(Long.valueOf(jM27435du), sortedListArr2);
            SortedList sortedList2 = sortedListArr2[0];
            if (zTryGetValue2) {
                ChartDataCell[] chartDataCellArr = {null};
                boolean zTryGetValue3 = sortedList2.tryGetValue(strM67422kk, chartDataCellArr);
                ChartDataCell chartDataCell = chartDataCellArr[0];
                if (zTryGetValue3) {
                    return chartDataCell;
                }
            }
        }
        ChartDataCell chartDataCell2 = new ChartDataCell(this, C14113y2.m67358c5(str));
        m63046k4(chartDataCell2);
        chartDataCell2.f1346k4 = true;
        return chartDataCell2;
    }

    /* JADX INFO: renamed from: kk */
    private void m63036kk(int i) {
        this.f45337m9 = i;
    }

    /* JADX INFO: renamed from: x1 */
    private void m63039x1(int i) {
        this.f45334h4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final IGenericList<ChartDataCell> m63045k4(int i, int i2, int i3, int i4) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("firstRow");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("firstColumn");
        }
        if (i3 < 0) {
            throw new ArgumentOutOfRangeException("lastRow");
        }
        if (i4 < 0) {
            throw new ArgumentOutOfRangeException("lastColumn");
        }
        int iM67507x1 = C14116yg.m67507x1(i, i3);
        int iM67507x12 = C14116yg.m67507x1(i2, i4);
        int iM67483k4 = C14116yg.m67483k4(i, i3);
        int iM67483k42 = C14116yg.m67483k4(i2, i4);
        if (m63042k4() > iM67507x1) {
            iM67507x1 = m63042k4();
        }
        if (m63048kk() > iM67507x12) {
            iM67507x12 = m63048kk();
        }
        if (m63050x1() < iM67483k4) {
            iM67483k4 = m63050x1();
        }
        if (m63049to() < iM67483k42) {
            iM67483k42 = m63049to();
        }
        List list = new List();
        while (iM67507x1 <= iM67483k4) {
            for (int i5 = iM67507x12; i5 <= iM67483k42; i5++) {
                ChartDataCell chartDataCellM63043k4 = m63043k4(iM67507x1, i5);
                if (chartDataCellM63043k4 != null && !chartDataCellM63043k4.m559c5().m72684fa()) {
                    list.addItem(m63051x1(iM67507x1, i5));
                }
            }
            iM67507x1++;
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private void m63033k4(int i) {
        this.f45332du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63046k4(ChartDataCell chartDataCell) {
        int iM63034kk = m63034kk(chartDataCell.m561du());
        String strM67443x1 = C14113y2.m67443x1(chartDataCell.m561du(), 0, iM63034kk);
        String strM67422kk = C14113y2.m67422kk(chartDataCell.m561du(), iM63034kk);
        long jM27435du = C7019kk.m27435du(Double.valueOf(C14116yg.m67490kk(((double) C14080ne.m67015to(strM67422kk)) / 1000.0d)), 14);
        SortedList[] sortedListArr = {null};
        boolean zTryGetValue = this.f45335k4.tryGetValue(strM67443x1, sortedListArr);
        SortedList sortedList = sortedListArr[0];
        if (zTryGetValue) {
            SortedList[] sortedListArr2 = {null};
            boolean zTryGetValue2 = sortedList.tryGetValue(Long.valueOf(jM27435du), sortedListArr2);
            SortedList sortedList2 = sortedListArr2[0];
            if (zTryGetValue2) {
                sortedList2.addItem(strM67422kk, chartDataCell);
            } else {
                SortedList sortedList3 = new SortedList();
                sortedList3.addItem(strM67422kk, chartDataCell);
                sortedList.addItem(Long.valueOf(jM27435du), sortedList3);
            }
        } else {
            SortedList<Long, SortedList<String, ChartDataCell>> sortedList4 = new SortedList<>();
            SortedList<String, ChartDataCell> sortedList5 = new SortedList<>();
            sortedList5.addItem(strM67422kk, chartDataCell);
            sortedList4.addItem(Long.valueOf(jM27435du), sortedList5);
            this.f45335k4.addItem(strM67443x1, sortedList4);
        }
        if (chartDataCell.getRow() < m63042k4()) {
            m63033k4(chartDataCell.getRow());
        }
        if (chartDataCell.getRow() > m63050x1()) {
            m63039x1(chartDataCell.getRow());
        }
        if (chartDataCell.getColumn() < m63048kk()) {
            m63036kk(chartDataCell.getColumn());
        }
        if (chartDataCell.getColumn() > m63049to()) {
            m63038to(chartDataCell.getColumn());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63047k4(dnf dnfVar, List<C0928e6> list) {
        for (dnf dnfVar2 : dnfVar.m5194k4("row", "http://schemas.openxmlformats.org/spreadsheetml/2006/main")) {
            for (dnf dnfVar3 : ((chj) dnfVar2).m5194k4("c", "http://schemas.openxmlformats.org/spreadsheetml/2006/main")) {
                m63046k4(new ChartDataCell(this, (C0900dg) dnfVar3));
            }
        }
    }
}
