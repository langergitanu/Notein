package com.aspose.words.net.System.Globalization;

import com.aspose.words.ReservedForInternalUse;
import com.aspose.words.internal.zzZP1;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class CultureInfo {
    private zzZP1 zzWQt;

    @ReservedForInternalUse
    public CultureInfo(zzZP1 zzzp1) {
        this.zzWQt = zzzp1;
    }

    public DateTimeFormatInfo getDateTimeFormat() {
        return new DateTimeFormatInfo(this.zzWQt.zzjc());
    }

    public Locale getLocale(CultureInfo cultureInfo) {
        return this.zzWQt.getLocale();
    }

    @ReservedForInternalUse
    public zzZP1 getMsCultureInfo() {
        return this.zzWQt;
    }

    public CultureInfo(String str) {
        this.zzWQt = new zzZP1(str);
    }

    public CultureInfo(String str, boolean z) {
        this.zzWQt = new zzZP1(str);
    }

    public CultureInfo(Locale locale) {
        this.zzWQt = new zzZP1(locale);
    }
}
