package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzD7 {
    private zzD6 zzZa7;
    private float zzZa8 = com.aspose.words.internal.zzSA.zzp(1.0d);

    public zzD7(zzD6 zzd6) {
        this.zzZa7 = zzd6;
    }

    private static boolean zzKp(int i) {
        return i == 4 || i == 1;
    }

    private boolean zzKq(int i) {
        for (ChartAxis chartAxis : this.zzZa7.zz45().zz3G()) {
            if (!chartAxis.getHidden() && ((i != 6 && i != 7) || chartAxis.zz40())) {
                if ((i != 4 && i != 5) || !chartAxis.zz40()) {
                    if ((i == 7 || i == 4) && chartAxis.zz3W()) {
                        return true;
                    }
                    if (i == 6 || i == 5) {
                        if (!chartAxis.zz3W()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private void zzKr(int i) {
        boolean zZzKq = zzKq(i);
        if (i == 4) {
            zzD6 zzd6 = this.zzZa7;
            zzd6.zzYY(zzd6.zzZn() + (zZzKq ? zzZ2(this.zzZa7.zzZn()) : 0.0f));
            return;
        }
        if (i == 5) {
            zzD6 zzd62 = this.zzZa7;
            zzd62.zzZ1(zzd62.zzZo() + (zZzKq ? com.aspose.words.internal.zzSA.zzYB(6) : 0));
        } else if (i == 6) {
            zzD6 zzd63 = this.zzZa7;
            zzd63.zzYZ(zzd63.zzkw() + (zZzKq ? zzZ2(this.zzZa7.zzkw()) : 0.0f));
        } else {
            if (i != 7) {
                return;
            }
            float fZzZ2 = zZzKq ? zzZ2(this.zzZa7.zzZm()) : 0.0f;
            zzD6 zzd64 = this.zzZa7;
            zzd64.zzZ0(zzd64.zzZm() + fZzZ2);
            this.zzZa7.zz43().zzZ5(this.zzZa7.zz43().zzZIt() + fZzZ2);
        }
    }

    private void zzKs(int i) {
        switch (i) {
            case 0:
            case 4:
                zzD6 zzd6 = this.zzZa7;
                zzd6.zzZ1(zzd6.zzZo() + com.aspose.words.internal.zzSA.zzYB(6));
                break;
            case 1:
            case 5:
                zzD6 zzd62 = this.zzZa7;
                zzd62.zzYY(zzd62.zzZn() + zzZ2(this.zzZa7.zzZn()));
                break;
            case 2:
            case 6:
                float fZzZ2 = zzZ2(this.zzZa7.zzZm());
                zzD6 zzd63 = this.zzZa7;
                zzd63.zzZ0(zzd63.zzZm() + fZzZ2);
                this.zzZa7.zz43().zzZ5(this.zzZa7.zz43().zzZIt() + fZzZ2);
                break;
            case 3:
            case 7:
                zzD6 zzd64 = this.zzZa7;
                zzd64.zzYZ(zzd64.zzkw() + zzZ2(this.zzZa7.zzkw()));
                break;
        }
    }

    private void zzY(zz0A zz0a) throws Exception {
        switch (zz0a.getTitlePosition()) {
            case 0:
            case 4:
                zzD6 zzd6 = this.zzZa7;
                zzd6.zzZ1(zzd6.zzZo() + zz0a.zzZHa());
                break;
            case 1:
            case 5:
                zzD6 zzd62 = this.zzZa7;
                zzd62.zzYY(zz0a.zzZHa() + this.zzZa7.zzZa6 + zzd62.zzZn());
                break;
            case 2:
            case 6:
                float width = zz0a.getWidth();
                zzD6 zzd63 = this.zzZa7;
                float f = width + zzd63.zzZa6;
                zzd63.zzZ0(zzd63.zzZm() + f);
                this.zzZa7.zz43().zzZ5(this.zzZa7.zz43().zzZIt() + f);
                break;
            case 3:
            case 7:
                zzD6 zzd64 = this.zzZa7;
                zzd64.zzYZ(zz0a.getWidth() + this.zzZa7.zzZa6 + zzd64.zzkw());
                break;
        }
    }

    private static float zzZ2(float f) {
        float fZzYB = com.aspose.words.internal.zzSA.zzYB(11);
        return f < fZzYB ? fZzYB - f : com.aspose.words.internal.zzSA.zzp(4.5d);
    }

    private float zzZLs() {
        return this.zzZa7.zz43().zzZIC().zzZdM;
    }

    public final void zzZ(zz0A zz0a, boolean z) throws Exception {
        if (zz0a.getOverlay() || com.aspose.words.internal.zzAN.zzf(zz0a.getHeight())) {
            return;
        }
        if (z) {
            zzZ(zz0a);
        } else {
            zzY(zz0a);
        }
    }

    public final void zzZHF() {
        zzD6 zzd6 = this.zzZa7;
        zzd6.zzZ0(zzd6.zzZm() + zzZLs());
        zzD6 zzd62 = this.zzZa7;
        zzd62.zzZ1(zzd62.zzZo() + zzZLs());
        zzD6 zzd63 = this.zzZa7;
        zzd63.zzYZ(zzd63.zzkw() + zzZLs());
        zzD6 zzd64 = this.zzZa7;
        zzd64.zzYY(zzd64.zzZn() + zzZLs());
    }

    public final void zzZHG() {
        float fZzp = com.aspose.words.internal.zzSA.zzp(1.0d);
        zzD6 zzd6 = this.zzZa7;
        zzd6.zzZ1(zzd6.zzZo() + fZzp);
    }

    public final void zzc(int i, boolean z) {
        if (z) {
            zzKr(i);
        } else {
            zzKs(i);
        }
    }

    private void zzZ(zz0A zz0a) throws Exception {
        float f = zzKq(zz0a.getTitlePosition()) ? 1.0f : -1.0f;
        int titlePosition = zz0a.getTitlePosition();
        if (titlePosition == 4) {
            zzD6 zzd6 = this.zzZa7;
            zzd6.zzYY(zzd6.zzZn() + zz0a.zzZHa());
            return;
        }
        if (titlePosition == 5) {
            zzD6 zzd62 = this.zzZa7;
            zzd62.zzZ1(zzd62.zzZo() + zz0a.zzZHa());
            zzD6 zzd63 = this.zzZa7;
            zzd63.zzYY(zzd63.zzZn() + this.zzZa7.zzZa6);
            return;
        }
        if (titlePosition == 6) {
            zzD6 zzd64 = this.zzZa7;
            zzd64.zzZ0(zzd64.zzZm() + this.zzZa7.zzZa6);
            zzD6 zzd65 = this.zzZa7;
            zzd65.zzYZ(OooOO0.OooO0O0.OooO00o(f, this.zzZa7.zzZa6, zz0a.getWidth(), zzd65.zzkw()));
            return;
        }
        if (titlePosition != 7) {
            return;
        }
        zzD6 zzd66 = this.zzZa7;
        zzd66.zzYZ(zzd66.zzkw() + this.zzZa7.zzZa6);
        float width = zz0a.getWidth();
        zzD6 zzd67 = this.zzZa7;
        float f2 = (f * zzd67.zzZa6) + width;
        zzd67.zzZ0(zzd67.zzZm() + f2);
        this.zzZa7.zz43().zzZ5(this.zzZa7.zz43().zzZIt() + f2);
    }

    private float zzY(zzEM zzem) {
        if (zzKp(zzem.getPosition())) {
            return 0.0f;
        }
        return (zzZLs() * (this.zzZa7.zz45().zzZJd().zz3R() ? 2.4f : 1.0f)) + zzem.getWidth();
    }

    public final void zzZ(zzCS zzcs) {
        zzD6 zzd6 = this.zzZa7;
        zzd6.zzZ1(zzd6.zzZo() + (zzcs.getOverlay() ? -this.zzZa8 : zzZLs()));
    }

    public final void zzZ(zzEM zzem) {
        if (zzem.getOverlay()) {
            return;
        }
        this.zzZa7.zz43().zzKx(zzem.getPosition());
        int position = zzem.getPosition();
        if (position == 1) {
            zzD6 zzd6 = this.zzZa7;
            zzd6.zzYY(zzd6.zzZn() + zzem.zzZLD());
            return;
        }
        if (position != 2) {
            if (position != 3) {
                if (position == 4) {
                    zzD6 zzd62 = this.zzZa7;
                    zzd62.zzZ1(zzd62.zzZo() + zzem.zzZLD());
                    return;
                } else if (position != 5) {
                    return;
                }
            }
            float fZzY = zzY(zzem);
            zzD6 zzd63 = this.zzZa7;
            zzd63.zzYZ(zzd63.zzkw() + fZzY);
            this.zzZa7.zz43().zzZ3(fZzY);
            return;
        }
        zzD6 zzd64 = this.zzZa7;
        zzd64.zzZ0(zzd64.zzZm() + zzY(zzem));
    }
}
