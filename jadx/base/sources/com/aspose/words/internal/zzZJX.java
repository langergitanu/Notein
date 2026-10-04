package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes5.dex */
final class zzZJX {
    private int count;
    private Object data;
    private int type;
    private int zzZMI;

    public zzZJX(int i, int i2, int i3, Object obj) {
        if (i2 <= 0 || i2 > 13) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i2, "Unknown data type "));
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("count < 0!");
        }
        this.zzZMI = i;
        this.type = i2;
        this.count = i3;
        this.data = obj;
    }

    public final int getCount() {
        return this.count;
    }

    public final Object getData() {
        return this.data;
    }

    public final int getType() {
        return this.type;
    }

    public final int zze5() {
        return this.zzZMI;
    }
}
