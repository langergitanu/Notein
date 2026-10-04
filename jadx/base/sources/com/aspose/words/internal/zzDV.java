package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzDV extends zzDQ {
    private static final zzZHW zzUR = new zzZHW("definitions", "trace", "traceGroup", "annotationXML", "context", "brush");

    private zzDV(zzDO zzdo) {
        super(zzdo);
    }

    public static zzDW zz9(zzZOP zzzop) throws Exception {
        return new zzDV(new zzDO(new zzO(zzzop))).zzDh();
    }

    private zzDW zzDh() throws Exception {
        zzDW zzdw = new zzDW();
        while (zzD9().zzQ("ink")) {
            int iZzTP = zzUR.zzTP(zzD9().getLocalName());
            if (iZzTP == 0) {
                zzY(zzdw);
            } else if (iZzTP == 1) {
                zzZQG.zzZ((ArrayList<zzDL>) zzdw.zzDi(), zzDE.zzT(zzD8()));
            } else if (iZzTP == 2) {
                zzZQG.zzZ((ArrayList<zzDH>) zzdw.zzDi(), zzDG.zzU(zzD8()));
            }
        }
        return zzdw;
    }

    private void zzY(zzDW zzdw) throws Exception {
        while (zzD9().zzQ("definitions")) {
            int iZzTP = zzUR.zzTP(zzD9().getLocalName());
            if (iZzTP == 4) {
                zzZQG.zzZ(zzdw.zzDk(), zzE1.zzX(zzD8()));
            } else if (iZzTP == 5) {
                zzZQG.zzZ(zzdw.zzDj(), zzEC.zzZ(zzD8()));
            }
        }
    }
}
