package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7211a4;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class uf9 {
    /* JADX INFO: renamed from: k4 */
    public static void m71682k4(IMathBlock iMathBlock, C7211a4 c7211a4, u8s u8sVar) {
        if (iMathBlock == null) {
            throw new ArgumentNullException("mathBlock");
        }
        if (c7211a4 == null) {
            throw new ArgumentNullException("mathBlockElementData");
        }
        IGenericEnumerator<IMathElement> it = iMathBlock.iterator();
        while (it.hasNext()) {
            try {
                c7211a4.m27927k4(vdg.m72185k4(it.next(), u8sVar));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71683k4(MathBlock mathBlock, C7211a4 c7211a4, gnb gnbVar) {
        if (mathBlock == null) {
            throw new ArgumentNullException("mathBlock");
        }
        if (c7211a4 == null) {
            throw new ArgumentNullException("mathBlockElementData");
        }
        mathBlock.clear();
        List.Enumerator<C7394ca> it = c7211a4.m27926k4().iterator();
        while (it.hasNext()) {
            try {
                vdg.m72186k4(it.next(), mathBlock, gnbVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
