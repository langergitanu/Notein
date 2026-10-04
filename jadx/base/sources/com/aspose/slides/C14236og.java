package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p505xn.C12555c5;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.og */
/* JADX INFO: loaded from: classes3.dex */
class C14236og {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<Byte, String> f47775k4;

    static {
        Dictionary<Byte, String> dictionary = new Dictionary<>();
        f47775k4 = dictionary;
        dictionary.addItem((byte) 0, "ISO-8859-1");
        dictionary.addItem((byte) 77, "shift_jis");
        dictionary.addItem(Byte.valueOf(UnsignedBytes.MAX_POWER_OF_TWO), "shift_jis");
        dictionary.addItem((byte) -127, "ks_c_5601-1987");
        dictionary.addItem((byte) -126, "Johab");
        dictionary.addItem((byte) -122, "gb2312");
        dictionary.addItem((byte) -120, "big5");
        dictionary.addItem((byte) -95, "windows-1253");
        dictionary.addItem((byte) -94, "iso-8859-9");
        dictionary.addItem((byte) -93, "windows-1258");
        dictionary.addItem((byte) -79, "windows-1255");
        dictionary.addItem((byte) -78, "windows-1256");
        dictionary.addItem((byte) -70, "windows-1257");
        dictionary.addItem((byte) -52, "windows-1251");
        dictionary.addItem((byte) -34, "windows-874");
        dictionary.addItem((byte) -18, "windows-1250");
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m68520k4(char c, byte b) {
        byte[] bArrM26683x1 = AbstractC6747ar.m26643rv().m26683x1(new char[]{c});
        Dictionary<Byte, String> dictionary = f47775k4;
        return !dictionary.containsKey(Byte.valueOf(b)) ? bArrM26683x1 : AbstractC6747ar.m26638k4(AbstractC6747ar.m26643rv(), C12555c5.m58553k4(dictionary.get_Item(Byte.valueOf(b))), bArrM26683x1);
    }
}
