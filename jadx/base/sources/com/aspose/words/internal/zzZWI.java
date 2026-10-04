package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzZWI {
    public static String zzYW(long j) {
        ArrayList<Integer> arrayListZzQ = zzIU.zzQ(j, 1);
        StringBuilder sb = new StringBuilder();
        for (int size = arrayListZzQ.size() - 1; size >= 0; size--) {
            sb.append("๐๑๒๓๔๕๖๗๘๙".charAt(arrayListZzQ.get(size).intValue()));
        }
        return sb.toString();
    }
}
