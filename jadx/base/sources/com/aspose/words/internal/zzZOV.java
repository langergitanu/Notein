package com.aspose.words.internal;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class zzZOV {
    static final /* synthetic */ boolean zzVr = true;

    private static File[] zzVm(String str) {
        return zzZ(new File(str));
    }

    public static String[] zzVn(String str) {
        File[] fileArrZzVm = zzVm(str);
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrZzVm) {
            if (file.isDirectory()) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] zzVo(String str) {
        File[] fileArrZzVm = zzVm(str);
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrZzVm) {
            if (file.isFile()) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void zzVp(String str) {
        new File(str).mkdirs();
    }

    public static boolean zzYb(String str) {
        return new File(str).isDirectory();
    }

    private static File[] zzZ(File file) {
        File[] fileArrListFiles = file.listFiles();
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }
}
