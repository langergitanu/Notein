package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public final class Storage {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<String, Object> f3460k4 = new Dictionary<>();

    public final boolean containsKey(String str) {
        return this.f3460k4.containsKey(str);
    }

    public final <TValue> TValue get(String str) {
        if (this.f3460k4.containsKey(str)) {
            return (TValue) this.f3460k4.get_Item(str);
        }
        throw new InvalidOperationException(C14113y2.m67402k4("{0} not found", str));
    }

    public final <TValue> void put(String str, TValue tvalue) {
        this.f3460k4.set_Item(str, tvalue);
    }
}
