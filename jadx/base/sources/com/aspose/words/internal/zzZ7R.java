package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.C22206OooOOo0;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7R extends zzZDB implements zzZDL {
    private int tag;
    private zzZDK zzWI8;

    public zzZ7R(zzZ8C zzz8c) {
        this.zzWI8 = zzz8c;
        this.tag = 4;
    }

    public static zzZ7R zzX9(Object obj) {
        if (obj == null || (obj instanceof zzZ7R)) {
            return (zzZ7R) obj;
        }
        if (obj instanceof zzZCY) {
            zzZCY zzzcy = (zzZCY) obj;
            int iZzXKy = zzzcy.zzXKy();
            switch (iZzXKy) {
                case 0:
                    return new zzZ7R(iZzXKy, zzZD4.zzX(zzzcy, false));
                case 1:
                    return new zzZ7R(iZzXKy, zzZC9.zzV(zzzcy));
                case 2:
                    return new zzZ7R(iZzXKy, zzZC9.zzV(zzzcy));
                case 3:
                    throw new IllegalArgumentException(C21532OooOOo.OooO0OO(iZzXKy, "unknown tag: "));
                case 4:
                    return new zzZ7R(iZzXKy, zzZ8C.zzU(zzzcy));
                case 5:
                    return new zzZ7R(iZzXKy, zzZD4.zzX(zzzcy, false));
                case 6:
                    return new zzZ7R(iZzXKy, zzZC9.zzV(zzzcy));
                case 7:
                    return new zzZ7R(iZzXKy, zzZD9.zzY(zzzcy, false));
                case 8:
                    return new zzZ7R(iZzXKy, zzZDA.zzY(zzzcy));
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "unknown object in getInstance: "));
        }
        try {
            return zzX9(zzZD5.zzXo((byte[]) obj));
        } catch (IOException unused) {
            throw new IllegalArgumentException("unable to parse encoded general name");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.tag);
        stringBuffer.append(": ");
        int i = this.tag;
        if (i == 1 || i == 2) {
            stringBuffer.append(zzZC9.zzYt(this.zzWI8).getString());
        } else if (i == 4) {
            stringBuffer.append(zzZ8C.zzXn(this.zzWI8).toString());
        } else if (i != 6) {
            stringBuffer.append(this.zzWI8.toString());
        }
        return stringBuffer.toString();
    }

    public final zzZDK zzXI1() {
        return this.zzWI8;
    }

    public final int zzXKy() {
        return this.tag;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        int i = this.tag;
        return i == 4 ? new zzZBX(true, i, this.zzWI8) : new zzZBX(false, i, this.zzWI8);
    }

    public zzZ7R(int i, zzZDK zzzdk) {
        this.zzWI8 = zzzdk;
        this.tag = i;
    }

    public zzZ7R(String str) {
        this.tag = 1;
        this.zzWI8 = new zzZC9(str);
    }
}
