package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzDG extends zzDQ {
    private static final zzZHW zzUR = new zzZHW("trace", "traceGroup");

    private zzDG(zzDO zzdo) {
        super(zzdo);
    }

    private zzDH zzCV() {
        zzDH zzdh = new zzDH();
        while (zzD9().zzQ("traceGroup")) {
            int iZzTP = zzUR.zzTP(zzD9().getLocalName());
            if (iZzTP == 0) {
                zzZQG.zzZ((ArrayList<zzDL>) zzdh.zzQw(), zzDE.zzT(zzD8()));
            } else if (iZzTP == 1) {
                zzZQG.zzZ((ArrayList<zzDH>) zzdh.zzQw(), zzU(zzD8()));
            }
        }
        return zzdh;
    }

    public static zzDH zzU(zzDO zzdo) {
        return new zzDG(zzdo).zzCV();
    }
}
