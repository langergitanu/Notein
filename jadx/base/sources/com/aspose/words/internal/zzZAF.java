package com.aspose.words.internal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZAF extends zzZDB implements zzZDL {
    zzZD5 zzWF3;

    public zzZAF(Date date) {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String str = simpleDateFormat.format(date) + "Z";
        int i = Integer.parseInt(str.substring(0, 4));
        if (i < 1950 || i > 2049) {
            this.zzWF3 = new zzZCB(str);
        } else {
            this.zzWF3 = new zzZBW(str.substring(2));
        }
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return this.zzWF3;
    }
}
