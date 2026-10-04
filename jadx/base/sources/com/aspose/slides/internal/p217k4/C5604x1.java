package com.aspose.slides.internal.p217k4;

import java.io.IOException;
import java.io.Reader;

/* JADX INFO: renamed from: com.aspose.slides.internal.k4.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C5604x1 extends C5589kk {
    /* JADX INFO: renamed from: k4 */
    public void m22994k4(Reader reader, int i, int i2) throws IOException {
        int i3;
        if (reader == null) {
            return;
        }
        if (i <= 0) {
            i = 1024;
        }
        if (i2 <= 0) {
            i2 = 1024;
        }
        try {
            this.f15404k4 = new char[i];
            int i4 = 0;
            do {
                int i5 = i4 + i2;
                char[] cArr = this.f15404k4;
                if (i5 > cArr.length) {
                    char[] cArr2 = new char[cArr.length * 2];
                    System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                    this.f15404k4 = cArr2;
                }
                i3 = reader.read(this.f15404k4, i4, i2);
                i4 += i3;
            } while (i3 != -1);
            this.f15408x1 = i4 + 1;
            reader.close();
        } catch (Throwable th) {
            reader.close();
            throw th;
        }
    }
}
