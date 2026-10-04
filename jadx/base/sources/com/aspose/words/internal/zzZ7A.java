package com.aspose.words.internal;

import com.aspose.slides.C22206OooOOo0;
import java.text.ParseException;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7A extends zzZDB implements zzZDL {
    zzZD5 zzWF3;

    private zzZ7A(zzZD5 zzzd5) {
        if (!(zzzd5 instanceof zzZCW) && !(zzzd5 instanceof zzZDF)) {
            throw new IllegalArgumentException("unknown object passed to Time");
        }
        this.zzWF3 = zzzd5;
    }

    public static zzZ7A zzWV(Object obj) {
        if (obj == null || (obj instanceof zzZ7A)) {
            return (zzZ7A) obj;
        }
        if (obj instanceof zzZCW) {
            return new zzZ7A((zzZCW) obj);
        }
        if (obj instanceof zzZDF) {
            return new zzZ7A((zzZDF) obj);
        }
        throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "unknown object in factory: "));
    }

    public final Date getDate() {
        try {
            zzZD5 zzzd5 = this.zzWF3;
            return zzzd5 instanceof zzZCW ? ((zzZCW) zzzd5).zzXKv() : ((zzZDF) zzzd5).getDate();
        } catch (ParseException e) {
            throw new IllegalStateException("invalid date string: " + e.getMessage());
        }
    }

    public final String toString() {
        return zzXKU();
    }

    public final String zzXKU() {
        zzZD5 zzzd5 = this.zzWF3;
        return zzzd5 instanceof zzZCW ? ((zzZCW) zzzd5).zzXKu() : ((zzZDF) zzzd5).zzXKU();
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return this.zzWF3;
    }
}
