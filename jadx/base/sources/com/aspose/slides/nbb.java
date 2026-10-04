package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p505xn.C12563k4;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class nbb {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<Byte, int[]> f47495k4;

    static {
        Dictionary<Byte, int[]> dictionary = new Dictionary<>();
        f47495k4 = dictionary;
        dictionary.addItem((byte) 1, new int[]{0, 2});
        dictionary.addItem((byte) 2, new int[]{2, 2});
        dictionary.addItem((byte) 3, new int[]{4, 3});
        dictionary.addItem((byte) 4, new int[]{4, 3, 1, 3});
        dictionary.addItem((byte) 5, new int[]{8, 3});
        dictionary.addItem((byte) 6, new int[]{8, 3, 1, 3});
        dictionary.addItem((byte) 7, new int[]{8, 3, 1, 3, 1, 3});
    }

    /* JADX INFO: renamed from: k4 */
    public static byte m67913k4(int[] iArr) {
        Dictionary.Enumerator<Byte, int[]> it = f47495k4.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (C12563k4.m58599k4((int[]) next.getValue(), iArr)) {
                    return ((Byte) next.getKey()).byteValue();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return (byte) -1;
        }
        it.dispose();
        return (byte) -1;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67914k4(byte b, double d) {
        C6765kp c6765kp = new C6765kp();
        for (int i : f47495k4.get_Item(Byte.valueOf(b))) {
            c6765kp.m26792k4(C14113y2.m67408k4(C14044b3.m66432k4(((double) i) * d, (InterfaceC14073kp) C11697x1.m55250kk()), ", "));
        }
        if (c6765kp.m26807x1() > 2) {
            c6765kp.m26801k4(c6765kp.m26807x1() - 2);
        }
        return c6765kp.toString();
    }
}
