package com.aspose.words.internal;

import com.microsoft.identity.common.java.AuthenticationConstants;

/* JADX INFO: loaded from: classes5.dex */
public enum zzZ4I implements zzZ5O {
    ASCII { // from class: com.aspose.words.internal.zzZ4I.1
        @Override // com.aspose.words.internal.zzZ5O
        public final String getType() {
            return AuthenticationConstants.ENCODING_ASCII_STRING;
        }

        @Override // com.aspose.words.internal.zzZ5O
        public final byte[] zzI(char[] cArr) {
            return zzYUN.zzH(cArr);
        }
    },
    UTF8 { // from class: com.aspose.words.internal.zzZ4I.2
        @Override // com.aspose.words.internal.zzZ5O
        public final String getType() {
            return "UTF8";
        }

        @Override // com.aspose.words.internal.zzZ5O
        public final byte[] zzI(char[] cArr) {
            return zzYUN.zzG(cArr);
        }
    },
    PKCS12 { // from class: com.aspose.words.internal.zzZ4I.3
        @Override // com.aspose.words.internal.zzZ5O
        public final String getType() {
            return "PKCS12";
        }

        @Override // com.aspose.words.internal.zzZ5O
        public final byte[] zzI(char[] cArr) {
            return zzYUN.zzF(cArr);
        }
    };

    /* synthetic */ zzZ4I(byte b) {
        this();
    }
}
