package com.aspose.words.internal;

import com.aspose.words.NativeLibSettings;
import com.aspose.words.internal.zzZHU;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZHO extends zzZHU {
    @Override // com.aspose.words.internal.zzZHU
    public final boolean load() {
        if (zzZHU.zzss() && NativeLibSettings.isWinNativeLibLoaded()) {
            return super.load();
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzZHU
    public final String zzcA() {
        return "/com/aspose/words/resources/";
    }

    @Override // com.aspose.words.internal.zzZHU
    public final String zzcB() {
        return "/com/aspose/words/resources/";
    }

    @Override // com.aspose.words.internal.zzZHU
    public final zzZHU.zzZ[] zzcC() {
        return new zzZHU.zzZ[]{new zzZHU.zzZ("WindowsNativeCall_x64", "e1d6f3dd96b1a94507b756c83dc2866a6b1b2c38fcd281bfbe3de19ebd870f489ab5f9582c301cae2de26d4c8204fae28183ff981e66ca3fa3823dd21ab833fe")};
    }

    @Override // com.aspose.words.internal.zzZHU
    public final zzZHU.zzZ[] zzcD() {
        return new zzZHU.zzZ[]{new zzZHU.zzZ("WindowsNativeCall_x86", "1ee6fddcc1ed34e967ca9fc8707c0f144ea9ef669a6641138a8bbbd5a4526d5ce142aac475f3bc5e1796beb6f50564b02c34d2737e6fadf6903f5e99f59f25ca")};
    }

    @Override // com.aspose.words.internal.zzZHU
    public final String zzcE() {
        return "WindowsNativeCall";
    }
}
