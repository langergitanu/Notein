package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;

/* JADX INFO: loaded from: classes6.dex */
final class zzMT {
    public static void zzZ(zzPS zzps, Shape shape, zzQN zzqn) {
        zzPT zzptZzSx = zzps.zzSx(RequestParameters.POSITION);
        if (zzptZzSx != null && zzptZzSx.zzZWj().zzP(zzL4.zzZkR)) {
            shape.setWrapType(3);
            double dZzSD = zzps.zzSD("z-index");
            if (!com.aspose.words.internal.zzAN.zzZC(dZzSD)) {
                int iZze = com.aspose.words.internal.zzQO.zze(dZzSD);
                if (iZze < 0) {
                    shape.setBehindText(true);
                    iZze += 65535;
                } else {
                    shape.setBehindText(false);
                    shape.setZOrder(iZze);
                }
                if (((Paragraph) shape.zzYBd()).getParentStory() instanceof HeaderFooter) {
                    iZze += 65536;
                }
                shape.setZOrder(iZze);
            }
            double dZzSH = zzps.zzSH("left");
            if (com.aspose.words.internal.zzAN.zzZC(dZzSH)) {
                dZzSH = zzqn.zzZWS().getValue();
            }
            double dZzSH2 = zzps.zzSH("margin-left");
            if (!com.aspose.words.internal.zzAN.zzZC(dZzSH2)) {
                dZzSH += dZzSH2;
            }
            shape.setLeft(dZzSH);
            double value = zzqn.zzZWQ().getValue();
            double dZzSH3 = zzps.zzSH("margin-top");
            if (!com.aspose.words.internal.zzAN.zzZC(dZzSH3)) {
                value += dZzSH3;
            }
            shape.setTop(value);
        }
    }
}
