package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZXG {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW(C18437z2.f56754h, "id");
    private zzZXT zzZ5a;
    private HashMap<Integer, ArrayList<Footnote>> zzYNM = new HashMap<>();
    private HashMap<Integer, ArrayList<Footnote>> zzYNL = new HashMap<>();

    public zzZXG(zzZXT zzzxt) throws Exception {
        this.zzZ5a = zzzxt;
        zzEJ(0);
        zzEJ(1);
    }

    private void zzEJ(int i) throws Exception {
        String strZzZkI;
        HashMap<Integer, ArrayList<Footnote>> map;
        String str;
        boolean z;
        if (i == 0) {
            strZzZkI = this.zzZ5a.zzZmp().zzZkI();
            map = this.zzYNL;
            str = "footnote";
            z = false;
        } else {
            if (i != 1) {
                throw new IllegalStateException("Unknown footnote type.");
            }
            strZzZkI = this.zzZ5a.zzZmp().zzZkH();
            map = this.zzYNM;
            str = "endnote";
            z = true;
        }
        zzZW1 zzzw1ZzNJ = this.zzZ5a.zzNJ(strZzZkI);
        if (zzzw1ZzNJ == null) {
            return;
        }
        zzzw1ZzNJ.zzj();
        String localName = zzzw1ZzNJ.getLocalName();
        while (zzzw1ZzNJ.zzQ(localName)) {
            if (com.aspose.words.internal.zzZKN.equals(zzzw1ZzNJ.getLocalName(), str)) {
                String value = null;
                int iZzv = -1;
                while (zzzw1ZzNJ.zzi()) {
                    int iZzTP = zzUR.zzTP(zzzw1ZzNJ.getLocalName());
                    if (iZzTP == 0) {
                        iZzv = zzZXP.zzv(zzzw1ZzNJ.getValue(), z);
                    } else if (iZzTP != 1) {
                        zzzw1ZzNJ.zzZ(16777216, 9, com.aspose.words.internal.zzZKN.format("Tag or attribute with name '{0}' is unexpected.", zzzw1ZzNJ.getLocalName()));
                    } else {
                        value = zzzw1ZzNJ.getValue();
                    }
                }
                if (com.aspose.words.internal.zzZYD.zzXk(value)) {
                    if (iZzv == -1) {
                        Footnote footnote = new Footnote(this.zzZ5a.getDocument(), i);
                        zzZWW.zzZl2();
                        this.zzZ5a.zzQ(footnote);
                        int iZzZv = com.aspose.words.internal.zzJB.zzZv(value);
                        if (map.containsKey(Integer.valueOf(iZzZv))) {
                            com.aspose.words.internal.zzZQG.zzZ(map.get(Integer.valueOf(iZzZv)), footnote);
                        } else {
                            ArrayList<Footnote> arrayList = new ArrayList<>();
                            com.aspose.words.internal.zzZQG.zzZ(arrayList, footnote);
                            map.put(Integer.valueOf(iZzZv), arrayList);
                        }
                    } else {
                        zzZMS zzzms = new zzZMS(this.zzZ5a.getDocument(), iZzv);
                        zzZWW.zzZl2();
                        this.zzZ5a.zzQ(zzzms);
                        this.zzZ5a.getDocument().zzZpU().zzZ(iZzv, zzzms);
                    }
                }
            } else {
                zzzw1ZzNJ.zzk();
            }
        }
        this.zzZ5a.zzZmi();
    }

    public final Footnote zzXR(int i, int i2) {
        ArrayList<Footnote> arrayList;
        if (i == 0) {
            arrayList = (ArrayList) com.aspose.words.internal.zzQW.zzZ(this.zzYNL, Integer.valueOf(i2));
        } else {
            if (i != 1) {
                throw new IllegalStateException("Unknown footnote type.");
            }
            arrayList = (ArrayList) com.aspose.words.internal.zzQW.zzZ(this.zzYNM, Integer.valueOf(i2));
        }
        if (arrayList == null) {
            return null;
        }
        for (Footnote footnote : arrayList) {
            if (footnote.getParentNode() == null) {
                return footnote;
            }
        }
        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("There are several references to the footnote with ID {0}.", Integer.valueOf(i2)));
    }
}
