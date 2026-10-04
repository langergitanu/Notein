package com.aspose.words;

import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public abstract class StreamFontSource extends FontSourceBase implements com.aspose.words.internal.zzGP, com.aspose.words.internal.zzGR {
    private String zzBX;
    private int zzVf;

    public StreamFontSource() {
    }

    public String getCacheKey() {
        return this.zzBX;
    }

    @Override // com.aspose.words.internal.zzGR
    @ReservedForInternalUse
    @Deprecated
    public String getCacheKeyInternal() {
        return this.zzBX;
    }

    @Override // com.aspose.words.internal.zzGR
    @ReservedForInternalUse
    @Deprecated
    public String getFilePath() {
        return null;
    }

    @Override // com.aspose.words.internal.zzGR
    @ReservedForInternalUse
    @Deprecated
    public byte[] getFontBytes() throws Exception {
        com.aspose.words.internal.zzZOP zzzopZzY = com.aspose.words.internal.zzZOP.zzY(openFontDataStream());
        try {
            return com.aspose.words.internal.zzZYQ.zzZX(zzzopZzY);
        } finally {
            if (zzzopZzY != null) {
                zzzopZzY.close();
            }
        }
    }

    @Override // com.aspose.words.FontSourceBase, com.aspose.words.internal.zzGP
    @ReservedForInternalUse
    @Deprecated
    public Iterable<com.aspose.words.internal.zzGR> getFontDataInternal() {
        return com.aspose.words.internal.zzZKV.zzZY(new com.aspose.words.internal.zzGR[]{this});
    }

    @Override // com.aspose.words.internal.zzGR
    @ReservedForInternalUse
    @Deprecated
    public int getSize() {
        return this.zzVf;
    }

    @Override // com.aspose.words.FontSourceBase
    public final int getType() {
        return 4;
    }

    public abstract InputStream openFontDataStream() throws Exception;

    @Override // com.aspose.words.internal.zzGR
    public com.aspose.words.internal.zzZOP openStream() throws Exception {
        com.aspose.words.internal.zzZOP zzzopZzY = com.aspose.words.internal.zzZOP.zzY(openFontDataStream());
        try {
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
            com.aspose.words.internal.zzZYQ.zzX(zzzopZzY, zzzor);
            zzzor.zzH(0L);
            this.zzVf = (int) zzzor.getLength();
            return zzzor;
        } finally {
            if (zzzopZzY != null) {
                zzzopZzY.close();
            }
        }
    }

    public StreamFontSource(int i) {
        super(i);
    }

    public StreamFontSource(int i, String str) {
        super(i);
        this.zzBX = str;
    }
}
