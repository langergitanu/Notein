package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class h5e {

    /* JADX INFO: renamed from: du */
    private static final C12380dy f5434du;

    /* JADX INFO: renamed from: dy */
    private static final Dictionary<C12380dy, Byte> f5435dy;

    /* JADX INFO: renamed from: h4 */
    private static final C12380dy f5436h4;

    /* JADX INFO: renamed from: k4 */
    private static final C12380dy f5437k4;

    /* JADX INFO: renamed from: kk */
    private static final C12380dy f5438kk;

    /* JADX INFO: renamed from: m9 */
    private static final C12380dy f5439m9;

    /* JADX INFO: renamed from: to */
    private static final C12380dy f5440to;

    /* JADX INFO: renamed from: x1 */
    private static final C12380dy f5441x1;

    static {
        C12380dy c12380dy = new C12380dy("ppt\\/charts\\/chart(\\d+?\\.xml)", 0);
        f5437k4 = c12380dy;
        C12380dy c12380dy2 = new C12380dy("ppt\\/diagrams\\/data(\\d+?\\.xml)", 0);
        f5441x1 = c12380dy2;
        f5438kk = new C12380dy("ppt\\/notesMasters\\/notesMaster(\\d+?\\.xml)", 0);
        C12380dy c12380dy3 = new C12380dy("ppt\\/notesSlides\\/notesSlide(\\d+?\\.xml)", 0);
        f5440to = c12380dy3;
        C12380dy c12380dy4 = new C12380dy("ppt\\/slideLayouts\\/slideLayout(\\d+?\\.xml)", 0);
        f5434du = c12380dy4;
        C12380dy c12380dy5 = new C12380dy("ppt\\/slideMasters\\/slideMaster(\\d+?\\.xml)", 0);
        f5436h4 = c12380dy5;
        C12380dy c12380dy6 = new C12380dy("ppt\\/slides\\/slide(\\d+\\.xml)");
        f5439m9 = c12380dy6;
        Dictionary<C12380dy, Byte> dictionary = new Dictionary<>();
        f5435dy = dictionary;
        dictionary.addItem(c12380dy, (byte) 6);
        dictionary.addItem(c12380dy2, (byte) 2);
        dictionary.addItem(c12380dy3, (byte) 5);
        dictionary.addItem(c12380dy4, (byte) 4);
        dictionary.addItem(c12380dy5, (byte) 3);
        dictionary.addItem(c12380dy6, (byte) 1);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m7040k4(int i, String str) {
        return C14057f9.m66582k4(C14113y2.m67443x1(str, i, C14113y2.m67434x1(str, FilenameUtils.EXTENSION_SEPARATOR, i) - i));
    }

    /* JADX INFO: renamed from: x1 */
    public static int m7044x1(String str) {
        return C14057f9.m66582k4(C14113y2.m67443x1(str, 34, C14113y2.m67434x1(str, FilenameUtils.EXTENSION_SEPARATOR, 34) - 34));
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m7041k4(String str) {
        return C14113y2.m67448x1(str, "ppt/slideLayouts/_rels/slideLayout");
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m7042k4(String str, int[] iArr, byte[] bArr) {
        Dictionary.Enumerator<C12380dy, Byte> it = f5435dy.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                C12385to c12385toM57989x1 = ((C12380dy) next.getKey()).m57989x1(str);
                if (c12385toM57989x1.mo58006to()) {
                    iArr[0] = C14057f9.m66582k4(C14113y2.m67396k4(c12385toM57989x1.m58004du().m58000k4(1).mo57995kk(), c12385toM57989x1.m58004du().m58000k4(1).mo57995kk().length() - 4, 4));
                    bArr[0] = ((Byte) next.getValue()).byteValue();
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        iArr[0] = -1;
        bArr[0] = 0;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m7043k4(String str, int[] iArr, boolean[] zArr) {
        if (C14113y2.m67448x1(str, "ppt/slides/_rels/slide")) {
            iArr[0] = m7040k4(22, str);
            zArr[0] = true;
            return true;
        }
        if (m7041k4(str)) {
            iArr[0] = m7044x1(str);
            zArr[0] = false;
            return true;
        }
        iArr[0] = -1;
        zArr[0] = false;
        return false;
    }
}
