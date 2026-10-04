package com.aspose.slides.internal.p174hz;

import android.support.v4.media.session.PlaybackStateCompat;
import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p525yi.C12825ix;
import com.aspose.slides.internal.p525yi.C12843x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.huawei.hms.network.embedded.C18163eb;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.ne */
/* JADX INFO: loaded from: classes.dex */
class C4738ne extends AbstractC4699b1 {

    /* JADX INFO: renamed from: k4 */
    static int f13233k4 = 64;

    /* JADX INFO: renamed from: kk */
    static int f13234kk = 64;

    /* JADX INFO: renamed from: c5 */
    private int[] f13239c5;

    /* JADX INFO: renamed from: dy */
    private byte[] f13240dy;

    /* JADX INFO: renamed from: m9 */
    private byte[] f13241m9;

    /* JADX INFO: renamed from: x1 */
    static int f13237x1 = 64 / 8;

    /* JADX INFO: renamed from: to */
    static int f13236to = 64 / 8;

    /* JADX INFO: renamed from: jd */
    private static long[] f13232jd = {8421888, 0, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, 8421890, 8421378, 33282, 2, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, 512, 8421888, 8421890, 512, 8389122, 8421378, 8388608, 2, 514, 8389120, 8389120, 33280, 33280, 8421376, 8421376, 8389122, 32770, 8388610, 8388610, 32770, 0, 514, 33282, 8388608, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, 8421890, 2, 8421376, 8421888, 8388608, 8388608, 512, 8421378, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, 33280, 8388610, 512, 2, 8389122, 33282, 8421890, 32770, 8421376, 8389122, 8388610, 514, 33282, 8421888, 514, 8389120, 8389120, 0, 32770, 33280, 0, 8421378, 1074282512, 1073758208, 16384, 540688, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, 16, 1074266128, 1073758224, 1073741840, 1074282512, 1074282496, 1073741824, 1073758208, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, 16, 1074266128, 540672, 524304, 1073758224, 0, 1073741824, 16384, 540688, 1074266112, 524304, 1073741840, 0, 540672, 16400, 1074282496, 1074266112, 16400, 0, 540688, 1074266128, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, 1073758224, 1074266112, 1074282496, 16384, 1074266112, 1073758208, 16, 1074282512, 540688, 16, 16384, 1073741824, 16400, 1074282496, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, 1073741840, 524304, 1073758224, 1073741840, 524304, 540672, 0, 1073758208, 16400, 1073741824, 1074266128, 1074282512, 540672, 260, 67174656, 0, 67174404, 67109120, 0, 65796, 67109120, 65540, 67108868, 67108868, 65536, 67174660, 65540, 67174400, 260, 67108864, 4, 67174656, 256, 65792, 67174400, 67174404, 65796, 67109124, 65792, 65536, 67109124, 4, 67174660, 256, 67108864, 67174656, 67108864, 65540, 260, 65536, 67174656, 67109120, 0, 256, 65540, 67174660, 67109120, 67108868, 256, 0, 67174404, 67109124, 65536, 67108864, 67174660, 4, 65796, 65792, 67108868, 67174400, 67109124, 260, 67174400, 65796, 4, 67174404, 65792, 2151682048L, 2147487808L, 2147487808L, 64, 4198464, 2151678016L, 2151677952L, 2147487744L, 0, 4198400, 4198400, 2151682112L, 2147483712L, 0, 4194368, 2151677952L, 2147483648L, 4096, 4194304, 2151682048L, 64, 4194304, 2147487744L, 4160, 2151678016L, 2147483648L, 4160, 4194368, 4096, 4198464, 2151682112L, 2147483712L, 4194368, 2151677952L, 4198400, 2151682112L, 2147483712L, 0, 0, 4198400, 4160, 4194368, 2151678016L, 2147483648L, 2151682048L, 2147487808L, 2147487808L, 64, 2151682112L, 2147483712L, 2147483648L, 4096, 2151677952L, 2147487744L, 4198464, 2151678016L, 2147487744L, 4160, 4194304, 2151682048L, 64, 4194304, 4096, 4198464, 128, 17039488, 17039360, 553648256, PlaybackStateCompat.ACTION_SET_REPEAT_MODE, 128, 536870912, 17039360, 537133184, PlaybackStateCompat.ACTION_SET_REPEAT_MODE, 16777344, 537133184, 553648256, 553910272, 262272, 536870912, C18163eb.f54662y, 537133056, 537133056, 0, 536871040, 553910400, 553910400, 16777344, 553910272, 536871040, 0, 553648128, 17039488, C18163eb.f54662y, 553648128, 262272, PlaybackStateCompat.ACTION_SET_REPEAT_MODE, 553648256, 128, C18163eb.f54662y, 536870912, 17039360, 553648256, 537133184, 16777344, 536870912, 553910272, 17039488, 537133184, 128, C18163eb.f54662y, 553910272, 553910400, 262272, 553648128, 553910400, 17039360, 0, 537133056, 553648128, 262272, 16777344, 536871040, PlaybackStateCompat.ACTION_SET_REPEAT_MODE, 0, 537133056, 17039488, 536871040, 268435464, 270532608, PlaybackStateCompat.ACTION_PLAY_FROM_URI, 270540808, 270532608, 8, 270540808, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 268443648, 2105352, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 268435464, 2097160, 268443648, 268435456, 8200, 0, 2097160, 268443656, PlaybackStateCompat.ACTION_PLAY_FROM_URI, 2105344, 268443656, 8, 270532616, 270532616, 0, 2105352, 270540800, 8200, 2105344, 270540800, 268435456, 268443648, 8, 270532616, 2105344, 270540808, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 8200, 268435464, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 268443648, 268435456, 8200, 268435464, 270540808, 2105344, 270532608, 2105352, 270540800, 0, 270532616, 8, PlaybackStateCompat.ACTION_PLAY_FROM_URI, 270532608, 2105352, PlaybackStateCompat.ACTION_PLAY_FROM_URI, 2097160, 268443656, 0, 270540800, 268435456, 2097160, 268443656, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, 34603009, 33555457, 0, 1024, 33555457, 1049601, 34604032, 34604033, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, 0, 33554433, 1, 33554432, 34603009, 1025, 33555456, 1049601, 1048577, 33555456, 33554433, 34603008, 34604032, 1048577, 34603008, 1024, 1025, 34604033, 1049600, 1, 33554432, 1049600, 33554432, 1049600, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, 33555457, 33555457, 34603009, 34603009, 1, 1048577, 33554432, 33555456, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, 34604032, 1025, 1049601, 34604032, 1025, 33554433, 34604033, 34603008, 1049600, 0, 1, 34604033, 0, 1049601, 34603008, 1024, 33554433, 33555456, 1024, 1048577, 134219808, 2048, PlaybackStateCompat.ACTION_PREPARE_FROM_URI, 134350880, 134217728, 134219808, 32, 134217728, 131104, 134348800, 134350880, 133120, 134350848, 133152, 2048, 32, 134348800, 134217760, 134219776, 2080, 133120, 131104, 134348832, 134350848, 2080, 0, 0, 134348832, 134217760, 134219776, 133152, PlaybackStateCompat.ACTION_PREPARE_FROM_URI, 133152, PlaybackStateCompat.ACTION_PREPARE_FROM_URI, 134350848, 2048, 32, 134348832, 2048, 133152, 134219776, 32, 134217760, 134348800, 134348832, 134217728, PlaybackStateCompat.ACTION_PREPARE_FROM_URI, 134219808, 0, 134350880, 131104, 134217760, 134348800, 134219776, 134219808, 0, 134350880, 133120, 133120, 2080, 2080, 131104, 134217728, 134350848};

    /* JADX INFO: renamed from: ck */
    private static byte[] f13229ck = {56, PatternStyle.Wave, 40, 32, 24, 16, 8, 0, 57, PatternStyle.Horizontal, 41, 33, 25, 17, 9, 1, 58, PatternStyle.Vertical, PatternStyle.Plaid, 34, 26, 18, 10, 2, 59, PatternStyle.Cross, PatternStyle.Sphere, 35, 62, PatternStyle.DiagonalCross, PatternStyle.Divot, 38, 30, 22, 14, 6, 61, PatternStyle.UpwardDiagonal, PatternStyle.DottedGrid, 37, 29, 21, 13, 5, 60, PatternStyle.DownwardDiagonal, PatternStyle.Weave, 36, 28, 20, 12, 4, 27, 19, 11, 3};

    /* JADX INFO: renamed from: yj */
    private static byte[] f13238yj = {1, 2, 4, 6, 8, 10, 12, 14, 15, 17, 19, 21, 23, 25, 27, 28};

    /* JADX INFO: renamed from: ks */
    private static byte[] f13235ks = {13, 16, 10, 23, 0, 4, 2, 27, 14, 5, 20, 9, 22, 18, 11, 3, 25, 7, 15, 6, 26, 19, 12, 1, 40, PatternStyle.Cross, 30, 36, PatternStyle.Divot, PatternStyle.DiagonalCross, 29, 39, PatternStyle.Vertical, PatternStyle.Weave, 32, PatternStyle.Shingle, PatternStyle.Sphere, PatternStyle.Wave, 38, 55, 33, PatternStyle.DownwardDiagonal, PatternStyle.DottedGrid, 41, PatternStyle.Horizontal, 35, 28, 31};

    /* JADX INFO: renamed from: du */
    static long[] f13230du = {0, 0, 256, 0, 0, 256, 256, 256, 1, 0, 257, 0, 1, 256, 257, 256, 0, 1, 256, 1, 0, 257, 256, 257, 1, 1, 257, 1, 1, 257, 257, 257, 0, 0, C18163eb.f54662y, 0, 0, C18163eb.f54662y, C18163eb.f54662y, C18163eb.f54662y, 65536, 0, 16842752, 0, 65536, C18163eb.f54662y, 16842752, C18163eb.f54662y, 0, 65536, C18163eb.f54662y, 65536, 0, 16842752, C18163eb.f54662y, 16842752, 65536, 65536, 16842752, 65536, 65536, 16842752, 16842752, 16842752, 0, 0, 512, 0, 0, 512, 512, 512, 2, 0, 514, 0, 2, 512, 514, 512, 0, 2, 512, 2, 0, 514, 512, 514, 2, 2, 514, 2, 2, 514, 514, 514, 0, 0, 33554432, 0, 0, 33554432, 33554432, 33554432, PlaybackStateCompat.ACTION_PREPARE_FROM_URI, 0, 33685504, 0, PlaybackStateCompat.ACTION_PREPARE_FROM_URI, 33554432, 33685504, 33554432, 0, PlaybackStateCompat.ACTION_PREPARE_FROM_URI, 33554432, PlaybackStateCompat.ACTION_PREPARE_FROM_URI, 0, 33685504, 33554432, 33685504, PlaybackStateCompat.ACTION_PREPARE_FROM_URI, PlaybackStateCompat.ACTION_PREPARE_FROM_URI, 33685504, PlaybackStateCompat.ACTION_PREPARE_FROM_URI, PlaybackStateCompat.ACTION_PREPARE_FROM_URI, 33685504, 33685504, 33685504, 0, 0, 1024, 0, 0, 1024, 1024, 1024, 4, 0, 1028, 0, 4, 1024, 1028, 1024, 0, 4, 1024, 4, 0, 1028, 1024, 1028, 4, 4, 1028, 4, 4, 1028, 1028, 1028, 0, 0, 67108864, 0, 0, 67108864, 67108864, 67108864, PlaybackStateCompat.ACTION_SET_REPEAT_MODE, 0, 67371008, 0, PlaybackStateCompat.ACTION_SET_REPEAT_MODE, 67108864, 67371008, 67108864, 0, PlaybackStateCompat.ACTION_SET_REPEAT_MODE, 67108864, PlaybackStateCompat.ACTION_SET_REPEAT_MODE, 0, 67371008, 67108864, 67371008, PlaybackStateCompat.ACTION_SET_REPEAT_MODE, PlaybackStateCompat.ACTION_SET_REPEAT_MODE, 67371008, PlaybackStateCompat.ACTION_SET_REPEAT_MODE, PlaybackStateCompat.ACTION_SET_REPEAT_MODE, 67371008, 67371008, 67371008, 0, 0, 2048, 0, 0, 2048, 2048, 2048, 8, 0, 2056, 0, 8, 2048, 2056, 2048, 0, 8, 2048, 8, 0, 2056, 2048, 2056, 8, 8, 2056, 8, 8, 2056, 2056, 2056, 0, 0, 134217728, 0, 0, 134217728, 134217728, 134217728, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, 0, 134742016, 0, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, 134217728, 134742016, 134217728, 0, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, 134217728, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, 0, 134742016, 134217728, 134742016, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, 134742016, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, 134742016, 134742016, 134742016, 0, 0, 4096, 0, 0, 4096, 4096, 4096, 16, 0, 4112, 0, 16, 4096, 4112, 4096, 0, 16, 4096, 16, 0, 4112, 4096, 4112, 16, 16, 4112, 16, 16, 4112, 4112, 4112, 0, 0, 268435456, 0, 0, 268435456, 268435456, 268435456, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, 0, 269484032, 0, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, 268435456, 269484032, 268435456, 0, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, 268435456, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, 0, 269484032, 268435456, 269484032, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, 269484032, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, 269484032, 269484032, 269484032, 0, 0, PlaybackStateCompat.ACTION_PLAY_FROM_URI, 0, 0, PlaybackStateCompat.ACTION_PLAY_FROM_URI, PlaybackStateCompat.ACTION_PLAY_FROM_URI, PlaybackStateCompat.ACTION_PLAY_FROM_URI, 32, 0, 8224, 0, 32, PlaybackStateCompat.ACTION_PLAY_FROM_URI, 8224, PlaybackStateCompat.ACTION_PLAY_FROM_URI, 0, 32, PlaybackStateCompat.ACTION_PLAY_FROM_URI, 32, 0, 8224, PlaybackStateCompat.ACTION_PLAY_FROM_URI, 8224, 32, 32, 8224, 32, 32, 8224, 8224, 8224, 0, 0, 536870912, 0, 0, 536870912, 536870912, 536870912, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 0, 538968064, 0, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 536870912, 538968064, 536870912, 0, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 536870912, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 0, 538968064, 536870912, 538968064, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 538968064, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 538968064, 538968064, 538968064, 0, 0, 16384, 0, 0, 16384, 16384, 16384, 64, 0, 16448, 0, 64, 16384, 16448, 16384, 0, 64, 16384, 64, 0, 16448, 16384, 16448, 64, 64, 16448, 64, 64, 16448, 16448, 16448, 0, 0, 1073741824, 0, 0, 1073741824, 1073741824, 1073741824, 4194304, 0, 1077936128, 0, 4194304, 1073741824, 1077936128, 1073741824, 0, 4194304, 1073741824, 4194304, 0, 1077936128, 1073741824, 1077936128, 4194304, 4194304, 1077936128, 4194304, 4194304, 1077936128, 1077936128, 1077936128, 0, 0, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, 0, 0, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, 128, 0, 32896, 0, 128, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, 32896, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, 0, 128, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, 128, 0, 32896, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, 32896, 128, 128, 32896, 128, 128, 32896, 32896, 32896, 0, 0, 2147483648L, 0, 0, 2147483648L, 2147483648L, 2147483648L, 8388608, 0, 2155872256L, 0, 8388608, 2147483648L, 2155872256L, 2147483648L, 0, 8388608, 2147483648L, 8388608, 0, 2155872256L, 2147483648L, 2155872256L, 8388608, 8388608, 2155872256L, 8388608, 8388608, 2155872256L, 2155872256L, 2155872256L};

    /* JADX INFO: renamed from: h4 */
    static long[] f13231h4 = {0, 0, 0, 64, 0, 16384, 0, 16448, 0, 4194304, 0, 4194368, 0, 4210688, 0, 4210752, 0, 1073741824, 0, 1073741888, 0, 1073758208, 0, 1073758272, 0, 1077936128, 0, 1077936192, 0, 1077952512, 0, 1077952576, 0, 0, 64, 0, 16384, 0, 16448, 0, 4194304, 0, 4194368, 0, 4210688, 0, 4210752, 0, 1073741824, 0, 1073741888, 0, 1073758208, 0, 1073758272, 0, 1077936128, 0, 1077936192, 0, 1077952512, 0, 1077952576, 0, 0, 0, 0, 16, 0, 4096, 0, 4112, 0, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, 0, 1048592, 0, 1052672, 0, 1052688, 0, 268435456, 0, 268435472, 0, 268439552, 0, 268439568, 0, 269484032, 0, 269484048, 0, 269488128, 0, 269488144, 0, 0, 16, 0, 4096, 0, 4112, 0, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, 0, 1048592, 0, 1052672, 0, 1052688, 0, 268435456, 0, 268435472, 0, 268439552, 0, 268439568, 0, 269484032, 0, 269484048, 0, 269488128, 0, 269488144, 0, 0, 0, 0, 4, 0, 1024, 0, 1028, 0, PlaybackStateCompat.ACTION_SET_REPEAT_MODE, 0, 262148, 0, 263168, 0, 263172, 0, 67108864, 0, 67108868, 0, 67109888, 0, 67109892, 0, 67371008, 0, 67371012, 0, 67372032, 0, 67372036, 0, 0, 4, 0, 1024, 0, 1028, 0, PlaybackStateCompat.ACTION_SET_REPEAT_MODE, 0, 262148, 0, 263168, 0, 263172, 0, 67108864, 0, 67108868, 0, 67109888, 0, 67109892, 0, 67371008, 0, 67371012, 0, 67372032, 0, 67372036, 0, 0, 0, 0, 1, 0, 256, 0, 257, 0, 65536, 0, 65537, 0, 65792, 0, 65793, 0, C18163eb.f54662y, 0, 16777217, 0, 16777472, 0, 16777473, 0, 16842752, 0, 16842753, 0, 16843008, 0, 16843009, 0, 0, 1, 0, 256, 0, 257, 0, 65536, 0, 65537, 0, 65792, 0, 65793, 0, C18163eb.f54662y, 0, 16777217, 0, 16777472, 0, 16777473, 0, 16842752, 0, 16842753, 0, 16843008, 0, 16843009, 0, 0, 0, 0, 128, 0, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, 0, 32896, 0, 8388608, 0, 8388736, 0, 8421376, 0, 8421504, 0, 2147483648L, 0, 2147483776L, 0, 2147516416L, 0, 2147516544L, 0, 2155872256L, 0, 2155872384L, 0, 2155905024L, 0, 2155905152L, 0, 0, 128, 0, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID, 0, 32896, 0, 8388608, 0, 8388736, 0, 8421376, 0, 8421504, 0, 2147483648L, 0, 2147483776L, 0, 2147516416L, 0, 2147516544L, 0, 2155872256L, 0, 2155872384L, 0, 2155905024L, 0, 2155905152L, 0, 0, 0, 0, 32, 0, PlaybackStateCompat.ACTION_PLAY_FROM_URI, 0, 8224, 0, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 0, 2097184, 0, 2105344, 0, 2105376, 0, 536870912, 0, 536870944, 0, 536879104, 0, 536879136, 0, 538968064, 0, 538968096, 0, 538976256, 0, 538976288, 0, 0, 32, 0, PlaybackStateCompat.ACTION_PLAY_FROM_URI, 0, 8224, 0, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 0, 2097184, 0, 2105344, 0, 2105376, 0, 536870912, 0, 536870944, 0, 536879104, 0, 536879136, 0, 538968064, 0, 538968096, 0, 538976256, 0, 538976288, 0, 0, 0, 0, 8, 0, 2048, 0, 2056, 0, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, 0, 524296, 0, 526336, 0, 526344, 0, 134217728, 0, 134217736, 0, 134219776, 0, 134219784, 0, 134742016, 0, 134742024, 0, 134744064, 0, 134744072, 0, 0, 8, 0, 2048, 0, 2056, 0, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, 0, 524296, 0, 526336, 0, 526344, 0, 134217728, 0, 134217736, 0, 134219776, 0, 134219784, 0, 134742016, 0, 134742024, 0, 134744064, 0, 134744072, 0, 0, 0, 0, 2, 0, 512, 0, 514, 0, PlaybackStateCompat.ACTION_PREPARE_FROM_URI, 0, 131074, 0, 131584, 0, 131586, 0, 33554432, 0, 33554434, 0, 33554944, 0, 33554946, 0, 33685504, 0, 33685506, 0, 33686016, 0, 33686018, 0, 0, 2, 0, 512, 0, 514, 0, PlaybackStateCompat.ACTION_PREPARE_FROM_URI, 0, 131074, 0, 131584, 0, 131586, 0, 33554432, 0, 33554434, 0, 33554944, 0, 33554946, 0, 33685504, 0, 33685506, 0, 33686016, 0, 33686018, 0};

    public C4738ne(AbstractC4736my abstractC4736my, boolean z, byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        super(abstractC4736my, z, bArr2);
        if (bArr == null) {
            bArr = m19704du();
            bArr3 = bArr;
        } else {
            bArr3 = null;
        }
        if (AbstractC4745rv.m19717k4(bArr) || AbstractC4745rv.m19719x1(bArr)) {
            throw new CryptographicException(C12825ix.m59623k4("This is a known weak, or semi-weak, key."));
        }
        bArr3 = bArr3 == null ? (byte[]) bArr.clone() : bArr3;
        this.f13241m9 = new byte[f13237x1 * 16];
        int i = f13236to;
        this.f13240dy = new byte[i];
        this.f13239c5 = new int[i / 4];
        m19708k4(bArr3);
    }

    /* JADX INFO: renamed from: du */
    public static byte[] m19704du() {
        while (true) {
            byte[] bArrM59721k4 = C12843x6.m59721k4(f13237x1);
            if (!AbstractC4745rv.m19717k4(bArrM59721k4) && !AbstractC4745rv.m19719x1(bArrM59721k4)) {
                return bArrM59721k4;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private long m19705k4(long j, int i) {
        byte[] bArr = this.f13241m9;
        int i2 = i << 3;
        long j2 = j & 4294967295L;
        long[] jArr = f13232jd;
        long j3 = ((j2 >> 1) | ((j << 31) & 4294967295L)) & 4294967295L;
        long j4 = jArr[(int) ((((long) (bArr[i2] & 255)) ^ (j3 >> 26)) & 63)] | jArr[(int) ((((j3 >> 22) ^ ((long) (bArr[i2 + 1] & 255))) & 63) + 64)] | jArr[(int) ((((j3 >> 18) ^ ((long) (bArr[i2 + 2] & 255))) & 63) + 128)] | jArr[(int) ((((j3 >> 14) ^ ((long) (bArr[i2 + 3] & 255))) & 63) + 192)] | jArr[(int) ((((j3 >> 10) ^ ((long) (bArr[i2 + 4] & 255))) & 63) + 256)] | jArr[(int) ((((j3 >> 6) ^ ((long) (bArr[i2 + 5] & 255))) & 63) + 320)];
        long j5 = j2 >> 31;
        return jArr[(int) (((((long) (bArr[i2 + 7] & 255)) ^ ((j5 | ((j << 1) & 4294967295L)) & 4294967295L)) & 63) + 448)] | j4 | jArr[(int) ((((j3 >> 2) ^ ((long) (bArr[i2 + 6] & 255))) & 63) + 384)];
    }

    /* JADX INFO: renamed from: x1 */
    private static void m19707x1(byte[] bArr) {
        byte b = bArr[0];
        bArr[0] = bArr[3];
        bArr[3] = b;
        byte b2 = bArr[1];
        bArr[1] = bArr[2];
        bArr[2] = b2;
        byte b3 = bArr[4];
        bArr[4] = bArr[7];
        bArr[7] = b3;
        byte b4 = bArr[5];
        bArr[5] = bArr[6];
        bArr[6] = b4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m19708k4(byte[] bArr) {
        byte[] bArr2 = this.f13241m9;
        AbstractC14092to.m67225k4(bArr2, 0, bArr2.length);
        byte[] bArr3 = f13229ck;
        int length = bArr3.length;
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        int length2 = bArr3.length;
        int i = 0;
        int i2 = 0;
        while (i < length2) {
            byte b = bArr3[i];
            bArr4[i2] = (byte) (((bArr[(b & 255) >> 3] & 255) >> ((b & 7) ^ 7)) & 1);
            i++;
            i2++;
        }
        for (int i3 = 0; i3 < f13237x1 * 2; i3++) {
            int i4 = length >> 1;
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = (f13238yj[i3] & 255) + i5;
                if (i6 >= i4) {
                    i6 -= i4;
                }
                bArr5[i5] = bArr4[i6];
            }
            for (int i7 = i4; i7 < length; i7++) {
                int i8 = (f13238yj[i3] & 255) + i7;
                if (i8 >= length) {
                    i8 -= i4;
                }
                bArr5[i7] = bArr4[i8];
            }
            int i9 = f13237x1 * i3;
            int i10 = 0;
            for (byte b2 : f13235ks) {
                if (bArr5[b2 & 255] != 0) {
                    byte[] bArr6 = this.f13241m9;
                    int i11 = (i10 / 6) + i9;
                    bArr6[i11] = (byte) (bArr6[i11] | ((byte) (128 >> ((i10 % 6) + 2))));
                }
                i10++;
            }
        }
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4699b1
    /* JADX INFO: renamed from: x1 */
    public void mo19569x1(byte[] bArr, byte[] bArr2) {
        m19706k4(bArr, bArr2, f13230du, false);
        m19709k4(bArr2, this.f13240dy);
        m19706k4(this.f13240dy, bArr2, f13231h4, true);
    }

    /* JADX INFO: renamed from: k4 */
    public void m19709k4(byte[] bArr, byte[] bArr2) {
        C14058fa.m66597k4(bArr, 0, this.f13239c5, 0, f13236to);
        if (this.f13113up) {
            int[] iArr = this.f13239c5;
            int i = iArr[0];
            long j = iArr[1];
            long jM19705k4 = (int) (((long) i) ^ m19705k4(j, 0));
            long jM19705k42 = (int) (j ^ m19705k4(jM19705k4, 1));
            long jM19705k43 = (int) (m19705k4(jM19705k42, 2) ^ jM19705k4);
            long jM19705k44 = (int) (m19705k4(jM19705k43, 3) ^ jM19705k42);
            long jM19705k45 = (int) (jM19705k43 ^ m19705k4(jM19705k44, 4));
            long jM19705k46 = (int) (jM19705k44 ^ m19705k4(jM19705k45, 5));
            long jM19705k47 = (int) (jM19705k45 ^ m19705k4(jM19705k46, 6));
            long jM19705k48 = (int) (jM19705k46 ^ m19705k4(jM19705k47, 7));
            long jM19705k49 = (int) (jM19705k47 ^ m19705k4(jM19705k48, 8));
            long jM19705k410 = (int) (jM19705k48 ^ m19705k4(jM19705k49, 9));
            long jM19705k411 = (int) (jM19705k49 ^ m19705k4(jM19705k410, 10));
            long jM19705k412 = (int) (jM19705k410 ^ m19705k4(jM19705k411, 11));
            long jM19705k413 = (int) (jM19705k411 ^ m19705k4(jM19705k412, 12));
            long jM19705k414 = (int) (jM19705k412 ^ m19705k4(jM19705k413, 13));
            int iM19705k4 = (int) (jM19705k413 ^ m19705k4(jM19705k414, 14));
            int iM19705k42 = (int) (jM19705k414 ^ m19705k4(iM19705k4, 15));
            int[] iArr2 = this.f13239c5;
            iArr2[0] = iM19705k42;
            iArr2[1] = iM19705k4;
        } else {
            int[] iArr3 = this.f13239c5;
            int i2 = iArr3[0];
            long j2 = iArr3[1];
            long jM19705k415 = (int) (((long) i2) ^ m19705k4(j2, 15));
            long jM19705k416 = (int) (j2 ^ m19705k4(jM19705k415, 14));
            long jM19705k417 = (int) (jM19705k415 ^ m19705k4(jM19705k416, 13));
            long jM19705k418 = (int) (jM19705k416 ^ m19705k4(jM19705k417, 12));
            long jM19705k419 = (int) (jM19705k417 ^ m19705k4(jM19705k418, 11));
            long jM19705k420 = (int) (jM19705k418 ^ m19705k4(jM19705k419, 10));
            long jM19705k421 = (int) (jM19705k419 ^ m19705k4(jM19705k420, 9));
            long jM19705k422 = (int) (jM19705k420 ^ m19705k4(jM19705k421, 8));
            long jM19705k423 = (int) (jM19705k421 ^ m19705k4(jM19705k422, 7));
            long jM19705k424 = (int) (jM19705k422 ^ m19705k4(jM19705k423, 6));
            long jM19705k425 = (int) (jM19705k423 ^ m19705k4(jM19705k424, 5));
            long jM19705k426 = (int) (jM19705k424 ^ m19705k4(jM19705k425, 4));
            long jM19705k427 = (int) (jM19705k425 ^ m19705k4(jM19705k426, 3));
            long jM19705k428 = (int) (m19705k4(jM19705k427, 2) ^ jM19705k426);
            int iM19705k43 = (int) (jM19705k427 ^ m19705k4(jM19705k428, 1));
            int iM19705k44 = (int) (jM19705k428 ^ m19705k4(iM19705k43, 0));
            int[] iArr4 = this.f13239c5;
            iArr4[0] = iM19705k44;
            iArr4[1] = iM19705k43;
        }
        C14058fa.m66599k4(this.f13239c5, 0, bArr2, 0, f13236to);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m19706k4(byte[] bArr, byte[] bArr2, long[] jArr, boolean z) {
        if (z) {
            m19707x1(bArr);
        }
        byte b = bArr[0];
        int i = ((b & 255) >> 4) << 1;
        int i2 = (b & 15) << 1;
        long j = (jArr[i] & 4294967295L) | (jArr[i2 + 32] & 4294967295L);
        long j2 = (jArr[i2 + 33] & 4294967295L) | (jArr[i + 1] & 4294967295L);
        int i3 = f13236to << 1;
        int i4 = 1;
        int i5 = 2;
        while (i5 < i3) {
            byte b2 = bArr[i4];
            int i6 = (i5 << 5) + (((b2 & 255) >> 4) << 1);
            int i7 = ((i5 + 1) << 5) + ((b2 & 15) << 1);
            j |= (jArr[i6] & 4294967295L) | (jArr[i7] & 4294967295L);
            j2 |= (jArr[i6 + 1] & 4294967295L) | (jArr[i7 + 1] & 4294967295L);
            i5 += 2;
            i4++;
        }
        if (z) {
            bArr2[0] = (byte) (j & 4294967295L);
            bArr2[1] = (byte) (r0 >> 8);
            bArr2[2] = (byte) (r0 >> 16);
            bArr2[3] = (byte) (r0 >> 24);
            bArr2[4] = (byte) (j2 & 4294967295L);
            bArr2[5] = (byte) (r0 >> 8);
            bArr2[6] = (byte) (r0 >> 16);
            bArr2[7] = (byte) (r0 >> 24);
            return;
        }
        bArr2[0] = (byte) (r7 >> 24);
        bArr2[1] = (byte) (r7 >> 16);
        bArr2[2] = (byte) (r7 >> 8);
        bArr2[3] = (byte) (j & 4294967295L);
        bArr2[4] = (byte) (r0 >> 24);
        bArr2[5] = (byte) (r0 >> 16);
        bArr2[6] = (byte) (r0 >> 8);
        bArr2[7] = (byte) (j2 & 4294967295L);
    }
}
