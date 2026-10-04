package com.aspose.words;

import com.huawei.hms.network.embedded.C18358t1;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes6.dex */
final class zzYV4 {
    private static char[] zzXTA = {'*', '%'};
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("framesetSplitbar", "frameLayout", "sz", NoteMeta.PROPERTY_TITLE, "frame", "frameset", "flatBorders", "noBorder", "color", "w", "name", "sourceFileName", "scrollbar", "noResizeAllowed", "linkedToFile", "marH", "marV", "longDesc", "on", "off", "auto");

    private static void zzY(zzYVB zzyvb, Frameset frameset, boolean z) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        while (zzyu4ZzZsD.zzQ("frame")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 2) {
                zzY(frameset, zzyu4ZzZsD.zzV("val", null));
            } else if (iZzTP != 3) {
                switch (iZzTP) {
                    case 10:
                        frameset.setName(zzyu4ZzZsD.zzV("val", null));
                        break;
                    case 11:
                        frameset.zzLf(z ? zzyvb.zzY9(zzyu4ZzZsD.zzV("id", null)) : zzyu4ZzZsD.zzV("val", null));
                        break;
                    case 12:
                        zzZ(frameset, zzyu4ZzZsD.zzV("val", null));
                        break;
                    case 13:
                        frameset.zzVx(zzyu4ZzZsD.zzYyD());
                        break;
                    case 14:
                        frameset.zzVy(zzyu4ZzZsD.zzYyD());
                        break;
                    case 15:
                        frameset.zzAx(zzyu4ZzZsD.zzYyE());
                        break;
                    case 16:
                        frameset.zzAw(zzyu4ZzZsD.zzYyE());
                        break;
                    case 17:
                        break;
                    default:
                        zzyu4ZzZsD.zzk();
                        break;
                }
            } else {
                frameset.setTitle(zzyu4ZzZsD.zzV("val", null));
            }
        }
    }

    public static void zzZ(zzYVB zzyvb, Frameset frameset, boolean z) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        while (zzyu4ZzZsD.zzQ("frameset")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                zzZ(zzyvb, frameset);
            } else if (iZzTP == 1) {
                frameset.zzNL(zzY8T.zzAW(zzyu4ZzZsD.zzV("val", null)));
            } else if (iZzTP == 2) {
                zzY(frameset, zzyu4ZzZsD.zzV("val", null));
            } else if (iZzTP == 3) {
                frameset.setTitle(zzyu4ZzZsD.zzV("val", null));
            } else if (iZzTP == 4) {
                Frameset frameset2 = new Frameset();
                frameset.getChildFramesets().zzY(frameset2);
                zzY(zzyvb, frameset2, z);
            } else if (iZzTP != 5) {
                zzyu4ZzZsD.zzk();
            } else {
                Frameset frameset3 = new Frameset();
                frameset.getChildFramesets().zzY(frameset3);
                zzZ(zzyvb, frameset3, z);
            }
        }
    }

    private static void zzZ(zzYVB zzyvb, Frameset frameset) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYO3 zzyo3ZzZqn = zzyvb.zzZqn();
        while (zzyu4ZzZsD.zzQ("framesetSplitbar")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 6:
                case 7:
                    if (zzyu4ZzZsD.zzYyD()) {
                        frameset.zzAu(zzY8T.zzAX(zzyu4ZzZsD.getLocalName()));
                    }
                    break;
                case 8:
                    frameset.zz3(zzYU3.zzGR(zzyu4ZzZsD.zzV("val", null)));
                    break;
                case 9:
                    frameset.zzAt(zzyu4ZzZsD.zzV(zzyo3ZzZqn));
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
    }

    private static void zzY(Frameset frameset, String str) {
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        if (com.aspose.words.internal.zzZKN.zzW(str, "%", i)) {
            frameset.zzAz(2);
        } else if (com.aspose.words.internal.zzZKN.zzW(str, C18358t1.g.f56183c, i)) {
            frameset.zzAz(3);
        } else {
            frameset.zzAz(1);
        }
        frameset.zzAy(com.aspose.words.internal.zzJB.zzZo(com.aspose.words.internal.zzZKN.zzV(str, zzXTA)));
    }

    private static void zzZ(Frameset frameset, String str) {
        switch (zzUR.zzTP(str)) {
            case 18:
                frameset.zzAv(1);
                return;
            case 19:
                frameset.zzAv(2);
                return;
            case 20:
                frameset.zzAv(0);
                return;
            default:
                throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Invalid scroll type value {0}.", str));
        }
    }
}
