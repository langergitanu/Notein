package com.aspose.slides.internal.p316of;

import com.aspose.slides.p559ms.System.AbstractC14070jw;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.aspose.slides.internal.of.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C7036m9 {

    /* JADX INFO: renamed from: k4 */
    private static Map<String, String> f19188k4;

    static {
        TreeMap treeMap = new TreeMap(AbstractC14070jw.m66787k4());
        f19188k4 = treeMap;
        treeMap.put("Arabic Transparent", "Arial");
        f19188k4.put("Arabic Transparent Bold", "Arial Bold");
        f19188k4.put("Arial Baltic", "Arial");
        f19188k4.put("Arial CE", "Arial");
        f19188k4.put("Arial Cyr", "Arial");
        f19188k4.put("Arial Greek1", "Arial");
        f19188k4.put("Arial TUR", "Arial");
        f19188k4.put("Courier New Baltic", "Courier New");
        f19188k4.put("Courier New CE", "Courier New");
        f19188k4.put("Courier New Cyr", "Courier New");
        f19188k4.put("Courier New Greek", "Courier New");
        f19188k4.put("Courier New TUR", "Courier New");
        f19188k4.put("Courier", "Courier New");
        f19188k4.put("David Transparent", "David");
        f19188k4.put("FangSong_GB2312", "FangSong");
        f19188k4.put("Fixed Miriam Transparent", "Miriam Fixed");
        f19188k4.put("Helv", "MS Sans Serif");
        f19188k4.put("Helvetica", "Arial");
        f19188k4.put("KaiTi_GB2312", "KaiTi");
        f19188k4.put("Miriam Transparent", "Miriam");
        f19188k4.put("MS Shell Dlg", "Microsoft Sans Serif");
        f19188k4.put("MS Shell Dlg 2", "Tahoma");
        f19188k4.put("Rod Transparent", "Rod");
        f19188k4.put("Tahoma Armenian", "Tahoma");
        f19188k4.put("Times", "Times New Roman");
        f19188k4.put("Times New Roman Baltic", "Times New Roman");
        f19188k4.put("Times New Roman CE", "Times New Roman");
        f19188k4.put("Times New Roman Cyr", "Times New Roman");
        f19188k4.put("Times New Roman Greek", "Times New Roman");
        f19188k4.put("Times New Roman TUR", "Times New Roman");
        f19188k4.put("Tms Rmn", "MS Serif");
    }

    /* JADX INFO: renamed from: k4 */
    public static String m27504k4(String str) {
        while (true) {
            String str2 = f19188k4.get(str);
            if (str2 == null) {
                return str;
            }
            str = str2;
        }
    }
}
