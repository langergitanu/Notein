package com.aspose.words;

import com.huawei.hms.network.embedded.C18358t1;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZSG {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("ABS", "AND", "AVERAGE", "COUNT", "DEFINED", "FALSE", "IF", "INT", "MAX", "MIN", "MOD", "NOT", "OR", "PRODUCT", "ROUND", "SIGN", "SUM", "TRUE");
    private boolean zzYJ0;
    private zzYNP zzYJ1;
    private zzZSM zzYJ2;
    private zzZSM zzYJ3;
    private zzZBH zzYJ4;
    private zzZSI zzYJ5;
    private zzZQM zzZts;

    private zzZSG(zzZQM zzzqm, zzZBH zzzbh) {
        this.zzZts = zzzqm;
        this.zzYJ4 = zzzbh;
    }

    private static boolean zzK(ArrayList<Object> arrayList, int i) {
        return (i < arrayList.size() ? arrayList.get(i) : null) instanceof zzY4D;
    }

    private static zzZLP zzMs(String str) {
        switch (zzUR.zzTP(str.toUpperCase())) {
            case 0:
                return new zzZ();
            case 1:
                return new zzM();
            case 2:
                return new zzZG();
            case 3:
                return new zzT4();
            case 4:
                return new zzK0();
            case 5:
                return new zzZRI();
            case 6:
                return new zzZ8O();
            case 7:
                return new zzZ7O();
            case 8:
                return new zzYZN();
            case 9:
                return new zzYYO();
            case 10:
                return new zzYXI();
            case 11:
                return new zzYVS();
            case 12:
                return new zzYNL();
            case 13:
                return new zzYKS();
            case 14:
                return new zzYIJ();
            case 15:
                return new zzYBH();
            case 16:
                return new zzY84();
            case 17:
                return new zzY4V();
            default:
                return null;
        }
    }

    private ArrayList<Object> zzMt(String str) throws Exception {
        this.zzYJ5 = new zzZSI(str);
        ArrayList<Object> arrayList = new ArrayList<>();
        boolean z = true;
        while (!this.zzYJ5.zzYC()) {
            if (this.zzYJ5.getPosition() == 0 && this.zzYJ5.zzIw() == '=') {
                this.zzYJ5.zzZi0();
                if (this.zzYJ5.zzYC()) {
                    return null;
                }
            }
            this.zzYJ5.zzZUY();
            if (this.zzYJ5.zzYC() || this.zzYJ5.zzIw() == '\\') {
                break;
            }
            zzYNQ zzynqZzWf = zzWf(z);
            if (zzynqZzWf != null) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYNQ>) arrayList, zzynqZzWf);
                z = !zzynqZzWf.zzYqR();
            } else {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZBJ>) arrayList, zzZhZ());
                z = false;
            }
        }
        return arrayList;
    }

    private zzZSM zzMu(String str) throws Exception {
        ArrayList<Object> arrayListZzMt = zzMt(str);
        if (arrayListZzMt == null) {
            return null;
        }
        zzZSM zzzsmZzZL = zzZL(this.zzYJ4.zzZ(zzZM(arrayListZzMt), this.zzZts));
        if (zzzsmZzZL == null) {
            return null;
        }
        return this.zzYJ4.zzZ(zzzsmZzZL, this.zzZts, str);
    }

    private void zzW(zzZBJ zzzbj) {
        if (this.zzYJ0) {
            this.zzYJ2.zzY(zzzbj);
        } else {
            zzZhY();
            this.zzYJ3.zzY(zzzbj);
        }
    }

    private zzYNQ zzWf(boolean z) {
        if (this.zzYJ5.zzMv("+")) {
            return new zzT();
        }
        if (this.zzYJ5.zzMv(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR)) {
            return z ? new zzY4D() : new zzY85();
        }
        if (this.zzYJ5.zzMv("%")) {
            return new zzY4B();
        }
        if (this.zzYJ5.zzMv(C18358t1.g.f56183c)) {
            return new zzYWW();
        }
        if (this.zzYJ5.zzMv("/")) {
            return new zzJO();
        }
        if (this.zzYJ5.zzMv("^")) {
            return new zzZSK();
        }
        if (this.zzYJ5.zzMv("=")) {
            return new zzZU4();
        }
        if (this.zzYJ5.zzMv(">=")) {
            return new zzZLB();
        }
        if (this.zzYJ5.zzMv(">")) {
            return new zzZLC();
        }
        if (this.zzYJ5.zzMv("<=")) {
            return new zzZ5U();
        }
        if (this.zzYJ5.zzMv("<>")) {
            return new zzZ7W();
        }
        if (this.zzYJ5.zzMv("<")) {
            return new zzZ5V();
        }
        if (this.zzYJ5.zzMv("(")) {
            return new zzZ5Z();
        }
        if (this.zzYJ5.zzMv(")")) {
            return new zzYIO();
        }
        return null;
    }

    private void zzX(zzZBJ zzzbj) {
        if (this.zzYJ0 && !(zzzbj instanceof zzZVZ)) {
            this.zzYJ0 = false;
        }
        zzW(zzzbj);
    }

    public static zzZSM zzY(zzZQM zzzqm, String str, zzZBH zzzbh) throws Exception {
        return new zzZSG(zzzqm, zzzbh).zzMu(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean zzZ(zzYNQ zzynq) {
        if (zzynq.zzYRp()) {
            if (this.zzYJ0) {
                zzZhY();
            } else {
                this.zzYJ0 = true;
            }
        }
        if (this.zzYJ1.getCount() == 0 || zzynq.zzYRp()) {
            this.zzYJ1.zzY(zzynq);
            return true;
        }
        if (!zzynq.zzYqR()) {
            if (this.zzYJ0 && (!zzynq.zzYqQ() || zzynq.zzYqP())) {
                this.zzYJ0 = false;
            }
            while (this.zzYJ1.getCount() > 0 && zzynq.getOrder() >= this.zzYJ1.zzYqN().getOrder()) {
                zzW((zzZBJ) this.zzYJ1.zzYqO());
            }
            this.zzYJ1.zzY(zzynq);
            return true;
        }
        while (true) {
            if (this.zzYJ1.getCount() <= 0) {
                break;
            }
            zzYNQ zzynqZzYqO = this.zzYJ1.zzYqO();
            if (!zzynqZzYqO.zzYRp()) {
                zzZBJ zzzbj = (zzZBJ) com.aspose.words.internal.zzZKW.zzZ(zzynqZzYqO, zzZBJ.class);
                if (zzzbj == null) {
                    return false;
                }
                zzW(zzzbj);
            } else if (this.zzYJ0) {
                this.zzYJ0 = false;
                zzW(new zzY4D(true));
            }
        }
    }

    private zzZSM zzZL(ArrayList<Object> arrayList) {
        zzYNQ zzynq;
        this.zzYJ3 = new zzZSM();
        this.zzYJ2 = new zzZSM();
        this.zzYJ1 = new zzYNP();
        this.zzYJ0 = false;
        if (arrayList.size() > 0 && (zzynq = (zzYNQ) com.aspose.words.internal.zzZKW.zzZ(arrayList.get(0), zzYNQ.class)) != null && (arrayList.get(0) instanceof zzZBJ) && !zzynq.zzYqQ()) {
            return null;
        }
        for (Object obj : arrayList) {
            zzYNQ zzynq2 = (zzYNQ) com.aspose.words.internal.zzZKW.zzZ(obj, zzYNQ.class);
            if (zzynq2 == null) {
                zzZBJ zzzbj = (zzZBJ) com.aspose.words.internal.zzZKW.zzZ(obj, zzZBJ.class);
                if (zzzbj != null) {
                    zzX(zzzbj);
                }
            } else if (!zzZ(zzynq2)) {
                return null;
            }
        }
        if (this.zzYJ0) {
            return null;
        }
        while (this.zzYJ1.getCount() > 0) {
            zzZBJ zzzbj2 = (zzZBJ) com.aspose.words.internal.zzZKW.zzZ(this.zzYJ1.zzYqO(), zzZBJ.class);
            if (zzzbj2 == null) {
                return null;
            }
            zzW(zzzbj2);
        }
        return this.zzYJ3;
    }

    private static ArrayList<Object> zzZM(ArrayList<Object> arrayList) {
        ArrayList<Object> arrayList2 = new ArrayList<>(arrayList.size());
        int i = 0;
        while (i < arrayList.size()) {
            if (zzK(arrayList, i) && zzK(arrayList, i + 1)) {
                i += 2;
            } else {
                com.aspose.words.internal.zzZQG.zzZ(arrayList2, arrayList.get(i));
                i++;
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[LOOP:0: B:3:0x0008->B:21:0x0047, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d A[EDGE_INSN: B:26:0x004d->B:22:0x004d BREAK  A[LOOP:0: B:3:0x0008->B:21:0x0047], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String zzZhX() {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        boolean z2 = false;
        while (this.zzYJ5.getPosition() < this.zzYJ5.getExpression().length()) {
            char cZzIw = this.zzYJ5.zzIw();
            int iZzZ = zzZ(cZzIw, sb);
            boolean z3 = true;
            if (iZzZ != 0) {
                if (iZzZ != 1) {
                    if (iZzZ != 2) {
                        if (iZzZ != 3) {
                            throw new IllegalArgumentException();
                        }
                        sb.append(cZzIw);
                    }
                    if (z3) {
                        break;
                    }
                    this.zzYJ5.zzZi0();
                } else if (z2) {
                    z = true;
                }
                z3 = false;
                if (z3) {
                }
            } else {
                if (!z) {
                    sb.append(cZzIw);
                    z2 = true;
                    z3 = false;
                }
                if (z3) {
                }
            }
        }
        return com.aspose.words.internal.zzZKN.zzTX(sb.toString());
    }

    private void zzZhY() {
        while (this.zzYJ2.getCount() != 0) {
            this.zzYJ3.zzY(this.zzYJ2.zzZi1());
        }
    }

    private zzZBJ zzZhZ() throws Exception {
        String strZzZhX = zzZhX();
        zzZLP zzzlpZzMs = zzMs(strZzZhX);
        if (zzzlpZzMs == null) {
            zzZVZ zzzvzZzMJ = zzZVZ.zzMJ(strZzZhX);
            return zzzvzZzMJ != null ? zzzvzZzMJ : new zzY94(strZzZhX);
        }
        this.zzYJ5.zzZUY();
        if (!this.zzYJ5.zzYC() && this.zzYJ5.zzIw() == '(') {
            zzZ(zzzlpZzMs);
        }
        return zzzlpZzMs;
    }

    private boolean zzY(char c, StringBuilder sb) {
        if (c != '%' && c != '-' && c != '/' && c != '\\' && c != '^') {
            switch (c) {
                default:
                    switch (c) {
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            if (this.zzYJ4.zzZ(c, this.zzYJ5.getExpression(), this.zzYJ5.getPosition(), sb)) {
                                this.zzYJ5.zzZi0();
                            }
                            break;
                    }
                    return true;
                case '(':
                case ')':
                case '*':
                case '+':
                    return true;
            }
        }
        return true;
    }

    private void zzZ(zzZLP zzzlp) throws Exception {
        char cZzH2 = com.aspose.words.internal.zzJB.zzH2();
        int i = 0;
        char[] cArr = {'\"', '(', ')', cZzH2};
        boolean z = cZzH2 == com.aspose.words.internal.zzJB.zzH4();
        char[] cArr2 = {'\"'};
        this.zzYJ5.zzZi0();
        int position = this.zzYJ5.getPosition();
        String strZzZ = "";
        char[] cArr3 = cArr;
        boolean z2 = true;
        while (!this.zzYJ5.zzYC() && this.zzYJ5.zzQ(cArr3)) {
            char cZzIw = this.zzYJ5.zzIw();
            if (cZzIw == '\"') {
                cArr3 = z2 ? cArr2 : cArr;
                z2 = !z2;
            } else if (cZzIw == '(') {
                i++;
            } else if (cZzIw != ')') {
                if (i == 0) {
                    if (z) {
                        strZzZ = zzZ(zzzlp, position, strZzZ);
                    } else {
                        zzZ(zzzlp, position);
                    }
                    position = this.zzYJ5.getPosition() + 1;
                }
            } else {
                if (i == 0) {
                    if (z) {
                        strZzZ = zzZ(zzzlp, position, strZzZ);
                    } else {
                        zzZ(zzzlp, position);
                    }
                    this.zzYJ5.zzZi0();
                    if (com.aspose.words.internal.zzZYD.zzXk(strZzZ)) {
                        zzZ(zzzlp, strZzZ);
                        return;
                    }
                    return;
                }
                i--;
            }
            this.zzYJ5.zzZi0();
        }
        if (com.aspose.words.internal.zzZYD.zzXk(strZzZ)) {
            zzZ(zzzlp, strZzZ);
        }
        zzZ(zzzlp, position);
    }

    private String zzZ(zzZLP zzzlp, int i, String str) throws Exception {
        String strZzZ5j;
        zzZLO zzzlo = new zzZLO(C22241OooO0Oo.OooO00o(this.zzYJ5.getPosition(), i, i, i, this.zzYJ5.getExpression()));
        if (!zzzlo.zzXl()) {
            if (zzzlo.zzZ5m() && zzzlo.zzZ5k() == 3) {
                return zzZ(str, zzzlo);
            }
            if (com.aspose.words.internal.zzZYD.zzXk(str)) {
                zzZ(zzzlp, str);
            }
            zzZ(zzzlp, zzzlo.zzZ5j());
            return "";
        }
        if (!zzzlo.zzZ5r() && !zzzlo.zzZ5o() && !zzzlo.isNegative() && zzzlo.zzZ5l() >= 3) {
            strZzZ5j = zzZ(str, zzzlo);
        } else {
            if (com.aspose.words.internal.zzZYD.zzXk(str)) {
                zzZ(zzzlp, str);
            }
            strZzZ5j = zzzlo.zzZ5j();
        }
        if (!zzzlo.zzZ5n() && !zzzlo.zzZ5p() && !zzzlo.zzZ5q()) {
            return strZzZ5j;
        }
        zzZ(zzzlp, strZzZ5j);
        return "";
    }

    private static String zzZ(String str, zzZLO zzzlo) {
        String string;
        if (!com.aspose.words.internal.zzZYD.zzXh(str) && !com.aspose.words.internal.zzZYD.zzXh(zzzlo.zzZ5j())) {
            string = Character.toString(com.aspose.words.internal.zzJB.zzH4());
        } else {
            string = "";
        }
        return com.aspose.words.internal.zzZKN.zzO(str, string, zzzlo.zzZ5j());
    }

    private void zzZ(zzZLP zzzlp, int i) throws Exception {
        zzZ(zzzlp, com.aspose.words.internal.zzZKN.zzTX(this.zzYJ5.getExpression().substring(i, (this.zzYJ5.getPosition() - i) + i)));
    }

    private void zzZ(zzZLP zzzlp, String str) throws Exception {
        zzZBJ zzzbjZzZ;
        if (zzzlp.zzbU() && (zzzbjZzZ = zzWL.zzZ(this.zzZts, str)) != null) {
            zzzlp.zzZ5s().zzZ(zzzbjZzZ);
        } else {
            zzzlp.zzZ5s().zzZ(zzZSH.zzX(this.zzZts, str));
        }
    }

    private int zzZ(char c, StringBuilder sb) {
        if (com.aspose.words.internal.zzZKU.zzG(c) && c != com.aspose.words.internal.zzJB.zzH4()) {
            return 1;
        }
        if (zzY(c, sb)) {
            return 2;
        }
        String strZzH1 = com.aspose.words.internal.zzJB.zzH1();
        return (strZzH1.length() == 1 && c == strZzH1.charAt(0)) ? 3 : 0;
    }
}
