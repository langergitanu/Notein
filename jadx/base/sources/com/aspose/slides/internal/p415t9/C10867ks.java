package com.aspose.slides.internal.p415t9;

import androidx.core.view.InputDeviceCompat;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.t9.ks */
/* JADX INFO: loaded from: classes4.dex */
public class C10867ks {

    /* JADX INFO: renamed from: k4 */
    private static Dictionary<Integer, AbstractC10873rv> f37863k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private static C10874s7 f37864x1 = new C10874s7();

    static {
        f37863k4.addItem(2, new C10864k4());
        f37863k4.addItem(4096, new C10887x1());
        f37863k4.addItem(4119, new C10865kk());
        f37863k4.addItem(4120, new C10877to());
        f37863k4.addItem(Integer.valueOf(EditingLanguage.ARABIC_LIBYA), new C10855du());
        f37863k4.addItem(4112, new C10861h4());
        f37863k4.addItem(514, new C10869m9());
        f37863k4.addItem(4111, new C10856dy());
        f37863k4.addItem(25, new C10851c5());
        f37863k4.addItem(4116, new C10853ck());
        f37863k4.addItem(Integer.valueOf(InputDeviceCompat.SOURCE_TOUCHSCREEN), new C10881up());
        f37863k4.addItem(11, new C10858fa());
        f37863k4.addItem(33, new C10891yj());
        f37863k4.addItem(512, new C10888x6());
        f37863k4.addItem(5, new C10870ne());
        f37863k4.addItem(42, new C10862ix());
        f37863k4.addItem(256, new C10879u4());
        f37863k4.addItem(Integer.valueOf(InputDeviceCompat.SOURCE_DPAD), new C10882uz());
        f37863k4.addItem(Integer.valueOf(StyleIdentifier.COLORFUL_LIST_ACCENT_6), new C10884wl());
        f37863k4.addItem(12, new C10872qq());
        f37863k4.addItem(13, new C10847ar());
        f37863k4.addItem(4121, new C10880um());
        f37863k4.addItem(14, new C10849bv());
        f37863k4.addItem(15, new C10863jd());
        f37863k4.addItem(Integer.valueOf(EditingLanguage.ARABIC_IRAQ), new C10883v4());
        f37863k4.addItem(1, new C10868lr());
        f37863k4.addItem(3, new C10890yd());
        f37863k4.addItem(19, new C10886wy());
        f37863k4.addItem(37, new C10846ak());
        f37863k4.addItem(4117, new C10854dq());
        f37863k4.addItem(38, new C10889xk());
        f37863k4.addItem(4118, new C10852c6());
        f37863k4.addItem(4115, new C10878ts());
        f37863k4.addItem(4110, new C10848b3());
        f37863k4.addItem(Integer.valueOf(EditingLanguage.ARABIC_EGYPT), new C10857e0());
        f37863k4.addItem(8, new C10850bz());
        f37863k4.addItem(4, new C10871qm());
        f37863k4.addItem(17, new C10859g8());
        f37863k4.addItem(21, new C10876sv());
        f37863k4.addItem(22, new C10885wp());
        f37863k4.addItem(23, new C10875ss());
        f37863k4.addItem(4568, new C10866kp());
        f37863k4.addItem(10, new C10860gi());
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC10873rv m52419k4(int i) {
        return f37863k4.containsKey(Integer.valueOf(i)) ? f37863k4.get_Item(Integer.valueOf(i)) : f37864x1;
    }
}
