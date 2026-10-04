package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYAY extends zzY6B {
    @Override // com.aspose.words.zzY6B
    public final void zzZ(zzZZC zzzzc, int i) {
        zzZO3 zzzo3ZzZrk = zzzzc.zzZrk();
        zzYKM zzykmZzBT = zzzo3ZzZrk.zzBT(i);
        if (zzykmZzBT == null) {
            return;
        }
        SmartTag smartTagZzYWC = zzzzc.zzZrD().zzYWC();
        zzZRY zzzryZzBS = zzzo3ZzZrk.zzBS(zzykmZzBT.zze0);
        smartTagZzYWC.setElement(zzzryZzBS.zzck);
        smartTagZzYWC.setUri(zzzryZzBS.zzYI0);
        int i2 = 0;
        while (true) {
            int[] iArr = zzykmZzBT.zzXDd;
            if (i2 >= iArr.length) {
                return;
            }
            smartTagZzYWC.getProperties().zzZ(new CustomXmlProperty(zzzo3ZzZrk.getString(iArr[i2]), "", zzzo3ZzZrk.getString(zzykmZzBT.zzXDc[i2])));
            i2++;
        }
    }
}
