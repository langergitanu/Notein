package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class DigitalSignatureCollection implements Iterable<DigitalSignature> {
    private ArrayList<DigitalSignature> zzZm = new ArrayList<>();
    private com.aspose.words.internal.zzIR<DigitalSignature> zzZiz = new com.aspose.words.internal.zzIR<>();

    public DigitalSignature get(int i) {
        return this.zzZm.get(i);
    }

    public int getCount() {
        return this.zzZm.size();
    }

    public boolean isValid() {
        Iterator<DigitalSignature> it = this.zzZm.iterator();
        while (it.hasNext()) {
            if (!it.next().isValid()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<DigitalSignature> iterator() {
        return this.zzZm.iterator();
    }

    public final DigitalSignature zzRN(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            return this.zzZiz.zzX(new com.aspose.words.internal.zzZOZ(str));
        }
        return null;
    }

    public final void zzZ(DigitalSignature digitalSignature) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, digitalSignature);
        if (digitalSignature.getVisible()) {
            this.zzZiz.zzZ(digitalSignature.zzZSw(), digitalSignature);
        } else {
            com.aspose.words.internal.zzZOZ zzzoz = com.aspose.words.internal.zzZOZ.zzZXP;
        }
    }
}
