package com.aspose.slides.internal.p127fb;

import com.aspose.slides.exceptions.AccessViolationException;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p175i1.AbstractC4786k4;
import com.aspose.slides.internal.p175i1.AbstractC4790x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14112xw;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.aspose.slides.internal.fb.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C3914k4 {
    /* JADX INFO: renamed from: k4 */
    public static int m15612k4(C14112xw c14112xw, int i) {
        if (c14112xw == null || c14112xw.m67356kk() == null) {
            throw new ArgumentNullException();
        }
        int[] iArr = new int[1];
        m15617k4(c14112xw, c14112xw.m67356kk().m19851kk() + i, iArr, 4, 0, 1);
        return iArr[0];
    }

    /* JADX INFO: renamed from: x1 */
    private static void m15623x1(int i, int i2, int i3, AbstractC4786k4 abstractC4786k4, AbstractC4790x1 abstractC4790x1, int i4, int i5) {
        if (i3 < 0) {
            throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
        }
        int i6 = i4 - i3;
        if (i > i6) {
            throw new ArgumentOutOfRangeException("Source array was not long enough");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("destinationStartIndex", "Non-negative number required.");
        }
        if (i2 > i5 - i3) {
            throw new ArgumentOutOfRangeException("Destination array was not long enough");
        }
        if (abstractC4786k4.m19851kk() > abstractC4790x1.mo19843m9() * i6) {
            throw new ArgumentOutOfRangeException("Source array was not long enough");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C14112xw m15613k4(int i) {
        if (i > 0) {
            return new C14112xw(AbstractC4786k4.m19846k4(new byte[i]));
        }
        throw new ArgumentOutOfRangeException("cb", "Non-negative number required.");
    }

    /* JADX INFO: renamed from: x1 */
    public static void m15624x1(C14112xw c14112xw, int i) {
        if (c14112xw == null || c14112xw.m67356kk() == null) {
            throw new ArgumentNullException();
        }
        m15620k4(new int[]{i}, 4, 0, c14112xw, c14112xw.m67356kk().m19851kk(), 1);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m15614k4(int i, int i2, int i3, AbstractC4786k4 abstractC4786k4, AbstractC4790x1 abstractC4790x1, int i4, int i5) {
        if (i3 < 0) {
            throw new ArgumentOutOfRangeException("length", "Non-negative number required.");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("sourceStartIndex", "Non-negative number required.");
        }
        if (i > i4 - i3) {
            throw new ArgumentOutOfRangeException("Source array was not long enough");
        }
        int i6 = i5 - i3;
        if (i2 > i6) {
            throw new AccessViolationException("Source array was not long enough");
        }
        if (abstractC4786k4.m19851kk() > abstractC4790x1.mo19843m9() * i6) {
            throw new ArgumentOutOfRangeException("Destination array was not long enough");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m15615k4(C14112xw c14112xw) {
        c14112xw.m67356kk().m19849h4();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m15616k4(C14112xw c14112xw, int i, int i2) {
        if (c14112xw == null || c14112xw.m67356kk() == null) {
            throw new ArgumentNullException();
        }
        m15620k4(new int[]{i2}, 4, 0, c14112xw, c14112xw.m67356kk().m19851kk() + i, 1);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m15617k4(C14112xw c14112xw, int i, Object obj, int i2, int i3, int i4) {
        if (c14112xw == null || c14112xw.m67355k4()) {
            throw new ArgumentNullException("Destination cannot be null");
        }
        if (obj == null) {
            throw new ArgumentNullException("Source cannot be null");
        }
        AbstractC4786k4 abstractC4786k4M67356kk = c14112xw.m67356kk();
        if (!(abstractC4786k4M67356kk instanceof AbstractC4790x1)) {
            throw new ArgumentException("invalid type of source", "source");
        }
        AbstractC4790x1 abstractC4790x1 = (AbstractC4790x1) abstractC4786k4M67356kk;
        if ((abstractC4786k4M67356kk.m19850k4() instanceof byte[]) && (obj instanceof int[])) {
            byte[] bArr = (byte[]) abstractC4786k4M67356kk.m19850k4();
            int[] iArr = (int[]) obj;
            m15623x1(i, i3, i4, abstractC4786k4M67356kk, abstractC4790x1, bArr.length, iArr.length);
            ByteBuffer.wrap(bArr, i, i4 * 4).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer().get(iArr);
            return;
        }
        AbstractC14092to abstractC14092toM67208k4 = AbstractC14092to.m67208k4(abstractC4786k4M67356kk.m19850k4());
        AbstractC14092to abstractC14092toM67208k42 = AbstractC14092to.m67208k4(obj);
        m15623x1(i, i3, i4, abstractC4786k4M67356kk, abstractC4790x1, abstractC14092toM67208k4.m67265du(), abstractC14092toM67208k42.m67265du());
        try {
            C14058fa.m66593k4(abstractC14092toM67208k4, i, abstractC14092toM67208k42, i3 * i2, i4 * i2);
        } catch (ArgumentException unused) {
            throw new AccessViolationException("Cannot read. Address inaccessible");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m15618k4(C14112xw c14112xw, byte[] bArr, int i, int i2) {
        if (c14112xw == null || c14112xw.m67356kk() == null) {
            throw new ArgumentNullException();
        }
        m15617k4(c14112xw, c14112xw.m67356kk().m19851kk(), bArr, 1, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m15619k4(C14112xw c14112xw, int[] iArr, int i, int i2) {
        if (c14112xw == null || c14112xw.m67356kk() == null) {
            throw new ArgumentNullException();
        }
        m15617k4(c14112xw, c14112xw.m67356kk().m19851kk(), iArr, 4, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m15620k4(Object obj, int i, int i2, C14112xw c14112xw, int i3, int i4) {
        if (c14112xw == null || c14112xw.m67355k4()) {
            throw new ArgumentNullException("Destination cannot be null");
        }
        if (obj == null) {
            throw new ArgumentNullException("Source cannot be null");
        }
        AbstractC4786k4 abstractC4786k4M67356kk = c14112xw.m67356kk();
        if (!(abstractC4786k4M67356kk instanceof AbstractC4790x1)) {
            throw new ArgumentException("invalid type of destination", FirebaseAnalytics.Param.DESTINATION);
        }
        AbstractC4790x1 abstractC4790x1 = (AbstractC4790x1) abstractC4786k4M67356kk;
        if ((abstractC4790x1.m19850k4() instanceof byte[]) && (obj instanceof int[])) {
            int[] iArr = (int[]) obj;
            byte[] bArr = (byte[]) abstractC4790x1.m19850k4();
            m15614k4(i2, i3, i4, abstractC4786k4M67356kk, abstractC4790x1, iArr.length, bArr.length);
            ByteBuffer.wrap(bArr, i3, i4 * i).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer().put(iArr, i2, i4);
            return;
        }
        AbstractC14092to abstractC14092toM67208k4 = AbstractC14092to.m67208k4(obj);
        AbstractC14092to abstractC14092toM67208k42 = AbstractC14092to.m67208k4(abstractC4786k4M67356kk.m19850k4());
        m15614k4(i2, i3, i4, abstractC4786k4M67356kk, abstractC4790x1, abstractC14092toM67208k4.m67265du(), abstractC14092toM67208k42.m67265du());
        try {
            C14058fa.m66593k4(abstractC14092toM67208k4, i2 * i, abstractC14092toM67208k42, i3, i4 * i);
        } catch (ArgumentException unused) {
            throw new AccessViolationException("Cannot write. Address inaccessible");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m15621k4(byte[] bArr, int i, C14112xw c14112xw, int i2) {
        if (c14112xw == null || c14112xw.m67356kk() == null) {
            throw new ArgumentNullException();
        }
        m15620k4(bArr, 1, i, c14112xw, c14112xw.m67356kk().m19851kk(), i2);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m15622k4(int[] iArr, int i, C14112xw c14112xw, int i2) {
        if (c14112xw == null || c14112xw.m67356kk() == null) {
            throw new ArgumentNullException();
        }
        m15620k4(iArr, 4, i, c14112xw, c14112xw.m67356kk().m19851kk(), i2);
    }
}
