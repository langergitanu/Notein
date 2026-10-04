package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzL3 extends zz81 {
    private boolean zzCI;

    public zzL3(zzA1 zza1) {
        this(zza1, false);
    }

    private void zzV(zzLU zzlu) throws Exception {
        int type = zzlu.getType();
        if (type == 17) {
            this.zzog.zzzV().zzUO(((zzLI) zzlu.zzJm()).zzJe());
            return;
        }
        if (type == 31) {
            this.zzog.zzzV().zzY(((zzLQ) zzlu.zzJm()).zzJk());
            return;
        }
        if (type == 32) {
            this.zzog.zzzV().zzZ(((zzLP) zzlu.zzJm()).zzJk());
            return;
        }
        if (type == 35) {
            this.zzog.zzzV().zzY(((zzL8) zzlu.zzJm()).zzJD(), 4);
            return;
        }
        if (type == 36) {
            zzM9 zzm9 = (zzM9) zzlu.zzJm();
            this.zzog.zzzV().zzY(zzm9.zzJD(), zzm9.getMode());
            return;
        }
        switch (type) {
            case 9:
                this.zzog.zzzV().zzZG(((zzLA) zzlu.zzJm()).zzJa());
                break;
            case 10:
                this.zzog.zzzV().zzZE(((zzL9) zzlu.zzJm()).zzZT());
                break;
            case 11:
                this.zzog.zzzV().zzZF(((zzLC) zzlu.zzJm()).zzJa());
                break;
            case 12:
                this.zzog.zzzV().zzZD(((zzLB) zzlu.zzJm()).zzZT());
                break;
        }
    }

    private void zzW(zzLU zzlu) throws Exception {
        int type = zzlu.getType();
        if (type == 22) {
            this.zzog.zzUY(((zzLE) zzlu.zzJm()).zzJc());
            return;
        }
        if (type == 27) {
            this.zzog.zzZI(((zzM8) zzlu.zzJm()).zzJC());
            return;
        }
        if (type == 57) {
            this.zzog.zzUV(((zzLL) zzlu.zzJm()).zzJh());
            return;
        }
        if (type == 24) {
            this.zzog.zzC(((zzLD) zzlu.zzJm()).zzJb());
            return;
        }
        if (type == 25) {
            this.zzog.zzM(((zzLK) zzlu.zzJm()).zzJg());
            return;
        }
        switch (type) {
            case 18:
                this.zzog.zzUZ(((zzLJ) zzlu.zzJm()).zzJf());
                break;
            case 19:
                this.zzog.zzY1(((zzLG) zzlu.zzJm()).zzO6());
                break;
            case 20:
                this.zzog.zzUX(((zzLF) zzlu.zzJm()).zzJd());
                break;
        }
    }

    private void zzX(zzLU zzlu) throws Exception {
        int type = zzlu.getType();
        if (type == 33) {
            this.zzog.save();
        } else {
            if (type != 34) {
                return;
            }
            this.zzog.restore(((zzLS) zzlu.zzJm()).zzJl());
        }
    }

    private void zzZ(zzLN zzln) {
        if (!zzln.isEmpty()) {
            this.zzog.zzY(zzln.zzJi(), zzln.zzJj());
        } else if (zzln.zzJj() == 5) {
            this.zzog.zzzT().reset();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzY(zzLU zzlu) throws Exception {
        zzX(zzlu);
        zzW(zzlu);
        zzV(zzlu);
        if (this.zzCI) {
            return;
        }
        int type = zzlu.getType();
        if (type == 26) {
            this.zzog.zzZJ(((zzM6) zzlu.zzJm()).zzJC());
            return;
        }
        if (type != 49) {
            if (type == 75) {
                zzZ((zzLN) zzlu.zzJm());
                return;
            }
            if (type != 108) {
                if (type == 67) {
                    zzZ((zzLO) zzlu.zzJm());
                    return;
                }
                if (type == 68) {
                    zzMK().zzFm().zzzI();
                    return;
                }
                switch (type) {
                    case 2:
                    case 4:
                    case 5:
                    case 6:
                        zzZ((zzMG) zzlu.zzJm());
                        break;
                    case 3:
                    case 7:
                    case 8:
                        zzZ((zzM4) zzlu.zzJm());
                        break;
                    default:
                        switch (type) {
                            case 28:
                                this.zzog.zzzT().zzA4();
                                break;
                            case 29:
                                this.zzog.zzq(((zzMK) zzlu.zzJm()).zzJH());
                                break;
                            case 30:
                                this.zzog.zzr(((zzMC) zzlu.zzJm()).zzJH());
                                break;
                            default:
                                switch (type) {
                                    case 37:
                                        this.zzog.zzV0(((zzLM) zzlu.zzJm()).getHandle());
                                        break;
                                    case 38:
                                    case 39:
                                        break;
                                    case 40:
                                        this.zzof.delete(((zzMN) zzlu.zzJm()).getHandle());
                                        break;
                                    default:
                                        switch (type) {
                                            case 42:
                                            case 43:
                                            case 44:
                                            case 46:
                                            case 47:
                                                break;
                                            case 45:
                                                zzMX zzmx = (zzMX) zzlu.zzJm();
                                                zzmx.zzX7(zzMK().zzFl());
                                                zzZ(zzmx);
                                                break;
                                            default:
                                                switch (type) {
                                                    case 54:
                                                        break;
                                                    case 55:
                                                        break;
                                                    case 56:
                                                        zzZ((zzM0) zzlu.zzJm());
                                                        break;
                                                    default:
                                                        switch (type) {
                                                            case 59:
                                                                zzMK().zzFm().zzzH();
                                                                break;
                                                            case 60:
                                                                zzMK().zzFm().zzzG();
                                                                break;
                                                            case 61:
                                                                zzMK().zzFm().zzzF();
                                                                break;
                                                            case 62:
                                                            case 63:
                                                            case 64:
                                                                zzMK().zzFm().zzzD();
                                                                break;
                                                            default:
                                                                switch (type) {
                                                                    case 96:
                                                                    case 97:
                                                                        zzZ((zzLX) zzlu.zzJm());
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                return;
            }
            zzZ((zzL6) zzlu.zzJm());
            return;
        }
        this.zzof.zzY(((zzMS) zzlu.zzJm()).zzJK());
    }

    public zzL3(zzA1 zza1, boolean z) {
        super(zza1, true);
        this.zzCI = z;
    }

    private void zzZ(zzLO zzlo) {
        if (zzMK().zzFm().zzzB() == null) {
            return;
        }
        zzMK().zzFm().zzzC();
        zzMK().zzFm().zzzB().zzY1(zz9E.zzUU(zzMK().zzO6()));
        this.zzog.zzZ(zzMK().zzFm().zzzB(), zzlo.zzJj());
        zzMK().zzFm().zzzD();
    }

    private void zzZ(int i, float f, float f2, zzL1 zzl1) throws Exception {
        zzL3 zzl3;
        if (zzl1.isEmpty()) {
            return;
        }
        zz8N zz8nZzZ = zzl1.zzZ(zzMK().zzFs(), zzMK().zzZr(), zzMK().zzFp(), zzKp().zzMk(), zzKp().zzAt().zzFF());
        long jZzIV = zzl1.zzIV();
        boolean z = zzl1.zzIT() != null;
        if (zzMK().zzFr()) {
            jZzIV = zzMK().zzFn();
            zzl3 = this;
            zzl3.zzog.zzZI(zzJ6.zzM(jZzIV, zz8nZzZ.zzJC()));
        } else {
            zzl3 = this;
        }
        zz8M zz8m = new zz8M(zzl3.zzMK(), zz8nZzZ, jZzIV, i, f, f2, z, null);
        if (zzl3.zzMK().zzFm().isOpened()) {
            Iterator<zzP8> it = zz8m.zzyz().iterator();
            while (it.hasNext()) {
                zzl3.zzMK().zzFm().zzI(it.next());
            }
        }
    }

    private void zzZ(zzL6 zzl6) throws Exception {
        zzZ(zzl6.zzJu(), zzl6.zzJw(), zzl6.zzJv(), zzl6.zzJ9());
    }

    private void zzZ(zzLX zzlx) throws Exception {
        Iterator<zzL1> it = zzlx.zzJt().iterator();
        while (it.hasNext()) {
            zzZ(zzlx.zzJu(), zzlx.zzJw(), zzlx.zzJv(), it.next());
        }
    }

    private void zzZ(zzM0 zzm0) {
        if (zzm0.isEmpty()) {
            return;
        }
        if (zzMK().zzFm().isOpened()) {
            for (zzP5 zzp5 : zzm0.zza(zzMK().zzFn())) {
                zzMK().zzFm().zzU(zzp5);
                if (zzp5.isClosed()) {
                    zzMK().zzFm().zzzF();
                }
            }
        }
        this.zzog.zzZI(zzm0.zzJx()[zzm0.zzJy() - 1]);
    }

    private void zzZ(zzMG zzmg) {
        if (zzmg.isEmpty()) {
            return;
        }
        zzP5 zzp5Zzb = zzmg.zzb(zzMK().zzFn());
        if (zzMK().zzFm().isOpened()) {
            zzMK().zzFm().zzU(zzp5Zzb);
        }
        if (zzmg.zzJR()) {
            this.zzog.zzZI(zzp5Zzb.zzPQ());
        }
    }

    private void zzZ(zzM4 zzm4) {
        if (!zzm4.isEmpty() && zzMK().zzFm().isOpened()) {
            zzMK().zzFm().zzJ(zzm4.zzJL());
        }
    }
}
