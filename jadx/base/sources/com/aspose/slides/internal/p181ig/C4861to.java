package com.aspose.slides.internal.p181ig;

import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.ig.to */
/* JADX INFO: loaded from: classes.dex */
public class C4861to extends AbstractC4830gf {

    /* JADX INFO: renamed from: k4 */
    private final String f13475k4;

    public C4861to(char c) {
        super(2);
        this.f13475k4 = C14113y2.m67389k4(c, 1);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m20143k4() {
        return this.f13475k4;
    }

    @Override // com.aspose.slides.internal.p181ig.AbstractC4830gf
    public String toString() {
        return m20143k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m20145x1() {
        for (int i = 0; i < this.f13475k4.length(); i++) {
            char cCharAt = this.f13475k4.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return false;
            }
        }
        return true;
    }

    public C4861to(String str) {
        super(2);
        this.f13475k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m20144k4(char c) {
        return this.f13475k4.length() == 1 && C14117yj.m67547x1(this.f13475k4.charAt(0), c);
    }
}
