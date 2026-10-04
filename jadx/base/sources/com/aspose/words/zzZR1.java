package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZR1 implements zzZBA, zzZBB {
    private int zz9M;
    private boolean zzYFO;
    private Inline zzYFP;
    private boolean zzYFQ;
    private int zzYFR;
    private boolean zzYFU;
    private int zzYFV;
    private zzZBA zzYFW;
    private String zzYFX;
    private int zzYFY;
    private String zzYFZ;
    private Field zzZz7;
    private ArrayList<zzZR8> zzYFT = new ArrayList<>();
    private ArrayList<zzZPC> zzYFS = new ArrayList<>();
    private ArrayList<Object> zzZom = new ArrayList<>();

    public zzZR1(String str, zzZBA zzzba) {
        this.zzYFW = zzzba;
        this.zzYFV = zzZOO.zzLC(str);
        this.zzYFU = zzZOO.zzLB(str);
        zzZQT zzzqt = new zzZQT(str, this);
        try {
            zzZ(zzzqt);
            zzzqt.dispose();
            this.zz9M = 1024;
        } catch (Throwable th) {
            zzzqt.dispose();
            throw th;
        }
    }

    private boolean zzM9(String str) {
        int iZzLE = zzZOO.zzLE(this.zzYFZ);
        return str != null ? zzZOO.zzz(iZzLE, str) : zzZOO.zzXD(iZzLE, this.zzYFT.size());
    }

    private zzZPC zzMa(String str) {
        zzZPC zzzpc = null;
        for (zzZPC zzzpc2 : this.zzYFS) {
            if (zzzpc2.zzLL(str)) {
                zzzpc = zzzpc2;
            }
        }
        return zzzpc;
    }

    private zzYIU zzMe(String str) {
        zzZR8 zzzr8ZzMi = zzMi(str);
        zzYIU zzyiuZzZgj = zzzr8ZzMi != null ? zzzr8ZzMi.zzZgj() : null;
        if (zzyiuZzZgj != null) {
            return zzyiuZzZgj;
        }
        return null;
    }

    private Iterable<zzZR8> zzMh(String str) {
        ArrayList arrayList = new ArrayList();
        for (zzZPC zzzpc : this.zzYFS) {
            if (zzzpc.zzLL(str) && zzzpc.zzZcb()) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZR8>) arrayList, zzzpc.zzZcc());
            }
        }
        return arrayList;
    }

    private void zzP(String str, double d) throws Exception {
        zzQ(str, com.aspose.words.internal.zzJB.zzZZ(d), -1);
    }

    private void zzQ(String str, String str2, int i) throws Exception {
        zzZfv();
        boolean z = true;
        boolean z2 = i != -1;
        Iterator<zzZPC> it = this.zzYFS.iterator();
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (!it.hasNext()) {
                z = z3;
                break;
            }
            zzZPC next = it.next();
            if (next.zzLL(str)) {
                if (!z2 || i == i2) {
                    if (str2 != null) {
                        zzZQP.zzZ(this, next.zzZcc(), str2, false);
                    } else {
                        zzZQP.zzZ(next);
                    }
                    if (z2) {
                        break;
                    } else {
                        z3 = true;
                    }
                } else {
                    i2++;
                }
            }
        }
        if (z) {
            zzZfI();
        } else if (str2 != null) {
            zzZQP.zzZ(this, str, str2);
            zzZfI();
        }
    }

    private zzYWB zzX(zzZR8 zzzr8) {
        if (zzzr8 != null) {
            return zzzr8.zzZga();
        }
        Run run = new Run(this.zzZz7.getStart().getDocument());
        return new zzYWB(run, true, run, false);
    }

    private void zzY(zzZR8 zzzr8) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzYFT, zzzr8);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZR8>) this.zzZom, zzzr8);
    }

    private void zzZV(String str, int i) throws Exception {
        zzQ(str, Integer.toString(i), -1);
    }

    private boolean zzZfG() {
        Iterator<zzZPC> it = this.zzYFS.iterator();
        while (it.hasNext()) {
            if (zzZPC.zzLK(it.next().getName())) {
                return true;
            }
        }
        return false;
    }

    private boolean zzZfH() {
        Iterator<zzZPC> it = this.zzYFS.iterator();
        while (it.hasNext()) {
            if (zzZPC.zzLJ(it.next().getName())) {
                return true;
            }
        }
        return false;
    }

    private void zzZfI() {
        this.zzYFT.clear();
        this.zzYFS.clear();
        this.zzZom.clear();
        zzZQT zzzqt = new zzZQT(this.zzZz7, this);
        try {
            zzZ(zzzqt);
            this.zz9M = zzzqt.zzp6();
            this.zzYFY = zzzqt.zzZfA();
            this.zzYFR = zzzqt.zzZfz();
            this.zzYFQ = zzzqt.getBidi();
            this.zzYFP = zzzqt.zzZeJ();
        } finally {
            zzzqt.dispose();
        }
    }

    private boolean zzZfy() {
        return this.zzYFT.size() == this.zzYFV;
    }

    public final boolean getBidi() {
        return this.zzYFQ;
    }

    public final Field getField() {
        return this.zzZz7;
    }

    @Override // com.aspose.words.zzZBA
    public final int getSwitchType(String str) {
        if (zzZPC.zzLI(str)) {
            return 2;
        }
        zzZBA zzzba = this.zzYFW;
        if (zzzba != null) {
            return zzzba.getSwitchType(str.toLowerCase());
        }
        return 0;
    }

    public final void setBidi(boolean z) {
        Inline inline = this.zzYFP;
        if (inline == null) {
            return;
        }
        this.zzYFQ = z;
        inline.getFont().setBidi(z);
    }

    public final void zzB(int i, String str) throws Exception {
        zzZfv();
        boolean z = zzZOO.zzCA(this.zzZz7.getType()) == i;
        zzZR8 zzzr8ZzDH = zzDH(i);
        if (zzzr8ZzDH != null) {
            if (str == null && i == this.zzYFT.size() - 1) {
                zzZQP.zzS(zzzr8ZzDH);
            } else {
                zzZQP.zzZ(this, zzzr8ZzDH, str, z);
            }
            zzZfI();
            return;
        }
        if (str != null) {
            int size = i - this.zzYFT.size();
            String[] strArr = new String[size + 1];
            strArr[size] = str;
            zzZQP.zzZ(this, strArr, z);
            zzZfI();
        }
    }

    public final void zzDE(int i) {
        Inline inline = this.zzYFP;
        if (inline == null) {
            return;
        }
        this.zzYFR = i;
        inline.getFont().setLocaleIdBi(i);
    }

    public final void zzDF(int i) {
        Inline inline = this.zzYFP;
        if (inline == null) {
            return;
        }
        this.zz9M = i;
        inline.getFont().setLocaleId(i);
    }

    @Override // com.aspose.words.zzZBB
    public final String zzDG(int i) {
        return zzT(i, true, false);
    }

    public final zzZR8 zzDH(int i) {
        if (zzDI(i)) {
            return this.zzYFT.get(i);
        }
        return null;
    }

    public final boolean zzDI(int i) {
        return i >= 0 && i < this.zzYFT.size();
    }

    public final double zzMb(String str) {
        if (!zzMj(str)) {
            return -1.0d;
        }
        double dZzZq = com.aspose.words.internal.zzJB.zzZq(zzt(str, false));
        if (Double.isNaN(dZzZq)) {
            return -1.0d;
        }
        return dZzZq;
    }

    public final com.aspose.words.internal.zz7I zzMc(String str) {
        if (zzMj(str)) {
            return com.aspose.words.internal.zzJB.zzZn(zzt(str, false));
        }
        throw new IllegalStateException();
    }

    public final ArrayList<String> zzMd(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<zzZR8> it = zzMh(str).iterator();
        while (it.hasNext()) {
            String strZzW2 = it.next().zzW2(true);
            if (strZzW2 != null) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, strZzW2);
            }
        }
        return arrayList;
    }

    public final zzYIU zzMf(String str) {
        return zzMe(str);
    }

    public final zzYWB zzMg(String str) {
        return zzX(zzMi(str));
    }

    public final zzZR8 zzMi(String str) {
        zzZPC zzzpcZzMa = zzMa(str);
        if (zzzpcZzMa != null) {
            return zzzpcZzMa.zzZcc();
        }
        return null;
    }

    @Override // com.aspose.words.zzZBB
    public final boolean zzMj(String str) {
        return zzMa(str) != null;
    }

    public final void zzR(String str, String str2, int i) throws Exception {
        zzQ(str, str2, i);
    }

    public final String zzT(int i, boolean z, boolean z2) {
        zzZR8 zzzr8ZzDH = zzDH(i);
        if (zzzr8ZzDH != null) {
            return zzzr8ZzDH.zzW2(z);
        }
        if (z2) {
            return "";
        }
        return null;
    }

    public final void zzZd(String str, String str2) throws Exception {
        zzP(str, com.aspose.words.internal.zzJB.zzZs(str2));
    }

    public final void zzZe(String str, String str2) throws Exception {
        zzZV(str, com.aspose.words.internal.zzJB.zzZo(str2));
    }

    public final void zzZf(String str, String str2) throws Exception {
        zzQ(str, str2, -1);
    }

    public final int zzZfA() {
        return this.zzYFY;
    }

    public final String zzZfB() {
        return this.zzYFZ;
    }

    public final ArrayList<zzZPC> zzZfC() {
        return this.zzYFS;
    }

    public final ArrayList<zzZR8> zzZfD() {
        return this.zzYFT;
    }

    public final zzYWB zzZfE() {
        return zzX(zzDH(0));
    }

    public final zzZPC zzZfF() {
        if (this.zzYFS.size() > 0) {
            return this.zzYFS.get(0);
        }
        return null;
    }

    public final void zzZfv() {
        new zzZ(this).zzZfv();
    }

    public final boolean zzZfw() {
        return this.zzYFX != null;
    }

    public final String zzZfx() {
        return this.zzYFX;
    }

    public final int zzZfz() {
        return this.zzYFR;
    }

    public final int zzp6() {
        return this.zz9M;
    }

    public final void zzs(String str, boolean z) throws Exception {
        zzZfv();
        boolean z2 = false;
        for (zzZPC zzzpc : this.zzYFS) {
            if (zzzpc.zzLL(str)) {
                if (z) {
                    return;
                }
                zzZQP.zzZ(zzzpc);
                z2 = true;
            }
        }
        if (z2) {
            zzZfI();
        } else if (z) {
            zzZQP.zzZ(this, str, (String) null);
            zzZfI();
        }
    }

    public final String zzt(String str, boolean z) {
        zzZR8 zzzr8ZzMi = zzMi(str);
        String strZzW2 = zzzr8ZzMi != null ? zzzr8ZzMi.zzW2(true) : null;
        if (strZzW2 != null) {
            return strZzW2;
        }
        if (z) {
            return "";
        }
        return null;
    }

    public final ArrayList<Object> zzMf() {
        return this.zzZom;
    }

    public static class zzZ {
        private zzZR1 zzYFN;

        public static class zzX {
            static zzX zzYFF = new zzX(false, false);
            private boolean zzYFG;
            private boolean zzYFH;

            public zzX(boolean z, boolean z2) {
                this.zzYFH = z;
                this.zzYFG = z2;
            }

            public final boolean zzZfn() {
                return this.zzYFH || this.zzYFG;
            }

            public final boolean zzZfo() {
                return this.zzYFG;
            }

            public final boolean zzZfp() {
                return this.zzYFH;
            }
        }

        public static class zzY {
            private zzX zzYFI;
            private zzX zzYFJ;
            private zzX zzYFK;

            public zzY() {
                zzX zzx = zzX.zzYFF;
                this.zzYFI = zzx;
                this.zzYFJ = zzx;
                this.zzYFK = zzx;
            }

            public final void zzW(zzX zzx) {
                this.zzYFI = zzx;
            }

            public final void zzX(zzX zzx) {
                this.zzYFJ = zzx;
            }

            public final void zzY(zzX zzx) {
                this.zzYFK = zzx;
            }

            public final zzX zzZfq() {
                return this.zzYFI;
            }

            public final zzX zzZfr() {
                return this.zzYFJ;
            }

            public final zzX zzZfs() {
                return this.zzYFK;
            }
        }

        /* JADX INFO: renamed from: com.aspose.words.zzZR1$zzZ$zzZ, reason: collision with other inner class name */
        public static class C19097zzZ {
            private zzY[] zzYFL;
            private zzX zzYFM = zzX.zzYFF;

            public C19097zzZ(int i) {
                this.zzYFL = new zzY[i];
            }

            public final void zzZ(zzX zzx) {
                this.zzYFM = zzx;
            }

            public final zzY[] zzZft() {
                return this.zzYFL;
            }

            public final zzX zzZfu() {
                return this.zzYFM;
            }
        }

        public zzZ(zzZR1 zzzr1) {
            this.zzYFN = zzzr1;
        }

        private void zzDB(int i) {
            zzZR8 zzzr8 = (zzZR8) com.aspose.words.internal.zzZKW.zzZ(this.zzYFN.zzZom.get(i), zzZR8.class);
            if (zzzr8 == null) {
                return;
            }
            zzZ(zzzr8.zzZga(), i, false);
        }

        private void zzDC(int i) {
            zzZPC zzzpc = (zzZPC) com.aspose.words.internal.zzZKW.zzZ(this.zzYFN.zzZom.get(i), zzZPC.class);
            if (zzzpc == null) {
                return;
            }
            zzZ(zzzpc.zzZga(), i, false);
        }

        private void zzDD(int i) {
            zzZPC zzzpc = (zzZPC) com.aspose.words.internal.zzZKW.zzZ(this.zzYFN.zzZom.get(i), zzZPC.class);
            if (zzzpc == null || !zzzpc.zzZcb()) {
                return;
            }
            zzZ(zzzpc.zzZcc().zzZga(), i, true);
        }

        private static zzX zzY(zzYWB zzywb, zzYWB zzywb2) {
            return new zzX(zzywb.zzYA2().getNode() == zzywb2.zzYA2().getNode(), zzywb.zzYA1().getNode() == zzywb2.zzYA2().getNode());
        }

        private void zzZ(zzYWB zzywb, int i, boolean z) {
            C19097zzZ c19097zzZZzZ = zzZ(i, zzywb, z);
            Run runZzYA8 = zzywb.zzYA8();
            if (runZzYA8 == null) {
                return;
            }
            zzZ(c19097zzZZzZ, i, runZzYA8);
        }

        public final void zzZfv() {
            if (this.zzYFN.getField().zzZgm()) {
                Iterator<zzZR8> it = this.zzYFN.zzZfD().iterator();
                while (it.hasNext()) {
                    it.next().zzZge();
                }
                for (zzZPC zzzpc : this.zzYFN.zzZfC()) {
                    if (zzzpc.zzZcb()) {
                        zzzpc.zzZcc().zzZge();
                    }
                }
            }
            for (int size = this.zzYFN.zzZom.size() - 1; size >= 0; size--) {
                zzDD(size);
                zzDC(size);
                zzDB(size);
            }
        }

        private C19097zzZ zzZ(int i, zzYWB zzywb, boolean z) {
            C19097zzZ c19097zzZ = new C19097zzZ(i);
            if (z) {
                c19097zzZ.zzZ(zzY(((zzZPC) this.zzYFN.zzZom.get(i)).zzZga(), zzywb));
            }
            for (int i2 = 0; i2 < i; i2++) {
                c19097zzZ.zzZft()[i2] = new zzY();
                zzZPC zzzpc = (zzZPC) com.aspose.words.internal.zzZKW.zzZ(this.zzYFN.zzZom.get(i2), zzZPC.class);
                if (zzzpc != null) {
                    c19097zzZ.zzZft()[i2].zzY(zzY(zzzpc.zzZga(), zzywb));
                    if (zzzpc.zzZcb()) {
                        c19097zzZ.zzZft()[i2].zzX(zzY(zzzpc.zzZcc().zzZga(), zzywb));
                    }
                }
                zzZR8 zzzr8 = (zzZR8) com.aspose.words.internal.zzZKW.zzZ(this.zzYFN.zzZom.get(i2), zzZR8.class);
                if (zzzr8 != null) {
                    c19097zzZ.zzZft()[i2].zzW(zzY(zzzr8.zzZga(), zzywb));
                }
            }
            return c19097zzZ;
        }

        private void zzZ(C19097zzZ c19097zzZ, int i, Node node) {
            if (c19097zzZ.zzZfu().zzZfn()) {
                zzZPC zzzpc = (zzZPC) this.zzYFN.zzZom.get(i);
                this.zzYFN.zzZ(i, zzzpc.zzN(zzZ(zzzpc.zzZga(), c19097zzZ.zzZfu(), node)));
            }
            for (int i2 = 0; i2 < i; i2++) {
                zzY zzy = c19097zzZ.zzZft()[i2];
                if (zzy.zzZfr().zzZfn()) {
                    zzZPC zzzpc2 = (zzZPC) this.zzYFN.zzZom.get(i2);
                    this.zzYFN.zzZ(i2, zzzpc2.zzQ(zzzpc2.zzZcc().zzX(zzZ(zzzpc2.zzZcc().zzZga(), zzy.zzZfr(), node))));
                }
                if (zzy.zzZfs().zzZfn()) {
                    zzZPC zzzpc3 = (zzZPC) this.zzYFN.zzZom.get(i2);
                    this.zzYFN.zzZ(i2, zzzpc3.zzN(zzZ(zzzpc3.zzZga(), zzy.zzZfs(), node)));
                }
                if (zzy.zzZfq().zzZfn()) {
                    zzZR8 zzzr8 = (zzZR8) this.zzYFN.zzZom.get(i2);
                    this.zzYFN.zzZ(i2, zzzr8.zzX(zzZ(zzzr8.zzZga(), zzy.zzZfq(), node)));
                }
            }
        }

        private static zzYWB zzZ(zzYWB zzywb, zzX zzx, Node node) {
            return new zzYWB(zzx.zzZfp() ? new zzZYT(node, zzywb.zzYA2().getOffset()) : zzywb.zzYA2(), zzx.zzZfo() ? new zzZYT(node, zzywb.zzYA1().getOffset()) : zzywb.zzYA1());
        }
    }

    private void zzZ(zzZQT zzzqt) {
        zzzqt.zzVX(this.zzYFU);
        this.zzYFZ = zzzqt.zzZeM();
        String strZzZeM = null;
        zzYWB zzywbZzZeS = null;
        while (true) {
            if (!zzzqt.zzP(zzZfy() && strZzZeM == null, zzM9(strZzZeM))) {
                break;
            }
            if (zzzqt.zzZeK()) {
                if (strZzZeM != null) {
                    if (zzZPC.zzLI(strZzZeM)) {
                        this.zzYFX = "Error! Switch argument not specified.";
                    }
                    zzZ(zzywbZzZeS, strZzZeM, (zzZR8) null);
                    strZzZeM = null;
                    zzywbZzZeS = null;
                }
                if (getSwitchType(zzzqt.zzZeM()) != 0) {
                    strZzZeM = zzzqt.zzZeM();
                    zzywbZzZeS = zzzqt.zzZeS();
                    if (zzZPC.zzLK(strZzZeM)) {
                        if (zzZfG()) {
                            this.zzYFX = "Error! Too many picture switches defined.";
                        } else if (zzZfH()) {
                            this.zzYFX = "Error! Picture switch must be first formatting switch.";
                        }
                    }
                }
            } else {
                boolean z = strZzZeM == null || getSwitchType(strZzZeM) != 2;
                zzZR8 zzzr8 = new zzZR8(this.zzZz7, zzzqt.zzZeM(), zzzqt.zzZeL(), zzzqt.zzZeS(), zzzqt.zzZeR(), zzzqt.zzZeI());
                if (z) {
                    if (strZzZeM != null) {
                        zzZ(zzywbZzZeS, strZzZeM, (zzZR8) null);
                        strZzZeM = null;
                        zzywbZzZeS = null;
                    }
                    zzY(zzzr8);
                } else {
                    zzZ(zzywbZzZeS, strZzZeM, zzzr8);
                    strZzZeM = null;
                    zzywbZzZeS = null;
                }
                Field field = this.zzZz7;
                if (field != null && field.zzZgm()) {
                    this.zzZz7.zzZgn().zzP(zzzr8);
                }
            }
        }
        if (strZzZeM != null) {
            zzZ(zzywbZzZeS, strZzZeM, (zzZR8) null);
        }
    }

    public zzZR1(Field field) {
        this.zzZz7 = field;
        this.zzYFW = (zzZBA) com.aspose.words.internal.zzZKW.zzZ(field, zzZBA.class);
        this.zzYFV = zzZOO.zzCA(field.getType());
        this.zzYFU = zzZOO.zzCz(field.getType());
        zzZfI();
        this.zzYFO = true;
    }

    private void zzZ(zzYWB zzywb, String str, zzZR8 zzzr8) {
        zzZPC zzzpc = new zzZPC(zzywb, str, zzzr8);
        com.aspose.words.internal.zzZQG.zzZ(this.zzYFS, zzzpc);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZPC>) this.zzZom, zzzpc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzZ(int i, zzZPC zzzpc) {
        this.zzYFS.set(this.zzYFS.indexOf((zzZPC) this.zzZom.get(i)), zzzpc);
        this.zzZom.set(i, zzzpc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzZ(int i, zzZR8 zzzr8) {
        this.zzYFT.set(this.zzYFT.indexOf((zzZR8) this.zzZom.get(i)), zzzr8);
        this.zzZom.set(i, zzzr8);
    }
}
