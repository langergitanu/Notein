package com.aspose.words.internal;

import com.aspose.words.ControlChar;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes5.dex */
final class zzX9 extends zzKL {
    private LinkedList<zzZ> zzUV;
    private String zzUW;
    private int zzUX;
    private static zzKO zzUU = zzSF.zzM(Boolean.TRUE);
    private static zzKO zzUT = zzSF.zzM(Boolean.FALSE);
    private static zzKO zzUS = zzSF.zzOn;
    private static final zzZHW zzUR = new zzZHW(TelemetryEventStrings.Value.TRUE, TelemetryEventStrings.Value.FALSE, CloudMetaExtra.DEFINE_NON_PARENT_ID, "new", BackupFile.EXTENSION_NOTEIN_FILE);

    public static class zzZ {
        private int zzYG;
        private String zzZi;

        public zzZ(int i, StringBuilder sb) {
            this(i, sb.toString());
        }

        public final int getId() {
            return this.zzYG;
        }

        public final String getText() {
            return this.zzZi;
        }

        public zzZ(int i, String str) {
            this.zzYG = i;
            this.zzZi = str;
        }
    }

    private zzZ zzA(boolean z) {
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        if (z) {
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            zzZ(sb, false);
        } else {
            if (zzIw() == '0') {
                zzX(sb);
                if (zzIw() == 'x' || zzIw() == 'X') {
                    zzIB();
                    zzz(true);
                    sb.setLength(0);
                    zzZ(sb, true);
                    return new zzZ(131072 | zzVU(), sb);
                }
            }
            zzZ(sb, false);
            int iZzVU = zzVU();
            if (iZzVU != 65536) {
                return new zzZ(iZzVU, sb);
            }
            if (zzIw() == '.') {
                zzX(sb);
                zzz(false);
                zzZ(sb, false);
                z = true;
            }
        }
        if (zzIw() == 'e' || zzIw() == 'E') {
            zzX(sb);
            if (zzIw() == '+' || zzIw() == '-') {
                zzX(sb);
            }
            zzz(false);
            zzZ(sb, false);
        } else {
            z2 = z;
        }
        if (zzIw() == 'f' || zzIw() == 'F') {
            return zzZ(36, sb);
        }
        if (zzIw() == 'd' || zzIw() == 'D') {
            return zzZ(4, sb);
        }
        zzIw();
        return new zzZ(z2 ? 4 : 65536, sb);
    }

    private static boolean zzR(char c) {
        return c == '\n' || c == '\r' || c == 133 || c == 8232 || c == 8233;
    }

    private zzKO zzS(Object obj) {
        zzKO zzkoZzN = zzIz().zzN(obj);
        zzVY();
        return zzkoZzN;
    }

    private zzKO zzT(zzKO zzko) throws Exception {
        while (true) {
            int i = this.zzUX;
            if (i != 14) {
                if (i != 23) {
                    break;
                }
                if (zzko == null) {
                    zzko = zzIy();
                }
                zzko = zzR(zzko);
            } else {
                if (zzko == null) {
                    break;
                }
                zzVY();
                zzko = zzZ((Class) null, zzko);
            }
        }
        return zzko;
    }

    private static String zzU(zzKO zzko) {
        String strZzN5 = zzko.zzN5();
        if (zzZKN.zzU3(strZzN5)) {
            throw new zzCX("An anonymous type member declarator is expected.");
        }
        return strZzN5;
    }

    private zzAG[] zzV(zzKO zzko) throws Exception {
        String strZzU;
        ArrayList<zzAG> arrayList = new ArrayList<>();
        while (true) {
            zzKO zzkoZzWs = null;
            if (this.zzUX == 2) {
                strZzU = this.zzUW;
                LinkedList<zzZ> linkedListZzW7 = zzW7();
                zzX(linkedListZzW7);
                if (this.zzUX == 18) {
                    zzVY();
                    zzkoZzWs = zzWs();
                } else {
                    zzY(linkedListZzW7);
                }
            } else {
                strZzU = null;
            }
            if (zzkoZzWs == null) {
                if (zzko.getType() != zzR.class) {
                    throw new zzCX("A member initializer is expected.");
                }
                zzkoZzWs = zzWs();
                strZzU = zzU(zzkoZzWs);
            }
            zzKO zzko2 = zzko;
            zzIz().zzZ(arrayList, zzko2, strZzU, zzIx(), zzkoZzWs);
            if (this.zzUX != 12) {
                return (zzAG[]) arrayList.toArray(new zzAG[0]);
            }
            zzVY();
            zzko = zzko2;
        }
    }

    private boolean zzVN() {
        if (zzIw() != zzIu()) {
            return false;
        }
        zzY(1, zzIu());
        return true;
    }

    private boolean zzVO() {
        char cZzIw = zzIw();
        return cZzIw == '#' || cZzIw == '$' || cZzIw == '@' || cZzIw == '_' || zzZYD.isDigit(zzIw()) || zzIv();
    }

    private boolean zzVP() {
        if (zzIw() != '_' && !zzIv()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        do {
            zzX(sb);
        } while (zzVO());
        zzX(2, sb.toString());
        return true;
    }

    private String zzVQ() {
        zzIB();
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (zzIw() == '\"') {
                zzIB();
                if (zzIw() != '\"') {
                    return sb.toString();
                }
            }
            zzX(sb);
        }
    }

    private boolean zzVR() {
        if (zzIw() != '@') {
            return false;
        }
        zzIB();
        if (zzIw() != '\"') {
            throw new zzCX("Double quotes are expected.");
        }
        zzX(3, zzVQ());
        return true;
    }

    private String zzVS() {
        char cZzIw = zzIw();
        zzIB();
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (zzIw() == '\\') {
                zzZ(sb);
            } else {
                if (zzIw() == cZzIw) {
                    zzIB();
                    if (cZzIw != '\'' || sb.length() == 1) {
                        return sb.toString();
                    }
                    throw new zzCX(sb.length() != 0 ? "A char literal can not contain more than one character." : "A char literal can not be empty.");
                }
                if (zzR(zzIw())) {
                    throw new zzCX("Illegal usage of a new line character in a string or char literal.");
                }
                zzX(sb);
            }
        }
    }

    private boolean zzVT() {
        int i;
        char cZzIw = zzIw();
        if (cZzIw == '\"') {
            i = 3;
        } else {
            if (cZzIw != '\'') {
                return false;
            }
            i = 35;
        }
        zzX(i, zzVS());
        return true;
    }

    private int zzVU() {
        int i = 65536;
        while (true) {
            if (zzIw() != 'l' && zzIw() != 'L') {
                zzIw();
                return i;
            }
            if ((262144 & i) != 0) {
                return i;
            }
            zzIB();
            i = 327680;
        }
    }

    private boolean zzVV() {
        if (!zzZYD.isDigit(zzIw())) {
            return false;
        }
        zzZ(zzA(false));
        return true;
    }

    private boolean zzVW() {
        if (zzIw() != '.') {
            return false;
        }
        zzIB();
        if (zzZYD.isDigit(zzIw())) {
            zzZ(zzA(true));
        } else {
            zzX(14, ".");
        }
        return true;
    }

    private void zzVX() {
        while (zzZKU.zzG(zzIw())) {
            zzIB();
        }
    }

    private void zzVY() {
        LinkedList<zzZ> linkedList = this.zzUV;
        if (linkedList != null) {
            zzZ zzzRemoveFirst = linkedList.removeFirst();
            if (this.zzUV.size() == 0) {
                this.zzUV = null;
            }
            zzZ(zzzRemoveFirst);
            return;
        }
        zzVX();
        if (!zzZ('%', 6) && !zzZ('(', 8) && !zzZ(')', 9) && !zzZ('*', 10) && !zzZ('+', 11) && !zzZ(',', 12) && !zzZ('-', 13) && !zzZ(IOUtils.DIR_SEPARATOR_UNIX, 15) && !zzZ(':', 16) && !zzZ('[', 23) && !zzZ(']', 24) && !zzZ('{', 33) && !zzZ('}', 34) && !zzZ('^', 38) && !zzZ('~', 39) && !zzZ('?', '?', FilenameUtils.EXTENSION_SEPARATOR, '[', 42, 21, 22, 20) && !zzZ('&', '&', 27, 7) && !zzZ('|', '|', 31, 25) && !zzZ('!', '=', 26, 5) && !zzZ('<', '<', 28, 40, 17) && !zzZ('>', '>', 30, 41, 19) && !zzZ('=', '>', 29, 32, 18) && !zzVW() && !zzVV() && !zzVT() && !zzVR() && !zzVP() && !zzVN()) {
            throw new zzCX(zzZKN.format("Character '{0}' was unexpected at this position.", Character.valueOf(zzIw())));
        }
    }

    private void zzW(Class cls) {
        throw new zzCX(zzZKN.format("Literal '{0}' does not represent a valid {1} value.", this.zzUW, cls));
    }

    private boolean zzW1() {
        return this.zzUX == 2 && zz0(this.zzUW);
    }

    private zzKO[] zzW2() throws Exception {
        zzVY();
        zzKO[] zzkoArrZzX = zzX((zzKO) null, false);
        zzW(24, "Closing bracket or comma is expected.");
        zzVY();
        return zzkoArrZzX;
    }

    private Class zzW3() {
        Class clsZzW5 = this.zzUX == 2 ? zzW5() : null;
        if (clsZzW5 != null) {
            return zzZ(clsZzW5, (LinkedList<zzZ>) null);
        }
        throw new zzCX("A type identifier is expected.");
    }

    private zzKO zzW4() throws Exception {
        Class<zzR> clsZzW3;
        zzVY();
        zzKO zzkoZzZ = null;
        if (this.zzUX == 2) {
            clsZzW3 = zzW3();
            if (clsZzW3.isArray()) {
                zzW(33, "An array initializer is expected.");
                return zzIz().zzZ(clsZzW3, zzZ((zzKO) null, false, 34, "Closing brace or comma is expected."));
            }
            if (this.zzUX == 8) {
                zzkoZzZ = zzIz().zzZ(clsZzW3, zzY((zzKO) null, false), zzIx());
            }
        } else {
            clsZzW3 = null;
        }
        if (zzkoZzZ == null) {
            if (this.zzUX != 33) {
                throw new zzCX(clsZzW3 != null ? "An argument list or object initializer is expected." : "An anonymous object initializer is expected.");
            }
            if (clsZzW3 == null) {
                clsZzW3 = zzR.class;
            }
            zzkoZzZ = zzIz().zzZ(clsZzW3, zzKO.zzCp, zzIx());
        }
        return this.zzUX == 33 ? zzIz().zzZ(zzkoZzZ, zzW(zzkoZzZ)) : zzkoZzZ;
    }

    private Class zzW5() {
        Class clsZzZY;
        Class clsZzZY2 = zzZY(this.zzUW);
        if (clsZzZY2 != null) {
            return clsZzZY2;
        }
        LinkedList<zzZ> linkedListZzW7 = zzW7();
        StringBuilder sb = new StringBuilder(this.zzUW);
        do {
            zzX(linkedListZzW7);
            if (this.zzUX == 14) {
                zzZNH.zzU(sb, this.zzUW);
                zzX(linkedListZzW7);
                if (this.zzUX == 2) {
                    zzZNH.zzU(sb, this.zzUW);
                    clsZzZY = zzZY(sb.toString());
                }
            }
            zzY(linkedListZzW7);
            return null;
        } while (clsZzZY == null);
        return clsZzZY;
    }

    private zzKO zzW6() throws Exception {
        zz6N zz6nZzZZ = zzZZ(this.zzUW);
        if (zz6nZzZZ != null) {
            zzVY();
            return zz6nZzZZ;
        }
        Class clsZzW5 = zzW5();
        if (clsZzW5 != null) {
            return zzV(clsZzW5);
        }
        int iZzTP = zzUR.zzTP(this.zzUW);
        if (iZzTP == 0) {
            zzKO zzko = zzUU;
            zzVY();
            return zzko;
        }
        if (iZzTP == 1) {
            zzKO zzko2 = zzUT;
            zzVY();
            return zzko2;
        }
        if (iZzTP == 2) {
            zzKO zzko3 = zzUS;
            zzVY();
            return zzko3;
        }
        if (iZzTP == 3) {
            return zzW4();
        }
        if (zzG(this.zzUW)) {
            throw new zzCX(zzZKN.format("Illegal usage of keyword '{0}'.", this.zzUW));
        }
        return zzZ((Class) null, zzIy());
    }

    private LinkedList<zzZ> zzW7() {
        LinkedList<zzZ> linkedList = new LinkedList<>();
        zzZ(linkedList);
        return linkedList;
    }

    private zzKO zzW8() throws Exception {
        Class clsZzW5;
        zzVY();
        if (this.zzUX == 2 && (clsZzW5 = zzW5()) != null) {
            LinkedList<zzZ> linkedListZzW7 = zzW7();
            Class clsZzZ = zzZ(clsZzW5, linkedListZzW7);
            if (this.zzUX == 9) {
                zzVY();
                return zzIz().zzZ(zzWg(), clsZzZ, zzIx());
            }
            zzY(linkedListZzW7);
        }
        zzKO zzkoZzWs = zzWs();
        zzW(9, "Closing parenthesis or operator is expected.");
        zzVY();
        return zzkoZzWs;
    }

    private zzKO zzW9() {
        int i = this.zzUX;
        return zzZ((131072 & i) != 0, (i & 262144) != 0);
    }

    private zzKO zzWa() {
        double dZzZs = zzJB.zzZs(this.zzUW);
        if (Double.isNaN(dZzZs)) {
            zzW(Double.TYPE);
        }
        return zzS(Double.valueOf(dZzZs));
    }

    private zzKO zzWb() {
        float fZzZr = zzJB.zzZr(this.zzUW);
        if (Float.isNaN(fZzZr)) {
            zzW(Float.TYPE);
        }
        return zzS(Float.valueOf(fZzZr));
    }

    private zzKO zzWc() {
        return zzS(Character.valueOf(this.zzUW.charAt(0)));
    }

    private zzKO zzWd() {
        return zzS(this.zzUW);
    }

    private zzKO zzWe() throws Exception {
        int i = this.zzUX;
        if (i == 2) {
            return zzW6();
        }
        if (i == 3) {
            return zzWd();
        }
        if (i == 4) {
            return zzWa();
        }
        if (i == 8) {
            return zzW8();
        }
        if (i == 35) {
            return zzWc();
        }
        if (i == 36) {
            return zzWb();
        }
        if ((i & 65536) != 0) {
            return zzW9();
        }
        return null;
    }

    private zzKO zzWf() throws Exception {
        zzKO zzkoZzT = zzT(zzWe());
        if (zzkoZzT == null) {
            throw new zzCX("An expression is expected.");
        }
        int i = this.zzUX;
        return (i == 21 || i == 22) ? zzS(zzkoZzT) : zzkoZzT;
    }

    private zzKO zzWg() throws Exception {
        int i = this.zzUX;
        if (i != 13 && i != 5 && i != 39) {
            return zzWf();
        }
        zzVY();
        zzKO zzkoZzWg = zzWg();
        if (i == 5) {
            return zzIz().zzX(zzkoZzWg, zzIx());
        }
        if (i == 13) {
            return zzIz().zzY(zzkoZzWg, zzIx());
        }
        if (i == 39) {
            return zzIz().zzW(zzkoZzWg, zzIx());
        }
        throw new IllegalStateException();
    }

    private zzKO zzWh() throws Exception {
        zzKO zzkoZzWg = zzWg();
        while (true) {
            int i = this.zzUX;
            if (i != 10 && i != 15 && i != 6) {
                return zzkoZzWg;
            }
            zzVY();
            zzKO zzkoZzWg2 = zzWg();
            if (i == 6) {
                zzkoZzWg = zzIz().zzm(zzkoZzWg, zzkoZzWg2, zzIx());
            } else if (i == 10) {
                zzkoZzWg = zzIz().zzo(zzkoZzWg, zzkoZzWg2, zzIx());
            } else {
                if (i != 15) {
                    throw new IllegalStateException();
                }
                zzkoZzWg = zzIz().zzn(zzkoZzWg, zzkoZzWg2, zzIx());
            }
        }
    }

    private zzKO zzWi() throws Exception {
        zzKO zzkoZzWh = zzWh();
        while (true) {
            int i = this.zzUX;
            if (i != 11 && i != 13) {
                return zzkoZzWh;
            }
            zzVY();
            zzKO zzkoZzWh2 = zzWh();
            if (i == 11) {
                zzkoZzWh = zzIz().zzq(zzkoZzWh, zzkoZzWh2, zzIx());
            } else {
                if (i != 13) {
                    throw new IllegalStateException();
                }
                zzkoZzWh = zzIz().zzp(zzkoZzWh, zzkoZzWh2, zzIx());
            }
        }
    }

    private zzKO zzWj() throws Exception {
        zzKO zzkoZzWi = zzWi();
        while (true) {
            int i = this.zzUX;
            if (i != 40 && i != 41) {
                return zzkoZzWi;
            }
            zzVY();
            zzKO zzkoZzWi2 = zzWi();
            if (i == 40) {
                zzkoZzWi = zzIz().zzs(zzkoZzWi, zzkoZzWi2, zzIx());
            } else {
                if (i != 41) {
                    throw new IllegalStateException();
                }
                zzkoZzWi = zzIz().zzr(zzkoZzWi, zzkoZzWi2, zzIx());
            }
        }
    }

    private zzKO zzWk() throws Exception {
        zzKO zzkoZzWj = zzWj();
        while (true) {
            int i = this.zzUX;
            if (i != 19 && i != 30 && i != 17 && i != 28) {
                return zzkoZzWj;
            }
            zzVY();
            zzKO zzkoZzWj2 = zzWj();
            if (i == 17) {
                zzkoZzWj = zzIz().zzu(zzkoZzWj, zzkoZzWj2, zzIx());
            } else if (i == 19) {
                zzkoZzWj = zzIz().zzw(zzkoZzWj, zzkoZzWj2, zzIx());
            } else if (i == 28) {
                zzkoZzWj = zzIz().zzt(zzkoZzWj, zzkoZzWj2, zzIx());
            } else {
                if (i != 30) {
                    throw new IllegalStateException();
                }
                zzkoZzWj = zzIz().zzv(zzkoZzWj, zzkoZzWj2, zzIx());
            }
        }
    }

    private zzKO zzWl() throws Exception {
        zzKO zzkoZzWk = zzWk();
        while (true) {
            int i = this.zzUX;
            if (i != 29 && i != 26) {
                return zzkoZzWk;
            }
            zzVY();
            zzKO zzkoZzWk2 = zzWk();
            if (i == 26) {
                zzkoZzWk = zzIz().zzx(zzkoZzWk, zzkoZzWk2, zzIx());
            } else {
                if (i != 29) {
                    throw new IllegalStateException();
                }
                zzkoZzWk = zzIz().zzy(zzkoZzWk, zzkoZzWk2, zzIx());
            }
        }
    }

    private zzKO zzWm() throws Exception {
        zzKO zzkoZzWl = zzWl();
        while (this.zzUX == 7) {
            zzVY();
            zzkoZzWl = zzIz().zzz(zzkoZzWl, zzWl(), zzIx());
        }
        return zzkoZzWl;
    }

    private zzKO zzWn() throws Exception {
        zzKO zzkoZzWm = zzWm();
        while (this.zzUX == 38) {
            zzVY();
            zzkoZzWm = zzIz().zzA(zzkoZzWm, zzWm(), zzIx());
        }
        return zzkoZzWm;
    }

    private zzKO zzWo() throws Exception {
        zzKO zzkoZzWn = zzWn();
        while (this.zzUX == 25) {
            zzVY();
            zzkoZzWn = zzIz().zzB(zzkoZzWn, zzWn(), zzIx());
        }
        return zzkoZzWn;
    }

    private zzKO zzWp() throws Exception {
        zzKO zzkoZzWo = zzWo();
        while (this.zzUX == 27) {
            zzVY();
            zzkoZzWo = zzIz().zzC(zzkoZzWo, zzWo(), zzIx());
        }
        return zzkoZzWo;
    }

    private zzKO zzWq() throws Exception {
        zzKO zzkoZzWp = zzWp();
        while (this.zzUX == 31) {
            zzVY();
            zzkoZzWp = zzIz().zzD(zzkoZzWp, zzWp(), zzIx());
        }
        return zzkoZzWp;
    }

    private zzKO zzWr() throws Exception {
        zzKO zzkoZzWq = zzWq();
        if (this.zzUX != 42) {
            return zzkoZzWq;
        }
        zzVY();
        return zzIz().zzE(zzkoZzWq, zzWr(), zzIx());
    }

    private zzKO zzWs() throws Exception {
        zzKO zzkoZzWr = zzWr();
        if (this.zzUX != 20) {
            return zzkoZzWr;
        }
        zzVY();
        zzKO zzkoZzWs = zzWs();
        zzW(16, "Colon is expected.");
        zzVY();
        return zzIz().zzZ(zzkoZzWr, zzkoZzWs, zzWs(), zzIx());
    }

    private void zzWt() {
        if (this.zzUX == 1) {
            return;
        }
        if (this.zzUW.length() != 1 || this.zzUW.charAt(0) != zzIu()) {
            throw new zzCX("Unexpected end of expression.");
        }
    }

    private void zzWu() {
        zzVX();
        if (zzIw() == zzIu()) {
            throw new zzCX("An expression can not be empty.");
        }
        zzVY();
    }

    private zzKO[] zzX(zzKO zzko, boolean z) throws Exception {
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzKO zzkoZzW = zzko != null ? zzW(zzko, z) : null;
            if (zzkoZzW == null) {
                zzkoZzW = zzWs();
            }
            zzZQG.zzZ((ArrayList<zzKO>) arrayList, zzkoZzW);
            if (this.zzUX != 12) {
                return (zzKO[]) arrayList.toArray(new zzKO[0]);
            }
            zzVY();
        }
    }

    private void zzY(LinkedList<zzZ> linkedList) {
        if (this.zzUV != null) {
            while (this.zzUV.size() != 0) {
                linkedList.addLast(this.zzUV.removeFirst());
            }
        }
        this.zzUV = linkedList;
        zzVY();
    }

    private zzKO zzZ(boolean z, boolean z2) {
        long jZzZd;
        try {
            jZzZd = z ? zzJB.zzZd(this.zzUW) : zzJB.zzZf(this.zzUW);
        } catch (Exception unused) {
            zzW(Long.TYPE);
            jZzZd = 0;
        }
        return (z2 || jZzZd > 2147483647L) ? zzS(Long.valueOf(jZzZd)) : zzS(Integer.valueOf((int) jZzZd));
    }

    private boolean zzy(boolean z) {
        return z ? zzZYD.isHexDigit(zzIw()) : zzZYD.isDigit(zzIw());
    }

    private void zzz(boolean z) {
        if (zzy(z)) {
        } else {
            throw new zzCX(z ? "A hexadecimal digit is expected." : "A digit is expected.");
        }
    }

    @Override // com.aspose.words.internal.zzKL
    public final boolean zzG(String str) {
        int iZzTP = zzUR.zzTP(str);
        return iZzTP == 0 || iZzTP == 1 || iZzTP == 2 || iZzTP == 3 || iZzTP == 4;
    }

    @Override // com.aspose.words.internal.zzKL
    public final zzZVN zzVZ() throws Exception {
        zzWu();
        Class clsZzZ = null;
        if (this.zzUX == 2) {
            Class clsZzW5 = zzW5();
            clsZzZ = clsZzW5 != null ? zzZ(clsZzW5, (LinkedList<zzZ>) null) : clsZzW5;
        }
        zzW(2, "A variable name is expected.");
        String str = this.zzUW;
        zzVY();
        zzW(18, "An assignment operator is expected.");
        zzVY();
        zzKO zzkoZzWs = zzWs();
        zzWt();
        return zzZ(clsZzZ, str, zzkoZzWs);
    }

    @Override // com.aspose.words.internal.zzKL
    public final zzJC zzW0() throws Exception {
        Class clsZzW5;
        zzWu();
        String str = null;
        if (this.zzUX == 2) {
            clsZzW5 = zzW5();
            if (clsZzW5 != null) {
                clsZzW5 = zzZ(clsZzW5, (LinkedList<zzZ>) null);
            }
        } else {
            clsZzW5 = null;
        }
        if (zzW1()) {
            str = this.zzUW;
            zzVY();
        }
        if (this.zzUX != 2 || !zzZKN.zzX(this.zzUW, BackupFile.EXTENSION_NOTEIN_FILE, zzZOF.ORDINAL$4894b8c8)) {
            throw new zzCX(zzZKN.format("Keyword '{0}' is expected.", BackupFile.EXTENSION_NOTEIN_FILE));
        }
        zzVY();
        zzKO zzkoZzWs = zzWs();
        zzWt();
        return zzZ(zzkoZzWs, clsZzW5, str);
    }

    @Override // com.aspose.words.internal.zzKL
    public final zzKO zzWv() throws Exception {
        zzWu();
        zzKO zzkoZzWs = zzWs();
        zzWt();
        return zzkoZzWs;
    }

    private zzKO zzR(zzKO zzko) throws Exception {
        return zzIz().zzZ(zzko, zzW2(), zzIx());
    }

    private zzKO zzS(zzKO zzko) throws Exception {
        zz7O zz7oZzY;
        zz7O zz7o = null;
        while (true) {
            int i = this.zzUX;
            boolean z = true;
            boolean z2 = i == 14 || i == 21;
            boolean z3 = i == 23 || i == 22;
            if (!z2 && !z3) {
                return zz7o.zzxN();
            }
            if (i != 21 && i != 22) {
                z = false;
            }
            if (z2) {
                zz7oZzY = zzZ(zzko, zz7o, z);
            } else {
                zz7oZzY = zzY(zzko, zz7o, z);
            }
            zz7o = zz7oZzY;
            zzko = zz7o.zzxM();
        }
    }

    private zzAG[] zzW(zzKO zzko) throws Exception {
        zzAG[] zzagArrZzV;
        zzVY();
        if (this.zzUX != 34) {
            zzagArrZzV = zzV(zzko);
        } else {
            zzagArrZzV = zzAG.zzrJ;
        }
        zzW(34, "Closing brace or comma is expected.");
        zzVY();
        return zzagArrZzV;
    }

    private void zzZ(LinkedList<zzZ> linkedList) {
        linkedList.addLast(new zzZ(this.zzUX, this.zzUW));
    }

    private Class zzY(Class cls, LinkedList<zzZ> linkedList) {
        zzX(linkedList);
        zzW(24, "Closing bracket is expected.");
        Class clsZzw = zzZZO.zzw(cls);
        zzX(linkedList);
        return clsZzw;
    }

    private Class zzZ(Class cls, LinkedList<zzZ> linkedList) {
        zzX(linkedList);
        return this.zzUX == 23 ? zzY(cls, linkedList) : cls;
    }

    private zzKO zzW(zzKO zzko, boolean z) throws Exception {
        if (this.zzUX == 8) {
            LinkedList<zzZ> linkedListZzW7 = zzW7();
            zzX(linkedListZzW7);
            if (this.zzUX == 2) {
                Class clsZzW5 = zzW5();
                if (clsZzW5 != null) {
                    Class clsZzZ = zzZ(clsZzW5, linkedListZzW7);
                    if (zzW1()) {
                        return zzZ(zzko, clsZzZ, z);
                    }
                } else if (zzW1()) {
                    zzX(linkedListZzW7);
                    int i = this.zzUX;
                    boolean z2 = i == 12;
                    if (i == 9) {
                        zzX(linkedListZzW7);
                        z2 = this.zzUX == 32;
                    }
                    if (z2) {
                        zzY(linkedListZzW7);
                        zzVY();
                        return zzZ(zzko, (Class) null, z);
                    }
                }
            }
            zzY(linkedListZzW7);
        } else if (zzW1()) {
            String str = this.zzUW;
            LinkedList<zzZ> linkedListZzW72 = zzW7();
            zzX(linkedListZzW72);
            if (this.zzUX == 32) {
                return zzZ(zzko, str, z);
            }
            zzY(linkedListZzW72);
        }
        return null;
    }

    private zzKO zzZ(Class cls, zzKO zzko) throws Exception {
        String str = this.zzUW;
        zzKO[] zzkoArrZzZ = zzZ(zzko, false);
        if (zzkoArrZzZ != null) {
            if (zzko != null) {
                return zzIz().zzZ(zzko, str, zzkoArrZzZ, zzIx());
            }
            return zzIz().zzZ(cls, str, zzkoArrZzZ, zzIx());
        }
        if (zzko != null) {
            return zzIz().zzZ(zzko, str, zzIx());
        }
        return zzIz().zzZ(cls, str, zzIx());
    }

    private void zzX(LinkedList<zzZ> linkedList) {
        zzVY();
        if (linkedList != null) {
            zzZ(linkedList);
        }
    }

    private zzKO[] zzY(zzKO zzko, boolean z) throws Exception {
        return zzZ(zzko, z, 9, "Closing parenthesis or comma is expected.");
    }

    private zz7O zzY(zzKO zzko, zz7O zz7o, boolean z) throws Exception {
        zzKO[] zzkoArrZzW2 = zzW2();
        if (zz7o != null) {
            return zz7o.zzZ(z, zzkoArrZzW2, zzIx(), zzIz());
        }
        return zz7O.zzZ(zzko, zzkoArrZzW2, zzIx(), zzIz());
    }

    private void zzX(int i, String str) {
        this.zzUX = i;
        this.zzUW = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long zzX(int i, boolean z) {
        long jZzm = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            if (zzZYD.isHexDigit(zzIw())) {
                jZzm = (jZzm << 4) + ((long) zzZYD.zzm(zzIw()));
                zzIB();
                i2++;
            } else if (z || i2 == 0) {
                throw new zzCX(zzZKN.format("'{0}' is not a valid hexadecimal digit.", Character.valueOf(zzIw())));
            }
        }
    }

    private void zzY(int i, char c) {
        zzX(i, Character.toString(c));
    }

    private void zzY(StringBuilder sb, boolean z) {
        sb.append((char) zzX(4, z));
    }

    private zz7O zzZ(zzKO zzko, zz7O zz7o, boolean z) throws Exception {
        zzVY();
        String str = this.zzUW;
        zzKO[] zzkoArrZzZ = zzZ(zzko, z);
        if (zzkoArrZzZ != null) {
            if (zz7o != null) {
                return zz7o.zzZ(z, str, zzkoArrZzZ, zzIx(), zzIz());
            }
            return zz7O.zzZ(zzko, str, zzkoArrZzZ, zzIx(), zzIz());
        }
        if (zz7o != null) {
            return zz7o.zzZ(z, str, zzIx(), zzIz());
        }
        return zz7O.zzZ(zzko, str, zzIx(), zzIz());
    }

    private void zzY(StringBuilder sb) {
        long jZzX = zzX(8, true);
        if (jZzX <= 1114111) {
            zzZNH.zzU(sb, zzZVS.zzS7((int) jZzX));
            return;
        }
        throw new zzCX(zzZKN.format("'U+{0}' is not a valid UTF-32 code point.", zzJB.zz1(jZzX)));
    }

    private void zzX(StringBuilder sb) {
        sb.append(zzIw());
        zzIB();
    }

    private zzKO zzV(Class cls) throws Exception {
        Class clsZzZ = zzZ(cls, (LinkedList<zzZ>) null);
        zzW(14, "Dot is expected.");
        zzVY();
        return zzZ(clsZzZ, (zzKO) null);
    }

    private zzKO[] zzZ(zzKO zzko, boolean z) throws Exception {
        zzVY();
        if (this.zzUX != 8) {
            return null;
        }
        return zzY(zzko, z);
    }

    private zzKO[] zzZ(zzKO zzko, boolean z, int i, String str) throws Exception {
        zzKO[] zzkoArrZzX;
        zzVY();
        if (this.zzUX != i) {
            zzkoArrZzX = zzX(zzko, z);
        } else {
            zzkoArrZzX = zzKO.zzCp;
        }
        zzW(i, str);
        zzVY();
        return zzkoArrZzX;
    }

    private void zzW(int i, String str) {
        if (this.zzUX != i) {
            throw new zzCX(str);
        }
    }

    private zzKO zzZ(zzKO zzko, Class cls, boolean z) throws Exception {
        ArrayList<zz6N> arrayList = new ArrayList<>();
        zzZ(zzko, cls, arrayList, z);
        zzVY();
        boolean z2 = cls != null;
        while (this.zzUX == 12) {
            zzVY();
            Class clsZzW3 = z2 ? zzW3() : null;
            zzW(2, "A parameter name is expected.");
            zzZ(zzko, clsZzW3, arrayList, z);
            zzVY();
        }
        zzW(9, "Closing parenthesis or comma is expected.");
        zzVY();
        zzW(32, "Lambda operator is expected.");
        zzVY();
        zzKO zzkoZzWs = zzWs();
        Iterator<zz6N> it = arrayList.iterator();
        while (it.hasNext()) {
            zzX(it.next());
        }
        return zzIz().zzN(new zzC1(zzkoZzWs, (zz6N[]) arrayList.toArray(new zz6N[0])));
    }

    private zzKO zzZ(zzKO zzko, String str, boolean z) throws Exception {
        zz6N zz6nZzZ = zzZ(zzko, (Class) null, str, z);
        zzVY();
        zzKO zzkoZzWs = zzWs();
        zzX(zz6nZzZ);
        return zzIz().zzN(new zzC1(zzkoZzWs, new zz6N[]{zz6nZzZ}));
    }

    private void zzZ(zzKO zzko, Class cls, ArrayList<zz6N> arrayList, boolean z) throws Exception {
        zzZQG.zzZ(arrayList, zzZ(zzko, cls, this.zzUW, z));
    }

    private zz6N zzZ(zzKO zzko, Class cls, String str, boolean z) throws Exception {
        zz6N zz6nZzZ = zz6N.zzZ(zzko, cls, str, zzIx(), z);
        zzY(zz6nZzZ);
        return zz6nZzZ;
    }

    private void zzZ(zzZ zzz) {
        zzX(zzz.getId(), zzz.getText());
    }

    private void zzZ(int i, char c, char c2) {
        zzX(i, new String(new char[]{c, c2}));
    }

    private boolean zzZ(char c, int i) {
        if (zzIw() != c) {
            return false;
        }
        zzIB();
        zzY(i, c);
        return true;
    }

    private boolean zzZ(char c, char c2, int i, int i2) {
        return zzZ(c, c2, (char) 65535, (char) 65535, i, 0, 0, i2);
    }

    private boolean zzZ(char c, char c2, int i, int i2, int i3) {
        return zzZ(c, '=', c2, (char) 65535, i, i2, 0, i3);
    }

    private boolean zzZ(char c, char c2, char c3, char c4, int i, int i2, int i3, int i4) {
        if (zzIw() != c) {
            return false;
        }
        zzIB();
        char cZzIw = zzIw();
        if (cZzIw == c2) {
            zzIB();
            zzZ(i, c, c2);
            return true;
        }
        if (cZzIw == c3) {
            zzIB();
            zzZ(i2, c, c3);
            return true;
        }
        if (cZzIw == c4) {
            zzIB();
            zzZ(i3, c, c4);
            return true;
        }
        zzY(i4, c);
        return true;
    }

    private void zzZ(StringBuilder sb, boolean z) {
        while (zzy(z)) {
            zzX(sb);
        }
    }

    private zzZ zzZ(int i, StringBuilder sb) {
        zzZ zzz = new zzZ(i, sb);
        zzIB();
        return zzz;
    }

    private void zzZ(StringBuilder sb) {
        zzIB();
        char cZzIw = zzIw();
        zzIB();
        if (cZzIw != '\"' && cZzIw != '\'') {
            if (cZzIw == '0') {
                sb.append((char) 0);
                return;
            }
            if (cZzIw == 'U') {
                zzY(sb);
                return;
            }
            if (cZzIw != '\\') {
                if (cZzIw == 'f') {
                    sb.append('\f');
                    return;
                }
                if (cZzIw == 'n') {
                    sb.append('\n');
                    return;
                }
                if (cZzIw == 'r') {
                    sb.append(ControlChar.PARAGRAPH_BREAK_CHAR);
                    return;
                }
                if (cZzIw == 'x') {
                    zzY(sb, false);
                    return;
                }
                if (cZzIw == 'a') {
                    sb.append((char) 7);
                    return;
                }
                if (cZzIw != 'b') {
                    switch (cZzIw) {
                        case 't':
                            sb.append('\t');
                            return;
                        case 'u':
                            zzY(sb, true);
                            return;
                        case 'v':
                            sb.append(ControlChar.LINE_BREAK_CHAR);
                            return;
                        default:
                            throw new zzCX(zzZKN.format("Escape character sequence '\\{0}' is not valid.", Character.valueOf(cZzIw)));
                    }
                }
                sb.append('\b');
                return;
            }
        }
        sb.append(cZzIw);
    }
}
