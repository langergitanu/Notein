package com.aspose.words.internal;

import Oooo0oO.o0Oo0oo;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZJY {
    public static zzZJN zzYU(int i, int i2) throws IOException {
        if (i == 32773) {
            return new zzZJF();
        }
        if (i != 32946) {
            switch (i) {
                case 1:
                    return i2 == 2 ? new zzZJJ() : new zzZJH();
                case 2:
                    return new zzZJL();
                case 3:
                    return new zzZJL();
                case 4:
                    return new zzZJL();
                case 5:
                    return new zzZJI();
                case 6:
                    return new zzZJG();
                case 7:
                    return new zzZJK();
                case 8:
                    break;
                default:
                    throw new IOException(o0Oo0oo.OooO0O0(i, "Unsupported compression type (tag number = ", ")!"));
            }
        }
        return new zzZJM();
    }
}
