package com.aspose.words;

import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.logging.type.LogSeverity;
import com.microsoft.identity.common.java.commands.SilentTokenCommand;

/* JADX INFO: loaded from: classes6.dex */
class zzYC3 extends zzZS {
    private static zzYC3 zzXmt;

    static {
        zzYC3 zzyc3 = new zzYC3();
        zzXmt = zzyc3;
        zzyc3.add(4, 0);
        zzYC3 zzyc32 = zzXmt;
        Boolean bool = Boolean.FALSE;
        zzyc32.add(119, bool);
        zzXmt.add(120, bool);
        zzXmt.add(121, bool);
        zzXmt.add(122, bool);
        zzXmt.add(123, bool);
        zzXmt.add(124, bool);
        zzXmt.add(125, bool);
        zzXmt.add(126, bool);
        zzXmt.add(127, bool);
        zzXmt.add(128, 0);
        zzXmt.add(129, Integer.valueOf(com.aspose.words.internal.zzSA.zzp(7.2d)));
        zzXmt.add(131, Integer.valueOf(com.aspose.words.internal.zzSA.zzp(7.2d)));
        zzXmt.add(130, Integer.valueOf(com.aspose.words.internal.zzSA.zzp(3.6d)));
        zzXmt.add(132, Integer.valueOf(com.aspose.words.internal.zzSA.zzp(3.6d)));
        zzXmt.add(133, 0);
        zzXmt.add(134, 0);
        zzXmt.add(135, 0);
        zzXmt.add(136, 0);
        zzXmt.add(137, 0);
        zzXmt.add(138, 0);
        zzYC3 zzyc33 = zzXmt;
        Boolean bool2 = Boolean.TRUE;
        zzyc33.add(187, bool2);
        zzXmt.add(188, bool);
        zzXmt.add(189, bool);
        zzXmt.add(190, bool);
        zzXmt.add(191, bool);
        zzXmt.add(192, "");
        zzXmt.add(193, "");
        zzXmt.add(194, 1);
        zzXmt.add(195, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(36.0d)));
        zzXmt.add(196, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(1.0d)));
        zzXmt.add(197, "Arial");
        zzXmt.add(240, bool);
        zzXmt.add(241, bool);
        zzXmt.add(242, bool);
        zzXmt.add(243, bool);
        zzXmt.add(244, bool);
        zzXmt.add(245, bool);
        zzXmt.add(246, bool);
        zzXmt.add(StyleIdentifier.LIGHT_LIST_ACCENT_6, bool);
        zzXmt.add(StyleIdentifier.LIGHT_GRID_ACCENT_6, bool);
        zzXmt.add(StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6, bool);
        zzXmt.add(250, bool);
        zzXmt.add(StyleIdentifier.MEDIUM_LIST_1_ACCENT_6, bool);
        zzXmt.add(StyleIdentifier.MEDIUM_LIST_2_ACCENT_6, bool);
        zzXmt.add(StyleIdentifier.MEDIUM_GRID_1_ACCENT_6, bool);
        zzXmt.add(StyleIdentifier.MEDIUM_GRID_2_ACCENT_6, bool);
        zzXmt.add(255, bool);
        zzXmt.add(256, 0);
        zzXmt.add(257, 0);
        zzXmt.add(StyleIdentifier.COLORFUL_LIST_ACCENT_6, 0);
        zzXmt.add(StyleIdentifier.COLORFUL_GRID_ACCENT_6, 0);
        zzXmt.add(StyleIdentifier.INTENSE_EMPHASIS, 0);
        zzXmt.add(StyleIdentifier.SUBTLE_EMPHASIS, 0);
        zzXmt.add(404, 0);
        zzXmt.add(402, 0);
        zzXmt.add(401, 0);
        zzXmt.add(403, 0);
        zzXmt.add(391, "");
        zzXmt.add(StyleIdentifier.INTENSE_REFERENCE, com.aspose.words.internal.zzPV.zzHZ);
        zzXmt.add(StyleIdentifier.BOOK_TITLE, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(1.0d)));
        zzXmt.add(StyleIdentifier.BIBLIOGRAPHY, 0);
        zzXmt.add(StyleIdentifier.TOC_HEADING, 0);
        zzXmt.add(StyleIdentifier.GRID_TABLE_2_ACCENT_6, bool);
        zzXmt.add(StyleIdentifier.GRID_TABLE_3_ACCENT_6, bool);
        zzXmt.add(StyleIdentifier.GRID_TABLE_4_ACCENT_6, bool);
        zzXmt.add(StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6, bool);
        zzXmt.add(StyleIdentifier.LIST_TABLE_4, null);
        zzXmt.add(StyleIdentifier.LIST_TABLE_5_DARK, null);
        zzXmt.add(StyleIdentifier.LIST_TABLE_6_COLORFUL, 0);
        zzXmt.add(StyleIdentifier.LIST_TABLE_7_COLORFUL, 0);
        zzXmt.add(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_1, 0);
        zzXmt.add(StyleIdentifier.LIST_TABLE_2_ACCENT_1, 0);
        zzXmt.add(StyleIdentifier.LIST_TABLE_3_ACCENT_1, 0);
        zzXmt.add(StyleIdentifier.LIST_TABLE_4_ACCENT_1, 0);
        zzXmt.add(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_1, 0);
        zzXmt.add(StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_1, 0);
        zzXmt.add(StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_1, 0);
        zzXmt.add(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_2, 0);
        zzXmt.add(StyleIdentifier.LIST_TABLE_2_ACCENT_2, null);
        zzXmt.add(StyleIdentifier.LIST_TABLE_3_ACCENT_2, null);
        zzXmt.add(StyleIdentifier.LIST_TABLE_4_ACCENT_2, 0);
        zzXmt.add(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, 0);
        zzXmt.add(StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_2, null);
        zzXmt.add(StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2, null);
        zzXmt.add(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3, null);
        zzXmt.add(StyleIdentifier.LIST_TABLE_2_ACCENT_3, 0);
        zzXmt.add(StyleIdentifier.length, bool2);
        zzXmt.add(379, bool2);
        zzXmt.add(380, bool2);
        zzXmt.add(381, bool);
        zzXmt.add(382, bool);
        zzXmt.add(383, bool2);
        zzXmt.add(384, 0);
        zzXmt.add(385, com.aspose.words.internal.zzPV.zzI5);
        zzXmt.add(386, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(1.0d)));
        zzXmt.add(387, com.aspose.words.internal.zzPV.zzI5);
        zzXmt.add(388, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(1.0d)));
        zzXmt.add(395, 0);
        zzXmt.add(396, 0);
        zzXmt.add(397, 0);
        zzXmt.add(398, 0);
        zzXmt.add(399, 0);
        zzXmt.add(400, 0);
        zzXmt.add(405, 0);
        zzXmt.add(406, 0);
        zzXmt.add(407, null);
        zzXmt.add(408, 0);
        zzXmt.add(409, 0);
        zzXmt.add(410, 0);
        zzXmt.add(411, 0);
        zzXmt.add(441, bool);
        zzXmt.add(442, bool);
        zzXmt.add(443, bool2);
        zzXmt.add(444, bool2);
        zzXmt.add(445, bool2);
        zzXmt.add(446, bool);
        zzXmt.add(447, bool);
        zzXmt.add(448, com.aspose.words.internal.zzPV.zzKa);
        zzXmt.add(449, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(1.0d)));
        zzXmt.add(450, com.aspose.words.internal.zzPV.zzI5);
        zzXmt.add(452, 0);
        zzXmt.add(458, 0);
        zzXmt.add(459, 9525);
        zzXmt.add(461, 0);
        zzXmt.add(462, 0);
        zzXmt.add(463, null);
        zzXmt.add(464, 0);
        zzXmt.add(465, 0);
        zzXmt.add(466, 1);
        zzXmt.add(467, 1);
        zzXmt.add(468, 1);
        zzXmt.add(469, 1);
        zzXmt.add(470, 2);
        zzXmt.add(471, 2);
        zzXmt.add(507, bool);
        zzXmt.add(508, bool2);
        zzXmt.add(509, bool2);
        zzXmt.add(510, bool2);
        zzXmt.add(FrameMetricsAggregator.EVERY_DURATION, bool);
        zzXmt.add(505, bool);
        zzXmt.add(512, 0);
        zzXmt.add(InputDeviceCompat.SOURCE_DPAD, new com.aspose.words.internal.zzPV(128, 128, 128));
        zzXmt.add(514, new com.aspose.words.internal.zzPV(203, 203, 203));
        zzXmt.add(516, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(1.0d)));
        zzXmt.add(517, 25400);
        zzXmt.add(518, 25400);
        zzXmt.add(519, 0);
        zzXmt.add(520, 0);
        zzXmt.add(521, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(1.0d)));
        zzXmt.add(522, 0);
        zzXmt.add(523, 0);
        zzXmt.add(524, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(1.0d)));
        zzXmt.add(525, 0);
        zzXmt.add(526, 0);
        zzXmt.add(527, 256);
        zzXmt.add(528, 0);
        zzXmt.add(529, 0);
        zzXmt.add(574, bool);
        zzXmt.add(575, bool);
        zzXmt.add(576, 1);
        zzXmt.add(577, 0);
        zzXmt.add(578, 0);
        zzXmt.add(579, 65536);
        zzXmt.add(580, 0);
        zzXmt.add(581, 0);
        zzXmt.add(582, 65536);
        zzXmt.add(583, 0);
        zzXmt.add(584, 0);
        zzXmt.add(585, 256);
        zzXmt.add(586, 32768);
        zzXmt.add(587, 32768);
        zzXmt.add(639, bool);
        zzXmt.add(640, 0);
        zzXmt.add(641, 65536);
        zzXmt.add(642, 5);
        zzXmt.add(643, 12700);
        zzXmt.add(644, 0);
        zzXmt.add(645, 457200);
        zzXmt.add(646, 0);
        zzXmt.add(647, com.aspose.words.internal.zzPV.zzHZ);
        zzXmt.add(648, com.aspose.words.internal.zzPV.zzHZ);
        zzXmt.add(LogSeverity.ALERT_VALUE, bool);
        zzXmt.add(701, bool);
        zzXmt.add(702, bool);
        zzXmt.add(703, bool2);
        zzXmt.add(704, 0);
        zzXmt.add(705, 0);
        zzXmt.add(706, 100);
        zzXmt.add(707, 0);
        zzXmt.add(708, 0);
        zzXmt.add(709, 0);
        zzXmt.add(710, 0);
        zzXmt.add(711, 0);
        zzXmt.add(712, 0);
        zzXmt.add(713, 0);
        zzXmt.add(714, Integer.valueOf(SilentTokenCommand.ACQUIRE_TOKEN_SILENT_DEFAULT_TIMEOUT_MILLISECONDS));
        zzXmt.add(715, 1250000);
        zzXmt.add(716, -1250000);
        zzXmt.add(717, 9000000);
        zzXmt.add(718, 32768);
        zzXmt.add(719, -32768);
        zzXmt.add(720, -8847360);
        zzXmt.add(721, 50);
        zzXmt.add(722, Integer.valueOf(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH));
        zzXmt.add(723, 50000);
        zzXmt.add(724, 0);
        zzXmt.add(725, 10000);
        zzXmt.add(726, 38000);
        zzXmt.add(727, -50000);
        zzXmt.add(728, 0);
        zzXmt.add(729, 10000);
        zzXmt.add(730, 38000);
        zzXmt.add(763, bool2);
        zzXmt.add(764, bool);
        zzXmt.add(765, bool2);
        zzXmt.add(766, bool2);
        zzXmt.add(767, bool);
        zzXmt.add(771, 3);
        zzXmt.add(772, 1);
        zzXmt.add(773, 1);
        zzXmt.add(774, 1);
        zzXmt.add(777, 0);
        zzXmt.add(778, 0);
        zzXmt.add(826, bool);
        zzXmt.add(827, bool);
        zzXmt.add(828, bool);
        zzXmt.add(830, bool);
        zzXmt.add(832, 3);
        zzXmt.add(833, Integer.valueOf(com.aspose.words.internal.zzSA.zzYB(6)));
        zzXmt.add(834, 0);
        zzXmt.add(835, 3);
        zzXmt.add(836, Integer.valueOf(com.aspose.words.internal.zzSA.zzYB(9)));
        zzXmt.add(837, 0);
        zzXmt.add(889, bool);
        zzXmt.add(890, bool);
        zzXmt.add(891, bool2);
        zzXmt.add(892, bool);
        zzXmt.add(893, bool);
        zzXmt.add(894, bool);
        zzXmt.add(895, bool);
        zzXmt.add(896, "");
        zzXmt.add(897, "");
        zzXmt.add(4157, "");
        zzXmt.add(898, "");
        zzXmt.add(899, null);
        zzXmt.add(SQLitePersistence.MAX_ARGS, Integer.valueOf(com.aspose.words.internal.zzSA.zzYB(9)));
        zzXmt.add(901, 0);
        zzXmt.add(902, Integer.valueOf(com.aspose.words.internal.zzSA.zzYB(9)));
        zzXmt.add(903, 0);
        zzXmt.add(909, "");
        zzXmt.add(910, "");
        zzXmt.add(911, 0);
        zzXmt.add(913, 0);
        zzXmt.add(912, 2);
        zzXmt.add(914, 2);
        zzXmt.add(915, 1000);
        zzXmt.add(916, 0);
        zzXmt.add(919, "");
        zzXmt.add(944, bool2);
        zzXmt.add(945, bool);
        zzXmt.add(946, bool);
        zzXmt.add(947, bool);
        zzXmt.add(948, bool);
        zzXmt.add(950, bool2);
        zzXmt.add(951, bool);
        zzXmt.add(952, bool);
        zzXmt.add(953, bool);
        zzXmt.add(954, bool);
        zzXmt.add(955, bool);
        zzXmt.add(956, bool);
        zzXmt.add(957, bool);
        zzXmt.add(958, bool);
        zzXmt.add(959, bool2);
        zzXmt.add(1280, -1);
        zzXmt.add(1281, 0);
        zzXmt.add(1284, null);
        zzXmt.add(1285, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(1.0d)));
        zzXmt.add(1286, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(1.0d)));
        zzXmt.add(1287, 12);
        zzXmt.add(1288, null);
        zzXmt.add(1289, Integer.valueOf(com.aspose.words.internal.zzSA.zzl(1.0d)));
        zzXmt.add(1340, bool);
        zzXmt.add(1341, bool);
        zzXmt.add(1342, bool);
        zzXmt.add(1343, bool);
        zzXmt.add(4096, 0);
        zzXmt.add(EditingLanguage.ARABIC_LIBYA, 3);
        zzXmt.add(InputDeviceCompat.SOURCE_TOUCHSCREEN, 0);
        zzXmt.add(4099, bool);
        zzXmt.add(4125, 0);
        zzXmt.add(4126, 0);
        zzXmt.add(4127, 21600);
        zzXmt.add(4128, 21600);
        zzXmt.add(4102, null);
        zzXmt.add(EditingLanguage.GERMAN_LUXEMBOURG, "");
        zzXmt.add(4104, "");
        zzXmt.add(EditingLanguage.SPANISH_GUATEMALA, new Border());
        zzXmt.add(4107, new Border());
        zzXmt.add(EditingLanguage.FRENCH_SWITZERLAND, new Border());
        zzXmt.add(4109, new Border());
        zzXmt.add(4111, null);
        zzXmt.add(4110, null);
        zzXmt.add(4112, null);
        zzXmt.add(4113, "");
        zzXmt.add(4114, "");
        zzXmt.add(4115, "");
        zzXmt.add(4116, bool);
        zzXmt.add(4117, bool);
        zzXmt.add(4118, 0);
        zzXmt.add(4119, 0);
        zzXmt.add(4120, "");
        zzXmt.add(4121, 255);
        zzXmt.add(EditingLanguage.CROATIAN_BOZNIA_AND_HERZEGOVINA, 255);
        zzXmt.add(4124, 0);
        zzYC3 zzyc34 = zzXmt;
        Double dValueOf = Double.valueOf(0.0d);
        zzyc34.add(4129, dValueOf);
        zzXmt.add(4130, dValueOf);
        zzXmt.add(4131, dValueOf);
        zzXmt.add(4132, dValueOf);
        zzXmt.add(1986, 0);
        zzXmt.add(1987, 0);
        zzXmt.add(1984, 0);
        zzXmt.add(1985, 0);
        zzXmt.add(1988, 1);
        zzXmt.add(1989, 1);
        zzXmt.add(4154, 0);
        zzXmt.add(EditingLanguage.LULE_SAMI_NORWAY, 0);
        zzXmt.add(1855, bool);
        zzXmt.add(4146, 0);
        zzXmt.add(4143, 0);
        zzXmt.add(4145, 0);
        zzXmt.add(4144, 0);
        zzXmt.add(1927, null);
        zzXmt.add(1981, bool);
        zzXmt.add(1921, null);
        zzXmt.add(1983, bool);
        zzXmt.add(1922, null);
        zzXmt.add(FieldType.FIELD_CITATION, bool2);
        zzXmt.add(1926, null);
        zzXmt.add(1982, bool);
        zzXmt.add(1928, null);
        zzXmt.add(1923, null);
        zzXmt.add(1924, null);
        zzXmt.add(1925, null);
        zzXmt.add(4160, dValueOf);
        zzXmt.add(4161, dValueOf);
    }

    public static Object zzOt(int i) {
        return zzXmt.zzPj(i);
    }

    public final boolean getBehindText() {
        return ((Boolean) zzPj(954)).booleanValue();
    }

    public final int getHorizontalAlignment() {
        return ((Integer) zzPj(911)).intValue();
    }

    public final double getLeft() {
        return ((Double) zzPj(4129)).doubleValue();
    }

    public final int getRelativeHorizontalPosition() {
        return ((Integer) zzPj(912)).intValue();
    }

    public final int getRelativeVerticalPosition() {
        return ((Integer) zzPj(914)).intValue();
    }

    public final double getTop() {
        return ((Double) zzPj(4130)).doubleValue();
    }

    public final int getVerticalAlignment() {
        return ((Integer) zzPj(913)).intValue();
    }

    public final int getWrapSide() {
        return ((Integer) zzPj(InputDeviceCompat.SOURCE_TOUCHSCREEN)).intValue();
    }

    public final int getWrapType() {
        return ((Integer) zzPj(EditingLanguage.ARABIC_LIBYA)).intValue();
    }

    public final int getZOrder() {
        return ((Integer) zzPj(4154)).intValue();
    }

    public final boolean isInline() {
        return getWrapType() == 0;
    }

    public final boolean zzYL9() {
        return ((Boolean) zzPj(944)).booleanValue();
    }

    @Override // com.aspose.words.zzZS
    public final zzZS zzbo() {
        return zzXmt;
    }
}
