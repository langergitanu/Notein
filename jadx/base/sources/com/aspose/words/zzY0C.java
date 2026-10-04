package com.aspose.words;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.PatternStyle;
import com.aspose.words.ref.Ref;
import com.google.common.primitives.SignedBytes;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0C {
    private static long[] zzln;
    private static int zzlm = com.aspose.words.internal.zzSA.zzw(2.0d);
    private static int[] zzWU2 = {2, 1, 5, 4, 0, 3};
    private static byte[] zzWU1 = {-1, 11, -88, -26, -11, 107, 6, 31, -84, 111, 17, 18, -60, 60, PatternStyle.Weave, 20, -39, -75, 65, 83, 32, 75, 20, 10, -7, -31, -6, SignedBytes.MAX_POWER_OF_TWO, -58, 16, 75, PatternStyle.DownwardDiagonal};
    private static char[] zzWU0 = {'\"', 171, 187, 8220, 8221, 8222, 8223};
    private static final String zzWTZ = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{105, 84, 101, 109, 32, 115, 101, 78, 32, 119, 111, 82, 97, 109, 110});
    private static final String zzWTY = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{105, 84, 101, 109, 32, 115, 101, 78, 32, 119, 111, 82, 97, 109, 32, 110, 89, 67, 82});
    static long zzWTX = 0;
    private static long zzWTW = 29273535023874148L;
    private static long zzWTV = 7163086397114115428L;

    static {
        long[] jArr = new long[18];
        zzln = jArr;
        jArr[0] = com.aspose.words.internal.zzSA.zzS(297.0d, 420.0d);
        zzln[1] = com.aspose.words.internal.zzSA.zzS(210.0d, 297.0d);
        zzln[2] = com.aspose.words.internal.zzSA.zzS(148.0d, 210.0d);
        zzln[3] = com.aspose.words.internal.zzSA.zzS(250.0d, 353.0d);
        zzln[4] = com.aspose.words.internal.zzSA.zzS(176.0d, 250.0d);
        zzln[5] = com.aspose.words.internal.zzSA.zzR(7.25d, 10.5d);
        zzln[6] = com.aspose.words.internal.zzSA.zzR(8.5d, 13.0d);
        zzln[7] = com.aspose.words.internal.zzSA.zzR(17.0d, 11.0d);
        zzln[8] = com.aspose.words.internal.zzSA.zzR(8.5d, 14.0d);
        zzln[9] = com.aspose.words.internal.zzSA.zzR(8.5d, 11.0d);
        zzln[10] = com.aspose.words.internal.zzSA.zzS(110.0d, 220.0d);
        zzln[11] = com.aspose.words.internal.zzSA.zzR(8.47d, 10.83d);
        zzln[12] = com.aspose.words.internal.zzSA.zzR(5.5d, 8.5d);
        zzln[13] = com.aspose.words.internal.zzSA.zzR(11.0d, 17.0d);
        zzln[14] = com.aspose.words.internal.zzSA.zzR(10.0d, 14.0d);
        zzln[15] = com.aspose.words.internal.zzSA.zzR(11.0d, 17.0d);
        zzln[16] = com.aspose.words.internal.zzSA.zzR(4.125d, 9.5d);
    }

    private static boolean zzD(CompositeNode compositeNode) {
        while (true) {
            Node nodeZzZYq = compositeNode.zzZYq();
            if (nodeZzZYq == null) {
                return true;
            }
            int nodeType = nodeZzZYq.getNodeType();
            if (nodeType == 8) {
                return false;
            }
            if (nodeType != 28) {
                return true;
            }
            ((StructuredDocumentTag) nodeZzZYq).zzY3F();
            compositeNode = (CompositeNode) nodeZzZYq;
        }
    }

    public static void zzE(CompositeNode compositeNode) {
        if (zzD(compositeNode)) {
            compositeNode.appendChild(new Paragraph(compositeNode.getDocument()));
        }
    }

    public static int zzVV(double d) {
        switch ((int) (d * 40.0d)) {
            case 0:
                return 0;
            case 1:
                return 35;
            case 2:
                return 2;
            case 3:
                return 36;
            case 4:
                return 3;
            case 5:
                return 37;
            case 6:
                return 38;
            case 7:
                return 39;
            case 8:
                return 4;
            case 9:
                return 40;
            case 10:
                return 5;
            case 11:
                return 41;
            case 12:
                return 6;
            case 13:
                return 42;
            case 14:
                return 43;
            case 15:
                return 44;
            case 16:
                return 7;
            case 17:
                return 45;
            case 18:
                return 46;
            case 19:
                return 47;
            case 20:
                return 8;
            case 21:
                return 48;
            case 22:
                return 49;
            case 23:
                return 50;
            case 24:
                return 9;
            case 25:
                return 51;
            case 26:
                return 52;
            case 27:
                return 53;
            case 28:
                return 10;
            case 29:
                return 54;
            case 30:
                return 11;
            case 31:
                return 55;
            case 32:
                return 12;
            case 33:
                return 56;
            case 34:
                return 57;
            case 35:
                return 58;
            case 36:
                return 13;
            case 37:
                return 59;
            case 38:
                return 60;
            case 39:
                return 61;
            default:
                return 1;
        }
    }

    public static int zzW(int i, Font font) {
        if (font.getComplexScript()) {
            return 2;
        }
        return zzX(i, font);
    }

    public static int zzX(int i, Font font) {
        Object directRunAttr;
        int iZzzG = zzzG(i);
        if (iZzzG != 0 || (directRunAttr = font.zzZ7g().getDirectRunAttr(400)) == null) {
            return iZzzG;
        }
        int iIntValue = ((Integer) directRunAttr).intValue();
        if (iIntValue == 1 && i >= 1024 && i <= 1327) {
            String str = zzWTZ;
            if ((str.equals(font.getNameFarEast()) || zzWTY.equals(font.getNameFarEast())) && (str.equals(font.getNameOther()) || zzWTY.equals(font.getNameOther()))) {
                return 0;
            }
        }
        if (iIntValue == 1) {
            return zzZVC.zzXP(i, font.getLocaleIdFarEast()) ? 1 : 0;
        }
        if (iIntValue == 2) {
            return 0;
        }
        return iIntValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.aspose.words.Node, com.aspose.words.Paragraph] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.aspose.words.Node] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.aspose.words.CompositeNode] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static boolean zzXS(Paragraph paragraph) {
        CompositeNode compositeNode = (CompositeNode) com.aspose.words.internal.zzZKW.zzZ(paragraph.zzYB9(), CompositeNode.class);
        if (compositeNode != null && (compositeNode.getNodeType() == 8 || !zzD(compositeNode))) {
            return true;
        }
        while (paragraph != 0 && paragraph.getNodeType() != 3 && paragraph.getNodeType() != 7 && paragraph.getNodeType() != 19 && paragraph.getNodeType() != 20) {
            paragraph = paragraph.zzYB4() == null ? paragraph.getParentNode() : 0;
        }
        return paragraph == 0;
    }

    private static String zzXz(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) ((bArr[i] & 255) ^ 75);
        }
        return com.aspose.words.internal.zzZO0.zzhV().zzZn(bArr2);
    }

    public static com.aspose.words.internal.zzPV zzY(com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2, double d) {
        if (d == 0.0d) {
            return zzpv2;
        }
        if (d == 1.0d) {
            return zzpv;
        }
        if (!zzpv.zzPz() || !zzpv2.zzPz()) {
            return com.aspose.words.internal.zzZT1.zzZ(zzpv, zzpv2, d);
        }
        int iOooO0O0 = (int) C21532OooOOo.OooO0O0(1.0d, d, zzpv2.zzPC(), ((double) zzpv.zzPC()) * d);
        return new com.aspose.words.internal.zzPV(iOooO0O0, iOooO0O0, iOooO0O0);
    }

    public static zzU1 zzZ(int i, zzU1 zzu1, zzU1 zzu12, zzU1 zzu13, zzU1 zzu14) {
        return i != 1 ? i != 2 ? i != 3 ? zzu14 : zzu1 : zzu12 : zzu13;
    }

    private static void zzZI(Document document) {
        for (Section section : document.getSections()) {
            com.aspose.words.internal.zzZYV zzzyv = new com.aspose.words.internal.zzZYV();
            for (HeaderFooter headerFooter : section.getHeadersFooters()) {
                zzzyv.add(zzWU2[headerFooter.getHeaderFooterType()], headerFooter);
                headerFooter.remove();
            }
            for (int i = 0; i < zzzyv.getCount(); i++) {
                section.insertAfter((HeaderFooter) zzzyv.zzVY(i), section.getBody());
            }
        }
    }

    private static void zzZJ(Document document) throws Exception {
        zzZI(document);
        int i = 0;
        int i2 = 0;
        Paragraph paragraph = null;
        for (Paragraph paragraph2 : document.getChildNodes(8, true)) {
            if (paragraph2.getParentNode().getNodeType() == 3 || paragraph2.getParentNode().getNodeType() == 7) {
                Iterator<V> it = paragraph2.iterator();
                while (it.hasNext()) {
                    int nodeType = ((Node) it.next()).getNodeType();
                    if (nodeType == 22) {
                        i2++;
                    } else if (nodeType == 24) {
                        i2--;
                    }
                }
                paragraph = paragraph2;
            }
            i++;
            if (i > 198 && paragraph != null && i2 == 0 && paragraph.zztB(0).getNodeType() != 4) {
                zzYW0.zzn(paragraph.getParentSection().getNextSibling(), null);
                zzYW0.zzZ(paragraph, false, document.getLastChild(), false);
                Run run = new Run(document, zzYCS.zz1(zzYCR.zzYbQ()), new zzYEF());
                run.zzZYh().zzQ(160, com.aspose.words.internal.zzPV.zzIs);
                run.zzZYh().zzQ(60, zzZU.zzZF6);
                run.zzZYh().zzQ(190, 24);
                Paragraph paragraph3 = new Paragraph(document, new zzYMX(), new zzYEF());
                paragraph3.appendChild(run);
                document.getLastSection().getBody().appendChild(paragraph3);
                return;
            }
        }
    }

    private static boolean zzZK(Document document) throws Exception {
        Ref ref = new Ref(null);
        int iZzZ = zzZ(document.zzZqr(), (Ref<String>) ref);
        String str = (String) ref.get();
        if (iZzZ != 1) {
            return iZzZ == 2;
        }
        document.ensureMinimum();
        if (com.aspose.words.internal.zzZKN.zzU3(str)) {
            str = com.aspose.words.internal.zzZKN.format(zzYCS.zz1(zzYCR.zzYbS()), "2024");
        }
        zzZ(document.getFirstSection().getBody(), str);
        zzZJ(document);
        return true;
    }

    private static boolean zzZL(Document document) {
        byte[] bArrZzYRo = zzZ5R.zzYRo();
        if ((zzZ5R.zzYeM ^ zzWTW) == zzWTV && bArrZzYRo != zzZ5O.zzYeD) {
            if (bArrZzYRo != zzZ5O.zzYeC && bArrZzYRo == zzZ5O.zzYeB) {
                int[] iArrZzYRe = document.zzZq9().zzYRe();
                int i = 0;
                for (int i2 : iArrZzYRe) {
                    if (zzZ5R.zzxT(i2)) {
                        i++;
                    }
                }
                if (iArrZzYRe.length == i) {
                }
            }
            return true;
        }
        return false;
    }

    public static void zzZM(Document document) throws Exception {
        if (document == null || zzWTX == 0) {
            zzWTX = 29273535023874148L;
            return;
        }
        if (zzZL(document) || zzZK(document)) {
            return;
        }
        document.ensureMinimum();
        zzZ(document.getFirstSection().getBody(), com.aspose.words.internal.zzZKN.format(zzYCS.zz1(zzYCR.zzYbS()), "2024"));
        for (Section section : document.getSections()) {
            if (section.getHeadersFooters().getByHeaderFooterType(1) == null) {
                section.getHeadersFooters().add(new HeaderFooter(document, 1));
            }
            if (section.getHeadersFooters().getByHeaderFooterType(3) == null) {
                section.getHeadersFooters().add(new HeaderFooter(document, 3));
            }
            String strZz1 = null;
            byte[] bArrZzZX = null;
            for (HeaderFooter headerFooter : section.getHeadersFooters()) {
                if (headerFooter.isHeader()) {
                    if (bArrZzZX == null) {
                        com.aspose.words.internal.zzZOP zzzopZzW = com.aspose.words.internal.zzZXR.zzW(zzYCS.zz1(zzYCR.zzYbP()), Document.class);
                        try {
                            bArrZzZX = com.aspose.words.internal.zzZYQ.zzZX(zzzopZzW);
                        } finally {
                            if (zzzopZzW != null) {
                                zzzopZzW.close();
                            }
                        }
                    }
                    zzZ(headerFooter, bArrZzZX);
                } else {
                    if (strZz1 == null) {
                        strZz1 = zzYCS.zz1(zzYCR.zzYbR());
                    }
                    zzZ(headerFooter, strZz1);
                }
            }
        }
        zzZJ(document);
    }

    public static void zzZN(Document document) throws Exception {
        zzZM(document);
    }

    public static long zzhA(int i) {
        return zzln[i];
    }

    public static int zzhB(int i) {
        switch (i) {
            case 6:
                return 0;
            case 7:
                return 1;
            case 8:
                return 2;
            case 9:
                return 3;
            case 10:
                return 4;
            case 11:
                return 5;
            default:
                throw new IllegalStateException("This story is not a header or footer story.");
        }
    }

    public static int zzhC(int i) {
        if (i == 0) {
            return 6;
        }
        if (i == 1) {
            return 7;
        }
        if (i == 2) {
            return 8;
        }
        if (i == 3) {
            return 9;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        throw new IllegalStateException("Unknown header or footer type.");
    }

    public static int zzhD(int i) {
        if (i == 12287) {
            return 4095;
        }
        return i;
    }

    public static int zzhE(int i) {
        return i == 4095 ? StyleIdentifier.NIL : i;
    }

    public static boolean zzhF(int i) {
        return i < 4093;
    }

    public static boolean zzhx(int i) {
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                return true;
            default:
                return false;
        }
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public static int zzhy(int r1) {
        /*
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 == r0) goto Lc
            switch(r1) {
                case 0: goto Lc;
                case 1: goto Lc;
                case 2: goto Lc;
                case 3: goto Lc;
                case 4: goto Lc;
                case 5: goto Lc;
                case 6: goto Lc;
                case 7: goto Lc;
                case 8: goto Lc;
                case 9: goto Lc;
                case 10: goto Lc;
                case 11: goto Lc;
                case 12: goto Lc;
                case 13: goto Lc;
                case 14: goto Lc;
                case 15: goto Lc;
                case 16: goto Lc;
                case 17: goto Lc;
                case 18: goto Lc;
                case 19: goto Lc;
                case 20: goto Lc;
                case 21: goto Lc;
                case 22: goto Lc;
                case 23: goto Lc;
                case 24: goto Lc;
                case 25: goto Lc;
                default: goto L8;
            }
        L8:
            switch(r1) {
                case 35: goto Lc;
                case 36: goto Lc;
                case 37: goto Lc;
                case 38: goto Lc;
                case 39: goto Lc;
                case 40: goto Lc;
                case 41: goto Lc;
                case 42: goto Lc;
                case 43: goto Lc;
                case 44: goto Lc;
                case 45: goto Lc;
                case 46: goto Lc;
                case 47: goto Lc;
                case 48: goto Lc;
                case 49: goto Lc;
                case 50: goto Lc;
                case 51: goto Lc;
                case 52: goto Lc;
                case 53: goto Lc;
                case 54: goto Lc;
                case 55: goto Lc;
                case 56: goto Lc;
                case 57: goto Lc;
                case 58: goto Lc;
                case 59: goto Lc;
                case 60: goto Lc;
                case 61: goto Lc;
                default: goto Lb;
            }
        Lb:
            r1 = 0
        Lc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aspose.words.zzY0C.zzhy(int):int");
    }

    public static double zzhz(int i) {
        if (i == 65535) {
            return 0.0d;
        }
        switch (i) {
            case 0:
                return 0.0d;
            case 1:
                return 1.0d;
            case 2:
                return 0.05d;
            case 3:
                return 0.10000000149011612d;
            case 4:
                return 0.2d;
            case 5:
            case 20:
            case 21:
            case 22:
            case 23:
                return 0.25d;
            case 6:
            case 25:
                return 0.3d;
            case 7:
                return 0.4d;
            case 8:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return 0.5d;
            case 9:
                return 0.6d;
            case 10:
            case 19:
                return 0.7d;
            case 11:
                return 0.75d;
            case 12:
                return 0.8d;
            case 13:
                return 0.9d;
            case 24:
                return 0.35d;
            default:
                switch (i) {
                    case 35:
                        return 0.025d;
                    case 36:
                        return 0.075d;
                    case 37:
                        return 0.125d;
                    case 38:
                        return 0.15d;
                    case 39:
                        return 0.175d;
                    case 40:
                        return 0.225d;
                    case 41:
                        return 0.275d;
                    case 42:
                        return 0.325d;
                    case 43:
                        return 0.35d;
                    case 44:
                        return 0.375d;
                    case 45:
                        return 0.425d;
                    case 46:
                        return 0.45d;
                    case 47:
                        return 0.475d;
                    case 48:
                        return 0.525d;
                    case 49:
                        return 0.55d;
                    case 50:
                        return 0.575d;
                    case 51:
                        return 0.625d;
                    case 52:
                        return 0.65d;
                    case 53:
                        return 0.675d;
                    case 54:
                        return 0.725d;
                    case 55:
                        return 0.775d;
                    case 56:
                        return 0.825d;
                    case 57:
                        return 0.85d;
                    case 58:
                        return 0.875d;
                    case 59:
                        return 0.925d;
                    case 60:
                        return 0.95d;
                    case 61:
                        return 0.975d;
                    default:
                        throw new IllegalStateException(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{110, 85, 110, 107, 119, 111, 32, 110, 101, 116, 116, 120, 114, 117, PatternStyle.Divot, 101}));
                }
        }
    }

    public static String zzyA(String str) {
        return com.aspose.words.internal.zzZKN.zzS(str, '\"');
    }

    public static String zzyu(String str) {
        StringBuilder sb = new StringBuilder(str);
        com.aspose.words.internal.zzZNH.zzZ(sb, ControlChar.CR_LF, ControlChar.f50774LF);
        com.aspose.words.internal.zzZNH.zzZ(sb, ControlChar.f50773CR, ControlChar.f50774LF);
        return sb.toString();
    }

    public static String zzyv(String str) {
        if (str.indexOf(10) == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        com.aspose.words.internal.zzZNH.zzZ(sb, ControlChar.CR_LF, ControlChar.f50773CR);
        com.aspose.words.internal.zzZNH.zzZ(sb, ControlChar.f50774LF, ControlChar.f50773CR);
        return sb.toString();
    }

    public static String zzyw(String str) {
        return zzyy(str.replace("\\", "\\\\"));
    }

    public static String zzyx(String str) {
        return com.aspose.words.internal.zzZKN.zzS(str, '\"').replace("\\\\", "\\");
    }

    private static String zzyy(String str) {
        return com.aspose.words.internal.zzZKN.format("\"{0}\"", str);
    }

    public static boolean zzyz(String str) {
        return !com.aspose.words.internal.zzZKN.zzU3(str) && str.length() >= 2 && com.aspose.words.internal.zzZKN.zzZ(str, zzWU0, 0, 1) == 0 && com.aspose.words.internal.zzZKN.zzZ(str, zzWU0, str.length() - 1, 1) == str.length() - 1;
    }

    public static int zzzG(int i) {
        if (i >= 0 && i <= 127) {
            return 3;
        }
        if (i <= 65535 && com.aspose.words.internal.zzUX.zzZb(i)) {
            return 1;
        }
        if (i > 65535 && com.aspose.words.internal.zzUX.zzZa(i)) {
            return 1;
        }
        if (i >= 1424 && i <= 3583) {
            return 2;
        }
        if (i < 64285 || i > 64335) {
            return ((i < 64336 || i > 65023) && (i < 65136 || i > 65279) && !com.aspose.words.internal.zzUX.zzH((char) i)) ? 0 : 2;
        }
        return 2;
    }

    public static String zzZ(int i, String str, String str2, String str3, String str4) {
        return i != 1 ? i != 2 ? i != 3 ? str4 : str : str2 : str3;
    }

    public static boolean zzZ(Style style, IWarningCallback iWarningCallback, int i) {
        if (zzhF(style.zzZ7j())) {
            return true;
        }
        if (iWarningCallback == null) {
            return false;
        }
        iWarningCallback.warning(new WarningInfo(1, i, com.aspose.words.internal.zzZKN.format("Style '{0}' has style index unsupported by target format.", style.getName())));
        return false;
    }

    public static String zzZ(com.aspose.words.internal.zzZQ9 zzzq9, String str, int i, int i2) {
        return zzKD.zzZ(str, zzzq9, i, i2);
    }

    public static int zzX(int i, int i2, boolean z) {
        boolean z2;
        int i3 = 0;
        while (true) {
            long[] jArr = zzln;
            if (i3 >= jArr.length) {
                return 17;
            }
            if (i3 != 17) {
                long j = jArr[i3];
                z2 = z;
                if (com.aspose.words.internal.zzJ6.zzZ(com.aspose.words.internal.zzZPW.zzG((int) j, (int) (j >>> 32)), com.aspose.words.internal.zzZPW.zzG(i, i2), z2, zzlm)) {
                    return i3;
                }
            } else {
                z2 = z;
            }
            i3++;
            z = z2;
        }
    }

    private static int zzZ(zzY3G zzy3g, Ref<String> ref) {
        ref.set("");
        if (zzy3g != null) {
            long[] jArr = {3489487817L, 103682052, 18039217, 923926808, 78451475, 307324897};
            long j = jArr[0] + jArr[1];
            long j2 = jArr[2] + jArr[3];
            if ((((((long) zzy3g.hashCode()) ^ j) ^ j2) ^ (jArr[4] + jArr[5])) == zzy3g.zzX01) {
                ref.set(zzXz((byte[]) zzy3g.zzX02));
                return ((Integer) zzy3g.zzX03).intValue();
            }
        }
        return 0;
    }

    public static String zzX(com.aspose.words.internal.zzZQ9 zzzq9, String str) {
        return zzKD.zzZ(str, zzzq9, 0, 0);
    }

    private static void zzZ(Story story, String str) {
        Run runZzYVe;
        Document documentZzYBb = story.zzYBb();
        if (documentZzYBb.getFirstChild() == documentZzYBb.getLastChild() && documentZzYBb.getFirstSection().getBody().zz6T()) {
            return;
        }
        if (story.getFirstParagraph() == null || (runZzYVe = story.getFirstParagraph().zzYVe()) == null || !com.aspose.words.internal.zzZKN.equals(runZzYVe.getText(), str)) {
            Run run = new Run(story.getDocument(), str, new zzYEF());
            run.zzZYh().zzQ(160, com.aspose.words.internal.zzPV.zzIs);
            run.zzZYh().zzQ(60, zzZU.zzZF6);
            run.zzZYh().zzQ(190, 24);
            Paragraph paragraph = new Paragraph(story.getDocument(), new zzYMX(), new zzYEF());
            paragraph.appendChild(run);
            Paragraph firstParagraph = story.getFirstParagraph();
            if (firstParagraph != null && firstParagraph.getParagraphFormat().getPageBreakBefore()) {
                firstParagraph.getParagraphFormat().setPageBreakBefore(false);
            }
            story.prependChild(paragraph);
        }
    }

    private static void zzZ(Story story, byte[] bArr) throws Exception {
        Document documentZzYBb = story.zzYBb();
        if (documentZzYBb == null) {
            return;
        }
        if (documentZzYBb.getFirstChild() == documentZzYBb.getLastChild() && documentZzYBb.getFirstSection().getBody().zz6T()) {
            return;
        }
        if (story.zzY4A().getCount() > 0 && story.zzY4A().get(0).zzZjT()) {
            byte[] imageBytes = story.zzY4A().get(0).getImageData().getImageBytes();
            if (com.aspose.words.internal.zzZ1.zzZ(com.aspose.words.internal.zzIL.zzW(3, imageBytes, imageBytes.length), zzWU1)) {
                return;
            }
        }
        zzE(story);
        DocumentBuilder documentBuilder = new DocumentBuilder(documentZzYBb);
        documentBuilder.zzZ(story.getFirstParagraph(), 0);
        Shape shapeInsertImage = documentBuilder.insertImage(bArr, 0, 0.0d, 0, 0.0d, -1.0d, -1.0d, 3);
        shapeInsertImage.setVerticalAlignment(2);
        shapeInsertImage.setHorizontalAlignment(2);
        shapeInsertImage.getImageData().setBrightness(0.85d);
        shapeInsertImage.getImageData().setContrast(0.15d);
        shapeInsertImage.setBehindText(true);
    }

    public static String zzZ(com.aspose.words.internal.zzZQ9 zzzq9, String str, int i) {
        return zzKD.zzZ(str, zzzq9, i, 0);
    }
}
