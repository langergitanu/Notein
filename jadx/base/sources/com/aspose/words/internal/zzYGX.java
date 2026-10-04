package com.aspose.words.internal;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYGX {

    /* JADX INFO: renamed from: eu */
    zzZ8M f50837eu;

    /* JADX INFO: renamed from: ev */
    zzYGW f50838ev;

    private zzYGX(zzZ8M zzz8m) throws zzYH1, IOException {
        this.f50837eu = zzz8m;
        if (zzz8m.zzXIF() != null) {
            this.f50838ev = new zzYGW(zzz8m.zzXIF());
        }
    }

    private int getStatus() {
        return this.f50837eu.zzXIG().zzXK2().intValue();
    }

    private static zzZ8M zzK(InputStream inputStream) throws zzYH1, IOException {
        try {
            return zzZ8M.zzXv(new zzZDE(inputStream).zzXKN());
        } catch (ClassCastException e) {
            throw new zzYH1("malformed timestamp response: " + e, e);
        } catch (IllegalArgumentException e2) {
            throw new zzYH1("malformed timestamp response: " + e2, e2);
        }
    }

    public final zzYGW zzXyo() {
        return this.f50838ev;
    }

    public final void zzZ(zzYGZ zzygz) throws zzYH1 {
        zzYGW zzygw = this.f50838ev;
        if (zzygw == null) {
            if (getStatus() == 0 || getStatus() == 1) {
                throw new zzYH0("no time stamp token found and one expected.");
            }
            return;
        }
        zzYGV zzygv = zzygw.f50833ey;
        if (zzygz.zzXyq() != null && !zzygz.zzXyq().equals(zzygv.zzXyq())) {
            throw new zzYH0("response contains wrong nonce value.");
        }
        if (getStatus() != 0 && getStatus() != 1) {
            throw new zzYH0("time stamp token found in failed request.");
        }
        if (!zzYGU.zzo(zzygz.zzXyr(), zzygv.zzXyr())) {
            throw new zzYH0("response for different message imprint digest.");
        }
        if (!zzygv.zzXys().equals(zzygz.zzXys())) {
            throw new zzYH0("response for different message imprint algorithm.");
        }
        zzZAV zzzavZzW = zzygw.f50832ex.zzXHd().zzW(zzZ96.zzWxc);
        zzZAV zzzavZzW2 = zzygw.f50832ex.zzXHd().zzW(zzZ96.zzWxb);
        if (zzzavZzW == null && zzzavZzW2 == null) {
            throw new zzYH0("no signing certificate attribute present.");
        }
        if (zzygz.zzXII() != null && !zzygz.zzXII().equals(zzygv.f50829eC.zzXIL())) {
            throw new zzYH0("TSA policy wrong for request.");
        }
    }

    public zzYGX(InputStream inputStream) throws zzYH1, IOException {
        this(zzK(inputStream));
    }
}
