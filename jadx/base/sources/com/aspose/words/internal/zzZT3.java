package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZT3 extends zz81 {
    private boolean zz6v;
    private boolean zz6w;
    private boolean zz6x;
    private boolean zz6y;

    public zzZT3(zzA1 zza1) {
        this(zza1, true, true, true);
    }

    private void zzU(zzZTU zzztu) throws Exception {
        int type = zzztu.getType();
        if (type == 30) {
            this.zzog.save();
        } else {
            if (type != 295) {
                return;
            }
            this.zzog.restore(((zzZTS) zzztu.zzmM()).zzmL());
        }
    }

    private void zzV(zzZTU zzztu) throws Exception {
        int type = zzztu.getType();
        if (type == 259) {
            this.zzog.zzzV().zzUO(((zzZTK) zzztu.zzmM()).zzJe());
            return;
        }
        if (type == 529) {
            this.zzog.zzzV().zzZB(((zzZU4) zzztu.zzmM()).zzJC());
            return;
        }
        if (type == 1040) {
            this.zzog.zzzV().zzZ(((zzZTP) zzztu.zzmM()).zzJk());
            return;
        }
        if (type == 1042) {
            this.zzog.zzzV().zzY(((zzZTQ) zzztu.zzmM()).zzJk());
            return;
        }
        switch (type) {
            case 523:
                this.zzog.zzzV().zzZE(((zzZTA) zzztu.zzmM()).zzJC());
                break;
            case 524:
                this.zzog.zzzV().zzZG(((zzZTB) zzztu.zzmM()).getSize());
                break;
            case 525:
                this.zzog.zzzV().zzZD(((zzZTC) zzztu.zzmM()).zzJC());
                break;
            case 526:
                this.zzog.zzzV().zzZF(((zzZTD) zzztu.zzmM()).getSize());
                break;
            case 527:
                this.zzog.zzzV().zzZC(((zzZU3) zzztu.zzmM()).zzJC());
                break;
        }
    }

    private void zzW(zzZTU zzztu) throws Exception {
        int type = zzztu.getType();
        if (type == 300) {
            zzZ((zzZTO) zzztu.zzmM());
            return;
        }
        if (type == 544) {
            this.zzog.zzZJ(((zzZU5) zzztu.zzmM()).zzJC());
        } else if (type == 1045) {
            this.zzog.zzq(((zzZUF) zzztu.zzmM()).zzJH());
        } else {
            if (type != 1046) {
                return;
            }
            this.zzog.zzr(((zzZUB) zzztu.zzmM()).zzJH());
        }
    }

    private void zzX(zzZTU zzztu) throws Exception {
        int type = zzztu.getType();
        if (type != 247) {
            if (type == 301) {
                this.zzog.zzV0(((zzZTN) zzztu.zzmM()).zzmW() & 65535);
                return;
            }
            if (type != 322) {
                if (type == 496) {
                    this.zzof.delete(((zzZUM) zzztu.zzmM()).zzmW() & 65535);
                    return;
                } else if (type != 505 && type != 1791) {
                    switch (type) {
                    }
                    return;
                }
            }
        }
        this.zzof.zzY(((zzZU6) zzztu.zzmM()).zzJK());
    }

    private void zzY(zzZTU zzztu) throws Exception {
        int type = zzztu.getType();
        if (type == 258) {
            this.zzog.zzUZ(((zzZTL) zzztu.zzmM()).zzJf());
            return;
        }
        if (type == 260) {
            this.zzog.zzUX(((zzZTH) zzztu.zzmM()).zzNI());
            return;
        }
        if (type == 262) {
            this.zzog.zzY1(((zzZTI) zzztu.zzmM()).zzmJ());
            return;
        }
        if (type == 264) {
            this.zzog.zzUW(((zzZTF) zzztu.zzmM()).zzmH());
            return;
        }
        if (type == 302) {
            this.zzog.zzUY(((zzZTG) zzztu.zzmM()).zzmI());
            return;
        }
        if (type == 513) {
            this.zzog.zzM(((zzZTM) zzztu.zzmM()).zzmK());
            return;
        }
        if (type == 521) {
            this.zzog.zzC(((zzZTE) zzztu.zzmM()).zzmK());
            return;
        }
        if (type == 1313 || type == 2610) {
            zzZ((zzZT7) zzztu.zzmM());
        } else if (type == 531) {
            this.zzog.zzZI(((zzZU9) zzztu.zzmM()).zzYK());
        } else {
            if (type != 532) {
                return;
            }
            this.zzog.zzZI(((zzZU8) zzztu.zzmM()).zzYK());
        }
    }

    public final void zzZ(zzZTU zzztu) throws Exception {
        zzU(zzztu);
        if (this.zz6y) {
            zzV(zzztu);
        }
        if (this.zz6x) {
            zzW(zzztu);
        }
        if (this.zz6w) {
            zzY(zzztu);
        }
        if (this.zz6v) {
            zzX(zzztu);
        }
    }

    public zzZT3(zzA1 zza1, boolean z, boolean z2, boolean z3) {
        super(zza1, false);
        this.zz6y = z || z2;
        this.zz6x = z2;
        this.zz6w = true;
        this.zz6v = z3;
    }

    private void zzZ(zzZT7 zzzt7) throws Exception {
        if (zzMK().zzFr()) {
            this.zzog.zzZI(zzJ6.zzM(zzMK().zzFn(), zzzt7.zzY(zzMK().zzZr(), zzMK().zzFs().zzQ(zzMK().zzZr()), zzMK().zzFp(), zzKp().zzMk(), zzKp().zzAt().zzFF()).zzJC()));
        }
    }

    private void zzZ(zzZTO zzzto) {
        zz8O zz8o = (zz8O) zzZKW.zzZ(zzFk().zzWd(zzzto.zzmQ()), zz8O.class);
        if (zz8o == null) {
            return;
        }
        zzON zzonZzNh = zzOL.zzNh();
        for (int i = 0; i < zz8o.zzyF().getCount(); i++) {
            zzonZzNh = zzonZzNh.zzF(zz8o.zzyF().zzT7(i));
        }
        this.zzog.zzY(zzonZzNh, 5);
    }
}
