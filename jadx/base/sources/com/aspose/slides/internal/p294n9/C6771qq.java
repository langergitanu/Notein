package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.qq */
/* JADX INFO: loaded from: classes4.dex */
public final class C6771qq extends AbstractC6761ix {

    /* JADX INFO: renamed from: dy */
    private String f18706dy;

    /* JADX INFO: renamed from: c5 */
    private int f18705c5 = -1;

    /* JADX INFO: renamed from: jd */
    private int f18707jd = -1;

    public C6771qq(C6782wl c6782wl) {
        this.f18706dy = C14113y2.m67408k4(c6782wl.m26843du(), c6782wl.m26843du());
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: k4 */
    public char mo26756k4() {
        int i = this.f18705c5 - 1;
        this.f18705c5 = i;
        int i2 = this.f18707jd + 1;
        this.f18707jd = i2;
        if (i < 0) {
            return (char) 0;
        }
        if (i != Integer.MAX_VALUE) {
            return this.f18706dy.charAt(i2);
        }
        this.f18705c5 = -1;
        return (char) 0;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: kk */
    public int mo26762kk() {
        int i = this.f18705c5;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: to */
    public void mo26763to() {
        this.f18705c5 = -1;
        this.f18707jd = 0;
        this.f18670k4 = 0;
        this.f18669h4 = false;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: x1 */
    public boolean mo26764x1() {
        int i;
        int i2 = this.f18705c5;
        if (i2 < -1 || (i = this.f18707jd) < 0) {
            return false;
        }
        this.f18707jd = i - 1;
        this.f18705c5 = i2 + 1;
        return true;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: k4 */
    public boolean mo26759k4(char c, char c2, int i) {
        if (!C14117yj.m67514du(c)) {
            throw new ArgumentOutOfRangeException("charUnknownHigh", C6770qm.m26824k4("Valid values are between {0} and {1}, inclusive.", 55296, 56319));
        }
        if (!C14117yj.m67512c5(c2)) {
            throw new ArgumentOutOfRangeException("charUnknownLow", C6770qm.m26824k4("Valid values are between {0} and {1}, inclusive.", 56320, 57343));
        }
        if (this.f18705c5 >= 1) {
            m26757k4(C14117yj.m67525k4(c, c2));
        }
        int length = this.f18706dy.length();
        this.f18705c5 = length;
        this.f18707jd = -1;
        return length != 0;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: k4 */
    public boolean mo26760k4(char c, int i) {
        if (this.f18705c5 >= 1) {
            if (C14117yj.m67514du(c) && this.f18705c5 >= 0 && C14117yj.m67512c5(this.f18706dy.charAt(this.f18707jd + 1))) {
                m26757k4(C14117yj.m67525k4(c, this.f18706dy.charAt(this.f18707jd + 1)));
            }
            m26757k4(c);
        }
        int length = this.f18706dy.length() / 2;
        this.f18705c5 = length;
        this.f18707jd = -1;
        return length != 0;
    }
}
