package com.aspose.words.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYGW {

    /* JADX INFO: renamed from: ew */
    zzZ6H f50831ew;

    /* JADX INFO: renamed from: ex */
    zzZ63 f50832ex;

    /* JADX INFO: renamed from: ey */
    zzYGV f50833ey;

    /* JADX INFO: renamed from: ez */
    zzZ f50834ez;

    public zzYGW(zzZAP zzzap) throws zzYH1, IOException {
        this(zzZ(zzzap));
    }

    private static zzZ6H zzZ(zzZAP zzzap) throws zzYH1 {
        try {
            return new zzZ6H(zzzap);
        } catch (zzZ6M e) {
            throw new zzYH1("TSP parsing error: " + e.getMessage(), e.getCause());
        }
    }

    public final zzZ6H zzXyn() {
        return this.f50831ew;
    }

    private zzYGW(zzZ6H zzz6h) throws zzYH1, IOException {
        this.f50831ew = zzz6h;
        if (!zzz6h.zzXHk().equals(zzZ96.zzWxw.getId())) {
            throw new zzYH0("ContentInfo object not for a time stamp.");
        }
        Collection<zzZ63> collectionZzXH9 = this.f50831ew.zzXHl().zzXH9();
        if (collectionZzXH9.size() != 1) {
            throw new IllegalArgumentException("Time-stamp token signed by " + collectionZzXH9.size() + " signers, but it must contain just the TSA signature.");
        }
        this.f50832ex = collectionZzXH9.iterator().next();
        try {
            zzZ6D zzz6dZzXHj = this.f50831ew.zzXHj();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            zzz6dZzXHj.write(byteArrayOutputStream);
            this.f50833ey = new zzYGV(zzZ8O.zzXw(zzZD5.zzXo(byteArrayOutputStream.toByteArray())));
            zzZAV zzzavZzW = this.f50832ex.zzXHd().zzW(zzZ96.zzWxc);
            if (zzzavZzW != null) {
                this.f50834ez = new zzZ(zzZA6.zzY2(zzZA4.zzY0(zzzavZzW.zzXK0().zzg6(0)).zzXJu()[0]));
                return;
            }
            zzZAV zzzavZzW2 = this.f50832ex.zzXHd().zzW(zzZ96.zzWxb);
            if (zzzavZzW2 == null) {
                throw new zzYH0("no signing certificate attribute found, time stamp invalid.");
            }
            this.f50834ez = new zzZ(zzZA5.zzY1(zzZA3.zzXZ(zzzavZzW2.zzXK0().zzg6(0)).zzXJt()[0]));
        } catch (zzZ6M e) {
            throw new zzYH1(e.getMessage(), e.zzXHn());
        }
    }

    public static class zzZ {

        /* JADX INFO: renamed from: eA */
        private zzZA6 f50835eA;

        /* JADX INFO: renamed from: eB */
        private zzZA5 f50836eB;

        public zzZ(zzZA6 zzza6) {
            this.f50835eA = zzza6;
            this.f50836eB = null;
        }

        public zzZ(zzZA5 zzza5) {
            this.f50836eB = zzza5;
            this.f50835eA = null;
        }
    }
}
