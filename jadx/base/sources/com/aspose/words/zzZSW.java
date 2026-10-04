package com.aspose.words;

import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.InputDeviceCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.firebase.firestore.local.SQLitePersistence;

/* JADX INFO: loaded from: classes6.dex */
final class zzZSW {
    private zzZTN zzYJC;
    private int zzYJa;
    private int zzYJb;
    private int zzYJc;
    private int zzYJd;
    private int zzYJe;
    private int zzYJf;
    private int zzYJg;
    private int zzYJh;
    private int zzYJi;
    private int zzYJj;
    private int zzYJk;
    private int zzYJl;
    private int zzYJm;
    private int zzYJn;
    private int zzYJo;
    private int zzYJp;
    private int zzYJq;
    private int zzYJr;
    private int zzYJs;
    private int zzYJt;
    private zzZT8 zzYJu;
    private zzZT8 zzYJv;
    private ShapeBase zzZBi;

    public zzZSW(zzZTN zzztn) {
        this.zzYJC = zzztn;
    }

    private void zzA(int i, Object obj) {
        if (i == 282 || i == 283 || i == 285) {
            this.zzYJu.zzXM(i, ((Integer) obj).intValue());
            return;
        }
        if (i == 313) {
            this.zzYJo = zzP(this.zzYJo, zzZTH.zzE9(i), ((Boolean) obj).booleanValue());
            return;
        }
        switch (i) {
            case 256:
            case 257:
            case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
            case StyleIdentifier.COLORFUL_GRID_ACCENT_6 /* 259 */:
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
            case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
            case StyleIdentifier.INTENSE_EMPHASIS /* 261 */:
                this.zzZBi.setShapeAttr(i, obj);
                break;
            default:
                switch (i) {
                    case StyleIdentifier.INTENSE_REFERENCE /* 263 */:
                        this.zzYJv.zzXM(i, zzY0E.zzZD((com.aspose.words.internal.zzPV) obj));
                        break;
                    case StyleIdentifier.BOOK_TITLE /* 264 */:
                    case StyleIdentifier.BIBLIOGRAPHY /* 265 */:
                    case StyleIdentifier.TOC_HEADING /* 266 */:
                        this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                        break;
                    case StyleIdentifier.PLAIN_TABLE_1 /* 267 */:
                        this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                        break;
                    case StyleIdentifier.PLAIN_TABLE_2 /* 268 */:
                    case StyleIdentifier.PLAIN_TABLE_3 /* 269 */:
                    case 270:
                        this.zzYJv.zzXM(i, zzY0E.zzZD((com.aspose.words.internal.zzPV) obj));
                        break;
                    default:
                        switch (i) {
                            case StyleIdentifier.GRID_TABLE_2_ACCENT_6 /* 316 */:
                            case StyleIdentifier.GRID_TABLE_3_ACCENT_6 /* 317 */:
                            case StyleIdentifier.GRID_TABLE_4_ACCENT_6 /* 318 */:
                            case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6 /* 319 */:
                                this.zzYJp = zzP(this.zzYJp, zzZTH.zzE9(i), ((Boolean) obj).booleanValue());
                                break;
                            default:
                                zzE1(i);
                                break;
                        }
                        break;
                }
                break;
        }
    }

    private void zzB(int i, Object obj) {
        switch (i) {
            case 192:
            case 193:
            case 197:
                this.zzYJv.zzC(i, (String) obj);
                break;
            case 194:
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
            case 195:
            case 196:
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
            default:
                switch (i) {
                    case 240:
                    case 241:
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
                        this.zzYJr = zzP(this.zzYJr, zzZTH.zzE9(i), ((Boolean) obj).booleanValue());
                        break;
                    default:
                        zzE1(i);
                        break;
                }
                break;
        }
    }

    private void zzC(int i, Object obj) {
        switch (i) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 134:
            case 138:
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
            case 133:
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
            case 135:
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
            case 136:
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
            case 137:
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
            case 139:
            case 140:
            case 141:
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
            case 142:
                break;
            default:
                switch (i) {
                    case 187:
                    case 188:
                    case 189:
                    case 190:
                    case 191:
                        this.zzYJs = zzP(this.zzYJs, zzZTH.zzE9(i), ((Boolean) obj).booleanValue());
                        break;
                    default:
                        zzE1(i);
                        break;
                }
                break;
        }
    }

    private void zzD(int i, Object obj) {
        switch (i) {
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
                this.zzYJt = zzP(this.zzYJt, zzZTH.zzE9(i), ((Boolean) obj).booleanValue());
                break;
            default:
                zzE1(i);
                break;
        }
    }

    private void zzE(int i, Object obj) {
        if (i != 4) {
            zzE1(i);
        } else {
            this.zzYJv.zzXM(i, ((Integer) obj).intValue());
        }
    }

    private void zzE1(int i) {
        if (i == 1343 || i == 4160 || i == 4161) {
            return;
        }
        zzY("Unknown OfficeArt property found 0x{0:x4}, ignored.", Integer.valueOf(i));
        com.aspose.words.internal.zzZKN.format("Unknown shape property id:{0}.", Integer.valueOf(i));
    }

    private static int zzP(int i, int i2, boolean z) {
        return com.aspose.words.internal.zzXU.zzZ(i, i2, z) | (i2 << 16);
    }

    private void zzY(String str, Object... objArr) {
        this.zzYJC.zzTG(com.aspose.words.internal.zzZKN.format(str, objArr));
    }

    private void zzj(int i, Object obj) {
        switch (i) {
            case 1921:
            case 1922:
            case 1923:
            case 1924:
            case 1925:
            case 1926:
            case 1927:
            case 1928:
                this.zzYJv.zzC(i, (String) obj);
                break;
            default:
                switch (i) {
                    case FieldType.FIELD_CITATION /* 1980 */:
                    case 1981:
                    case 1982:
                    case 1983:
                        this.zzYJa = zzP(this.zzYJa, zzZTH.zzE9(i), ((Boolean) obj).booleanValue());
                        break;
                    default:
                        this.zzYJC.zzTG(com.aspose.words.internal.zzZKN.format("Unsupported OfficeArt property 0x{0:x4}, ignored.", Integer.valueOf(i)));
                        break;
                }
                break;
        }
    }

    private void zzk(int i, Object obj) {
        if (i == 1792) {
            this.zzYJv.zzZ(new zzZTB((byte[]) obj));
            this.zzYJv.zzXM(1855, this.zzZBi.zzY9z() ? 589833 : 589825);
        } else if (i != 1855) {
            this.zzYJC.zzTG(com.aspose.words.internal.zzZKN.format("Unsupported OfficeArt property 0x{0:x4}, ignored.", Integer.valueOf(i)));
        }
    }

    private void zzl(int i, Object obj) throws Exception {
        switch (i) {
            case 1984:
            case 1985:
            case 1986:
            case 1987:
            case 1988:
            case 1989:
                break;
            default:
                switch (i) {
                    case 4096:
                    case InputDeviceCompat.SOURCE_TOUCHSCREEN /* 4098 */:
                    case 4099:
                        break;
                    case EditingLanguage.ARABIC_LIBYA /* 4097 */:
                        if (this.zzZBi.zzY9y()) {
                            this.zzYJb = zzP(this.zzYJb, 1, true);
                        }
                        break;
                    default:
                        switch (i) {
                            case 4102:
                                this.zzYJv.zzXM(StyleIdentifier.SUBTLE_EMPHASIS, zzZTC.zzZ((byte[]) obj, this.zzZBi.isInline(), 255, this.zzYJC));
                                break;
                            case EditingLanguage.GERMAN_LUXEMBOURG /* 4103 */:
                                String str = (String) obj;
                                if (com.aspose.words.internal.zzZYD.zzXk(str) && !((Shape) this.zzZBi).getImageData().isLink()) {
                                    this.zzYJv.zzC(StyleIdentifier.INTENSE_EMPHASIS, str);
                                    break;
                                }
                                break;
                            case 4104:
                                String str2 = (String) obj;
                                if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
                                    this.zzYJv.zzC(StyleIdentifier.INTENSE_EMPHASIS, str2);
                                    Shape shape = (Shape) this.zzZBi;
                                    int i2 = shape.getImageData().isLink() ? 10 : 2;
                                    if (shape.getImageData().isLinkOnly()) {
                                        i2 |= 4;
                                    }
                                    this.zzYJv.zzXM(StyleIdentifier.SUBTLE_REFERENCE, i2);
                                }
                                break;
                            default:
                                switch (i) {
                                    case EditingLanguage.SPANISH_GUATEMALA /* 4106 */:
                                        zzZ(this.zzYJu, 923, (Border) obj);
                                        break;
                                    case 4107:
                                        zzZ(this.zzYJu, 924, (Border) obj);
                                        break;
                                    case EditingLanguage.FRENCH_SWITZERLAND /* 4108 */:
                                        zzZ(this.zzYJu, 925, (Border) obj);
                                        break;
                                    case 4109:
                                        zzZ(this.zzYJu, 926, (Border) obj);
                                        break;
                                    case 4110:
                                        this.zzYJv.zzXM(390, zzZTC.zzZ((byte[]) obj, this.zzZBi.isInline(), ((Integer) this.zzZBi.zzYvW().zzPj(EditingLanguage.CROATIAN_BOZNIA_AND_HERZEGOVINA)).intValue(), this.zzYJC));
                                        break;
                                    case 4111:
                                        this.zzYJv.zzXM(453, zzZTC.zzZ((byte[]) obj, this.zzZBi.isInline(), ((Integer) this.zzZBi.zzYvW().zzPj(4121)).intValue(), this.zzYJC));
                                        break;
                                    case 4112:
                                    case 4113:
                                    case 4114:
                                    case 4115:
                                    case 4116:
                                    case 4117:
                                    case 4118:
                                    case 4119:
                                    case 4120:
                                    case 4121:
                                    case EditingLanguage.CROATIAN_BOZNIA_AND_HERZEGOVINA /* 4122 */:
                                        break;
                                    default:
                                        switch (i) {
                                            case 4124:
                                            case 4129:
                                            case 4130:
                                            case 4131:
                                            case 4132:
                                                break;
                                            case 4125:
                                                if (!this.zzZBi.isGroup()) {
                                                    this.zzYJv.zzXM(StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6, ((Integer) obj).intValue());
                                                }
                                                break;
                                            case 4126:
                                                if (!this.zzZBi.isGroup()) {
                                                    this.zzYJv.zzXM(StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_6, ((Integer) obj).intValue());
                                                }
                                                break;
                                            case 4127:
                                                if (!this.zzZBi.isGroup()) {
                                                    this.zzYJv.zzXM(StyleIdentifier.LIST_TABLE_1_LIGHT, ((Integer) obj).intValue() + this.zzZBi.zzY9h().zzZyh());
                                                }
                                                break;
                                            case 4128:
                                                if (!this.zzZBi.isGroup()) {
                                                    this.zzYJv.zzXM(StyleIdentifier.LIST_TABLE_2, ((Integer) obj).intValue() + this.zzZBi.zzY9h().zzZyg());
                                                }
                                                break;
                                            default:
                                                switch (i) {
                                                    case 4140:
                                                    case 4141:
                                                    case 4142:
                                                    case 4143:
                                                    case 4144:
                                                    case 4145:
                                                    case 4146:
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 4154:
                                                            case EditingLanguage.LULE_SAMI_NORWAY /* 4155 */:
                                                            case 4156:
                                                                break;
                                                            case 4157:
                                                                if (!this.zzZBi.zzYvW().zzVE(897)) {
                                                                    String strZzY1 = ShapeBase.zzY1((String) obj, this.zzZBi.getAlternativeText());
                                                                    if (com.aspose.words.internal.zzZYD.zzXk(strZzY1)) {
                                                                        this.zzYJv.zzC(897, strZzY1);
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                zzE1(i);
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

    private void zzm(int i, Object obj) {
        switch (i) {
            case 1984:
            case 1985:
            case 1986:
            case 1987:
            case 1988:
            case 1989:
                this.zzYJu.zzXM(i, ((Integer) obj).intValue());
                break;
            default:
                zzE1(i);
                break;
        }
    }

    private void zzn(int i, Object obj) {
        if (i != 1791) {
            zzE1(i);
        } else {
            this.zzYJu.zzXM(i, ((Integer) obj).intValue());
        }
    }

    private void zzo(int i, Object obj) throws Exception {
        if (i == 1280) {
            int iIntValue = ((Integer) obj).intValue();
            if (iIntValue != -1) {
                this.zzYJu.zzXM(i, iIntValue);
                return;
            }
            return;
        }
        if (i == 1281) {
            this.zzYJu.zzXM(i, ((Integer) obj).intValue());
            return;
        }
        switch (i) {
            case 1284:
                this.zzYJu.zzZ(new zzZU1(i, (zzJW[]) obj));
                break;
            case 1285:
            case 1286:
            case 1287:
                this.zzYJu.zzXM(i, ((Integer) obj).intValue());
                break;
            case 1288:
                this.zzYJu.zzZ(new zzZU1(i, (int[]) obj));
                break;
            case 1289:
                this.zzYJu.zzXM(i, ((Integer) obj).intValue());
                break;
            default:
                switch (i) {
                    case 1340:
                    case 1341:
                    case 1342:
                        this.zzYJb = zzP(this.zzYJb, zzZTH.zzE9(i), ((Boolean) obj).booleanValue());
                        break;
                    default:
                        zzE1(i);
                        break;
                }
                break;
        }
    }

    private void zzp(int i, Object obj) {
        if (i != 1087) {
            zzE1(i);
        } else {
            this.zzYJu.zzXM(i, ((Integer) obj).intValue());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzq(int i, Object obj) throws Exception {
        if (i != 919) {
            if (i == 920) {
                this.zzYJu.zzXM(i, ((Integer) obj).intValue());
                return;
            }
            switch (i) {
                case 896:
                    String str = (String) obj;
                    if (com.aspose.words.internal.zzZYD.zzXk(str)) {
                        this.zzYJv.zzC(i, str);
                    }
                    break;
                case 897:
                    String strZzY1 = ShapeBase.zzY1(this.zzZBi.getTitle(), (String) obj);
                    if (com.aspose.words.internal.zzZYD.zzXk(strZzY1)) {
                        this.zzYJv.zzC(i, strZzY1);
                    }
                    break;
                case 898:
                    if (!this.zzZBi.zzY9C() && com.aspose.words.internal.zzZYD.zzXk(this.zzZBi.getHRef())) {
                        this.zzYJv.zzZ(new zzZTD(i, com.aspose.words.internal.zzZVR.zzWH(this.zzZBi.getHRef()), com.aspose.words.internal.zzZVR.zzWG(this.zzZBi.getHRef()), this.zzZBi.getTarget()));
                        break;
                    }
                    break;
                case 899:
                    this.zzYJv.zzZ(new zzZU1(i, (zzYM5[]) obj));
                    break;
                case SQLitePersistence.MAX_ARGS /* 900 */:
                case 901:
                case 902:
                case 903:
                    this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                    break;
                case 904:
                    break;
                default:
                    switch (i) {
                        case 909:
                            break;
                        case 910:
                            break;
                        case 911:
                            this.zzYJu.zzXM(i, ((Integer) obj).intValue());
                            break;
                        case 912:
                            this.zzYJu.zzXM(i, ((Integer) obj).intValue());
                            break;
                        case 913:
                            int iIntValue = ((Integer) obj).intValue();
                            if (iIntValue == -1) {
                                iIntValue = 1;
                            }
                            this.zzYJu.zzXM(i, iIntValue);
                            break;
                        case 914:
                            this.zzYJu.zzXM(i, ((Integer) obj).intValue());
                            break;
                        case 915:
                            this.zzYJu.zzXM(i, ((Integer) obj).intValue());
                            break;
                        case 916:
                            this.zzYJu.zzXM(i, ((Integer) obj).intValue());
                            break;
                        default:
                            switch (i) {
                                case 922:
                                    break;
                                case 923:
                                case 924:
                                case 925:
                                case 926:
                                    break;
                                default:
                                    switch (i) {
                                        case 944:
                                        case 945:
                                        case 946:
                                        case 947:
                                            break;
                                        case 948:
                                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                            this.zzYJc = zzP(this.zzYJc, zzZTH.zzE9(i), zBooleanValue);
                                            if (zBooleanValue) {
                                                this.zzYJu.zzXM(917, com.aspose.words.internal.zzSA.zzr(this.zzZBi.getHeight()));
                                                this.zzYJu.zzXM(918, com.aspose.words.internal.zzSA.zzr(this.zzZBi.getWidth()));
                                            }
                                            break;
                                        default:
                                            switch (i) {
                                                case 950:
                                                case 951:
                                                case 952:
                                                    break;
                                                case 953:
                                                case 955:
                                                case 956:
                                                case 957:
                                                case 958:
                                                case 959:
                                                    this.zzYJd = zzP(this.zzYJd, zzZTH.zzE9(i), ((Boolean) obj).booleanValue());
                                                    break;
                                                case 954:
                                                    if (!this.zzZBi.isInline()) {
                                                        this.zzYJd = zzP(this.zzYJd, zzZTH.zzE9(i), ((Boolean) obj).booleanValue());
                                                    }
                                                    break;
                                                default:
                                                    zzE1(i);
                                                    break;
                                            }
                                            break;
                                    }
                                    this.zzYJc = zzP(this.zzYJc, zzZTH.zzE9(i), ((Boolean) obj).booleanValue());
                                    break;
                            }
                            break;
                    }
                    break;
            }
            return;
        }
        String str2 = (String) obj;
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            this.zzYJu.zzC(i, str2);
        }
    }

    private void zzr(int i, Object obj) {
        switch (i) {
            case 832:
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
            case 833:
            case 836:
            case 837:
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
            case 834:
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
            case 835:
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
            default:
                switch (i) {
                    case 889:
                    case 890:
                    case 891:
                    case 892:
                    case 893:
                    case 894:
                    case 895:
                        this.zzYJe = zzP(this.zzYJe, zzZTH.zzE9(i), ((Boolean) obj).booleanValue());
                        break;
                    default:
                        zzE1(i);
                        break;
                }
                break;
        }
    }

    private void zzs(int i, Object obj) {
        if (i != 830) {
            switch (i) {
                case 771:
                    this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                    return;
                case 772:
                case 773:
                case 774:
                    this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                    return;
                default:
                    switch (i) {
                        case 777:
                            this.zzYJu.zzXM(i, ((Integer) obj).intValue());
                            return;
                        case 778:
                            this.zzYJu.zzXM(i, ((Integer) obj).intValue());
                            return;
                        case 779:
                            this.zzYJu.zzXM(i, ((Integer) obj).intValue());
                            return;
                        case 780:
                            this.zzYJv.zzZ(new zzZSO((byte[]) obj));
                            return;
                        case 781:
                            return;
                        default:
                            switch (i) {
                                case 826:
                                case 827:
                                case 828:
                                    break;
                                default:
                                    zzE1(i);
                                    break;
                            }
                            return;
                    }
            }
        }
        this.zzYJf = zzP(this.zzYJf, zzZTH.zzE9(i), ((Boolean) obj).booleanValue());
    }

    private void zzt(int i, Object obj) {
        switch (i) {
            case 704:
            case 705:
            case 706:
            case 707:
            case 708:
            case 709:
            case 710:
            case 711:
            case 712:
            case 714:
            case 715:
            case 716:
            case 717:
            case 718:
            case 719:
            case 720:
            case 721:
            case 722:
            case 723:
            case 724:
            case 725:
            case 726:
            case 727:
            case 728:
            case 729:
            case 730:
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
            case 713:
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
            default:
                switch (i) {
                    case 763:
                    case 764:
                    case 765:
                    case 766:
                    case 767:
                        this.zzYJg = zzP(this.zzYJg, zzZTH.zzE9(i), ((Boolean) obj).booleanValue());
                        break;
                    default:
                        zzE1(i);
                        break;
                }
                break;
        }
    }

    private void zzu(int i, Object obj) {
        if (i != 653) {
            switch (i) {
                case 640:
                case 641:
                case 642:
                case 643:
                case 644:
                case 645:
                    this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                    break;
                case 646:
                    this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                    break;
                case 647:
                    this.zzYJv.zzXM(i, zzY0E.zzZD((com.aspose.words.internal.zzPV) obj));
                    break;
                case 648:
                    this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                    break;
                case 649:
                case 650:
                case 651:
                    break;
                default:
                    switch (i) {
                        case ALERT_VALUE:
                        case 701:
                        case 702:
                        case 703:
                            this.zzYJh = zzP(this.zzYJh, zzZTH.zzE9(i), ((Boolean) obj).booleanValue());
                            break;
                        default:
                            zzE1(i);
                            break;
                    }
                    break;
            }
            return;
        }
        this.zzYJu.zzXM(i, ((Integer) obj).intValue());
    }

    private void zzv(int i, Object obj) {
        if (i == 639) {
            this.zzYJi = zzP(this.zzYJi, zzZTH.zzE9(i), ((Boolean) obj).booleanValue());
            return;
        }
        switch (i) {
            case 576:
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
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
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
            default:
                zzE1(i);
                break;
        }
    }

    private void zzw(int i, Object obj) {
        if (i != 538 && i != 539) {
            if (i == 574 || i == 575) {
                this.zzYJj = zzP(this.zzYJj, zzZTH.zzE9(i), ((Boolean) obj).booleanValue());
                return;
            }
            switch (i) {
                case 512:
                    this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                    return;
                case InputDeviceCompat.SOURCE_DPAD /* 513 */:
                case 514:
                    this.zzYJv.zzXM(i, zzY0E.zzZD((com.aspose.words.internal.zzPV) obj));
                    return;
                case 515:
                case 516:
                case 517:
                case 518:
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
                    this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                    return;
                case 530:
                case 531:
                case 532:
                    break;
                default:
                    switch (i) {
                        case 534:
                        case 535:
                        case 536:
                            break;
                        default:
                            zzE1(i);
                            break;
                    }
                    return;
            }
        }
        this.zzYJu.zzXM(i, ((Integer) obj).intValue());
    }

    private void zzx(int i, Object obj) {
        if (i != 481 && i != 482) {
            switch (i) {
                case 448:
                case 450:
                    this.zzYJv.zzXM(i, zzY0E.zzZD((com.aspose.words.internal.zzPV) obj));
                    return;
                case 449:
                case 451:
                    this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                    return;
                case 452:
                    this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                    return;
                default:
                    switch (i) {
                        case 454:
                            this.zzYJv.zzC(i, (String) obj);
                            return;
                        case 455:
                        case 456:
                        case 457:
                            this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                            return;
                        case 458:
                            this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                            return;
                        case 459:
                            this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                            return;
                        case 460:
                            this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                            return;
                        case 461:
                            this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                            return;
                        case 462:
                            this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                            return;
                        default:
                            switch (i) {
                                case 464:
                                case 465:
                                    this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                                    return;
                                case 466:
                                case 468:
                                    this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                                    return;
                                case 467:
                                case 469:
                                    this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                                    return;
                                case 470:
                                    this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                                    return;
                                case 471:
                                    this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                                    return;
                                default:
                                    switch (i) {
                                        case 473:
                                        case 477:
                                            this.zzYJv.zzXM(i, zzY0E.zzZD((com.aspose.words.internal.zzPV) obj));
                                            break;
                                        case 474:
                                        case 476:
                                        case 478:
                                            break;
                                        case 475:
                                        case 479:
                                            this.zzYJv.zzXM(i, zzY0E.zzhG(((Integer) obj).intValue()));
                                            break;
                                        default:
                                            switch (i) {
                                                case 503:
                                                case 504:
                                                    this.zzYJk = zzP(this.zzYJk, zzZTH.zzE9(i), ((Boolean) obj).booleanValue());
                                                    break;
                                                case 505:
                                                case 506:
                                                case 507:
                                                case 508:
                                                case 509:
                                                case 510:
                                                case FrameMetricsAggregator.EVERY_DURATION /* 511 */:
                                                    this.zzYJl = zzP(this.zzYJl, zzZTH.zzE9(i), ((Boolean) obj).booleanValue());
                                                    break;
                                                default:
                                                    zzE1(i);
                                                    break;
                                            }
                                            break;
                                    }
                                    return;
                            }
                    }
            }
        }
        this.zzYJu.zzXM(i, ((Integer) obj).intValue());
    }

    private void zzy(int i, Object obj) throws Exception {
        switch (i) {
            case 384:
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
            case 385:
            case 387:
                this.zzYJv.zzXM(i, zzY0E.zzZD((com.aspose.words.internal.zzPV) obj));
                break;
            case 386:
            case 388:
            case 389:
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
            default:
                switch (i) {
                    case 391:
                        this.zzYJv.zzC(i, (String) obj);
                        break;
                    case 392:
                        this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                        break;
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
                        this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                        break;
                    case 405:
                        this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                        break;
                    default:
                        switch (i) {
                            case 407:
                                this.zzYJv.zzZ(new zzZU1(i, (zzZLE[]) obj));
                                break;
                            case 408:
                            case 409:
                            case 410:
                            case 411:
                                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                                break;
                            case 412:
                                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                                break;
                            default:
                                switch (i) {
                                    case 414:
                                    case 418:
                                        this.zzYJv.zzXM(i, zzY0E.zzZD((com.aspose.words.internal.zzPV) obj));
                                        break;
                                    case 415:
                                    case 419:
                                    case 421:
                                    case 422:
                                    case 423:
                                        this.zzYJu.zzXM(i, ((Integer) obj).intValue());
                                        break;
                                    case 416:
                                    case 420:
                                        this.zzYJv.zzXM(i, zzY0E.zzhG(((Integer) obj).intValue()));
                                        break;
                                    case 417:
                                        break;
                                    default:
                                        switch (i) {
                                            case 441:
                                            case 442:
                                                this.zzYJm = zzP(this.zzYJm, zzZTH.zzE9(i), ((Boolean) obj).booleanValue());
                                                break;
                                            case 443:
                                            case 444:
                                            case 445:
                                            case 446:
                                            case 447:
                                                this.zzYJn = zzP(this.zzYJn, zzZTH.zzE9(i), ((Boolean) obj).booleanValue());
                                                break;
                                            default:
                                                zzE1(i);
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

    private void zzz(int i, Object obj) throws Exception {
        switch (i) {
            case StyleIdentifier.LIST_TABLE_4 /* 325 */:
                this.zzYJv.zzXM(StyleIdentifier.LIST_TABLE_3, 4);
                this.zzYJv.zzZ(new zzZU1(i, (zzYM5[]) obj));
                break;
            case StyleIdentifier.LIST_TABLE_5_DARK /* 326 */:
                this.zzYJv.zzZ(new zzZU1(i, (zzYM6[]) obj));
                break;
            case StyleIdentifier.LIST_TABLE_6_COLORFUL /* 327 */:
            case StyleIdentifier.LIST_TABLE_7_COLORFUL /* 328 */:
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_1 /* 329 */:
            case StyleIdentifier.LIST_TABLE_2_ACCENT_1 /* 330 */:
            case StyleIdentifier.LIST_TABLE_3_ACCENT_1 /* 331 */:
            case StyleIdentifier.LIST_TABLE_4_ACCENT_1 /* 332 */:
            case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_1 /* 333 */:
            case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_1 /* 334 */:
            case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_1 /* 335 */:
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_2 /* 336 */:
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
            case StyleIdentifier.LIST_TABLE_2_ACCENT_2 /* 337 */:
                this.zzYJv.zzZ(new zzZU1(i, (zzYM5[]) obj));
                break;
            case StyleIdentifier.LIST_TABLE_3_ACCENT_2 /* 338 */:
                this.zzYJv.zzZ(new zzZU1(i, (int[]) obj));
                break;
            case StyleIdentifier.LIST_TABLE_4_ACCENT_2 /* 339 */:
            case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2 /* 340 */:
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
            case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_2 /* 341 */:
                this.zzYJv.zzZ(new zzZU1(i, (zzZL3[]) obj));
                break;
            case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2 /* 342 */:
                this.zzYJv.zzZ(new zzZU1(i, (zzZLU[]) obj));
                break;
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3 /* 343 */:
                this.zzYJv.zzZ(new zzZU1(i, (zzYM4[]) obj));
                break;
            case StyleIdentifier.LIST_TABLE_2_ACCENT_3 /* 344 */:
                this.zzYJv.zzXM(i, ((Integer) obj).intValue());
                break;
            default:
                switch (i) {
                    case StyleIdentifier.length /* 378 */:
                    case 379:
                    case 380:
                    case 381:
                    case 382:
                    case 383:
                        this.zzYJq = zzP(this.zzYJq, zzZTH.zzE9(i), ((Boolean) obj).booleanValue());
                        break;
                    default:
                        zzE1(i);
                        break;
                }
                break;
        }
    }

    public final void zzZ(ShapeBase shapeBase, zzZT8 zzzt8, zzZT8 zzzt82, boolean z) throws Exception {
        this.zzZBi = shapeBase;
        this.zzYJv = zzzt8;
        this.zzYJu = zzzt82;
        this.zzYJt = 0;
        this.zzYJs = 0;
        this.zzYJr = 0;
        this.zzYJq = 0;
        this.zzYJp = 0;
        this.zzYJo = 0;
        this.zzYJn = 0;
        this.zzYJm = 0;
        this.zzYJl = 0;
        this.zzYJk = 0;
        this.zzYJj = 0;
        this.zzYJi = 0;
        this.zzYJh = 0;
        this.zzYJg = 0;
        this.zzYJf = 0;
        this.zzYJe = 0;
        this.zzYJd = 0;
        this.zzYJc = 0;
        this.zzYJb = 0;
        this.zzYJa = 0;
        if (z) {
            this.zzYJf = zzP(0, zzZTH.zzE9(831), true);
        }
        zzYC3 zzyc3ZzYvW = shapeBase.zzYvW();
        for (int i = 0; i < zzyc3ZzYvW.getCount(); i++) {
            int iZzT3 = zzyc3ZzYvW.zzT3(i);
            Object objZzVY = zzyc3ZzYvW.zzVY(i);
            switch (iZzT3 & (-64)) {
                case 0:
                    zzE(iZzT3, objZzVY);
                    break;
                case 64:
                    zzD(iZzT3, objZzVY);
                    break;
                case 128:
                    zzC(iZzT3, objZzVY);
                    break;
                case 192:
                    zzB(iZzT3, objZzVY);
                    break;
                case 256:
                    zzA(iZzT3, objZzVY);
                    break;
                case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6 /* 320 */:
                    zzz(iZzT3, objZzVY);
                    break;
                case 384:
                    zzy(iZzT3, objZzVY);
                    break;
                case 448:
                    zzx(iZzT3, objZzVY);
                    break;
                case 512:
                    zzw(iZzT3, objZzVY);
                    break;
                case 576:
                    zzv(iZzT3, objZzVY);
                    break;
                case 640:
                    zzu(iZzT3, objZzVY);
                    break;
                case 704:
                    zzt(iZzT3, objZzVY);
                    break;
                case ViewUtils.EDGE_TO_EDGE_FLAGS /* 768 */:
                    zzs(iZzT3, objZzVY);
                    break;
                case 832:
                    zzr(iZzT3, objZzVY);
                    break;
                case 896:
                    zzq(iZzT3, objZzVY);
                    break;
                case 1024:
                    zzp(iZzT3, objZzVY);
                    break;
                case 1280:
                    zzo(iZzT3, objZzVY);
                    break;
                case 1728:
                    zzn(iZzT3, objZzVY);
                    break;
                case 1792:
                    zzk(iZzT3, objZzVY);
                    break;
                case 1920:
                    zzj(iZzT3, objZzVY);
                    break;
                case 1984:
                    zzm(iZzT3, objZzVY);
                    break;
                case 4096:
                    zzl(iZzT3, objZzVY);
                    break;
                default:
                    zzE1(iZzT3);
                    break;
            }
        }
        zzZ(zzzt8, 127, this.zzYJt);
        zzZ(zzzt8, 191, this.zzYJs);
        zzZ(zzzt8, 255, this.zzYJr);
        zzZ(zzzt8, 383, this.zzYJq);
        zzZ(zzzt8, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6, this.zzYJp);
        zzZ(zzzt82, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6, this.zzYJo);
        zzZ(zzzt8, 447, this.zzYJn);
        zzZ(zzzt82, 447, this.zzYJm);
        zzZ(zzzt8, FrameMetricsAggregator.EVERY_DURATION, this.zzYJl);
        zzZ(zzzt82, FrameMetricsAggregator.EVERY_DURATION, this.zzYJk);
        zzZ(zzzt8, 575, this.zzYJj);
        zzZ(zzzt8, 639, this.zzYJi);
        zzZ(zzzt8, 703, this.zzYJh);
        zzZ(zzzt8, 767, this.zzYJg);
        zzZ(zzzt8, 831, this.zzYJf);
        zzZ(zzzt8, 895, this.zzYJe);
        zzZ(zzzt8, 959, this.zzYJd);
        zzZ(zzzt82, 959, this.zzYJc);
        zzZ(zzzt82, 1343, this.zzYJb);
        zzZ(zzzt8, 1983, this.zzYJa);
        zzZ(shapeBase, zzzt8);
    }

    private static void zzZ(ShapeBase shapeBase, zzZT8 zzzt8) throws Exception {
        if (shapeBase.getShapeType() != 100 || shapeBase.zzYvW().contains(StyleIdentifier.LIST_TABLE_4)) {
            return;
        }
        zzzt8.zzZ(new zzZU1(StyleIdentifier.LIST_TABLE_4, new zzYM5[0]));
    }

    private static void zzZ(zzZT8 zzzt8, int i, Border border) {
        if (border.equals(Border.zzZCe)) {
            return;
        }
        zzzt8.zzXM(i, zzY0E.zzZD(border.zz8Q()));
    }

    private static void zzZ(zzZT8 zzzt8, int i, int i2) {
        if ((((long) i2) & 4294901760L) != 0) {
            zzzt8.zzXM(i, i2);
        }
    }
}
