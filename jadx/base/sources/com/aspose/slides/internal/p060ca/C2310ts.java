package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18385v2;
import com.miui.penengine.p596e.C18773h;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ts */
/* JADX INFO: loaded from: classes3.dex */
public class C2310ts implements InterfaceC2371xl {

    /* JADX INFO: renamed from: du */
    private String[] f7977du;

    /* JADX INFO: renamed from: kk */
    private C2343w2 f7981kk;

    /* JADX INFO: renamed from: to */
    private C2343w2 f7983to;

    /* JADX INFO: renamed from: x1 */
    private C2286s7 f7984x1;

    /* JADX INFO: renamed from: h4 */
    private Object f7979h4 = new Object();

    /* JADX INFO: renamed from: m9 */
    private Object f7982m9 = new Object();

    /* JADX INFO: renamed from: dy */
    private Object f7978dy = new Object();

    /* JADX INFO: renamed from: k4 */
    private List<C2310ts> f7980k4 = new List<>();

    public C2310ts(C2286s7 c2286s7) {
        this.f7984x1 = c2286s7;
    }

    /* JADX INFO: renamed from: kk */
    private String m11452kk(int i) {
        if (i <= 390) {
            return m11455kk()[i];
        }
        int[] iArr = {0};
        int[] iArr2 = {0};
        this.f7984x1.m11382k4().m11734du().m11206k4(i - 391, iArr, iArr2);
        return AbstractC6747ar.m26650yj().mo26682x1(this.f7984x1.m11382k4().m11734du().m11202h4(), iArr[0], iArr2[0]);
    }

    /* JADX INFO: renamed from: to */
    private void m11453to() {
        String[] strArr = this.f7977du;
        strArr[0] = ".notdef";
        strArr[1] = "space";
        strArr[2] = "exclam";
        strArr[3] = "quotedbl";
        strArr[4] = "numbersign";
        strArr[5] = "dollar";
        strArr[6] = "percent";
        strArr[7] = "ampersand";
        strArr[8] = "quoteright";
        strArr[9] = "parenleft";
        strArr[10] = "parenright";
        strArr[11] = "asterisk";
        strArr[12] = "plus";
        strArr[13] = "comma";
        strArr[14] = "hyphen";
        strArr[15] = "period";
        strArr[16] = "slash";
        strArr[17] = "zero";
        strArr[18] = "one";
        strArr[19] = "two";
        strArr[20] = "three";
        strArr[21] = "four";
        strArr[22] = "five";
        strArr[23] = "six";
        strArr[24] = "seven";
        strArr[25] = "eight";
        strArr[26] = "nine";
        strArr[27] = "colon";
        strArr[28] = "semicolon";
        strArr[29] = "less";
        strArr[30] = "equal";
        strArr[31] = "greater";
        strArr[32] = "question";
        strArr[33] = "at";
        strArr[34] = C18385v2.f56336h;
        strArr[35] = "B";
        strArr[36] = "C";
        strArr[37] = "D";
        strArr[38] = "E";
        strArr[39] = "F";
        strArr[40] = "G";
        strArr[41] = "H";
        strArr[42] = "I";
        strArr[43] = "J";
        strArr[44] = "K";
        strArr[45] = "L";
        strArr[46] = "M";
        strArr[47] = "N";
        strArr[48] = "O";
        strArr[49] = "P";
        strArr[50] = "Q";
        strArr[51] = "R";
        strArr[52] = "S";
        strArr[53] = "T";
        strArr[54] = "U";
        strArr[55] = "V";
        strArr[56] = "W";
        strArr[57] = "X";
        strArr[58] = "Y";
        strArr[59] = "Z";
        strArr[60] = "bracketleft";
        strArr[61] = "backslash";
        strArr[62] = "bracketright";
        strArr[63] = "asciicircum";
        strArr[64] = "underscore";
        strArr[65] = "quoteleft";
        strArr[66] = "a";
        strArr[67] = "b";
        strArr[68] = "c";
        strArr[69] = "d";
        strArr[70] = "e";
        strArr[71] = "f";
        strArr[72] = "g";
        strArr[73] = C18773h.f57233c;
        strArr[74] = ContextChain.TAG_INFRA;
        strArr[75] = "j";
        strArr[76] = "k";
        strArr[77] = "l";
        strArr[78] = "m";
        strArr[79] = BackupFile.PREFIX_NOTE_DIR;
        strArr[80] = "o";
        strArr[81] = ContextChain.TAG_PRODUCT;
        strArr[82] = "q";
        strArr[83] = "r";
        strArr[84] = "s";
        strArr[85] = "t";
        strArr[86] = "u";
        strArr[87] = "v";
        strArr[88] = "w";
        strArr[89] = "x";
        strArr[90] = "y";
        strArr[91] = "z";
        strArr[92] = "braceleft";
        strArr[93] = "bar";
        strArr[94] = "braceright";
        strArr[95] = "asciitilde";
        strArr[96] = "exclamdown";
        strArr[97] = "cent";
        strArr[98] = "sterling";
        strArr[99] = "fraction";
        strArr[100] = "yen";
        strArr[101] = "florin";
        strArr[102] = "section";
        strArr[103] = FirebaseAnalytics.Param.CURRENCY;
        strArr[104] = "quotesingle";
        strArr[105] = "quotedblleft";
        strArr[106] = "guillemotleft";
        strArr[107] = "guilsinglleft";
        strArr[108] = "guilsinglright";
        strArr[109] = TranslateLanguage.FINNISH;
        strArr[110] = "fl";
        strArr[111] = "endash";
        strArr[112] = "dagger";
        strArr[113] = "daggerdbl";
        strArr[114] = "periodcentered";
        strArr[115] = "paragraph";
        strArr[116] = "bullet";
        strArr[117] = "quotesinglbase";
        strArr[118] = "quotedblbase";
        strArr[119] = "quotedblright";
        strArr[120] = "guillemotright";
        strArr[121] = "ellipsis";
        strArr[122] = "perthousand";
        strArr[123] = "questiondown";
        strArr[124] = "grave";
        strArr[125] = "acute";
        strArr[126] = "circumflex";
        strArr[127] = "tilde";
        strArr[128] = "macron";
        strArr[129] = "breve";
        strArr[130] = "dotaccent";
        strArr[131] = "dieresis";
        strArr[132] = "ring";
        strArr[133] = "cedilla";
        strArr[134] = "hungarumlaut";
        strArr[135] = "ogonek";
        strArr[136] = "caron";
        strArr[137] = "emdash";
        strArr[138] = "AE";
        strArr[139] = "ordfeminine";
        strArr[140] = "Lslash";
        strArr[141] = "Oslash";
        strArr[142] = "OE";
        strArr[143] = "ordmasculine";
        strArr[144] = "ae";
        strArr[145] = "dotlessi";
        strArr[146] = "lslash";
        strArr[147] = "oslash";
        strArr[148] = "oe";
        strArr[149] = "germandbls";
        strArr[150] = "onesuperior";
        strArr[151] = "logicalnot";
        strArr[152] = "mu";
        strArr[153] = "trademark";
        strArr[154] = "Eth";
        strArr[155] = "onehalf";
        strArr[156] = "plusminus ";
        strArr[157] = "Thorn";
        strArr[158] = "onequarter";
        strArr[159] = "divide";
        strArr[160] = "brokenbar";
        strArr[161] = "degree";
        strArr[162] = "thorn";
        strArr[163] = "threequarters";
        strArr[164] = "twosuperior";
        strArr[165] = "registered";
        strArr[166] = "minus";
        strArr[167] = "eth";
        strArr[168] = "multiply";
        strArr[169] = "threesuperior";
        strArr[170] = "copyright";
        strArr[171] = "Aacute";
        strArr[172] = "Acircumflex";
        strArr[173] = "Adieresis";
        strArr[174] = "Agrave";
        strArr[175] = "Aring";
        strArr[176] = "Atilde";
        strArr[177] = "Ccedilla";
        strArr[178] = "Eacute";
        strArr[179] = "Ecircumflex";
        strArr[180] = "Edieresis";
        strArr[181] = "Egrave";
        strArr[182] = "Iacute";
        strArr[183] = "Icircumflex";
        strArr[184] = "Idieresis";
        strArr[185] = "Igrave";
        strArr[186] = "Ntilde";
        strArr[187] = "Oacute";
        strArr[188] = "Ocircumflex";
        strArr[189] = "Odieresis";
        strArr[190] = "Ograve";
        strArr[191] = "Otilde";
        strArr[192] = "Scaron";
        strArr[193] = "Uacute";
        strArr[194] = "Ucircumflex";
        strArr[195] = "Udieresis";
        strArr[196] = "Ugrave";
        strArr[197] = "Yacute";
        strArr[198] = "Ydieresis";
        strArr[199] = "Zcaron";
        strArr[200] = "aacute";
        strArr[201] = "acircumflex";
        strArr[202] = "adieresis";
        strArr[203] = "agrave";
        strArr[204] = "aring";
        strArr[205] = "atilde";
        strArr[206] = "ccedilla";
        strArr[207] = "eacute";
        strArr[208] = "ecircumflex";
        strArr[209] = "edieresis";
        strArr[210] = "egrave";
        strArr[211] = "iacute";
        strArr[212] = "icircumflex";
        strArr[213] = "idieresis";
        strArr[214] = "igrave";
        strArr[215] = "ntilde";
        strArr[216] = "oacute";
        strArr[217] = "ocircumflex";
        strArr[218] = "odieresis";
        strArr[219] = "ograve";
        strArr[220] = "otilde";
        strArr[221] = "scaron";
        strArr[222] = "uacute";
        strArr[223] = "ucircumflex";
        strArr[224] = "udieresis";
        strArr[225] = "ugrave";
        strArr[226] = "yacute";
        strArr[227] = "ydieresis";
        strArr[228] = "zcaron";
        strArr[229] = "exclamsmall";
        strArr[230] = "Hungarumlautsmall";
        strArr[231] = "dollaroldstyle";
        strArr[232] = "dollarsuperior";
        strArr[233] = "ampersandsmall";
        strArr[234] = "Acutesmall";
        strArr[235] = "parenleftsuperior";
        strArr[236] = "parenrightsuperior";
        strArr[237] = "twodotenleader";
        strArr[238] = "onedotenleader";
        strArr[239] = "zerooldstyle";
        strArr[240] = "oneoldstyle";
        strArr[241] = "twooldstyle";
        strArr[242] = "threeoldstyle";
        strArr[243] = "fouroldstyle";
        strArr[244] = "fiveoldstyle";
        strArr[245] = "sixoldstyle";
        strArr[246] = "sevenoldstyle";
        strArr[247] = "eightoldstyle";
        strArr[248] = "nineoldstyle";
        strArr[249] = "commasuperior";
        strArr[250] = "threequartersemdash";
        strArr[251] = "periodsuperior";
        strArr[252] = "questionsmall";
        strArr[253] = "asuperior";
        strArr[254] = "bsuperior";
        strArr[255] = "centsuperior";
        strArr[256] = "dsuperior";
        strArr[257] = "esuperior";
        strArr[258] = "isuperior";
        strArr[259] = "lsuperior";
        strArr[260] = "msuperior";
        strArr[261] = "nsuperior";
        strArr[262] = "osuperior";
        strArr[263] = "rsuperior";
        strArr[264] = "ssuperior";
        strArr[265] = "tsuperior";
        strArr[266] = "ff";
        strArr[267] = "ffi";
        strArr[268] = "ffl";
        strArr[269] = "parenleftinferior";
        strArr[270] = "parenrightinferior";
        strArr[271] = "Circumflexsmall";
        strArr[272] = "hyphensuperior";
        strArr[273] = "Gravesmall";
        strArr[274] = "Asmall";
        strArr[275] = "Bsmall";
        strArr[276] = "Csmall";
        strArr[277] = "Dsmall";
        strArr[278] = "Esmall";
        strArr[279] = "Fsmall";
        strArr[280] = "Gsmall";
        strArr[281] = "Hsmall";
        strArr[282] = "Ismall";
        strArr[283] = "Jsmall";
        strArr[284] = "Ksmall";
        strArr[285] = "Lsmall";
        strArr[286] = "Msmall";
        strArr[287] = "Nsmall";
        strArr[288] = "Osmall";
        strArr[289] = "Psmall";
        strArr[290] = "Qsmall";
        strArr[291] = "Rsmall";
        strArr[292] = "Ssmall";
        strArr[293] = "Tsmall";
        strArr[294] = "Usmall";
        strArr[295] = "Vsmall";
        strArr[296] = "Wsmall";
        strArr[297] = "Xsmall";
        strArr[298] = "Ysmall";
        strArr[299] = "Zsmall";
        strArr[300] = "colonmonetary";
        strArr[301] = "onefitted";
        strArr[302] = "rupiah";
        strArr[303] = "Tildesmall";
        strArr[304] = "exclamdownsmall";
        strArr[305] = "centoldstyle";
        strArr[306] = "Lslashsmall";
        strArr[307] = "Scaronsmall";
        strArr[308] = "Zcaronsmall";
        strArr[309] = "Dieresissmall";
        strArr[310] = "Brevesmall";
        strArr[311] = "Caronsmall";
        strArr[312] = "Dotaccentsmall";
        strArr[313] = "Macronsmall";
        strArr[314] = "figuredash";
        strArr[315] = "hypheninferior";
        strArr[316] = "Ogoneksmall";
        strArr[317] = "Ringsmall";
        strArr[318] = "Cedillasmall";
        strArr[319] = "questiondownsmall";
        strArr[320] = "oneeighth";
        strArr[321] = "threeeighths";
        strArr[322] = "fiveeighths";
        strArr[323] = "seveneighths";
        strArr[324] = "onethird";
        strArr[325] = "twothirds";
        strArr[326] = "zerosuperior";
        strArr[327] = "foursuperior";
        strArr[328] = "fivesuperior";
        strArr[329] = "sixsuperior";
        strArr[330] = "sevensuperior";
        strArr[331] = "eightsuperior";
        strArr[332] = "ninesuperior";
        strArr[333] = "zeroinferior";
        strArr[334] = "oneinferior";
        strArr[335] = "twoinferior";
        strArr[336] = "threeinferior";
        strArr[337] = "fourinferior";
        strArr[338] = "fiveinferior";
        strArr[339] = "sixinferior";
        strArr[340] = "seveninferior";
        strArr[341] = "eightinferior";
        strArr[342] = "nineinferior";
        strArr[343] = "centinferior";
        strArr[344] = "dollarinferior";
        strArr[345] = "periodinferior";
        strArr[346] = "commainferior";
        strArr[347] = "Agravesmall";
        strArr[348] = "Aacutesmall";
        strArr[349] = "Acircumflexsmall";
        strArr[350] = "Atildesmall";
        strArr[351] = "Adieresissmall";
        strArr[352] = "Aringsmall";
        strArr[353] = "AEsmall";
        strArr[354] = "Ccedillasmall";
        strArr[355] = "Egravesmall";
        strArr[356] = "Eacutesmall";
        strArr[357] = "Ecircumflexsmall";
        strArr[358] = "Edieresissmall";
        strArr[359] = "Igravesmall";
        strArr[360] = "Iacutesmall";
        strArr[361] = "Icircumflexsmall";
        strArr[362] = "Idieresissmall";
        strArr[363] = "Ethsmall";
        strArr[364] = "Ntildesmall";
        strArr[365] = "Ogravesmall";
        strArr[366] = "Oacutesmall";
        strArr[367] = "Ocircumflexsmall";
        strArr[368] = "Otildesmall";
        strArr[369] = "Odieresissmall";
        strArr[370] = "OEsmall";
        strArr[371] = "Oslashsmall";
        strArr[372] = "Ugravesmall";
        strArr[373] = "Uacutesmall";
        strArr[374] = "Ucircumflexsmall";
        strArr[375] = "Udieresissmall";
        strArr[376] = "Yacutesmall";
        strArr[377] = "Thornsmall";
        strArr[378] = "Ydieresissmall";
        strArr[379] = "001.000";
        strArr[380] = "001.001";
        strArr[381] = "001.002";
        strArr[382] = "001.003";
        strArr[383] = "Black";
        strArr[384] = "Bold";
        strArr[385] = "Book";
        strArr[386] = "Light";
        strArr[387] = "Medium";
        strArr[388] = "Regular";
        strArr[389] = "Roman";
        strArr[390] = "Semibold";
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2371xl
    /* JADX INFO: renamed from: k4 */
    public final int mo10986k4(AbstractC2220nx abstractC2220nx) {
        C2319ub c2319ub = (C2319ub) C7019kk.m27452k4((Object) abstractC2220nx, C2319ub.class);
        if (c2319ub != null) {
            return C2107h4.f7286k4.mo10660k4(c2319ub.m11480k4());
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2371xl
    /* JADX INFO: renamed from: x1 */
    public final AbstractC2220nx mo10989x1(int i) {
        return i < this.f7984x1.m11382k4().m11733c5().m11628x1().length ? new C2334v6(this.f7984x1.m11382k4().m11733c5().m11628x1()[(char) (i & 65535)] & 65535) : new C2334v6(0);
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2371xl
    /* JADX INFO: renamed from: k4 */
    public final AbstractC2220nx mo10987k4(int i) {
        char c = (char) (i & 65535);
        int iMo10661k4 = C2107h4.f7286k4.mo10661k4(c);
        for (int i2 = 0; i2 < iMo10661k4; i2++) {
            String strMo10662k4 = C2107h4.f7286k4.mo10662k4(c, i2);
            if (m11454k4().m11585x1(strMo10662k4) && m11454k4().m11582k4(strMo10662k4) != 0) {
                return new C2319ub(strMo10662k4);
            }
        }
        return C2319ub.f8011k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String[] m11455kk() {
        if (this.f7977du == null) {
            synchronized (this.f7979h4) {
                try {
                    if (this.f7977du == null) {
                        this.f7977du = new String[391];
                        m11453to();
                    }
                } finally {
                }
            }
        }
        return this.f7977du;
    }

    /* JADX INFO: renamed from: x1 */
    public final C2343w2 m11456x1() {
        if (this.f7983to == null) {
            synchronized (this.f7982m9) {
                try {
                    if (this.f7983to == null) {
                        this.f7983to = new C2343w2();
                        for (int i = 0; i <= this.f7984x1.m11382k4().m11734du().m11210kk() + 390; i++) {
                            this.f7983to.m11583k4(m11452kk(i), i);
                        }
                    }
                } finally {
                }
            }
        }
        return this.f7983to;
    }

    /* JADX INFO: renamed from: k4 */
    public final C2343w2 m11454k4() {
        if (this.f7981kk == null) {
            synchronized (this.f7978dy) {
                try {
                    if (this.f7981kk == null) {
                        this.f7981kk = new C2343w2();
                        for (int i = 0; i < 256; i++) {
                            String strM11452kk = m11452kk(this.f7984x1.m11382k4().m11737jd().f8227x1[i] & 65535);
                            if (!this.f7981kk.m11585x1(strM11452kk)) {
                                this.f7981kk.m11584x1(strM11452kk, i);
                            }
                        }
                    }
                } finally {
                }
            }
        }
        return this.f7981kk;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2371xl
    /* JADX INFO: renamed from: k4 */
    public final void mo10988k4(int i, int i2) {
        throw new NotSupportedException();
    }
}
