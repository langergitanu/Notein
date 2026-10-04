package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ4N {
    private zzZAK zzYcR;
    private zzZAK zzYcS;
    private zzZ4M zzYcT;

    public zzZ4N() {
        this.zzYcT = new zzZ4M();
    }

    private static void zzS(zzZAK zzzak) {
        if (zzzak.zzZT5().getIndex() != zzzak.getIndex()) {
            zzzak.zzYg(zzzak.zzZT4().zzZT3() + 1000000000);
            return;
        }
        long jZzZT3 = zzzak.zzZT4().zzZT3() + 1;
        if (jZzZT3 < zzzak.zzZT5().zzZT3()) {
            zzzak.zzYg(jZzZT3);
            return;
        }
        long jZzZT32 = zzzak.zzZT4().zzZT3() + 100000;
        zzzak.zzYg(jZzZT32);
        for (zzZAK zzzakZzZT5 = zzzak.zzZT5(); zzzakZzZT5 != null && zzzakZzZT5.getIndex() == zzzak.getIndex() && zzzakZzZT5.zzZT3() <= jZzZT32; zzzakZzZT5 = zzzakZzZT5.zzZT5()) {
            jZzZT32 += 100000;
            zzzakZzZT5.zzYg(jZzZT32);
        }
    }

    private void zzV(zzZAK zzzak) {
        zzzak.setIndex(this.zzYcT.zzs4());
        this.zzYcT.zzR(zzzak);
        this.zzYcT.zzQ(zzzak);
        this.zzYcR = zzzak;
    }

    public static boolean zzZ(zzZAK zzzak, zzZAK zzzak2) {
        if (zzzak == zzzak2) {
            return false;
        }
        if (zzzak.getIndex() != zzzak2.getIndex()) {
            return zzzak.getIndex() < zzzak2.getIndex();
        }
        if (zzzak.zzZT3() != zzzak2.zzZT3()) {
            return zzzak.zzZT3() < zzzak2.zzZT3();
        }
        throw new IllegalStateException("Linked list is in invalid state.");
    }

    public final boolean isEmpty() {
        return this.zzYcT.zzYPd() == null;
    }

    public final boolean isFirst() {
        zzZAK zzzak = this.zzYcS;
        if (zzzak != null) {
            return zzzak == this.zzYcT.zzYPd();
        }
        throw new IllegalStateException("There is no current object.");
    }

    public final boolean isLast() {
        zzZAK zzzak = this.zzYcS;
        if (zzzak != null) {
            return zzzak == this.zzYcT.zzYPc();
        }
        throw new IllegalStateException("There is no current object.");
    }

    public final boolean moveNext() {
        if (isEmpty()) {
            return false;
        }
        zzZAK zzzak = this.zzYcS;
        if (zzzak == null) {
            if (this.zzYcR == null) {
                return zz0Z();
            }
            return false;
        }
        this.zzYcR = zzzak;
        this.zzYcS = zzzak.zzZT5();
        while (true) {
            zzZAK zzzak2 = this.zzYcS;
            if (zzzak2 == null || !zzzak2.zzZT2()) {
                break;
            }
            this.zzYcS = this.zzYcS.zzZT5();
        }
        zzZAK zzzak3 = this.zzYcS;
        if (zzzak3 != null) {
            this.zzYcR = zzzak3.zzZT4();
        }
        return this.zzYcS != null;
    }

    public final boolean movePrevious() {
        if (isEmpty()) {
            return false;
        }
        zzZAK zzzak = this.zzYcS;
        if (zzzak != null && zzzak.zzZT4() != this.zzYcR) {
            this.zzYcR = this.zzYcS.zzZT4();
        }
        zzZAK zzzak2 = this.zzYcR;
        if (zzzak2 != null) {
            this.zzYcS = zzzak2;
            this.zzYcR = zzzak2.zzZT4();
            return true;
        }
        if (this.zzYcS == null) {
            return false;
        }
        reset();
        return false;
    }

    public final void reset() {
        this.zzYcR = null;
        this.zzYcS = null;
    }

    public final boolean zz0Y() {
        if (isEmpty()) {
            return false;
        }
        zzZAK zzzakZzYPc = this.zzYcT.zzYPc();
        this.zzYcS = zzzakZzYPc;
        this.zzYcR = zzzakZzYPc.zzZT4();
        return true;
    }

    public final boolean zz0Z() {
        if (isEmpty()) {
            return false;
        }
        this.zzYcS = this.zzYcT.zzYPd();
        this.zzYcR = null;
        return true;
    }

    public final boolean zz13() {
        return this.zzYcS == null;
    }

    public final boolean zzT(zzZAK zzzak) {
        if (!zzzak.zzZT2()) {
            throw new IllegalStateException("An object already included into list.");
        }
        zzZAK zzzak2 = this.zzYcS;
        if (zzzak2 == null) {
            zzV(zzzak);
        } else {
            zzZAK zzzakZzZT5 = zzzak2.zzZT5();
            this.zzYcS.zzZ(zzzak);
            zzzak.zzY(this.zzYcS);
            zzzak.zzZ(zzzakZzZT5);
            if (zzzakZzZT5 == null) {
                this.zzYcT.zzQ(zzzak);
                zzzak.setIndex(this.zzYcT.zzs4());
            } else {
                zzzakZzZT5.zzY(zzzak);
                if (zzzakZzZT5.getIndex() > this.zzYcS.getIndex() + 1) {
                    zzzak.setIndex(this.zzYcS.getIndex() + 1);
                } else {
                    zzzak.setIndex(this.zzYcS.getIndex());
                    zzS(zzzak);
                }
            }
        }
        return true;
    }

    public final void zzU(zzZAK zzzak) {
        if (!zzzak.zzZT2()) {
            throw new IllegalStateException("An object already included into list.");
        }
        if (isEmpty()) {
            zzV(zzzak);
            return;
        }
        zzZAK zzzak2 = this.zzYcS;
        if (zzzak2 == null) {
            throw new IllegalStateException("There is no current object.");
        }
        zzzak.zzY(zzzak2.zzZT4());
        this.zzYcS.zzY(zzzak);
        zzzak.zzZ(this.zzYcS);
        if (zzzak.zzZT4() == null) {
            zzzak.setIndex(zzzak.zzZT5().getIndex() - 1);
            this.zzYcT.zzR(zzzak);
        } else {
            zzzak.zzZT4().zzZ(zzzak);
            if (zzzak.zzZT5().getIndex() > zzzak.zzZT4().getIndex() + 1) {
                zzzak.setIndex(zzzak.zzZT4().getIndex() + 1);
            } else {
                zzzak.setIndex(zzzak.zzZT4().getIndex());
                zzS(zzzak);
            }
        }
        this.zzYcR = this.zzYcS.zzZT4();
    }

    public final boolean zzW(zzZAK zzzak) {
        if (zzzak.zzZT2()) {
            return false;
        }
        this.zzYcS = zzzak;
        this.zzYcR = zzzak.zzZT4();
        return true;
    }

    public final void zzX(zzZAK zzzak) {
        if (!zzW(zzzak)) {
            throw new IllegalStateException("Object is not in the list.");
        }
    }

    public final zzZ4N zzYPe() {
        return new zzZ4N(this);
    }

    public final void zzYPf() {
        zzZAK zzzak = this.zzYcS;
        if (zzzak == null) {
            return;
        }
        zzZAK zzzakZzZT4 = zzzak.zzZT4();
        zzZAK zzzakZzZT5 = this.zzYcS.zzZT5();
        if (zzzakZzZT4 == null) {
            this.zzYcT.zzR(zzzakZzZT5);
        } else {
            zzzakZzZT4.zzZ(zzzakZzZT5);
        }
        if (zzzakZzZT5 == null) {
            this.zzYcT.zzQ(zzzakZzZT4);
        } else {
            zzzakZzZT5.zzY(zzzakZzZT4);
        }
        this.zzYcS.zzZT1();
        this.zzYcS = zzzakZzZT5;
        this.zzYcR = zzzakZzZT4;
    }

    public final boolean zzYPg() {
        return this.zzYcS == null && this.zzYcR != null;
    }

    public final zzZAK zzYPh() {
        zzZAK zzzak = this.zzYcS;
        if (zzzak == null) {
            return null;
        }
        return zzzak.zzZT5();
    }

    public final zzZAK zzYPi() {
        zzZAK zzzak = this.zzYcS;
        if (zzzak == null) {
            return null;
        }
        if (zzzak.zzZT2()) {
            while (true) {
                zzZAK zzzak2 = this.zzYcS;
                if (zzzak2 == null || !zzzak2.zzZT2()) {
                    break;
                }
                this.zzYcS = this.zzYcS.zzZT5();
            }
            zzZAK zzzak3 = this.zzYcS;
            this.zzYcR = zzzak3 != null ? zzzak3.zzZT4() : null;
        }
        return this.zzYcS;
    }

    private zzZ4N(zzZ4N zzz4n) {
        this.zzYcT = zzz4n.zzYcT;
        this.zzYcS = zzz4n.zzYcS;
        this.zzYcR = zzz4n.zzYcR;
    }
}
