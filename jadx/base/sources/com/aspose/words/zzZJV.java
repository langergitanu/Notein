package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJV extends zzZII {
    private static void zzX(zzZAS zzzas, zzPR zzpr) {
        String strZzKM = zzzas.zzKM("background");
        if (strZzKM != null) {
            zzpr.zzV(new zzM3("background-image", new zzL6(strZzKM), (byte) 0));
        }
    }

    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        zzpr.zzV(new zzM3("display", zzL4.zzZmt, (byte) 0));
        zzX(zzzas, zzpr);
        zzL4 zzl4ZzZ = zzZ(zzzas, new String[]{"marginheight", "topmargin"});
        if (zzl4ZzZ != null) {
            zzpr.zzV(new zzM3("margin-top", zzl4ZzZ, (byte) 0));
        }
        zzL4 zzl4ZzZ2 = zzZ(zzzas, new String[]{"marginwidth", "rightmargin"});
        if (zzl4ZzZ2 != null) {
            zzpr.zzV(new zzM3("margin-right", zzl4ZzZ2, (byte) 0));
        }
        zzL4 zzl4ZzZ3 = zzZ(zzzas, new String[]{"marginheight", "bottommargin"});
        if (zzl4ZzZ3 != null) {
            zzpr.zzV(new zzM3("margin-bottom", zzl4ZzZ3, (byte) 0));
        }
        zzL4 zzl4ZzZ4 = zzZ(zzzas, new String[]{"marginwidth", "leftmargin"});
        if (zzl4ZzZ4 != null) {
            zzpr.zzV(new zzM3("margin-left", zzl4ZzZ4, (byte) 0));
        }
        zzZUY.zzX(zzzas, zzpr);
        zzL4 zzl4ZzS1 = zzL4.zzS1(zzzas.zzKM("text"));
        if (zzl4ZzS1 != null) {
            zzpr.zzV(new zzM3("color", zzl4ZzS1, (byte) 0));
        }
    }

    private static zzL4 zzZ(zzZAS zzzas, String[] strArr) {
        for (int i = 0; i < 2; i++) {
            String strZzKM = zzzas.zzKM(strArr[i]);
            if (strZzKM != null) {
                return zzL4.zzS3(strZzKM);
            }
        }
        return null;
    }
}
