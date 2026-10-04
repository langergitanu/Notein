package com.aspose.slides.internal.p135fp;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p515xz.C12754k4;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.fp.ar */
/* JADX INFO: loaded from: classes.dex */
public class C4086ar {
    /* JADX INFO: renamed from: k4 */
    public static boolean m16248k4(short[] sArr, short[][] sArr2) {
        sArr2[0] = null;
        if (sArr == null) {
            throw new ArgumentNullException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        if (sArr.length != 64) {
            return false;
        }
        sArr2[0] = new short[8];
        for (int i = 0; i < 64; i++) {
            if (i % 8 == 0) {
                sArr2[0][i / 8] = sArr[i];
            } else if (sArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m16251x1(short[] sArr, short[][] sArr2) {
        sArr2[0] = null;
        if (sArr == null) {
            throw new ArgumentNullException("packedData");
        }
        if (sArr.length != 8) {
            return false;
        }
        sArr2[0] = new short[64];
        for (int i = 0; i < 8; i++) {
            sArr2[0][i * 8] = sArr[i];
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static short[] m16249k4(short[] sArr) {
        if (sArr == null) {
            throw new ArgumentNullException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        short[] sArr2 = new short[0];
        if (sArr.length < 2) {
            return sArr.length == 1 ? new short[]{sArr[0]} : sArr2;
        }
        int i = 0;
        for (int length = sArr.length - 1; length != 0 && sArr[length] == 0; length--) {
            i++;
        }
        int length2 = sArr.length - i;
        short[] sArr3 = new short[length2];
        System.arraycopy(sArr, 0, sArr3, 0, length2);
        return sArr3;
    }

    /* JADX INFO: renamed from: k4 */
    public static short[] m16250k4(short[] sArr, int i) {
        if (sArr == null) {
            throw new ArgumentNullException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        if (sArr.length > i) {
            throw new C12754k4("Data length is greater than unpacked length");
        }
        short[] sArr2 = new short[i];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        return sArr2;
    }
}
