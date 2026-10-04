package com.aspose.words;

import com.huawei.hms.network.embedded.C18115b5;
import com.huawei.hms.network.embedded.C18358t1;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ1X extends zzZ24 {
    private String zzYhW;

    public zzZ1X(zzY4T zzy4t, zzZ9G zzz9g) {
        super(zzy4t);
        this.zzYhW = C18358t1.g.f56183c;
        this.zzY46 = zzz9g != null && zzZ7R.zzW(zzz9g, 70);
    }

    @Override // com.aspose.words.zzZ24
    public final boolean zzW(zzZ9G zzz9g) {
        return zzz9g != null && zzZ7R.zzW(zzz9g, 70);
    }

    @Override // com.aspose.words.zzZ24
    public final String zzYIW() {
        return this.zzY47 ? "</i>" : this.zzYhW;
    }

    @Override // com.aspose.words.zzZ24
    public final String zzYIX() {
        return this.zzY47 ? "<i>" : this.zzYhW;
    }

    @Override // com.aspose.words.zzZ24
    public final boolean zzYIY() {
        if (zzYIA() != 1 || this.zzY47) {
            return false;
        }
        if (!C18115b5.CONNECTOR.equals(this.zzYhW)) {
            this.zzYhW = C18115b5.CONNECTOR;
            zzIE(C18115b5.CONNECTOR);
        }
        return true;
    }
}
