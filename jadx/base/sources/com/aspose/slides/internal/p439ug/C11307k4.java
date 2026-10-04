package com.aspose.slides.internal.p439ug;

import com.aspose.slides.internal.p448ur.C11549k4;
import com.aspose.slides.internal.p550zi.C13601ix;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ug.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11307k4 {

    /* JADX INFO: renamed from: k4 */
    private final C13601ix f38894k4;

    /* JADX INFO: renamed from: kk */
    private byte f38895kk;

    /* JADX INFO: renamed from: to */
    private int f38896to;

    /* JADX INFO: renamed from: x1 */
    private byte f38897x1;

    private C11307k4(byte b, byte b2, int i, C13601ix c13601ix) {
        C13601ix c13601ix2 = new C13601ix();
        this.f38894k4 = c13601ix2;
        this.f38897x1 = b;
        this.f38895kk = b2;
        this.f38896to = i;
        c13601ix.CloneTo(c13601ix2);
    }

    /* JADX INFO: renamed from: k4 */
    public static C11307k4 m54308k4() {
        C13601ix c13601ix = new C13601ix();
        c13601ix.f45161k4 = true;
        c13601ix.f45162x1 = null;
        return new C11307k4((byte) 12, (byte) 0, 0, c13601ix.Clone());
    }

    /* JADX INFO: renamed from: kk */
    public byte m54310kk() {
        return this.f38895kk;
    }

    /* JADX INFO: renamed from: to */
    public int m54311to() {
        return this.f38896to;
    }

    public String toString() {
        return C14113y2.m67407k4(C14042ak.m66410k4(C11549k4.class, this.f38897x1), Integer.valueOf(this.f38896to));
    }

    /* JADX INFO: renamed from: x1 */
    public byte m54312x1() {
        return this.f38897x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11307k4 m54309k4(int[] iArr, int i) {
        int i2 = i * 3;
        byte b = (byte) iArr[i2];
        byte b2 = (byte) iArr[i2 + 1];
        int i3 = iArr[i2 + 2];
        C13601ix c13601ix = new C13601ix();
        c13601ix.f45161k4 = true;
        return new C11307k4(b, b2, i3, c13601ix.Clone());
    }
}
