package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZTJ extends zzZTO {
    public zzZTJ() {
        super(61440);
    }

    public static zzZTJ zzZit() {
        zzZTJ zzztj = new zzZTJ();
        zzztj.zzZiD().zzZ(new zzZTK());
        zzztj.zzZiD().zzZ(new zzZTX());
        return zzztj;
    }

    public final void zzX(zzZSP zzzsp) throws Exception {
        if (zzZir() != null) {
            zzZir().zzX(zzzsp);
        }
    }

    public final zzZTK zzZiq() {
        return (zzZTK) zzn(zzZTK.class);
    }

    public final zzZTX zzZir() {
        return (zzZTX) zzn(zzZTX.class);
    }

    public final void zzZis() {
        if (zzZir() == null || zzZir().getCount() != 0) {
            return;
        }
        zzZiD().zzY(zzZir());
    }

    public final void zzz(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        if (zzZir() != null) {
            zzZir().zzz(zzzox);
        }
    }
}
