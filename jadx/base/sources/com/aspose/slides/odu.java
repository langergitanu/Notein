package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class odu {

    /* JADX INFO: renamed from: k4 */
    public final int f47753k4;

    /* JADX INFO: renamed from: kk */
    public int f47754kk;

    /* JADX INFO: renamed from: x1 */
    public int f47755x1;

    public odu(int i) {
        this.f47753k4 = i;
        this.f47755x1 = -1;
        this.f47754kk = -1;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11896dy m68469k4(IGenericEnumerable<odu> iGenericEnumerable, IGenericList<oju> iGenericList) {
        oju ojuVarClone;
        oju ojuVarClone2;
        C11896dy c11896dy = new C11896dy();
        oju ojuVar = oju.f47834kk;
        oju ojuVarClone3 = ojuVar.Clone();
        oju ojuVarClone4 = ojuVar.Clone();
        IGenericEnumerator<odu> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            try {
                odu next = it.next();
                switch (next.f47753k4) {
                    case 0:
                        ojuVarClone = iGenericList.get_Item(next.f47755x1);
                        ojuVarClone.CloneTo(ojuVarClone3);
                        break;
                    case 1:
                        ojuVarClone2 = iGenericList.get_Item(next.f47755x1).Clone();
                        oju ojuVarClone5 = iGenericList.get_Item(next.f47754kk).Clone();
                        oju[] ojuVarArr = {ojuVarClone3};
                        oju[] ojuVarArr2 = {ojuVarClone2};
                        oju[] ojuVarArr3 = {ojuVarClone5};
                        m68471k4(c11896dy, ojuVarArr, ojuVarArr2, ojuVarArr3, ojuVarArr3);
                        ojuVarArr[0].CloneTo(ojuVarClone3);
                        ojuVarArr2[0].CloneTo(ojuVarClone2);
                        ojuVarArr3[0].CloneTo(ojuVarClone5);
                        ojuVarClone5.CloneTo(ojuVarClone3);
                        ojuVarClone2.CloneTo(ojuVarClone4);
                        break;
                    case 2:
                    case 5:
                    case 6:
                        ojuVarClone = iGenericList.get_Item(next.f47755x1).Clone();
                        oju[] ojuVarArr4 = {ojuVarClone3};
                        oju[] ojuVarArr5 = {ojuVarClone};
                        m68470k4(c11896dy, ojuVarArr4, ojuVarArr5);
                        ojuVarArr4[0].CloneTo(ojuVarClone3);
                        ojuVarArr5[0].CloneTo(ojuVarClone);
                        ojuVarClone.CloneTo(ojuVarClone3);
                        break;
                    case 3:
                        ojuVarClone2 = ojuVarClone4.Clone();
                        float f = ojuVarClone2.f47836k4;
                        ojuVarClone2.f47836k4 = OooOO0.OooO0OO.OooO0O0(ojuVarClone3.f47836k4, f, 2.0f, f);
                        float f2 = ojuVarClone2.f47837x1;
                        ojuVarClone2.f47837x1 = OooOO0.OooO0OO.OooO0O0(ojuVarClone3.f47837x1, f2, 2.0f, f2);
                        oju ojuVarClone6 = iGenericList.get_Item(next.f47755x1).Clone();
                        oju[] ojuVarArr6 = {ojuVarClone3};
                        oju[] ojuVarArr7 = {ojuVarClone2};
                        oju[] ojuVarArr8 = {ojuVarClone6};
                        m68471k4(c11896dy, ojuVarArr6, ojuVarArr7, ojuVarArr8, ojuVarArr8);
                        ojuVarArr6[0].CloneTo(ojuVarClone3);
                        ojuVarArr7[0].CloneTo(ojuVarClone2);
                        ojuVarArr8[0].CloneTo(ojuVarClone6);
                        ojuVarClone6.CloneTo(ojuVarClone3);
                        ojuVarClone2.CloneTo(ojuVarClone4);
                        break;
                    case 4:
                        c11896dy.m55567m9();
                        break;
                    default:
                        throw new NotImplementedException();
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return c11896dy;
    }

    public odu(int i, int i2) {
        this.f47753k4 = i;
        this.f47755x1 = i2;
        this.f47754kk = -1;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68470k4(C11896dy c11896dy, oju[] ojuVarArr, oju[] ojuVarArr2) {
        oju ojuVar = ojuVarArr[0];
        C12025x6 c12025x6 = new C12025x6(ojuVar.f47836k4, ojuVar.f47837x1);
        oju ojuVar2 = ojuVarArr2[0];
        c11896dy.m55547k4(c12025x6, new C12025x6(ojuVar2.f47836k4, ojuVar2.f47837x1));
    }

    public odu(int i, int i2, int i3) {
        this.f47753k4 = i;
        this.f47755x1 = i2;
        this.f47754kk = i3;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68471k4(C11896dy c11896dy, oju[] ojuVarArr, oju[] ojuVarArr2, oju[] ojuVarArr3, oju[] ojuVarArr4) {
        oju ojuVar = ojuVarArr[0];
        C12025x6 c12025x6 = new C12025x6(ojuVar.f47836k4, ojuVar.f47837x1);
        oju ojuVar2 = ojuVarArr2[0];
        C12025x6 c12025x62 = new C12025x6(ojuVar2.f47836k4, ojuVar2.f47837x1);
        oju ojuVar3 = ojuVarArr3[0];
        C12025x6 c12025x63 = new C12025x6(ojuVar3.f47836k4, ojuVar3.f47837x1);
        oju ojuVar4 = ojuVarArr4[0];
        c11896dy.m55548k4(c12025x6, c12025x62, c12025x63, new C12025x6(ojuVar4.f47836k4, ojuVar4.f47837x1));
    }
}
