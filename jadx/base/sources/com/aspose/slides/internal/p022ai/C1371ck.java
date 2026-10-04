package com.aspose.slides.internal.p022ai;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ai.ck */
/* JADX INFO: loaded from: classes3.dex */
public class C1371ck extends AbstractC1370c5 {

    /* JADX INFO: renamed from: k4 */
    public int f5950k4;

    /* JADX INFO: renamed from: x1 */
    private static final String[] f5949x1 = {"visible", "hidden", "collapse"};

    /* JADX INFO: renamed from: kk */
    private static final int[] f5948kk = {159, 57, 26};

    public C1371ck(int i) {
        super(m8128k4(i), i);
        this.f5950k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m8128k4(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f5948kk;
            if (i2 >= iArr.length) {
                throw new ArgumentException(C14113y2.m67408k4("Illegal visibility: ", C14057f9.m66591x1(i)));
            }
            if (iArr[i2] == i) {
                return f5949x1[i2];
            }
            i2++;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return C7019kk.m27469x1(obj, C1371ck.class) && this.f5950k4 == ((C1371ck) obj).f5950k4;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26780k4('(');
        c6765kp.m26792k4(m8126k4());
        c6765kp.m26780k4(')');
        return c6765kp.toString();
    }
}
