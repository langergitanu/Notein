package com.aspose.words.internal;

import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
final class zzIB extends zzZVB {
    private zzIC zzxx;

    public zzIB(zzIC zzic) {
        super(zzic);
        this.zzxx = zzic;
    }

    @Override // com.aspose.words.internal.zzZVB
    public final void endDocument() throws Exception {
        this.zzxx.zzGn();
        zzng().zzY("body");
        for (zzZV7 zzzv7 : zzn9()) {
            try {
                zzzv7.zzn6();
                zzzv7.dispose();
            } catch (Throwable th) {
                if (zzzv7 != null) {
                    zzzv7.dispose();
                }
                throw th;
            }
        }
        zzng().zzp();
        zzng().zzp();
        zzng().flush();
    }

    @Override // com.aspose.words.internal.zzZVB
    public final void startDocument() {
        zzng().zzX("<!DOCTYPE html>");
        if (zzn4().zznh().getPrettyFormat()) {
            zzng().zzX(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        zzng().zzY("html");
    }

    @Override // com.aspose.words.internal.zzZVB
    public final zzZV7 zzG8() throws Exception {
        return new zzI5(this.zzxx);
    }
}
