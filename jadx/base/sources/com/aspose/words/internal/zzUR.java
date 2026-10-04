package com.aspose.words.internal;

import com.aspose.slides.PatternStyle;
import com.google.common.primitives.SignedBytes;

/* JADX INFO: loaded from: classes5.dex */
final class zzUR extends zzUT {
    private byte[][] zzS1 = {new byte[]{27, 36, 40, 67}, new byte[]{27, 36, 40, 68}, new byte[]{27, 36, SignedBytes.MAX_POWER_OF_TWO}, new byte[]{27, 36, 65}, new byte[]{27, 36, 66}, new byte[]{27, 38, SignedBytes.MAX_POWER_OF_TWO}, new byte[]{27, 40, 66}, new byte[]{27, 40, 72}, new byte[]{27, 40, 73}, new byte[]{27, 40, 74}, new byte[]{27, PatternStyle.Divot, 65}, new byte[]{27, PatternStyle.Divot, 70}};

    @Override // com.aspose.words.internal.zzU1
    public final String getName() {
        return "ISO-2022-JP";
    }

    @Override // com.aspose.words.internal.zzU1
    public final zzUP zzZ(zzUU zzuu) {
        int iZzZ = zzUT.zzZ(zzuu.zzUg(), zzuu.zzUe(), this.zzS1);
        if (iZzZ == 0) {
            return null;
        }
        return new zzUP(this, iZzZ);
    }
}
