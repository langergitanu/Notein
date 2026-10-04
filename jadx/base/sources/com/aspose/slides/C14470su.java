package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.AbstractC14070jw;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.su */
/* JADX INFO: loaded from: classes3.dex */
class C14470su {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary[] f48918k4 = new Dictionary[0];

    /* JADX INFO: renamed from: com.aspose.slides.su$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private final IGenericDictionary<String, String>[] f48919k4;

        public k4(IGenericDictionary<String, String>[] iGenericDictionaryArr) {
            this.f48919k4 = iGenericDictionaryArr;
        }

        /* JADX INFO: renamed from: k4 */
        public final String m70774k4(String str) {
            int i = 0;
            while (true) {
                IGenericDictionary<String, String>[] iGenericDictionaryArr = this.f48919k4;
                if (i >= iGenericDictionaryArr.length) {
                    return null;
                }
                String[] strArr = {null};
                boolean zTryGetValue = iGenericDictionaryArr[i].tryGetValue(str, strArr);
                String str2 = strArr[0];
                if (zTryGetValue) {
                    return str2;
                }
                i++;
            }
        }

        /* JADX INFO: renamed from: x1 */
        public final boolean m70775x1(String str) {
            int i = 0;
            while (true) {
                IGenericDictionary<String, String>[] iGenericDictionaryArr = this.f48919k4;
                if (i >= iGenericDictionaryArr.length) {
                    return false;
                }
                if (iGenericDictionaryArr[i].containsKey(str)) {
                    return true;
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.su$x1 */
    public static class x1 {

        /* JADX INFO: renamed from: k4 */
        String f48920k4;

        /* JADX INFO: renamed from: x1 */
        IGenericDictionary<String, String> f48921x1;

        public x1(String str, IGenericDictionary<String, String> iGenericDictionary) {
            this.f48920k4 = str;
            this.f48921x1 = iGenericDictionary;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static Dictionary<String, String> m70772k4(String str) {
        int iM67429to;
        Dictionary<String, String> dictionary = new Dictionary<>(AbstractC14070jw.m66790x1());
        for (String str2 : C14113y2.m67414k4(str, ';')) {
            String strM67440x1 = C14113y2.m67440x1(str2);
            if (!C14113y2.m67411k4(strM67440x1) && (iM67429to = C14113y2.m67429to(strM67440x1, ':')) > 0) {
                String strM67440x12 = C14113y2.m67440x1(C14113y2.m67443x1(strM67440x1, 0, iM67429to));
                if (strM67440x12.length() > 0) {
                    dictionary.set_Item(strM67440x12, C14113y2.m67440x1(C14113y2.m67422kk(strM67440x1, iM67429to + 1)));
                }
            }
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    public final k4 m70773k4(List<x1> list, List<List<x1>> list2) {
        String[] strArr = {null};
        ((x1) OooO0O0.OooO00o(list, 1)).f48921x1.tryGetValue("style", strArr);
        String str = strArr[0];
        return str != null ? new k4(new Dictionary[]{m70772k4(str)}) : new k4(f48918k4);
    }
}
