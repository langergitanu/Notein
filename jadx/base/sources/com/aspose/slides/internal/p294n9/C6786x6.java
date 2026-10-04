package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.x6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6786x6 extends AbstractC6761ix {
    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: k4 */
    public char mo26756k4() {
        return (char) 0;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: kk */
    public int mo26762kk() {
        return 0;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: x1 */
    public boolean mo26764x1() {
        return false;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: k4 */
    public boolean mo26759k4(char c, char c2, int i) {
        if (!C14117yj.m67514du(c)) {
            throw new ArgumentOutOfRangeException("charUnknownHigh", C6770qm.m26824k4("Valid values are between {0} and {1}, inclusive.", 55296, 56319));
        }
        if (C14117yj.m67512c5(c2)) {
            throw new C6777u4(C6770qm.m26824k4("Unable to translate Unicode character \\\\u{0:X4} at index {1} to specified code page.", Integer.valueOf(C14117yj.m67525k4(c, c2)), Integer.valueOf(i)), c, c2, i);
        }
        throw new ArgumentOutOfRangeException("charUnknownLow", C6770qm.m26824k4("Valid values are between {0} and {1}, inclusive.", 56320, 57343));
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6761ix
    /* JADX INFO: renamed from: k4 */
    public boolean mo26760k4(char c, int i) {
        throw new C6777u4(C6770qm.m26824k4("Unable to translate Unicode character \\\\u{0:X4} at index {1} to specified code page.", Integer.valueOf(c), Integer.valueOf(i)), c, i);
    }
}
