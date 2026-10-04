package com.aspose.slides.internal.p077d8;

import androidx.core.view.PointerIconCompat;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p463vm.C11687fa;
import com.aspose.slides.internal.p463vm.C11689jd;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.words.ControlChar;
import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;
import com.aspose.words.TableStyleOptions;
import com.google.android.material.internal.ViewUtils;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.dy */
/* JADX INFO: loaded from: classes3.dex */
public class C3047dy {

    /* JADX INFO: renamed from: ar */
    private static final List<Character> f8960ar;

    /* JADX INFO: renamed from: ck */
    private static final List<Character> f8963ck;

    /* JADX INFO: renamed from: jd */
    private static final List<Character> f8969jd;

    /* JADX INFO: renamed from: k4 */
    public static final List<Character> f8970k4;

    /* JADX INFO: renamed from: ks */
    private static final List<Character> f8972ks;

    /* JADX INFO: renamed from: qq */
    private static final List<Character> f8975qq;

    /* JADX INFO: renamed from: um */
    private static final List<Character> f8979um;

    /* JADX INFO: renamed from: x6 */
    private static final List<Character> f8984x6;

    /* JADX INFO: renamed from: x1 */
    private static final C3040c5[] f8983x1 = new C3040c5[256];

    /* JADX INFO: renamed from: kk */
    private static final int[] f8971kk = new int[65536];

    /* JADX INFO: renamed from: to */
    private static final char[] f8977to = new char[65536];

    /* JADX INFO: renamed from: du */
    private static final int[] f8964du = {1, 1, 1, 2, 2, 2, 2, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: h4 */
    private static final String[] f8967h4 = {"he-IL", "ar-SA", "ar-IQ", "ar-EG", "ar-LY", "ar-DZ", "ar-MA", "ar-TN", "ar-OM", "ar-YE", "ar-SY", "ar-JO", "ar-LB", "ar-KW", "ar-AE", "ar-BH", "ar-QA", "ur-PK", "fa-IR", "syr-SY", "dv-MV"};

    /* JADX INFO: renamed from: m9 */
    private static final short[] f8973m9 = {2052, 4100, 1028, 3076, 5124, 1041, 1042};

    /* JADX INFO: renamed from: dy */
    private static final char[] f8965dy = {1569, 1570, 1571, 1573, 1575, 1583, 1584, 1585, 1586, 1608, 64490, 64491};

    /* JADX INFO: renamed from: c5 */
    private static final char[] f8962c5 = {1548, 1563, 1567};

    /* JADX INFO: renamed from: fa */
    private static final char[] f8966fa = {1569, 65152, 65152, 65152, 65152, 1571, 65155, 65156, 65155, 65156, 1572, 65157, 65158, 65157, 65158, 1573, 65159, 65160, 65159, 65160, 1574, 65161, 65162, 65163, 65164, 1575, 65165, 65166, 65165, 65166, 1576, 65167, 65168, 65169, 65170, 1577, 65171, 65172, 0, 0, 1578, 65173, 65174, 65175, 65176, 1579, 65177, 65178, 65179, 65180, 1580, 65181, 65182, 65183, 65184, 1581, 65185, 65186, 65187, 65188, 1582, 65189, 65190, 65191, 65192, 1583, 65193, 65194, 65193, 65194, 1584, 65195, 65196, 65195, 65196, 1585, 65197, 65198, 65197, 65198, 1586, 65199, 65200, 65199, 65200, 1587, 65201, 65202, 65203, 65204, 1588, 65205, 65206, 65207, 65208, 1589, 65209, 65210, 65211, 65212, 1590, 65213, 65214, 65215, 65216, 1591, 65217, 65218, 65219, 65220, 1592, 65221, 65222, 65223, 65224, 1593, 65225, 65226, 65227, 65228, 1594, 65229, 65230, 65231, 65232, 1601, 65233, 65234, 65235, 65236, 1602, 65237, 65238, 65239, 65240, 1603, 65241, 65242, 65243, 65244, 1604, 65245, 65246, 65247, 65248, 1605, 65249, 65250, 65251, 65252, 1606, 65253, 65254, 65255, 65256, 1607, 65257, 65258, 65259, 65260, 1608, 65261, 65262, 65261, 65262, 1609, 65263, 65264, 0, 0, 1610, 65265, 65266, 65267, 65268, 1711, 64402, 64403, 64404, 64405, 1740, 64508, 64509, 64510, 64511};

    /* JADX INFO: renamed from: up */
    private static final int[] f8980up = {0, 8, 14, 9, 9, 16, 10, 10, 15, 11, 11, 16, 12, 12, 17, 13, 13, 15, 14, 27, 14, 28, 30, 15, 31, 31, 16, 32, 32, 17, 33, 34, 18, 35, 37, 9, 38, 42, 18, 43, 43, 9, 44, 44, 12, 45, 45, 9, 46, 46, 12, 47, 47, 12, 48, 57, 8, 58, 58, 12, 59, 64, 18, 65, 90, 0, 91, 96, 18, 97, 122, 0, 123, 126, 18, 127, 132, 14, 133, 133, 15, 134, 159, 14, 160, 160, 12, 161, 161, 18, 162, 165, 10, 166, 169, 18, 170, 170, 0, 171, 175, 18, 176, 177, 10, 178, 179, 8, 180, 180, 18, 181, 181, 0, 182, 184, 18, 185, 185, 8, 186, 186, 0, 187, 191, 18, 192, 214, 0, 215, 215, 18, 216, 246, 0, StyleIdentifier.LIGHT_LIST_ACCENT_6, StyleIdentifier.LIGHT_LIST_ACCENT_6, 18, StyleIdentifier.LIGHT_GRID_ACCENT_6, 696, 0, 697, 698, 18, 699, 705, 0, 706, 719, 18, 720, 721, 0, 722, 735, 18, 736, 740, 0, 741, 749, 18, 750, 750, 0, 751, 767, 18, ViewUtils.EDGE_TO_EDGE_FLAGS, 855, 45, 856, 860, 32, 861, 879, 45, 880, 883, 0, 884, 885, 18, 886, 893, 0, 894, 894, 18, 895, 899, 0, SQLitePersistence.MAX_ARGS, 901, 18, 902, 902, 0, 903, 903, 18, 904, PointerIconCompat.TYPE_ALL_SCROLL, 0, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, 18, PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, 1154, 0, EditingLanguage.CORSICAN, 1158, 45, EditingLanguage.KINYARWANDA, EditingLanguage.KINYARWANDA, 0, 1160, 1161, 45, 1162, 1417, 0, 1418, 1418, 18, 1419, 1424, 0, 1425, 1441, 45, 1442, 1442, 0, 1443, 1465, 45, 1466, 1466, 0, 1467, 1469, 45, 1470, 1470, 3, 1471, 1471, 45, 1472, 1472, 3, 1473, 1474, 45, 1475, 1475, 3, 1476, 1476, 45, 1477, 1487, 0, 1488, 1514, 3, 1515, 1519, 0, 1520, 1524, 3, 1525, 1535, 0, TableStyleOptions.DEFAULT_2003, 1539, 4, 1540, 1547, 0, 1548, 1548, 4, 1549, 1549, 4, 1550, 1551, 18, 1552, 1557, 45, 1558, 1562, 0, 1563, 1563, 4, 1564, 1566, 0, 1567, 1567, 4, 1568, 1568, 0, 1569, 1594, 4, 1595, 1599, 0, 1600, 1610, 4, 1611, 1624, 45, 1625, 1631, 0, 1632, 1641, 11, 1642, 1642, 10, 1643, 1644, 11, 1645, 1647, 4, 1648, 1648, 45, 1649, 1749, 4, 1750, 1756, 45, 1757, 1757, 4, 1758, 1764, 45, 1765, 1766, 4, 1767, 1768, 45, 1769, 1769, 18, 1770, 1773, 45, 1774, 1775, 4, 1776, 1785, 8, 1786, 1805, 4, 1806, 1806, 0, 1807, 1807, 14, 1808, 1808, 4, 1809, 1809, 45, 1810, 1839, 4, 1840, 1866, 45, 1867, 1868, 0, 1869, 1871, 4, 1872, 1919, 0, 1920, 1957, 4, 1958, 1968, 45, 1969, 1969, 4, 1970, 2304, 0, 2305, 2306, 45, 2307, 2363, 0, 2364, 2364, 45, 2365, 2368, 0, 2369, 2376, 45, 2377, 2380, 0, 2381, 2381, 45, 2382, 2384, 0, 2385, 2388, 45, 2389, 2401, 0, 2402, 2403, 45, 2404, 2432, 0, 2433, 2433, 45, 2434, 2491, 0, 2492, 2492, 45, 2493, 2496, 0, 2497, 2500, 45, 2501, 2508, 0, 2509, 2509, 45, 2510, 2529, 0, 2530, 2531, 45, 2532, 2545, 0, 2546, 2547, 10, 2548, 2560, 0, 2561, 2562, 45, 2563, 2619, 0, 2620, 2620, 45, 2621, 2624, 0, 2625, 2626, 45, 2627, 2630, 0, 2631, 2632, 45, 2633, 2634, 0, 2635, 2637, 45, 2638, 2671, 0, 2672, 2673, 45, 2674, 2688, 0, 2689, 2690, 45, 2691, 2747, 0, 2748, 2748, 45, 2749, 2752, 0, 2753, 2757, 45, 2758, 2758, 0, 2759, 2760, 45, 2761, 2764, 0, 2765, 2765, 45, 2766, 2785, 0, 2786, 2787, 45, 2788, 2800, 0, 2801, 2801, 10, 2802, 2816, 0, 2817, 2817, 45, 2818, 2875, 0, 2876, 2876, 45, 2877, 2878, 0, 2879, 2879, 45, 2880, 2880, 0, 2881, 2883, 45, 2884, 2892, 0, 2893, 2893, 45, 2894, 2901, 0, 2902, 2902, 45, 2903, 2945, 0, 2946, 2946, 45, 2947, 3007, 0, 3008, 3008, 45, 3009, 3020, 0, 3021, 3021, 45, 3022, 3058, 0, 3059, 3064, 18, 3065, 3065, 10, 3066, 3066, 18, 3067, 3133, 0, 3134, 3136, 45, 3137, 3141, 0, 3142, 3144, 45, 3145, 3145, 0, 3146, 3149, 45, 3150, 3156, 0, 3157, 3158, 45, 3159, 3259, 0, 3260, 3260, 45, 3261, 3275, 0, 3276, 3277, 45, 3278, 3392, 0, 3393, 3395, 45, 3396, 3404, 0, 3405, 3405, 45, 3406, 3529, 0, 3530, 3530, 45, 3531, 3537, 0, 3538, 3540, 45, 3541, 3541, 0, 3542, 3542, 45, 3543, 3632, 0, 3633, 3633, 45, 3634, 3635, 0, 3636, 3642, 45, 3643, 3646, 0, 3647, 3647, 10, 3648, 3654, 0, 3655, 3662, 45, 3663, 3760, 0, 3761, 3761, 45, 3762, 3763, 0, 3764, 3769, 45, 3770, 3770, 0, 3771, 3772, 45, 3773, 3783, 0, 3784, 3789, 45, 3790, 3863, 0, 3864, 3865, 45, 3866, 3892, 0, 3893, 3893, 45, 3894, 3894, 0, 3895, 3895, 45, 3896, 3896, 0, 3897, 3897, 45, 3898, 3901, 18, 3902, 3952, 0, 3953, 3966, 45, 3967, 3967, 0, 3968, 3972, 45, 3973, 3973, 0, 3974, 3975, 45, 3976, 3983, 0, 3984, 3991, 45, 3992, 3992, 0, 3993, 4028, 45, 4029, 4037, 0, 4038, 4038, 45, 4039, 4140, 0, 4141, 4144, 45, 4145, 4145, 0, 4146, 4146, 45, 4147, 4149, 0, 4150, 4151, 45, 4152, 4152, 0, 4153, 4153, 45, 4154, 4183, 0, 4184, 4185, 45, 4186, 5759, 0, 5760, 5760, 17, 5761, 5786, 0, 5787, 5788, 18, 5789, 5905, 0, 5906, 5908, 45, 5909, 5937, 0, 5938, 5940, 45, 5941, 5969, 0, 5970, 5971, 45, 5972, AuthCode.StatusCode.WAITING_CONNECT, 0, AuthCode.StatusCode.AUTH_INFO_NOT_EXIST, AuthCode.StatusCode.CERT_FINGERPRINT_ERROR, 45, AuthCode.StatusCode.PERMISSION_NOT_EXIST, 6070, 0, 6071, 6077, 45, 6078, 6085, 0, 6086, 6086, 45, 6087, 6088, 0, 6089, 6099, 45, 6100, 6106, 0, 6107, 6107, 10, 6108, 6108, 0, 6109, 6109, 45, 6110, 6127, 0, 6128, 6137, 18, 6138, 6143, 0, 6144, EditingLanguage.SPANISH_PANAMA, 18, 6155, 6157, 45, 6158, 6158, 17, 6159, 6312, 0, 6313, 6313, 45, 6314, 6431, 0, 6432, 6434, 45, 6435, 6438, 0, 6439, 6443, 45, 6444, 6449, 0, 6450, 6450, 45, 6451, 6456, 0, 6457, 6459, 45, 6460, 6463, 0, 6464, 6464, 18, 6465, 6467, 0, 6468, 6469, 18, 6470, 6623, 0, 6624, 6655, 18, 6656, 8124, 0, 8125, 8125, 18, 8126, 8126, 0, 8127, 8129, 18, 8130, 8140, 0, 8141, 8143, 18, 8144, 8156, 0, 8157, 8159, 18, 8160, 8172, 0, 8173, 8175, 18, 8176, 8188, 0, 8189, 8190, 18, 8191, 
    8191, 0, 8192, EditingLanguage.SPANISH_VENEZUELA, 17, 8203, 8205, 46, 8206, 8206, 0, 8207, 8207, 3, 8208, 8231, 18, 8232, 8232, 17, 8233, 8233, 15, 8234, 8234, 1, 8235, 8235, 5, 8236, 8236, 7, 8237, 8237, 2, 8238, 8238, 6, 8239, 8239, 17, 8240, 8244, 10, 8245, 8276, 18, 8277, 8278, 0, 8279, 8279, 18, 8280, 8286, 0, 8287, 8287, 17, 8288, 8291, 14, 8292, 8297, 0, 8298, 8303, 14, 8304, 8304, 8, 8305, 8307, 0, 8308, 8313, 8, 8314, 8315, 10, 8316, 8318, 18, 8319, 8319, 0, 8320, 8329, 8, 8330, 8331, 10, 8332, 8334, 18, 8335, 8351, 0, 8352, 8369, 10, 8370, 8399, 0, 8400, 8426, 45, 8427, 8447, 0, 8448, 8449, 18, 8450, 8450, 0, 8451, 8454, 18, 8455, 8455, 0, 8456, 8457, 18, 8458, 8467, 0, 8468, 8468, 18, 8469, 8469, 0, 8470, 8472, 18, 8473, 8477, 0, 8478, 8483, 18, 8484, 8484, 0, 8485, 8485, 18, 8486, 8486, 0, 8487, 8487, 18, 8488, 8488, 0, 8489, 8489, 18, 8490, 8493, 0, 8494, 8494, 10, 8495, 8497, 0, 8498, 8498, 18, 8499, 8505, 0, 8506, 8507, 18, 8508, 8511, 0, 8512, 8516, 18, 8517, 8521, 0, 8522, 8523, 18, 8524, 8530, 0, 8531, 8543, 18, 8544, 8591, 0, 8592, 8721, 18, 8722, 8723, 10, 8724, 9013, 18, 9014, 9082, 0, 9083, 9108, 18, 9109, 9109, 0, 9110, 9168, 18, 9169, 9215, 0, 9216, 9254, 18, 9255, 9279, 0, 9280, 9290, 18, 9291, 9311, 0, 9312, 9371, 8, 9372, 9449, 0, 9450, 9450, 8, 9451, 9751, 18, 9752, 9752, 0, 9753, 9853, 18, 9854, 9855, 0, 9856, 9873, 18, 9874, 9887, 0, 9888, 9889, 18, 9890, 9984, 0, 9985, 9988, 18, 9989, 9989, 0, 9990, 9993, 18, 9994, 9995, 0, 9996, 10023, 18, 10024, 10024, 0, 10025, 10059, 18, 10060, 10060, 0, 10061, 10061, 18, 10062, 10062, 0, 10063, 10066, 18, 10067, 10069, 0, 10070, 10070, 18, 10071, 10071, 0, 10072, 10078, 18, 10079, 10080, 0, 10081, 10132, 18, 10133, 10135, 0, 10136, 10159, 18, 10160, 10160, 0, 10161, 10174, 18, 10175, 10191, 0, 10192, 10219, 18, 10220, 10223, 0, 10224, 11021, 18, 11022, 11903, 0, 11904, 11929, 18, 11930, 11930, 0, 11931, 12019, 18, 12020, 12031, 0, 12032, 12245, 18, 12246, 12271, 0, 12272, 12283, 18, 12284, StyleIdentifier.NIL, 0, 12288, 12288, 17, EditingLanguage.ARABIC_LEBANON, 12292, 18, 12293, 12295, 0, 12296, 12320, 18, 12321, 12329, 0, 12330, 12335, 45, 12336, 12336, 18, 12337, 12341, 0, 12342, 12343, 18, 12344, 12348, 0, 12349, 12351, 18, 12352, 12440, 0, 12441, 12442, 45, 12443, 12444, 18, 12445, 12447, 0, 12448, 12448, 18, 12449, 12538, 0, 12539, 12539, 18, 12540, 12828, 0, 12829, 12830, 18, 12831, 12879, 0, 12880, 12895, 18, 12896, 12923, 0, 12924, 12925, 18, 12926, 12976, 0, 12977, 12991, 18, 12992, 13003, 0, 13004, 13007, 18, 13008, 13174, 0, 13175, 13178, 18, 13179, 13277, 0, 13278, 13279, 18, 13280, 13310, 0, 13311, 13311, 18, 13312, 19903, 0, 19904, 19967, 18, 19968, 42127, 0, 42128, 42182, 18, 42183, 64284, 0, 64285, 64285, 3, 64286, 64286, 45, 64287, 64296, 3, 64297, 64297, 10, 64298, 64310, 3, 64311, 64311, 0, 64312, 64316, 3, 64317, 64317, 0, 64318, 64318, 3, 64319, 64319, 0, 64320, 64321, 3, 64322, 64322, 0, 64323, 64324, 3, 64325, 64325, 0, 64326, 64335, 3, 64336, 64433, 4, 64434, 64466, 0, 64467, 64829, 4, 64830, 64831, 18, 64832, 64847, 0, 64848, 64911, 4, 64912, 64913, 0, 64914, 64967, 4, 64968, 65007, 0, 65008, 65020, 4, 65021, 65021, 18, 65022, 65023, 0, 65024, 65039, 45, 65040, 65055, 0, 65056, 65059, 45, 65060, 65071, 0, 65072, 65103, 18, 65104, 65104, 12, 65105, 65105, 18, 65106, 65106, 12, 65107, 65107, 0, 65108, 65108, 18, 65109, 65109, 12, 65110, 65118, 18, 65119, 65119, 10, 65120, 65121, 18, 65122, 65123, 10, 65124, 65126, 18, 65127, 65127, 0, 65128, 65128, 18, 65129, 65130, 10, 65131, 65131, 18, 65132, 65135, 0, 65136, 65140, 4, 65141, 65141, 0, 65142, 65276, 4, 65277, 65278, 0, 65279, 65279, 14, 65280, 65280, 0, 65281, 65282, 18, 65283, 65285, 10, 65286, 65290, 18, 65291, 65291, 10, 65292, 65292, 12, 65293, 65293, 10, 65294, 65294, 12, 65295, 65295, 9, 65296, 65305, 8, 65306, 65306, 12, 65307, 65312, 18, 65313, 65338, 0, 65339, 65344, 18, 65345, 65370, 0, 65371, 65381, 18, 65382, 65503, 0, 65504, 65505, 10, 65506, 65508, 18, 65509, 65510, 10, 65511, 65511, 0, 65512, 65518, 18, 65519, 65528, 0, 65529, 65531, 14, 65532, 65533, 18, 65534, 65535, 0};

    /* JADX INFO: renamed from: yj */
    private static final int[] f8985yj = {61440, 61695, 3, 11904, 12031, 1, 12288, 12351, 1, 12352, 12447, 1, 12448, 12543, 1, 12544, 12591, 1, 12592, 12687, 1, 12736, 12783, 1, 12784, 12799, 1, 12800, 13055, 1, 13056, 13311, 1, 13312, 19903, 1, 19968, 40959, 1, 44032, 55215, 1, 63744, 64255, 1, 65072, 65103, 1, 65281, 65535, 1, 1424, 1535, 2, TableStyleOptions.DEFAULT_2003, 1791, 2, 1872, 1919, 2, 2304, 2431, 2, 2432, 2559, 2, 2560, 2687, 2, 2688, 2815, 2, 2816, 2943, 2, 2944, 3071, 2, 3072, 3199, 2, 3200, 3327, 2, 3328, 3455, 2, 3456, 3583, 2, 3584, 3711, 2, 4096, 4255, 2};

    /* JADX INFO: renamed from: rv */
    private static final char[] f8976rv = {',', FilenameUtils.EXTENSION_SEPARATOR, 12289, 12290, '!', 65292, 65294, 65307, '?'};

    /* JADX INFO: renamed from: ne */
    private static final char[] f8974ne = {'(', ')', ')', '(', '<', '>', '>', '<', '[', ']', ']', '[', '{', '}', '}', '{', 171, 187, 187, 171, 8249, 8250, 8250, 8249, 8261, 8262, 8262, 8261, 8317, 8318, 8318, 8317, 8333, 8334, 8334, 8333, 8712, 8715, 8713, 8716, 8714, 8717, 8715, 8712, 8716, 8713, 8717, 8714, 8725, 10741, 8764, 8765, 8765, 8764, 8771, 8909, 8786, 8787, 8787, 8786, 8788, 8789, 8789, 8788, 8804, 8805, 8805, 8804, 8806, 8807, 8807, 8806, 8808, 8809, 8809, 8808, 8810, 8811, 8811, 8810, 8814, 8815, 8815, 8814, 8816, 8817, 8817, 8816, 8818, 8819, 8819, 8818, 8820, 8821, 8821, 8820, 8822, 8823, 8823, 8822, 8824, 8825, 8825, 8824, 8826, 8827, 8827, 8826, 8828, 8829, 8829, 8828, 8830, 8831, 8831, 8830, 8832, 8833, 8833, 8832, 8834, 8835, 8835, 8834, 8836, 8837, 8837, 8836, 8838, 8839, 8839, 8838, 8840, 8841, 8841, 8840, 8842, 8843, 8843, 8842, 8847, 8848, 8848, 8847, 8849, 8850, 8850, 8849, 8856, 10680, 8866, 8867, 8867, 8866, 8870, 10974, 8872, 10980, 8873, 10979, 8875, 10981, 8880, 8881, 8881, 8880, 8882, 8883, 8883, 8882, 8884, 8885, 8885, 8884, 8886, 8887, 8887, 8886, 8905, 8906, 8906, 8905, 8907, 8908, 8908, 8907, 8909, 8771, 8912, 8913, 8913, 8912, 8918, 8919, 8919, 8918, 8920, 8921, 8921, 8920, 8922, 8923, 8923, 8922, 8924, 8925, 8925, 8924, 8926, 8927, 8927, 8926, 8928, 8929, 8929, 8928, 8930, 8931, 8931, 8930, 8932, 8933, 8933, 8932, 8934, 8935, 8935, 8934, 8936, 8937, 8937, 8936, 8938, 8939, 8939, 8938, 8940, 8941, 8941, 8940, 8944, 8945, 8945, 8944, 8946, 8954, 8947, 8955, 8948, 8956, 8950, 8957, 8951, 8958, 8954, 8946, 8955, 8947, 8956, 8948, 8957, 8950, 8958, 8951, 8968, 8969, 8969, 8968, 8970, 8971, 8971, 8970, 9001, 9002, 9002, 9001, 10088, 10089, 10089, 10088, 10090, 10091, 10091, 10090, 10092, 10093, 10093, 10092, 10094, 10095, 10095, 10094, 10096, 10097, 10097, 10096, 10098, 10099, 10099, 10098, 10100, 10101, 10101, 10100, 10197, 10198, 10198, 10197, 10205, 10206, 10206, 10205, 10210, 10211, 10211, 10210, 10212, 10213, 10213, 10212, 10214, 10215, 10215, 10214, 10216, 10217, 10217, 10216, 10218, 10219, 10219, 10218, 10627, 10628, 10628, 10627, 10629, 10630, 10630, 10629, 10631, 10632, 10632, 10631, 10633, 10634, 10634, 10633, 10635, 10636, 10636, 10635, 10637, 10640, 10638, 10639, 10639, 10638, 10640, 10637, 10641, 10642, 10642, 10641, 10643, 10644, 10644, 10643, 10645, 10646, 10646, 10645, 10647, 10648, 10648, 10647, 10680, 8856, 10688, 10689, 10689, 10688, 10692, 10693, 10693, 10692, 10703, 10704, 10704, 10703, 10705, 10706, 10706, 10705, 10708, 10709, 10709, 10708, 10712, 10713, 10713, 10712, 10714, 10715, 10715, 10714, 10741, 8725, 10744, 10745, 10745, 10744, 10748, 10749, 10749, 10748, 10795, 10796, 10796, 10795, 10797, 10796, 10798, 10797, 10804, 10805, 10805, 10804, 10812, 10813, 10813, 10812, 10852, 10853, 10853, 10852, 10873, 10874, 10874, 10873, 10877, 10878, 10878, 10877, 10879, 10880, 10880, 10879, 10881, 10882, 10882, 10881, 10883, 10884, 10884, 10883, 10891, 10892, 10892, 10891, 10897, 10898, 10898, 10897, 10899, 10900, 10900, 10899, 10901, 10902, 10902, 10901, 10903, 10904, 10904, 10903, 10905, 10906, 10906, 10905, 10907, 10908, 10908, 10907, 10913, 10914, 10914, 10913, 10918, 10919, 10919, 10918, 10920, 10921, 10921, 10920, 10922, 10923, 10923, 10922, 10924, 10925, 10925, 10924, 10927, 10928, 10928, 10927, 10931, 10932, 10932, 10931, 10939, 10940, 10940, 10939, 10941, 10942, 10942, 10941, 10943, 10944, 10944, 10943, 10945, 10946, 10946, 10945, 10947, 10948, 10948, 10947, 10949, 10950, 10950, 10949, 10957, 10958, 10958, 10957, 10959, 10960, 10960, 10959, 10961, 10962, 10962, 10961, 10963, 10964, 10964, 10963, 10965, 10966, 10966, 10965, 10974, 8870, 10979, 8873, 10980, 8872, 10981, 8875, 10988, 10989, 10989, 10988, 10999, 11000, 11000, 10999, 11001, 11002, 11002, 11001, 12296, 12297, 12297, 12296, 12298, 12299, 12299, 12298, 12300, 12301, 12301, 12300, 12302, 12303, 12303, 12302, 12304, 12305, 12305, 12304, 12308, 12309, 12309, 12308, 12310, 12311, 12311, 12310, 12312, 12313, 12313, 12312, 12314, 12315, 12315, 12314, 65288, 65289, 65289, 65288, 65308, 65310, 65310, 65308, 65339, 65341, 65341, 65339, 65371, 65373, 65373, 65371, 65375, 65376, 65376, 65375, 65378, 65379, 65379, 65378};

    /* JADX INFO: renamed from: ix */
    private static final char[] f8968ix = {ControlChar.SPACE_CHAR, ControlChar.DEFAULT_TEXT_INPUT_CHAR, 8195, 12288};

    /* JADX INFO: renamed from: u4 */
    private static final char[] f8978u4 = {ControlChar.NON_BREAKING_SPACE_CHAR, 6158, 8192, 8193, 8196, 8197, 8198, 8199, 8200, 8201, 8202, 8203, 8287, 8239, 65279};

    /* JADX INFO: renamed from: uz */
    private static final char[] f8981uz = {65288, 65289, 65309, 65343, 65371, 65372, 65373, 65374, 65375, 65376, 65378, 65379, 65507, 65508, 65512, 65513, 65514, 65515, 65516, 65306, 12540};

    /* JADX INFO: renamed from: wl */
    private static final char[] f8982wl = {65289, 65373, 65379, 65306, 65307, 65292, 12289, 12290};

    /* JADX INFO: renamed from: bv */
    private static final Dictionary<Short, List<Short>> f8961bv = new Dictionary<>();

    static {
        int i = 0;
        List<Character> list = new List<>();
        f8969jd = list;
        OooO00o.OooO00o('+', list, '<', '>', '=');
        list.addItem((char) 215);
        List<Character> list2 = new List<>();
        f8963ck = list2;
        OooO00o.OooO00o((char) 8747, list2, (char) 8748, (char) 8749, (char) 8750);
        OooO00o.OooO00o((char) 8751, list2, (char) 8752, (char) 8753, (char) 8754);
        list2.addItem((char) 8755);
        List<Character> list3 = new List<>();
        f8972ks = list3;
        OooO00o.OooO00o((char) 1575, list3, (char) 1583, (char) 1585, (char) 65198);
        OooO00o.OooO00o((char) 1586, list3, (char) 1819, (char) 1608, (char) 1571);
        list3.addItem((char) 1613);
        list3.addItem((char) 1577);
        List<Character> list4 = new List<>();
        f8984x6 = list4;
        list4.addItem((char) 65281);
        list4.addItem((char) 65289);
        list4.addItem((char) 65306);
        list4.addItem((char) 65307);
        list4.addItem((char) 65311);
        List<Character> list5 = new List<>();
        f8975qq = list5;
        OooO00o.OooO00o('(', list5, '[', '{', (char) 3898);
        list5.addItem((char) 3900);
        list5.addItem((char) 5787);
        list5.addItem((char) 8218);
        list5.addItem((char) 8222);
        list5.addItem((char) 8261);
        list5.addItem((char) 8317);
        list5.addItem((char) 8333);
        OooO00o.OooO00o((char) 8968, list5, (char) 8970, (char) 9001, (char) 10647);
        OooO00o.OooO00o((char) 12296, list5, (char) 12298, (char) 12300, (char) 65113);
        OooO00o.OooO00o((char) 65115, list5, (char) 65117, (char) 65288, (char) 65339);
        list5.addItem((char) 65371);
        list5.addItem((char) 65375);
        list5.addItem((char) 171);
        list5.addItem((char) 8216);
        list5.addItem((char) 8219);
        list5.addItem((char) 8223);
        list5.addItem((char) 8249);
        List<Character> list6 = new List<>();
        f8960ar = list6;
        OooO00o.OooO00o(')', list6, ']', '}', (char) 8262);
        list6.addItem((char) 8318);
        list6.addItem((char) 8334);
        list6.addItem((char) 8220);
        OooO00o.OooO00o((char) 8969, list6, (char) 8971, (char) 9002, (char) 10648);
        list6.addItem((char) 12297);
        list6.addItem((char) 12299);
        list6.addItem((char) 12301);
        list6.addItem((char) 65289);
        list6.addItem((char) 65341);
        list6.addItem((char) 65373);
        list6.addItem((char) 65376);
        List<Character> list7 = new List<>();
        f8979um = list7;
        list7.addItem((char) 8364);
        list7.addItem((char) 8218);
        list7.addItem((char) 402);
        list7.addItem((char) 8222);
        OooO00o.OooO00o((char) 8230, list7, (char) 8224, (char) 8225, (char) 710);
        list7.addItem((char) 8240);
        list7.addItem((char) 352);
        list7.addItem((char) 8249);
        list7.addItem((char) 338);
        list7.addItem((char) 381);
        list7.addItem((char) 8216);
        list7.addItem((char) 8217);
        list7.addItem((char) 8220);
        OooO00o.OooO00o((char) 8221, list7, (char) 8226, (char) 8211, (char) 8212);
        OooO00o.OooO00o((char) 732, list7, (char) 8482, (char) 353, (char) 8250);
        list7.addItem((char) 339);
        list7.addItem((char) 382);
        list7.addItem((char) 376);
        List<Character> list8 = new List<>();
        f8970k4 = list8;
        list8.addItem((char) 8237);
        list8.addItem((char) 8238);
        list8.addItem((char) 8236);
        int i2 = 0;
        while (true) {
            int[] iArr = f8980up;
            if (i2 >= iArr.length) {
                break;
            }
            int i3 = 65535 & iArr[i2 + 1];
            byte b = (byte) iArr[i2 + 2];
            for (int i4 = iArr[i2] & 65535; i4 <= i3; i4++) {
                f8971kk[i4] = b & 255;
            }
            i2 += 3;
        }
        int i5 = 0;
        while (true) {
            char[] cArr = f8976rv;
            if (i5 >= cArr.length) {
                break;
            }
            int[] iArr2 = f8971kk;
            char c = cArr[i5];
            iArr2[c] = ((iArr2[c] & 65535) | 64) & 65535;
            i5++;
        }
        int i6 = 0;
        while (true) {
            List<Character> list9 = f8984x6;
            if (i6 >= list9.size()) {
                break;
            }
            int[] iArr3 = f8971kk;
            iArr3[list9.get_Item(i6).charValue()] = ((iArr3[list9.get_Item(i6).charValue()] & 65535) | 64) & 65535;
            i6++;
        }
        for (int i7 = 19968; i7 <= 40959; i7++) {
            int[] iArr4 = f8971kk;
            iArr4[i7] = ((iArr4[i7] & 65535) | 128) & 65535;
        }
        for (int i8 = 13312; i8 <= 19903; i8++) {
            int[] iArr5 = f8971kk;
            iArr5[i8] = ((iArr5[i8] & 65535) | 128) & 65535;
        }
        for (int i9 = 63744; i9 <= 64255; i9++) {
            int[] iArr6 = f8971kk;
            iArr6[i9] = ((iArr6[i9] & 65535) | 128) & 65535;
        }
        int i10 = 0;
        while (true) {
            int[] iArr7 = f8985yj;
            if (i10 >= iArr7.length) {
                break;
            }
            int i11 = iArr7[i10 + 1] & 65535;
            int i12 = (iArr7[i10 + 2] & 65535) << 8;
            for (int i13 = iArr7[i10] & 65535; i13 <= i11; i13++) {
                int[] iArr8 = f8971kk;
                iArr8[i13] = ((iArr8[i13] & 65535) | (i12 & 65535)) & 65535;
            }
            i10 += 3;
        }
        int i14 = 0;
        while (true) {
            char[] cArr2 = f8968ix;
            if (i14 >= cArr2.length) {
                break;
            }
            int[] iArr9 = f8971kk;
            char c2 = cArr2[i14];
            iArr9[c2] = ((iArr9[c2] & 65535) | 1024) & 65535;
            i14++;
        }
        int i15 = 0;
        while (true) {
            char[] cArr3 = f8978u4;
            if (i15 >= cArr3.length) {
                break;
            }
            int[] iArr10 = f8971kk;
            char c3 = cArr3[i15];
            iArr10[c3] = ((iArr10[c3] & 65535) | 2048) & 65535;
            i15++;
        }
        int i16 = 0;
        while (true) {
            char[] cArr4 = f8981uz;
            if (i16 >= cArr4.length) {
                break;
            }
            int[] iArr11 = f8971kk;
            char c4 = cArr4[i16];
            iArr11[c4] = ((iArr11[c4] & 65535) | 4096) & 65535;
            i16++;
        }
        int i17 = 0;
        while (true) {
            char[] cArr5 = f8982wl;
            if (i17 >= cArr5.length) {
                break;
            }
            int[] iArr12 = f8971kk;
            char c5 = cArr5[i17];
            iArr12[c5] = ((iArr12[c5] & 65535) | 8192) & 65535;
            i17++;
        }
        int i18 = 0;
        while (true) {
            char[] cArr6 = f8977to;
            if (i18 >= cArr6.length) {
                break;
            }
            cArr6[i18] = (char) i18;
            i18++;
        }
        while (true) {
            char[] cArr7 = f8974ne;
            if (i >= cArr7.length) {
                m12861k4();
                m12890x1();
                return;
            } else {
                f8977to[cArr7[i]] = cArr7[i + 1];
                i += 2;
            }
        }
    }

    /* JADX INFO: renamed from: ak */
    private static boolean m12844ak(char c) {
        return f8972ks.containsItem(Character.valueOf(c));
    }

    /* JADX INFO: renamed from: ar */
    public static boolean m12845ar(char c) {
        return f8960ar.containsItem(Character.valueOf(c));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[ADDED_TO_REGION, FALL_THROUGH, RETURN] */
    /* JADX INFO: renamed from: b3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m12846b3(char c) {
        if (f8969jd.containsItem(Character.valueOf(c))) {
            return true;
        }
        if (8704 <= c && c <= 8959 && !f8963ck.containsItem(Character.valueOf(c)) && c != 8767 && c != 8868) {
            switch (c) {
                default:
                    switch (c) {
                        default:
                            switch (c) {
                                default:
                                    switch (c) {
                                        default:
                                            switch (c) {
                                                case 8894:
                                                case 8895:
                                                case 8896:
                                                case 8897:
                                                case 8898:
                                                case 8899:
                                                    break;
                                                default:
                                                    return true;
                                            }
                                        case 8734:
                                        case 8735:
                                        case 8736:
                                        case 8737:
                                        case 8738:
                                            return false;
                                    }
                                case 8730:
                                case 8731:
                                case 8732:
                                    break;
                            }
                        case 8718:
                        case 8719:
                        case 8720:
                        case 8721:
                            break;
                    }
                case 8704:
                case 8705:
                case 8706:
                case 8707:
                case 8708:
                case 8709:
                case 8710:
                case 8711:
                    break;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: bv */
    public static boolean m12847bv(char c) {
        return c > 1023 && c < 1328;
    }

    /* JADX INFO: renamed from: c5 */
    public static boolean m12848c5(char c) {
        return c == 1611 || c == 1612 || c == 1613 || c == 1614 || c == 1615 || c == 1616 || c == 1617 || c == 1618 || c == 1619 || c == 1648;
    }

    /* JADX INFO: renamed from: ck */
    public static boolean m12849ck(char c) {
        return (f8971kk[c] & 32) != 0;
    }

    /* JADX INFO: renamed from: du */
    public static byte m12850du(int i) {
        if (m12869k4(i)) {
            return (byte) 4;
        }
        return m12881to(i);
    }

    /* JADX INFO: renamed from: dy */
    public static boolean m12852dy(char c) {
        return c == 173;
    }

    /* JADX INFO: renamed from: fa */
    public static int m12853fa(char c) {
        return f8964du[m12856jd(c) & 255];
    }

    /* JADX INFO: renamed from: h4 */
    public static boolean m12854h4(char c) {
        return m12881to((int) c) == 1;
    }

    /* JADX INFO: renamed from: ix */
    public static boolean m12855ix(char c) {
        return c >= 55296 && c <= 56319;
    }

    /* JADX INFO: renamed from: jd */
    public static byte m12856jd(char c) {
        return (byte) (f8971kk[c] & 31);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m12857k4(byte b) {
        return f8964du[b & 255];
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m12872kk(byte b) {
        return b >= 15;
    }

    /* JADX INFO: renamed from: ks */
    public static boolean m12875ks(char c) {
        return (f8971kk[c] & 1024) != 0;
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m12876lr(char c) {
        if (c <= 12591 || c >= 12688) {
            return c > 44031 && c < 55216;
        }
        return true;
    }

    /* JADX INFO: renamed from: m9 */
    public static boolean m12877m9(char c) {
        return c == 8211 || c == 8212 || c == '-';
    }

    /* JADX INFO: renamed from: ne */
    public static boolean m12878ne(char c) {
        return (f8971kk[c] & 4096) != 0;
    }

    /* JADX INFO: renamed from: qq */
    public static boolean m12879qq(char c) {
        return f8975qq.containsItem(Character.valueOf(c));
    }

    /* JADX INFO: renamed from: rv */
    public static boolean m12880rv(char c) {
        return (f8971kk[c] & 2048) != 0;
    }

    /* JADX INFO: renamed from: to */
    public static byte m12881to(int i) {
        return i > 65535 ? m12869k4(i) ? (byte) 4 : (byte) 1 : (byte) (((f8971kk[i & 65535] & 65535) >> 8) & 3);
    }

    /* JADX INFO: renamed from: u4 */
    public static boolean m12883u4(char c) {
        return c >= 12352 && c <= 12543;
    }

    /* JADX INFO: renamed from: um */
    public static boolean m12884um(char c) {
        return (c >= 160 && c <= 255) || f8979um.containsItem(Character.valueOf(c));
    }

    /* JADX INFO: renamed from: up */
    public static boolean m12885up(char c) {
        return c <= 8207 ? c >= 8206 : c <= 8239 && c >= 8234;
    }

    /* JADX INFO: renamed from: uz */
    public static boolean m12886uz(char c) {
        return ((short) c) == 12540;
    }

    /* JADX INFO: renamed from: v4 */
    public static boolean m12887v4(char c) {
        return c == 286 || c == 287 || c == 304 || c == 305 || c == 350 || c == 351;
    }

    /* JADX INFO: renamed from: wl */
    public static boolean m12888wl(char c) {
        return c >= 12288 && c <= 12351;
    }

    /* JADX INFO: renamed from: wy */
    public static boolean m12889wy(char c) {
        return c == '%' || c == 65130 || c == 65285;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m12890x1() {
        List<Short> list = new List<>();
        list.addItem((short) 12449);
        list.addItem((short) 12451);
        list.addItem((short) 12455);
        list.addItem((short) 12457);
        Dictionary<Short, List<Short>> dictionary = f8961bv;
        dictionary.addItem((short) 12532, list);
        List<Short> list2 = new List<>();
        list2.addItem((short) 12449);
        list2.addItem((short) 12451);
        list2.addItem((short) 12455);
        list2.addItem((short) 12457);
        dictionary.addItem((short) 12501, list2);
        List<Short> list3 = new List<>();
        list3.addItem((short) 12515);
        list3.addItem((short) 12517);
        list3.addItem((short) 12455);
        list3.addItem((short) 12519);
        dictionary.addItem((short) 12481, list3);
        List<Short> list4 = new List<>();
        list4.addItem((short) 12515);
        list4.addItem((short) 12455);
        list4.addItem((short) 12517);
        list4.addItem((short) 12519);
        dictionary.addItem((short) 12472, list4);
        List<Short> list5 = new List<>();
        list5.addItem((short) 12515);
        list5.addItem((short) 12517);
        list5.addItem((short) 12455);
        list5.addItem((short) 12519);
        dictionary.addItem((short) 12471, list5);
        List<Short> list6 = new List<>();
        list6.addItem((short) 12451);
        list6.addItem((short) 12455);
        list6.addItem((short) 12457);
        dictionary.addItem((short) 12454, list6);
        List<Short> list7 = new List<>();
        list7.addItem((short) 12451);
        dictionary.addItem((short) 12487, list7);
        List<Short> list8 = new List<>();
        list8.addItem((short) 12451);
        dictionary.addItem((short) 12486, list8);
        List<Short> list9 = new List<>();
        list9.addItem((short) 12453);
        dictionary.addItem((short) 12489, list9);
        List<Short> list10 = new List<>();
        list10.addItem((short) 12453);
        dictionary.addItem((short) 12488, list10);
    }

    /* JADX INFO: renamed from: x6 */
    public static boolean m12894x6(char c) {
        return m12875ks(c) || m12880rv(c);
    }

    /* JADX INFO: renamed from: yd */
    public static boolean m12895yd(char c) {
        return c > 1423 && c < 1536;
    }

    /* JADX INFO: renamed from: yj */
    public static char m12896yj(char c) {
        return f8977to[c];
    }

    /* JADX INFO: renamed from: du */
    public static boolean m12851du(char c) {
        return f8977to[c] != c;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m12858k4(String str, int i) {
        int i2;
        if (str == null || i < 0 || i >= str.length()) {
            return 0;
        }
        char cCharAt = str.charAt(i);
        return (!m12855ix(cCharAt) || (i2 = i + 1) >= str.length()) ? cCharAt : C14117yj.m67525k4(cCharAt, str.charAt(i2));
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m12873kk(char c) {
        return (f8971kk[c & 65535] & 64) == 64;
    }

    /* JADX INFO: renamed from: to */
    public static boolean m12882to(char c) {
        return f8984x6.containsItem(Character.valueOf(c));
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m12891x1(byte b) {
        return b <= 6;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m12859k4(char[] cArr, int i, IGenericList<Byte> iGenericList, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String strM67441x1;
        int i8 = 2;
        char[] cArr2 = new char[cArr.length];
        AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) cArr), AbstractC14092to.m67208k4((Object) cArr2), cArr.length);
        int i9 = 1;
        int i10 = 0;
        boolean z = (iGenericList.get_Item(i2).byteValue() & 1) != 0;
        C6765kp c6765kp = new C6765kp();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i) {
            int i13 = i2 + i11;
            byte bByteValue = iGenericList.get_Item(i13).byteValue();
            int i14 = bByteValue & 255;
            int i15 = bByteValue & PatternStyle.Wave;
            if (i15 != 0) {
                int i16 = i11 - i12;
                if (i16 > 0) {
                    if (z) {
                        AbstractC14092to.m67259x1(AbstractC14092to.m67208k4((Object) cArr), i12, i16);
                        c6765kp.m26788k4(i10, cArr, i12, i16);
                    } else {
                        c6765kp.m26799k4(cArr, i12, i16);
                    }
                }
                if (i15 == 16) {
                    int i17 = (bByteValue & 4) == 0 ? i9 : i10;
                    int i18 = i11;
                    while (true) {
                        int i19 = i18 + 1;
                        if ((iGenericList.get_Item(i2 + i19).byteValue() & 16) == 0) {
                            break;
                        }
                        i18 = i19;
                    }
                    int i20 = i18 + i8;
                    String strM67408k4 = "";
                    if (i11 < i - 1) {
                        i3 = i8;
                        if (cArr[i11] == 1604) {
                            char c = cArr[i11 + 1];
                            strM67441x1 = c == 1570 ? C14113y2.m67407k4("", Character.valueOf((char) (65269 + i17))) : "";
                            i5 = i10;
                            if (c == 1571) {
                                strM67441x1 = C14113y2.m67407k4("", Character.valueOf((char) (65271 + i17)));
                            }
                            if (c == 1573) {
                                strM67441x1 = C14113y2.m67407k4("", Character.valueOf((char) (65273 + i17)));
                            }
                            if (c == 1575) {
                                strM67441x1 = C14113y2.m67441x1("", ((i11 <= 0 || !m12844ak(cArr2[i11 + (-1)])) ? i5 : i9) == 0 ? (char) (65275 + i17) : (char) 65275);
                            }
                            i7 = i3;
                        } else {
                            i5 = i10;
                            i7 = i9;
                            strM67441x1 = "";
                        }
                        int i21 = i11 + 1;
                        int i22 = i9;
                        if (cArr[i21] == 1611) {
                            if (cArr[i11] == 1575) {
                                strM67441x1 = C14113y2.m67441x1("", ((i11 <= 0 || !m12844ak(cArr[i11 + (-1)])) ? i5 : i22) != 0 ? (char) 64829 : (char) 64828);
                            }
                            i7 = i3;
                        }
                        strM67408k4 = strM67441x1;
                        if (C14113y2.m67411k4(strM67408k4) && m12848c5(cArr[i21])) {
                            char[] cArr3 = new char[i22];
                            cArr3[i5] = cArr[i11];
                            m12864k4(cArr3, (byte) (((iGenericList.get_Item(i13).byteValue() & 255) >> 2) & 3));
                            cArr[i11] = cArr3[i5];
                            List list = new List();
                            list.addItem(Character.valueOf(cArr[i11]));
                            for (int i23 = 1; i23 < i20 - i11; i23++) {
                                list.addItem(Character.valueOf(cArr[i11 + i23]));
                            }
                            i4 = 1;
                            strM67408k4 = C14113y2.m67405k4(C3085sv.m13093k4((List<Character>) list));
                            i6 = i3;
                        } else {
                            i4 = i22;
                            i6 = i7;
                        }
                    } else {
                        i3 = i8;
                        i4 = i9;
                        i5 = i10;
                        i6 = i4;
                    }
                    int i24 = (i20 - i11) - i6;
                    if (i24 > i4) {
                        strM67408k4 = C14113y2.m67408k4(C14113y2.m67389k4(ControlChar.SPACE_CHAR, i24 - i4), strM67408k4);
                    }
                    String strM67402k4 = i17 != 0 ? C14113y2.m67402k4("{0}{1}{2}{3}", (char) 8238, (char) 8237, strM67408k4, (char) 8236) : C14113y2.m67402k4("{0}{1}{2}", (char) 8238, strM67408k4, (char) 8236);
                    if (strM67402k4.length() > 0) {
                        if (z) {
                            c6765kp.m26786k4(i5, strM67402k4);
                        } else {
                            c6765kp.m26792k4(strM67402k4);
                        }
                    }
                    i12 = i20;
                } else {
                    i3 = i8;
                    i12 = i11 + i9;
                }
                i11 = i12;
            } else {
                i3 = i8;
                char[] cArr4 = new char[i9];
                cArr4[0] = cArr[i11];
                m12864k4(cArr4, (byte) ((i14 >> 2) & 3));
                char c2 = cArr4[0];
                cArr[i11] = c2;
                if (z) {
                    cArr[i11] = m12896yj(c2);
                }
                i11++;
            }
            i8 = i3;
            i9 = 1;
            i10 = 0;
        }
        int i25 = i8;
        int i26 = i11 - i12;
        if (i26 > 0) {
            if (z) {
                AbstractC14092to.m67259x1(AbstractC14092to.m67208k4((Object) cArr), i12, i26);
                c6765kp.m26788k4(0, cArr, i12, i26);
            } else {
                c6765kp.m26799k4(cArr, i12, i26);
            }
        }
        if (z && c6765kp.m26807x1() > 1) {
            int i27 = 0;
            while (true) {
                if (i27 >= c6765kp.m26807x1()) {
                    break;
                }
                int i28 = i25;
                if (m12853fa(c6765kp.m26806x1(i27)) == i28) {
                    c6765kp.m26808x1(0, (char) 8237);
                    c6765kp.m26780k4((char) 8236);
                    break;
                }
                i27++;
                i25 = i28;
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m12874kk(int i) {
        return i > 65023 && i < 65040;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m12892x1(char c) {
        C3040c5 c3040c5 = f8983x1[(c >> '\b') & 255];
        if (c3040c5 == null) {
            return false;
        }
        return c3040c5.f8933kk[c & 255];
    }

    /* JADX INFO: renamed from: k4 */
    public static String m12860k4(char[] cArr, int i, boolean z) {
        AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) cArr), AbstractC14092to.m67208k4((Object) new char[cArr.length]), cArr.length);
        C6765kp c6765kp = new C6765kp();
        int i2 = 0;
        while (i2 < i) {
            if (z) {
                cArr[i2] = m12896yj(cArr[i2]);
            }
            i2++;
        }
        if (i2 > 0) {
            C11687fa c11687faM55122x1 = C11689jd.m55122x1(C14113y2.m67405k4(cArr));
            if (z) {
                while (c11687faM55122x1.hasNext()) {
                    c6765kp.m26786k4(0, c11687faM55122x1.m55107k4());
                }
            } else {
                while (c11687faM55122x1.hasNext()) {
                    if (c11687faM55122x1.m55107k4().charAt(0) != 8234) {
                        c6765kp.m26792k4(c11687faM55122x1.m55107k4());
                    }
                }
            }
        }
        if (z && c6765kp.m26807x1() > 1) {
            int i3 = 0;
            while (true) {
                if (i3 >= c6765kp.m26807x1()) {
                    break;
                }
                if (m12853fa(c6765kp.m26806x1(i3)) == 2) {
                    c6765kp.m26808x1(0, (char) 8237);
                    c6765kp.m26780k4((char) 8236);
                    break;
                }
                i3++;
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m12893x1(int i) {
        if (i < 127995 || i > 127999) {
            return i >= 129456 && i <= 129459;
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m12861k4() {
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            f8983x1[i2] = null;
        }
        int length = f8966fa.length / 5;
        for (int i3 = 0; i3 < length; i3++) {
            for (int i4 = 0; i4 < 5; i4++) {
                char c = f8966fa[(i3 * 5) + i4];
                if (c != 0) {
                    C3040c5[] c3040c5Arr = f8983x1;
                    int i5 = ((byte) ((c >> '\b') & 255)) & 255;
                    if (c3040c5Arr[i5] == null) {
                        c3040c5Arr[i5] = new C3040c5();
                    }
                    c3040c5Arr[i5].f8932k4[c & 255] = i3;
                }
            }
        }
        int i6 = 0;
        while (true) {
            char[] cArr = f8965dy;
            if (i6 >= cArr.length) {
                break;
            }
            char c2 = cArr[i6];
            C3040c5[] c3040c5Arr2 = f8983x1;
            int i7 = ((byte) ((c2 >> '\b') & 255)) & 255;
            if (c3040c5Arr2[i7] == null) {
                c3040c5Arr2[i7] = new C3040c5();
            }
            c3040c5Arr2[i7].f8934x1[c2 & 255] = true;
            i6++;
        }
        while (true) {
            char[] cArr2 = f8962c5;
            if (i >= cArr2.length) {
                return;
            }
            char c3 = cArr2[i];
            C3040c5[] c3040c5Arr3 = f8983x1;
            int i8 = ((byte) ((c3 >> '\b') & 255)) & 255;
            if (c3040c5Arr3[i8] == null) {
                c3040c5Arr3[i8] = new C3040c5();
            }
            c3040c5Arr3[i8].f8933kk[c3 & 255] = true;
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0083 A[PHI: r8
      0x0083: PHI (r8v2 boolean) = (r8v1 boolean), (r8v4 boolean), (r8v4 boolean) binds: [B:22:0x0039, B:42:0x0077, B:44:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m12862k4(String str, byte[] bArr) {
        boolean z;
        int i;
        int i2;
        if (bArr == null) {
            throw new ArgumentNullException("levels");
        }
        int length = str.length();
        C14113y2.m67365dy(str);
        int i3 = 0;
        int i4 = 0;
        char cCharAt = 0;
        while (true) {
            int i5 = 1;
            if (i3 >= length) {
                break;
            }
            char cCharAt2 = str.charAt(i3);
            int iM12853fa = m12853fa(cCharAt2);
            if (i3 > 0 && m12848c5(cCharAt2)) {
                if (i3 < length - 1) {
                    iM12853fa = i4;
                }
                bArr[i3] = bArr[i3 - 1];
            }
            boolean z2 = (i4 == iM12853fa || iM12853fa == 0) ? false : true;
            boolean z3 = (i4 == iM12853fa || i4 == 0) ? false : true;
            if (iM12853fa == 0) {
                int i6 = iM12853fa;
                z = z3;
                i4 = i6;
            } else {
                if (!z2) {
                    z2 = m12866k4(cCharAt) || cCharAt == 1571 || cCharAt == 1575 || cCharAt == 1585;
                    if (cCharAt == 1604 && (cCharAt2 == 1570 || cCharAt2 == 1571 || cCharAt2 == 1573 || cCharAt2 == 1575)) {
                        int i7 = i3 - 1;
                        bArr[i7] = (byte) ((bArr[i7] & 255) | 16);
                        bArr[i3] = (byte) ((bArr[i3] & 255) | 32);
                    }
                }
                if (!z3 && m12892x1(cCharAt2)) {
                    i4 = 0;
                    z2 = false;
                    z = true;
                }
            }
            if (cCharAt2 >= 1611 && cCharAt2 <= 1630) {
                int i8 = i3;
                do {
                    bArr[i8] = (byte) ((bArr[i8] & 255) | 32);
                    if (i8 > 0) {
                        i8--;
                    }
                    bArr[i8] = (byte) ((bArr[i8] & 255) | 16);
                    if (i8 <= 0) {
                        break;
                    }
                } while (m12853fa(str.charAt(i8)) == 0);
            }
            if (z) {
                bArr[i3] = (byte) ((bArr[i3] & 255) | 8);
                while (true) {
                    i2 = i3 - i5;
                    if (i2 < 0 || !m12848c5(str.charAt(i2))) {
                        break;
                    }
                    bArr[i2] = (byte) ((bArr[i2] & 255) | 8);
                    i5++;
                }
                if (i3 >= i5) {
                    bArr[i2] = (byte) ((bArr[i2] & 255) | 8);
                }
            }
            if (z2) {
                bArr[i3] = (byte) ((bArr[i3] & 255) | 4);
            }
            if (str.charAt(i3) == 8207 && (i = i3 + 1) < length) {
                bArr[i] = 0;
            }
            if (!m12848c5(cCharAt2)) {
                cCharAt = str.charAt(i3);
            }
            i3++;
        }
        if (i3 <= 0 || i4 == 0) {
            return;
        }
        int i9 = i3 - 1;
        bArr[i9] = (byte) ((bArr[i9] & 255) | 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01a4  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m12863k4(byte[] bArr, byte[] bArr2) {
        int i;
        byte b;
        byte b2;
        byte b3;
        int i2;
        byte b4;
        int length = bArr.length;
        byte b5 = 0;
        byte b6 = (bArr2[0] & 1) != 0 ? (byte) 3 : (byte) 0;
        int i3 = 0;
        while (i3 < length) {
            byte b7 = (bArr2[i3] & 1) != 0 ? (byte) 1 : b5;
            int i4 = i3;
            while (i4 < length) {
                if (((bArr2[i4] & 1) != 0 ? (byte) 1 : b5) != b7) {
                    break;
                } else {
                    i4++;
                }
            }
            int i5 = (i4 < length ? (byte) 1 : b5) ^ b7;
            byte b8 = b7 != 0 ? (byte) 3 : b5;
            byte b9 = b6;
            int i6 = i3;
            byte b10 = b5;
            while (i6 < i4) {
                byte b11 = bArr[i6];
                byte b12 = b10;
                if (b11 == 13) {
                    bArr[i6] = b6;
                } else if (b11 == 8 && b9 == 4) {
                    bArr[i6] = 11;
                }
                b6 = bArr[i6];
                if (b6 == 4) {
                    bArr[i6] = 3;
                }
                if (m12891x1(b6)) {
                    b9 = b6;
                }
                i6++;
                b10 = b12 == true ? 1 : 0;
            }
            byte b13 = b10;
            int i7 = i3 + 1;
            int i8 = i7;
            while (true) {
                i = i4 - 1;
                if (i8 >= i) {
                    break;
                }
                byte b14 = bArr[i8];
                if (b14 == 9) {
                    if (bArr[i8 - 1] == 8) {
                        bArr[i8] = b13;
                    }
                } else if (b14 == 12) {
                    byte b15 = bArr[i8 - 1];
                    if (b15 == bArr[i8 + 1] && (b15 == 11 || b15 == 8)) {
                        bArr[i8] = b15;
                    } else if (b15 == 18) {
                        bArr[i8] = 18;
                    }
                }
                i8++;
            }
            if (i4 > 1 && bArr[i] == 9 && bArr[i4 - 2] == 8) {
                bArr[i] = 8;
            }
            byte b16 = bArr[i3];
            if (b16 == 9 || b16 == 12) {
                bArr[i3] = 18;
            }
            byte b17 = bArr[i];
            if (b17 == 9 || b17 == 12) {
                bArr[i] = 18;
            }
            byte b18 = b8;
            while (i7 < i4) {
                if (bArr[i7] == 10 && b18 == 8) {
                    bArr[i7] = 8;
                }
                byte b19 = bArr[i7];
                i7++;
                b18 = b19;
            }
            int i9 = i;
            byte b20 = i5 != 0 ? (byte) 3 : b13;
            while (i9 >= i3) {
                if (bArr[i9] == 10 && b20 == 8) {
                    bArr[i9] = 8;
                }
                byte b21 = bArr[i9];
                i9--;
                b20 = b21;
            }
            int i10 = i3;
            byte b22 = b8;
            while (i10 < i4) {
                byte b23 = bArr[i10];
                if (b23 == 8) {
                    if (b22 == 0) {
                        bArr[i10] = b13;
                    }
                } else if (m12891x1(b23)) {
                    b22 = bArr[i10];
                }
                i10++;
                b22 = b22;
            }
            int i11 = i3;
            byte b24 = b8;
            while (i11 < i4) {
                if (m12891x1(bArr[i11]) || b24 != 0) {
                    b24 = bArr[i11];
                    i11++;
                } else {
                    int i12 = i11 + 1;
                    while (i12 < i4 && !m12891x1(bArr[i12])) {
                        i12++;
                    }
                    if (i12 < i4) {
                        b4 = bArr[i12];
                    } else {
                        b4 = i5 != 0 ? (byte) 3 : b13;
                    }
                    if (b4 == 0) {
                        while (i11 < i12) {
                            bArr[i11] = b13;
                            i11++;
                        }
                    } else {
                        i11 = i12;
                    }
                }
            }
            if (b8 != 3 || i3 <= 0 || i3 >= i4) {
                b = b8;
            } else {
                int i13 = i3 - 1;
                if (m12891x1(bArr[i13])) {
                    b = bArr[i13];
                }
            }
            b6 = b;
            while (i3 < i4) {
                if (!m12872kk(bArr[i3])) {
                    i3++;
                } else if (m12891x1(b6) || b6 == 8 || b6 == 11) {
                    int i14 = i3 + 1;
                    while (i14 < i4 && m12872kk(bArr[i14])) {
                        i14++;
                    }
                    if (i14 < i4) {
                        b2 = bArr[i14];
                    } else {
                        b2 = i5 != 0 ? (byte) 3 : b13;
                    }
                    if (b6 == 3 || b6 == 8 || b6 == 11) {
                        b3 = (b2 == 3 || b2 == 8 || b2 == 11) ? (byte) 3 : (b2 == 0 && i3 == 0) ? b13 : b8;
                    } else if (b6 != 0 || (b2 != 0 && (b2 != 3 || i3 != i || i3 - 2 < 0 || bArr[i2] == 8))) {
                    }
                    while (i3 < i14) {
                        bArr[i3] = b3;
                        i3++;
                    }
                } else {
                    bArr[i3] = b8;
                    i3++;
                }
                b6 = bArr[i3 - 1];
            }
            i3 = i4;
            b5 = b13;
        }
        byte b25 = b5;
        for (int i15 = b5; i15 < length; i15++) {
            byte b26 = bArr[i15];
            int iM12857k4 = m12857k4(b26);
            if (m12891x1(b26)) {
                if (iM12857k4 == 1) {
                    bArr2[i15] = b25;
                } else if (iM12857k4 == 2) {
                    bArr2[i15] = 3;
                }
            } else if (iM12857k4 == 1) {
                bArr2[i15] = (byte) (bArr2[i15] & 254);
            } else if (iM12857k4 == 2) {
                bArr2[i15] = (byte) ((bArr2[i15] & 255) | 1);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m12864k4(char[] cArr, byte b) {
        if (m12853fa(cArr[0]) == 0) {
            return;
        }
        int[] iArr = {0};
        boolean zM12868k4 = m12868k4(cArr[0], iArr);
        int i = iArr[0];
        if (zM12868k4) {
            int[] iArr2 = {0};
            boolean zM12867k4 = m12867k4(cArr[0], i, iArr2);
            int i2 = iArr2[0];
            if (zM12867k4) {
                char c = f8966fa[((i2 * 5) + 4) - (b & 255)];
                if (c > 0) {
                    cArr[0] = c;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m12865k4(String[] strArr) {
        char[] cArrM67365dy = C14113y2.m67365dy(strArr[0]);
        C6765kp c6765kp = new C6765kp();
        for (int i = 0; i < cArrM67365dy.length; i++) {
            c6765kp.m26808x1(0, cArrM67365dy[i]);
            if (i < cArrM67365dy.length - 1 && m12856jd(cArrM67365dy[i]) == 4) {
                c6765kp.m26808x1(0, (char) 0);
            }
        }
        strArr[0] = c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m12866k4(char c) {
        C3040c5 c3040c5 = f8983x1[(c >> '\b') & 255];
        if (c3040c5 == null) {
            return false;
        }
        return c3040c5.f8934x1[c & 255];
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m12867k4(char c, int i, int[] iArr) {
        int i2 = f8983x1[i].f8932k4[c & 255];
        iArr[0] = i2;
        return i2 >= 0;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m12868k4(char c, int[] iArr) {
        int i = (c >> 8) & 255;
        iArr[0] = i;
        return f8983x1[i] != null;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m12869k4(int i) {
        if (i > 127744 && i < 128591) {
            return true;
        }
        if (i > 9728 && i < 10160) {
            return true;
        }
        if (i <= 129280 || i >= 129536) {
            return i > 128691 && i < 128695;
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m12870k4(String str) {
        int i = 0;
        while (true) {
            String[] strArr = f8967h4;
            if (i >= strArr.length) {
                return false;
            }
            if (C14113y2.m67363du(str, strArr[i])) {
                return true;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m12871k4(short s, short s2) {
        List[] listArr = {null};
        boolean zTryGetValue = f8961bv.tryGetValue(Short.valueOf(s), listArr);
        List list = listArr[0];
        if (zTryGetValue) {
            return list.containsItem(Short.valueOf(s2));
        }
        return false;
    }
}
