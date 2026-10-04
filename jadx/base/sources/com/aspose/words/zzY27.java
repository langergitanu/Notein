package com.aspose.words;

import androidx.core.view.InputDeviceCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.marker.PerfConstants;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzY27 {
    private static int zzY0(ShapeBase shapeBase) {
        Object directShapeAttr = shapeBase.getDirectShapeAttr(StyleIdentifier.LIST_TABLE_6_COLORFUL);
        if (directShapeAttr != null) {
            return com.aspose.words.internal.zzSA.zzl(((double) ((Integer) directShapeAttr).intValue()) / ((double) shapeBase.zzZyj()));
        }
        return 10923;
    }

    public static void zzZ(ShapeBase shapeBase, zzYU6 zzyu6, zzZ8U zzz8u) throws Exception {
        zzZ(shapeBase, false, zzyu6, zzz8u);
    }

    private static boolean zzz0(String str) {
        return "margin".equals(str) || "page".equals(str) || "text".equals(str);
    }

    private static boolean zzz1(String str) {
        return zzz0(str) && !"page".equals(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0931  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:374:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zzZ(ShapeBase shapeBase, boolean z, zzYU6 zzyu6, zzZ8U zzz8u) throws Exception {
        String str;
        String str2;
        zzY2U zzy2u;
        zzY25 zzy25;
        zzY2O zzy2o;
        zzY2E zzy2e;
        zzY2Y zzy2y;
        zzY2R zzy2r;
        boolean z2;
        zzY31 zzy31;
        com.aspose.words.internal.zzD3 zzd3;
        String str3;
        zzYC3 zzyc3ZzYvW;
        int i;
        String strZzWF;
        String strZzWF2;
        String str4;
        zzZ8U zzz8u2;
        zzY36 zzy36;
        int i2;
        String strZzY1;
        ShapeBase shapeBase2;
        zzY25 zzy252;
        zzY31 zzy312;
        zzY26 zzy26;
        String str5;
        String str6;
        int iIntValue;
        int i3;
        String str7;
        int shapeType = shapeBase.getShapeType();
        boolean z3 = true;
        if (shapeType != -2) {
            if (shapeType != -1) {
                if (shapeType == 0) {
                    str2 = "v:shape";
                } else if (shapeType == 1) {
                    str2 = "v:rect";
                } else if (shapeType == 2) {
                    str7 = "v:roundrect";
                } else if (shapeType == 3) {
                    str7 = "v:oval";
                } else if (shapeType == 20) {
                    str7 = "v:line";
                } else if (shapeType != 201) {
                    str = com.aspose.words.internal.zzZKN.format("#_x0000_t{0}", Integer.valueOf(shapeBase.getShapeType()));
                } else {
                    zzZBL zzzblZzYrB = shapeBase.zzYrB();
                    str = com.aspose.words.internal.zzZKN.format("#_x0000_t{0}", Integer.valueOf((zzzblZzYrB == null || !zzzblZzYrB.isForms2OleControlInternal()) ? shapeBase.getShapeType() : 75));
                }
                str = null;
                z3 = false;
                if (z) {
                    str2 = "v:background";
                }
                zzy2u = new zzY2U(shapeBase, zzyu6, zzz8u);
                zzy25 = new zzY25(zzyu6, zzz8u);
                zzy2o = new zzY2O(shapeBase, zzyu6, zzz8u);
                zzy2e = new zzY2E(zzyu6, zzz8u);
                zzy2y = new zzY2Y(zzyu6, zzz8u);
                zzy2r = new zzY2R(shapeBase, zzyu6);
                zzY2S zzy2s = new zzY2S(zzyu6);
                zzY2N zzy2n = new zzY2N(zzyu6);
                z2 = z3;
                zzy31 = new zzY31(zzz8u, zzyu6);
                zzY36 zzy362 = new zzY36(zzyu6);
                zzY26 zzy262 = new zzY26(zzyu6);
                zzd3 = new com.aspose.words.internal.zzD3();
                str3 = str2;
                zzyc3ZzYvW = shapeBase.zzYvW();
                String str8 = str;
                i = 0;
                strZzWF = null;
                strZzWF2 = null;
                while (i < zzyc3ZzYvW.getCount()) {
                    int iZzT3 = zzyc3ZzYvW.zzT3(i);
                    Object objZzVY = zzyc3ZzYvW.zzVY(i);
                    switch (iZzT3 & (-64)) {
                        case 64:
                            i3 = i;
                            zzy2n.zzZP(iZzT3, objZzVY);
                            break;
                        case 192:
                            i3 = i;
                            zzy2s.zzZP(iZzT3, objZzVY);
                            break;
                        case 256:
                            i3 = i;
                            zzy2o.zzZP(iZzT3, objZzVY);
                            break;
                        case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6 /* 320 */:
                            i3 = i;
                            zzy2r.zzZP(iZzT3, objZzVY);
                            break;
                        case 384:
                            i3 = i;
                            zzy2u.zzZP(iZzT3, objZzVY);
                            break;
                        case 448:
                            i3 = i;
                            if (iZzT3 != 507) {
                                zzy25.zzZP(iZzT3, objZzVY);
                            } else {
                                zzy2r.zzZP(iZzT3, objZzVY);
                            }
                            break;
                        case 512:
                            i3 = i;
                            zzy2e.zzZP(iZzT3, objZzVY);
                            break;
                        case 640:
                        case 704:
                            i3 = i;
                            zzy2y.zzZP(iZzT3, objZzVY);
                            break;
                        case 832:
                            i3 = i;
                            zzy362.zzZP(iZzT3, objZzVY);
                            break;
                        case 1280:
                            i3 = i;
                            zzy31.zzZP(iZzT3, objZzVY);
                            break;
                        default:
                            i3 = i;
                            if (iZzT3 != 133) {
                                if (iZzT3 != 135) {
                                    if (iZzT3 != 190) {
                                        if (iZzT3 != 828) {
                                            if (iZzT3 != 916) {
                                                if (iZzT3 != 4096) {
                                                    if (iZzT3 != 777) {
                                                        if (iZzT3 != 778) {
                                                            if (iZzT3 != 4110) {
                                                                if (iZzT3 != 4111) {
                                                                    switch (iZzT3) {
                                                                        case 771:
                                                                            zzd3.set(iZzT3, zzY30.zziK(((Integer) objZzVY).intValue()));
                                                                            break;
                                                                        case 772:
                                                                        case 773:
                                                                        case 774:
                                                                            zzd3.set(iZzT3, zzY30.zzj8(((Integer) objZzVY).intValue()));
                                                                            break;
                                                                        default:
                                                                            switch (iZzT3) {
                                                                                case SQLitePersistence.MAX_ARGS /* 900 */:
                                                                                case 901:
                                                                                case 902:
                                                                                case 903:
                                                                                    zzd3.set(iZzT3, Double.valueOf(((double) ((Integer) objZzVY).intValue()) / 12700.0d));
                                                                                    break;
                                                                                default:
                                                                                    switch (iZzT3) {
                                                                                        case 911:
                                                                                            int iIntValue2 = ((Integer) objZzVY).intValue();
                                                                                            if (iIntValue2 != 0) {
                                                                                                zzd3.set(iZzT3, zzY8T.zztc(iIntValue2));
                                                                                            }
                                                                                            break;
                                                                                        case 912:
                                                                                            int iIntValue3 = ((Integer) objZzVY).intValue();
                                                                                            if (iIntValue3 != 2) {
                                                                                                zzd3.set(iZzT3, zzY8T.zztb(iIntValue3));
                                                                                            }
                                                                                            break;
                                                                                        case 913:
                                                                                            int iIntValue4 = ((Integer) objZzVY).intValue();
                                                                                            if (iIntValue4 != 0) {
                                                                                                zzd3.set(iZzT3, zzY8T.zztd(iIntValue4));
                                                                                            }
                                                                                            break;
                                                                                        case 914:
                                                                                            int iIntValue5 = ((Integer) objZzVY).intValue();
                                                                                            if (iIntValue5 != 2) {
                                                                                                zzd3.set(iZzT3, zzY8T.zzta(iIntValue5));
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            switch (iZzT3) {
                                                                                                case 1921:
                                                                                                case 1922:
                                                                                                case 1923:
                                                                                                case 1924:
                                                                                                case 1925:
                                                                                                case 1926:
                                                                                                case 1927:
                                                                                                case 1928:
                                                                                                    break;
                                                                                                default:
                                                                                                    switch (iZzT3) {
                                                                                                        case FieldType.FIELD_CITATION /* 1980 */:
                                                                                                        case 1981:
                                                                                                        case 1982:
                                                                                                        case 1983:
                                                                                                            break;
                                                                                                        case 1984:
                                                                                                        case 1985:
                                                                                                        case 1986:
                                                                                                        case 1987:
                                                                                                            zzd3.set(iZzT3, com.aspose.words.internal.zzJB.zzWD(((Integer) objZzVY).intValue()));
                                                                                                            break;
                                                                                                        case 1988:
                                                                                                            zzd3.set(iZzT3, zzY8T.zzkQ(((Integer) objZzVY).intValue()));
                                                                                                            break;
                                                                                                        case 1989:
                                                                                                            zzd3.set(iZzT3, zzY8T.zzkR(((Integer) objZzVY).intValue()));
                                                                                                            break;
                                                                                                        default:
                                                                                                            switch (iZzT3) {
                                                                                                                case 4102:
                                                                                                                case EditingLanguage.GERMAN_LUXEMBOURG /* 4103 */:
                                                                                                                case 4104:
                                                                                                                    zzy2o.zzZP(iZzT3, objZzVY);
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    switch (iZzT3) {
                                                                                                                        case 4125:
                                                                                                                        case 4126:
                                                                                                                        case 4127:
                                                                                                                        case 4128:
                                                                                                                            zzd3.set(iZzT3, objZzVY);
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            zzd3.set(iZzT3, objZzVY);
                                                                                                                            continue;
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            zzy262.zzZP(iZzT3, objZzVY);
                                                                                            break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    zzy25.zzZP(iZzT3, objZzVY);
                                                                    break;
                                                                }
                                                            } else {
                                                                zzy2u.zzZP(iZzT3, objZzVY);
                                                                break;
                                                            }
                                                        } else {
                                                            strZzWF2 = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                                                            break;
                                                        }
                                                    } else {
                                                        strZzWF = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                                                        break;
                                                    }
                                                } else {
                                                    zzd3.set(iZzT3, zzY30.zziG(((Integer) objZzVY).intValue()));
                                                    break;
                                                }
                                            } else {
                                                int iIntValue6 = ((Integer) objZzVY).intValue();
                                                if (iIntValue6 != 0) {
                                                    zzd3.set(iZzT3, zzY30.zzj6(iIntValue6));
                                                }
                                                break;
                                            }
                                        } else {
                                            zzy2n.zzZP(iZzT3, objZzVY);
                                            break;
                                        }
                                    } else {
                                        if (((Boolean) objZzVY).booleanValue()) {
                                            zzd3.set(iZzT3, "t");
                                        }
                                        break;
                                    }
                                } else {
                                    zzd3.set(iZzT3, zzY30.zziN(((Integer) objZzVY).intValue()));
                                    break;
                                }
                            } else {
                                zzd3.set(iZzT3, zzY30.zziM(((Integer) objZzVY).intValue()));
                                break;
                            }
                            break;
                    }
                    i = i3 + 1;
                }
                if (zzz8u.zzZmh() && zzd3.get(952) != null && ((Boolean) zzd3.get(952)).booleanValue()) {
                    String strZzYP = zzd3.get(922) != null ? (String) com.aspose.words.internal.zzZKW.zzZ(zzd3.get(922), String.class) : zzY30.zzYP(zzd3.get(920));
                    zzyu6.zzY("w:scriptAnchor");
                    zzyu6.zzZ("w:language", strZzYP);
                    zzyu6.zzZ("w:args", (String) com.aspose.words.internal.zzZKW.zzZ(zzd3.get(919), String.class));
                    zzyu6.zzZ("w:scriptText", (String) com.aspose.words.internal.zzZKW.zzZ(zzd3.get(910), String.class));
                    return;
                }
                if (z2) {
                    str4 = str8;
                    if (!zzz8u.zzZmM().contains(str4)) {
                        zzz8u.zzZmM().add(str4);
                        String strZzB5 = zzYBW.zzB5(str4);
                        if (com.aspose.words.internal.zzZYD.zzXk(strZzB5)) {
                            zzyu6.zzX(IOUtils.LINE_SEPARATOR_WINDOWS);
                            zzyu6.zzX(strZzB5);
                            zzyu6.zzX(IOUtils.LINE_SEPARATOR_WINDOWS);
                        }
                    }
                } else {
                    str4 = str8;
                }
                if (zzy2o.getImageBytes() != null) {
                    zzz8u2 = zzz8u;
                    zzy2o.zzzk(zzz8u2.zzYn(zzy2o.getImageBytes()));
                    if (com.aspose.words.internal.zzZYD.zzXk(zzy2o.zzXTd())) {
                        zzy36 = zzy362;
                        if (!com.aspose.words.internal.zzZKN.equals(zzy2o.zzXTd(), zzy2o.zzYfy())) {
                            zzy2o.zzzi(zzz8u2.zzNH(zzy2o.zzXTd()));
                        }
                    } else {
                        zzy36 = zzy362;
                    }
                } else {
                    zzz8u2 = zzz8u;
                    zzy36 = zzy362;
                    if (com.aspose.words.internal.zzZYD.zzXk(zzy2o.zzXTd())) {
                        zzy2o.zzzk(zzz8u2.zzNH(zzy2o.zzXTd()));
                    }
                }
                if (zzy2u.getImageBytes() != null) {
                    zzy2u.zzzk(zzz8u2.zzYn(zzy2u.getImageBytes()));
                }
                if (zzy25.getImageBytes() != null) {
                    zzy25.zzzk(zzz8u2.zzYn(zzy25.getImageBytes()));
                }
                zzY37 zzy37 = new zzY37(zzyu6);
                zzyu6.zzY(str3);
                if (shapeBase.getShapeType() == 100) {
                    String str9 = (String) zzd3.get(896);
                    if (com.aspose.words.internal.zzZYD.zzXk(str9)) {
                        zzy37.zzN("id", str9);
                        zzy37.zzN("o:spid", zzYU3.zzZR(shapeBase));
                    } else {
                        zzy37.zzN("id", zzYU3.zzZR(shapeBase));
                    }
                    if (zzy25.zzXSN() == null) {
                        zzy25.zzyZ("miter");
                    }
                    if (zzd3.get(4127) == null) {
                        zzd3.set(4127, Integer.valueOf(shapeBase.zzZyj()));
                    }
                    if (zzd3.get(4128) == null) {
                        zzd3.set(4128, Integer.valueOf(shapeBase.zzZyi()));
                    }
                } else if (!com.aspose.words.internal.zzZYD.zzXk((String) zzd3.get(896)) || zzz8u2.zzZqS().zzXoW) {
                    zzy37.zzN("id", zzYU3.zzZR(shapeBase));
                    zzy37.zzN(C18437z2.f56754h, str4);
                } else {
                    if (shapeBase.zzY9H()) {
                        zzy37.zzN("id", zzYU3.zzZR(shapeBase));
                    } else {
                        zzy37.zzN("id", zzd3.get(896));
                        zzy37.zzN("o:spid", zzYU3.zzZR(shapeBase));
                    }
                    zzy37.zzN(C18437z2.f56754h, str4);
                }
                if (com.aspose.words.internal.zzZYD.zzXk(zzy31.zzXTI())) {
                    zzy37.zzN("editas", zzy31.zzXTI());
                }
                if (zzd3.get(4127) == null) {
                    i2 = 4128;
                    if (zzd3.get(4128) != null) {
                        zzd3.set(4127, Integer.valueOf(shapeBase.zzZyj()));
                    }
                    strZzY1 = ShapeBase.zzY1((String) zzd3.get(4157), (String) zzd3.get(897));
                    if (shapeBase.isInline() || !shapeBase.isImage()) {
                        zzy37.zzN("href", zzd3.get(898));
                        zzy37.zzN("target", zzd3.get(4120));
                        zzy37.zzN(NoteMeta.PROPERTY_TITLE, zzd3.get(909));
                    }
                    if (com.aspose.words.internal.zzZYD.zzXk(strZzY1)) {
                        zzy37.zzN("alt", strZzY1);
                    }
                    if (z) {
                        zzY33 zzy33 = new zzY33();
                        if (shapeBase.zzZtk()) {
                            zzy252 = zzy25;
                            zzy33.add("width", zzY23.zzO(shapeBase.getWidth(), shapeBase.isTopLevel()));
                            zzy33.add("height", zzY23.zzO(shapeBase.getHeight(), shapeBase.isTopLevel()));
                            shapeBase2 = shapeBase;
                            zzy312 = zzy31;
                            zzy26 = zzy262;
                        } else {
                            zzy252 = zzy25;
                            if (!shapeBase.isInline()) {
                                zzy33.add(RequestParameters.POSITION, "absolute");
                            }
                            String str10 = shapeBase.isTopLevel() ? "margin-" : "";
                            if (shapeBase.getShapeType() != 20) {
                                if (shapeBase.isInline()) {
                                    zzy312 = zzy31;
                                    zzy26 = zzy262;
                                } else {
                                    if (shapeBase.isTopLevel() || shapeBase.getLeft() != 0.0d) {
                                        zzy312 = zzy31;
                                        zzy26 = zzy262;
                                        zzy33.add(str10.concat("left"), zzY23.zzO(shapeBase.getLeft(), shapeBase.isTopLevel()));
                                    } else {
                                        zzy312 = zzy31;
                                        zzy26 = zzy262;
                                    }
                                    if (shapeBase.isTopLevel() || shapeBase.getTop() != 0.0d) {
                                        zzy33.add(str10.concat("top"), zzY23.zzO(shapeBase.getTop(), shapeBase.isTopLevel()));
                                    }
                                }
                                zzy33.add("width", zzY23.zzO(shapeBase.getWidth(), shapeBase.isTopLevel()));
                                zzy33.add("height", zzY23.zzO(shapeBase.getHeight(), shapeBase.isTopLevel()));
                            } else {
                                zzy312 = zzy31;
                                zzy26 = zzy262;
                            }
                            Object obj = zzd3.get(4);
                            if (obj != null && (iIntValue = ((Integer) obj).intValue()) != 0) {
                                zzy33.add("rotation", zzY23.zzie(iIntValue));
                            }
                            if (com.aspose.words.internal.zzZYD.zzXk((String) zzd3.get(4096))) {
                                zzy33.add("flip", (String) zzd3.get(4096));
                            }
                            if (!shapeBase.isTopLevel() || shapeBase.isInline()) {
                                shapeBase2 = shapeBase;
                            } else {
                                shapeBase2 = shapeBase;
                                zzy33.add("z-index", zzz8u2.zzZqS().zzYL(shapeBase2));
                            }
                            if (zzd3.get(958) != null) {
                                zzy33.add("visibility", ((Boolean) zzd3.get(958)).booleanValue() ? "hidden" : "visible");
                            }
                            if (zzd3.get(953) != null) {
                                zzy33.add("mso-wrap-edited", ((Boolean) zzd3.get(953)).booleanValue() ? "" : "f");
                            }
                            zzy33.add("mso-wrap-distance-left", zzY23.zzV(zzd3.get(SQLitePersistence.MAX_ARGS), shapeBase2.isTopLevel()));
                            zzy33.add("mso-wrap-distance-top", zzY23.zzV(zzd3.get(901), shapeBase2.isTopLevel()));
                            zzy33.add("mso-wrap-distance-right", zzY23.zzV(zzd3.get(902), shapeBase2.isTopLevel()));
                            zzy33.add("mso-wrap-distance-bottom", zzY23.zzV(zzd3.get(903), shapeBase2.isTopLevel()));
                            zzy33.add("mso-position-horizontal", (String) zzd3.get(911));
                            zzy33.add("mso-position-horizontal-relative", (String) zzd3.get(912));
                            zzy33.add("mso-position-vertical", (String) zzd3.get(913));
                            zzy33.add("mso-position-vertical-relative", (String) zzd3.get(914));
                            if (zzz8u2.zzZmh()) {
                                zzy33.add("mso-left-percent", (String) zzd3.get(1986));
                                zzy33.add("mso-top-percent", (String) zzd3.get(1987));
                                zzy33.add("mso-width-percent", (String) zzd3.get(1984));
                                zzy33.add("mso-height-percent", (String) zzd3.get(1985));
                                zzy33.add("mso-width-relative", (String) zzd3.get(1988));
                                zzy33.add("mso-height-relative", (String) zzd3.get(1989));
                            }
                            zzy33.add("mso-wrap-style", (String) zzd3.get(133));
                            zzy33.add("v-text-anchor", (String) zzd3.get(135));
                        }
                        zzyu6.zz0("style", zzy33.zzZXu());
                    } else {
                        shapeBase2 = shapeBase;
                        zzy252 = zzy25;
                        zzy312 = zzy31;
                        zzy26 = zzy262;
                    }
                    if (zzd3.get(780) != null) {
                        zzyu6.zz0("equationxml", com.aspose.words.internal.zzZO0.zzhV().zzZn((byte[]) zzd3.get(780)));
                    }
                    zzyu6.zzP("w:themeColor", zzd3.get(4147));
                    zzyu6.zzP("w:themeShade", zzd3.get(4148));
                    zzyu6.zzP("w:themeTint", zzd3.get(4149));
                    zzyu6.zzP("o:bwmode", zzd3.get(772));
                    zzyu6.zzP("o:bwpure", zzd3.get(773));
                    zzyu6.zzP("o:bwnormal", zzd3.get(774));
                    if (!z) {
                        zzy37.zzN("o:oleicon", zzd3.get(826));
                    }
                    if (shapeBase2.isInline() && shapeBase2.zzZid()) {
                        zzyu6.zzX("o:ole", "");
                    }
                    if (shapeBase2.isInline()) {
                        zzyu6.zz0("o:bordertopcolor", zzY23.zzZ((Border) zzd3.get(EditingLanguage.SPANISH_GUATEMALA), zzz8u2));
                        zzyu6.zz0("o:borderleftcolor", zzY23.zzZ((Border) zzd3.get(4107), zzz8u2));
                        zzyu6.zz0("o:borderbottomcolor", zzY23.zzZ((Border) zzd3.get(EditingLanguage.FRENCH_SWITZERLAND), zzz8u2));
                        zzyu6.zz0("o:borderrightcolor", zzY23.zzZ((Border) zzd3.get(4109), zzz8u2));
                    }
                    if (shapeBase2.getShapeType() == 20) {
                        zzZ(shapeBase2, zzy37);
                    }
                    if (shapeBase2.getShapeType() == 2) {
                        zzy37.zzN("arcsize", zzY23.zzif(zzY0(shapeBase2)));
                    }
                    zzZ(zzyu6, zzd3, 4125, 4126, "coordorigin");
                    zzZ(zzyu6, zzd3, 4127, 4128, "coordsize");
                    Object obj2 = zzd3.get(944);
                    Boolean bool = Boolean.TRUE;
                    zzy37.zzX("o:allowincell", obj2, bool);
                    zzy37.zzX("o:allowoverlap", zzd3.get(950), bool);
                    if (shapeBase2.getShapeType() == 100) {
                        zzy37.zzN("o:spt", PerfConstants.ScenarioConstants.SCENARIO_NON_BROKERED_ACQUIRE_TOKEN_SILENTLY);
                    }
                    str5 = strZzWF;
                    if (str5 != null) {
                        zzyu6.zz0("o:dgmlayout", str5);
                    }
                    str6 = strZzWF2;
                    if (str6 != null) {
                        zzyu6.zz0("o:dgmnodekind", str6);
                    }
                    zzy37.zzN("o:connectortype", zzd3.get(771));
                    zzy2r.zzXTA();
                    zzy2r.zzXTz();
                    zzy37.zzN("o:preferrelative", zzd3.get(827));
                    zzy37.zzN("o:button", zzd3.get(956));
                    zzy37.zzN("o:hrpct", zzd3.get(915));
                    zzy37.zzN("o:hralign", zzd3.get(916));
                    zzy37.zzN("o:hrstd", zzd3.get(946));
                    zzy37.zzN("o:hrnoshade", zzd3.get(947));
                    zzy37.zzN("o:hr", zzd3.get(948));
                    zzy37.zzN("o:bullet", zzd3.get(945));
                    zzZ(zzyu6, (zzYM5[]) zzd3.get(899));
                    zzy2u.zzXTD();
                    if (!z) {
                        zzy252.zzXTD();
                    }
                    zzy2u.zzIg();
                    zzy252.zzIg();
                    zzy2o.zzIg();
                    zzy2e.zzIg();
                    zzy2y.zzIg();
                    if (!"v:shape".equals(str3) || "v:rect".equals(str3)) {
                        zzy2r.zzXTy();
                        zzy2r.zzXTx();
                        zzy2s.zzIg();
                        zzy2r.zzXTo();
                    }
                    if (!z) {
                        zzy2n.zzIg();
                    }
                    if (shapeBase2.zzZik() != null) {
                        zzyu6.zzY("o:ink");
                        zzyu6.zzU(ContextChain.TAG_INFRA, shapeBase2.zzZik());
                        zzy37.zzN("annotation", Boolean.valueOf(shapeBase2.zzY9z()));
                        zzyu6.zzp();
                    }
                    zzy26.zzIg();
                    zzy312.zzXTJ();
                    zzy36.zzIg();
                    zzZ("w10:bordertop", zzd3.get(EditingLanguage.SPANISH_GUATEMALA), zzyu6);
                    zzZ("w10:borderleft", zzd3.get(4107), zzyu6);
                    zzZ("w10:borderbottom", zzd3.get(EditingLanguage.FRENCH_SWITZERLAND), zzyu6);
                    zzZ("w10:borderright", zzd3.get(4109), zzyu6);
                    boolean zContains = zzz8u2.zzZqS().zzXoY.contains(Integer.valueOf(shapeBase2.getId()));
                    if (shapeBase2.isGroup()) {
                        if (shapeBase2.hasChildNodes() || zContains) {
                            zzyu6.zzY("v:textbox");
                            zzY33 zzy332 = new zzY33();
                            if (zzd3.zzVE(136)) {
                                int iIntValue7 = ((Integer) zzd3.get(136)).intValue();
                                if (iIntValue7 == 2) {
                                    zzy332.add("layout-flow", "vertical");
                                    zzy332.add("mso-layout-flow-alt", "bottom-to-top");
                                } else {
                                    zzy332.add("layout-flow", zzY30.zziO(iIntValue7));
                                }
                            }
                            int iZzY9A = shapeBase2.zzY9A();
                            if (iZzY9A != 0) {
                                ShapeBase shapeBase3 = zzz8u2.zzZqS().zzXoZ.get(iZzY9A);
                                zzy332.add("mso-next-textbox", (!com.aspose.words.internal.zzZYD.zzXk(shapeBase3.getName()) || zzz8u2.zzZqS().zzXoW) ? com.aspose.words.internal.zzZKN.format("#{0}", zzYU3.zzZR(shapeBase3)) : com.aspose.words.internal.zzZKN.format("#{0}", shapeBase3.getName()));
                            }
                            zzy332.add("mso-fit-shape-to-text", (String) zzd3.get(190));
                            zzy37.zzN("style", zzy332.zzZXu());
                            zzy37.zzN("inset", zzY23.zzQ(zzd3));
                            zzyu6.zzY("w:txbxContent");
                            if (shapeBase2.hasChildNodes() || !zContains) {
                                return;
                            }
                            zzyu6.zzo();
                            zzyu6.zzo();
                            return;
                        }
                        return;
                    }
                    return;
                }
                i2 = 4128;
                if (zzd3.get(4127) != null && zzd3.get(i2) == null) {
                    zzd3.set(i2, Integer.valueOf(shapeBase.zzZyi()));
                }
                strZzY1 = ShapeBase.zzY1((String) zzd3.get(4157), (String) zzd3.get(897));
                if (shapeBase.isInline()) {
                    zzy37.zzN("href", zzd3.get(898));
                    zzy37.zzN("target", zzd3.get(4120));
                    zzy37.zzN(NoteMeta.PROPERTY_TITLE, zzd3.get(909));
                }
                if (com.aspose.words.internal.zzZYD.zzXk(strZzY1)) {
                }
                if (z) {
                }
                if (zzd3.get(780) != null) {
                }
                zzyu6.zzP("w:themeColor", zzd3.get(4147));
                zzyu6.zzP("w:themeShade", zzd3.get(4148));
                zzyu6.zzP("w:themeTint", zzd3.get(4149));
                zzyu6.zzP("o:bwmode", zzd3.get(772));
                zzyu6.zzP("o:bwpure", zzd3.get(773));
                zzyu6.zzP("o:bwnormal", zzd3.get(774));
                if (!z) {
                }
                if (shapeBase2.isInline()) {
                    zzyu6.zzX("o:ole", "");
                }
                if (shapeBase2.isInline()) {
                }
                if (shapeBase2.getShapeType() == 20) {
                }
                if (shapeBase2.getShapeType() == 2) {
                }
                zzZ(zzyu6, zzd3, 4125, 4126, "coordorigin");
                zzZ(zzyu6, zzd3, 4127, 4128, "coordsize");
                Object obj22 = zzd3.get(944);
                Boolean bool2 = Boolean.TRUE;
                zzy37.zzX("o:allowincell", obj22, bool2);
                zzy37.zzX("o:allowoverlap", zzd3.get(950), bool2);
                if (shapeBase2.getShapeType() == 100) {
                }
                str5 = strZzWF;
                if (str5 != null) {
                }
                str6 = strZzWF2;
                if (str6 != null) {
                }
                zzy37.zzN("o:connectortype", zzd3.get(771));
                zzy2r.zzXTA();
                zzy2r.zzXTz();
                zzy37.zzN("o:preferrelative", zzd3.get(827));
                zzy37.zzN("o:button", zzd3.get(956));
                zzy37.zzN("o:hrpct", zzd3.get(915));
                zzy37.zzN("o:hralign", zzd3.get(916));
                zzy37.zzN("o:hrstd", zzd3.get(946));
                zzy37.zzN("o:hrnoshade", zzd3.get(947));
                zzy37.zzN("o:hr", zzd3.get(948));
                zzy37.zzN("o:bullet", zzd3.get(945));
                zzZ(zzyu6, (zzYM5[]) zzd3.get(899));
                zzy2u.zzXTD();
                if (!z) {
                }
                zzy2u.zzIg();
                zzy252.zzIg();
                zzy2o.zzIg();
                zzy2e.zzIg();
                zzy2y.zzIg();
                if (!"v:shape".equals(str3)) {
                    zzy2r.zzXTy();
                    zzy2r.zzXTx();
                    zzy2s.zzIg();
                    zzy2r.zzXTo();
                }
                if (!z) {
                }
                if (shapeBase2.zzZik() != null) {
                }
                zzy26.zzIg();
                zzy312.zzXTJ();
                zzy36.zzIg();
                zzZ("w10:bordertop", zzd3.get(EditingLanguage.SPANISH_GUATEMALA), zzyu6);
                zzZ("w10:borderleft", zzd3.get(4107), zzyu6);
                zzZ("w10:borderbottom", zzd3.get(EditingLanguage.FRENCH_SWITZERLAND), zzyu6);
                zzZ("w10:borderright", zzd3.get(4109), zzyu6);
                boolean zContains2 = zzz8u2.zzZqS().zzXoY.contains(Integer.valueOf(shapeBase2.getId()));
                if (shapeBase2.isGroup()) {
                }
            } else {
                str7 = "v:group";
            }
            str2 = str7;
            str = null;
            z3 = false;
            if (z) {
            }
            zzy2u = new zzY2U(shapeBase, zzyu6, zzz8u);
            zzy25 = new zzY25(zzyu6, zzz8u);
            zzy2o = new zzY2O(shapeBase, zzyu6, zzz8u);
            zzy2e = new zzY2E(zzyu6, zzz8u);
            zzy2y = new zzY2Y(zzyu6, zzz8u);
            zzy2r = new zzY2R(shapeBase, zzyu6);
            zzY2S zzy2s2 = new zzY2S(zzyu6);
            zzY2N zzy2n2 = new zzY2N(zzyu6);
            z2 = z3;
            zzy31 = new zzY31(zzz8u, zzyu6);
            zzY36 zzy3622 = new zzY36(zzyu6);
            zzY26 zzy2622 = new zzY26(zzyu6);
            zzd3 = new com.aspose.words.internal.zzD3();
            str3 = str2;
            zzyc3ZzYvW = shapeBase.zzYvW();
            String str82 = str;
            i = 0;
            strZzWF = null;
            strZzWF2 = null;
            while (i < zzyc3ZzYvW.getCount()) {
            }
            if (zzz8u.zzZmh()) {
            }
            if (z2) {
            }
            if (zzy2o.getImageBytes() != null) {
            }
            if (zzy2u.getImageBytes() != null) {
            }
            if (zzy25.getImageBytes() != null) {
            }
            zzY37 zzy372 = new zzY37(zzyu6);
            zzyu6.zzY(str3);
            if (shapeBase.getShapeType() == 100) {
            }
            if (com.aspose.words.internal.zzZYD.zzXk(zzy31.zzXTI())) {
            }
            if (zzd3.get(4127) == null) {
            }
            if (zzd3.get(4127) != null) {
                zzd3.set(i2, Integer.valueOf(shapeBase.zzZyi()));
            }
            strZzY1 = ShapeBase.zzY1((String) zzd3.get(4157), (String) zzd3.get(897));
            if (shapeBase.isInline()) {
            }
            if (com.aspose.words.internal.zzZYD.zzXk(strZzY1)) {
            }
            if (z) {
            }
            if (zzd3.get(780) != null) {
            }
            zzyu6.zzP("w:themeColor", zzd3.get(4147));
            zzyu6.zzP("w:themeShade", zzd3.get(4148));
            zzyu6.zzP("w:themeTint", zzd3.get(4149));
            zzyu6.zzP("o:bwmode", zzd3.get(772));
            zzyu6.zzP("o:bwpure", zzd3.get(773));
            zzyu6.zzP("o:bwnormal", zzd3.get(774));
            if (!z) {
            }
            if (shapeBase2.isInline()) {
            }
            if (shapeBase2.isInline()) {
            }
            if (shapeBase2.getShapeType() == 20) {
            }
            if (shapeBase2.getShapeType() == 2) {
            }
            zzZ(zzyu6, zzd3, 4125, 4126, "coordorigin");
            zzZ(zzyu6, zzd3, 4127, 4128, "coordsize");
            Object obj222 = zzd3.get(944);
            Boolean bool22 = Boolean.TRUE;
            zzy372.zzX("o:allowincell", obj222, bool22);
            zzy372.zzX("o:allowoverlap", zzd3.get(950), bool22);
            if (shapeBase2.getShapeType() == 100) {
            }
            str5 = strZzWF;
            if (str5 != null) {
            }
            str6 = strZzWF2;
            if (str6 != null) {
            }
            zzy372.zzN("o:connectortype", zzd3.get(771));
            zzy2r.zzXTA();
            zzy2r.zzXTz();
            zzy372.zzN("o:preferrelative", zzd3.get(827));
            zzy372.zzN("o:button", zzd3.get(956));
            zzy372.zzN("o:hrpct", zzd3.get(915));
            zzy372.zzN("o:hralign", zzd3.get(916));
            zzy372.zzN("o:hrstd", zzd3.get(946));
            zzy372.zzN("o:hrnoshade", zzd3.get(947));
            zzy372.zzN("o:hr", zzd3.get(948));
            zzy372.zzN("o:bullet", zzd3.get(945));
            zzZ(zzyu6, (zzYM5[]) zzd3.get(899));
            zzy2u.zzXTD();
            if (!z) {
            }
            zzy2u.zzIg();
            zzy252.zzIg();
            zzy2o.zzIg();
            zzy2e.zzIg();
            zzy2y.zzIg();
            if (!"v:shape".equals(str3)) {
            }
            if (!z) {
            }
            if (shapeBase2.zzZik() != null) {
            }
            zzy26.zzIg();
            zzy312.zzXTJ();
            zzy36.zzIg();
            zzZ("w10:bordertop", zzd3.get(EditingLanguage.SPANISH_GUATEMALA), zzyu6);
            zzZ("w10:borderleft", zzd3.get(4107), zzyu6);
            zzZ("w10:borderbottom", zzd3.get(EditingLanguage.FRENCH_SWITZERLAND), zzyu6);
            zzZ("w10:borderright", zzd3.get(4109), zzyu6);
            boolean zContains22 = zzz8u2.zzZqS().zzXoY.contains(Integer.valueOf(shapeBase2.getId()));
            if (shapeBase2.isGroup()) {
            }
        } else {
            str = com.aspose.words.internal.zzZKN.format("#_x0000_t{0}", 75);
        }
        str2 = "v:shape";
        if (z) {
        }
        zzy2u = new zzY2U(shapeBase, zzyu6, zzz8u);
        zzy25 = new zzY25(zzyu6, zzz8u);
        zzy2o = new zzY2O(shapeBase, zzyu6, zzz8u);
        zzy2e = new zzY2E(zzyu6, zzz8u);
        zzy2y = new zzY2Y(zzyu6, zzz8u);
        zzy2r = new zzY2R(shapeBase, zzyu6);
        zzY2S zzy2s22 = new zzY2S(zzyu6);
        zzY2N zzy2n22 = new zzY2N(zzyu6);
        z2 = z3;
        zzy31 = new zzY31(zzz8u, zzyu6);
        zzY36 zzy36222 = new zzY36(zzyu6);
        zzY26 zzy26222 = new zzY26(zzyu6);
        zzd3 = new com.aspose.words.internal.zzD3();
        str3 = str2;
        zzyc3ZzYvW = shapeBase.zzYvW();
        String str822 = str;
        i = 0;
        strZzWF = null;
        strZzWF2 = null;
        while (i < zzyc3ZzYvW.getCount()) {
        }
        if (zzz8u.zzZmh()) {
        }
        if (z2) {
        }
        if (zzy2o.getImageBytes() != null) {
        }
        if (zzy2u.getImageBytes() != null) {
        }
        if (zzy25.getImageBytes() != null) {
        }
        zzY37 zzy3722 = new zzY37(zzyu6);
        zzyu6.zzY(str3);
        if (shapeBase.getShapeType() == 100) {
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzy31.zzXTI())) {
        }
        if (zzd3.get(4127) == null) {
        }
        if (zzd3.get(4127) != null) {
        }
        strZzY1 = ShapeBase.zzY1((String) zzd3.get(4157), (String) zzd3.get(897));
        if (shapeBase.isInline()) {
        }
        if (com.aspose.words.internal.zzZYD.zzXk(strZzY1)) {
        }
        if (z) {
        }
        if (zzd3.get(780) != null) {
        }
        zzyu6.zzP("w:themeColor", zzd3.get(4147));
        zzyu6.zzP("w:themeShade", zzd3.get(4148));
        zzyu6.zzP("w:themeTint", zzd3.get(4149));
        zzyu6.zzP("o:bwmode", zzd3.get(772));
        zzyu6.zzP("o:bwpure", zzd3.get(773));
        zzyu6.zzP("o:bwnormal", zzd3.get(774));
        if (!z) {
        }
        if (shapeBase2.isInline()) {
        }
        if (shapeBase2.isInline()) {
        }
        if (shapeBase2.getShapeType() == 20) {
        }
        if (shapeBase2.getShapeType() == 2) {
        }
        zzZ(zzyu6, zzd3, 4125, 4126, "coordorigin");
        zzZ(zzyu6, zzd3, 4127, 4128, "coordsize");
        Object obj2222 = zzd3.get(944);
        Boolean bool222 = Boolean.TRUE;
        zzy3722.zzX("o:allowincell", obj2222, bool222);
        zzy3722.zzX("o:allowoverlap", zzd3.get(950), bool222);
        if (shapeBase2.getShapeType() == 100) {
        }
        str5 = strZzWF;
        if (str5 != null) {
        }
        str6 = strZzWF2;
        if (str6 != null) {
        }
        zzy3722.zzN("o:connectortype", zzd3.get(771));
        zzy2r.zzXTA();
        zzy2r.zzXTz();
        zzy3722.zzN("o:preferrelative", zzd3.get(827));
        zzy3722.zzN("o:button", zzd3.get(956));
        zzy3722.zzN("o:hrpct", zzd3.get(915));
        zzy3722.zzN("o:hralign", zzd3.get(916));
        zzy3722.zzN("o:hrstd", zzd3.get(946));
        zzy3722.zzN("o:hrnoshade", zzd3.get(947));
        zzy3722.zzN("o:hr", zzd3.get(948));
        zzy3722.zzN("o:bullet", zzd3.get(945));
        zzZ(zzyu6, (zzYM5[]) zzd3.get(899));
        zzy2u.zzXTD();
        if (!z) {
        }
        zzy2u.zzIg();
        zzy252.zzIg();
        zzy2o.zzIg();
        zzy2e.zzIg();
        zzy2y.zzIg();
        if (!"v:shape".equals(str3)) {
        }
        if (!z) {
        }
        if (shapeBase2.zzZik() != null) {
        }
        zzy26.zzIg();
        zzy312.zzXTJ();
        zzy36.zzIg();
        zzZ("w10:bordertop", zzd3.get(EditingLanguage.SPANISH_GUATEMALA), zzyu6);
        zzZ("w10:borderleft", zzd3.get(4107), zzyu6);
        zzZ("w10:borderbottom", zzd3.get(EditingLanguage.FRENCH_SWITZERLAND), zzyu6);
        zzZ("w10:borderright", zzd3.get(4109), zzyu6);
        boolean zContains222 = zzz8u2.zzZqS().zzXoY.contains(Integer.valueOf(shapeBase2.getId()));
        if (shapeBase2.isGroup()) {
        }
    }

    private static void zzZ(zzYU6 zzyu6, zzYM5[] zzym5Arr) {
        if (zzym5Arr == null || zzym5Arr.length <= 0) {
            return;
        }
        zzyu6.zz0("wrapcoords", zzY23.zzZ(zzym5Arr, ControlChar.SPACE_CHAR, ControlChar.SPACE_CHAR));
    }

    private static void zzZ(zzYU6 zzyu6, com.aspose.words.internal.zzD3<Object> zzd3, int i, int i2, String str) {
        Object obj = zzd3.get(i);
        Object obj2 = zzd3.get(i2);
        if (obj == null || obj2 == null) {
            return;
        }
        new zzY37(zzyu6).zzN(str, zzY23.zzXc(com.aspose.words.internal.zzZPZ.zzZm(((Integer) obj).intValue(), ((Integer) obj2).intValue())));
    }

    public static void zzZ(ShapeBase shapeBase, zzYU6 zzyu6) {
        zzYC3 zzyc3ZzYvW = shapeBase.zzYvW();
        String strZziF = zzyc3ZzYvW.contains(EditingLanguage.ARABIC_LIBYA) ? zzY30.zziF(shapeBase.getWrapType()) : "";
        if (shapeBase.zzYvW().contains(EditingLanguage.ARABIC_LIBYA)) {
            zzY37 zzy37 = new zzY37(zzyu6);
            String strZztb = zzY8T.zztb(shapeBase.getRelativeHorizontalPosition());
            if ("text".equals(strZztb)) {
                strZztb = "";
            }
            String strZzta = zzY8T.zzta(shapeBase.getRelativeVerticalPosition());
            if ("text".equals(strZzta)) {
                strZzta = "";
            }
            String strZziL = zzyc3ZzYvW.contains(InputDeviceCompat.SOURCE_TOUCHSCREEN) ? zzY30.zziL(shapeBase.getWrapSide()) : "";
            if (shapeBase.isInline()) {
                if ("char".equals(strZztb) && "line".equals(strZzta) && com.aspose.words.internal.zzZYD.zzXk(strZziF)) {
                    zzyu6.zzY("w10:wrap");
                    zzy37.zzN(C18437z2.f56754h, strZziF);
                    zzyu6.zzp();
                }
            } else {
                if (com.aspose.words.internal.zzZYD.zzXk(strZziF)) {
                    zzyu6.zzY("w10:wrap");
                    zzy37.zzN(C18437z2.f56754h, strZziF);
                    zzy37.zzN("side", strZziL);
                } else if (com.aspose.words.internal.zzZYD.zzXk(strZztb) || com.aspose.words.internal.zzZYD.zzXk(strZzta)) {
                    boolean zZzXk = com.aspose.words.internal.zzZYD.zzXk(strZziL);
                    boolean zZzz1 = zzz1(strZztb);
                    boolean zZzz12 = zzz1(strZzta);
                    if (zZzXk || zZzz1 || zZzz12) {
                        zzyu6.zzY("w10:wrap");
                        zzy37.zzN("side", strZziL);
                        if (zZzz1) {
                            zzy37.zzN("anchorx", strZztb);
                        }
                        if (zZzz12) {
                            zzy37.zzN("anchory", strZzta);
                        }
                    }
                }
                zzyu6.zzp();
            }
        }
        if (shapeBase.getAnchorLocked()) {
            zzyu6.zzZ("w10:anchorlock", (String) null);
        }
    }

    private static void zzZ(String str, Object obj, zzYU6 zzyu6) {
        if (obj instanceof Border) {
            Border border = (Border) obj;
            if (border.getLineStyle() != 0) {
                zzyu6.zzY(str);
                zzyu6.zz0(C18437z2.f56754h, zzY30.zzj3(border.getLineStyle()));
                zzyu6.zz0("width", com.aspose.words.internal.zzJB.zzZU(border.getLineWidth() * 8.0d));
                zzyu6.zz0("shadow", zzY23.zzW(Boolean.valueOf(border.getShadow()), false));
                zzyu6.zzp();
            }
        }
    }

    private static void zzZ(ShapeBase shapeBase, zzY37 zzy37) {
        double[] dArrZzX = zzY23.zzX(shapeBase, shapeBase.getTop(), shapeBase.getLeft(), shapeBase.getWidth(), shapeBase.getHeight());
        double left = dArrZzX.length > 0 ? dArrZzX[0] : shapeBase.getLeft();
        double top = dArrZzX.length > 0 ? dArrZzX[1] : shapeBase.getTop();
        double left2 = dArrZzX.length > 0 ? dArrZzX[2] : shapeBase.getLeft() + shapeBase.getWidth();
        double top2 = dArrZzX.length > 0 ? dArrZzX[3] : shapeBase.getTop() + shapeBase.getHeight();
        zzy37.zzN(Constants.MessagePayloadKeys.FROM, zzY23.zzW(left, top, shapeBase.isTopLevel()));
        zzy37.zzN("to", zzY23.zzW(left2, top2, shapeBase.isTopLevel()));
    }
}
