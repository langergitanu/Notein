package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ54 {
    private zzY9U zzYd8;
    private zzZ37 zzYd9;
    private zzYA9 zzYda = new zzYA9();
    private int zzYe6;
    private zzZ55 zzYeg;

    private static void zzW(zzYAU zzyau, boolean z) throws Exception {
        zzyau.zza9();
        zzyau.zzZZJ();
        zzZYV zzzyvZzZoS = zzyau.zzab().zzZoS();
        zzY9C zzy9cZzaa = zzyau.zzaa();
        while (zzyau != null) {
            if (!zzyau.zzQK(z)) {
                zzyau = (zzYAU) zzyau.zz5Z();
            }
        }
        zzzyvZzZoS.zzX(zzy9cZzaa);
    }

    private static void zzY(zzZ55 zzz55, zzYAU zzyau) throws Exception {
        zzYAU zzyau2;
        zzYAU zzyau3 = (zzYAU) zzz55.zz6w();
        zzZ55 zzz552 = zzz55;
        do {
            zzyau2 = (zzYAU) zzyau3.zzYo1();
            if (zzyau2 == null) {
                break;
            }
            zzz552 = (zzZ55) zzyau2.zzZZJ();
            zzyau2.zzY(zzz55);
            zzyau3 = zzyau2;
        } while (zzyau2 != zzyau);
        zzz55.zzY(zzyau3);
        if (zzz552 != zzz55) {
            zzZ55 zzz553 = (zzZ55) zzz55.zzYo1();
            while (zzz553 != zzz552) {
                zzZ55 zzz554 = (zzZ55) zzz553.zzYo1();
                zzz553.remove();
                zzz553 = zzz554;
            }
            if (zzyau3 == ((zzYAU) zzz552.zz6w())) {
                zzz552.remove();
            } else {
                zzz552.zzZ((zzYAU) zzyau3.zzYo1());
                zzz552.zzNd(3);
            }
        }
    }

    private void zzYPI() throws Exception {
        if (this.zzYd8 == null) {
            return;
        }
        this.zzYeg.zzYj(true);
        this.zzYeg.zzY((zzYMD) this.zzYd8, false);
        ((zzYMM) this.zzYeg.zza9()).zzB(this.zzYd8);
        this.zzYd8 = null;
        this.zzYeg.zzYj(false);
    }

    private void zzZ(zzZ5B zzz5b) throws Exception {
        zzYAU zzyauZzYQl;
        zzYAU zzyauZzX = zzVE.zzX((zzYAU) this.zzYeg.zz6x(), null);
        zzZT(zzyauZzX);
        zzZS(zzyauZzX);
        this.zzYda.zzZU(this.zzYeg);
        zzZ5C zzz5cZzUT = zzz5b.zzUT(true);
        zzYAU zzyauZz14 = zzz5cZzUT.zzYQY().zz14();
        boolean zZzZU = this.zzYeg.zzZU(zzyauZz14);
        if (zZzZU) {
            zzY9Q zzy9qZzG = zzY9Q.zzG((zzYAU) this.zzYeg.zz6x(), zzyauZz14);
            zzyauZzYQl = zzy9qZzG.zzYQl();
            zzyauZz14 = zzy9qZzG.zzYQk();
        } else {
            zzyauZzYQl = (zzYAU) this.zzYeg.zz6x();
        }
        boolean zZzQ = zzZ5D.zzQ(zzyauZzYQl, zzyauZz14);
        if (zZzQ) {
            zzz5cZzUT = zzz5b.zzUT(false);
        }
        zzZ(this.zzYeg, zzz5cZzUT.zzYQY());
        zzW((zzYAU) this.zzYeg.zz6x(), zZzZU);
        if (zzz5cZzUT.zzYQX()) {
            this.zzYda.zzZV(this.zzYeg);
        }
        this.zzYda.zzZT(this.zzYeg);
        if (zZzZU) {
            zzY9Q.zzG((zzYAU) this.zzYeg.zz6x(), (zzYAU) this.zzYeg.zz6w());
        } else if (this.zzYeg.zzYQ0()) {
            zzY9Q.zzZS(this.zzYeg);
        }
        if (zZzQ) {
            zzZ5D.zzP(this.zzYeg.zzYQl(), this.zzYeg.zzYQk());
        }
        this.zzYeg.zzYU(true);
        zzZ59.zzz(this.zzYeg);
        zzYPI();
    }

    private static int zzZR(zzYAU zzyau) throws Exception {
        int width = 0;
        while (zzyau.zzZo6() == 9217 && zzyau.zzY7r() == 5121) {
            width += zzyau.getWidth();
            zzyau = (zzYAU) zzyau.zz5Z();
        }
        return width;
    }

    private void zzZS(zzYAU zzyau) throws Exception {
        if (this.zzYd9.isList() && this.zzYeg.zzYQ3() && this.zzYd9.zzYLL().getAlignment() != 0) {
            int x = -zzZR(zzyau);
            if (this.zzYd9.zzYLI().zzYKw()) {
                x += (this.zzYd9.zzYLI().zzYKy()[this.zzYd9.zzYLI().zzYKx()] - this.zzYeg.getX()) - this.zzYd9.zzYLL().zzYO6();
            }
            if (this.zzYd9.zzYLL().getAlignment() == 1) {
                x /= 2;
            }
            zzZ55 zzz55 = this.zzYeg;
            zzz55.setWidth(zzz55.getWidth() - x);
            if (this.zzYeg.zz5T()) {
                return;
            }
            zzZ55 zzz552 = this.zzYeg;
            zzz552.setX(zzz552.getX() + x);
        }
    }

    private void zzZT(zzYAU zzyau) throws Exception {
        if (this.zzYd8 == null && (this.zzYeg.zza9().zza9() instanceof zzWV) && !this.zzYeg.zza9().zza9().zzYTn() && this.zzYd9.zzYLI().zzYKy().length == 1 && this.zzYd9.zzYLI().zzYKA()[0] == 3 && this.zzYeg.zzI(true, false).zzZo6() != 12803) {
            if ((this.zzYeg.zz5T() ? this.zzYeg.zzZZJ().getWidth() - this.zzYeg.getRight() : this.zzYeg.getX()) - this.zzYe6 < this.zzYd9.zzYLI().zzYKy()[0] && !(((zzYAU) this.zzYeg.zz6x()) instanceof zzYA5)) {
                zzY9U zzy9u = new zzY9U();
                this.zzYd8 = zzy9u;
                zzy9u.zzY7v();
                this.zzYd8.zzU(zzZ32.zzW(zzyau.zzY6N()));
                this.zzYd8.zzlT(zzyau.zzYTl());
                this.zzYd8.zzZ(this.zzYeg.zzaa());
                ((zzYMM) this.zzYeg.zza9()).zzZ(null, (zzYAU) this.zzYeg.zz6x(), this.zzYd8, false);
                this.zzYeg.zzU(this.zzYd8);
            }
        }
    }

    public final void zzM(zzZ55 zzz55, int i) throws Exception {
        if (zzz55 != null) {
            zzz55.isActive();
        }
        zzYMD.zzr(zzz55);
        this.zzYeg = zzz55;
        this.zzYd9 = (zzZ37) ((zzYMM) zzz55.zza9()).zzYTt();
        if (i == Integer.MIN_VALUE) {
            zzZ59.zzA(zzz55);
            this.zzYe6 = zzz55.zzYQ2();
        } else {
            this.zzYe6 = i;
        }
        zzZ(new zzZ5B(this.zzYeg, this.zzYe6));
        this.zzYeg.isActive();
        zzYMD.zzq(zzz55);
    }

    private static void zzZ(zzZ55 zzz55, zzVF zzvf) throws Exception {
        zzYAU zzyauZz14 = zzvf.zz14();
        int index = zzvf.getIndex();
        if (zzvf.zz12()) {
            if (zzyauZz14.zzYnY() && zzyauZz14.zzZZJ() == zzz55) {
                return;
            }
        } else {
            zzyauZz14.zzlX(index + 1);
            zzyauZz14 = zzVE.zzS((zzYAU) zzyauZz14.zzYo0());
        }
        if (zzz55 == zzyauZz14.zzZZJ()) {
            zzZ(zzz55, zzyauZz14);
        } else {
            zzY(zzz55, zzyauZz14);
        }
    }

    private static void zzZ(zzZ55 zzz55, zzYAU zzyau) throws Exception {
        if (zzyau != ((zzYAU) zzz55.zz6w())) {
            zzyau.zzZZJ();
        }
        zzZ55 zzz552 = (zzZ55) zzz55.zzYo1();
        if (zzz552 == null) {
            zzz552 = new zzZ55();
            zzz55.zza9().zzZ(zzz55, null, zzz552, true);
        }
        if (zzz552.isEmpty()) {
            zzz552.zzZ(zzz55.zz0v());
            zzz552.zz0v().zzY(zzz552);
            zzz55.zzZ((zzTE) null);
            zzYMD zzymdZz6x = zzz55.zz6x();
            while (true) {
                zzymdZz6x.zzY(zzz55);
                if (zzymdZz6x == zzyau) {
                    break;
                } else {
                    zzymdZz6x = zzymdZz6x.zzYo1();
                }
            }
        } else {
            zzYMD zzymdZzYo1 = zzyau.zzYo1();
            while (true) {
                zzymdZzYo1.zzY(zzz552);
                if (zzymdZzYo1 == zzz55.zz6w()) {
                    break;
                } else {
                    zzymdZzYo1 = zzymdZzYo1.zzYo1();
                }
            }
        }
        zzz552.zzZ(zzyau.zzYo1());
        if (zzz552.zz6w() == null) {
            zzz552.zzY(zzz55.zz6w());
        }
        zzz55.zzY(zzyau);
        zzz55.zzZW(null);
        zzz55.zzZV(null);
        zzz552.zzNd(3);
    }
}
