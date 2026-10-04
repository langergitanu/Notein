package com.aspose.words;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class Theme implements zzZ90, zzZCH, Cloneable {
    private static Theme zzX3a;
    private static Object zzYz6 = new Object();
    private String mName;
    private String zzX3b;
    private zzY5H zzX3c;
    private zzY5G zzX3d;
    private ThemeFonts zzX3e;
    private ThemeFonts zzX3f;
    private zzZMH zzX3g;
    private String zzX3h;
    private ThemeColors zzX3i;
    private com.aspose.words.internal.zz77 zzYf0;
    private HashMap<String, com.aspose.words.internal.zz77> zzZ7H = new HashMap<>();
    private Document zzZEY;
    private com.aspose.words.internal.zzZYG<zz82> zzZEy;

    private void zzXVA() {
        Document document = this.zzZEY;
        if (document != null) {
            zzY5J.zzZR(document);
        }
    }

    public static Theme zzXVL() {
        if (zzX3a == null) {
            synchronized (zzYz6) {
                try {
                    if (zzX3a == null) {
                        zzX3a = zzXVz();
                    }
                } finally {
                }
            }
        }
        return zzX3a;
    }

    private static Theme zzXVz() {
        try {
            com.aspose.words.internal.zzZOP zzzopZzW = com.aspose.words.internal.zzZXR.zzW("Aspose.Words.Resources.AllStyles2007.docx", Document.class);
            try {
                return new Document(zzzopZzW, null, false).zzZqI();
            } finally {
                if (zzzopZzW != null) {
                    zzzopZzW.close();
                }
            }
        } catch (Exception e) {
            throw new IllegalStateException("Cannot load built in theme from an embedded resource.", e);
        }
    }

    public static void zzZ(Theme theme, zzYEF zzyef) {
        zzYEF zzyef2 = new zzYEF();
        boolean z = false;
        for (int i = 0; i < zzyef.getCount(); i++) {
            int iZzT3 = zzyef.zzT3(i);
            Object objZzVY = zzyef.zzVY(i);
            if (iZzT3 == 230 || iZzT3 == 235 || iZzT3 == 240 || iZzT3 == 270) {
                zzyef2.zzQ(iZzT3, zzU1.zzSP(zzU1.zzZ(objZzVY, theme)));
            } else if (iZzT3 == 500) {
                z = true;
            }
        }
        zzyef2.zzY(zzyef);
        if (z) {
            zzyef.remove(500);
        }
    }

    private static boolean zzjE(int i) {
        return i == 3076 || i == 1028 || i == 5124;
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
    private static java.lang.String zzjF(int r2) {
        /*
            r0 = r2 & 255(0xff, float:3.57E-43)
            r1 = 1
            if (r0 == r1) goto L9c
            r1 = 4
            if (r0 == r1) goto L90
            r2 = 13
            if (r0 == r2) goto L8d
            r2 = 30
            if (r0 == r2) goto L8a
            r2 = 42
            if (r0 == r2) goto L87
            r2 = 57
            java.lang.String r1 = "Deva"
            if (r0 == r2) goto L86
            r2 = 101(0x65, float:1.42E-43)
            if (r0 == r2) goto L83
            r2 = 115(0x73, float:1.61E-43)
            if (r0 == r2) goto L80
            r2 = 120(0x78, float:1.68E-43)
            if (r0 == r2) goto L7d
            r2 = 17
            if (r0 == r2) goto L7a
            r2 = 18
            if (r0 == r2) goto L77
            r2 = 80
            if (r0 == r2) goto L74
            r2 = 81
            if (r0 == r2) goto L71
            r2 = 83
            if (r0 == r2) goto L6e
            r2 = 84
            if (r0 == r2) goto L6b
            switch(r0) {
                case 69: goto L68;
                case 70: goto L65;
                case 71: goto L62;
                case 72: goto L5f;
                case 73: goto L5c;
                case 74: goto L59;
                case 75: goto L56;
                case 76: goto L53;
                default: goto L41;
            }
        L41:
            switch(r0) {
                case 89: goto L52;
                case 90: goto L4f;
                case 91: goto L4c;
                case 92: goto L49;
                case 93: goto L46;
                default: goto L44;
            }
        L44:
            r2 = 0
            return r2
        L46:
            java.lang.String r2 = "Cans"
            return r2
        L49:
            java.lang.String r2 = "Cher"
            return r2
        L4c:
            java.lang.String r2 = "Sing"
            return r2
        L4f:
            java.lang.String r2 = "Syrc"
            return r2
        L52:
            return r1
        L53:
            java.lang.String r2 = "Mlym"
            return r2
        L56:
            java.lang.String r2 = "Knda"
            return r2
        L59:
            java.lang.String r2 = "Telu"
            return r2
        L5c:
            java.lang.String r2 = "Taml"
            return r2
        L5f:
            java.lang.String r2 = "Orya"
            return r2
        L62:
            java.lang.String r2 = "Gujr"
            return r2
        L65:
            java.lang.String r2 = "Guru"
            return r2
        L68:
            java.lang.String r2 = "Beng"
            return r2
        L6b:
            java.lang.String r2 = "Laoo"
            return r2
        L6e:
            java.lang.String r2 = "Khmr"
            return r2
        L71:
            java.lang.String r2 = "Tibt"
            return r2
        L74:
            java.lang.String r2 = "Mong"
            return r2
        L77:
            java.lang.String r2 = "Hang"
            return r2
        L7a:
            java.lang.String r2 = "Jpan"
            return r2
        L7d:
            java.lang.String r2 = "Yiii"
            return r2
        L80:
            java.lang.String r2 = "Ethi"
            return r2
        L83:
            java.lang.String r2 = "Thaa"
            return r2
        L86:
            return r1
        L87:
            java.lang.String r2 = "Viet"
            return r2
        L8a:
            java.lang.String r2 = "Thai"
            return r2
        L8d:
            java.lang.String r2 = "Hebr"
            return r2
        L90:
            boolean r2 = zzjE(r2)
            if (r2 == 0) goto L99
            java.lang.String r2 = "Hant"
            return r2
        L99:
            java.lang.String r2 = "Hans"
            return r2
        L9c:
            java.lang.String r2 = "Arab"
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aspose.words.Theme.zzjF(int):java.lang.String");
    }

    @Override // com.aspose.words.zzZ90
    @ReservedForInternalUse
    @Deprecated
    public zz7X getBackgroundFillStyle(int i) {
        return zzXVD().getBackgroundFillStyle(i).zzZQ6();
    }

    public ThemeColors getColors() {
        return this.zzX3i;
    }

    @Override // com.aspose.words.zzZ90
    @ReservedForInternalUse
    @Deprecated
    public zzZV0 getEffectStyle(int i) {
        return zzXVD().getEffectStyle(i).zzZjM();
    }

    @Override // com.aspose.words.zzZCH
    @ReservedForInternalUse
    @Deprecated
    public com.aspose.words.internal.zzZYG<zz82> getExtensions() {
        return this.zzZEy;
    }

    @Override // com.aspose.words.zzZ90
    @ReservedForInternalUse
    @Deprecated
    public zz7X getFillStyle(int i) {
        return zzXVD().getFillStyle(i).zzZQ6();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    @Override // com.aspose.words.zzZ90
    @ReservedForInternalUse
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getFontName(int i) {
        int i2;
        FontInfo fontInfo;
        zzY5F zzy5f;
        ThemeFonts themeFonts = (16711680 & i) == 65536 ? this.zzX3f : this.zzX3e;
        if (themeFonts == null) {
            return null;
        }
        int i3 = i & 65535;
        if (i3 == 1) {
            i2 = this.zzX3c.zzX34;
            fontInfo = themeFonts.zzX2Z;
        } else if (i3 == 2) {
            i2 = this.zzX3c.zzX32;
            fontInfo = themeFonts.zzX31;
        } else if (i3 == 3) {
            i2 = this.zzX3c.zzX33;
            fontInfo = themeFonts.zzX30;
        } else if (i3 != 4) {
            i2 = 1024;
            fontInfo = null;
        }
        String strZzjF = zzjF(i2);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzjF) && (zzy5f = (zzY5F) com.aspose.words.internal.zzQW.zzZ((Map<String, TValue>) themeFonts.zzXVu(), strZzjF)) != null && com.aspose.words.internal.zzZYD.zzXk(zzy5f.zzXVp())) {
            return zzy5f.zzXVp();
        }
        if (fontInfo != null) {
            return fontInfo.getName();
        }
        return null;
    }

    @Override // com.aspose.words.zzZ90
    @ReservedForInternalUse
    @Deprecated
    public zz4G getLineStyle(int i) {
        return zzXVD().getLineStyle(i).zzZxK();
    }

    public ThemeFonts getMajorFonts() {
        return this.zzX3f;
    }

    public ThemeFonts getMinorFonts() {
        return this.zzX3e;
    }

    public final String getName() {
        return this.mName;
    }

    @Override // com.aspose.words.zzZ90
    @ReservedForInternalUse
    @Deprecated
    public zzBW getThemeColor(int i) {
        zzBW zzbwZzjC = zzXVE().zzjC(i);
        if (zzbwZzjC == null) {
            return null;
        }
        return zzbwZzjC.zzZHt();
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzZ90
    @ReservedForInternalUse
    @Deprecated
    public void onChange() {
        zzXVA();
    }

    @Override // com.aspose.words.zzZCH
    @ReservedForInternalUse
    @Deprecated
    public void setExtensions(com.aspose.words.internal.zzZYG<zz82> zzzyg) {
        this.zzZEy = zzzyg;
    }

    public final void setName(String str) {
        this.mName = str;
    }

    public final void zzAh(String str) {
        this.zzX3h = str;
    }

    public final void zzX(ThemeFonts themeFonts) {
        this.zzX3e = themeFonts;
    }

    public final boolean zzXVB() {
        ThemeFonts themeFonts = this.zzX3f;
        if (themeFonts != null && themeFonts.zzXVB()) {
            return true;
        }
        ThemeFonts themeFonts2 = this.zzX3e;
        if (themeFonts2 != null && themeFonts2.zzXVB()) {
            return true;
        }
        ThemeColors themeColors = this.zzX3i;
        return themeColors != null && themeColors.zzXVB();
    }

    public final zzY5G zzXVC() {
        return this.zzX3d;
    }

    public final zzZMH zzXVD() {
        if (this.zzX3g == null) {
            this.zzX3g = new zzZMH();
        }
        return this.zzX3g;
    }

    public final ThemeColors zzXVE() {
        if (this.zzX3i == null) {
            this.zzX3i = new ThemeColors(this);
        }
        return this.zzX3i;
    }

    public final zzY5H zzXVF() {
        return this.zzX3c;
    }

    public final String zzXVG() {
        return this.zzX3h;
    }

    public final String zzXVH() {
        return this.zzX3b;
    }

    public final com.aspose.words.internal.zz77 zzXVI() {
        return this.zzYf0;
    }

    public final Theme zzXVJ() {
        try {
            Theme themeZzXVK = zzXVK();
            this.zzYf0.zzR1().zzH(0L);
            com.aspose.words.internal.zzO zzo = new com.aspose.words.internal.zzO(this.zzYf0.zzR1());
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
            com.aspose.words.internal.zzP zzp = new com.aspose.words.internal.zzP(zzzor, false);
            zzp.zzZ("a:themeOverride");
            zzp.zzX("xmlns:a", themeZzXVK.zzX3b);
            zzo.zzQ("theme");
            zzo.zzQ("themeElements");
            while (!zzo.zzP("themeElements")) {
                zzp.zzX(zzo.zzf());
            }
            zzp.endDocument();
            zzzor.zzH(0L);
            themeZzXVK.zzYf0.zz5(zzzor);
            return themeZzXVK;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final Theme zzXVK() {
        Theme theme = (Theme) memberwiseClone();
        theme.zzX(this.zzYf0.zzxm(), this.zzX3b);
        ThemeColors themeColors = this.zzX3i;
        if (themeColors != null) {
            ThemeColors themeColorsZzXVy = themeColors.zzXVy();
            theme.zzX3i = themeColorsZzXVy;
            themeColorsZzXVy.zzR(theme);
        }
        zzZMH zzzmh = this.zzX3g;
        if (zzzmh != null) {
            theme.zzX3g = zzzmh.zzZ6B();
        }
        ThemeFonts themeFonts = this.zzX3f;
        if (themeFonts != null) {
            theme.zzX3f = themeFonts.zzXVv();
        }
        ThemeFonts themeFonts2 = this.zzX3e;
        if (themeFonts2 != null) {
            theme.zzX3e = themeFonts2.zzXVv();
        }
        if (this.zzZ7H != null) {
            theme.zzZ7H = new HashMap<>();
            for (Map.Entry<String, com.aspose.words.internal.zz77> entry : this.zzZ7H.entrySet()) {
                com.aspose.words.internal.zzZQF.zzY(theme.zzZ7H, entry.getKey(), entry.getValue().zzxm());
            }
        }
        zzY5H zzy5h = this.zzX3c;
        if (zzy5h != null) {
            theme.zzX3c = zzy5h.zzXVw();
        }
        theme.zzZEy = zz80.zzN(this.zzZEy);
        return theme;
    }

    public final void zzY(ThemeFonts themeFonts) {
        this.zzX3f = themeFonts;
    }

    public final HashMap<String, com.aspose.words.internal.zz77> zzZEZ() {
        return this.zzZ7H;
    }

    public final void zzZS(Document document) {
        this.zzZEY = document;
        ThemeColors themeColors = this.zzX3i;
        if (themeColors == null || !themeColors.zzXVB()) {
            return;
        }
        zzXVA();
    }

    public static boolean zzX(Theme theme, Theme theme2) {
        if (com.aspose.words.internal.zzZKO.zzA(theme, theme2)) {
            return true;
        }
        return !com.aspose.words.internal.zzZ4.zzZ(theme, theme2) && theme.zzXVE().getAccent3() == theme2.zzXVE().getAccent3();
    }

    public static boolean zzY(Theme theme, Theme theme2) {
        if (com.aspose.words.internal.zzZKO.zzA(theme, theme2)) {
            return true;
        }
        if (com.aspose.words.internal.zzZKO.zzA(null, theme) || com.aspose.words.internal.zzZKO.zzA(null, theme2)) {
            return false;
        }
        for (int i : zzYEF.zzXqa) {
            if (!com.aspose.words.internal.zzZKN.equals(theme.getFontName(i), theme2.getFontName(i))) {
                return false;
            }
        }
        return true;
    }

    public final void zzX(com.aspose.words.internal.zz77 zz77Var, String str) {
        this.zzYf0 = zz77Var;
        this.zzX3b = str;
    }

    public final void zzZ(zzY5H zzy5h) {
        this.zzX3c = zzy5h;
    }

    public final void zzZ(zzY5G zzy5g) {
        this.zzX3d = zzy5g;
    }
}
