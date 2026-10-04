package com.aspose.slides;

import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14100v4;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class CurrentThreadSettings {
    public static final Locale getLocale() {
        return C11697x1.m55246k4(C11697x1.m55252to());
    }

    public static final void setLocale(String str) {
        if (str == null || "".equals(str)) {
            throw new NullPointerException("LocaleName can't be null or empty");
        }
        C14100v4.m67326k4(new Locale(str));
    }

    public static final void setLocale(Locale locale) {
        if (locale == null) {
            throw new NullPointerException("Locale can't be null");
        }
        C14100v4.m67326k4(locale);
    }
}
