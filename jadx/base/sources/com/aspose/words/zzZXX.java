package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZXX {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("keymaps", "keymapsBad", "toolbars", "acds", "keymap", "chmPrimary", "chmSecondary", "kcmPrimary", "kcmSecondary", "mask", "acd", "fci", "macro", "wch", "wll", "fciIndex", "fciName", "swArg", "acdManifest", "toolbarData", "acdEntry", "acdName", "argValue", "fciBasedOn", "fciIndexBasedOn");
    private zzZW1 zzYP4;
    private zzZXU zzYP5;
    private ArrayList<String> zzYP3 = new ArrayList<>();
    private HashMap<String, zzP> zzYP2 = new HashMap<>();
    private HashMap<String, zzZ7B> zzYP1 = new HashMap<>();

    private int zzNR(String str) {
        for (int i = 0; i < this.zzYP3.size(); i++) {
            if (com.aspose.words.internal.zzZKN.equals(this.zzYP3.get(i), str)) {
                return i;
            }
        }
        return -1;
    }

    private void zzY(zzZXU zzzxu) throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzZ = zzzxu.zzZ(zzzxu.zzZme(), zzzxu.zzZmp().zzZky());
        if (zz77VarZzZ == null) {
            return;
        }
        this.zzYP5 = zzzxu;
        this.zzYP4 = new zzZW1(zz77VarZzZ, this.zzYP5.zzZqn());
        while (this.zzYP4.zzQ("tcg")) {
            int iZzTP = zzUR.zzTP(this.zzYP4.getLocalName());
            if (iZzTP == 0 || iZzTP == 1) {
                zzZmG();
            } else if (iZzTP == 2) {
                zzZmE();
            } else if (iZzTP != 3) {
                this.zzYP4.zzk();
            } else {
                zzZmA();
            }
        }
        zzZmy();
        zzZmx();
    }

    public static void zzZ(zzZXU zzzxu) throws Exception {
        new zzZXX().zzY(zzzxu);
    }

    private void zzZmA() {
        while (this.zzYP4.zzQ("acds")) {
            if (zzUR.zzTP(this.zzYP4.getLocalName()) != 10) {
                this.zzYP4.zzk();
            } else {
                zzZmz();
            }
        }
    }

    private void zzZmB() {
        this.zzYP5.getDocument().zzYp(com.aspose.words.internal.zzZYQ.zzZX(this.zzYP5.zzYd(this.zzYP4.zzZmN().zzY9(this.zzYP4.zzV("id", null))).zzR1()));
    }

    private void zzZmC() {
        while (this.zzYP4.zzi()) {
            if (zzUR.zzTP(this.zzYP4.getLocalName()) == 21) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzYP3, this.zzYP4.getValue());
            }
        }
    }

    private void zzZmD() {
        while (this.zzYP4.zzQ("acdManifest")) {
            if (zzUR.zzTP(this.zzYP4.getLocalName()) != 20) {
                this.zzYP4.zzk();
            } else {
                zzZmC();
            }
        }
    }

    private void zzZmE() {
        while (this.zzYP4.zzQ("toolbars")) {
            int iZzTP = zzUR.zzTP(this.zzYP4.getLocalName());
            if (iZzTP == 18) {
                zzZmD();
            } else if (iZzTP != 19) {
                this.zzYP4.zzk();
            } else {
                zzZmB();
            }
        }
    }

    private void zzZmF() {
        zzZ7B zzz7b = new zzZ7B();
        this.zzYP5.getDocument().zzZqC().add(zzz7b);
        while (this.zzYP4.zzi()) {
            switch (zzUR.zzTP(this.zzYP4.getLocalName())) {
                case 5:
                    zzz7b.zzYhp = zzYU3.zzGU(this.zzYP4.getValue());
                    break;
                case 6:
                    zzz7b.zzYho = zzYU3.zzGU(this.zzYP4.getValue());
                    break;
                case 7:
                    zzz7b.zzYhn = zzYU3.zzGU(this.zzYP4.getValue());
                    break;
                case 8:
                    zzz7b.zzYhm = zzYU3.zzGU(this.zzYP4.getValue());
                    break;
                case 9:
                    if (this.zzYP4.zz8()) {
                        zzz7b.zzYhl = 1;
                    }
                    break;
            }
        }
        while (this.zzYP4.zzQ("keymap")) {
            switch (zzUR.zzTP(this.zzYP4.getLocalName())) {
                case 10:
                    zzz7b.zzYhl = 2;
                    this.zzYP1.put(this.zzYP4.zzV("acdName", ""), zzz7b);
                    break;
                case 11:
                    zzZ(zzz7b);
                    break;
                case 12:
                    zzz7b.zzYhl = 4;
                    zzz7b.zzYhh = this.zzYP4.zzV("macroName", "");
                    break;
                case 13:
                    zzz7b.zzYhl = 5;
                    zzz7b.zzYhg = zzYU3.zzGU(this.zzYP4.zzV("val", null));
                    break;
                case 14:
                    zzz7b.zzYhl = 6;
                    zzz7b.zzYhh = this.zzYP4.zzV("macroName", "");
                    break;
                default:
                    this.zzYP4.zzk();
                    break;
            }
        }
    }

    private void zzZmG() {
        if (this.zzYP5.getDocument().zzZqC() == null) {
            this.zzYP5.getDocument().zzZW(new ArrayList<>());
        }
        String localName = this.zzYP4.getLocalName();
        while (this.zzYP4.zzQ(localName)) {
            if (zzUR.zzTP(this.zzYP4.getLocalName()) != 4) {
                this.zzYP4.zzk();
            } else {
                zzZmF();
            }
        }
    }

    private void zzZmx() {
        for (Map.Entry<String, zzZ7B> entry : this.zzYP1.entrySet()) {
            String key = entry.getKey();
            entry.getValue().zzYhk = zzNR(key);
        }
    }

    private void zzZmy() {
        if (this.zzYP3.size() == 0 || this.zzYP2.size() == 0) {
            return;
        }
        Document document = this.zzYP5.getDocument();
        document.zzZX(new ArrayList<>());
        Iterator<String> it = this.zzYP3.iterator();
        while (it.hasNext()) {
            zzP zzp = (zzP) com.aspose.words.internal.zzQW.zzZ(this.zzYP2, it.next());
            if (zzp == null) {
                zzp = new zzP();
            }
            document.zzZqD().add(zzp);
        }
    }

    private void zzZmz() {
        zzP zzp = new zzP();
        String value = null;
        while (this.zzYP4.zzi()) {
            switch (zzUR.zzTP(this.zzYP4.getLocalName())) {
                case 21:
                    value = this.zzYP4.getValue();
                    break;
                case 22:
                    zzp.zzZGw = com.aspose.words.internal.zzZQB.zzVT(this.zzYP4.getValue());
                    break;
                case 23:
                    zzp.zzZGx = zzZXY.zzNS(this.zzYP4.getValue());
                    break;
                case 24:
                    zzp.zzZGx = zzYU3.zzGU(this.zzYP4.getValue());
                    break;
            }
        }
        if (com.aspose.words.internal.zzZYD.zzXk(value)) {
            this.zzYP2.put(value, zzp);
        }
    }

    private void zzZ(zzZ7B zzz7b) {
        while (this.zzYP4.zzi()) {
            switch (zzUR.zzTP(this.zzYP4.getLocalName())) {
                case 15:
                    zzz7b.zzYhl = 3;
                    zzz7b.zzYhj = zzYU3.zzGU(this.zzYP4.getValue());
                    break;
                case 16:
                    zzz7b.zzYhl = 3;
                    zzz7b.zzYhj = zzZXY.zzNS(this.zzYP4.getValue());
                    break;
                case 17:
                    zzz7b.zzYhi = zzYU3.zzGU(this.zzYP4.getValue());
                    break;
            }
        }
    }
}
