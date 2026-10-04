package com.huawei.hms.common.size;

import android.os.Bundle;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.network.embedded.C18358t1;

/* JADX INFO: loaded from: classes6.dex */
public class Size {
    private final int height;
    private final int width;

    public Size(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public static Size parseSize(String str) {
        try {
            int iIndexOf = str.indexOf("x");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(C18358t1.g.f56183c);
            }
            return new Size(Integer.parseInt(str.substring(0, iIndexOf)), Integer.parseInt(str.substring(iIndexOf + 1)));
        } catch (Exception unused) {
            throw new IllegalArgumentException("Size parses failed");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.width == size.width && this.height == size.height) {
                return true;
            }
        }
        return false;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(getWidth()), Integer.valueOf(getHeight()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String, void] */
    /* JADX WARN: Type inference failed for: r1v0, types: [byte[], int] */
    public final String toString() {
        return Bundle.putByteArray(this.width, this.height);
    }
}
