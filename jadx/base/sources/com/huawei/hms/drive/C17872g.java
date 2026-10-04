package com.huawei.hms.drive;

import com.huawei.cloud.services.drive.Drive;
import com.huawei.hms.network.embedded.C18115b5;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: renamed from: com.huawei.hms.drive.g */
/* JADX INFO: loaded from: classes6.dex */
public class C17872g {

    /* JADX INFO: renamed from: a */
    public static final Map<String, String> f53405a;

    static {
        HashMap map = new HashMap();
        f53405a = map;
        map.put(Drive.About.Get.class.getName(), "12100");
        map.put(Drive.Files.Create.class.getName(), "12205");
        map.put(Drive.Files.Update.class.getName(), "12206");
        map.put(Drive.Files.Delete.class.getName(), "12207");
        map.put(Drive.Files.EmptyRecycle.class.getName(), "12208");
        map.put(Drive.Files.Copy.class.getName(), "12209");
        map.put(Drive.Files.Get.class.getName(), "12211");
        map.put(Drive.Files.List.class.getName(), "12212");
        map.put(Drive.Files.Subscribe.class.getName(), "12213");
        map.put(Drive.Changes.GetStartCursor.class.getName(), "12300");
        map.put(Drive.Changes.List.class.getName(), "12301");
        map.put(Drive.Changes.Subscribe.class.getName(), "12302");
        map.put(Drive.Channels.Stop.class.getName(), "12400");
    }

    /* JADX INFO: renamed from: a */
    public static String m76783a(String str) {
        if (str == null || str.isEmpty()) {
            str = "12000";
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(8);
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            sb2.append(random.nextInt(10));
        }
        sb.append(str);
        sb.append("_15_");
        sb.append(System.currentTimeMillis() / 1000);
        sb.append(C18115b5.CONNECTOR);
        sb.append((CharSequence) sb2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m76784b(String str) {
        return (str == null || str.isEmpty()) ? "12000" : f53405a.get(str);
    }
}
