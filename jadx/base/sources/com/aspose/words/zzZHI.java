package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18358t1;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes6.dex */
final class zzZHI {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("frame", "frameset", "yes", TranslateLanguage.NORWEGIAN, "auto");
    private zzZFF zzYpP;
    private Document zzZEY;
    private String zzZp0;

    public zzZHI(Document document, String str, zzZFF zzzff) {
        this.zzZEY = document;
        this.zzZp0 = str;
        this.zzYpP = zzzff;
    }

    private void zzY(zzZIG zzzig, Frameset frameset) throws Exception {
        frameset.setTitle(zzzig.zzZ2B().getAttributeValue(NoteMeta.PROPERTY_TITLE, ""));
        frameset.setName(zzzig.zzZ2B().getAttributeValue("name", ""));
        frameset.zzAx(zzzig.zzZ2B().zzZR("marginwidth", 0));
        frameset.zzAw(zzzig.zzZ2B().zzZR("marginheight", 0));
        if (zzzig.zzZ2B().zzZR("frameborder", 0) == 1) {
            frameset.zzAu(1);
            frameset.zzAt(com.aspose.words.internal.zzSA.zzr(4.5d));
        }
        frameset.zzVx("noresize".equals(zzzig.zzZ2B().getAttributeValue("noresize", "")));
        int iZzTP = zzUR.zzTP(zzzig.zzZ2B().getAttributeValue("scrolling", ""));
        if (iZzTP == 2) {
            frameset.zzAv(1);
        } else if (iZzTP == 3) {
            frameset.zzAv(2);
        } else if (iZzTP == 4) {
            frameset.zzAv(0);
        }
        String strZzJT = zzZDY.zzJT(zzzig.zzZ2B().getAttributeValue("src", ""));
        if (com.aspose.words.internal.zzZKN.equals(strZzJT, "")) {
            return;
        }
        frameset.zzLf(strZzJT);
        frameset.zzYc(this.zzYpP.zzZ3(this.zzZp0, strZzJT));
    }

    private void zzZ(zzZIG zzzig, Frameset frameset) throws Exception {
        String[] strArrZzR = new String[0];
        String attributeValue = zzzig.zzZ2B().getAttributeValue("cols", "");
        if (com.aspose.words.internal.zzZKN.equals(attributeValue, "")) {
            String attributeValue2 = zzzig.zzZ2B().getAttributeValue("rows", "");
            if (!com.aspose.words.internal.zzZKN.equals(attributeValue2, "")) {
                frameset.zzNL(0);
                strArrZzR = com.aspose.words.internal.zzZKN.zzR(attributeValue2, ',');
            }
        } else {
            frameset.zzNL(1);
            strArrZzR = com.aspose.words.internal.zzZKN.zzR(attributeValue, ',');
        }
        if (strArrZzR.length == 0) {
            strArrZzR = new String[]{C18358t1.g.f56183c};
        }
        int i = 0;
        for (String str : strArrZzR) {
            zzZIG zzzig2 = null;
            while (i < zzzig.zzZ2C().getCount() && zzzig2 == null) {
                zzZIG zzzig3 = (zzZIG) com.aspose.words.internal.zzZKW.zzZ(zzzig.zzZ2C().zzzd(i), zzZIG.class);
                if (zzzig3 != null && ("frame".equals(zzzig3.getName()) || "frameset".equals(zzzig3.getName()))) {
                    zzzig2 = zzzig3;
                }
                i++;
            }
            if (zzzig2 == null) {
                return;
            }
            Frameset frameset2 = new Frameset();
            frameset.getChildFramesets().zzY(frameset2);
            zzZ(str, frameset2);
            int iZzTP = zzUR.zzTP(zzzig2.getName());
            if (iZzTP == 0) {
                zzY(zzzig2, frameset2);
            } else if (iZzTP == 1) {
                zzZ(zzzig2, frameset2);
            }
        }
    }

    public final void zzR(zzZIG zzzig) throws Exception {
        zzzig.getName();
        Frameset frameset = new Frameset();
        zzZ(zzzig, frameset);
        this.zzZEY.zzZ(frameset);
    }

    private static void zzZ(String str, Frameset frameset) {
        zzL4 zzl4ZzSp = zzMV.zzSp(com.aspose.words.internal.zzZKN.zzTX(str));
        if (zzl4ZzSp != null) {
            int valueType = zzl4ZzSp.getValueType();
            if (valueType == 3) {
                frameset.zzAz(1);
                frameset.zzAy((int) ((zzNH) zzl4ZzSp).getDoubleValue());
                return;
            } else if (valueType == 4) {
                frameset.zzAz(1);
                frameset.zzAy((int) ((zzOI) zzl4ZzSp).getDoubleValue());
                return;
            } else if (valueType == 5) {
                frameset.zzAz(2);
                frameset.zzAy((int) ((zzMU) zzl4ZzSp).getDoubleValue());
                return;
            }
        }
        frameset.zzAz(3);
    }
}
