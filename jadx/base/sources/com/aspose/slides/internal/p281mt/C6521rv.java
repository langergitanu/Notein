package com.aspose.slides.internal.p281mt;

import androidx.core.view.InputDeviceCompat;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.mt.rv */
/* JADX INFO: loaded from: classes4.dex */
public class C6521rv {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<Integer, AbstractC6515ks> f18281k4;

    /* JADX INFO: renamed from: x1 */
    private static final C6522s7 f18282x1;

    static {
        Dictionary<Integer, AbstractC6515ks> dictionary = new Dictionary<>();
        f18281k4 = dictionary;
        f18282x1 = new C6522s7();
        dictionary.addItem(2, new C6512k4());
        dictionary.addItem(4096, new C6535x1());
        dictionary.addItem(4119, new C6513kk());
        dictionary.addItem(4120, new C6525to());
        dictionary.addItem(Integer.valueOf(EditingLanguage.ARABIC_LIBYA), new C6503du());
        dictionary.addItem(4112, new C6509h4());
        dictionary.addItem(514, new C6517m9());
        dictionary.addItem(4111, new C6504dy());
        dictionary.addItem(25, new C6499c5());
        dictionary.addItem(4116, new C6501ck());
        dictionary.addItem(Integer.valueOf(InputDeviceCompat.SOURCE_TOUCHSCREEN), new C6529up());
        dictionary.addItem(11, new C6506fa());
        dictionary.addItem(33, new C6539yj());
        dictionary.addItem(512, new C6536x6());
        dictionary.addItem(5, new C6518ne());
        dictionary.addItem(42, new C6510ix());
        dictionary.addItem(256, new C6527u4());
        dictionary.addItem(Integer.valueOf(InputDeviceCompat.SOURCE_DPAD), new C6530uz());
        dictionary.addItem(Integer.valueOf(StyleIdentifier.COLORFUL_LIST_ACCENT_6), new C6532wl());
        dictionary.addItem(12, new C6520qq());
        dictionary.addItem(13, new C6495ar());
        dictionary.addItem(4121, new C6528um());
        dictionary.addItem(14, new C6497bv());
        dictionary.addItem(15, new C6511jd());
        dictionary.addItem(Integer.valueOf(EditingLanguage.ARABIC_IRAQ), new C6531v4());
        dictionary.addItem(1, new C6516lr());
        dictionary.addItem(3, new C6538yd());
        dictionary.addItem(19, new C6534wy());
        dictionary.addItem(37, new C6494ak());
        dictionary.addItem(4117, new C6502dq());
        dictionary.addItem(38, new C6537xk());
        dictionary.addItem(4118, new C6500c6());
        dictionary.addItem(4115, new C6526ts());
        dictionary.addItem(4110, new C6496b3());
        dictionary.addItem(Integer.valueOf(EditingLanguage.ARABIC_EGYPT), new C6505e0());
        dictionary.addItem(8, new C6498bz());
        dictionary.addItem(4, new C6519qm());
        dictionary.addItem(17, new C6507g8());
        dictionary.addItem(21, new C6524sv());
        dictionary.addItem(22, new C6533wp());
        dictionary.addItem(23, new C6523ss());
        dictionary.addItem(4568, new C6514kp());
        dictionary.addItem(10, new C6508gi());
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC6515ks m26339k4(int i) {
        C6522s7 c6522s7 = f18282x1;
        Dictionary<Integer, AbstractC6515ks> dictionary = f18281k4;
        return dictionary.containsKey(Integer.valueOf(i)) ? dictionary.get_Item(Integer.valueOf(i)) : c6522s7;
    }
}
