package com.aspose.slides.internal.p347px;

import androidx.core.view.InputDeviceCompat;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p514xx.C12750kk;
import com.aspose.words.StyleIdentifier;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.domain.models.backup.BackupEvent;

/* JADX INFO: renamed from: com.aspose.slides.internal.px.to */
/* JADX INFO: loaded from: classes4.dex */
public class C9597to {

    /* JADX INFO: renamed from: k4 */
    private final byte[] f34706k4;

    /* JADX INFO: renamed from: x1 */
    private int f34709x1;

    /* JADX INFO: renamed from: to */
    private List<Double> f34708to = new List<>();

    /* JADX INFO: renamed from: kk */
    private final Dictionary<Integer, List<Double>> f34707kk = new Dictionary<>();

    public C9597to(byte[] bArr) {
        this.f34706k4 = bArr;
    }

    /* JADX INFO: renamed from: kk */
    private double m46876kk() {
        String strM59426k4;
        C6765kp c6765kp = new C6765kp();
        boolean z = false;
        while (!z) {
            byte bM46877to = m46877to();
            int[] iArr = {(bM46877to & 240) >> 4, bM46877to & 15};
            for (int i = 0; i < 2; i++) {
                int i2 = iArr[i];
                if (i2 < 0 || i2 > 9) {
                    switch (i2) {
                        case 10:
                            strM59426k4 = ".";
                            break;
                        case 11:
                            strM59426k4 = "E";
                            break;
                        case 12:
                            strM59426k4 = "E-";
                            break;
                        case 13:
                            throw new ArgumentException("Reserved nibble value.");
                        case 14:
                            strM59426k4 = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
                            break;
                        case 15:
                            z = true;
                            break;
                        default:
                            break;
                    }
                } else {
                    strM59426k4 = C12750kk.m59426k4(i2);
                }
                c6765kp.m26792k4(strM59426k4);
            }
        }
        return C12750kk.m59425k4(c6765kp.toString());
    }

    /* JADX INFO: renamed from: to */
    private byte m46877to() {
        byte[] bArr = this.f34706k4;
        int i = this.f34709x1;
        this.f34709x1 = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: x1 */
    private void m46878x1() {
        Dictionary<Integer, List<Double>> dictionary;
        int iM46877to;
        byte[] bArr = new byte[5];
        byte bM46877to = m46877to();
        bArr[0] = bM46877to;
        if ((bM46877to & 255) >= 0 && (bM46877to & 255) <= 21) {
            if ((bM46877to & 255) == 12) {
                dictionary = this.f34707kk;
                iM46877to = (m46877to() & 255) + 1200;
            } else {
                dictionary = this.f34707kk;
                iM46877to = bM46877to & 255;
            }
            dictionary.addItem(Integer.valueOf(iM46877to), this.f34708to);
            this.f34708to = new List<>();
            return;
        }
        if ((bM46877to & 255) == 30) {
            this.f34708to.addItem(Double.valueOf(m46876kk()));
            return;
        }
        if ((bM46877to & 255) >= 32 && (bM46877to & 255) <= 246) {
            this.f34708to.addItem(Double.valueOf((bM46877to & 255) - 139));
            return;
        }
        bArr[1] = m46877to();
        byte b = bArr[0];
        if ((b & 255) >= 247 && (b & 255) <= 250) {
            this.f34708to.addItem(Double.valueOf((((b & 255) - StyleIdentifier.LIGHT_LIST_ACCENT_6) * 256) + (r1 & 255) + 108));
            return;
        }
        if ((b & 255) >= 251 && (b & 255) <= 254) {
            this.f34708to.addItem(Double.valueOf(((((b & 255) - StyleIdentifier.MEDIUM_LIST_1_ACCENT_6) * InputDeviceCompat.SOURCE_ANY) - (r1 & 255)) + BackupEvent.ERROR_UID_NOT_EXIST));
            return;
        }
        bArr[2] = m46877to();
        if ((bArr[0] & 255) == 28) {
            this.f34708to.addItem(Double.valueOf((short) (((bArr[1] & 255) << 8) | (r1 & 255))));
            return;
        }
        bArr[3] = m46877to();
        bArr[4] = m46877to();
        if ((bArr[0] & 255) != 29) {
            throw new ArgumentException("DICT operand does not fall in either of acceptable values.");
        }
        this.f34708to.addItem(Double.valueOf(((bArr[3] & 255) << 8) | ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | (r1 & 255)));
    }

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<Integer, List<Double>> m46879k4() {
        while (this.f34709x1 < this.f34706k4.length) {
            m46878x1();
        }
        return this.f34707kk;
    }
}
