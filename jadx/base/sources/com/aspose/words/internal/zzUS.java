package com.aspose.words.internal;

import com.aspose.slides.PatternStyle;

/* JADX INFO: loaded from: classes5.dex */
final class zzUS extends zzUT {
    private byte[][] zzS1 = {new byte[]{27, 36, 41, 65}, new byte[]{27, 36, 41, 71}, new byte[]{27, 36, PatternStyle.Plaid, 72}, new byte[]{27, 36, 41, 69}, new byte[]{27, 36, PatternStyle.Sphere, 73}, new byte[]{27, 36, PatternStyle.Sphere, 74}, new byte[]{27, 36, PatternStyle.Sphere, 75}, new byte[]{27, 36, PatternStyle.Sphere, 76}, new byte[]{27, 36, PatternStyle.Sphere, 77}, new byte[]{27, 78}, new byte[]{27, 79}};

    @Override // com.aspose.words.internal.zzU1
    public final String getName() {
        return "ISO-2022-CN";
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
