package com.aspose.slides.internal.p036b6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p437u9.C11292du;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.vj */
/* JADX INFO: loaded from: classes3.dex */
public class C1656vj {
    /* JADX INFO: renamed from: k4 */
    public static long m9015k4(byte[] bArr, long j, long j2) {
        long j3 = 4294967295L;
        long jM27461m9 = 0;
        long length = (j2 & 4294967295L) == 0 ? ((long) bArr.length) & 4294967295L : j2;
        long j4 = j & 4294967295L;
        if ((((length & 4294967295L) + j4) & 4294967295L) > bArr.length) {
            throw new Exception("Check sum is out of bound");
        }
        int i = 10;
        C14046bv c14046bvClone = C14116yg.m67493kk(C14046bv.m66458h4(C7019kk.m27440jd(Long.valueOf(length), 10), C7019kk.m27440jd(4, 9)).Clone()).Clone();
        int i2 = 0;
        while (C14046bv.m66447c5(c14046bvClone, C7019kk.m27440jd(Integer.valueOf(i2), 9))) {
            long j5 = j3;
            long j6 = (((long) (i2 * 4)) + j4) & j5;
            byte[] bArr2 = {bArr[(int) j6], bArr[(int) (j6 + 1)], bArr[(int) (j6 + 2)], bArr[(int) (j6 + 3)]};
            AbstractC14092to.m67248to(AbstractC14092to.m67208k4((Object) bArr2));
            jM27461m9 += C7019kk.m27461m9(Long.valueOf(C14069jd.m66784x1(bArr2, 0)), 10);
            i2++;
            i = 10;
            j3 = j5;
        }
        long j7 = j3;
        int iM27462to = C7019kk.m27462to(C14046bv.m66490to(C7019kk.m27440jd(Long.valueOf(length), i), C14046bv.m66451du(c14046bvClone, C7019kk.m27440jd(4, 9))), 15);
        if (iM27462to != 0) {
            long jM27435du = (j4 + (((C7019kk.m27435du(c14046bvClone, 15) & j7) * 4) & j7)) & j7;
            while (iM27462to > 0) {
                jM27461m9 += ((long) ((bArr[(int) jM27435du] & 255) << (iM27462to * 8))) & j7;
                jM27435du++;
                iM27462to--;
            }
        }
        return (jM27461m9 % 4294967296L) & j7;
    }

    /* JADX INFO: renamed from: kk */
    public static String[] m9019kk(byte[] bArr) {
        List list = new List();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            byte b = bArr[i];
            String strM67441x1 = "";
            while (true) {
                byte b2 = (byte) (b - 1);
                if ((b & 255) <= 0 || i2 >= length) {
                    break;
                }
                int i3 = i2 + 1;
                byte b3 = bArr[i2];
                if ((b3 & 255) != 0) {
                    strM67441x1 = C14113y2.m67441x1(strM67441x1, C14080ne.m67033x1(Byte.valueOf(b3)));
                }
                i2 = i3;
                b = b2;
            }
            list.addItem(strM67441x1);
            i = i2;
        }
        return (String[]) list.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public static String m9020x1(byte[] bArr) {
        int length = bArr.length;
        String strM67441x1 = "";
        for (int i = 0; i < length; i += 2) {
            strM67441x1 = C14113y2.m67441x1(strM67441x1, C14080ne.m67037x1(Integer.valueOf(((bArr[i] & 255) << 8) + (bArr[i + 1] & 255))));
        }
        return strM67441x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> Dictionary<String, Object> m9016k4(IGenericEnumerable<T> iGenericEnumerable) {
        Dictionary<String, Object> dictionary = new Dictionary<>();
        IGenericEnumerator<T> it = iGenericEnumerable.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                dictionary.addItem(C14057f9.m66591x1(i), it.next());
                i++;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m9021x1(String str) {
        List list = new List();
        list.addItem(Byte.valueOf(!C14113y2.m67411k4(str) ? str.length() < 256 ? (byte) str.length() : (byte) -1 : (byte) 0));
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            list.addItem(Byte.valueOf(cCharAt < 128 ? (byte) cCharAt : PatternStyle.Plaid));
        }
        return C11292du.m54267k4((List<Byte>) list);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m9017k4(byte[] bArr) {
        return AbstractC6747ar.m26635ix().m26681x1(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m9018k4(String str) {
        List list = new List();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            list.addItem(Byte.valueOf((byte) (cCharAt >> '\b')));
            list.addItem(Byte.valueOf((byte) (cCharAt & 255)));
        }
        return C11292du.m54267k4((List<Byte>) list);
    }
}
