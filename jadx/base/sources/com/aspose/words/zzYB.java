package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYB extends zzY6B {
    @Override // com.aspose.words.zzY6B
    public final void zzZ(zzZZC zzzzc, int i) {
        zzZOK item = zzzzc.zzZrs().zzZao().getItem(i);
        if (item.getName() != null) {
            if ("_PictureBullets".equals(item.getName())) {
                zzzzc.zzWC(false);
            }
            zzzzc.zzZrD().zzJE(item.getName());
        }
    }
}
