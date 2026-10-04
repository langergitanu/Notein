package com.google.common.p563io;

import com.google.common.p563io.TempFileCreator;
import java.nio.file.attribute.FileAttribute;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO0O0 implements TempFileCreator.JavaNioCreator.PermissionSupplier {
    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
    public final FileAttribute get() {
        return TempFileCreator.JavaNioCreator.lambda$static$1();
    }
}
