package com.aspose.slides.internal.p245la;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p185il.C5102k4;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p385rr.C10052k4;
import com.aspose.slides.internal.p550zi.C13594c5;
import com.aspose.slides.internal.p550zi.C13598dy;
import com.aspose.slides.internal.p550zi.C13618wy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.la.du */
/* JADX INFO: loaded from: classes.dex */
public class C6013du {
    /* JADX INFO: renamed from: k4 */
    public static InterfaceC6901du m24294k4(C13618wy c13618wy, int i) {
        if (c13618wy == null) {
            throw new ArgumentNullException("stream");
        }
        if (i <= 0) {
            throw new NotSupportedException("palSize");
        }
        int i2 = i * 3;
        int[] iArrM49684k4 = C10052k4.m49684k4(i);
        byte[] bArr = new byte[i2];
        if (i2 != c13618wy.m62860x1(bArr)) {
            throw new C5102k4("Cannot load palette. Not enough bytes to read from the stream.");
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 * 3;
            iArrM49684k4[i3] = C13598dy.m62724k4(C13598dy.m62725k4(bArr[i4] & 255, bArr[i4 + 1] & 255, bArr[i4 + 2] & 255));
        }
        return new C13594c5(iArrM49684k4);
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m24299x1(C13618wy c13618wy, int i) {
        if (c13618wy == null) {
            throw new ArgumentNullException("streamContainer");
        }
        byte[] bArr = new byte[i];
        if (c13618wy.m62860x1(bArr) == i) {
            return bArr;
        }
        throw new C5102k4("Cannot load data. There is not enough bytes to read from stream.");
    }

    /* JADX INFO: renamed from: k4 */
    public static void m24295k4(C13618wy c13618wy, InterfaceC6901du interfaceC6901du) {
        if (c13618wy == null) {
            throw new ArgumentNullException("stream");
        }
        if (interfaceC6901du == null) {
            throw new ArgumentNullException("palette");
        }
        int[] iArrMo27032x1 = interfaceC6901du.mo27032x1();
        byte[] bArr = new byte[iArrMo27032x1.length * 3];
        int i = 0;
        for (int i2 : iArrMo27032x1) {
            bArr[i] = (byte) ((i2 >> 16) & 255);
            int i3 = i + 2;
            bArr[i + 1] = (byte) ((i2 >> 8) & 255);
            i += 3;
            bArr[i3] = (byte) (i2 & 255);
        }
        c13618wy.m62857k4(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m24296k4(byte[] bArr, AbstractC3150x6 abstractC3150x6) {
        if (bArr != null) {
            int i = 0;
            while (i < AbstractC14092to.m67208k4((Object) bArr).m67265du()) {
                int iM67507x1 = C14116yg.m67507x1(255, AbstractC14092to.m67208k4((Object) bArr).m67265du() - i);
                abstractC3150x6.writeByte((byte) iM67507x1);
                abstractC3150x6.write(bArr, i, iM67507x1);
                i += iM67507x1;
            }
        }
        abstractC3150x6.writeByte((byte) 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m24297k4(AbstractC3150x6 abstractC3150x6) {
        long position = abstractC3150x6.getPosition();
        int i = abstractC3150x6.readByte();
        int i2 = 0;
        int i3 = 0;
        while (i != 0) {
            i3 += i;
            abstractC3150x6.seek(i, 1);
            i = abstractC3150x6.readByte();
            if (i == -1) {
                return new byte[]{0};
            }
        }
        byte[] bArr = new byte[i3];
        abstractC3150x6.seek(position, 0);
        while (i2 < i3) {
            int i4 = abstractC3150x6.readByte();
            if (abstractC3150x6.read(bArr, i2, i4) != i4) {
                throw new C5102k4("Cannot load application data. There is not enough bytes to read from stream.");
            }
            i2 += i4;
        }
        abstractC3150x6.readByte();
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m24298k4(C13618wy c13618wy) {
        return m24297k4(c13618wy.m62861x1());
    }
}
