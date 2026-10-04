package com.google.mlkit.vision.text.pipeline;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcr;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnx;
import com.google.android.libraries.vision.visionkit.pipeline.zbbd;
import com.google.android.libraries.vision.visionkit.pipeline.zbbe;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
final class zbj {
    public static zbbe zba(ByteBuffer byteBuffer, zbnx zbnxVar) {
        zbbd zbbdVar = new zbbd();
        zbbdVar.zba(byteBuffer.array());
        zbbdVar.zbf(zbb(zbnxVar.zbc()));
        zbbdVar.zbb(new zbcr(zbnxVar.zbd(), zbnxVar.zba()));
        zbbdVar.zbc(zbnxVar.zbe() * 1000);
        zbbdVar.zbe(2);
        return zbbdVar.zbd();
    }

    public static int zbb(int i) {
        if (i == 1) {
            return 4;
        }
        if (i != 2) {
            return i != 3 ? 1 : 2;
        }
        return 3;
    }
}
