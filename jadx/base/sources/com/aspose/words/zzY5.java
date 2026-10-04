package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY5 extends zzY6B {
    @Override // com.aspose.words.zzY6B
    public final void zzZ(zzZZC zzzzc, int i) {
        zzZOJ item = zzzzc.zzZrs().zzZap().getItem(i);
        if (item.getName() != null) {
            if ("_PictureBullets".equals(item.getName())) {
                zzzzc.zzWC(true);
            }
            zzzzc.zzZrD().zzZC(item.getName(), item.getFlags());
        }
    }
}
