package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public interface zzZHD {

    public static class zzZ implements zzZHD {
        private static final zzZ zzWQp = new zzZ();

        public static zzZ zzXPU() {
            return zzWQp;
        }

        @Override // com.aspose.words.internal.zzZHD
        public final char zzha(int i) throws IOException {
            if (i == 0) {
                throw new IOException("Invalid null character in text to output");
            }
            if (i < 32 || (i >= 127 && i <= 159)) {
                throw new IOException("Invalid white space character (0x" + Integer.toHexString(i) + ") in text to output (in xml 1.1, could output as a character entity)");
            }
            if (i > 1114111) {
                throw new IOException("Illegal unicode character point (0x" + Integer.toHexString(i) + ") to output; max is 0x10FFFF as per RFC 3629");
            }
            if (i >= 55296 && i <= 57343) {
                throw new IOException("Illegal surrogate pair -- can only be output via character entities, which are not allowed in this content");
            }
            throw new IOException("Invalid XML character (0x" + Integer.toHexString(i) + ") in text to output");
        }
    }

    char zzha(int i) throws IOException;
}
