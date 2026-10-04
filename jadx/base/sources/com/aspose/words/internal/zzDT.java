package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzDT extends zzDQ {
    private static final zzZHW zzUR = new zzZHW("traceFormat", "channelProperties");

    private zzDT(zzDO zzdo) {
        super(zzdo);
    }

    private zzDU zzDe() {
        String strZzV = zzD9().zzV("id", "");
        if (zzZKN.zzU3(strZzV)) {
            throw new IllegalStateException();
        }
        zzDU zzdu = null;
        while (zzD9().zzQ("inkSource")) {
            int iZzTP = zzUR.zzTP(zzD9().getLocalName());
            if (iZzTP == 0) {
                zzdu = new zzDU(zzDI.zzV(zzD8()));
                zzD8().zzD6().zzW(strZzV, zzdu);
            } else {
                if (iZzTP != 1) {
                    throw new zzDS("Invalid inkSource element.");
                }
                zzdu.zzU(zzE8.zzY(zzD8()));
            }
        }
        return zzdu;
    }

    public static zzDU zzW(zzDO zzdo) {
        return new zzDT(zzdo).zzDe();
    }
}
