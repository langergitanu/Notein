package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.gf */
/* JADX INFO: loaded from: classes5.dex */
public class C13902gf extends AbstractC13917j5 {
    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13917j5
    /* JADX INFO: renamed from: x1 */
    public int mo65353x1(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        int i4 = i2 + i;
        int i5 = i3;
        while (true) {
            int i6 = i + 3;
            if (i6 >= i4) {
                return i5 - i3;
            }
            long j = ((bArr[i6] & 255) << 16) | ((bArr[i + 2] & 255) << 24) | ((bArr[i] & 255) << 8) | (bArr[i + 1] & 255);
            long j2 = j & 4294967295L;
            long j3 = j & 4294967295L;
            if (j3 > 1114111) {
                throw new ArgumentException(C13968ri.m65819k4("Invalid byte was found at index {0}.", Integer.valueOf(i)), (String) null);
            }
            if (j3 > C18177fb.f54859s) {
                m65488k4(j2, cArr, i5);
                i5++;
            } else {
                int i7 = (int) j2;
                if (C14022y4.m66325kk(i7)) {
                    throw new XmlException("Invalid character in the given encoding.", C14113y2.f47374k4);
                }
                cArr[i5] = (char) i7;
            }
            i5++;
            i += 4;
        }
    }
}
