package com.google.firebase.firestore.util;

import androidx.core.content.C21638OooO0Oo;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/* JADX INFO: loaded from: classes8.dex */
public class FileUtil {

    public static class DefaultFileDeleter {
        private DefaultFileDeleter() {
        }

        public static void delete(File file) throws IOException {
            try {
                Files.deleteIfExists(file.toPath());
            } catch (IOException e) {
                throw new IOException("Failed to delete file " + file + ": " + e);
            }
        }
    }

    public static class LegacyFileDeleter {
        private LegacyFileDeleter() {
        }

        public static void delete(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException(C21638OooO0Oo.OooO00o(file, "Failed to delete file "));
            }
        }
    }

    public static void delete(File file) throws IOException {
        DefaultFileDeleter.delete(file);
    }
}
