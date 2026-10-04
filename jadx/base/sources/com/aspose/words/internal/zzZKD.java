package com.aspose.words.internal;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZKD extends zzZKC {
    private FileChannel zzZPc;

    public zzZKD(FileInputStream fileInputStream) throws IOException {
        super(fileInputStream);
        this.zzZPc = fileInputStream.getChannel();
    }

    @Override // com.aspose.words.internal.zzZKC, com.aspose.words.internal.zzZOP
    public final long getPosition() throws IOException {
        return this.zzZPc.position();
    }

    @Override // com.aspose.words.internal.zzZKC, com.aspose.words.internal.zzZOP
    public final void zzH(long j) throws IOException {
        this.zzZPc.position(j);
    }
}
