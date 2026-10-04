package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ6G extends zzZ6F {
    private List zzWmY = new ArrayList();
    private boolean zzWmX = false;

    public final zzZ6H zzZ(zzZ6D zzz6d) throws zzZ6M {
        if (!this.zzWmY.isEmpty()) {
            throw new IllegalStateException("this method can only be used with SignerInfoGenerator");
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        zzZDJ zzzdj = new zzZDJ();
        this.zzWmB.clear();
        for (zzZ63 zzz63 : this.zzWmD) {
            zzZ6C.zzZ(linkedHashSet, zzz63, this.zzWmA);
            zzzdj.zzZ(zzz63.zzXHa());
        }
        zzZDA zzzdaZzXJW = zzz6d.zzXJW();
        if (zzz6d.getContent() != null) {
            OutputStream outputStreamZzT = zzZ6C.zzT(zzZ6C.zzZ(this.zzWmC, (OutputStream) null));
            try {
                zzz6d.write(outputStreamZzT);
                outputStreamZzT.close();
            } catch (IOException e) {
                throw new zzZ6M(C21111o0ooOoO.OooO00o(e, new StringBuilder("data processing exception: ")), e);
            }
        }
        for (zzZ65 zzz65 : this.zzWmC) {
            zzZAG zzzagZzP = zzz65.zzP(zzzdaZzXJW);
            linkedHashSet.add(zzzagZzP.zzXJB());
            zzzdj.zzZ(zzzagZzP);
            byte[] bArrZzXHg = zzz65.zzXHg();
            if (bArrZzXHg != null) {
                this.zzWmB.put(zzzagZzP.zzXJB().zzXJk().getId(), bArrZzXHg);
            }
        }
        return new zzZ6H(zzz6d, new zzZAP(zzZAQ.zzWFL, new zzZAJ(zzZ6C.zzX(linkedHashSet), new zzZAP(zzzdaZzXJW, null), this.zzWmF.size() != 0 ? this.zzWmX ? zzZ6C.zzT(this.zzWmF) : zzZ6C.zzU(this.zzWmF) : null, this.zzWmE.size() != 0 ? this.zzWmX ? zzZ6C.zzT(this.zzWmE) : zzZ6C.zzU(this.zzWmE) : null, new zzZC0(zzzdj))));
    }
}
