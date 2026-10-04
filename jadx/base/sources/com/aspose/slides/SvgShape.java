package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public final class SvgShape implements ISvgShape {

    /* JADX INFO: renamed from: k4 */
    private SortedList<Integer, String> f3482k4 = new SortedList<>();

    /* JADX INFO: renamed from: x1 */
    private String f3483x1;

    @Override // com.aspose.slides.ISvgShape
    public final String getId() {
        return this.f3483x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final IGenericDictionary<Integer, String> m2857k4() {
        return this.f3482k4;
    }

    @Override // com.aspose.slides.ISvgShape
    public final void setEventHandler(int i, String str) {
        if (str != null) {
            this.f3482k4.set_Item(Integer.valueOf(i), str);
        } else {
            this.f3482k4.removeItemByKey(Integer.valueOf(i));
        }
    }

    @Override // com.aspose.slides.ISvgShape
    public final void setId(String str) {
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentNullException("value");
        }
        this.f3483x1 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m2858x1() {
        return !C14113y2.m67411k4(this.f3483x1) || this.f3482k4.size() > 0;
    }
}
