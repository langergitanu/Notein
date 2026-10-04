package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZDC {
    private com.aspose.words.internal.zzZO0 zzMW;
    private String[] zzYk5 = new String[0];

    private static String zzZ2(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        com.aspose.words.internal.zzXE zzxe = new com.aspose.words.internal.zzXE();
        char[] cArr = new char[250];
        int iZzRI = zzzop.zzRI();
        while (iZzRI >= 0) {
            byte b = (byte) iZzRI;
            if (b != 13 && b != 10) {
                zzxe.zzX(b);
            } else if (zzxe.getCount() != 0) {
                break;
            }
            iZzRI = zzzop.zzRI();
        }
        if (zzxe.getCount() == 0) {
            return null;
        }
        return new String(cArr, 0, com.aspose.words.internal.zzZO0.zzhV().zzil().zzZ(zzxe.zzWy(), 0, zzxe.getCount(), cArr, 0));
    }

    private static com.aspose.words.internal.zzZO0 zzZ3(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        String strZzZ2 = zzZ2(zzzop);
        if (strZzZ2 == null) {
            return null;
        }
        try {
            return com.aspose.words.internal.zzZO0.zzV3(strZzZ2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final com.aspose.words.internal.zzZO0 zzQZ() {
        return this.zzMW;
    }

    public final String[] zzYX7() {
        return this.zzYk5;
    }

    public final void zzZ4(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        zzzop.zzU(0L, 0);
        com.aspose.words.internal.zzZO0 zzzo0ZzZ3 = zzZ3(zzzop);
        this.zzMW = zzzo0ZzZ3;
        boolean z = zzzo0ZzZ3 == null;
        if (z) {
            this.zzMW = com.aspose.words.internal.zzZO0.zzhV();
        }
        zzzop.zzU(0L, 0);
        ArrayList arrayList = new ArrayList();
        com.aspose.words.internal.zzZOO zzzoo = new com.aspose.words.internal.zzZOO(zzzop, this.zzMW);
        if (!z) {
            try {
                zzzoo.readLine();
            } catch (Throwable th) {
                zzzoo.close();
                throw th;
            }
        }
        while (true) {
            String line = zzzoo.readLine();
            if (line == null) {
                zzzoo.close();
                this.zzYk5 = (String[]) arrayList.toArray(new String[0]);
                return;
            }
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, line);
        }
    }
}
