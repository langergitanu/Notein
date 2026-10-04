package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZOW {
    private zzZOV zzYAQ;
    private zzZOQ zzYAR;

    public zzZOW(zzZOQ zzzoq, zzZOV zzzov) {
        this.zzYAR = zzzoq;
        this.zzYAQ = zzzov;
    }

    public final Object zzA(Field field) {
        return this.zzYAQ.zzA(field);
    }

    public final void zzX(zzZAY zzzay) {
        this.zzYAQ.zzX(zzzay);
    }

    public final <T extends zzZAY> T zzY(T t) {
        T t2 = (T) zzm(t.getClass());
        if (t2 != null) {
            return t2;
        }
        this.zzYAQ.zzZ(t);
        return t;
    }

    public final void zzZ(zzZAY zzzay) {
        this.zzYAQ.zzZ(zzzay);
    }

    public final zzZAY zzm(Class cls) {
        zzZAY zzzay = null;
        for (zzZAY zzzay2 : this.zzYAQ) {
            if (zzzay2.getClass() == cls) {
                zzzay = zzzay2;
            }
        }
        return zzzay;
    }

    public final zzTL zzz(Field field) throws Exception {
        zzTL zztlZzQ;
        return (this.zzYAR.zzZay() == null || (zztlZzQ = this.zzYAR.zzZay().zzQ(field)) == null) ? this.zzYAQ.zzz(field) : zztlZzQ;
    }
}
