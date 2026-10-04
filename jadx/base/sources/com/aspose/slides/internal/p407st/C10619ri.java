package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.ri */
/* JADX INFO: loaded from: classes4.dex */
public class C10619ri {

    /* JADX INFO: renamed from: k4 */
    private C10609qn f37345k4;

    /* JADX INFO: renamed from: x1 */
    private int f37349x1 = 0;

    /* JADX INFO: renamed from: kk */
    private int f37346kk = 0;

    /* JADX INFO: renamed from: to */
    private int f37348to = 16;

    /* JADX INFO: renamed from: du */
    private int f37343du = 16;

    /* JADX INFO: renamed from: h4 */
    private long f37344h4 = 0;

    /* JADX INFO: renamed from: m9 */
    private long f37347m9 = 0;

    public C10619ri(C10609qn c10609qn) {
        this.f37345k4 = c10609qn;
        m51622k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m51623k4(long j) {
        long jM51597ar = this.f37345k4.m51597ar();
        long j2 = j & this.f37344h4 & 4294967295L;
        int i = this.f37343du;
        long j3 = (j2 << (i & 31)) & jM51597ar & 4294967295L;
        if (j3 == 0) {
            return (byte) -1;
        }
        return ((((j3 >> i) & 4294967295L) & this.f37345k4.m51597ar()) & 4294967295L) != 0 ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static C10619ri m51621k4(C10609qn c10609qn, boolean z) {
        if (c10609qn == null) {
            return null;
        }
        if (z) {
            c10609qn = new C10609qn(c10609qn);
        }
        if (c10609qn.m52116up() == 447) {
            return new C10619ri(c10609qn);
        }
        throw new NotImplementedException(C14113y2.m67408k4("No wrapper for ", C14042ak.m66410k4(C10754zm.class, c10609qn.m52116up())));
    }

    /* JADX INFO: renamed from: k4 */
    private void m51622k4() {
        if (this.f37345k4.m52116up() == 447) {
            this.f37349x1 = 7;
            this.f37346kk = 0;
            this.f37348to = 16;
        }
        long j = (1 << (this.f37346kk & 31)) & 4294967295L;
        long j2 = (1 << (this.f37348to & 31)) & 4294967295L;
        this.f37344h4 = 0L;
        this.f37347m9 = 0L;
        for (int i = 0; i < this.f37349x1; i++) {
            this.f37344h4 = (this.f37344h4 | j) & 4294967295L;
            this.f37347m9 = (this.f37347m9 | j2) & 4294967295L;
            j = ((j & 4294967295L) << 1) & 4294967295L;
            j2 = ((j2 & 4294967295L) << 1) & 4294967295L;
        }
        if ((this.f37344h4 & this.f37347m9 & 4294967295L) != 0) {
            throw new ArgumentOutOfRangeException(C14113y2.m67408k4("PropertyWrapper: the flag fields are overlapped for ", C14042ak.m66410k4(C10754zm.class, this.f37345k4.m52116up())));
        }
        this.f37343du = this.f37348to - this.f37346kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51624k4(long j, byte b) {
        long j2 = j & this.f37344h4;
        long j3 = j2 & 4294967295L;
        long j4 = j2 & 4294967295L;
        if (j4 == 0) {
            return;
        }
        long j5 = (j4 << (this.f37343du & 31)) & 4294967295L;
        long jM51597ar = ((((this.f37345k4.m51597ar() | j3) | j5) ^ j3) ^ j5) & 4294967295L;
        if (b != -1) {
            jM51597ar = (j5 | jM51597ar) & 4294967295L;
            if (b == 1) {
                jM51597ar = (jM51597ar | j3) & 4294967295L;
            }
        }
        this.f37345k4.m51598k4(jM51597ar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51625k4(C10609qn c10609qn) {
        if (c10609qn == null) {
            return;
        }
        if (c10609qn.m52116up() != this.f37345k4.m52116up()) {
            throw new ArgumentException(C14113y2.m67408k4("PropertyWrapper: wrong type of source property. Can't override ", C14042ak.m66410k4(C10754zm.class, this.f37345k4.m52116up()), " by ", C14042ak.m66410k4(C10754zm.class, c10609qn.m52116up())));
        }
        long jM51597ar = c10609qn.m51597ar() & this.f37347m9;
        long j = (((jM51597ar & 4294967295L) >> this.f37343du) | (jM51597ar & 4294967295L)) & 4294967295L;
        this.f37345k4.m51598k4(((j & c10609qn.m51597ar()) | (((this.f37345k4.m51597ar() | j) ^ j) & 4294967295L)) & 4294967295L);
    }
}
