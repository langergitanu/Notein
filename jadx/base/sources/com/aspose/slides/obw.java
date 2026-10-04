package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class obw {
    /* JADX INFO: renamed from: k4 */
    private static String m68435k4(IColumn iColumn) {
        int iM68441x1 = m68441x1(iColumn);
        return iM68441x1 != 1 ? iM68441x1 != 2 ? "-|" : "-:|" : ":-:|";
    }

    /* JADX INFO: renamed from: x1 */
    private static int m68441x1(IColumn iColumn) {
        if (iColumn.size() == 0) {
            return 0;
        }
        boolean[] zArr = new boolean[3];
        IGenericEnumerator<IParagraph> it = iColumn.iterator();
        while (it.hasNext()) {
            try {
                it = it.next().getTextFrame().getParagraphs().iterator();
                while (it.hasNext()) {
                    try {
                        int alignment = it.next().getParagraphFormat().getAlignment();
                        if (alignment == 1) {
                            zArr[0] = true;
                        } else if (alignment != 2) {
                            zArr[2] = true;
                        } else {
                            zArr[1] = true;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (zArr[1] || zArr[2]) {
            return (zArr[0] || zArr[2]) ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m68436k4(IColumnCollection iColumnCollection) {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(C14117yj.m67537ne('|'));
        IGenericEnumerator<IColumn> it = iColumnCollection.iterator();
        while (it.hasNext()) {
            try {
                c6765kp.m26792k4(m68435k4(it.next()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private static String m68437k4(IRow iRow, ls9 ls9Var, String str) {
        C6765kp c6765kp = new C6765kp();
        for (int i = 0; i < iRow.size(); i++) {
            if (i == 0) {
                c6765kp.m26792k4(str);
            }
            if (iRow.get_Item(i).getTextFrame() != null) {
                c6765kp.m26792k4(m68440k4(iRow.get_Item(i).getTextFrame(), ls9Var));
            }
            c6765kp.m26792k4(str);
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m68438k4(ITable iTable, ls9 ls9Var) {
        String strM67537ne = C14117yj.m67537ne('|');
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(m68439k4(iTable, ls9Var, strM67537ne));
        for (int i = 1; i < iTable.getRows().size(); i++) {
            c6765kp.m26792k4(m68437k4(iTable.getRows().get_Item(i), ls9Var, strM67537ne));
            if (i != iTable.getRows().size() - 1) {
                c6765kp.m26792k4(ls9Var.m64566kk());
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private static String m68439k4(ITable iTable, ls9 ls9Var, String str) {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(m68437k4(iTable.getRows().get_Item(0), ls9Var, str));
        String strM68436k4 = m68436k4(iTable.getColumns());
        c6765kp.m26792k4(ls9Var.m64566kk());
        c6765kp.m26792k4(strM68436k4);
        c6765kp.m26792k4(ls9Var.m64566kk());
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private static String m68440k4(ITextFrame iTextFrame, ls9 ls9Var) {
        return ugr.m71684k4(iTextFrame, ls9Var);
    }
}
