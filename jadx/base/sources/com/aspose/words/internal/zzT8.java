package com.aspose.words.internal;

import com.aspose.slides.PatternStyle;
import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.UserConstants;
import com.vivo.penengine.impl.BuildConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzT8 {
    public static byte[] zzQs = {PatternStyle.Sphere, PatternStyle.Shingle, 118, 56, PatternStyle.DottedGrid};
    public static byte[] zzQr = {-17, -69, -65};
    public static byte[] zzQq = {-1, -2};
    public static byte[] zzQp = {-2, -1};
    public static byte[] zzQo = {-1, -2, 0, 0};
    public static byte[] zzQn = {0, 0, -2, -1};
    private static zzZYV<Integer> zzQm = new zzZYV<>();
    private static zzIM<Integer> zzQl = new zzIM<>();
    private static HashMap<byte[], Integer> zzQk = new HashMap<>(6);

    static {
        zzQm.add(0, 1252);
        zzQm.add(77, 10000);
        zzQm.add(78, Integer.valueOf(UserConstants.ERROR_CODE_AVATAR_RESOLUTION_LIMIT));
        zzQm.add(79, Integer.valueOf(UserConstants.ERROR_CODE_AVATAR_UPLOAD_NETWORK));
        zzQm.add(80, 10008);
        zzQm.add(81, Integer.valueOf(UserConstants.ERROR_CODE_AVATAR_UPLOAD_INTERNAL));
        zzQm.add(83, 10005);
        zzQm.add(84, 10004);
        zzQm.add(85, 10006);
        zzQm.add(86, 10081);
        zzQm.add(87, 10021);
        zzQm.add(88, 10029);
        zzZYV<Integer> zzzyv = zzQm;
        Integer numValueOf = Integer.valueOf(BuildConfig.VERSION_CODE);
        zzzyv.add(89, numValueOf);
        zzQm.add(128, 932);
        zzQm.add(129, 949);
        zzQm.add(130, 1361);
        zzQm.add(134, 936);
        zzQm.add(136, 950);
        zzQm.add(161, 1253);
        zzQm.add(162, 1254);
        zzQm.add(163, 1258);
        zzQm.add(177, 1255);
        zzQm.add(178, 1256);
        zzQm.add(186, 1257);
        zzQm.add(204, 1251);
        zzQm.add(222, 874);
        zzQm.add(238, 1250);
        zzQm.add(StyleIdentifier.MEDIUM_GRID_2_ACCENT_6, 437);
        zzQm.add(255, 850);
        zzQm.add(65535, 1200);
        zzQl.add(37);
        zzQl.add(437);
        zzQl.add(500);
        zzQl.add(708);
        zzQl.add(720);
        zzQl.add(737);
        zzQl.add(775);
        zzQl.add(850);
        zzQl.add(852);
        zzQl.add(855);
        zzQl.add(857);
        zzQl.add(858);
        zzQl.add(860);
        zzQl.add(861);
        zzQl.add(862);
        zzQl.add(863);
        zzQl.add(864);
        zzQl.add(865);
        zzQl.add(866);
        zzQl.add(869);
        zzQl.add(870);
        zzQl.add(874);
        zzQl.add(875);
        zzQl.add(Integer.valueOf(EditingLanguage.BULGARIAN));
        zzQl.add(Integer.valueOf(EditingLanguage.ROMANSH));
        zzQl.add(Integer.valueOf(EditingLanguage.GUARANI));
        zzQl.add(Integer.valueOf(EditingLanguage.HAWAIIAN));
        zzQl.add(Integer.valueOf(EditingLanguage.LATIN));
        zzQl.add(Integer.valueOf(EditingLanguage.SOMALI));
        zzQl.add(Integer.valueOf(EditingLanguage.f50775YI));
        zzQl.add(Integer.valueOf(EditingLanguage.PAPIAMENTU));
        zzQl.add(Integer.valueOf(EditingLanguage.MAPUDUNGUN_CHILE));
        zzQl.add(1147);
        zzQl.add(Integer.valueOf(EditingLanguage.MOHAWK));
        zzQl.add(1149);
        zzQl.add(1250);
        zzQl.add(1251);
        zzQl.add(1252);
        zzQl.add(1253);
        zzQl.add(1254);
        zzQl.add(1255);
        zzQl.add(1256);
        zzQl.add(1257);
        zzQl.add(1258);
        zzQl.add(10000);
        zzQl.add(10004);
        zzQl.add(10005);
        zzQl.add(10006);
        zzQl.add(numValueOf);
        zzQl.add(10010);
        zzQl.add(10017);
        zzQl.add(10021);
        zzQl.add(10029);
        zzQl.add(10079);
        zzQl.add(10081);
        zzQl.add(10082);
        zzQl.add(20105);
        zzQl.add(20106);
        zzQl.add(20107);
        zzQl.add(20108);
        zzQl.add(20127);
        zzQl.add(20269);
        zzQl.add(20273);
        zzQl.add(20277);
        zzQl.add(20278);
        zzQl.add(20280);
        zzQl.add(20284);
        zzQl.add(20285);
        zzQl.add(20290);
        zzQl.add(20297);
        zzQl.add(20420);
        zzQl.add(20423);
        zzQl.add(20424);
        zzQl.add(20833);
        zzQl.add(20838);
        zzQl.add(20866);
        zzQl.add(20871);
        zzQl.add(20880);
        zzQl.add(20905);
        zzQl.add(20924);
        zzQl.add(21025);
        zzQl.add(21866);
        zzQl.add(28591);
        zzQl.add(28592);
        zzQl.add(28593);
        zzQl.add(28594);
        zzQl.add(28595);
        zzQl.add(28596);
        zzQl.add(28597);
        zzQl.add(28598);
        zzQl.add(28599);
        zzQl.add(28603);
        zzQl.add(28605);
        zzQl.add(29001);
        zzQl.add(38598);
        zzZQF.zzY(zzQk, zzQr, 65001);
        zzZQF.zzY(zzQk, zzQs, 65000);
        zzZQF.zzY(zzQk, zzQo, 12000);
        zzZQF.zzY(zzQk, zzQn, 12001);
        zzZQF.zzY(zzQk, zzQq, 1200);
        zzZQF.zzY(zzQk, zzQp, 1201);
    }

    public static boolean isRightToLeft(int i) {
        return i == 1255 || i == 1256;
    }

    public static byte[] zzL(byte[] bArr) {
        for (byte[] bArr2 : zzQk.keySet()) {
            if (zzZ1.zzZ(bArr2, bArr, bArr2.length)) {
                return bArr2;
            }
        }
        return zzZ1.zzXW;
    }

    public static int zzM(byte[] bArr) {
        if (!zzZ1.zzX(bArr)) {
            return Integer.MIN_VALUE;
        }
        for (Map.Entry<byte[], Integer> entry : zzQk.entrySet()) {
            byte[] key = entry.getKey();
            if (zzZ1.zzZ(bArr, key, key.length)) {
                return entry.getValue().intValue();
            }
        }
        return Integer.MIN_VALUE;
    }

    public static int zzYS(int i) {
        if (i == 13) {
            return 1255;
        }
        if (i == 1032) {
            return 1253;
        }
        if (i != 1037) {
            return i != 1049 ? 1252 : 1251;
        }
        return 1255;
    }

    public static boolean zzYT(int i) {
        return i == 177 || i == 178;
    }

    public static int zzt(int i, int i2) {
        return zzQm.zzVE(i) ? zzQm.get(i).intValue() : i2;
    }
}
