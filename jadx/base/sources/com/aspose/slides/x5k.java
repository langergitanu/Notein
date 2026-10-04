package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class x5k {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<Integer, List<t7u>> f49957k4 = new Dictionary<>();

    /* JADX INFO: renamed from: k4 */
    public final int m73113k4(int i) {
        if (this.f49957k4.containsKey(Integer.valueOf(i))) {
            return this.f49957k4.get_Item(Integer.valueOf(i)).size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m73114k4(ChartDataCell chartDataCell) {
        int index = chartDataCell.getChartDataWorksheet().getIndex();
        if (this.f49957k4.containsKey(Integer.valueOf(index))) {
            List.Enumerator<t7u> it = this.f49957k4.get_Item(Integer.valueOf(index)).iterator();
            while (it.hasNext()) {
                try {
                    t7u next = it.next();
                    if (chartDataCell.m559c5().m72689ks().f3864to == next.f49038k4.m559c5().m72689ks()) {
                        return next.f49041x1;
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
        }
        throw new InvalidDataException(C14113y2.m67402k4("A master formula cell is not found for the cell {0}.", chartDataCell.m561du()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r2.m70981k4(r7.getColumn() + 1, r7.getRow() + 1) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        r3 = r2.f49038k4;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ChartDataCell m73115k4(ChartDataCell chartDataCell, long j) {
        int index = chartDataCell.getChartDataWorksheet().getIndex();
        ChartDataCell chartDataCell2 = null;
        if (!this.f49957k4.containsKey(Integer.valueOf(index))) {
            return null;
        }
        List.Enumerator<t7u> it = this.f49957k4.get_Item(Integer.valueOf(index)).iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    break;
                }
                t7u next = it.next();
                if (next.f49041x1 == j) {
                    break;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return chartDataCell2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73116k4(ChartDataCell chartDataCell, long j, String str) {
        List<t7u> list;
        int index = chartDataCell.getChartDataWorksheet().getIndex();
        if (this.f49957k4.containsKey(Integer.valueOf(index))) {
            list = this.f49957k4.get_Item(Integer.valueOf(index));
        } else {
            List<t7u> list2 = new List<>();
            this.f49957k4.addItem(Integer.valueOf(index), list2);
            list = list2;
        }
        t7u t7uVar = new t7u();
        t7uVar.f49038k4 = chartDataCell;
        t7uVar.f49041x1 = j;
        if (C14113y2.m67359c5(str, C18241k5.f55433h)) {
            int[] iArr = {t7uVar.f49039kk};
            int[] iArr2 = {t7uVar.f49040to};
            int[] iArr3 = {t7uVar.f49036du};
            int[] iArr4 = {t7uVar.f49037h4};
            C13712k4.m63645k4(str, iArr, iArr2, iArr3, iArr4);
            t7uVar.f49039kk = iArr[0];
            t7uVar.f49040to = iArr2[0];
            t7uVar.f49036du = iArr3[0];
            t7uVar.f49037h4 = iArr4[0];
        } else {
            int[] iArr5 = {t7uVar.f49039kk};
            int[] iArr6 = {t7uVar.f49040to};
            C13712k4.m63644k4(str, iArr5, iArr6);
            int i = iArr5[0];
            t7uVar.f49039kk = i;
            int i2 = iArr6[0];
            t7uVar.f49040to = i2;
            t7uVar.f49036du = i;
            t7uVar.f49037h4 = i2;
        }
        list.addItem(t7uVar);
    }
}
