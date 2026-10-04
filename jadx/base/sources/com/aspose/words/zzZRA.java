package com.aspose.words;

import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes6.dex */
final class zzZRA {
    static boolean zzZD5 = false;
    zzYIY zzYGA;
    zzYIZ zzYGB;
    zzYJ0 zzYGC;
    zzYJ1 zzYGD;
    zzYJ2 zzYGE;
    private short zzYGF;
    private int zzYGG;
    private int zzYGH;
    private int zzYGI;
    private int zzYGJ;
    private int zzYGK;
    private int zzYGL;
    private int zzYGM;
    private int zzYGN;
    private int zzYGO;
    private int zzYGP;
    private int zzYGQ;
    int zzYGR;
    int zzYGS;
    int zzYGT;
    int zzYGU;
    private int zzYGV;
    int zzYGW;
    int zzYGX;
    int zzYGY;
    private int zzYGZ;
    zzZRG zzYGz;
    private int zzYH0;
    int zzYH1;
    private short zzYH2;
    private short zzYH3;
    private short zzYH4;
    private short zzYH5;
    private short zzYH6;
    private short zzYH7;
    private short zzYH8;
    int zzYH9;
    private short zzYHA;
    int zzYHB;
    private short zzYHC;
    int zzYHa;
    private short zzYHb;
    private short zzYHc;
    private boolean zzYHd;
    private boolean zzYHe;
    private boolean zzYHf;
    private boolean zzYHg;
    private boolean zzYHh;
    private byte zzYHi;
    int zzYHj;
    short zzYHk;
    boolean zzYHl;
    private boolean zzYHm;
    private boolean zzYHn;
    private boolean zzYHo;
    boolean zzYHp;
    boolean zzYHq;
    boolean zzYHr;
    boolean zzYHs;
    int zzYHt;
    boolean zzYHu;
    boolean zzYHv;
    boolean zzYHw;
    boolean zzYHx;
    short zzYHy;
    short zzYHz;
    private IWarningCallback zzZG0;

    public zzZRA(int i) {
        this.zzYGE = new zzYJ2();
        this.zzYGD = new zzYJ1();
        this.zzYGC = new zzYJ0();
        this.zzYGB = new zzYIZ();
        this.zzYGA = new zzYIY();
        this.zzYGz = new zzZRG();
        this.zzYHC = (short) -23060;
        if (i == 274) {
            this.zzYHB = StyleIdentifier.GRID_TABLE_2;
            this.zzYGF = (short) 183;
        } else {
            this.zzYHB = StyleIdentifier.PLAIN_TABLE_2;
            this.zzYGF = (short) 164;
        }
        this.zzYHA = (short) 24609;
        this.zzYHz = (short) 1033;
        this.zzYHv = true;
        this.zzYHo = true;
        this.zzYHk = (short) 191;
        this.zzYHd = true;
        this.zzYH8 = (short) 14;
        this.zzYH7 = (short) 22337;
        this.zzYH6 = (short) 78;
        this.zzYH5 = (short) (("24.3.0".charAt(1) << '\b') | "24.3.0".charAt(0));
        this.zzYH4 = (short) ("24.3.0".charAt(2) | ("24.3.0".charAt(3) << '\b'));
        this.zzYH3 = (short) 1033;
        this.zzYH2 = (short) 22;
        this.zzYGK = 1048575;
        this.zzYGN = 1048575;
        this.zzYGQ = 1048575;
        this.zzYH0 = 51006;
        this.zzYGZ = 51006;
    }

    private static boolean zzDK(int i) {
        return i < 101;
    }

    public static boolean zzDL(int i) {
        return 101 <= i && i < 106;
    }

    private void zzN(com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        zzzox.zzq().zzH(i);
        this.zzYHC = zzzox.zzX9();
        this.zzYHB = zzzox.zzX9() & 65535;
        this.zzYHA = zzzox.zzX9();
        this.zzYHz = zzzox.zzXa();
        this.zzYHy = zzzox.zzXa();
        byte b = zzzox.readByte();
        this.zzYHx = (b & 1) != 0;
        this.zzYHw = (b & 2) != 0;
        this.zzYHv = (b & 4) != 0;
        this.zzYHu = (b & 8) != 0;
        this.zzYHt = (b & 240) >> 4;
        byte b2 = zzzox.readByte();
        this.zzYHs = (b2 & 1) != 0;
        this.zzYHr = (b2 & 2) != 0;
        this.zzYHq = (b2 & 4) != 0;
        this.zzYHp = (b2 & 8) != 0;
        this.zzYHo = (b2 & 16) != 0;
        this.zzYHn = (b2 & 32) != 0;
        this.zzYHm = (b2 & SignedBytes.MAX_POWER_OF_TWO) != 0;
        this.zzYHl = (b2 & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
        this.zzYHk = zzzox.zzX9();
        this.zzYHj = zzzox.zzXc();
        this.zzYHi = zzzox.readByte();
        byte b3 = zzzox.readByte();
        this.zzYHh = (b3 & 1) != 0;
        this.zzYHg = (b3 & 2) != 0;
        this.zzYHf = (b3 & 4) != 0;
        this.zzYHe = (b3 & 8) != 0;
        this.zzYHd = (b3 & 16) != 0;
        this.zzYHc = zzzox.zzX9();
        this.zzYHb = zzzox.zzX9();
        this.zzYHa = zzzox.zzXc();
        this.zzYH9 = zzzox.zzXc();
        if (!zzDL(this.zzYHB)) {
            this.zzYH8 = zzzox.zzX9();
            this.zzYH7 = zzzox.zzX9();
            this.zzYH6 = zzzox.zzX9();
            this.zzYH5 = zzzox.zzX9();
            this.zzYH4 = zzzox.zzX9();
            zzzox.zzq().zzU(18L, 1);
            this.zzYH3 = zzzox.zzXa();
            this.zzYH2 = zzzox.zzX9();
            this.zzYH1 = zzzox.zzXc();
            return;
        }
        this.zzYH1 = zzzox.zzXc();
        zzzox.zzXc();
        zzzox.zzXc();
        zzzox.zzXc();
        zzzox.zzXc();
        this.zzYGY = zzzox.zzXc();
        this.zzYGX = zzzox.zzXc();
        this.zzYGW = zzzox.zzXc();
        this.zzYGV = zzzox.zzXc();
        this.zzYGU = zzzox.zzXc();
        this.zzYGT = zzzox.zzXc();
        this.zzYGS = zzzox.zzXc();
        this.zzYGR = zzzox.zzXc();
        zzzox.zzXc();
    }

    private void zzY(boolean z, String str) {
        if (z) {
            zzY1Z.zzZ(this.zzZG0, 10, str, new Object[0]);
        }
    }

    private void zzZgW() {
        zzY(this.zzYHn, "LoadOverride flag is not supported in DOC format by Aspose.Words.");
        zzY(this.zzYHm, "Installation language is FarEast language.");
        zzY(zzDL(this.zzYHB), "Document is a Word 6.0/95 document.");
        zzY(this.zzYGE.zzYkM(), "Printer driver information is not supported by Aspose.Words.");
        zzY(this.zzYGE.zzYkK(), "Last selection information is not supported by Aspose.Words.");
        zzY(this.zzYHx && this.zzYGE.zzYkO(), "Captions/AutoCaptions are not supported, ignored.");
        zzY(this.zzYGE.zzYkJ(), "Spell checker information is not supported by Aspose.Words.");
        zzY(this.zzYGE.zzYkL(), "Grammar checker information is not supported by Aspose.Words.");
        zzY(this.zzYGE.zzYkI(), "RouteSlip information is DOC format only feature and lost if saved to another format.");
        zzY(this.zzYGE.zzYkF(), "Word97/2000 save history is not supported by Aspose.Words.");
        zzY(this.zzYGE.zzYkN(), "Document versioning is not supported by Aspose.Words.");
        zzY(this.zzYGE.zzYkG(), "Pre-Word2003 additional information for ActiveX is not supported by Aspose.Words.");
        zzY(this.zzYGE.zzYkH(), "Priority of a text ranges for AutoSummary is not supported, ignored.");
        zzY(this.zzYGD.zzYkE(), "Threading information is not supported by Aspose.Words.");
        zzY(this.zzYGD.zzYkD(), "Hybrid multilevel lists numbering formats is not supported by Aspose.Words.");
        zzY(this.zzYGD.zzYkC(), "MSO Envelope information is not supported by Aspose.Words.");
        zzY(this.zzYGD.zzYkB(), "Language auto-detect data is not supported by Aspose.Words.");
        zzY(this.zzYGD.zzYkA(), "Grammar checker options is not supported is not supported by Aspose.Words.");
        zzY(this.zzYGC.zzYkz(), "Grammar checker cookies is not supported is not supported by Aspose.Words.");
        zzY(this.zzYGC.zzYky(), "Microsoft Text Framework data is not supported by Aspose.Words.");
        zzY(this.zzYGC.zzYkx(), "Smart tag recognizer data is not supported by Aspose.Words.");
        zzY(this.zzYGC.zzYkw(), "Repair bookmarks are not supported by Aspose.Words.");
        zzY(this.zzYGC.zzYkv(), "Consistency checker bookmarks are not supported, ignored.");
        zzY(this.zzYGB.zzYku(), "Saved revision author selection is not supported, ignored.");
    }

    public final boolean isValid() {
        if (this.zzYH1 < 0) {
            return false;
        }
        int i = this.zzYHB;
        if (i == 101 || i == 106 || i == 217 || i == 257 || i == 268 || i == 274 || i == 103 || i == 104) {
            return true;
        }
        switch (i) {
        }
        return false;
    }

    public final String toString() {
        return com.aspose.words.internal.zzZYD.zzR(this, "FIB");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.aspose.words.internal.zzZOW] */
    /* JADX WARN: Type inference failed for: r3v100 */
    /* JADX WARN: Type inference failed for: r3v101 */
    /* JADX WARN: Type inference failed for: r3v102 */
    /* JADX WARN: Type inference failed for: r3v103 */
    /* JADX WARN: Type inference failed for: r3v104 */
    /* JADX WARN: Type inference failed for: r3v105 */
    /* JADX WARN: Type inference failed for: r3v106 */
    /* JADX WARN: Type inference failed for: r3v107 */
    /* JADX WARN: Type inference failed for: r3v108 */
    /* JADX WARN: Type inference failed for: r3v109 */
    /* JADX WARN: Type inference failed for: r3v110 */
    /* JADX WARN: Type inference failed for: r3v111 */
    /* JADX WARN: Type inference failed for: r3v112 */
    /* JADX WARN: Type inference failed for: r3v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24, types: [byte] */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v61, types: [com.aspose.words.zzYJ2] */
    /* JADX WARN: Type inference failed for: r3v62, types: [com.aspose.words.zzYJ1] */
    /* JADX WARN: Type inference failed for: r3v64, types: [com.aspose.words.zzYJ0] */
    /* JADX WARN: Type inference failed for: r3v66, types: [com.aspose.words.zzYIZ] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v74, types: [com.aspose.words.zzYIY] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r3v99 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void zz0(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        ?? zzzow = new com.aspose.words.internal.zzZOW(zzzop, com.aspose.words.internal.zzZO0.zzhU());
        zzzow.zzJ(this.zzYHC);
        zzzow.zzJ((short) 193);
        zzzow.zzJ(this.zzYHA);
        zzzow.zzK(this.zzYHz);
        zzzow.zzK(this.zzYHy);
        ?? r3 = this.zzYHx;
        ?? r32 = r3;
        if (this.zzYHw) {
            r32 = (short) (r3 | 2);
        }
        ?? r33 = r32;
        if (this.zzYHv) {
            r33 = (short) (r32 | 4);
        }
        ?? r34 = r33;
        if (this.zzYHu) {
            r34 = (short) (r33 | 8);
        }
        short s = (short) (r34 | ((short) ((this.zzYHt << 4) & 240)));
        if (this.zzYHs) {
            s = (short) (s | 256);
        }
        if (this.zzYHr) {
            s = (short) (s | 512);
        }
        if (this.zzYHq) {
            s = (short) (s | 1024);
        }
        if (this.zzYHp) {
            s = (short) (s | 2048);
        }
        if (this.zzYHo) {
            s = (short) (s | 4096);
        }
        zzzow.zzJ(s);
        zzzow.zzJ(this.zzYHk);
        zzzow.zzl(this.zzYHj);
        zzzow.writeByte(this.zzYHi);
        ?? r35 = this.zzYHh;
        ?? r36 = r35;
        if (this.zzYHg) {
            r36 = (byte) (r35 | 2);
        }
        ?? r37 = r36;
        if (this.zzYHf) {
            r37 = (byte) (r36 | 4);
        }
        ?? r38 = r37;
        if (this.zzYHe) {
            r38 = (byte) (r37 | 8);
        }
        ?? r39 = r38;
        if (this.zzYHd) {
            r39 = (byte) (r38 | 16);
        }
        zzzow.writeByte(r39);
        zzzow.zzJ(this.zzYHc);
        zzzow.zzJ(this.zzYHb);
        zzzow.zzl(this.zzYHa);
        zzzow.zzl(this.zzYH9);
        zzzow.zzJ(this.zzYH8);
        zzzow.zzJ(this.zzYH7);
        zzzow.zzJ(this.zzYH6);
        zzzow.zzJ(this.zzYH5);
        zzzow.zzJ(this.zzYH4);
        zzzow.zzZa(18, 1);
        zzzow.zzK(this.zzYH3);
        zzzow.zzJ(this.zzYH2);
        zzzow.zzl(this.zzYH1);
        zzzow.zzl(this.zzYH0);
        zzzow.zzl(this.zzYGZ);
        zzzow.zzl(this.zzYGY);
        zzzow.zzl(this.zzYGX);
        zzzow.zzl(this.zzYGW);
        zzzow.zzl(this.zzYGV);
        zzzow.zzl(this.zzYGU);
        zzzow.zzl(this.zzYGT);
        zzzow.zzl(this.zzYGS);
        zzzow.zzl(this.zzYGR);
        zzzow.zzl(this.zzYGQ);
        zzzow.zzl(this.zzYGP);
        zzzow.zzl(this.zzYGO);
        zzzow.zzl(this.zzYGN);
        zzzow.zzl(this.zzYGM);
        zzzow.zzl(this.zzYGL);
        zzzow.zzl(this.zzYGK);
        zzzow.zzl(this.zzYGJ);
        zzzow.zzl(this.zzYGI);
        zzzow.zzl(this.zzYGH);
        zzzow.zzl(this.zzYGG);
        zzzow.zzJ(this.zzYGF);
        zzzow.zzq().getPosition();
        this.zzYGE.zzZ(zzzow);
        this.zzYGD.zzZ(zzzow);
        zzzow.zzq().getPosition();
        this.zzYGC.zzZ(zzzow);
        zzzow.zzq().getPosition();
        this.zzYGB.zzW(zzzow, this.zzYGE.zzXA8.zzYHK);
        zzzow.zzq().getPosition();
        if (this.zzYHB == 274) {
            this.zzYGA.zzZ(zzzow);
        }
        zzzow.zzq().getPosition();
        zzzow.zzJ((short) 2);
        zzzow.zzJ((short) this.zzYHB);
        zzzow.zzJ((short) 0);
    }

    public final int zzDM(int i) {
        int i2 = this.zzYGY;
        if (i < i2) {
            return i;
        }
        int i3 = i - i2;
        int i4 = this.zzYGX;
        if (i3 < i4) {
            return i3;
        }
        int i5 = i3 - i4;
        int i6 = this.zzYGW;
        if (i5 < i6) {
            return i5;
        }
        int i7 = i5 - i6;
        int i8 = this.zzYGV;
        if (i7 < i8) {
            return i7;
        }
        int i9 = i7 - i8;
        int i10 = this.zzYGU;
        if (i9 < i10) {
            return i9;
        }
        int i11 = i9 - i10;
        int i12 = this.zzYGT;
        if (i11 < i12) {
            return i11;
        }
        int i13 = i11 - i12;
        int i14 = this.zzYGS;
        if (i13 < i14) {
            return i13;
        }
        int i15 = i13 - i14;
        if (i15 < this.zzYGR) {
            return i15;
        }
        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Attempted to aim {0} characters past the end of the text. ", Integer.valueOf(i15)));
    }

    public final void zzM(com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        if (zzDL(this.zzYHB)) {
            zzzox.zzq().zzH(i + 88);
            this.zzYGE.zzb(zzzox);
            zzzox.zzXa();
            this.zzYGP = zzzox.zzXa();
            this.zzYGM = zzzox.zzXa();
            this.zzYGO = zzzox.zzXa();
            this.zzYGL = zzzox.zzXa();
            this.zzYGE.zza(zzzox);
            zzZgW();
            return;
        }
        zzzox.zzq().zzH(i + 68);
        this.zzYH0 = zzzox.zzXc();
        this.zzYGZ = zzzox.zzXc();
        this.zzYGY = zzzox.zzXc();
        this.zzYGX = zzzox.zzXc();
        this.zzYGW = zzzox.zzXc();
        this.zzYGV = zzzox.zzXc();
        this.zzYGU = zzzox.zzXc();
        this.zzYGT = zzzox.zzXc();
        this.zzYGS = zzzox.zzXc();
        this.zzYGR = zzzox.zzXc();
        this.zzYGQ = zzzox.zzXc();
        this.zzYGP = zzzox.zzXc();
        this.zzYGO = zzzox.zzXc();
        this.zzYGN = zzzox.zzXc();
        this.zzYGM = zzzox.zzXc();
        this.zzYGL = zzzox.zzXc();
        this.zzYGK = zzzox.zzXc();
        this.zzYGJ = zzzox.zzXc();
        this.zzYGI = zzzox.zzXc();
        this.zzYGH = zzzox.zzXc();
        this.zzYGG = zzzox.zzXc();
        this.zzYGF = zzzox.zzX9();
        int position = (int) zzzox.zzq().getPosition();
        this.zzYGE.zzZ(zzzox);
        zzzox.zzq().getPosition();
        if ((this.zzYGF & 65535) >= 108) {
            this.zzYGD.zzZ(zzzox);
        }
        if ((this.zzYGF & 65535) >= 136) {
            this.zzYGC.zzZ(zzzox);
        }
        if ((this.zzYGF & 65535) >= 164) {
            this.zzYGB.zzZ(zzzox);
        }
        if ((this.zzYGF & 65535) >= 183) {
            this.zzYGA.zzZ(zzzox);
        }
        if ((this.zzYGF & 65535) >= 108) {
            zzzox.zzq().zzH(((this.zzYGF & 65535) * 8) + position);
            int iZzX9 = zzzox.zzX9() & 65535;
            if (iZzX9 >= 2) {
                this.zzYGz = new zzZRG((int) zzzox.zzq().getPosition(), iZzX9 * 2);
                int iZzX92 = zzzox.zzX9() & 65535;
                this.zzYHB = iZzX92;
                if (iZzX92 < 217) {
                    this.zzYHB = 217;
                }
                this.zzYHt = zzzox.zzX9() & 65535;
            }
        }
        int i2 = this.zzYGY + this.zzYGX + this.zzYGW + this.zzYGV + this.zzYGU + this.zzYGT + this.zzYGS + this.zzYGR + 1;
        if (this.zzYHo) {
            i2 *= 2;
        }
        int i3 = this.zzYH9 - 2048;
        if (this.zzYHB == 193 && i2 < i3) {
            this.zzYGY = i3;
            this.zzYGX = 0;
            this.zzYGW = 0;
            this.zzYGV = 0;
            this.zzYGU = 0;
            this.zzYGT = 0;
            this.zzYGS = 0;
            this.zzYGR = 0;
        }
        zzZgW();
    }

    public final int zzXL(int i, int i2) {
        if (i == 0) {
            return i2;
        }
        int i3 = i2 + this.zzYGY;
        if (i == 1) {
            return i3;
        }
        int i4 = i3 + this.zzYGX;
        if (i == 2) {
            return i4;
        }
        int i5 = i4 + this.zzYGW + this.zzYGV;
        if (i == 3) {
            return i5;
        }
        int i6 = i5 + this.zzYGU;
        if (i == 4) {
            return i6;
        }
        int i7 = i6 + this.zzYGT;
        if (i == 5) {
            return i7;
        }
        int i8 = i7 + this.zzYGS;
        if (i == 6) {
            return i8;
        }
        throw new IllegalStateException("Unknown subdocument type specified.");
    }

    public final boolean zzZgX() {
        return zzDL(this.zzYHB) && this.zzYHo;
    }

    public final boolean zzZgY() {
        return zzDK(this.zzYHB);
    }

    public final String zzZgZ() {
        return this.zzYHr ? "1Table" : "0Table";
    }

    public zzZRA(com.aspose.words.internal.zzZOX zzzox, IWarningCallback iWarningCallback, int i) throws Exception {
        this.zzYGE = new zzYJ2();
        this.zzYGD = new zzYJ1();
        this.zzYGC = new zzYJ0();
        this.zzYGB = new zzYIZ();
        this.zzYGA = new zzYIY();
        this.zzYGz = new zzZRG();
        this.zzZG0 = iWarningCallback;
        zzN(zzzox, i);
    }
}
