package com.aspose.slides.internal.p353q7;

import androidx.core.view.InputDeviceCompat;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p346pw.C9574to;
import com.aspose.words.StyleIdentifier;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.domain.models.backup.BackupEvent;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.to */
/* JADX INFO: loaded from: classes4.dex */
public class C9789to {

    /* JADX INFO: renamed from: k4 */
    private final byte[] f35385k4;

    /* JADX INFO: renamed from: x1 */
    private int f35388x1;

    /* JADX INFO: renamed from: to */
    private List<Double> f35387to = new List<>();

    /* JADX INFO: renamed from: kk */
    private final Dictionary<Integer, List<Double>> f35386kk = new Dictionary<>();

    public C9789to(byte[] bArr) {
        this.f35385k4 = bArr;
    }

    /* JADX INFO: renamed from: kk */
    private double m48160kk() {
        String strM46742k4;
        C6765kp c6765kp = new C6765kp();
        boolean z = false;
        while (!z) {
            byte bM48161to = m48161to();
            int[] iArr = {(bM48161to & 240) >> 4, bM48161to & 15};
            for (int i = 0; i < 2; i++) {
                int i2 = iArr[i];
                if (i2 < 0 || i2 > 9) {
                    switch (i2) {
                        case 10:
                            strM46742k4 = ".";
                            break;
                        case 11:
                            strM46742k4 = "E";
                            break;
                        case 12:
                            strM46742k4 = "E-";
                            break;
                        case 13:
                            throw new ArgumentException("Reserved nibble value.");
                        case 14:
                            strM46742k4 = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
                            break;
                        case 15:
                            z = true;
                            break;
                        default:
                            break;
                    }
                } else {
                    strM46742k4 = C9574to.m46742k4(i2);
                }
                c6765kp.m26792k4(strM46742k4);
            }
        }
        return C9574to.m46739k4(c6765kp.toString());
    }

    /* JADX INFO: renamed from: to */
    private byte m48161to() {
        byte[] bArr = this.f35385k4;
        int i = this.f35388x1;
        this.f35388x1 = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: x1 */
    private void m48162x1() {
        Dictionary<Integer, List<Double>> dictionary;
        int iM48161to;
        byte[] bArr = new byte[5];
        byte bM48161to = m48161to();
        bArr[0] = bM48161to;
        if ((bM48161to & 255) >= 0 && (bM48161to & 255) <= 21) {
            if ((bM48161to & 255) == 12) {
                dictionary = this.f35386kk;
                iM48161to = (m48161to() & 255) + 1200;
            } else {
                dictionary = this.f35386kk;
                iM48161to = bM48161to & 255;
            }
            dictionary.addItem(Integer.valueOf(iM48161to), this.f35387to);
            this.f35387to = new List<>();
            return;
        }
        if ((bM48161to & 255) == 30) {
            this.f35387to.addItem(Double.valueOf(m48160kk()));
            return;
        }
        if ((bM48161to & 255) >= 32 && (bM48161to & 255) <= 246) {
            this.f35387to.addItem(Double.valueOf((bM48161to & 255) - 139));
            return;
        }
        bArr[1] = m48161to();
        byte b = bArr[0];
        if ((b & 255) >= 247 && (b & 255) <= 250) {
            this.f35387to.addItem(Double.valueOf((((b & 255) - StyleIdentifier.LIGHT_LIST_ACCENT_6) * 256) + (r1 & 255) + 108));
            return;
        }
        if ((b & 255) >= 251 && (b & 255) <= 254) {
            this.f35387to.addItem(Double.valueOf(((((b & 255) - StyleIdentifier.MEDIUM_LIST_1_ACCENT_6) * InputDeviceCompat.SOURCE_ANY) - (r1 & 255)) + BackupEvent.ERROR_UID_NOT_EXIST));
            return;
        }
        bArr[2] = m48161to();
        if ((bArr[0] & 255) == 28) {
            this.f35387to.addItem(Double.valueOf((short) (((bArr[1] & 255) << 8) | (r1 & 255))));
            return;
        }
        bArr[3] = m48161to();
        bArr[4] = m48161to();
        if ((bArr[0] & 255) != 29) {
            throw new ArgumentException("DICT operand does not fall in either of acceptable values.");
        }
        this.f35387to.addItem(Double.valueOf(((bArr[3] & 255) << 8) | ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | (r1 & 255)));
    }

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<Integer, List<Double>> m48163k4() {
        while (this.f35388x1 < this.f35385k4.length) {
            m48162x1();
        }
        return this.f35386kk;
    }
}
