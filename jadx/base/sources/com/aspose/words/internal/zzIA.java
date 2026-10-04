package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzIA extends zzAX {
    private zzD3<String> zzxw = new zzD3<>();

    public final String zzWk(int i) {
        return this.zzxw.get(i);
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzZ(zzBJ zzbj) {
        zzBD zzbd = (zzBD) zzZKW.zzZ(zzbj.zzBF(), zzBD.class);
        if (zzbd != null) {
            this.zzxw.add(zzbj.zzBG(), zzbd.zzBC());
        }
    }
}
