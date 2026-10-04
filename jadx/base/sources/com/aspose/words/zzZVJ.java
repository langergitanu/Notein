package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZVJ {
    public static com.aspose.words.internal.zzPI[] zzU(com.aspose.words.internal.zzPI[] zzpiArr) {
        int length = zzpiArr.length;
        com.aspose.words.internal.zzPI[] zzpiArr2 = new com.aspose.words.internal.zzPI[length];
        for (int i = 0; i < zzpiArr.length; i++) {
            zzpiArr2[(length - 1) - i] = new com.aspose.words.internal.zzPI(zzpiArr[i].zzZy(), 1.0f - zzpiArr[i].zzOG());
        }
        return zzpiArr2;
    }

    public static com.aspose.words.internal.zzPY zzZ(com.aspose.words.internal.zzPY zzpy, com.aspose.words.internal.zzZQ4 zzzq4, int i) throws Exception {
        if (zzpy instanceof com.aspose.words.internal.zzOH) {
            com.aspose.words.internal.zzOH zzoh = (com.aspose.words.internal.zzOH) zzpy;
            if (!zzoh.zzNc()) {
                com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(zzoh.getImageBytes());
                zzoh.zzNb().reset();
                float f = i;
                float width = zzzq4.getWidth() / f;
                float height = zzzq4.getHeight() / f;
                float fZzZm = zzzq4.zzZm();
                float fZzZo = zzzq4.zzZo();
                float width2 = width / zzegZzZT.getWidth();
                float height2 = height / zzegZzZT.getHeight();
                zzoh.zzNb().zzY((-zzzq4.getWidth()) / 2.0f, (-zzzq4.getHeight()) / 2.0f, 1);
                zzoh.zzNb().zzZ(width2, height2, 1);
                zzoh.zzNb().zzY((zzzq4.getWidth() / 2.0f) * width2, (zzzq4.getHeight() / 2.0f) * height2, 1);
                zzoh.zzNb().zzY(fZzZm, fZzZo, 1);
                return zzoh;
            }
        }
        return zzpy;
    }
}
