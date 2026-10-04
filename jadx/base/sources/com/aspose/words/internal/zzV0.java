package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.backup.BackupEvent;

/* JADX INFO: loaded from: classes5.dex */
final class zzV0 {
    private boolean zzSn;
    private int zzTL;
    private byte[] zzTZ;

    public zzV0(byte[] bArr) {
        this.zzTZ = bArr;
    }

    private zzWG zzUr() {
        return zzWF.zzZj(((readByte() & 255) << 8) | (readByte() & 255));
    }

    private zzWG zzUs() {
        return zzWF.zzZi(((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255));
    }

    public final boolean canRead() {
        return this.zzTL < this.zzTZ.length;
    }

    public final byte readByte() {
        if (!canRead()) {
            this.zzSn = true;
            return (byte) 0;
        }
        byte[] bArr = this.zzTZ;
        int i = this.zzTL;
        this.zzTL = i + 1;
        return bArr[i];
    }

    public final zzWG zzUJ() {
        byte b = readByte();
        if (b == 12) {
            return zzWE.zzZh((readByte() & 255) + 1200);
        }
        int i = b & 255;
        return (i <= 27 || (i >= 29 && i <= 31)) ? zzWE.zzZh(i) : b == 28 ? zzUr() : (i < 32 || i > 246) ? (i < 247 || i > 250) ? (i < 251 || i > 254) ? zzUs() : zzWF.zzZj(((-((i - StyleIdentifier.MEDIUM_LIST_1_ACCENT_6) * 256)) - (readByte() & 255)) + BackupEvent.ERROR_UID_NOT_EXIST) : zzWF.zzZj(((i - StyleIdentifier.LIGHT_LIST_ACCENT_6) * 256) + (readByte() & 255) + 108) : zzWF.zzZj(i - 139);
    }

    public final boolean zzUq() {
        return this.zzSn;
    }
}
