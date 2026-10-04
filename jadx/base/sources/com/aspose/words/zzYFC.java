package com.aspose.words;

import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.InputDeviceCompat;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.logging.type.LogSeverity;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFC extends zzYHQ {
    private String zzXrZ;
    private int zzXs0;
    private int zzXs1;
    private int zzXs2;
    private int zzXs3;
    private int zzXs4;
    private int zzXs5;
    private int zzXs6;
    private int zzXs7;
    private int zzXs8;
    private boolean zzXs9;
    private boolean zzXsa;
    private String zzXsb;
    private String zzXsc;
    private ShapeBase zzZBi;
    private static char[] zzXsd = {'(', ')'};
    private static com.aspose.words.internal.zzZNR zzXrY = new com.aspose.words.internal.zzZNR("\\d+;\\d+;(\\w+)");
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("shapetype", "borderleftcolor", "borderrightcolor", "bordertopcolor", "borderbottomcolor", "posrelh", "posrelv", "posh", "posv", "fallowoverlap", "pcthoriz", "pctvert", "pcthorizpos", "pctvertpos", "sizerelh", "sizerelv", "fisbullet", "rotation", "ffliph", "frelfliph", "fflipv", "frelflipv", "wzname", "wzdescription", "dxwrapdistleft", "dxwrapdistright", "dywrapdisttop", "dywrapdistbottom", "fbehinddocument", "fisbutton", "fhidden", "farrowheadsok", "fdeleteattachedobject", "feditedwrap", "fhittestfill", "fhittestline", "fnofillhittest", "fnolinedrawdash", "foleicon", "fondblclicknotify", "foned", "fpreferrelativeresize", "fprint", "hspnext", "fscriptanchor", "wzscript", "wzscriptextattr", "scriptlang", "wzscriptlangattr", "flockrotation", "flockposition", "flockaspectratio", "flockagainstselect", "flockcropping", "flockverticies", "flocktext", "flockadjusthandles", "flockagainstgrouping", "flockshapetype", "dxtextleft", "dxtextright", "dytexttop", "dytextbottom", "wraptext", "anchortext", "txfltextflow", "cdirfont", "fautotextmargin", "scaletext", "ltxid", "frotatetext", "fselecttext", "ffitshapetotext", "ffittexttoshape", "gtextunicode", "gtextsize", "gtextspacing", "gtextfont", "fgtext", "gtextfvertical", "gtextfkern", "gtextftight", "gtextfstretch", "gtextfshrinkfit", "gtextfbestfit", "gtextfnormalize", "gtextfdxmeasure", "gtextfbold", "gtextfitalic", "gtextfunderline", "gtextfshadow", "gtextfsmallcaps", "gtextfstrikethrough", "gtextfreverserows", "gtextrtf", "geoleft", "geotop", "georight", "geobottom", "pverticies", "psegmentinfo", "cxk", "pconnectionsites", "shapepath", "padjusthandles", "pguides", "pinscribe", "adjustvalue", "adjust2value", "adjust3value", "adjust4value", "adjust5value", "adjust6value", "adjust7value", "adjust8value", "adjust9value", "adjust10value", "fgtextok", "ffillok", "ffillshadeshapeok", "flineok", "fshadowok", "f3dok", "xlimo", "ylimo", "lidregroup", "cropfromleft", "cropfromright", "cropfromtop", "cropfrombottom", "picturetransparent", "picturecontrast", "picturebrightness", "picturegamma", "picturegray", "picturebilevel", "pictureactive", "picturedblcrmod", "picturefillcrmod", "picturelinecrmod", "pictureid", "filltype", "fillcolor", "fillopacity", "fillbackcolor", "fillbackopacity", "fillblipname", "fillangle", "fillfocus", "filltoleft", "filltoright", "filltotop", "filltobottom", "fillshadecolors", "fillshadepreset", "fillshadetype", "filloriginx", "filloriginy", "fillshapeoriginx", "fillshapeoriginy", "ffilled", "fillcrmod", "filldztype", "fillshape", "filluserect", "frecolorfillaspicture", "fuseshapeanchor", "linecolor", "lineopacity", "linebackcolor", "linetype", "linefilldztype", "linewidth", "linestyle", "linedashing", "lineendcapstyle", "linejoinstyle", "linemiterlimit", "linefillblipname", "linefillwidth", "linefillheight", "fline", "linestartarrowhead", "lineendarrowhead", "linestartarrowwidth", "lineendarrowwidth", "linestartarrowlength", "lineendarrowlength", "shadowtype", "shadowcolor", "shadowhighlight", "shadowopacity", "shadowoffsetx", "shadowoffsety", "shadowsecondoffsetx", "shadowsecondoffsety", "shadowscalextox", "shadowscaleytox", "shadowscalextoy", "shadowscaleytoy", "shadowperspectivex", "shadowperspectivey", "shadowweight", "shadoworiginx", "shadoworiginy", "fshadow", "shadowcrmod", "fshadowobscured", "c3dspecularamt", "c3ddiffuseamt", "c3dshininess", "c3dedgethickness", "c3dextrudeforward", "c3dextrudebackward", "c3dextrusioncolor", "f3d", "fc3dmetallic", "c3dextrudeplane", "fc3duseextrusioncolor", "fc3dlightface", "c3dxrotationangle", "c3dyrotationangle", "c3drotationaxisx", "c3drotationaxisy", "c3drotationaxisz", "c3drotationangle", "fc3drotationcenterauto", "c3drotationcenterx", "c3drotationcentery", "c3drotationcenterz", "c3drendermode", "c3dxviewpoint", "c3dyviewpoint", "c3dzviewpoint", "c3doriginx", "c3doriginy", "c3dskewangle", "c3dskewamount", "c3dambientintensity", "c3dkeyx", "c3dkeyy", "c3dkeyz", "c3dkeyintensity", "c3dfillx", "c3dfilly", "c3dfillz", "c3dfillintensity", "fc3dparallel", "fc3dkeyharsh", "fc3dfillharsh", "c3dcrmod", "c3dtolerance", "fc3dconstrainrotation", "perspectiveoffsetx", "perspectiveoffsety", "perspectiveoriginx", "perspectiveoriginy", "perspectiveperspectivex", "perspectiveperspectivey", "perspectivescalextox", "perspectivescalextoy", "perspectivescaleytox", "perspectivescaleytoy", "perspectivetype", "perspectiveweight", "fperspective", "spcot", "dxycalloutgap", "spcoa", "spcod", "dxycalloutdropspecified", "dxycalloutlengthspecified", "fcallout", "fcalloutaccentbar", "fcallouttextborder", "fcalloutdropauto", "fcalloutlengthspecified", "fcalloutminusx", "fcalloutminusy", "cxstyle", "dgmt", "dgmtstyle", "prelationtbl", "dgmscalex", "dgmscaley", "dgmdefaultfontsize", "dgmconstrainbounds", "fdolayout", "fdoformat", "dgmlayout", "dgmnodekind", "freverse", "bwmode", "bwmodebw", "bwmodepurebw", "fhorizrule", "dxwidthhr", "dxheighthr", "alignhr", "fnoshadehr", "fstandardhr", "pcthr", "wztooltip", "flayoutincell", "groupleft", "groupright", "grouptop", "groupbottom", "relleft", "relright", "reltop", "relbottom", "pibflags", "pibname", "fpseudoinline", "pinkdata", "finkannotation", "frenderink", "wzsigsetupaddlxml", "fsigsetupallowcomments", "wzsigsetupid", "fissignatureline", "wzsigsetupprovid", "fsigsetupshowsigndate", "wzsigsetupsigninst", "wzsigsetupprovurl", "wzsigsetupsuggsigner", "wzsigsetupsuggsigner2", "wzsigsetupsuggsigneremail", "fsigsetupsigninstset", "pwrappolygonvertices", "fillcolorext", "fillbackcolorext", "linecolorext", "linebackcolorext", "fillcolorextmod", "fillbackcolorextmod", "linecolorextmod", "linebackcolorextmod", "fchangepage", "colstart", "colspan", "wzequationxml", "metroblob", "fbottomhittestline", "flefthittestline", "frighthittestline", "ftophittestline", "finitiator", "fnohittestpicture", "fbottomnolinedrawdash", "fleftnolinedrawdash", "ftopnolinedrawdash", "frightnolinedrawdash", "hspmaster", "fpolicylabel", "fpolicybarcode", "txdir", "ccol", "dzcolmargin", "finsetpen", "fleftinsetpen", "frightinsetpen", "ftopinsetpen", "fbottominsetpen", "finsetpenok", "fleftinsetpenok", "frightinsetpenok", "ftopinsetpenok", "fbottominsetpenok", "fcolumninsetpenok", "fbottomarrowheadsok", "fleftarrowheadsok", "frightarrowheadsok", "ftoparrowheadsok", "fborderlesscanvas", "fcolumnhittestline", "fnonstickyinkcanvas", "gtextalign", "pibprint", "pibprintflags", "pibprintname", "picturepreservegrays", "picturerecolor", "picturerecolorext", "picturerecolorextcmy", "picturerecolorextk", "picturerecolorextmod", "picturerecolorextwzname", "pconnectionsitesdir", "pfragments", "dhgt", "fcliptowrap", "flockagainstungrouping", "freallyhidden", "frelchangepage", "fuserdrawn", "tableproperties", "tablerowproperties", "wzapplet", "wzappletarg", "wzscriptidattr", "wzwebbot", "fillcolorextcmy", "fillcolorextk", "fillcolorextwzname", "fillbackcolorextcmy", "fillbackcolorextk", "fillbackcolorextwzname", "fillblipflags", "fillrectbottom", "fillrectleft", "fillrectright", "fillrecttop", "flinerecolorfillaspicture", "flineuseshapeanchor", "fcolumnline", "fcolumnlineok", "fbottomline", "fleftline", "frightline", "ftopline", "linecolorextcmy", "linecolorextk", "linebackcolorextcmy", "linebackcolorextk", "linefillblipflags", "linefillshape", "linecrmod", "linedashstyle", "linebottom", "linecolumn", "lineleft", "lineright", "linetop", "shadowcolorext", "shadowcolorextcmy", "shadowcolorextk", "shadowcolorextmod", "shadowhighlightext", "shadowhighlightextcmy", "shadowhighlightextk", "shadowhighlightextmod", "c3dextrusioncolorext", "c3dextrusioncolorextcmy", "c3dextrusioncolorextk", "c3dextrusioncolorextmod", "dgmlayoutmru", "pib", "fillblip", "linefillblip");

    public zzYFC(zzYFT zzyft, ShapeBase shapeBase) {
        super(zzyft);
        this.zzZBi = shapeBase;
    }

    private static int zzBK(String str) {
        int iZzZo = com.aspose.words.internal.zzJB.zzZo(str);
        if (iZzZo == Integer.MIN_VALUE) {
            return 0;
        }
        return iZzZo;
    }

    private com.aspose.words.internal.zzPV zzMW() {
        return zzY0E.zzhI(zzBK(this.zzXsb));
    }

    private void zzMx(String str) {
        zzY1Z.zzY(this.zzXw4.getWarningCallback(), 12, str, new Object[0]);
    }

    private int[] zzN2() {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(com.aspose.words.internal.zzZKN.zzTX(this.zzXsb), ';');
        int i = com.aspose.words.internal.zzJB.parseInt(strArrZzR[1]);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = com.aspose.words.internal.zzJB.parseInt(strArrZzR[i2 + 2]);
        }
        return iArr;
    }

    private int zzXc() {
        return zzBK(this.zzXsb);
    }

    private zzJW[] zzYfI() {
        zzYfN();
        zzYGY zzygy = new zzYGY(this.zzXsb);
        int iZzZ = zzZ(zzygy);
        zzJW[] zzjwArr = new zzJW[iZzZ];
        for (int i = 0; i < iZzZ; i++) {
            zzJW zzjw = new zzJW();
            zzjw.zzZj2 = zzygy.zzXc();
            zzjw.zzZj1 = zzygy.zzXc();
            zzjw.zzZj0 = zzygy.zzXc();
            zzjwArr[i] = zzjw;
        }
        return zzjwArr;
    }

    private zzZLE[] zzYfJ() {
        int[] iArrZzYfP = zzYfP();
        int length = iArrZzYfP.length / 2;
        zzZLE[] zzzleArr = new zzZLE[length];
        for (int i = 0; i < length; i++) {
            zzZLE zzzle = new zzZLE();
            int i2 = i * 2;
            zzzle.zzYuy = zzY0E.zzhI(iArrZzYfP[i2]);
            zzzle.zzZfb = iArrZzYfP[i2 + 1];
            zzzleArr[i] = zzzle;
        }
        return zzzleArr;
    }

    private zzYM4[] zzYfK() {
        zzYfN();
        zzYGY zzygy = new zzYGY(this.zzXsb);
        int iZzZ = zzZ(zzygy);
        zzYM4[] zzym4Arr = new zzYM4[iZzZ];
        for (int i = 0; i < iZzZ; i++) {
            zzYM4 zzym4 = new zzYM4();
            zzym4.zzXFj = zzZU1.zzEo(zzygy.zzXc());
            zzym4.zzXFi = zzZU1.zzEo(zzygy.zzXc());
            zzym4.zzXFh = zzZU1.zzEo(zzygy.zzXc());
            zzym4.zzXFg = zzZU1.zzEo(zzygy.zzXc());
            zzym4Arr[i] = zzym4;
        }
        return zzym4Arr;
    }

    private zzZLU[] zzYfL() {
        int[] iArrZzYfP = zzYfP();
        int length = iArrZzYfP.length / 2;
        zzZLU[] zzzluArr = new zzZLU[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int i3 = iArrZzYfP[i2];
            int i4 = iArrZzYfP[i2 + 1];
            zzZLU zzzlu = new zzZLU();
            zzzlu.zzYvt = i3 & 255;
            zzzlu.zzZjA = (i3 >> 8) & 255;
            zzzlu.zzYvs = (i3 >> 16) & 65535;
            zzzlu.zzYvr = i4 & 65535;
            zzzlu.zzYvq = (i4 >> 16) & 65535;
            zzzluArr[i] = zzzlu;
        }
        return zzzluArr;
    }

    private zzZL3[] zzYfM() {
        zzYfN();
        zzYGY zzygy = new zzYGY(this.zzXsb);
        int iZzZ = zzZ(zzygy);
        zzZL3[] zzzl3Arr = new zzZL3[iZzZ];
        for (int i = 0; i < iZzZ; i++) {
            zzZL3 zzzl3 = new zzZL3();
            int iZzXc = zzygy.zzXc();
            boolean z = true;
            zzzl3.zzYu8 = (iZzXc & 8192) != 0;
            zzzl3.zzYu7 = (iZzXc & 32) != 0;
            zzzl3.zzYu6 = (iZzXc & 16) != 0;
            zzzl3.zzYu5 = (iZzXc & 8) != 0;
            zzzl3.zzYu4 = (iZzXc & 4) != 0;
            zzzl3.zzYu2 = (iZzXc & 2) != 0;
            zzzl3.zzYu3 = (iZzXc & 1) != 0;
            zzzl3.zzYu1 = new zzZL1(zzygy.zzXc());
            zzzl3.zzYu0 = new zzZL1(zzygy.zzXc());
            zzzl3.zzYtZ = new zzYM2(zzygy.zzXc(), (iZzXc & 2048) != 0);
            zzzl3.zzYtY = new zzYM2(zzygy.zzXc(), (iZzXc & 4096) != 0);
            zzzl3.zzYtX = new zzYM2(zzygy.zzXc(), (iZzXc & 128) != 0);
            zzzl3.zzYtW = new zzYM2(zzygy.zzXc(), (iZzXc & 256) != 0);
            zzzl3.zzYtV = new zzYM2(zzygy.zzXc(), (iZzXc & 512) != 0);
            int iZzXc2 = zzygy.zzXc();
            if ((iZzXc & 1024) == 0) {
                z = false;
            }
            zzzl3.zzYtU = new zzYM2(iZzXc2, z);
            zzzl3Arr[i] = zzzl3;
        }
        return zzzl3Arr;
    }

    private void zzYfN() {
        this.zzXsb = zzXrY.zzUX(this.zzXsb).zzhJ().zzQx(1).getValue();
    }

    private zzYM5[] zzYfO() {
        int[] iArrZzYfP = zzYfP();
        int length = iArrZzYfP.length / 2;
        zzYM5[] zzym5Arr = new zzYM5[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            zzym5Arr[i] = new zzYM5(zzZU1.zzEo(iArrZzYfP[i2]), zzZU1.zzEo(iArrZzYfP[i2 + 1]));
        }
        return zzym5Arr;
    }

    private int[] zzYfP() {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(com.aspose.words.internal.zzZKN.zzTX(this.zzXsb), ';');
        int i = com.aspose.words.internal.zzJB.parseInt(strArrZzR[1]);
        int[] iArr = new int[i * 2];
        for (int i2 = 0; i2 < i; i2++) {
            String[] strArrZzR2 = com.aspose.words.internal.zzZKN.zzR(com.aspose.words.internal.zzZKN.zzV(strArrZzR[i2 + 2], zzXsd), ',');
            if (strArrZzR2.length < 2) {
                zzMx(com.aspose.words.internal.zzZKN.format("Invalid value '{0}' for '{1}' element.", this.zzXsb, this.zzXsc));
                return iArr;
            }
            int i3 = i2 * 2;
            iArr[i3] = zzBK(strArrZzR2[0]);
            iArr[i3 + 1] = zzBK(strArrZzR2[1]);
        }
        return iArr;
    }

    private zzYM6[] zzYfQ() {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(com.aspose.words.internal.zzZKN.zzTX(this.zzXsb), ';');
        int i = com.aspose.words.internal.zzJB.parseInt(strArrZzR[1]);
        zzYM6[] zzym6Arr = new zzYM6[i];
        for (int i2 = 0; i2 < i; i2++) {
            zzym6Arr[i2] = zzZTF.zzE8(com.aspose.words.internal.zzJB.parseInt(strArrZzR[i2 + 2]));
        }
        return zzym6Arr;
    }

    private boolean zzYfR() {
        return zzBK(this.zzXsb) != 0;
    }

    private zzYFW zzYfT() {
        switch (zzUR.zzTP(this.zzXsc)) {
            case 448:
                if (!this.zzZBi.zzZid()) {
                    this.zzZBi.setShapeType(75);
                }
                return new zzYFW(this.zzXw4, (Shape) this.zzZBi);
            case 449:
                return new zzYFW(this.zzXw4, (Shape) this.zzZBi, 4110);
            case 450:
                return new zzYFW(this.zzXw4, (Shape) this.zzZBi, 4111);
            default:
                return null;
        }
    }

    private void zzYfU() {
        zzYfV();
        this.zzXw4.zzYgo().zzZP();
    }

    private void zzYfV() {
        switch (zzUR.zzTP(this.zzXsc)) {
            case 0:
                if (!this.zzZBi.zzZid() && !this.zzZBi.isGroup()) {
                    this.zzZBi.setShapeType(zzXc());
                    break;
                }
                break;
            case 1:
                zzYvW().zzQ(924, zzMW());
                break;
            case 2:
                zzYvW().zzQ(926, zzMW());
                break;
            case 3:
                zzYvW().zzQ(923, zzMW());
                break;
            case 4:
                zzYvW().zzQ(925, zzMW());
                break;
            case 5:
                zzYvW().zzQ(912, Integer.valueOf(zzXc()));
                break;
            case 6:
                zzYvW().zzQ(914, Integer.valueOf(zzXc()));
                break;
            case 7:
                zzYvW().zzQ(911, Integer.valueOf(zzXc()));
                break;
            case 8:
                zzYvW().zzQ(913, Integer.valueOf(zzXc()));
                break;
            case 9:
                zzYvW().zzQ(950, Boolean.valueOf(zzYfR()));
                break;
            case 10:
                zzYvW().zzQ(1984, Integer.valueOf(zzXc()));
                break;
            case 11:
                zzYvW().zzQ(1985, Integer.valueOf(zzXc()));
                break;
            case 12:
                zzYvW().zzQ(1986, Integer.valueOf(zzXc()));
                break;
            case 13:
                zzYvW().zzQ(1987, Integer.valueOf(zzXc()));
                break;
            case 14:
                zzYvW().zzQ(1988, Integer.valueOf(zzXc()));
                break;
            case 15:
                zzYvW().zzQ(1989, Integer.valueOf(zzXc()));
                break;
            case 16:
                boolean zZzYfR = zzYfR();
                if (this.zzXw4.zzYgr() && zZzYfR) {
                    zzYvW().zzQ(945, Boolean.valueOf(zZzYfR));
                    break;
                }
                break;
            case 17:
                zzYvW().zzQ(4, Integer.valueOf(zzXc()));
                break;
            case 18:
            case 19:
                this.zzXsa = zzYfR();
                break;
            case 20:
            case 21:
                this.zzXs9 = zzYfR();
                break;
            case 22:
                zzYvW().zzQ(896, this.zzXsb);
                break;
            case 23:
                zzYvW().zzP(897, this.zzXsb);
                break;
            case 24:
                zzYvW().zzQ(SQLitePersistence.MAX_ARGS, Integer.valueOf(zzXc()));
                break;
            case 25:
                zzYvW().zzQ(902, Integer.valueOf(zzXc()));
                break;
            case 26:
                zzYvW().zzQ(901, Integer.valueOf(zzXc()));
                break;
            case 27:
                zzYvW().zzQ(903, Integer.valueOf(zzXc()));
                break;
            case 28:
                zzYvW().zzQ(954, Boolean.valueOf(zzYfR()));
                break;
            case 29:
                zzYvW().zzQ(956, Boolean.valueOf(zzYfR()));
                break;
            case 30:
                zzYvW().zzQ(958, Boolean.valueOf(zzYfR()));
                break;
            case 31:
                zzYvW().zzQ(507, Boolean.valueOf(zzYfR()));
                break;
            case 32:
                zzYvW().zzQ(830, Boolean.valueOf(zzYfR()));
                break;
            case 33:
                zzYvW().zzQ(953, Boolean.valueOf(zzYfR()));
                break;
            case 34:
                zzYvW().zzQ(444, Boolean.valueOf(zzYfR()));
                break;
            case 35:
                zzYvW().zzQ(509, Boolean.valueOf(zzYfR()));
                break;
            case 36:
                zzYvW().zzQ(447, Boolean.valueOf(zzYfR()));
                break;
            case 37:
                zzYvW().zzQ(FrameMetricsAggregator.EVERY_DURATION, Boolean.valueOf(zzYfR()));
                break;
            case 38:
                zzYvW().zzQ(826, Boolean.valueOf(zzYfR()));
                break;
            case 39:
                zzYvW().zzQ(955, Boolean.valueOf(zzYfR()));
                break;
            case 40:
                zzYvW().zzQ(957, Boolean.valueOf(zzYfR()));
                break;
            case 41:
                zzYvW().zzQ(827, Boolean.valueOf(zzYfR()));
                break;
            case 42:
                zzYvW().zzQ(959, Boolean.valueOf(zzYfR()));
                break;
            case 43:
                zzYvW().zzQ(138, Integer.valueOf(zzXc()));
                break;
            case 44:
                zzYvW().zzQ(952, Boolean.valueOf(zzYfR()));
                break;
            case 45:
                zzYvW().zzQ(910, this.zzXsb);
                break;
            case 46:
                zzYvW().zzQ(919, this.zzXsb);
                break;
            case 47:
                zzYvW().zzQ(920, Integer.valueOf(zzXc()));
                break;
            case 48:
                zzYvW().zzQ(922, this.zzXsb);
                break;
            case 49:
                zzYvW().zzQ(119, Boolean.valueOf(zzYfR()));
                break;
            case 50:
                zzYvW().zzQ(121, Boolean.valueOf(zzYfR()));
                break;
            case 51:
                zzYvW().zzQ(120, Boolean.valueOf(zzYfR()));
                break;
            case 52:
                zzYvW().zzQ(122, Boolean.valueOf(zzYfR()));
                break;
            case 53:
                zzYvW().zzQ(123, Boolean.valueOf(zzYfR()));
                break;
            case 54:
                zzYvW().zzQ(124, Boolean.valueOf(zzYfR()));
                break;
            case 55:
                zzYvW().zzQ(125, Boolean.valueOf(zzYfR()));
                break;
            case 56:
                zzYvW().zzQ(126, Boolean.valueOf(zzYfR()));
                break;
            case 57:
                zzYvW().zzQ(127, Boolean.valueOf(zzYfR()));
                break;
            case 58:
                zzYvW().zzQ(828, Boolean.valueOf(zzYfR()));
                break;
            case 59:
                zzYvW().zzQ(129, Integer.valueOf(zzXc()));
                break;
            case 60:
                zzYvW().zzQ(131, Integer.valueOf(zzXc()));
                break;
            case 61:
                zzYvW().zzQ(130, Integer.valueOf(zzXc()));
                break;
            case 62:
                zzYvW().zzQ(132, Integer.valueOf(zzXc()));
                break;
            case 63:
                zzYvW().zzQ(133, Integer.valueOf(zzXc()));
                break;
            case 64:
                zzYvW().zzQ(135, Integer.valueOf(zzXc()));
                break;
            case 65:
                zzYvW().zzQ(136, Integer.valueOf(zzXc()));
                break;
            case 66:
                zzYvW().zzQ(137, Integer.valueOf(zzXc()));
                break;
            case 67:
                zzYvW().zzQ(188, Boolean.valueOf(zzYfR()));
                break;
            case 68:
                zzYvW().zzQ(134, Integer.valueOf(zzXc()));
                break;
            case 69:
                zzYvW().zzQ(128, Integer.valueOf(zzXc()));
                break;
            case 70:
                zzYvW().zzQ(189, Boolean.valueOf(zzYfR()));
                break;
            case 71:
                zzYvW().zzQ(187, Boolean.valueOf(zzYfR()));
                break;
            case 72:
                zzYvW().zzQ(190, Boolean.valueOf(zzYfR()));
                break;
            case 73:
                zzYvW().zzQ(191, Boolean.valueOf(zzYfR()));
                break;
            case 74:
                zzYvW().zzQ(192, this.zzXsb);
                break;
            case 75:
                zzYvW().zzQ(195, Integer.valueOf(zzXc()));
                break;
            case 76:
                zzYvW().zzQ(196, Integer.valueOf(zzXc()));
                break;
            case 77:
                zzYvW().zzQ(197, this.zzXsb);
                break;
            case 78:
                zzYvW().zzQ(241, Boolean.valueOf(zzYfR()));
                break;
            case 79:
                zzYvW().zzQ(242, Boolean.valueOf(zzYfR()));
                break;
            case 80:
                zzYvW().zzQ(243, Boolean.valueOf(zzYfR()));
                break;
            case 81:
                zzYvW().zzQ(244, Boolean.valueOf(zzYfR()));
                break;
            case 82:
                zzYvW().zzQ(245, Boolean.valueOf(zzYfR()));
                break;
            case 83:
                zzYvW().zzQ(246, Boolean.valueOf(zzYfR()));
                break;
            case 84:
                zzYvW().zzQ(StyleIdentifier.LIGHT_LIST_ACCENT_6, Boolean.valueOf(zzYfR()));
                break;
            case 85:
                zzYvW().zzQ(StyleIdentifier.LIGHT_GRID_ACCENT_6, Boolean.valueOf(zzYfR()));
                break;
            case 86:
                zzYvW().zzQ(StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6, Boolean.valueOf(zzYfR()));
                break;
            case 87:
                zzYvW().zzQ(250, Boolean.valueOf(zzYfR()));
                break;
            case 88:
                zzYvW().zzQ(StyleIdentifier.MEDIUM_LIST_1_ACCENT_6, Boolean.valueOf(zzYfR()));
                break;
            case 89:
                zzYvW().zzQ(StyleIdentifier.MEDIUM_LIST_2_ACCENT_6, Boolean.valueOf(zzYfR()));
                break;
            case 90:
                zzYvW().zzQ(StyleIdentifier.MEDIUM_GRID_1_ACCENT_6, Boolean.valueOf(zzYfR()));
                break;
            case 91:
                zzYvW().zzQ(StyleIdentifier.MEDIUM_GRID_2_ACCENT_6, Boolean.valueOf(zzYfR()));
                break;
            case 92:
                zzYvW().zzQ(255, Boolean.valueOf(zzYfR()));
                break;
            case 93:
                zzYvW().zzQ(240, Boolean.valueOf(zzYfR()));
                break;
            case 94:
                zzYvW().zzQ(193, Boolean.valueOf(zzYfR()));
                break;
            case 95:
                this.zzZBi.zzHw(zzXc());
                if (zzYvW().zzVE(4127)) {
                    ShapeBase shapeBase = this.zzZBi;
                    shapeBase.zzHD(shapeBase.zzZyj() - this.zzZBi.zzZyh());
                }
                break;
            case 96:
                this.zzZBi.zzHv(zzXc());
                if (zzYvW().zzVE(4128)) {
                    ShapeBase shapeBase2 = this.zzZBi;
                    shapeBase2.zzHC(shapeBase2.zzZyi() - this.zzZBi.zzZyg());
                }
                break;
            case 97:
                this.zzZBi.zzHD(zzXc() - this.zzZBi.zzZyh());
                break;
            case 98:
                this.zzZBi.zzHC(zzXc() - this.zzZBi.zzZyg());
                break;
            case 99:
                zzYvW().zzQ(StyleIdentifier.LIST_TABLE_4, zzYfO());
                break;
            case 100:
                zzYvW().zzQ(StyleIdentifier.LIST_TABLE_5_DARK, zzYfQ());
                break;
            case 101:
                zzYvW().zzQ(StyleIdentifier.LIST_TABLE_2_ACCENT_3, Integer.valueOf(zzXc()));
                break;
            case 102:
                zzYvW().zzQ(StyleIdentifier.LIST_TABLE_2_ACCENT_2, zzYfO());
                break;
            case 103:
                zzYvW().zzQ(StyleIdentifier.LIST_TABLE_3, Integer.valueOf(zzXc()));
                break;
            case 104:
                zzYvW().zzQ(StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_2, zzYfM());
                break;
            case 105:
                zzYvW().zzQ(StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2, zzYfL());
                break;
            case 106:
                zzYvW().zzQ(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3, zzYfK());
                break;
            case 107:
                zzYvW().zzQ(StyleIdentifier.LIST_TABLE_6_COLORFUL, Integer.valueOf(zzXc()));
                break;
            case 108:
                zzYvW().zzQ(StyleIdentifier.LIST_TABLE_7_COLORFUL, Integer.valueOf(zzXc()));
                break;
            case 109:
                zzYvW().zzQ(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_1, Integer.valueOf(zzXc()));
                break;
            case 110:
                zzYvW().zzQ(StyleIdentifier.LIST_TABLE_2_ACCENT_1, Integer.valueOf(zzXc()));
                break;
            case 111:
                zzYvW().zzQ(StyleIdentifier.LIST_TABLE_3_ACCENT_1, Integer.valueOf(zzXc()));
                break;
            case 112:
                zzYvW().zzQ(StyleIdentifier.LIST_TABLE_4_ACCENT_1, Integer.valueOf(zzXc()));
                break;
            case 113:
                zzYvW().zzQ(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_1, Integer.valueOf(zzXc()));
                break;
            case 114:
                zzYvW().zzQ(StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_1, Integer.valueOf(zzXc()));
                break;
            case 115:
                zzYvW().zzQ(StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_1, Integer.valueOf(zzXc()));
                break;
            case 116:
                zzYvW().zzQ(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_2, Integer.valueOf(zzXc()));
                break;
            case 117:
                zzYvW().zzQ(381, Boolean.valueOf(zzYfR()));
                break;
            case 118:
                zzYvW().zzQ(383, Boolean.valueOf(zzYfR()));
                break;
            case 119:
                zzYvW().zzQ(382, Boolean.valueOf(zzYfR()));
                break;
            case 120:
                zzYvW().zzQ(380, Boolean.valueOf(zzYfR()));
                break;
            case 121:
                zzYvW().zzQ(StyleIdentifier.length, Boolean.valueOf(zzYfR()));
                break;
            case 122:
                zzYvW().zzQ(379, Boolean.valueOf(zzYfR()));
                break;
            case 123:
                zzYvW().zzQ(StyleIdentifier.LIST_TABLE_4_ACCENT_2, Integer.valueOf(zzXc()));
                break;
            case 124:
                zzYvW().zzQ(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, Integer.valueOf(zzXc()));
                break;
            case 125:
                zzYvW().zzQ(904, Integer.valueOf(zzXc()));
                break;
            case 126:
                zzYvW().zzQ(StyleIdentifier.COLORFUL_LIST_ACCENT_6, Integer.valueOf(zzXc()));
                break;
            case 127:
                zzYvW().zzQ(StyleIdentifier.COLORFUL_GRID_ACCENT_6, Integer.valueOf(zzXc()));
                break;
            case 128:
                zzYvW().zzQ(256, Integer.valueOf(zzXc()));
                break;
            case 129:
                zzYvW().zzQ(257, Integer.valueOf(zzXc()));
                break;
            case 130:
                zzYvW().zzQ(StyleIdentifier.INTENSE_REFERENCE, zzMW());
                break;
            case 131:
                zzYvW().zzQ(StyleIdentifier.BOOK_TITLE, Integer.valueOf(zzXc()));
                break;
            case 132:
                zzYvW().zzQ(StyleIdentifier.BIBLIOGRAPHY, Integer.valueOf(zzXc()));
                break;
            case 133:
                zzYvW().zzQ(StyleIdentifier.TOC_HEADING, Integer.valueOf(zzXc()));
                break;
            case 134:
                zzYvW().zzQ(StyleIdentifier.GRID_TABLE_3_ACCENT_6, Boolean.valueOf(zzYfR()));
                break;
            case 135:
                zzYvW().zzQ(StyleIdentifier.GRID_TABLE_4_ACCENT_6, Boolean.valueOf(zzYfR()));
                break;
            case 136:
                zzYvW().zzQ(StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6, Boolean.valueOf(zzYfR()));
                break;
            case 137:
                zzYvW().zzQ(StyleIdentifier.PLAIN_TABLE_2, zzMW());
                break;
            case 138:
                zzYvW().zzQ(StyleIdentifier.PLAIN_TABLE_3, zzMW());
                break;
            case 139:
                zzYvW().zzQ(270, zzMW());
                break;
            case 140:
                zzYvW().zzQ(StyleIdentifier.PLAIN_TABLE_1, Integer.valueOf(zzXc()));
                break;
            case 141:
                zzYvW().zzQ(384, Integer.valueOf(zzXc()));
                break;
            case 142:
                zzYvW().zzQ(385, zzMW());
                break;
            case 143:
                zzYvW().zzQ(386, Integer.valueOf(zzXc()));
                break;
            case 144:
                zzYvW().zzQ(387, zzMW());
                break;
            case 145:
                zzYvW().zzQ(388, Integer.valueOf(zzXc()));
                break;
            case 146:
                zzYvW().zzQ(391, this.zzXsb);
                break;
            case 147:
                zzYvW().zzQ(395, Integer.valueOf(zzXc()));
                break;
            case 148:
                zzYvW().zzQ(396, Integer.valueOf(zzXc()));
                break;
            case 149:
                zzYvW().zzQ(397, Integer.valueOf(zzXc()));
                break;
            case 150:
                zzYvW().zzQ(399, Integer.valueOf(zzXc()));
                break;
            case 151:
                zzYvW().zzQ(398, Integer.valueOf(zzXc()));
                break;
            case 152:
                zzYvW().zzQ(400, Integer.valueOf(zzXc()));
                break;
            case 153:
                zzYvW().zzQ(407, zzYfJ());
                break;
            case 154:
            case StyleIdentifier.GRID_TABLE_3_ACCENT_6 /* 317 */:
                break;
            case 155:
                zzYvW().zzQ(412, Integer.valueOf(zzXc()));
                break;
            case 156:
                zzYvW().zzQ(408, Integer.valueOf(zzXc()));
                break;
            case 157:
                zzYvW().zzQ(409, Integer.valueOf(zzXc()));
                break;
            case 158:
                zzYvW().zzQ(410, Integer.valueOf(zzXc()));
                break;
            case 159:
                zzYvW().zzQ(411, Integer.valueOf(zzXc()));
                break;
            case 160:
                zzYvW().zzQ(443, Boolean.valueOf(zzYfR()));
                break;
            case 161:
                zzYvW().zzQ(389, Integer.valueOf(zzXc()));
                break;
            case 162:
                zzYvW().zzQ(405, Integer.valueOf(zzXc()));
                break;
            case 163:
                zzYvW().zzQ(445, Boolean.valueOf(zzYfR()));
                break;
            case 164:
                zzYvW().zzQ(446, Boolean.valueOf(zzYfR()));
                break;
            case 165:
                zzYvW().zzQ(441, Boolean.valueOf(zzYfR()));
                break;
            case 166:
                zzYvW().zzQ(442, Boolean.valueOf(zzYfR()));
                break;
            case 167:
                zzYvW().zzQ(448, zzMW());
                break;
            case 168:
                zzYvW().zzQ(449, Integer.valueOf(zzXc()));
                break;
            case 169:
                zzYvW().zzQ(450, zzMW());
                break;
            case 170:
                zzYvW().zzQ(452, Integer.valueOf(zzXc()));
                break;
            case 171:
                zzYvW().zzQ(458, Integer.valueOf(zzXc()));
                break;
            case 172:
                zzYvW().zzQ(459, Integer.valueOf(zzXc()));
                break;
            case 173:
                zzYvW().zzQ(461, Integer.valueOf(zzXc()));
                break;
            case 174:
                zzYvW().zzQ(462, Integer.valueOf(zzXc()));
                break;
            case 175:
                zzYvW().zzQ(471, Integer.valueOf(zzXc()));
                break;
            case 176:
                zzYvW().zzQ(470, Integer.valueOf(zzXc()));
                break;
            case 177:
                zzYvW().zzQ(460, Integer.valueOf(zzXc()));
                break;
            case 178:
                zzYvW().zzQ(454, this.zzXsb);
                break;
            case 179:
                zzYvW().zzQ(456, Integer.valueOf(zzXc()));
                break;
            case 180:
                zzYvW().zzQ(457, Integer.valueOf(zzXc()));
                break;
            case 181:
                zzYvW().zzQ(508, Boolean.valueOf(zzYfR()));
                break;
            case 182:
                zzYvW().zzQ(464, Integer.valueOf(zzXc()));
                break;
            case 183:
                zzYvW().zzQ(465, Integer.valueOf(zzXc()));
                break;
            case 184:
                zzYvW().zzQ(466, Integer.valueOf(zzXc()));
                break;
            case 185:
                zzYvW().zzQ(468, Integer.valueOf(zzXc()));
                break;
            case 186:
                zzYvW().zzQ(467, Integer.valueOf(zzXc()));
                break;
            case 187:
                zzYvW().zzQ(469, Integer.valueOf(zzXc()));
                break;
            case 188:
                zzYvW().zzQ(512, Integer.valueOf(zzXc()));
                break;
            case 189:
                zzYvW().zzQ(InputDeviceCompat.SOURCE_DPAD, zzMW());
                break;
            case 190:
                zzYvW().zzQ(514, zzMW());
                break;
            case 191:
                zzYvW().zzQ(516, Integer.valueOf(zzXc()));
                break;
            case 192:
                zzYvW().zzQ(517, Integer.valueOf(zzXc()));
                break;
            case 193:
                zzYvW().zzQ(518, Integer.valueOf(zzXc()));
                break;
            case 194:
                zzYvW().zzQ(519, Integer.valueOf(zzXc()));
                break;
            case 195:
                zzYvW().zzQ(520, Integer.valueOf(zzXc()));
                break;
            case 196:
                zzYvW().zzQ(521, Integer.valueOf(zzXc()));
                break;
            case 197:
                zzYvW().zzQ(522, Integer.valueOf(zzXc()));
                break;
            case 198:
                zzYvW().zzQ(523, Integer.valueOf(zzXc()));
                break;
            case 199:
                zzYvW().zzQ(524, Integer.valueOf(zzXc()));
                break;
            case 200:
                zzYvW().zzQ(525, Integer.valueOf(zzXc()));
                break;
            case 201:
                zzYvW().zzQ(526, Integer.valueOf(zzXc()));
                break;
            case 202:
                zzYvW().zzQ(527, Integer.valueOf(zzXc()));
                break;
            case 203:
                zzYvW().zzQ(528, Integer.valueOf(zzXc()));
                break;
            case 204:
                zzYvW().zzQ(529, Integer.valueOf(zzXc()));
                break;
            case 205:
                zzYvW().zzQ(574, Boolean.valueOf(zzYfR()));
                break;
            case 206:
                zzYvW().zzQ(515, Integer.valueOf(zzXc()));
                break;
            case 207:
                zzYvW().zzQ(575, Boolean.valueOf(zzYfR()));
                break;
            case 208:
                zzYvW().zzQ(640, Integer.valueOf(zzXc()));
                break;
            case 209:
                zzYvW().zzQ(641, Integer.valueOf(zzXc()));
                break;
            case 210:
                zzYvW().zzQ(642, Integer.valueOf(zzXc()));
                break;
            case 211:
                zzYvW().zzQ(643, Integer.valueOf(zzXc()));
                break;
            case 212:
                zzYvW().zzQ(644, Integer.valueOf(zzXc()));
                break;
            case 213:
                zzYvW().zzQ(645, Integer.valueOf(zzXc()));
                break;
            case 214:
                zzYvW().zzQ(647, zzMW());
                break;
            case 215:
                zzYvW().zzQ(LogSeverity.ALERT_VALUE, Boolean.valueOf(zzYfR()));
                break;
            case 216:
                zzYvW().zzQ(701, Boolean.valueOf(zzYfR()));
                break;
            case 217:
                zzYvW().zzQ(646, Integer.valueOf(zzXc()));
                break;
            case 218:
                zzYvW().zzQ(702, Boolean.valueOf(zzYfR()));
                break;
            case 219:
                zzYvW().zzQ(703, Boolean.valueOf(zzYfR()));
                break;
            case 220:
                zzYvW().zzQ(705, Integer.valueOf(zzXc()));
                break;
            case 221:
                zzYvW().zzQ(704, Integer.valueOf(zzXc()));
                break;
            case 222:
                zzYvW().zzQ(706, Integer.valueOf(zzXc()));
                break;
            case 223:
                zzYvW().zzQ(707, Integer.valueOf(zzXc()));
                break;
            case 224:
                zzYvW().zzQ(708, Integer.valueOf(zzXc()));
                break;
            case 225:
                zzYvW().zzQ(709, Integer.valueOf(zzXc()));
                break;
            case 226:
                zzYvW().zzQ(764, Boolean.valueOf(zzYfR()));
                break;
            case 227:
                zzYvW().zzQ(710, Integer.valueOf(zzXc()));
                break;
            case 228:
                zzYvW().zzQ(711, Integer.valueOf(zzXc()));
                break;
            case 229:
                zzYvW().zzQ(712, Integer.valueOf(zzXc()));
                break;
            case 230:
                zzYvW().zzQ(713, Integer.valueOf(zzXc()));
                break;
            case 231:
                zzYvW().zzQ(715, Integer.valueOf(zzXc()));
                break;
            case 232:
                zzYvW().zzQ(716, Integer.valueOf(zzXc()));
                break;
            case 233:
                zzYvW().zzQ(717, Integer.valueOf(zzXc()));
                break;
            case 234:
                zzYvW().zzQ(718, Integer.valueOf(zzXc()));
                break;
            case 235:
                zzYvW().zzQ(719, Integer.valueOf(zzXc()));
                break;
            case 236:
                zzYvW().zzQ(720, Integer.valueOf(zzXc()));
                break;
            case 237:
                zzYvW().zzQ(721, Integer.valueOf(zzXc()));
                break;
            case 238:
                zzYvW().zzQ(722, Integer.valueOf(zzXc()));
                break;
            case 239:
                zzYvW().zzQ(723, Integer.valueOf(zzXc()));
                break;
            case 240:
                zzYvW().zzQ(724, Integer.valueOf(zzXc()));
                break;
            case 241:
                zzYvW().zzQ(725, Integer.valueOf(zzXc()));
                break;
            case 242:
                zzYvW().zzQ(726, Integer.valueOf(zzXc()));
                break;
            case 243:
                zzYvW().zzQ(727, Integer.valueOf(zzXc()));
                break;
            case 244:
                zzYvW().zzQ(728, Integer.valueOf(zzXc()));
                break;
            case 245:
                zzYvW().zzQ(729, Integer.valueOf(zzXc()));
                break;
            case 246:
                zzYvW().zzQ(730, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.LIGHT_LIST_ACCENT_6 /* 247 */:
                zzYvW().zzQ(765, Boolean.valueOf(zzYfR()));
                break;
            case StyleIdentifier.LIGHT_GRID_ACCENT_6 /* 248 */:
                zzYvW().zzQ(766, Boolean.valueOf(zzYfR()));
                break;
            case StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6 /* 249 */:
                zzYvW().zzQ(767, Boolean.valueOf(zzYfR()));
                break;
            case 250:
                zzYvW().zzQ(648, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.MEDIUM_LIST_1_ACCENT_6 /* 251 */:
                zzYvW().zzQ(714, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.MEDIUM_LIST_2_ACCENT_6 /* 252 */:
                zzYvW().zzQ(763, Boolean.valueOf(zzYfR()));
                break;
            case StyleIdentifier.MEDIUM_GRID_1_ACCENT_6 /* 253 */:
                zzYvW().zzQ(577, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.MEDIUM_GRID_2_ACCENT_6 /* 254 */:
                zzYvW().zzQ(578, Integer.valueOf(zzXc()));
                break;
            case 255:
                zzYvW().zzQ(586, Integer.valueOf(zzXc()));
                break;
            case 256:
                zzYvW().zzQ(587, Integer.valueOf(zzXc()));
                break;
            case 257:
                zzYvW().zzQ(583, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
                zzYvW().zzQ(584, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.COLORFUL_GRID_ACCENT_6 /* 259 */:
                zzYvW().zzQ(579, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
                zzYvW().zzQ(581, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.INTENSE_EMPHASIS /* 261 */:
                zzYvW().zzQ(580, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.SUBTLE_REFERENCE /* 262 */:
                zzYvW().zzQ(582, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.INTENSE_REFERENCE /* 263 */:
                zzYvW().zzQ(576, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.BOOK_TITLE /* 264 */:
                zzYvW().zzQ(585, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.BIBLIOGRAPHY /* 265 */:
                zzYvW().zzQ(639, Boolean.valueOf(zzYfR()));
                break;
            case StyleIdentifier.TOC_HEADING /* 266 */:
                zzYvW().zzQ(832, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.PLAIN_TABLE_1 /* 267 */:
                zzYvW().zzQ(833, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.PLAIN_TABLE_2 /* 268 */:
                zzYvW().zzQ(834, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.PLAIN_TABLE_3 /* 269 */:
                zzYvW().zzQ(835, Integer.valueOf(zzXc()));
                break;
            case 270:
                zzYvW().zzQ(836, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.PLAIN_TABLE_5 /* 271 */:
                zzYvW().zzQ(837, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.TABLE_GRID_LIGHT /* 272 */:
                zzYvW().zzQ(889, Boolean.valueOf(zzYfR()));
                break;
            case StyleIdentifier.GRID_TABLE_1_LIGHT /* 273 */:
                zzYvW().zzQ(890, Boolean.valueOf(zzYfR()));
                break;
            case StyleIdentifier.GRID_TABLE_2 /* 274 */:
                zzYvW().zzQ(891, Boolean.valueOf(zzYfR()));
                break;
            case StyleIdentifier.GRID_TABLE_3 /* 275 */:
                zzYvW().zzQ(894, Boolean.valueOf(zzYfR()));
                break;
            case StyleIdentifier.GRID_TABLE_4 /* 276 */:
                zzYvW().zzQ(895, Boolean.valueOf(zzYfR()));
                break;
            case StyleIdentifier.GRID_TABLE_5_DARK /* 277 */:
                zzYvW().zzQ(892, Boolean.valueOf(zzYfR()));
                break;
            case StyleIdentifier.GRID_TABLE_6_COLORFUL /* 278 */:
                zzYvW().zzQ(893, Boolean.valueOf(zzYfR()));
                break;
            case StyleIdentifier.GRID_TABLE_7_COLORFUL /* 279 */:
                zzYvW().zzQ(771, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_1 /* 280 */:
                zzYvW().zzQ(1280, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.GRID_TABLE_2_ACCENT_1 /* 281 */:
                zzYvW().zzQ(1281, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.GRID_TABLE_3_ACCENT_1 /* 282 */:
                zzYvW().zzQ(1284, zzYfI());
                break;
            case StyleIdentifier.GRID_TABLE_4_ACCENT_1 /* 283 */:
                zzYvW().zzQ(1285, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_1 /* 284 */:
                zzYvW().zzQ(1286, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_1 /* 285 */:
                zzYvW().zzQ(1287, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_1 /* 286 */:
                zzYvW().zzQ(1288, zzN2());
                break;
            case StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_2 /* 287 */:
                zzYvW().zzQ(1342, Boolean.valueOf(zzYfR()));
                break;
            case StyleIdentifier.GRID_TABLE_2_ACCENT_2 /* 288 */:
                zzYvW().zzQ(1340, Boolean.valueOf(zzYfR()));
                break;
            case StyleIdentifier.GRID_TABLE_3_ACCENT_2 /* 289 */:
                zzYvW().zzQ(777, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.GRID_TABLE_4_ACCENT_2 /* 290 */:
                zzYvW().zzQ(778, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_2 /* 291 */:
                zzYvW().zzQ(1341, Boolean.valueOf(zzYfR()));
                break;
            case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_2 /* 292 */:
                zzYvW().zzQ(772, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_2 /* 293 */:
                zzYvW().zzQ(774, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_3 /* 294 */:
                zzYvW().zzQ(773, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.GRID_TABLE_2_ACCENT_3 /* 295 */:
                zzYvW().zzQ(948, Boolean.valueOf(zzYfR()));
                break;
            case StyleIdentifier.GRID_TABLE_3_ACCENT_3 /* 296 */:
                this.zzZBi.zzWf(com.aspose.words.internal.zzSA.zzYE(zzXc()));
                break;
            case StyleIdentifier.GRID_TABLE_4_ACCENT_3 /* 297 */:
                zzYvW().zzQ(917, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_3 /* 298 */:
                zzYvW().zzQ(916, Integer.valueOf(zzXc()));
                break;
            case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_3 /* 299 */:
                zzYvW().zzQ(947, Boolean.valueOf(zzYfR()));
                break;
            case 300:
                zzYvW().zzQ(946, Boolean.valueOf(zzYfR()));
                break;
            case 301:
                zzYvW().zzQ(915, Integer.valueOf(zzXc()));
                break;
            case 302:
                zzYvW().zzQ(909, this.zzXsb);
                break;
            case 303:
                zzYvW().zzQ(944, Boolean.valueOf(zzYfR()));
                break;
            case 304:
                this.zzXs8 = zzXc();
                break;
            case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4 /* 305 */:
                this.zzXs7 = zzXc();
                break;
            case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_4 /* 306 */:
                this.zzXs6 = zzXc();
                break;
            case 307:
                this.zzXs5 = zzXc();
                break;
            case 308:
                this.zzXs4 = zzXc();
                break;
            case StyleIdentifier.GRID_TABLE_2_ACCENT_5 /* 309 */:
                this.zzXs3 = zzXc();
                break;
            case StyleIdentifier.GRID_TABLE_3_ACCENT_5 /* 310 */:
                this.zzXs2 = zzXc();
                break;
            case StyleIdentifier.GRID_TABLE_4_ACCENT_5 /* 311 */:
                this.zzXs1 = zzXc();
                break;
            case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_5 /* 312 */:
                this.zzXs0 = zzXc();
                break;
            case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5 /* 313 */:
                this.zzXrZ = this.zzXsb;
                break;
            case StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_5 /* 314 */:
                zzYvW().zzQ(1343, Boolean.TRUE);
                break;
            case 315:
                zzYvW().zzQ(1792, new zzYGY(this.zzXsb).readBytes());
                break;
            case StyleIdentifier.GRID_TABLE_2_ACCENT_6 /* 316 */:
                zzYvW().zzQ(1855, Boolean.valueOf(zzYfR()));
                break;
            case StyleIdentifier.GRID_TABLE_4_ACCENT_6 /* 318 */:
                zzYvW().zzQ(1927, this.zzXsb);
                break;
            case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6 /* 319 */:
                zzYvW().zzQ(1981, Boolean.valueOf(zzYfR()));
                break;
            case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6 /* 320 */:
                zzYvW().zzQ(1921, this.zzXsb);
                break;
            case StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_6 /* 321 */:
                zzYvW().zzQ(1983, Boolean.valueOf(zzYfR()));
                break;
            case StyleIdentifier.LIST_TABLE_1_LIGHT /* 322 */:
                zzYvW().zzQ(1922, this.zzXsb);
                break;
            case StyleIdentifier.LIST_TABLE_2 /* 323 */:
                zzYvW().zzQ(FieldType.FIELD_CITATION, Boolean.valueOf(zzYfR()));
                break;
            case StyleIdentifier.LIST_TABLE_3 /* 324 */:
                zzYvW().zzQ(1926, this.zzXsb);
                break;
            case StyleIdentifier.LIST_TABLE_4 /* 325 */:
                zzYvW().zzQ(1928, this.zzXsb);
                break;
            case StyleIdentifier.LIST_TABLE_5_DARK /* 326 */:
                zzYvW().zzQ(1923, this.zzXsb);
                break;
            case StyleIdentifier.LIST_TABLE_6_COLORFUL /* 327 */:
                zzYvW().zzQ(1924, this.zzXsb);
                break;
            case StyleIdentifier.LIST_TABLE_7_COLORFUL /* 328 */:
                zzYvW().zzQ(1925, this.zzXsb);
                break;
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_1 /* 329 */:
                zzYvW().zzQ(1982, Boolean.valueOf(zzYfR()));
                break;
            case StyleIdentifier.LIST_TABLE_2_ACCENT_1 /* 330 */:
                zzYvW().zzQ(899, zzYfO());
                break;
            case StyleIdentifier.LIST_TABLE_3_ACCENT_1 /* 331 */:
                this.zzZBi.setShapeAttr(414, zzY0E.zzhI(zzXc()));
                break;
            case StyleIdentifier.LIST_TABLE_4_ACCENT_1 /* 332 */:
                this.zzZBi.setShapeAttr(418, zzY0E.zzhI(zzXc()));
                break;
            case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_1 /* 333 */:
                this.zzZBi.setShapeAttr(473, zzY0E.zzhI(zzXc()));
                break;
            case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_1 /* 334 */:
                this.zzZBi.setShapeAttr(477, zzY0E.zzhI(zzXc()));
                break;
            case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_1 /* 335 */:
                this.zzZBi.setShapeAttr(416, Integer.valueOf(zzY0E.zzhH(zzXc())));
                break;
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_2 /* 336 */:
                this.zzZBi.setShapeAttr(420, Integer.valueOf(zzY0E.zzhH(zzXc())));
                break;
            case StyleIdentifier.LIST_TABLE_2_ACCENT_2 /* 337 */:
                this.zzZBi.setShapeAttr(475, Integer.valueOf(zzY0E.zzhH(zzXc())));
                break;
            case StyleIdentifier.LIST_TABLE_3_ACCENT_2 /* 338 */:
                this.zzZBi.setShapeAttr(479, Integer.valueOf(zzY0E.zzhH(zzXc())));
                break;
            case StyleIdentifier.LIST_TABLE_4_ACCENT_2 /* 339 */:
            case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2 /* 340 */:
            case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_2 /* 341 */:
            case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2 /* 342 */:
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3 /* 343 */:
            case StyleIdentifier.LIST_TABLE_2_ACCENT_3 /* 344 */:
            case StyleIdentifier.LIST_TABLE_3_ACCENT_3 /* 345 */:
            case StyleIdentifier.LIST_TABLE_4_ACCENT_3 /* 346 */:
            case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_3 /* 347 */:
            case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_3 /* 348 */:
            case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_3 /* 349 */:
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4 /* 350 */:
            case StyleIdentifier.LIST_TABLE_2_ACCENT_4 /* 351 */:
            case StyleIdentifier.LIST_TABLE_3_ACCENT_4 /* 352 */:
            case StyleIdentifier.LIST_TABLE_4_ACCENT_4 /* 353 */:
            case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_4 /* 354 */:
            case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_4 /* 355 */:
            case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_4 /* 356 */:
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_5 /* 357 */:
            case StyleIdentifier.LIST_TABLE_2_ACCENT_5 /* 358 */:
            case StyleIdentifier.LIST_TABLE_3_ACCENT_5 /* 359 */:
            case StyleIdentifier.LIST_TABLE_4_ACCENT_5 /* 360 */:
            case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_5 /* 361 */:
            case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_5 /* 362 */:
            case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_5 /* 363 */:
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_6 /* 364 */:
            case StyleIdentifier.LIST_TABLE_2_ACCENT_6 /* 365 */:
            case StyleIdentifier.LIST_TABLE_3_ACCENT_6 /* 366 */:
            case StyleIdentifier.LIST_TABLE_4_ACCENT_6 /* 367 */:
            case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_6 /* 368 */:
            case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_6 /* 369 */:
            case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6 /* 370 */:
            case StyleIdentifier.SMART_LINK /* 371 */:
            case StyleIdentifier.MENTION /* 372 */:
            case StyleIdentifier.SMART_HYPERLINK /* 373 */:
            case StyleIdentifier.HASHTAG /* 374 */:
            case StyleIdentifier.UNRESOLVED_MENTION /* 375 */:
            case 376:
            case 377:
            case StyleIdentifier.length /* 378 */:
            case 379:
            case 380:
            case 381:
            case 382:
            case 383:
            case 384:
            case 385:
            case 386:
            case 387:
            case 388:
            case 389:
            case 390:
            case 391:
            case 392:
            case 393:
            case 394:
            case 395:
            case 396:
            case 397:
            case 398:
            case 399:
            case 400:
            case 401:
            case 402:
            case 403:
            case 404:
            case 405:
            case 406:
            case 407:
            case 408:
            case 409:
            case 410:
            case 411:
            case 412:
            case 413:
            case 414:
            case 415:
            case 416:
            case 417:
            case 418:
            case 419:
            case 420:
            case 421:
            case 422:
            case 423:
            case 424:
            case 425:
            case 426:
            case 427:
            case 428:
            case 429:
            case 430:
            case 431:
            case 432:
            case 433:
            case 434:
            case 435:
            case 436:
            case 437:
            case 438:
            case 439:
            case 440:
            case 441:
            case 442:
            case 443:
            case 444:
            case 445:
            case 446:
            case 447:
                this.zzXw4.zzC0(this.zzXsc);
                break;
            default:
                this.zzXw4.zzC0(this.zzXsc);
                break;
        }
    }

    private zzYC3 zzYvW() {
        return this.zzZBi.zzYvW();
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) {
        int type = zzYiN().getType();
        if (type == 93) {
            this.zzXsc = zzyet.zzYR().toLowerCase();
            return;
        }
        if (type == 94 || type == 231) {
            this.zzXsb = zzyet.zzYR();
        } else {
            if (type != 261) {
                return;
            }
            this.zzXw4.zzC0("hsv");
        }
    }

    public final int zzYfA() {
        return this.zzXs1 - this.zzXs2;
    }

    public final int zzYfB() {
        return this.zzXs3 - this.zzXs4;
    }

    public final int zzYfC() {
        return this.zzXs2;
    }

    public final int zzYfD() {
        return this.zzXs4;
    }

    public final int zzYfE() {
        return this.zzXs5 - this.zzXs6;
    }

    public final int zzYfF() {
        return this.zzXs7 - this.zzXs8;
    }

    public final int zzYfG() {
        return this.zzXs6;
    }

    public final int zzYfH() {
        return this.zzXs8;
    }

    public final void zzYfS() {
        boolean z = this.zzXsa;
        this.zzZBi.zzYvW().zzQ(4096, Integer.valueOf((z && this.zzXs9) ? 3 : z ? 1 : this.zzXs9 ? 2 : 0));
    }

    public final String zzYfy() {
        return this.zzXrZ;
    }

    public final boolean zzYfz() {
        return this.zzXs0 != 0;
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzYjb() {
        if (zzYiN().getType() != 92) {
            return;
        }
        zzYfV();
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) {
        this.zzXw4.zzYgo().zzYiL().zzoS(-1);
        this.zzXw4.zzYgo().zzYiL().zzoR(-1);
    }

    @Override // com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) {
        int type = zzyhp.getType();
        if (type != 100) {
            if (type == 103) {
                if (this.zzZBi.isGroup()) {
                    return null;
                }
                return zzYfT();
            }
            if (type != 231 && type != 261) {
                switch (type) {
                    case 92:
                        zzYfU();
                        return this;
                    case 93:
                    case 94:
                        break;
                    case 95:
                        if ("pihlshape".equals(this.zzXsc)) {
                            return new zzYFE(this.zzXw4, this.zzZBi);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        }
        return this;
    }

    private static int zzZ(zzYGY zzygy) {
        short sZzXa = zzygy.zzXa();
        zzygy.zzXa();
        zzygy.zzXa();
        return sZzXa;
    }
}
