package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.u4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6777u4 extends ArgumentException {

    /* JADX INFO: renamed from: k4 */
    private char f18738k4;

    /* JADX INFO: renamed from: kk */
    private char f18739kk;

    /* JADX INFO: renamed from: to */
    private int f18740to;

    /* JADX INFO: renamed from: x1 */
    private char f18741x1;

    public C6777u4(String str, char c, char c2, int i) {
        super(str);
        if (!C14117yj.m67514du(c)) {
            throw new ArgumentOutOfRangeException("charUnknownHigh", C6770qm.m26824k4("Valid values are between {0} and {1}, inclusive.", 55296, 56319));
        }
        if (!C14117yj.m67512c5(c2)) {
            throw new ArgumentOutOfRangeException("CharUnknownLow", C6770qm.m26824k4("Valid values are between {0} and {1}, inclusive.", 56320, 57343));
        }
        this.f18741x1 = c;
        this.f18739kk = c2;
        this.f18740to = i;
    }

    public C6777u4(String str, char c, int i) {
        super(str);
        this.f18738k4 = c;
        this.f18740to = i;
    }
}
