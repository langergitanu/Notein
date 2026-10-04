package com.aspose.words;

import com.aspose.words.ref.Ref;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYS0 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("paragraphs", "characterswithspaces");
    private boolean zzXPH;
    private String zzXPI;
    private String zzXPJ;
    private boolean zzXPK = true;
    private boolean zzXPL;
    private zzYPT zzXQV;
    private zzYTN zzXQW;
    private zzYRM zzXRP;
    private zzYOW zzXRR;
    private zzYPM zzXRS;
    private zzYOR zzXRT;
    private String zzYDW;
    private String zzYDX;
    private Field zzZz7;

    public zzYS0(zzYOR zzyor, zzYPM zzypm, zzYTN zzytn, zzYPT zzypt, zzYOW zzyow, zzYRM zzyrm) {
        this.zzXRT = zzyor;
        this.zzXRS = zzypm;
        this.zzXQW = zzytn;
        this.zzXQV = zzypt;
        this.zzXRR = zzyow;
        this.zzXRP = zzyrm;
    }

    private void zzA(FieldChar fieldChar) throws Exception {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        Paragraph parentParagraph = fieldChar.getParentParagraph();
        String strZzYA = this.zzXRT.zzYA(parentParagraph);
        if (!fieldChar.zz9I()) {
            zzytgZzYsG.zzo();
        }
        zzytgZzYsG.zzo();
        zzytgZzYsG.zzp();
        this.zzXRT.zzV(parentParagraph, strZzYA);
    }

    private void zzB(FieldChar fieldChar) throws Exception {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        Paragraph parentParagraph = fieldChar.getParentParagraph();
        String strZzYA = this.zzXRT.zzYA(parentParagraph);
        this.zzXRS.zzYtN();
        String str = fieldChar.getFieldType() == 8 ? "text:alphabetical-index" : "text:table-of-content";
        if (!fieldChar.zz9I()) {
            zzytgZzYsG.zzo();
        }
        zzytgZzYsG.zzY(str);
        zzY(fieldChar, str);
        zzytgZzYsG.zzY("text:index-body");
        this.zzXRT.zzV(parentParagraph, strZzYA);
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private void zzC(com.aspose.words.FieldChar r4) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aspose.words.zzYS0.zzC(com.aspose.words.FieldChar):void");
    }

    private void zzD(FieldChar fieldChar) {
        this.zzXPL = true;
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzYDX)) {
            this.zzXQW.zzJ(fieldChar);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzYDW)) {
            this.zzXQW.zzJ(fieldChar);
        }
    }

    private void zzE(FieldChar fieldChar) {
        if (zzYOU.zzq(fieldChar)) {
            this.zzXQW.zzV(fieldChar.getParentParagraph(), false, false);
        }
        this.zzXPL = false;
        if (fieldChar.getFieldType() == 59) {
            zzD(fieldChar);
        }
        if (zzs1(fieldChar.getFieldType())) {
            this.zzXPL = true;
            this.zzXQW.zzGG(zzYOU.zzDG(this.zzXPJ));
        }
        if (fieldChar.getFieldType() == 71) {
            zzYwD();
        }
        if (zzs0(fieldChar.getFieldType())) {
            return;
        }
        this.zzXPL = true;
        this.zzXQW.zzJ(fieldChar);
    }

    private void zzEK(String str) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        this.zzXQV.zzYud();
        zzytgZzYsG.zzGB("text:user-defined");
        zzytgZzYsG.zzYt("text:name", str);
        zzytgZzYsG.zzGA("text:user-defined");
        this.zzXQV.zzYuc();
    }

    private void zzEL(String str) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        this.zzXQV.zzYud();
        zzytgZzYsG.zzGB(str);
        zzytgZzYsG.zzYt("style:num-format", zzYOU.zzDE(this.zzXPJ));
        zzytgZzYsG.zzGA(str);
        this.zzXQV.zzYuc();
    }

    private void zzEM(String str) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        this.zzXQV.zzYud();
        zzytgZzYsG.zzGB(str);
        if (this.zzZz7.isLocked()) {
            Ref ref = new Ref(null);
            boolean zZzZ = com.aspose.words.internal.zzZQ9.zzZ(this.zzZz7.getResult(), com.aspose.words.internal.zzZP1.zzj8(), (Ref<com.aspose.words.internal.zzZQ9>) ref);
            com.aspose.words.internal.zzZQ9 zzzq9 = (com.aspose.words.internal.zzZQ9) ref.get();
            if (!zZzZ) {
                zzzq9 = com.aspose.words.internal.zzZQ9.zz35;
            }
            zzytgZzYsG.zzYu("text:date-value", zzzq9.zzY(zzYwq(), com.aspose.words.internal.zzZP1.zzj8()));
            zzytgZzYsG.zzYu("text:fixed", TelemetryEventStrings.Value.TRUE);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzYOU.zzDG(this.zzXPJ))) {
            zzytgZzYsG.zzYt("style:data-style-name", this.zzXRS.zzYtR());
        } else {
            zzytgZzYsG.zzX(">");
        }
        zzytgZzYsG.zzX(this.zzZz7.getResult());
        zzytgZzYsG.zzGA(str);
        this.zzXQV.zzYuc();
    }

    private static ArrayList<String> zzEN(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (str.length() != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.charAt(0));
            for (int i = 1; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (com.aspose.words.internal.zzZKU.zzG(cCharAt) != com.aspose.words.internal.zzZKU.zzG(str.charAt(i - 1))) {
                    com.aspose.words.internal.zzZQG.zzZ(arrayList, sb.toString());
                    sb.setLength(0);
                }
                sb.append(cCharAt);
            }
            if (sb.length() > 0) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, sb.toString());
            }
        }
        return arrayList;
    }

    private boolean zzF(FieldChar fieldChar) {
        int fieldType = fieldChar.getFieldType();
        if (fieldType == 24) {
            zzb("text:editing-cycles", false);
        } else if (fieldType == 25) {
            zzb("text:editing-duration", false);
        } else if (fieldType == 60) {
            zzb("text:author-name", false);
        } else if (fieldType != 61) {
            switch (fieldType) {
                case 15:
                    zzb("text:title", true);
                    break;
                case 16:
                    zzb("text:subject", false);
                    break;
                case 17:
                    zzb("text:initial-creator", true);
                    break;
                case 18:
                    zzb("text:keywords", false);
                    break;
                case 19:
                    zzb("text:description", false);
                    break;
                case 20:
                    zzb("text:creator", true);
                    break;
                default:
                    return false;
            }
        } else {
            zzb("text:author-initials", false);
        }
        return true;
    }

    private boolean zzG(FieldChar fieldChar) {
        int fieldType = fieldChar.getFieldType();
        if (fieldType == 31) {
            zzEM("text:date");
            return true;
        }
        if (fieldType == 32) {
            zzEM("text:time");
            return true;
        }
        switch (fieldType) {
            case 21:
                zzEM("text:creation-date");
                return true;
            case 22:
                zzEM("text:modification-date");
                return true;
            case 23:
                zzEM("text:print-date");
                return true;
            default:
                return false;
        }
    }

    private boolean zzH(FieldChar fieldChar) {
        int fieldType = fieldChar.getFieldType();
        if (fieldType == 41) {
            zzYwx();
            return true;
        }
        if (fieldType == 44) {
            zzYww();
            return true;
        }
        if (fieldType != 59) {
            return false;
        }
        zzYwy();
        return true;
    }

    private boolean zzI(FieldChar fieldChar) {
        int fieldType = fieldChar.getFieldType();
        if (fieldType == 26) {
            zzEL("text:page-count");
            return true;
        }
        if (fieldType != 27) {
            return false;
        }
        zzEL("text:word-count");
        return true;
    }

    private boolean zzJ(FieldChar fieldChar) {
        int fieldType = fieldChar.getFieldType();
        if (fieldType == 70) {
            zzV(((FieldStart) fieldChar).zzZcg());
            return true;
        }
        if (fieldType == 71) {
            zzu(fieldChar);
            return true;
        }
        if (fieldType != 83) {
            return false;
        }
        zzU(((FieldStart) fieldChar).zzZcg());
        return true;
    }

    private boolean zzK(FieldChar fieldChar) {
        return zzF(fieldChar) || zzG(fieldChar) || zzH(fieldChar) || zzJ(fieldChar) || zzI(fieldChar);
    }

    private void zzL(FieldChar fieldChar) throws Exception {
        this.zzXPL = true;
        if (zzK(fieldChar)) {
            return;
        }
        int fieldType = fieldChar.getFieldType();
        if (fieldType != 3) {
            if (fieldType == 4) {
                zzYwA();
                return;
            }
            if (fieldType == 6) {
                zzYwr();
                return;
            }
            if (fieldType != 8) {
                if (fieldType == 33) {
                    zzYwn();
                    return;
                }
                if (fieldType != 37) {
                    if (fieldType == 64) {
                        zzYwm();
                        return;
                    }
                    if (fieldType == 88) {
                        zzYwp();
                        return;
                    }
                    if (fieldType == 12) {
                        zzYwo();
                        return;
                    }
                    if (fieldType != 13) {
                        if (fieldType == 29) {
                            zzYwB();
                            return;
                        }
                        if (fieldType == 30) {
                            zzYwz();
                            return;
                        }
                        if (fieldType == 84) {
                            zzYwk();
                            return;
                        }
                        if (fieldType == 85) {
                            zzYwC();
                            return;
                        }
                        zzC(fieldChar);
                        this.zzXPL = false;
                        if (zzs0(fieldChar.getFieldType())) {
                            return;
                        }
                        this.zzXQV.zzYud();
                        return;
                    }
                }
            }
            zzB(fieldChar);
            return;
        }
        zzz(fieldChar);
    }

    private boolean zzO(FieldEnd fieldEnd) {
        if (this.zzXRT.zzYsC() != 6) {
            return !(zzv(fieldEnd) || zzYOU.zzq(fieldEnd)) || (fieldEnd.getParentNode() instanceof SmartTag);
        }
        return true;
    }

    private boolean zzP(FieldEnd fieldEnd) {
        if (zzYOU.zzq(fieldEnd)) {
            return false;
        }
        return this.zzXRT.zzYsl() > 1 || (fieldEnd.getFieldType() == 88 && this.zzXRT.zzYsl() > 0);
    }

    private boolean zzQ(FieldEnd fieldEnd) {
        return (zzrZ(fieldEnd.getFieldType()) || (zzYOU.zzJ(this.zzXPJ, this.zzXRT.getDocument().getBaseUri(), false) == null && fieldEnd.getFieldType() == 88)) ? false : true;
    }

    private void zzR(FieldEnd fieldEnd) {
        if (zzYOU.zzq(fieldEnd)) {
            this.zzXQW.zzV(fieldEnd.getParentParagraph(), false, false);
        }
    }

    private void zzU(FormField formField) {
        if (formField == null || this.zzXRT.zzYsI().isStrictSchema11()) {
            return;
        }
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        this.zzXQV.zzYud();
        zzytgZzYsG.zzX("<text:drop-down>");
        for (String str : formField.getDropDownItems()) {
            zzytgZzYsG.zzGB("text:label");
            zzytgZzYsG.zzYt("text:value", str);
            zzytgZzYsG.zzGA("text:label");
        }
        zzytgZzYsG.writeString(formField.zzZ6Q());
        zzytgZzYsG.zzGA("text:drop-down");
        this.zzXQV.zzYuc();
    }

    private void zzV(FormField formField) {
        if (formField == null) {
            return;
        }
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        this.zzXQV.zzYud();
        zzytgZzYsG.zzGB("text:text-input");
        zzytgZzYsG.zzYt("text:description", formField.zzZ6O().getName());
        ArrayList<String> arrayListZzEN = zzEN(formField.getResult());
        int i = 0;
        while (i < arrayListZzEN.size()) {
            String str = arrayListZzEN.get(i);
            if (com.aspose.words.internal.zzZYD.zzXd(str)) {
                zzR(str.length(), i == 0, i == arrayListZzEN.size() - 1);
            } else {
                zzytgZzYsG.writeString(str);
            }
            i++;
        }
        zzytgZzYsG.zzGA("text:text-input");
        this.zzXQV.zzYuc();
    }

    private static boolean zzW(int i, Node node) {
        return i == 0 && node.getNodeType() != 23 && com.aspose.words.internal.zzZYD.zzXk(com.aspose.words.internal.zzZKN.zzS(node.getText(), ControlChar.SPACE_CHAR));
    }

    private void zzY(FieldChar fieldChar, String str) {
        int iZzZv;
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        String str2 = com.aspose.words.internal.zzZKN.format("{0}-source", str);
        String str3 = com.aspose.words.internal.zzZKN.format("{0}-entry-template", str);
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(com.aspose.words.internal.zzZKN.zzS(zzYOU.zzYd(this.zzXPJ, "o"), '\"'), '-');
        int i = fieldChar.getFieldType() == 13 ? 19 : 10;
        zzytgZzYsG.zzY(str2);
        if (strArrZzR.length > 1) {
            zzytgZzYsG.zz0("text:outline-level", strArrZzR[1]);
            iZzZv = com.aspose.words.internal.zzJB.zzZv(strArrZzR[1]);
        } else {
            iZzZv = 9;
            zzytgZzYsG.zzZj("text:outline-level", 9);
        }
        zzytgZzYsG.zzZ("text:index-title-template", (String) null);
        for (int i2 = 0; i2 < iZzZv; i2++) {
            zzu(str3, i2, i);
        }
        zzytgZzYsG.zzo();
    }

    private void zzYwA() {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(com.aspose.words.internal.zzZKN.zzS(this.zzXPJ.replace("XE", "").replace("\"", ""), ControlChar.SPACE_CHAR), ':');
        int length = strArrZzR.length;
        zzytgZzYsG.zzY("text:alphabetical-index-mark");
        if (length > 0) {
            zzytgZzYsG.zz0(length == 1 ? "text:string-value" : "text:key1", strArrZzR[0]);
            if (length > 1) {
                zzytgZzYsG.zz0(length == 2 ? "text:string-value" : "text:key2", strArrZzR[1]);
                if (length > 2) {
                    String str = strArrZzR[2];
                    for (int i = 3; i < length; i++) {
                        str = com.aspose.words.internal.zzZKN.format("{0}:{1}", str, strArrZzR[i]);
                    }
                    zzytgZzYsG.zz0("text:string-value", str);
                }
            }
        }
        zzytgZzYsG.zzo();
    }

    private void zzYwB() {
        this.zzXQV.zzYud();
        this.zzXRT.zzYsG().zzGB("text:file-name");
        this.zzXRT.zzYsG().zzYu("text:display", zzYOU.zzDC(this.zzXPJ));
        this.zzXRT.zzYsG().zzX("/>");
        this.zzXQV.zzYuc();
    }

    private void zzYwC() {
        String strZzYd = zzYOU.zzYd(this.zzXPJ, "DOCPROPERTY");
        int iZzTP = zzUR.zzTP(strZzYd.toLowerCase());
        if (iZzTP == 0) {
            zzEL("text:paragraph-count");
        } else if (iZzTP != 1) {
            zzEK(strZzYd);
        } else {
            zzEL("text:character-count");
        }
    }

    private void zzYwD() {
        this.zzXPL = true;
        zzYRO zzyro = new zzYRO();
        zzyro.zzXPe = "top";
        zzyro.zzZfa++;
        this.zzXRP.zzZ(zzyro);
        this.zzXQW.zzYw(this.zzXRS.zzYtT(), "graphic");
        this.zzXRP.zzSr(false);
        this.zzXRT.zzYsG().zzo();
    }

    private String zzYwi() {
        String str = this.zzXPJ;
        return com.aspose.words.internal.zzZKN.zzS(str.substring(com.aspose.words.internal.zzZKN.zzT(str.toLowerCase(), "advance", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) + 7), ControlChar.SPACE_CHAR);
    }

    private boolean zzYwj() {
        String strZzYwi = zzYwi();
        return com.aspose.words.internal.zzZYD.zzXk(strZzYwi) && strZzYwi.indexOf(92) == -1;
    }

    private void zzYwk() {
        this.zzXRT.zz2("Export of FieldType.FieldAdvance is not supported by ODT format.");
        if (zzYwj()) {
            this.zzXQV.zzYud();
            this.zzXRT.zzYsG().writeString(zzYwi());
            this.zzXQV.zzYuc();
        }
    }

    private String zzYwl() {
        return com.aspose.words.internal.zzZKN.zzS(com.aspose.words.internal.zzZKN.zzS(zzYOU.zzYd(this.zzXPJ, "REF"), '\"'), ControlChar.SPACE_CHAR);
    }

    private void zzYwm() {
        String variableName = ((FieldDocVariable) this.zzZz7).getVariableName();
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzY("text:user-field-get");
        zzytgZzYsG.zz0("text:name", variableName);
        zzytgZzYsG.zzp();
    }

    private void zzYwn() {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        this.zzXQV.zzYud();
        zzytgZzYsG.zzGB("text:page-number");
        zzytgZzYsG.zzYu("style:num-format", zzYOU.zzDE(this.zzXPJ));
        zzytgZzYsG.zzYt("text:select-page", "current");
        zzytgZzYsG.zzGA("text:page-number");
        this.zzXQV.zzYuc();
    }

    private void zzYwo() {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        String strZzYd = zzYOU.zzYd(this.zzXPJ, "SEQ");
        this.zzXQV.zzYud();
        zzytgZzYsG.zzGB("text:sequence");
        if (strZzYd != null) {
            zzytgZzYsG.zzYu("text:name", strZzYd);
            zzytgZzYsG.zzYu("text:formula", com.aspose.words.internal.zzZKN.format("ooow:{0}+1", strZzYd));
        }
        zzytgZzYsG.zzYt("style:num-format", zzYOU.zzDE(this.zzXPJ));
    }

    private void zzYwp() {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        String strZzJ = zzYOU.zzJ(this.zzXPJ, this.zzXRT.getDocument().getBaseUri(), false);
        if (strZzJ == null) {
            return;
        }
        if (!this.zzXRT.zzYs4()) {
            this.zzXQV.zzYud();
        }
        zzytgZzYsG.zzGB("text:a");
        zzytgZzYsG.zzYu("xlink:type", "simple");
        String strZzS = com.aspose.words.internal.zzZKN.zzS(com.aspose.words.internal.zzZKN.zzS(zzYOU.zzYd(this.zzXPJ, "\\t"), '\"'), ControlChar.SPACE_CHAR);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzS)) {
            zzytgZzYsG.zzYu("office:target-frame-name", strZzS);
        }
        zzytgZzYsG.zzYt("xlink:href", strZzJ);
    }

    private String zzYwq() {
        String strZzDG = zzYOU.zzDG(this.zzXPJ);
        return com.aspose.words.internal.zzZYD.zzj(strZzDG, "D") < com.aspose.words.internal.zzZYD.zzj(strZzDG, "M") ? "yyyy-dd-MMTHH:mm:ss" : "yyyy-MM-ddTHH:mm:ss";
    }

    private void zzYwr() {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        String strZzDF = zzYOU.zzDF(this.zzXPJ);
        this.zzXQV.zzYud();
        zzytgZzYsG.zzGB("text:variable-set");
        zzytgZzYsG.zzYu("text:name", strZzDF);
        zzytgZzYsG.zzYt("office:value-type", "string");
        zzytgZzYsG.writeString(zzYOU.zzYc(this.zzXPJ, strZzDF));
        zzytgZzYsG.zzGA("text:variable-set");
        this.zzXQV.zzYuc();
        this.zzXPI = strZzDF;
    }

    private boolean zzYws() {
        return this.zzXRT.zzYsl() <= 1 || !this.zzXPL || this.zzXRT.zzYsk();
    }

    private boolean zzYwt() {
        return com.aspose.words.internal.zzZKN.equals(zzYwl(), this.zzXPI) && this.zzXPH;
    }

    private void zzYwu() {
        if (zzYwt()) {
            return;
        }
        this.zzXRT.zzYsG().zzGA("text:bookmark-ref");
        this.zzXPH = false;
    }

    private void zzYwv() {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        if (!this.zzXRT.zzYsp() && !this.zzXRT.zzYso()) {
            zzytgZzYsG.zzYu("text:database-name", "");
        }
        zzytgZzYsG.zzYu("text:table-name", "");
        zzytgZzYsG.zzYt("text:table-type", "table");
    }

    private void zzYww() {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzGB("text:database-row-number");
        zzYwv();
        zzytgZzYsG.zzGA("text:database-row-number");
    }

    private void zzYwx() {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzGB("text:database-next");
        zzYwv();
        zzytgZzYsG.zzGA("text:database-next");
    }

    private void zzYwy() {
        String strZzS = com.aspose.words.internal.zzZKN.zzS(com.aspose.words.internal.zzZKN.zzS(zzYOU.zzYd(this.zzXPJ, "MERGEFIELD"), '\"'), ControlChar.SPACE_CHAR);
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzYDX)) {
            this.zzXRT.zzRW(false);
            this.zzXQV.zzG(new Run(this.zzXRT.getDocument(), this.zzYDX));
            this.zzXRT.zzRW(true);
        }
        this.zzXQV.zzYud();
        zzytgZzYsG.zzGB("text:database-display");
        zzytgZzYsG.zzYu("text:column-name", strZzS);
        zzYwv();
        this.zzXRT.zzYsG().writeString(com.aspose.words.internal.zzZKN.format("«{0}»", strZzS));
        zzytgZzYsG.zzGA("text:database-display");
        this.zzXQV.zzYuc();
    }

    private void zzYwz() {
        zzb(com.aspose.words.internal.zzZKN.format("text:template-name text:display=\"{0}\"", com.aspose.words.internal.zzZKN.zzT(this.zzXPJ, "\\p", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) == -1 ? "name-and-extension" : "full"), true);
    }

    private void zzZ(FieldChar fieldChar, int i) {
        String str = "";
        for (Node nextSibling = fieldChar.getNextSibling(); nextSibling != null && (!(nextSibling instanceof FieldEnd) || i != fieldChar.getFieldType()); nextSibling = nextSibling.zzYB7()) {
            str = com.aspose.words.internal.zzZKN.format("{0}{1}", str, nextSibling.getText());
        }
        this.zzXRT.zzYsG().writeString(str);
    }

    private void zzb(String str, boolean z) {
        String str2 = !z ? " text:fixed=\"false\"" : "";
        this.zzXQV.zzYud();
        this.zzXRT.zzYsG().zzGB(str);
        this.zzXRT.zzYsG().writeString(str2);
        this.zzXRT.zzYsG().zzX("/>");
        this.zzXQV.zzYuc();
    }

    private boolean zzr(FieldChar fieldChar) {
        if (this.zzXRT.zzYsC() == 6) {
            return true;
        }
        if ((this.zzXPK || zzYOU.zzq(fieldChar)) && !(fieldChar.getParentNode() instanceof SmartTag)) {
            return fieldChar.getFieldType() == 71 && zzt(fieldChar) == null;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0050 A[ADDED_TO_REGION, FALL_THROUGH, REMOVE, RETURN] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean zzrY(int r4) {
        /*
            r3 = this;
            boolean r0 = r3.zzXPK
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 3
            r2 = 1
            if (r4 == r0) goto L50
            r0 = 12
            if (r4 == r0) goto L50
            r0 = 37
            if (r4 == r0) goto L46
            r0 = 41
            if (r4 == r0) goto L50
            r0 = 64
            if (r4 == r0) goto L50
            r0 = 77
            if (r4 == r0) goto L50
            r0 = 83
            if (r4 == r0) goto L50
            r0 = 85
            if (r4 == r0) goto L50
            r0 = 6
            if (r4 == r0) goto L50
            r0 = 7
            if (r4 == r0) goto L50
            r0 = 44
            if (r4 == r0) goto L50
            r0 = 45
            if (r4 == r0) goto L50
            r0 = 70
            if (r4 == r0) goto L50
            r0 = 71
            if (r4 == r0) goto L50
            switch(r4) {
                case 15: goto L50;
                case 16: goto L50;
                case 17: goto L50;
                case 18: goto L50;
                case 19: goto L50;
                case 20: goto L50;
                case 21: goto L50;
                case 22: goto L50;
                case 23: goto L50;
                case 24: goto L50;
                case 25: goto L50;
                case 26: goto L50;
                case 27: goto L50;
                default: goto L3f;
            }
        L3f:
            switch(r4) {
                case 29: goto L50;
                case 30: goto L50;
                case 31: goto L50;
                case 32: goto L50;
                case 33: goto L50;
                default: goto L42;
            }
        L42:
            switch(r4) {
                case 59: goto L50;
                case 60: goto L50;
                case 61: goto L50;
                default: goto L45;
            }
        L45:
            return r1
        L46:
            com.aspose.words.zzYOR r4 = r3.zzXRT
            boolean r4 = r4.zzYs4()
            if (r4 != 0) goto L4f
            return r2
        L4f:
            return r1
        L50:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aspose.words.zzYS0.zzrY(int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021 A[ADDED_TO_REGION, FALL_THROUGH, REMOVE, RETURN] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean zzrZ(int r3) {
        /*
            r2 = this;
            boolean r0 = r2.zzs0(r3)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 6
            if (r3 == r0) goto L21
            r0 = 70
            if (r3 == r0) goto L21
            r0 = 71
            if (r3 == r0) goto L21
            switch(r3) {
                case 15: goto L21;
                case 16: goto L21;
                case 17: goto L21;
                case 18: goto L21;
                case 19: goto L21;
                case 20: goto L21;
                case 21: goto L21;
                case 22: goto L21;
                case 23: goto L21;
                case 24: goto L21;
                case 25: goto L21;
                case 26: goto L21;
                case 27: goto L21;
                default: goto L16;
            }
        L16:
            switch(r3) {
                case 29: goto L21;
                case 30: goto L21;
                case 31: goto L21;
                case 32: goto L21;
                case 33: goto L21;
                default: goto L19;
            }
        L19:
            switch(r3) {
                case 59: goto L21;
                case 60: goto L21;
                case 61: goto L21;
                default: goto L1c;
            }
        L1c:
            switch(r3) {
                case 83: goto L21;
                case 84: goto L21;
                case 85: goto L21;
                default: goto L1f;
            }
        L1f:
            r3 = 0
            return r3
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aspose.words.zzYS0.zzrZ(int):boolean");
    }

    private static boolean zzs(FieldChar fieldChar) {
        return (fieldChar.getFieldType() == 88 || zzYOU.zzq(fieldChar)) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0059 A[FALL_THROUGH, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean zzs0(int i) {
        if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4 && i != 13 && i != 14 && i != 34 && i != 35 && i != 47 && i != 48 && i != 56 && i != 57) {
            switch (i) {
                default:
                    switch (i) {
                        case 28:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 68:
                        case 69:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 77:
                        case 79:
                        case 80:
                        case 89:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case FieldType.FIELD_DISPLAY_BARCODE /* 6301 */:
                        case FieldType.FIELD_MERGE_BARCODE /* 6302 */:
                            break;
                        case 83:
                            return this.zzXRT.zzYsI().isStrictSchema11();
                        case 84:
                            return !zzYwj();
                        case 88:
                            return this.zzXRT.zzYs4();
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        default:
                                            switch (i) {
                                                case 50:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case 54:
                                                    break;
                                                default:
                                                    return false;
                                            }
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                            return true;
                                    }
                                case 37:
                                case 38:
                                case 39:
                                    break;
                            }
                            break;
                    }
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    break;
            }
        }
        return true;
    }

    private static boolean zzs1(int i) {
        return i == 22 || i == 21 || i == 23 || i == 31 || i == 32;
    }

    private static boolean zzs2(int i) {
        return i == 3 || i == 37;
    }

    private static FormField zzt(FieldChar fieldChar) {
        Node nextSibling = fieldChar.getNextSibling();
        while (nextSibling != null && nextSibling.getNodeType() != 25) {
            if (nextSibling.getNodeType() == 24) {
                return null;
            }
            nextSibling = nextSibling.getNextSibling();
        }
        return (FormField) nextSibling;
    }

    private void zzu(String str, int i, int i2) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzY(str);
        zzytgZzYsG.zzZj("text:outline-level", i + 1);
        zzytgZzYsG.zz0("text:style-name", zzYS3.zzI(this.zzXRT.getDocument().getStyles().getByStyleIdentifier(i2 + i)));
        zzytgZzYsG.zzZ("text:index-entry-chapter", (String) null);
        zzytgZzYsG.zzZ("text:index-entry-text", (String) null);
        zzytgZzYsG.zzY("text:index-entry-tab-stop");
        zzytgZzYsG.zz0("style:type", "right");
        zzytgZzYsG.zz0("style:leader-char", ".");
        zzytgZzYsG.zzo();
        zzytgZzYsG.zzZ("text:index-entry-page-number", (String) null);
        zzytgZzYsG.zzo();
    }

    private static boolean zzv(FieldChar fieldChar) {
        Paragraph parentParagraph = fieldChar.getParentParagraph();
        int i = 0;
        for (int iIndexOf = parentParagraph.getChildNodes(0, false).indexOf(fieldChar) - 1; iIndexOf >= 0; iIndexOf--) {
            Node node = parentParagraph.getChildNodes(0, false).get(iIndexOf);
            if (node.getNodeType() == 24) {
                i++;
            }
            if (node.getNodeType() == 24 && node.zzYF(fieldChar)) {
                return false;
            }
            if (zzY(fieldChar, node, i)) {
                return true;
            }
            if (node.getNodeType() == 22) {
                i--;
            }
        }
        return false;
    }

    private static boolean zzw(FieldChar fieldChar) {
        Paragraph parentParagraph = fieldChar.getParentParagraph();
        int i = 0;
        for (int iIndexOf = parentParagraph.getChildNodes(0, false).indexOf(fieldChar) + 1; iIndexOf < parentParagraph.getChildNodes(0, false).getCount(); iIndexOf++) {
            Node node = parentParagraph.getChildNodes(0, false).get(iIndexOf);
            if (node.getNodeType() == 22) {
                i++;
            }
            if (node.getNodeType() == 22 && node.zzYF(fieldChar)) {
                return false;
            }
            if (zzZ(fieldChar, node, i)) {
                return true;
            }
            if (node.getNodeType() == 24) {
                i--;
            }
        }
        return false;
    }

    private void zzx(FieldChar fieldChar) {
        int i = 0;
        for (Node nextSibling = fieldChar.getNextSibling(); zzH(nextSibling, i); nextSibling = nextSibling.getNextSibling()) {
            int nodeType = nextSibling.getNodeType();
            if (nodeType == 22) {
                i++;
            } else if (nodeType == 24) {
                i--;
            } else if (zzW(i, nextSibling)) {
                this.zzXPJ = com.aspose.words.internal.zzZKN.zzZI(this.zzXPJ, nextSibling.getText());
            }
        }
    }

    private void zzy(FieldChar fieldChar) {
        this.zzYDX = "";
        this.zzYDW = "";
        this.zzXPJ = "";
        zzx(fieldChar);
        if (fieldChar.getFieldType() == 59) {
            this.zzYDX = com.aspose.words.internal.zzZKN.zzS(zzYOU.zzYd(this.zzXPJ, "\\b"), '\"');
            this.zzYDW = com.aspose.words.internal.zzZKN.zzS(zzYOU.zzYd(this.zzXPJ, "\\f"), '\"');
        }
    }

    private void zzz(FieldChar fieldChar) {
        String strZzYwl = zzYwl();
        FieldEnd fieldEnd = (FieldEnd) com.aspose.words.internal.zzZKW.zzZ(fieldChar.getPreviousSibling(), FieldEnd.class);
        if (fieldEnd != null && fieldEnd.getFieldType() == 6 && com.aspose.words.internal.zzZKN.equals(strZzYwl, this.zzXPI)) {
            this.zzXPH = true;
            return;
        }
        this.zzXPH = false;
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzGB("text:bookmark-ref");
        if (fieldChar.getFieldType() == 37) {
            zzytgZzYsG.zzYu("text:reference-format", "page");
        } else if (com.aspose.words.internal.zzZKN.zzT(this.zzXPJ, " \\p", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) != -1) {
            zzytgZzYsG.zzYu("text:reference-format", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
        } else {
            zzytgZzYsG.zzYu("text:reference-format", "text");
        }
        zzytgZzYsG.zzYt("text:ref-name", strZzYwl);
    }

    public final int visitFieldEnd(FieldEnd fieldEnd) throws Exception {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        if (zzYws()) {
            this.zzXRT.zzRW(false);
        }
        if (zzP(fieldEnd)) {
            zzYOR zzyor = this.zzXRT;
            zzyor.zzr3(zzyor.zzYsl() - 1);
            return 1;
        }
        int fieldType = fieldEnd.getFieldType();
        if (fieldType == 6) {
            this.zzXRT.zzRV(false);
        }
        if (zzO(fieldEnd)) {
            this.zzXRT.zzZ(fieldEnd, (Section) null);
            return 0;
        }
        if (fieldEnd.getParentParagraph().zzZ7D() || !this.zzXRT.zzYsF()) {
            if (this.zzXRT.zzYsE() || this.zzXRT.zzYsC() == 5) {
                zzR(fieldEnd);
            } else {
                this.zzXRR.zzXs(fieldEnd);
                zzZ(fieldEnd, zzytgZzYsG);
                this.zzXRR.zzXr(fieldEnd);
            }
        }
        this.zzXRT.zzZ(fieldEnd, (Section) null);
        if (fieldType == 59) {
            this.zzXRT.zzRU(false);
        }
        if (fieldType != 88 && !zzYOU.zzq(fieldEnd)) {
            zzYOR zzyor2 = this.zzXRT;
            zzyor2.zzr3(zzyor2.zzYsl() - 1);
        }
        if (fieldType == 37) {
            this.zzXRT.zzRR(false);
        }
        if (zzYOU.zzq(fieldEnd)) {
            this.zzXRT.zzRS(false);
        }
        return 0;
    }

    public final int visitFieldSeparator(FieldSeparator fieldSeparator) {
        if (this.zzXRT.zzYsl() > 1 && !this.zzXRT.zzYs4() && this.zzXRT.zzYsl() == 2) {
            return 1;
        }
        if (this.zzXRT.zzYsC() != 6 && (fieldSeparator.getParentParagraph().zzZ7D() || !this.zzXRT.zzYsF())) {
            if (fieldSeparator.getFieldType() == 37) {
                this.zzXRT.zzRR(true);
            }
            this.zzXRT.zzRW(zzrY(fieldSeparator.getFieldType()));
            if (zzR(fieldSeparator)) {
                zzZ(fieldSeparator, fieldSeparator.getFieldType());
            }
            this.zzXRT.zzZ(fieldSeparator, (Section) null);
            if ((fieldSeparator.getParentParagraph().zzZ7D() || !this.zzXRT.zzYsF()) && !this.zzXRT.zzYsE() && this.zzXRT.zzYsC() != 5) {
                this.zzXRR.zzXr(fieldSeparator);
            }
        }
        return 0;
    }

    public final int zzM(FieldChar fieldChar) throws Exception {
        this.zzXRT.zzRW(true);
        this.zzZz7 = fieldChar.getField();
        if (fieldChar.getFieldType() == 4) {
            this.zzXPL = true;
        }
        if (this.zzXRT.zzYsl() > 0) {
            if (zzs(fieldChar)) {
                zzYOR zzyor = this.zzXRT;
                zzyor.zzr3(zzyor.zzYsl() + 1);
            }
            return 1;
        }
        this.zzXPK = zzw(fieldChar);
        if (zzr(fieldChar)) {
            this.zzXRT.zzZ(fieldChar, (Section) null);
            return 0;
        }
        if (fieldChar.getFieldType() == 59) {
            this.zzXRT.zzRU(true);
        }
        if (fieldChar.getFieldType() == 6) {
            this.zzXRT.zzRV(true);
        }
        if (fieldChar.getParentParagraph().zzZ7D() || !this.zzXRT.zzYsF()) {
            if (zzYOU.zzq(fieldChar)) {
                this.zzXRT.zzRS(true);
            }
            zzy(fieldChar);
            if (this.zzXRT.zzYsE()) {
                zzE(fieldChar);
            } else if (this.zzXRT.zzYsC() != 5) {
                this.zzXRR.zzXs(fieldChar);
                zzL(fieldChar);
                this.zzXRR.zzXr(fieldChar);
            }
        }
        this.zzXRT.zzZ(fieldChar, (Section) null);
        if (zzs(fieldChar)) {
            zzYOR zzyor2 = this.zzXRT;
            zzyor2.zzr3(zzyor2.zzYsl() + 1);
        }
        return 0;
    }

    private boolean zzR(FieldSeparator fieldSeparator) {
        return (((!zzs2(fieldSeparator.getFieldType()) || zzYwt()) && fieldSeparator.getFieldType() != 12) || this.zzXRT.zzYsE() || this.zzXRT.zzYsC() == 5 || this.zzXRT.zzYs4()) ? false : true;
    }

    private static boolean zzH(Node node, int i) {
        if (node != null) {
            return ((node.getNodeType() == 23 || node.getNodeType() == 24) && i == 0) ? false : true;
        }
        return false;
    }

    private void zzR(int i, boolean z, boolean z2) {
        if (i <= 0) {
            return;
        }
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        if (i == 1) {
            if (!z && !z2) {
                zzytgZzYsG.writeString(" ");
                return;
            } else {
                zzytgZzYsG.zzZ("text:s", (String) null);
                return;
            }
        }
        if (z) {
            zzytgZzYsG.zzX("text:s", "text:c", Integer.valueOf(i));
        } else {
            zzytgZzYsG.writeString(" ");
            zzytgZzYsG.zzX("text:s", "text:c", Integer.valueOf(i - 1));
        }
    }

    private void zzZ(FieldEnd fieldEnd, zzYTG zzytg) throws Exception {
        if (fieldEnd.getFieldType() == 88 && zzYOU.zzJ(this.zzXPJ, this.zzXRT.getDocument().getBaseUri(), false) != null) {
            zzytg.zzGA("text:a");
        }
        if (fieldEnd.getFieldType() == 37 || fieldEnd.getFieldType() == 3) {
            zzYwu();
        }
        if (fieldEnd.getFieldType() == 12) {
            zzytg.zzGA("text:sequence");
        }
        if (fieldEnd.getFieldType() == 6) {
            this.zzXRT.zzRV(false);
        }
        if (fieldEnd.getFieldType() == 13 || fieldEnd.getFieldType() == 8) {
            zzA(fieldEnd);
        }
        if (zzQ(fieldEnd)) {
            this.zzXQV.zzYuc();
        }
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzYDW)) {
            this.zzXQV.zzG(new Run(this.zzXRT.getDocument(), this.zzYDW));
        }
    }

    private static boolean zzY(FieldChar fieldChar, Node node, int i) {
        return node.getNodeType() == 22 && ((FieldStart) node).getFieldType() == fieldChar.getFieldType() && i == 0;
    }

    private void zzu(FieldChar fieldChar) {
        FormField formFieldZzt = zzt(fieldChar);
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        String strZzWu = this.zzXRT.zzWu(formFieldZzt.isCheckBoxExactSize() ? formFieldZzt.getCheckBoxSize() : 9.0d);
        this.zzXQV.zzYud();
        zzytgZzYsG.zzGB("draw:control");
        zzytgZzYsG.zzYu("draw:style-name", this.zzXRS.zzYtT());
        zzytgZzYsG.zzYu("svg:width", strZzWu);
        zzytgZzYsG.zzYu("svg:height", strZzWu);
        zzytgZzYsG.zzYu("text:anchor-type", "as-char");
        zzytgZzYsG.zzYt("draw:control", com.aspose.words.internal.zzZKN.format("control{0}", Integer.valueOf(this.zzXRT.zzYsz())));
        zzytgZzYsG.zzGA("draw:control");
        this.zzXQV.zzYuc();
        zzYOR zzyor = this.zzXRT;
        zzyor.zzra(zzyor.zzYsz() + 1);
    }

    private static boolean zzZ(FieldChar fieldChar, Node node, int i) {
        return node.getNodeType() == 24 && ((FieldEnd) node).getFieldType() == fieldChar.getFieldType() && i == 0;
    }
}
