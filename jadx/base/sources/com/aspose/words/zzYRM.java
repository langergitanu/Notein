package com.aspose.words;

import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.InputDeviceCompat;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYRM {
    private static zzZ zzXOB = new zzZ(0);
    private boolean zzXOC;
    private zzYRO zzXOD;
    private zzYOR zzXRT;

    public static class zzZ implements Comparator<zzZLE> {
        private zzZ() {
        }

        private static int zzZ(zzZLE zzzle, zzZLE zzzle2) {
            if (zzzle == null) {
                return zzzle2 == null ? 0 : -1;
            }
            if (zzzle2 == null) {
                return 1;
            }
            int iZzZ7 = com.aspose.words.internal.zzZKR.zzZ7(zzzle.zzZfb, zzzle2.zzZfb);
            return iZzZ7 != 0 ? iZzZ7 : com.aspose.words.internal.zzZKR.zzZ7(zzzle.getIndex(), zzzle2.getIndex());
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(zzZLE zzzle, zzZLE zzzle2) {
            return zzZ(zzzle, zzzle2);
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    public zzYRM(zzYOR zzyor) {
        this.zzXRT = zzyor;
    }

    private String zz3(int i, int i2, int i3) {
        if (i != 5) {
            i2 = i3;
        }
        return this.zzXRT.zzr2(i2);
    }

    private String zzEw(String str) {
        if (!this.zzXOD.isInitialized()) {
            return null;
        }
        Border borderZzGC = this.zzXOD.zzYsO().zzGC(str);
        if (zzYvY() && zzYvX()) {
            if (borderZzGC == null || borderZzGC.getLineStyle() == 0) {
                zzYRO zzyro = this.zzXOD;
                return com.aspose.words.internal.zzZKN.format("{0} {1} solid", zzyro.zzXOS, zzyro.zzXOR);
            }
            zzYRO zzyro2 = this.zzXOD;
            return com.aspose.words.internal.zzZKN.format("{0} {1} {2}", zzyro2.zzXOS, zzyro2.zzXOR, zzYS3.zzsl(borderZzGC.getLineStyle()));
        }
        if (borderZzGC != null) {
            if (zzYTI.zzB(borderZzGC)) {
                return this.zzXRT.zzz(borderZzGC);
            }
            if (zzYvZ() && "solid".equals(this.zzXOD.zzXOU)) {
                return com.aspose.words.internal.zzZKN.format("#000000 {0} solid", this.zzXRT.zzr2(10));
            }
        }
        if (zzYvY()) {
            return com.aspose.words.internal.zzZKN.format("{0} {1} solid", this.zzXOD.zzXOS, this.zzXRT.zzr2(50));
        }
        if ("none".equals(this.zzXOD.zzXOU)) {
            return "none";
        }
        if ("solid".equals(this.zzXOD.zzXOU)) {
            return com.aspose.words.internal.zzZKN.format("#000000 {0} solid", this.zzXRT.zzr2(10));
        }
        return null;
    }

    private String zzEx(String str) {
        int iZzDj = this.zzXOD.zzDj(str);
        if (iZzDj == Integer.MIN_VALUE) {
            return null;
        }
        return this.zzXRT.zzWu(((double) iZzDj) / 12700.0d);
    }

    private String zzEy(String str) {
        Border borderZzGC = this.zzXOD.zzYsO().zzGC(str);
        if (borderZzGC != null && borderZzGC.zz8K() > 0) {
            return this.zzXRT.zzWu(borderZzGC.zz8K());
        }
        int iZzDi = this.zzXOD.zzDi(str);
        if (iZzDi != Integer.MIN_VALUE) {
            return this.zzXRT.zzr1(iZzDi);
        }
        return null;
    }

    private void zzEz(String str) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zz0(com.aspose.words.internal.zzZKN.format("fo:padding-{0}", str), zzEy(str));
        zzytgZzYsG.zz0(com.aspose.words.internal.zzZKN.format("fo:border-{0}", str), zzEw(str));
        zzytgZzYsG.zz0(com.aspose.words.internal.zzZKN.format("fo:margin-{0}", str), zzEx(str));
        this.zzXRT.zzY(this.zzXOD.zzYsO(), str);
    }

    private void zzP(Object obj, String str) {
        if (((Boolean) obj).booleanValue()) {
            this.zzXOD.zzXPf = str;
        } else {
            zzYRO zzyro = this.zzXOD;
            zzyro.zzZfa--;
        }
    }

    private void zzSq(boolean z) {
        if (z) {
            return;
        }
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zz0("style:horizontal-pos", this.zzXOD.zzXPc);
        zzytgZzYsG.zz0("style:horizontal-rel", this.zzXOD.zzXPb);
        zzytgZzYsG.zz0("style:vertical-pos", this.zzXOD.zzXPe);
        zzytgZzYsG.zz0("style:vertical-rel", this.zzXOD.zzXPd);
    }

    private void zzT(zzYC3 zzyc3) {
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzXOD.zzXOW)) {
            zzYRO zzyro = this.zzXOD;
            zzyro.zzXOY = zzZ(zzyc3, zzyro.zzXPo, true);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzXOD.zzXOV)) {
            zzYRO zzyro2 = this.zzXOD;
            zzyro2.zzXOX = zzZ(zzyc3, zzyro2.zzXPn, false);
        }
    }

    private void zzX(zzYRP zzyrp) {
        if ("linear".equals(zzyrp.zzG7())) {
            if (this.zzXOD.zzXPm % 100 != 0) {
                zzyrp.zzTa("axial");
            }
            if (zzrW(this.zzXOD.zzXPm)) {
                String strZzYwc = zzyrp.zzYwc();
                zzyrp.zzED(zzyrp.zzYwb());
                zzyrp.zzEC(strZzYwc);
                String strZzYwa = zzyrp.zzYwa();
                zzyrp.zzEB(zzyrp.zzYw9());
                zzyrp.zzEA(strZzYwa);
            }
        }
    }

    private void zzY(ShapeBase shapeBase, zzYC3 zzyc3) throws Exception {
        zzYw1();
        zzT(zzyc3);
        zzZI(shapeBase);
        zzZG(shapeBase);
        zzYw2();
        zzZJ(shapeBase);
        zzYw3();
        zzYw0();
    }

    private boolean zzYvX() {
        String str = this.zzXOD.zzXOR;
        return (str == null || com.aspose.words.internal.zzZKN.equals(str, this.zzXRT.zzYrY())) ? false : true;
    }

    private boolean zzYvY() {
        return this.zzXOD.zzXOS != null;
    }

    private boolean zzYvZ() {
        return zzYvY() || zzYvX();
    }

    private void zzYw0() {
        zzYRO zzyro = this.zzXOD;
        zzYRP zzyrp = zzyro.zzXPi;
        if ("gradient".equals(zzyro.zzXOK)) {
            zzyrp.setName(com.aspose.words.internal.zzZKN.format("G{0}", com.aspose.words.internal.zzJB.zzWF(this.zzXRT.zzYsv())));
            zzYOR zzyor = this.zzXRT;
            zzyor.zzr5(zzyor.zzYsv() + 1);
            this.zzXOD.zzXOI = zzyrp.getName();
            this.zzXRT.zzYsb().zzZ((zzYPP) zzyrp, false, false);
            zzY(zzyrp);
            zzX(zzyrp);
            zzyrp.zzED(zza(zzyrp.zzYwc(), this.zzXOD.zzXPp));
            zzyrp.zzEC(zza(zzyrp.zzYwb(), this.zzXOD.zzXPp));
        }
    }

    private void zzYw1() {
        zzYRO zzyro = this.zzXOD;
        if (zzyro.zzXOJ) {
            if (!com.aspose.words.internal.zzZYD.zzXk(zzyro.zzXP3)) {
                this.zzXOD.zzXP3 = "#ffffff";
            }
            if (com.aspose.words.internal.zzZYD.zzXk(this.zzXOD.getBackgroundColor())) {
                return;
            }
            this.zzXOD.setBackgroundColor("#ffffff");
        }
    }

    private void zzYw2() {
        zzYRO zzyro = this.zzXOD;
        if (zzyro.zzXPe == null || "line".equals(zzyro.zzXPd)) {
            zzYRO zzyro2 = this.zzXOD;
            if (zzyro2.zzXPe == null) {
                zzyro2.zzZfa++;
            }
            zzyro2.zzXPe = "from-top";
        }
        if ("from-top".equals(this.zzXOD.zzXPe) && !com.aspose.words.internal.zzZYD.zzXk(this.zzXOD.zzXPd)) {
            this.zzXOD.zzXPd = "paragraph";
        }
        zzYRO zzyro3 = this.zzXOD;
        if (zzyro3.zzXPc != null) {
            return;
        }
        zzyro3.zzXPc = "from-left";
        zzyro3.zzZfa++;
    }

    private void zzYw3() {
        zzYRO zzyro = this.zzXOD;
        if (zzyro.zzXP5 != null) {
            return;
        }
        zzyro.zzXP5 = TelemetryEventStrings.Value.FALSE;
        zzyro.zzZfa++;
    }

    private void zzYw4() {
        zzEz("top");
        zzEz("bottom");
        zzEz("left");
        zzEz("right");
        this.zzXRT.zzZ(this.zzXOD.zzYsO());
    }

    private void zzYw5() {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zz0("draw:marker-start-width", this.zzXOD.zzXOY);
        zzytgZzYsG.zz0("draw:marker-end-width", this.zzXOD.zzXOX);
        zzytgZzYsG.zz0("draw:marker-start", this.zzXOD.zzXOW);
        zzytgZzYsG.zz0("draw:marker-end", this.zzXOD.zzXOV);
    }

    private void zzYw6() {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zz0("draw:stroke", this.zzXOD.zzXOU);
        zzytgZzYsG.zz0("draw:stroke-dash", this.zzXOD.zzXOT);
        zzytgZzYsG.zz0("svg:stroke-width", this.zzXOD.zzXOR);
        if (!"none".equals(this.zzXOD.zzXOU)) {
            zzytgZzYsG.zz0("svg:stroke-color", this.zzXOD.zzXOS);
        }
        zzytgZzYsG.zz0("svg:stroke-opacity", this.zzXOD.zzXOQ);
    }

    private void zzYw7() {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zz0("draw:shadow-color", this.zzXOD.zzXOP);
        zzytgZzYsG.zz0("draw:shadow", this.zzXOD.zzXOO);
        zzytgZzYsG.zz0("draw:shadow-opacity", this.zzXOD.zzXON);
        zzytgZzYsG.zz0("draw:shadow-offset-x", this.zzXOD.zzXOG);
        zzytgZzYsG.zz0("draw:shadow-offset-y", this.zzXOD.zzXOF);
    }

    private void zzYw8() {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzYRO zzyro = this.zzXOD;
        zzytgZzYsG.zz0("draw:fill", zzyro.zzXOJ ? zzyro.zzXOK : "none");
        zzytgZzYsG.zz0("draw:fill-gradient-name", this.zzXOD.zzXOI);
        zzYw7();
        if (!"gradient".equals(this.zzXOD.zzXOK)) {
            zzytgZzYsG.zz0("draw:opacity", this.zzXOD.zzXOM);
            if (!this.zzXRT.zzYsI().isStrictSchema11()) {
                zzytgZzYsG.zz0("style:background-transparency", this.zzXOD.zzXOL);
            }
            zzYRO zzyro2 = this.zzXOD;
            if (zzyro2.zzXOJ) {
                zzytgZzYsG.zz0("draw:fill-color", zzyro2.zzXP3);
                zzytgZzYsG.zz0("fo:background-color", this.zzXOD.getBackgroundColor());
            }
        }
        zzytgZzYsG.zz0("draw:secondary-fill-color", this.zzXOD.zzXP4);
    }

    private void zzZ(ShapeBase shapeBase, zzYC3 zzyc3) throws Exception {
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class);
        if (shape == null || !shape.getStroked() || shape.zzZjT()) {
            this.zzXOD.zzXOU = "none";
        }
        if (shapeBase.zzY9F() && ((Boolean) zzyc3.zzPj(508)).booleanValue()) {
            this.zzXOD.zzXOU = "solid";
        }
    }

    private void zzZG(ShapeBase shapeBase) throws Exception {
        if (shapeBase.isTopLevel() && (shapeBase instanceof Shape) && !zzyo()) {
            Shape shape = (Shape) shapeBase;
            if (shape.zzZjT()) {
                ImageSize imageSize = shape.getImageData().getImageSize();
                if (imageSize.isValid()) {
                    zzYRO zzyro = this.zzXOD;
                    zzyro.zzXP6 = com.aspose.words.internal.zzZKN.format("rect({0} {1} {2} {3})", this.zzXRT.zzWu(imageSize.getHeightPoints() * zzyro.zzXP8), this.zzXRT.zzWu(imageSize.getWidthPoints() * this.zzXOD.zzXP9), this.zzXRT.zzWu(imageSize.getHeightPoints() * this.zzXOD.zzXP7), this.zzXRT.zzWu(imageSize.getWidthPoints() * this.zzXOD.zzXPa));
                    this.zzXOD.zzZfa++;
                }
            }
        }
    }

    private static boolean zzZH(ShapeBase shapeBase) {
        return (shapeBase.zzYac() || shapeBase.isWordArt()) && !shapeBase.isGroup();
    }

    private void zzZI(ShapeBase shapeBase) {
        zzYPR zzypr = this.zzXOD.zzXPj;
        if (zzypr == null || !zzYOR.zzXk(shapeBase)) {
            return;
        }
        zzypr.zzTa(this.zzXOD.zzXPq);
        if (this.zzXRT.zzYsd().zzY(zzypr.getName(), null, false, false) == null) {
            this.zzXRT.zzYsd().zzZ((zzYPP) zzypr, false, false);
        }
    }

    private void zzZJ(ShapeBase shapeBase) {
        zzYRO zzyro = this.zzXOD;
        zzyro.zzXP2 = zzYS3.zzZ(zzyro.zzXP1, zzyro.zzXP0, shapeBase);
        zzYRO zzyro2 = this.zzXOD;
        if (zzyro2.zzXP2 != null) {
            zzyro2.zzZfa++;
        }
    }

    private void zzZK(ShapeBase shapeBase) {
        this.zzXOD.zzXOZ = "foreground";
        if (zzZH(shapeBase)) {
            this.zzXOD.zzXOH = "wrap";
        }
        if (shapeBase.isImage()) {
            this.zzXOD.zzXOJ = false;
        }
    }

    private void zzZL(ShapeBase shapeBase) throws Exception {
        zzZK(shapeBase);
        zzYC3 zzyc3ZzYvW = shapeBase.zzYvW();
        zzZ(shapeBase, zzyc3ZzYvW);
        for (int i = 0; i < zzyc3ZzYvW.getCount(); i++) {
            Object objZzVY = zzyc3ZzYvW.zzVY(i);
            if (objZzVY != null && zzZ(shapeBase, zzyc3ZzYvW.zzT3(i), objZzVY)) {
                this.zzXOD.zzZfa++;
            }
        }
        zzY(shapeBase, zzyc3ZzYvW);
    }

    private static boolean zzZb(String str, int i) {
        return ("square".equals(str) && i > 0) || i == -100;
    }

    private void zzZe(Object obj) {
        com.aspose.words.internal.zzPV zzpv = (com.aspose.words.internal.zzPV) obj;
        if (zzpv.isEmpty() || com.aspose.words.internal.zzPV.zzZ(zzpv, com.aspose.words.internal.zzPV.zzI0)) {
            zzpv = com.aspose.words.internal.zzPV.zzKa;
        }
        this.zzXOD.zzXOS = zzYOU.zzZQ(zzpv);
    }

    private void zzZf(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        if (iIntValue == 2) {
            this.zzXOD.zzXOH = "no-wrap";
        }
        if (iIntValue == 0) {
            this.zzXOD.zzXOH = "wrap";
        }
    }

    private void zzZg(Object obj) {
        if ("dash".equals(this.zzXOD.zzXOU)) {
            zzYRO zzyro = this.zzXOD;
            zzyro.zzZfa--;
        } else {
            this.zzXOD.zzXOU = ((Boolean) obj).booleanValue() ? "solid" : "none";
        }
    }

    private static String zza(String str, boolean z) {
        return "#eff00266".equals(str) ? z ? "#ff9999" : "#fbd8bb" : str;
    }

    private boolean zzrW(int i) {
        if (i < 0 || i >= 100) {
            return false;
        }
        zzYRO zzyro = this.zzXOD;
        return zzyro.zzXPl >= 0 || !zzyro.zzXPk;
    }

    private boolean zzyo() {
        return com.aspose.words.internal.zzAN.zzZD(this.zzXOD.zzXPa) && com.aspose.words.internal.zzAN.zzZD(this.zzXOD.zzXP9) && com.aspose.words.internal.zzAN.zzZD(this.zzXOD.zzXP8) && com.aspose.words.internal.zzAN.zzZD(this.zzXOD.zzXP7);
    }

    public final void zzSr(boolean z) {
        if (this.zzXOD.zzZfa <= 0) {
            return;
        }
        this.zzXOC = true;
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzY("style:graphic-properties");
        zzYw5();
        zzYw6();
        zzYw8();
        zzytgZzYsG.zz0("draw:luminance", this.zzXOD.zzXPg);
        zzytgZzYsG.zz0("draw:contrast", this.zzXOD.zzXPh);
        zzytgZzYsG.zz0("draw:color-mode", this.zzXOD.zzXPf);
        zzYw4();
        zzSq(z);
        zzytgZzYsG.zz0("fo:clip", this.zzXOD.zzXP6);
        zzytgZzYsG.zz0("style:flow-with-text", this.zzXOD.zzXP5);
        zzytgZzYsG.zz0("style:wrap", this.zzXOD.zzXP2);
        zzytgZzYsG.zz0("style:run-through", this.zzXOD.zzXOZ);
        zzytgZzYsG.zz0("fo:wrap-option", this.zzXOD.zzXOH);
        boolean z2 = this.zzXOD.zzXOE;
        String str = TelemetryEventStrings.Value.FALSE;
        zzytgZzYsG.zz0("draw:auto-grow-height", z2 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        if (this.zzXOD.zzXOE) {
            str = TelemetryEventStrings.Value.TRUE;
        }
        zzytgZzYsG.zz0("draw:auto-grow-width", str);
        zzytgZzYsG.zzo();
        this.zzXOC = false;
    }

    public final void zzZM(ShapeBase shapeBase) throws Exception {
        this.zzXOD = new zzYRO();
        zzZL(shapeBase);
        zzSr(shapeBase.isInline());
    }

    private boolean zzZ(ShapeBase shapeBase, int i, Object obj) {
        zzYC3 zzyc3ZzYvW = shapeBase.zzYvW();
        zzYRO zzyro = this.zzXOD;
        zzYRP zzyrp = zzyro.zzXPi;
        if (zzyro.zzd(i, obj)) {
            return true;
        }
        if (i != 339 && i != 340 && i != 378 && i != 379) {
            switch (i) {
                case 118:
                case 119:
                case 120:
                case 121:
                case 122:
                case 123:
                case 124:
                case 125:
                case 126:
                case 127:
                case 128:
                case 134:
                case 135:
                    break;
                case 129:
                    Integer num = (Integer) obj;
                    if (num.intValue() != 0) {
                        this.zzXOD.zzrg(num.intValue());
                    }
                    return true;
                case 130:
                    Integer num2 = (Integer) obj;
                    if (num2.intValue() != 0) {
                        this.zzXOD.zzrh(num2.intValue());
                    }
                    return true;
                case 131:
                    Integer num3 = (Integer) obj;
                    if (num3.intValue() != 0) {
                        this.zzXOD.zzre(num3.intValue());
                    }
                    return true;
                case 132:
                    Integer num4 = (Integer) obj;
                    if (num4.intValue() != 0) {
                        this.zzXOD.zzrf(num4.intValue());
                    }
                    return true;
                case 133:
                    zzZf(obj);
                    return true;
                default:
                    switch (i) {
                        case 137:
                        case 138:
                        case 139:
                        case 140:
                        case 141:
                        case 142:
                            break;
                        default:
                            switch (i) {
                                case 187:
                                case 188:
                                case 189:
                                case 191:
                                    break;
                                case 190:
                                    this.zzXOD.zzXOE = ((Boolean) obj).booleanValue();
                                    return true;
                                default:
                                    switch (i) {
                                        case 193:
                                        case 194:
                                        case 195:
                                        case 196:
                                        case 197:
                                        case 198:
                                            break;
                                        default:
                                            switch (i) {
                                                case 240:
                                                case 242:
                                                case 243:
                                                case 244:
                                                case 245:
                                                case 246:
                                                case StyleIdentifier.LIGHT_LIST_ACCENT_6 /* 247 */:
                                                case StyleIdentifier.LIGHT_GRID_ACCENT_6 /* 248 */:
                                                case StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6 /* 249 */:
                                                case 250:
                                                case StyleIdentifier.MEDIUM_LIST_1_ACCENT_6 /* 251 */:
                                                case StyleIdentifier.MEDIUM_LIST_2_ACCENT_6 /* 252 */:
                                                case StyleIdentifier.MEDIUM_GRID_1_ACCENT_6 /* 253 */:
                                                case StyleIdentifier.MEDIUM_GRID_2_ACCENT_6 /* 254 */:
                                                case 255:
                                                case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
                                                case StyleIdentifier.INTENSE_EMPHASIS /* 261 */:
                                                case StyleIdentifier.GRID_TABLE_5_DARK /* 277 */:
                                                case StyleIdentifier.GRID_TABLE_7_COLORFUL /* 279 */:
                                                case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_5 /* 313 */:
                                                case 381:
                                                case 382:
                                                case 383:
                                                case 389:
                                                case 391:
                                                case 392:
                                                case 394:
                                                case 400:
                                                case 401:
                                                case 402:
                                                case 403:
                                                case 404:
                                                case 405:
                                                case 406:
                                                case 408:
                                                case 409:
                                                case 410:
                                                case 411:
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
                                                case 441:
                                                case 444:
                                                case 445:
                                                case 446:
                                                case 447:
                                                case 450:
                                                case 451:
                                                case 452:
                                                case 454:
                                                case 455:
                                                case 456:
                                                case 457:
                                                case 458:
                                                case 460:
                                                case 461:
                                                case 463:
                                                case 470:
                                                case 473:
                                                case 474:
                                                case 475:
                                                case 476:
                                                case 477:
                                                case 478:
                                                case 479:
                                                case 480:
                                                case 481:
                                                case 482:
                                                case 503:
                                                case 504:
                                                case 505:
                                                case 506:
                                                case 507:
                                                case 509:
                                                case 510:
                                                case FrameMetricsAggregator.EVERY_DURATION /* 511 */:
                                                case 512:
                                                case 514:
                                                case 515:
                                                case 519:
                                                case 520:
                                                case 521:
                                                case 522:
                                                case 523:
                                                case 524:
                                                case 525:
                                                case 526:
                                                case 527:
                                                case 528:
                                                case 529:
                                                case 530:
                                                case 531:
                                                case 532:
                                                case 533:
                                                case 534:
                                                case 535:
                                                case 536:
                                                case 537:
                                                case 538:
                                                case 539:
                                                case 575:
                                                case 576:
                                                case 577:
                                                case 578:
                                                case 579:
                                                case 580:
                                                case 581:
                                                case 582:
                                                case 583:
                                                case 584:
                                                case 585:
                                                case 586:
                                                case 587:
                                                case 639:
                                                case 643:
                                                case 646:
                                                case 648:
                                                case 649:
                                                case 650:
                                                case 651:
                                                case 652:
                                                case 653:
                                                case 663:
                                                case 666:
                                                case 702:
                                                case 706:
                                                case 707:
                                                case 708:
                                                case 709:
                                                case 714:
                                                case 763:
                                                case 772:
                                                case 773:
                                                case 774:
                                                case 777:
                                                case 778:
                                                case 779:
                                                case 780:
                                                case 822:
                                                case 823:
                                                case 824:
                                                case 825:
                                                case 826:
                                                case 827:
                                                case 828:
                                                case 829:
                                                case 830:
                                                case 832:
                                                case 833:
                                                case 834:
                                                case 835:
                                                case 836:
                                                case 837:
                                                case 889:
                                                case 890:
                                                case 891:
                                                case 892:
                                                case 893:
                                                case 894:
                                                case 895:
                                                case 896:
                                                case 899:
                                                case 904:
                                                case 909:
                                                case 915:
                                                case 916:
                                                case 917:
                                                case 918:
                                                case 920:
                                                case 921:
                                                case 922:
                                                case 923:
                                                case 924:
                                                case 925:
                                                case 926:
                                                case 937:
                                                case 938:
                                                case 944:
                                                case 945:
                                                case 946:
                                                case 947:
                                                case 948:
                                                case 949:
                                                case 950:
                                                case 951:
                                                case 953:
                                                case 955:
                                                case 956:
                                                case 957:
                                                case 958:
                                                case 959:
                                                case EditingLanguage.KAZAKH /* 1087 */:
                                                case 1280:
                                                case 1281:
                                                case 1282:
                                                case 1283:
                                                case 1284:
                                                case 1285:
                                                case 1286:
                                                case 1287:
                                                case 1288:
                                                case 1289:
                                                case 1340:
                                                case 1341:
                                                case 1342:
                                                case 1343:
                                                case 1728:
                                                case 1729:
                                                case 1730:
                                                case 1790:
                                                case 1791:
                                                case 1792:
                                                case 1855:
                                                case 1921:
                                                case 1922:
                                                case 1923:
                                                case 1924:
                                                case 1925:
                                                case 1926:
                                                case 1927:
                                                case 1928:
                                                case FieldType.FIELD_CITATION /* 1980 */:
                                                case 1981:
                                                case 1982:
                                                case 1983:
                                                case 1984:
                                                case 1985:
                                                case 1986:
                                                case 1987:
                                                case 1988:
                                                case 1989:
                                                case 1990:
                                                case 1991:
                                                case 4099:
                                                case EditingLanguage.GERMAN_LUXEMBOURG /* 4103 */:
                                                case 4110:
                                                case 4111:
                                                case 4115:
                                                case 4116:
                                                case 4117:
                                                case 4118:
                                                case 4119:
                                                case 4121:
                                                case EditingLanguage.CROATIAN_BOZNIA_AND_HERZEGOVINA /* 4122 */:
                                                case 4124:
                                                case 4131:
                                                case 4140:
                                                case 4141:
                                                case 4142:
                                                case 4143:
                                                case 4144:
                                                case 4145:
                                                case 4146:
                                                case 4147:
                                                case 4148:
                                                case 4149:
                                                    break;
                                                case 256:
                                                    this.zzXOD.zzXP8 = ((double) ((Integer) obj).intValue()) / 65536.0d;
                                                    return true;
                                                case 257:
                                                    this.zzXOD.zzXP7 = ((double) ((Integer) obj).intValue()) / 65536.0d;
                                                    return true;
                                                case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
                                                    this.zzXOD.zzXPa = ((double) ((Integer) obj).intValue()) / 65536.0d;
                                                    return true;
                                                case StyleIdentifier.COLORFUL_GRID_ACCENT_6 /* 259 */:
                                                    this.zzXOD.zzXP9 = ((double) ((Integer) obj).intValue()) / 65536.0d;
                                                    return true;
                                                case 384:
                                                    int iIntValue = ((Integer) obj).intValue();
                                                    if (this.zzXRT.zzYsC() != 0 || iIntValue != 3) {
                                                        this.zzXOD.zzXOK = zzYS3.zzsr(iIntValue);
                                                    }
                                                    zzyrp.zzTa(zzYS3.zzsq(iIntValue));
                                                    return true;
                                                case 385:
                                                    this.zzXOD.setBackgroundColor(zzYOU.zzZQ((com.aspose.words.internal.zzPV) obj));
                                                    zzYRO zzyro2 = this.zzXOD;
                                                    zzyro2.zzXP3 = zzyro2.getBackgroundColor();
                                                    zzyrp.zzED(this.zzXOD.getBackgroundColor());
                                                    this.zzXOD.zzXOJ = true;
                                                    return true;
                                                case 386:
                                                    Integer num5 = (Integer) obj;
                                                    this.zzXOD.zzXOM = zzYOU.zzrn(num5.intValue());
                                                    this.zzXOD.zzXOL = zzYOU.zzrm(num5.intValue());
                                                    zzyrp.zzEB(this.zzXOD.zzXOM);
                                                    return true;
                                                case 387:
                                                    zzyrp.zzEC(zzYOU.zzZQ((com.aspose.words.internal.zzPV) obj));
                                                    return true;
                                                case 388:
                                                    zzyrp.zzEA(zzYOU.zzrn(((Integer) obj).intValue()));
                                                    return true;
                                                case 395:
                                                    this.zzXOD.zzXPl = ((Integer) obj).intValue();
                                                    zzyrp.zzEF(zzYOU.zzrs(this.zzXOD.zzXPl));
                                                    return true;
                                                case 396:
                                                    this.zzXOD.zzXPm = ((Integer) obj).intValue();
                                                    this.zzXOD.zzXPk = true;
                                                    return true;
                                                case 397:
                                                    zzyrp.zzEH(zzYOU.zzro(((Integer) obj).intValue()));
                                                    return true;
                                                case 398:
                                                    zzyrp.zzEG(zzYOU.zzro(((Integer) obj).intValue()));
                                                    return true;
                                                case 407:
                                                    zzZLE[] zzzleArr = (zzZLE[]) obj;
                                                    if (zzzleArr != null && zzzleArr.length > 2 && !shapeBase.isWordArt()) {
                                                        ArrayList<zzZLE> arrayListZzZ = zzZ(zzzleArr);
                                                        zzyrp.zzED(zzYOU.zzZQ(arrayListZzZ.get(0).zzYuy));
                                                        zzyrp.zzEC(zzYOU.zzZQ(arrayListZzZ.get(1).zzYuy));
                                                    }
                                                    this.zzXRT.zzZ(i, "shape", true, false);
                                                    return false;
                                                case 412:
                                                    this.zzXOD.zzXPp = ((Integer) obj).intValue() == 1073741835;
                                                    return true;
                                                case 443:
                                                    this.zzXOD.zzXOJ = ((Boolean) obj).booleanValue();
                                                    if (!this.zzXOD.zzXOJ && (shapeBase.getShapeType() == 202 || (shapeBase.getShapeType() == 1 && shapeBase.hasChildNodes()))) {
                                                        this.zzXOD.zzXOM = zzYOU.zzrn(0);
                                                        this.zzXOD.zzXOL = zzYOU.zzrm(0);
                                                    }
                                                    return true;
                                                case 448:
                                                    zzZe(obj);
                                                    return true;
                                                case 449:
                                                    this.zzXOD.zzXOQ = zzYOU.zzrn(((Integer) obj).intValue());
                                                    return true;
                                                case 459:
                                                    this.zzXOD.zzXOR = this.zzXRT.zzr1(((Integer) obj).intValue());
                                                    return true;
                                                case 462:
                                                    this.zzXOD.zzXPj = zzZ(shapeBase, obj);
                                                    return true;
                                                case 464:
                                                    this.zzXOD.zzXOW = this.zzXRT.zzX(zzyc3ZzYvW, ((Integer) obj).intValue(), true);
                                                    return true;
                                                case 465:
                                                    this.zzXOD.zzXOV = this.zzXRT.zzX(zzyc3ZzYvW, ((Integer) obj).intValue(), false);
                                                    return true;
                                                case 466:
                                                    this.zzXOD.zzXPo = ((Integer) obj).intValue();
                                                    return true;
                                                case 468:
                                                    this.zzXOD.zzXPn = ((Integer) obj).intValue();
                                                    return true;
                                                case 471:
                                                    int iIntValue2 = ((Integer) shapeBase.zzYvW().zzPk(471)).intValue();
                                                    this.zzXOD.zzXPq = iIntValue2 == 0 ? "round" : DrawToolFactory.LASSO_TYPE_RECT;
                                                    return true;
                                                case 508:
                                                    zzZg(obj);
                                                    return true;
                                                case InputDeviceCompat.SOURCE_DPAD /* 513 */:
                                                    this.zzXOD.zzXOP = zzYOU.zzZQ((com.aspose.words.internal.zzPV) obj);
                                                    return true;
                                                case 516:
                                                    this.zzXOD.zzXON = zzYOU.zzrn(((Integer) obj).intValue());
                                                    return true;
                                                case 517:
                                                    this.zzXOD.zzXOG = this.zzXRT.zzr1(((Integer) obj).intValue());
                                                    return true;
                                                case 518:
                                                    this.zzXOD.zzXOF = this.zzXRT.zzr1(((Integer) obj).intValue());
                                                    return true;
                                                case 574:
                                                    this.zzXOD.zzXOO = ((Boolean) obj).booleanValue() ? "visible" : "hidden";
                                                    return true;
                                                case 647:
                                                    this.zzXOD.zzXP4 = zzYOU.zzZQ((com.aspose.words.internal.zzPV) obj);
                                                    return true;
                                                case SQLitePersistence.MAX_ARGS /* 900 */:
                                                    Integer num6 = (Integer) obj;
                                                    if (num6.intValue() == 0) {
                                                        return false;
                                                    }
                                                    this.zzXOD.zzrl(num6.intValue());
                                                    return true;
                                                case 901:
                                                    Integer num7 = (Integer) obj;
                                                    if (num7.intValue() == 0) {
                                                        return false;
                                                    }
                                                    this.zzXOD.zzrj(num7.intValue());
                                                    return true;
                                                case 902:
                                                    Integer num8 = (Integer) obj;
                                                    if (num8.intValue() == 0) {
                                                        return false;
                                                    }
                                                    this.zzXOD.zzrk(num8.intValue());
                                                    return true;
                                                case 903:
                                                    Integer num9 = (Integer) obj;
                                                    if (num9.intValue() == 0) {
                                                        return false;
                                                    }
                                                    this.zzXOD.zzri(num9.intValue());
                                                    return true;
                                                case 911:
                                                    this.zzXOD.zzXPc = zzYS3.zzsf(((Integer) obj).intValue());
                                                    return true;
                                                case 912:
                                                    this.zzXOD.zzXPb = zzYS3.zzsg(((Integer) obj).intValue());
                                                    return true;
                                                case 913:
                                                    this.zzXOD.zzXPe = zzYS3.zzsi(((Integer) obj).intValue());
                                                    return true;
                                                case 914:
                                                    this.zzXOD.zzXPd = zzYS3.zzsj(((Integer) obj).intValue());
                                                    return true;
                                                case 954:
                                                    this.zzXOD.zzXOZ = ((Boolean) obj).booleanValue() ? "background" : "foreground";
                                                    return true;
                                                case EditingLanguage.ARABIC_LIBYA /* 4097 */:
                                                    this.zzXOD.zzXP1 = ((Integer) obj).intValue();
                                                    return true;
                                                case InputDeviceCompat.SOURCE_TOUCHSCREEN /* 4098 */:
                                                    this.zzXOD.zzXP0 = ((Integer) obj).intValue();
                                                    return true;
                                                default:
                                                    switch (i) {
                                                        case StyleIdentifier.INTENSE_REFERENCE /* 263 */:
                                                        case StyleIdentifier.TOC_HEADING /* 266 */:
                                                        case StyleIdentifier.PLAIN_TABLE_1 /* 267 */:
                                                        case StyleIdentifier.PLAIN_TABLE_2 /* 268 */:
                                                        case StyleIdentifier.PLAIN_TABLE_3 /* 269 */:
                                                        case 270:
                                                            break;
                                                        case StyleIdentifier.BOOK_TITLE /* 264 */:
                                                            this.zzXOD.zzXPh = zzYOU.zzrq(((Integer) obj).intValue());
                                                            return true;
                                                        case StyleIdentifier.BIBLIOGRAPHY /* 265 */:
                                                            this.zzXOD.zzXPg = zzYOU.zzrp(((Integer) obj).intValue());
                                                            return true;
                                                        default:
                                                            switch (i) {
                                                                case StyleIdentifier.GRID_TABLE_3_ACCENT_1 /* 282 */:
                                                                case StyleIdentifier.GRID_TABLE_4_ACCENT_1 /* 283 */:
                                                                case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_1 /* 284 */:
                                                                case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_1 /* 285 */:
                                                                case StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_1 /* 286 */:
                                                                case StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_2 /* 287 */:
                                                                    break;
                                                                default:
                                                                    switch (i) {
                                                                        case StyleIdentifier.GRID_TABLE_2_ACCENT_6 /* 316 */:
                                                                        case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6 /* 319 */:
                                                                            break;
                                                                        case StyleIdentifier.GRID_TABLE_3_ACCENT_6 /* 317 */:
                                                                            zzP(obj, "greyscale");
                                                                            return true;
                                                                        case StyleIdentifier.GRID_TABLE_4_ACCENT_6 /* 318 */:
                                                                            zzP(obj, "mono");
                                                                            return true;
                                                                        default:
                                                                            return false;
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
                    break;
            }
        }
        this.zzXRT.zzZ(i, "shape", true, false);
        return false;
    }

    private void zzY(zzYRP zzyrp) {
        if (zzZb(zzyrp.zzG7(), this.zzXOD.zzXPm)) {
            String strZzYwc = zzyrp.zzYwc();
            zzyrp.zzED(zzyrp.zzYwb());
            zzyrp.zzEC(strZzYwc);
        }
    }

    private zzYPR zzZ(ShapeBase shapeBase, Object obj) {
        int iZzYsu;
        int iIntValue = ((Integer) obj).intValue();
        if (iIntValue == 0 || iIntValue == 0) {
            return null;
        }
        if (zzYOR.zzXk(shapeBase)) {
            iZzYsu = this.zzXRT.zzYsd().zzYu3();
        } else {
            iZzYsu = this.zzXRT.zzYsu();
            zzYOR zzyor = this.zzXRT;
            zzyor.zzr4(zzyor.zzYsu() + 1);
        }
        zzYPR zzyprZzV = zzYS3.zzV(shapeBase, iZzYsu);
        this.zzXOD.zzXOT = zzyprZzV.getName();
        this.zzXOD.zzXOU = "dash";
        return zzyprZzV;
    }

    private String zzZ(zzYC3 zzyc3, int i, boolean z) {
        int i2 = z ? 464 : 465;
        if (!zzyc3.contains(i2)) {
            return null;
        }
        int iIntValue = ((Integer) zzyc3.zzPk(i2)).intValue();
        if (i == 2) {
            return zz3(iIntValue, 420, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4);
        }
        if (i == 1) {
            return zz3(iIntValue, 315, 210);
        }
        return zz3(iIntValue, 245, 140);
    }

    public final void zzZ(zzYRO zzyro) {
        this.zzXOD = zzyro;
    }

    private static ArrayList<zzZLE> zzZ(zzZLE[] zzzleArr) {
        if (zzzleArr == null || zzzleArr.length == 0) {
            return null;
        }
        ArrayList<zzZLE> arrayList = new ArrayList<>(zzzleArr.length);
        for (int i = 0; i < zzzleArr.length; i++) {
            zzZLE zzzle = zzzleArr[i];
            if (zzzle != null) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzZLE(zzzle));
                arrayList.get(i).setIndex(i);
            }
        }
        Collections.sort(arrayList, zzXOB);
        return arrayList;
    }
}
