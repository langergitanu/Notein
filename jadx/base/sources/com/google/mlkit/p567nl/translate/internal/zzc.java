package com.google.mlkit.p567nl.translate.internal;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzc {
    public static synchronized void zza(File file) throws IOException {
        try {
            if (file.exists()) {
                if (!file.isDirectory()) {
                    throw new IOException(String.valueOf(file).concat(" exists, but is not a directory"));
                }
            } else if (!file.mkdirs()) {
                throw new IOException("Can not create directory ".concat(String.valueOf(file)));
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzc(File file, boolean z) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                zzc(file2, true);
            }
        }
        return !z || file.delete();
    }
}
