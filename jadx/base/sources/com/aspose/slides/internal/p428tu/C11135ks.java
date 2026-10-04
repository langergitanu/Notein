package com.aspose.slides.internal.p428tu;

import androidx.core.view.InputDeviceCompat;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.tu.ks */
/* JADX INFO: loaded from: classes4.dex */
public class C11135ks {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<Integer, AbstractC11141rv> f38451k4;

    /* JADX INFO: renamed from: x1 */
    private static final C11142s7 f38452x1;

    static {
        Dictionary<Integer, AbstractC11141rv> dictionary = new Dictionary<>();
        f38451k4 = dictionary;
        f38452x1 = new C11142s7();
        dictionary.addItem(2, new C11132k4());
        dictionary.addItem(4096, new C11155x1());
        dictionary.addItem(4119, new C11133kk());
        dictionary.addItem(4120, new C11145to());
        dictionary.addItem(Integer.valueOf(EditingLanguage.ARABIC_LIBYA), new C11123du());
        dictionary.addItem(4112, new C11129h4());
        dictionary.addItem(514, new C11137m9());
        dictionary.addItem(4111, new C11124dy());
        dictionary.addItem(25, new C11119c5());
        dictionary.addItem(4116, new C11121ck());
        dictionary.addItem(Integer.valueOf(InputDeviceCompat.SOURCE_TOUCHSCREEN), new C11149up());
        dictionary.addItem(11, new C11126fa());
        dictionary.addItem(33, new C11159yj());
        dictionary.addItem(512, new C11156x6());
        dictionary.addItem(5, new C11138ne());
        dictionary.addItem(42, new C11130ix());
        dictionary.addItem(256, new C11147u4());
        dictionary.addItem(Integer.valueOf(InputDeviceCompat.SOURCE_DPAD), new C11150uz());
        dictionary.addItem(Integer.valueOf(StyleIdentifier.COLORFUL_LIST_ACCENT_6), new C11152wl());
        dictionary.addItem(12, new C11140qq());
        dictionary.addItem(13, new C11115ar());
        dictionary.addItem(4121, new C11148um());
        dictionary.addItem(14, new C11117bv());
        dictionary.addItem(15, new C11131jd());
        dictionary.addItem(Integer.valueOf(EditingLanguage.ARABIC_IRAQ), new C11151v4());
        dictionary.addItem(1, new C11136lr());
        dictionary.addItem(3, new C11158yd());
        dictionary.addItem(19, new C11154wy());
        dictionary.addItem(37, new C11114ak());
        dictionary.addItem(4117, new C11122dq());
        dictionary.addItem(38, new C11157xk());
        dictionary.addItem(4118, new C11120c6());
        dictionary.addItem(4115, new C11146ts());
        dictionary.addItem(4110, new C11116b3());
        dictionary.addItem(Integer.valueOf(EditingLanguage.ARABIC_EGYPT), new C11125e0());
        dictionary.addItem(8, new C11118bz());
        dictionary.addItem(4, new C11139qm());
        dictionary.addItem(17, new C11127g8());
        dictionary.addItem(21, new C11144sv());
        dictionary.addItem(22, new C11153wp());
        dictionary.addItem(23, new C11143ss());
        dictionary.addItem(4568, new C11134kp());
        dictionary.addItem(10, new C11128gi());
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC11141rv m53665k4(int i) {
        C11142s7 c11142s7 = f38452x1;
        Dictionary<Integer, AbstractC11141rv> dictionary = f38451k4;
        return dictionary.containsKey(Integer.valueOf(i)) ? dictionary.get_Item(Integer.valueOf(i)) : c11142s7;
    }
}
