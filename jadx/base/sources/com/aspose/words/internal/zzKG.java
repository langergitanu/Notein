package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzKG implements zzGR, zzGT {
    private String zzBX;
    private String zzZS;

    public zzKG(String str) {
        this(str, str);
    }

    @Override // com.aspose.words.internal.zzGR
    public final String getCacheKeyInternal() {
        return this.zzBX;
    }

    @Override // com.aspose.words.internal.zzGT
    public final String getFileName() {
        return this.zzZS;
    }

    @Override // com.aspose.words.internal.zzGR
    public final String getFilePath() {
        return this.zzZS;
    }

    @Override // com.aspose.words.internal.zzGR
    public final byte[] getFontBytes() throws Exception {
        zzZOP zzzopOpenStream = openStream();
        try {
            return zzZYQ.zzZX(zzzopOpenStream);
        } finally {
            if (zzzopOpenStream != null) {
                zzzopOpenStream.close();
            }
        }
    }

    @Override // com.aspose.words.internal.zzGR
    public final int getSize() {
        return (int) new zzZOT(this.zzZS).getLength();
    }

    @Override // com.aspose.words.internal.zzGR
    public final zzZOP openStream() throws Exception {
        return zzZOU.zzVj(this.zzZS);
    }

    public zzKG(String str, String str2) {
        this.zzZS = str;
        this.zzBX = str2;
    }
}
