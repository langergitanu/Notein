package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZXZ {
    private zzZXW zzbs = new zzZXW();

    private static String zzSX(int i) {
        if (i == 0) {
            return "META_NULL_ACTION";
        }
        if (i == 512) {
            return "META_COMMENT_ACTION";
        }
        switch (i) {
            case 100:
                return "META_PIXEL_ACTION";
            case 101:
                return "META_POINT_ACTION";
            case 102:
                return "META_LINE_ACTION";
            case 103:
                return "META_RECT_ACTION";
            case 104:
                return "META_ROUNDRECT_ACTION";
            case 105:
                return "META_ELLIPSE_ACTION";
            case 106:
                return "META_ARC_ACTION";
            case 107:
                return "META_PIE_ACTION";
            case 108:
                return "META_CHORD_ACTION";
            case 109:
                return "META_POLYLINE_ACTION";
            case 110:
                return "META_POLYGON_ACTION";
            case 111:
                return "META_POLYPOLYGON_ACTION";
            case 112:
                return "META_TEXT_ACTION";
            case 113:
                return "META_TEXTARRAY_ACTION";
            case 114:
                return "META_STRETCHTEXT_ACTION";
            case 115:
                return "META_TEXTRECT_ACTION";
            case 116:
                return "META_BMP_ACTION";
            case 117:
                return "META_BMPSCALE_ACTION";
            case 118:
                return "META_BMPSCALEPART_ACTION";
            case 119:
                return "META_BMPEX_ACTION";
            case 120:
                return "META_BMPEXSCALE_ACTION";
            case 121:
                return "META_BMPEXSCALEPART_ACTION";
            case 122:
                return "META_MASK_ACTION";
            case 123:
                return "META_MASKSCALE_ACTION";
            case 124:
                return "META_MASKSCALEPART_ACTION";
            case 125:
                return "META_GRADIENT_ACTION";
            case 126:
                return "META_HATCH_ACTION";
            case 127:
                return "META_WALLPAPER_ACTION";
            case 128:
                return "META_CLIPREGION_ACTION";
            case 129:
                return "META_ISECTRECTCLIPREGION_ACTION";
            case 130:
                return "META_ISECTREGIONCLIPREGION_ACTION";
            case 131:
                return "META_MOVECLIPREGION_ACTION";
            case 132:
                return "META_LINECOLOR_ACTION";
            case 133:
                return "META_FILLCOLOR_ACTION";
            case 134:
                return "META_TEXTCOLOR_ACTION";
            case 135:
                return "META_TEXTFILLCOLOR_ACTION";
            case 136:
                return "META_TEXTALIGN_ACTION";
            case 137:
                return "META_MAPMODE_ACTION";
            case 138:
                return "META_FONT_ACTION";
            case 139:
                return "META_PUSH_ACTION";
            case 140:
                return "META_POP_ACTION";
            case 141:
                return "META_RASTEROP_ACTION";
            case 142:
                return "META_TRANSPARENT_ACTION";
            case 143:
                return "META_EPS_ACTION";
            case 144:
                return "META_REFPOINT_ACTION";
            case 145:
                return "META_TEXTLINECOLOR_ACTION";
            case 146:
                return "META_TEXTLINE_ACTION";
            case 147:
                return "META_FLOATTRANSPARENT_ACTION";
            case 148:
                return "META_GRADIENTEX_ACTION";
            case 149:
                return "META_LAYOUTMODE_ACTION";
            case 150:
                return "META_TEXTLANGUAGE_ACTION";
            case 151:
                return "META_OVERLINECOLOR_ACTION";
            default:
                return Integer.toString(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzZ(zzZXX zzzxx) throws Exception {
        int iZzXa = zzzxx.zzXa() & 65535;
        this.zzbs.zzZ(zzzxx);
        int position = (int) zzzxx.zzq().getPosition();
        if (iZzXa != 0 && iZzXa != 512) {
            switch (iZzXa) {
                case 100:
                case 101:
                    zzzxx.zzqH();
                    break;
                case 102:
                    zzzxx.zzqG();
                    break;
                case 103:
                    zzzxx.zzqF();
                    break;
                case 104:
                    zzzxx.zzqm();
                    break;
                case 105:
                    zzzxx.zzqE();
                    break;
                case 106:
                    zzzxx.zzqo();
                    break;
                case 107:
                    zzzxx.zzqn();
                    break;
                case 108:
                    zzzxx.zzql();
                    break;
                case 109:
                    zzzxx.zzqD();
                    break;
                case 110:
                    zzzxx.zzqC();
                    break;
                case 111:
                    zzzxx.zzqB();
                    break;
                case 112:
                    zzzxx.zzqy();
                    break;
                case 113:
                    zzzxx.zzqA();
                    break;
                case 114:
                    zzzxx.zzqz();
                    break;
                case 115:
                case 118:
                case 121:
                case 122:
                case 123:
                case 124:
                case 125:
                case 126:
                case 127:
                case 128:
                case 129:
                case 130:
                case 131:
                case 135:
                case 136:
                case 137:
                case 141:
                case 142:
                case 143:
                case 144:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                case 150:
                case 151:
                    break;
                case 116:
                case 119:
                    zzzxx.zzZw(false);
                    break;
                case 117:
                case 120:
                    zzzxx.zzZw(true);
                    break;
                case 132:
                    zzzxx.zzqx();
                    break;
                case 133:
                    zzzxx.zzqw();
                    break;
                case 134:
                    zzzxx.zzqu();
                    break;
                case 138:
                    zzzxx.zzqk();
                    break;
                case 139:
                    zzzxx.zzqq();
                    break;
                case 140:
                    zzzxx.zzqp();
                    break;
                default:
                    zzzxx.zzI().zzZ(4, 11, zzZKN.format("Action '{0}' is unexpected.", Integer.valueOf(iZzXa)));
                    break;
            }
        } else {
            zzzxx.zzI().zzZ(0, 11, zzZKN.format("'{0}' action is not supported by AW.", zzSX(iZzXa)));
        }
        zzzxx.zzZA((int) (((long) this.zzbs.getLength()) & 4294967295L), position);
    }

    public final zzZXW zzqN() {
        return this.zzbs;
    }
}
