package com.orion.penkit.models.pencil;

import OooOO0.OooO0O0;
import OooOoO.C20504OooO0O0;
import androidx.core.view.PointerIconCompat;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: loaded from: classes10.dex */
public class OpenSimplex2 {
    private static final double FALLBACK_ROTATE_3D = 0.6666666666666666d;
    private static float[] GRADIENTS_2D = new float[256];
    private static float[] GRADIENTS_3D = null;
    private static float[] GRADIENTS_4D = null;
    private static final long HASH_MULTIPLIER = 6026932503003350773L;
    private static final float LATTICE_STEP_4D = 0.2f;
    private static final double NORMALIZER_2D = 0.01001634121365712d;
    private static final double NORMALIZER_3D = 0.07969837668935331d;
    private static final double NORMALIZER_4D = 0.0220065933241897d;
    private static final int N_GRADS_2D = 128;
    private static final int N_GRADS_2D_EXPONENT = 7;
    private static final int N_GRADS_3D = 256;
    private static final int N_GRADS_3D_EXPONENT = 8;
    private static final int N_GRADS_4D = 512;
    private static final int N_GRADS_4D_EXPONENT = 9;
    private static final long PRIME_W = 6254464313819354443L;
    private static final long PRIME_X = 5910200641878280303L;
    private static final long PRIME_Y = 6452764530575939509L;
    private static final long PRIME_Z = 6614699811220273867L;
    private static final double ROOT2OVER2 = 0.7071067811865476d;
    private static final double ROOT3OVER3 = 0.577350269189626d;
    private static final double ROTATE_3D_ORTHOGONALIZER = -0.21132486540518713d;
    private static final float RSQUARED_2D = 0.5f;
    private static final float RSQUARED_3D = 0.6f;
    private static final float RSQUARED_4D = 0.6f;
    private static final long SEED_FLIP_3D = -5968755714895566377L;
    private static final long SEED_OFFSET_4D = 1045921697555224141L;
    private static final double SKEW_2D = 0.366025403784439d;
    private static final float SKEW_4D = -0.1381966f;
    private static final double UNSKEW_2D = -0.21132486540518713d;
    private static final float UNSKEW_4D = 0.309017f;

    static {
        float[] fArr = new float[48];
        fArr[0] = 0.38268343f;
        fArr[1] = 0.9238795f;
        fArr[2] = 0.9238795f;
        fArr[3] = 0.38268343f;
        fArr[4] = 0.9238795f;
        fArr[5] = -0.38268343f;
        fArr[6] = 0.38268343f;
        fArr[7] = -0.9238795f;
        fArr[8] = -0.38268343f;
        fArr[9] = -0.9238795f;
        fArr[10] = -0.9238795f;
        fArr[11] = -0.38268343f;
        fArr[12] = -0.9238795f;
        fArr[13] = 0.38268343f;
        fArr[14] = -0.38268343f;
        fArr[15] = 0.9238795f;
        fArr[16] = 0.13052619f;
        fArr[17] = 0.9914449f;
        fArr[18] = 0.6087614f;
        fArr[19] = 0.7933533f;
        fArr[20] = 0.7933533f;
        fArr[21] = 0.6087614f;
        fArr[22] = 0.9914449f;
        fArr[23] = 0.13052619f;
        fArr[24] = 0.9914449f;
        fArr[25] = -0.13052619f;
        fArr[26] = 0.7933533f;
        fArr[27] = -0.6087614f;
        fArr[28] = 0.6087614f;
        fArr[29] = -0.7933533f;
        fArr[30] = 0.13052619f;
        fArr[31] = -0.9914449f;
        fArr[32] = -0.13052619f;
        fArr[33] = -0.9914449f;
        fArr[34] = -0.6087614f;
        fArr[35] = -0.7933533f;
        fArr[36] = -0.7933533f;
        fArr[37] = -0.6087614f;
        fArr[38] = -0.9914449f;
        fArr[39] = -0.13052619f;
        fArr[40] = -0.9914449f;
        fArr[41] = 0.13052619f;
        fArr[42] = -0.7933533f;
        fArr[43] = 0.6087614f;
        fArr[44] = -0.6087614f;
        fArr[45] = 0.7933533f;
        fArr[46] = -0.13052619f;
        fArr[47] = 0.9914449f;
        for (int i = 0; i < 48; i++) {
            fArr[i] = (float) (((double) fArr[i]) / NORMALIZER_2D);
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            float[] fArr2 = GRADIENTS_2D;
            if (i2 >= fArr2.length) {
                break;
            }
            if (i3 == 48) {
                i3 = 0;
            }
            fArr2[i2] = fArr[i3];
            i2++;
            i3++;
        }
        GRADIENTS_3D = new float[1024];
        float[] fArr3 = new float[192];
        fArr3[0] = 2.2247448f;
        fArr3[1] = 2.2247448f;
        fArr3[2] = -1.0f;
        fArr3[3] = 0.0f;
        fArr3[4] = 2.2247448f;
        fArr3[5] = 2.2247448f;
        fArr3[6] = 1.0f;
        fArr3[7] = 0.0f;
        fArr3[8] = 3.0862665f;
        fArr3[9] = 1.1721513f;
        fArr3[10] = 0.0f;
        fArr3[11] = 0.0f;
        fArr3[12] = 1.1721513f;
        fArr3[13] = 3.0862665f;
        fArr3[14] = 0.0f;
        fArr3[15] = 0.0f;
        fArr3[16] = -2.2247448f;
        fArr3[17] = 2.2247448f;
        fArr3[18] = -1.0f;
        fArr3[19] = 0.0f;
        fArr3[20] = -2.2247448f;
        fArr3[21] = 2.2247448f;
        fArr3[22] = 1.0f;
        fArr3[23] = 0.0f;
        fArr3[24] = -1.1721513f;
        fArr3[25] = 3.0862665f;
        fArr3[26] = 0.0f;
        fArr3[27] = 0.0f;
        fArr3[28] = -3.0862665f;
        fArr3[29] = 1.1721513f;
        fArr3[30] = 0.0f;
        fArr3[31] = 0.0f;
        fArr3[32] = -1.0f;
        fArr3[33] = -2.2247448f;
        fArr3[34] = -2.2247448f;
        fArr3[35] = 0.0f;
        fArr3[36] = 1.0f;
        fArr3[37] = -2.2247448f;
        fArr3[38] = -2.2247448f;
        fArr3[39] = 0.0f;
        fArr3[40] = 0.0f;
        fArr3[41] = -3.0862665f;
        fArr3[42] = -1.1721513f;
        fArr3[43] = 0.0f;
        fArr3[44] = 0.0f;
        fArr3[45] = -1.1721513f;
        fArr3[46] = -3.0862665f;
        fArr3[47] = 0.0f;
        fArr3[48] = -1.0f;
        fArr3[49] = -2.2247448f;
        fArr3[50] = 2.2247448f;
        fArr3[51] = 0.0f;
        fArr3[52] = 1.0f;
        fArr3[53] = -2.2247448f;
        fArr3[54] = 2.2247448f;
        fArr3[55] = 0.0f;
        fArr3[56] = 0.0f;
        fArr3[57] = -1.1721513f;
        fArr3[58] = 3.0862665f;
        fArr3[59] = 0.0f;
        fArr3[60] = 0.0f;
        fArr3[61] = -3.0862665f;
        fArr3[62] = 1.1721513f;
        fArr3[63] = 0.0f;
        fArr3[64] = -2.2247448f;
        fArr3[65] = -2.2247448f;
        fArr3[66] = -1.0f;
        fArr3[67] = 0.0f;
        fArr3[68] = -2.2247448f;
        fArr3[69] = -2.2247448f;
        fArr3[70] = 1.0f;
        fArr3[71] = 0.0f;
        fArr3[72] = -3.0862665f;
        fArr3[73] = -1.1721513f;
        fArr3[74] = 0.0f;
        fArr3[75] = 0.0f;
        fArr3[76] = -1.1721513f;
        fArr3[77] = -3.0862665f;
        fArr3[78] = 0.0f;
        fArr3[79] = 0.0f;
        fArr3[80] = -2.2247448f;
        fArr3[81] = -1.0f;
        fArr3[82] = -2.2247448f;
        fArr3[83] = 0.0f;
        fArr3[84] = -2.2247448f;
        fArr3[85] = 1.0f;
        fArr3[86] = -2.2247448f;
        fArr3[87] = 0.0f;
        fArr3[88] = -1.1721513f;
        fArr3[89] = 0.0f;
        fArr3[90] = -3.0862665f;
        fArr3[91] = 0.0f;
        fArr3[92] = -3.0862665f;
        fArr3[93] = 0.0f;
        fArr3[94] = -1.1721513f;
        fArr3[95] = 0.0f;
        fArr3[96] = -2.2247448f;
        fArr3[97] = -1.0f;
        fArr3[98] = 2.2247448f;
        fArr3[99] = 0.0f;
        fArr3[100] = -2.2247448f;
        fArr3[101] = 1.0f;
        fArr3[102] = 2.2247448f;
        fArr3[103] = 0.0f;
        fArr3[104] = -3.0862665f;
        fArr3[105] = 0.0f;
        fArr3[106] = 1.1721513f;
        fArr3[107] = 0.0f;
        fArr3[108] = -1.1721513f;
        fArr3[109] = 0.0f;
        fArr3[110] = 3.0862665f;
        fArr3[111] = 0.0f;
        fArr3[112] = -1.0f;
        fArr3[113] = 2.2247448f;
        fArr3[114] = -2.2247448f;
        fArr3[115] = 0.0f;
        fArr3[116] = 1.0f;
        fArr3[117] = 2.2247448f;
        fArr3[118] = -2.2247448f;
        fArr3[119] = 0.0f;
        fArr3[120] = 0.0f;
        fArr3[121] = 1.1721513f;
        fArr3[122] = -3.0862665f;
        fArr3[123] = 0.0f;
        fArr3[124] = 0.0f;
        fArr3[125] = 3.0862665f;
        fArr3[126] = -1.1721513f;
        fArr3[127] = 0.0f;
        fArr3[128] = -1.0f;
        fArr3[129] = 2.2247448f;
        fArr3[130] = 2.2247448f;
        fArr3[131] = 0.0f;
        fArr3[132] = 1.0f;
        fArr3[133] = 2.2247448f;
        fArr3[134] = 2.2247448f;
        fArr3[135] = 0.0f;
        fArr3[136] = 0.0f;
        fArr3[137] = 3.0862665f;
        fArr3[138] = 1.1721513f;
        fArr3[139] = 0.0f;
        fArr3[140] = 0.0f;
        fArr3[141] = 1.1721513f;
        fArr3[142] = 3.0862665f;
        fArr3[143] = 0.0f;
        fArr3[144] = 2.2247448f;
        fArr3[145] = -2.2247448f;
        fArr3[146] = -1.0f;
        fArr3[147] = 0.0f;
        fArr3[148] = 2.2247448f;
        fArr3[149] = -2.2247448f;
        fArr3[150] = 1.0f;
        fArr3[151] = 0.0f;
        fArr3[152] = 1.1721513f;
        fArr3[153] = -3.0862665f;
        fArr3[154] = 0.0f;
        fArr3[155] = 0.0f;
        fArr3[156] = 3.0862665f;
        fArr3[157] = -1.1721513f;
        fArr3[158] = 0.0f;
        fArr3[159] = 0.0f;
        fArr3[160] = 2.2247448f;
        fArr3[161] = -1.0f;
        fArr3[162] = -2.2247448f;
        fArr3[163] = 0.0f;
        fArr3[164] = 2.2247448f;
        fArr3[165] = 1.0f;
        fArr3[166] = -2.2247448f;
        fArr3[167] = 0.0f;
        fArr3[168] = 3.0862665f;
        fArr3[169] = 0.0f;
        fArr3[170] = -1.1721513f;
        fArr3[171] = 0.0f;
        fArr3[172] = 1.1721513f;
        fArr3[173] = 0.0f;
        fArr3[174] = -3.0862665f;
        fArr3[175] = 0.0f;
        fArr3[176] = 2.2247448f;
        fArr3[177] = -1.0f;
        fArr3[178] = 2.2247448f;
        fArr3[179] = 0.0f;
        fArr3[180] = 2.2247448f;
        fArr3[181] = 1.0f;
        fArr3[182] = 2.2247448f;
        fArr3[183] = 0.0f;
        fArr3[184] = 1.1721513f;
        fArr3[185] = 0.0f;
        fArr3[186] = 3.0862665f;
        fArr3[187] = 0.0f;
        fArr3[188] = 3.0862665f;
        fArr3[189] = 0.0f;
        fArr3[190] = 1.1721513f;
        fArr3[191] = 0.0f;
        for (int i4 = 0; i4 < 192; i4++) {
            fArr3[i4] = (float) (((double) fArr3[i4]) / NORMALIZER_3D);
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            float[] fArr4 = GRADIENTS_3D;
            if (i5 >= fArr4.length) {
                break;
            }
            if (i6 == 192) {
                i6 = 0;
            }
            fArr4[i5] = fArr3[i6];
            i5++;
            i6++;
        }
        GRADIENTS_4D = new float[2048];
        float[] fArr5 = new float[640];
        fArr5[0] = -0.6740059f;
        fArr5[1] = -0.32398477f;
        fArr5[2] = -0.32398477f;
        fArr5[3] = 0.5794685f;
        fArr5[4] = -0.7504884f;
        fArr5[5] = -0.40046722f;
        fArr5[6] = 0.15296486f;
        fArr5[7] = 0.502986f;
        fArr5[8] = -0.7504884f;
        fArr5[9] = 0.15296486f;
        fArr5[10] = -0.40046722f;
        fArr5[11] = 0.502986f;
        fArr5[12] = -0.8828162f;
        fArr5[13] = 0.08164729f;
        fArr5[14] = 0.08164729f;
        fArr5[15] = 0.4553054f;
        fArr5[16] = -0.4553054f;
        fArr5[17] = -0.08164729f;
        fArr5[18] = -0.08164729f;
        fArr5[19] = 0.8828162f;
        fArr5[20] = -0.502986f;
        fArr5[21] = -0.15296486f;
        fArr5[22] = 0.40046722f;
        fArr5[23] = 0.7504884f;
        fArr5[24] = -0.502986f;
        fArr5[25] = 0.40046722f;
        fArr5[26] = -0.15296486f;
        fArr5[27] = 0.7504884f;
        fArr5[28] = -0.5794685f;
        fArr5[29] = 0.32398477f;
        fArr5[30] = 0.32398477f;
        fArr5[31] = 0.6740059f;
        fArr5[32] = -0.6740059f;
        fArr5[33] = -0.32398477f;
        fArr5[34] = 0.5794685f;
        fArr5[35] = -0.32398477f;
        fArr5[36] = -0.7504884f;
        fArr5[37] = -0.40046722f;
        fArr5[38] = 0.502986f;
        fArr5[39] = 0.15296486f;
        fArr5[40] = -0.7504884f;
        fArr5[41] = 0.15296486f;
        fArr5[42] = 0.502986f;
        fArr5[43] = -0.40046722f;
        fArr5[44] = -0.8828162f;
        fArr5[45] = 0.08164729f;
        fArr5[46] = 0.4553054f;
        fArr5[47] = 0.08164729f;
        fArr5[48] = -0.4553054f;
        fArr5[49] = -0.08164729f;
        fArr5[50] = 0.8828162f;
        fArr5[51] = -0.08164729f;
        fArr5[52] = -0.502986f;
        fArr5[53] = -0.15296486f;
        fArr5[54] = 0.7504884f;
        fArr5[55] = 0.40046722f;
        fArr5[56] = -0.502986f;
        fArr5[57] = 0.40046722f;
        fArr5[58] = 0.7504884f;
        fArr5[59] = -0.15296486f;
        fArr5[60] = -0.5794685f;
        fArr5[61] = 0.32398477f;
        fArr5[62] = 0.6740059f;
        fArr5[63] = 0.32398477f;
        fArr5[64] = -0.6740059f;
        fArr5[65] = 0.5794685f;
        fArr5[66] = -0.32398477f;
        fArr5[67] = -0.32398477f;
        fArr5[68] = -0.7504884f;
        fArr5[69] = 0.502986f;
        fArr5[70] = -0.40046722f;
        fArr5[71] = 0.15296486f;
        fArr5[72] = -0.7504884f;
        fArr5[73] = 0.502986f;
        fArr5[74] = 0.15296486f;
        fArr5[75] = -0.40046722f;
        fArr5[76] = -0.8828162f;
        fArr5[77] = 0.4553054f;
        fArr5[78] = 0.08164729f;
        fArr5[79] = 0.08164729f;
        fArr5[80] = -0.4553054f;
        fArr5[81] = 0.8828162f;
        fArr5[82] = -0.08164729f;
        fArr5[83] = -0.08164729f;
        fArr5[84] = -0.502986f;
        fArr5[85] = 0.7504884f;
        fArr5[86] = -0.15296486f;
        fArr5[87] = 0.40046722f;
        fArr5[88] = -0.502986f;
        fArr5[89] = 0.7504884f;
        fArr5[90] = 0.40046722f;
        fArr5[91] = -0.15296486f;
        fArr5[92] = -0.5794685f;
        fArr5[93] = 0.6740059f;
        fArr5[94] = 0.32398477f;
        fArr5[95] = 0.32398477f;
        fArr5[96] = 0.5794685f;
        fArr5[97] = -0.6740059f;
        fArr5[98] = -0.32398477f;
        fArr5[99] = -0.32398477f;
        fArr5[100] = 0.502986f;
        fArr5[101] = -0.7504884f;
        fArr5[102] = -0.40046722f;
        fArr5[103] = 0.15296486f;
        fArr5[104] = 0.502986f;
        fArr5[105] = -0.7504884f;
        fArr5[106] = 0.15296486f;
        fArr5[107] = -0.40046722f;
        fArr5[108] = 0.4553054f;
        fArr5[109] = -0.8828162f;
        fArr5[110] = 0.08164729f;
        fArr5[111] = 0.08164729f;
        fArr5[112] = 0.8828162f;
        fArr5[113] = -0.4553054f;
        fArr5[114] = -0.08164729f;
        fArr5[115] = -0.08164729f;
        fArr5[116] = 0.7504884f;
        fArr5[117] = -0.502986f;
        fArr5[118] = -0.15296486f;
        fArr5[119] = 0.40046722f;
        fArr5[120] = 0.7504884f;
        fArr5[121] = -0.502986f;
        fArr5[122] = 0.40046722f;
        fArr5[123] = -0.15296486f;
        fArr5[124] = 0.6740059f;
        fArr5[125] = -0.5794685f;
        fArr5[126] = 0.32398477f;
        fArr5[127] = 0.32398477f;
        fArr5[128] = -0.753341f;
        fArr5[129] = -0.3796829f;
        fArr5[130] = -0.3796829f;
        fArr5[131] = -0.3796829f;
        fArr5[132] = -0.78216845f;
        fArr5[133] = -0.43214726f;
        fArr5[134] = -0.43214726f;
        fArr5[135] = 0.121284805f;
        fArr5[136] = -0.78216845f;
        fArr5[137] = -0.43214726f;
        fArr5[138] = 0.121284805f;
        fArr5[139] = -0.43214726f;
        fArr5[140] = -0.78216845f;
        fArr5[141] = 0.121284805f;
        fArr5[142] = -0.43214726f;
        fArr5[143] = -0.43214726f;
        fArr5[144] = -0.85865086f;
        fArr5[145] = -0.5086297f;
        fArr5[146] = 0.04480237f;
        fArr5[147] = 0.04480237f;
        fArr5[148] = -0.85865086f;
        fArr5[149] = 0.04480237f;
        fArr5[150] = -0.5086297f;
        fArr5[151] = 0.04480237f;
        fArr5[152] = -0.85865086f;
        fArr5[153] = 0.04480237f;
        fArr5[154] = 0.04480237f;
        fArr5[155] = -0.5086297f;
        fArr5[156] = -0.9982829f;
        fArr5[157] = -0.033819415f;
        fArr5[158] = -0.033819415f;
        fArr5[159] = -0.033819415f;
        fArr5[160] = -0.3796829f;
        fArr5[161] = -0.753341f;
        fArr5[162] = -0.3796829f;
        fArr5[163] = -0.3796829f;
        fArr5[164] = -0.43214726f;
        fArr5[165] = -0.78216845f;
        fArr5[166] = -0.43214726f;
        fArr5[167] = 0.121284805f;
        fArr5[168] = -0.43214726f;
        fArr5[169] = -0.78216845f;
        fArr5[170] = 0.121284805f;
        fArr5[171] = -0.43214726f;
        fArr5[172] = 0.121284805f;
        fArr5[173] = -0.78216845f;
        fArr5[174] = -0.43214726f;
        fArr5[175] = -0.43214726f;
        fArr5[176] = -0.5086297f;
        fArr5[177] = -0.85865086f;
        fArr5[178] = 0.04480237f;
        fArr5[179] = 0.04480237f;
        fArr5[180] = 0.04480237f;
        fArr5[181] = -0.85865086f;
        fArr5[182] = -0.5086297f;
        fArr5[183] = 0.04480237f;
        fArr5[184] = 0.04480237f;
        fArr5[185] = -0.85865086f;
        fArr5[186] = 0.04480237f;
        fArr5[187] = -0.5086297f;
        fArr5[188] = -0.033819415f;
        fArr5[189] = -0.9982829f;
        fArr5[190] = -0.033819415f;
        fArr5[191] = -0.033819415f;
        fArr5[192] = -0.3796829f;
        fArr5[193] = -0.3796829f;
        fArr5[194] = -0.753341f;
        fArr5[195] = -0.3796829f;
        fArr5[196] = -0.43214726f;
        fArr5[197] = -0.43214726f;
        fArr5[198] = -0.78216845f;
        fArr5[199] = 0.121284805f;
        fArr5[200] = -0.43214726f;
        fArr5[201] = 0.121284805f;
        fArr5[202] = -0.78216845f;
        fArr5[203] = -0.43214726f;
        fArr5[204] = 0.121284805f;
        fArr5[205] = -0.43214726f;
        fArr5[206] = -0.78216845f;
        fArr5[207] = -0.43214726f;
        fArr5[208] = -0.5086297f;
        fArr5[209] = 0.04480237f;
        fArr5[210] = -0.85865086f;
        fArr5[211] = 0.04480237f;
        fArr5[212] = 0.04480237f;
        fArr5[213] = -0.5086297f;
        fArr5[214] = -0.85865086f;
        fArr5[215] = 0.04480237f;
        fArr5[216] = 0.04480237f;
        fArr5[217] = 0.04480237f;
        fArr5[218] = -0.85865086f;
        fArr5[219] = -0.5086297f;
        fArr5[220] = -0.033819415f;
        fArr5[221] = -0.033819415f;
        fArr5[222] = -0.9982829f;
        fArr5[223] = -0.033819415f;
        fArr5[224] = -0.3796829f;
        fArr5[225] = -0.3796829f;
        fArr5[226] = -0.3796829f;
        fArr5[227] = -0.753341f;
        fArr5[228] = -0.43214726f;
        fArr5[229] = -0.43214726f;
        fArr5[230] = 0.121284805f;
        fArr5[231] = -0.78216845f;
        fArr5[232] = -0.43214726f;
        fArr5[233] = 0.121284805f;
        fArr5[234] = -0.43214726f;
        fArr5[235] = -0.78216845f;
        fArr5[236] = 0.121284805f;
        fArr5[237] = -0.43214726f;
        fArr5[238] = -0.43214726f;
        fArr5[239] = -0.78216845f;
        fArr5[240] = -0.5086297f;
        fArr5[241] = 0.04480237f;
        fArr5[242] = 0.04480237f;
        fArr5[243] = -0.85865086f;
        fArr5[244] = 0.04480237f;
        fArr5[245] = -0.5086297f;
        fArr5[246] = 0.04480237f;
        fArr5[247] = -0.85865086f;
        fArr5[248] = 0.04480237f;
        fArr5[249] = 0.04480237f;
        fArr5[250] = -0.5086297f;
        fArr5[251] = -0.85865086f;
        fArr5[252] = -0.033819415f;
        fArr5[253] = -0.033819415f;
        fArr5[254] = -0.033819415f;
        fArr5[255] = -0.9982829f;
        fArr5[256] = -0.32398477f;
        fArr5[257] = -0.6740059f;
        fArr5[258] = -0.32398477f;
        fArr5[259] = 0.5794685f;
        fArr5[260] = -0.40046722f;
        fArr5[261] = -0.7504884f;
        fArr5[262] = 0.15296486f;
        fArr5[263] = 0.502986f;
        fArr5[264] = 0.15296486f;
        fArr5[265] = -0.7504884f;
        fArr5[266] = -0.40046722f;
        fArr5[267] = 0.502986f;
        fArr5[268] = 0.08164729f;
        fArr5[269] = -0.8828162f;
        fArr5[270] = 0.08164729f;
        fArr5[271] = 0.4553054f;
        fArr5[272] = -0.08164729f;
        fArr5[273] = -0.4553054f;
        fArr5[274] = -0.08164729f;
        fArr5[275] = 0.8828162f;
        fArr5[276] = -0.15296486f;
        fArr5[277] = -0.502986f;
        fArr5[278] = 0.40046722f;
        fArr5[279] = 0.7504884f;
        fArr5[280] = 0.40046722f;
        fArr5[281] = -0.502986f;
        fArr5[282] = -0.15296486f;
        fArr5[283] = 0.7504884f;
        fArr5[284] = 0.32398477f;
        fArr5[285] = -0.5794685f;
        fArr5[286] = 0.32398477f;
        fArr5[287] = 0.6740059f;
        fArr5[288] = -0.32398477f;
        fArr5[289] = -0.32398477f;
        fArr5[290] = -0.6740059f;
        fArr5[291] = 0.5794685f;
        fArr5[292] = -0.40046722f;
        fArr5[293] = 0.15296486f;
        fArr5[294] = -0.7504884f;
        fArr5[295] = 0.502986f;
        fArr5[296] = 0.15296486f;
        fArr5[297] = -0.40046722f;
        fArr5[298] = -0.7504884f;
        fArr5[299] = 0.502986f;
        fArr5[300] = 0.08164729f;
        fArr5[301] = 0.08164729f;
        fArr5[302] = -0.8828162f;
        fArr5[303] = 0.4553054f;
        fArr5[304] = -0.08164729f;
        fArr5[305] = -0.08164729f;
        fArr5[306] = -0.4553054f;
        fArr5[307] = 0.8828162f;
        fArr5[308] = -0.15296486f;
        fArr5[309] = 0.40046722f;
        fArr5[310] = -0.502986f;
        fArr5[311] = 0.7504884f;
        fArr5[312] = 0.40046722f;
        fArr5[313] = -0.15296486f;
        fArr5[314] = -0.502986f;
        fArr5[315] = 0.7504884f;
        fArr5[316] = 0.32398477f;
        fArr5[317] = 0.32398477f;
        fArr5[318] = -0.5794685f;
        fArr5[319] = 0.6740059f;
        fArr5[320] = -0.32398477f;
        fArr5[321] = -0.6740059f;
        fArr5[322] = 0.5794685f;
        fArr5[323] = -0.32398477f;
        fArr5[324] = -0.40046722f;
        fArr5[325] = -0.7504884f;
        fArr5[326] = 0.502986f;
        fArr5[327] = 0.15296486f;
        fArr5[328] = 0.15296486f;
        fArr5[329] = -0.7504884f;
        fArr5[330] = 0.502986f;
        fArr5[331] = -0.40046722f;
        fArr5[332] = 0.08164729f;
        fArr5[333] = -0.8828162f;
        fArr5[334] = 0.4553054f;
        fArr5[335] = 0.08164729f;
        fArr5[336] = -0.08164729f;
        fArr5[337] = -0.4553054f;
        fArr5[338] = 0.8828162f;
        fArr5[339] = -0.08164729f;
        fArr5[340] = -0.15296486f;
        fArr5[341] = -0.502986f;
        fArr5[342] = 0.7504884f;
        fArr5[343] = 0.40046722f;
        fArr5[344] = 0.40046722f;
        fArr5[345] = -0.502986f;
        fArr5[346] = 0.7504884f;
        fArr5[347] = -0.15296486f;
        fArr5[348] = 0.32398477f;
        fArr5[349] = -0.5794685f;
        fArr5[350] = 0.6740059f;
        fArr5[351] = 0.32398477f;
        fArr5[352] = -0.32398477f;
        fArr5[353] = -0.32398477f;
        fArr5[354] = 0.5794685f;
        fArr5[355] = -0.6740059f;
        fArr5[356] = -0.40046722f;
        fArr5[357] = 0.15296486f;
        fArr5[358] = 0.502986f;
        fArr5[359] = -0.7504884f;
        fArr5[360] = 0.15296486f;
        fArr5[361] = -0.40046722f;
        fArr5[362] = 0.502986f;
        fArr5[363] = -0.7504884f;
        fArr5[364] = 0.08164729f;
        fArr5[365] = 0.08164729f;
        fArr5[366] = 0.4553054f;
        fArr5[367] = -0.8828162f;
        fArr5[368] = -0.08164729f;
        fArr5[369] = -0.08164729f;
        fArr5[370] = 0.8828162f;
        fArr5[371] = -0.4553054f;
        fArr5[372] = -0.15296486f;
        fArr5[373] = 0.40046722f;
        fArr5[374] = 0.7504884f;
        fArr5[375] = -0.502986f;
        fArr5[376] = 0.40046722f;
        fArr5[377] = -0.15296486f;
        fArr5[378] = 0.7504884f;
        fArr5[379] = -0.502986f;
        fArr5[380] = 0.32398477f;
        fArr5[381] = 0.32398477f;
        fArr5[382] = 0.6740059f;
        fArr5[383] = -0.5794685f;
        fArr5[384] = -0.32398477f;
        fArr5[385] = 0.5794685f;
        fArr5[386] = -0.6740059f;
        fArr5[387] = -0.32398477f;
        fArr5[388] = -0.40046722f;
        fArr5[389] = 0.502986f;
        fArr5[390] = -0.7504884f;
        fArr5[391] = 0.15296486f;
        fArr5[392] = 0.15296486f;
        fArr5[393] = 0.502986f;
        fArr5[394] = -0.7504884f;
        fArr5[395] = -0.40046722f;
        fArr5[396] = 0.08164729f;
        fArr5[397] = 0.4553054f;
        fArr5[398] = -0.8828162f;
        fArr5[399] = 0.08164729f;
        fArr5[400] = -0.08164729f;
        fArr5[401] = 0.8828162f;
        fArr5[402] = -0.4553054f;
        fArr5[403] = -0.08164729f;
        fArr5[404] = -0.15296486f;
        fArr5[405] = 0.7504884f;
        fArr5[406] = -0.502986f;
        fArr5[407] = 0.40046722f;
        fArr5[408] = 0.40046722f;
        fArr5[409] = 0.7504884f;
        fArr5[410] = -0.502986f;
        fArr5[411] = -0.15296486f;
        fArr5[412] = 0.32398477f;
        fArr5[413] = 0.6740059f;
        fArr5[414] = -0.5794685f;
        fArr5[415] = 0.32398477f;
        fArr5[416] = -0.32398477f;
        fArr5[417] = 0.5794685f;
        fArr5[418] = -0.32398477f;
        fArr5[419] = -0.6740059f;
        fArr5[420] = -0.40046722f;
        fArr5[421] = 0.502986f;
        fArr5[422] = 0.15296486f;
        fArr5[423] = -0.7504884f;
        fArr5[424] = 0.15296486f;
        fArr5[425] = 0.502986f;
        fArr5[426] = -0.40046722f;
        fArr5[427] = -0.7504884f;
        fArr5[428] = 0.08164729f;
        fArr5[429] = 0.4553054f;
        fArr5[430] = 0.08164729f;
        fArr5[431] = -0.8828162f;
        fArr5[432] = -0.08164729f;
        fArr5[433] = 0.8828162f;
        fArr5[434] = -0.08164729f;
        fArr5[435] = -0.4553054f;
        fArr5[436] = -0.15296486f;
        fArr5[437] = 0.7504884f;
        fArr5[438] = 0.40046722f;
        fArr5[439] = -0.502986f;
        fArr5[440] = 0.40046722f;
        fArr5[441] = 0.7504884f;
        fArr5[442] = -0.15296486f;
        fArr5[443] = -0.502986f;
        fArr5[444] = 0.32398477f;
        fArr5[445] = 0.6740059f;
        fArr5[446] = 0.32398477f;
        fArr5[447] = -0.5794685f;
        fArr5[448] = 0.5794685f;
        fArr5[449] = -0.32398477f;
        fArr5[450] = -0.6740059f;
        fArr5[451] = -0.32398477f;
        fArr5[452] = 0.502986f;
        fArr5[453] = -0.40046722f;
        fArr5[454] = -0.7504884f;
        fArr5[455] = 0.15296486f;
        fArr5[456] = 0.502986f;
        fArr5[457] = 0.15296486f;
        fArr5[458] = -0.7504884f;
        fArr5[459] = -0.40046722f;
        fArr5[460] = 0.4553054f;
        fArr5[461] = 0.08164729f;
        fArr5[462] = -0.8828162f;
        fArr5[463] = 0.08164729f;
        fArr5[464] = 0.8828162f;
        fArr5[465] = -0.08164729f;
        fArr5[466] = -0.4553054f;
        fArr5[467] = -0.08164729f;
        fArr5[468] = 0.7504884f;
        fArr5[469] = -0.15296486f;
        fArr5[470] = -0.502986f;
        fArr5[471] = 0.40046722f;
        fArr5[472] = 0.7504884f;
        fArr5[473] = 0.40046722f;
        fArr5[474] = -0.502986f;
        fArr5[475] = -0.15296486f;
        fArr5[476] = 0.6740059f;
        fArr5[477] = 0.32398477f;
        fArr5[478] = -0.5794685f;
        fArr5[479] = 0.32398477f;
        fArr5[480] = 0.5794685f;
        fArr5[481] = -0.32398477f;
        fArr5[482] = -0.32398477f;
        fArr5[483] = -0.6740059f;
        fArr5[484] = 0.502986f;
        fArr5[485] = -0.40046722f;
        fArr5[486] = 0.15296486f;
        fArr5[487] = -0.7504884f;
        fArr5[488] = 0.502986f;
        fArr5[489] = 0.15296486f;
        fArr5[490] = -0.40046722f;
        fArr5[491] = -0.7504884f;
        fArr5[492] = 0.4553054f;
        fArr5[493] = 0.08164729f;
        fArr5[494] = 0.08164729f;
        fArr5[495] = -0.8828162f;
        fArr5[496] = 0.8828162f;
        fArr5[497] = -0.08164729f;
        fArr5[498] = -0.08164729f;
        fArr5[499] = -0.4553054f;
        fArr5[500] = 0.7504884f;
        fArr5[501] = -0.15296486f;
        fArr5[502] = 0.40046722f;
        fArr5[503] = -0.502986f;
        fArr5[504] = 0.7504884f;
        fArr5[505] = 0.40046722f;
        fArr5[506] = -0.15296486f;
        fArr5[507] = -0.502986f;
        fArr5[508] = 0.6740059f;
        fArr5[509] = 0.32398477f;
        fArr5[510] = 0.32398477f;
        fArr5[511] = -0.5794685f;
        fArr5[512] = 0.033819415f;
        fArr5[513] = 0.033819415f;
        fArr5[514] = 0.033819415f;
        fArr5[515] = 0.9982829f;
        fArr5[516] = -0.04480237f;
        fArr5[517] = -0.04480237f;
        fArr5[518] = 0.5086297f;
        fArr5[519] = 0.85865086f;
        fArr5[520] = -0.04480237f;
        fArr5[521] = 0.5086297f;
        fArr5[522] = -0.04480237f;
        fArr5[523] = 0.85865086f;
        fArr5[524] = -0.121284805f;
        fArr5[525] = 0.43214726f;
        fArr5[526] = 0.43214726f;
        fArr5[527] = 0.78216845f;
        fArr5[528] = 0.5086297f;
        fArr5[529] = -0.04480237f;
        fArr5[530] = -0.04480237f;
        fArr5[531] = 0.85865086f;
        fArr5[532] = 0.43214726f;
        fArr5[533] = -0.121284805f;
        fArr5[534] = 0.43214726f;
        fArr5[535] = 0.78216845f;
        fArr5[536] = 0.43214726f;
        fArr5[537] = 0.43214726f;
        fArr5[538] = -0.121284805f;
        fArr5[539] = 0.78216845f;
        fArr5[540] = 0.3796829f;
        fArr5[541] = 0.3796829f;
        fArr5[542] = 0.3796829f;
        fArr5[543] = 0.753341f;
        fArr5[544] = 0.033819415f;
        fArr5[545] = 0.033819415f;
        fArr5[546] = 0.9982829f;
        fArr5[547] = 0.033819415f;
        fArr5[548] = -0.04480237f;
        fArr5[549] = 0.04480237f;
        fArr5[550] = 0.85865086f;
        fArr5[551] = 0.5086297f;
        fArr5[552] = -0.04480237f;
        fArr5[553] = 0.5086297f;
        fArr5[554] = 0.85865086f;
        fArr5[555] = -0.04480237f;
        fArr5[556] = -0.121284805f;
        fArr5[557] = 0.43214726f;
        fArr5[558] = 0.78216845f;
        fArr5[559] = 0.43214726f;
        fArr5[560] = 0.5086297f;
        fArr5[561] = -0.04480237f;
        fArr5[562] = 0.85865086f;
        fArr5[563] = -0.04480237f;
        fArr5[564] = 0.43214726f;
        fArr5[565] = -0.121284805f;
        fArr5[566] = 0.78216845f;
        fArr5[567] = 0.43214726f;
        fArr5[568] = 0.43214726f;
        fArr5[569] = 0.43214726f;
        fArr5[570] = 0.78216845f;
        fArr5[571] = -0.121284805f;
        fArr5[572] = 0.3796829f;
        fArr5[573] = 0.3796829f;
        fArr5[574] = 0.753341f;
        fArr5[575] = 0.3796829f;
        fArr5[576] = 0.033819415f;
        fArr5[577] = 0.9982829f;
        fArr5[578] = 0.033819415f;
        fArr5[579] = 0.033819415f;
        fArr5[580] = -0.04480237f;
        fArr5[581] = 0.85865086f;
        fArr5[582] = -0.04480237f;
        fArr5[583] = 0.5086297f;
        fArr5[584] = -0.04480237f;
        fArr5[585] = 0.85865086f;
        fArr5[586] = 0.5086297f;
        fArr5[587] = -0.04480237f;
        fArr5[588] = -0.121284805f;
        fArr5[589] = 0.78216845f;
        fArr5[590] = 0.43214726f;
        fArr5[591] = 0.43214726f;
        fArr5[592] = 0.5086297f;
        fArr5[593] = 0.85865086f;
        fArr5[594] = -0.04480237f;
        fArr5[595] = -0.04480237f;
        fArr5[596] = 0.43214726f;
        fArr5[597] = 0.78216845f;
        fArr5[598] = -0.121284805f;
        fArr5[599] = 0.43214726f;
        fArr5[600] = 0.43214726f;
        fArr5[601] = 0.78216845f;
        fArr5[602] = 0.43214726f;
        fArr5[603] = -0.121284805f;
        fArr5[604] = 0.3796829f;
        fArr5[605] = 0.753341f;
        fArr5[606] = 0.3796829f;
        fArr5[607] = 0.3796829f;
        fArr5[608] = 0.9982829f;
        fArr5[609] = 0.033819415f;
        fArr5[610] = 0.033819415f;
        fArr5[611] = 0.033819415f;
        fArr5[612] = 0.85865086f;
        fArr5[613] = -0.04480237f;
        fArr5[614] = -0.04480237f;
        fArr5[615] = 0.5086297f;
        fArr5[616] = 0.85865086f;
        fArr5[617] = -0.04480237f;
        fArr5[618] = 0.5086297f;
        fArr5[619] = -0.04480237f;
        fArr5[620] = 0.78216845f;
        fArr5[621] = -0.121284805f;
        fArr5[622] = 0.43214726f;
        fArr5[623] = 0.43214726f;
        fArr5[624] = 0.85865086f;
        fArr5[625] = 0.5086297f;
        fArr5[626] = -0.04480237f;
        fArr5[627] = -0.04480237f;
        fArr5[628] = 0.78216845f;
        fArr5[629] = 0.43214726f;
        fArr5[630] = -0.121284805f;
        fArr5[631] = 0.43214726f;
        fArr5[632] = 0.78216845f;
        fArr5[633] = 0.43214726f;
        fArr5[634] = 0.43214726f;
        fArr5[635] = -0.121284805f;
        fArr5[636] = 0.753341f;
        fArr5[637] = 0.3796829f;
        fArr5[638] = 0.3796829f;
        fArr5[639] = 0.3796829f;
        for (int i7 = 0; i7 < 640; i7++) {
            fArr5[i7] = (float) (((double) fArr5[i7]) / NORMALIZER_4D);
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            float[] fArr6 = GRADIENTS_4D;
            if (i8 >= fArr6.length) {
                return;
            }
            if (i9 == 640) {
                i9 = 0;
            }
            fArr6[i8] = fArr5[i9];
            i8++;
            i9++;
        }
    }

    private static int fastFloor(double d) {
        int i = (int) d;
        return d < ((double) i) ? i - 1 : i;
    }

    private static int fastRound(double d) {
        return (int) (d < 0.0d ? d - 0.5d : d + 0.5d);
    }

    private static float grad(long j, long j2, long j3, float f, float f2) {
        long j4 = ((j ^ j2) ^ j3) * HASH_MULTIPLIER;
        int i = ((int) (j4 ^ (j4 >> 58))) & StyleIdentifier.MEDIUM_GRID_2_ACCENT_6;
        float[] fArr = GRADIENTS_2D;
        return (fArr[i | 1] * f2) + (fArr[i] * f);
    }

    public static float noise2(long j, double d, double d2) {
        double d3 = (d + d2) * SKEW_2D;
        return noise2_UnskewedBase(j, d + d3, d2 + d3);
    }

    public static float noise2_ImproveX(long j, double d, double d2) {
        double d3 = d * ROOT2OVER2;
        double d4 = d2 * 1.2247448713915896d;
        return noise2_UnskewedBase(j, d4 + d3, d4 - d3);
    }

    private static float noise2_UnskewedBase(long j, double d, double d2) {
        float fGrad;
        float f;
        float fGrad2;
        int iFastFloor = fastFloor(d);
        int iFastFloor2 = fastFloor(d2);
        float f2 = (float) (d - ((double) iFastFloor));
        float f3 = (float) (d2 - ((double) iFastFloor2));
        long j2 = ((long) iFastFloor) * PRIME_X;
        long j3 = ((long) iFastFloor2) * PRIME_Y;
        float f4 = (f2 + f3) * (-0.21132487f);
        float f5 = f2 + f4;
        float f6 = f3 + f4;
        float f7 = (0.5f - (f5 * f5)) - (f6 * f6);
        if (f7 > 0.0f) {
            float f8 = f7 * f7;
            fGrad = f8 * f8 * grad(j, j2, j3, f5, f6);
        } else {
            fGrad = 0.0f;
        }
        float f9 = (f7 - 0.6666667f) + (f4 * (-3.1547005f));
        if (f9 > 0.0f) {
            float f10 = f9 * f9;
            fGrad = (f10 * f10 * grad(j, j2 + PRIME_X, j3 + PRIME_Y, f5 - 0.57735026f, f6 - 0.57735026f)) + fGrad;
        }
        float f11 = fGrad;
        if (f6 > f5) {
            float f12 = f5 - (-0.21132487f);
            float f13 = f6 - 0.7886751f;
            float f14 = (0.5f - (f12 * f12)) - (f13 * f13);
            if (f14 > 0.0f) {
                float f15 = f14 * f14;
                f = f15 * f15;
                fGrad2 = grad(j, j2, j3 + PRIME_Y, f12, f13);
                return (f * fGrad2) + f11;
            }
            return f11;
        }
        float f16 = f5 - 0.7886751f;
        float f17 = f6 - (-0.21132487f);
        float f18 = (0.5f - (f16 * f16)) - (f17 * f17);
        if (f18 > 0.0f) {
            float f19 = f18 * f18;
            f = f19 * f19;
            fGrad2 = grad(j, j2 + PRIME_X, j3, f16, f17);
            return (f * fGrad2) + f11;
        }
        return f11;
    }

    public static float noise3_Fallback(long j, double d, double d2, double d3) {
        double d4 = (d + d2 + d3) * FALLBACK_ROTATE_3D;
        return noise3_UnrotatedBase(j, d4 - d, d4 - d2, d4 - d3);
    }

    public static float noise3_ImproveXY(long j, double d, double d2, double d3) {
        double d4 = d + d2;
        double d5 = (-0.21132486540518713d) * d4;
        double d6 = ROOT3OVER3 * d3;
        return noise3_UnrotatedBase(j, d + d5 + d6, d2 + d5 + d6, (d4 * (-0.577350269189626d)) + d6);
    }

    public static float noise3_ImproveXZ(long j, double d, double d2, double d3) {
        double d4 = d + d3;
        double d5 = (-0.21132486540518713d) * d4;
        double d6 = ROOT3OVER3 * d2;
        return noise3_UnrotatedBase(j, d + d5 + d6, (d4 * (-0.577350269189626d)) + d6, d3 + d5 + d6);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f9 A[LOOP:0: B:3:0x006f->B:30:0x00f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static float noise3_UnrotatedBase(long j, double d, double d2, double d3) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        int iFastRound = fastRound(d);
        int iFastRound2 = fastRound(d2);
        int iFastRound3 = fastRound(d3);
        float f = (float) (d - ((double) iFastRound));
        float f2 = (float) (d2 - ((double) iFastRound2));
        float f3 = (float) (d3 - ((double) iFastRound3));
        int i = ((int) ((-1.0f) - f)) | 1;
        int i2 = ((int) ((-1.0f) - f2)) | 1;
        int i3 = ((int) ((-1.0f) - f3)) | 1;
        float f4 = i * (-f);
        float f5 = i2 * (-f2);
        float f6 = i3 * (-f3);
        long j7 = ((long) iFastRound) * PRIME_X;
        long j8 = ((long) iFastRound2) * PRIME_Y;
        long j9 = ((long) iFastRound3) * PRIME_Z;
        float f7 = (0.6f - (f * f)) - ((f3 * f3) + (f2 * f2));
        long j10 = j;
        long j11 = j8;
        float f8 = f;
        float f9 = f2;
        float f10 = f3;
        long j12 = j9;
        long j13 = j7;
        float fGrad = 0.0f;
        int i4 = 0;
        int i5 = i2;
        while (true) {
            if (f7 > 0.0f) {
                float f11 = f7 * f7;
                j2 = j13;
                fGrad += f11 * f11 * grad(j10, j13, j11, j12, f8, f9, f10);
            } else {
                j2 = j13;
            }
            if (f4 < f5 || f4 < f6) {
                j3 = j11;
                if (f5 <= f4 || f5 < f6) {
                    j4 = j2;
                    j5 = j12;
                    float f12 = f7 + f6 + f6;
                    if (f12 > 1.0f) {
                        float f13 = f12 - 1.0f;
                        float f14 = f13 * f13;
                        j6 = j3;
                        fGrad = (f14 * f14 * grad(j10, j4, j6, j5 - (((long) i3) * PRIME_Z), f8, f9, f10 + i3)) + fGrad;
                    }
                    if (i4 == 1) {
                        return fGrad;
                    }
                    f4 = 0.5f - f4;
                    f5 = 0.5f - f5;
                    f6 = 0.5f - f6;
                    f8 = i * f4;
                    f9 = i5 * f5;
                    f10 = i3 * f6;
                    f7 += (0.75f - f4) - (f5 + f6);
                    j13 = j4 + (((long) (i >> 1)) & PRIME_X);
                    j11 = j6 + (((long) (i5 >> 1)) & PRIME_Y);
                    j12 = j5 + (((long) (i3 >> 1)) & PRIME_Z);
                    i = -i;
                    i5 = -i5;
                    i3 = -i3;
                    j10 ^= SEED_FLIP_3D;
                    i4++;
                } else {
                    float f15 = f7 + f5 + f5;
                    if (f15 > 1.0f) {
                        float f16 = f15 - 1.0f;
                        float f17 = f16 * f16;
                        j4 = j2;
                        j5 = j12;
                        fGrad += f17 * f17 * grad(j10, j4, j3 - (((long) i5) * PRIME_Y), j12, f8, f9 + i5, f10);
                    }
                }
                j6 = j3;
                if (i4 == 1) {
                }
            } else {
                float f18 = f7 + f4 + f4;
                if (f18 > 1.0f) {
                    float f19 = f18 - 1.0f;
                    float f20 = f19 * f19;
                    j3 = j11;
                    fGrad += f20 * f20 * grad(j10, j2 - (((long) i) * PRIME_X), j11, j12, f8 + i, f9, f10);
                } else {
                    j3 = j11;
                }
            }
            j4 = j2;
            j5 = j12;
            j6 = j3;
            if (i4 == 1) {
            }
        }
    }

    public static float noise4_Fallback(long j, double d, double d2, double d3, double d4) {
        double d5 = (d + d2 + d3 + d4) * (-0.13819660246372223d);
        return noise4_UnskewedBase(j, d + d5, d2 + d5, d3 + d5, d4 + d5);
    }

    public static float noise4_ImproveXYZ(long j, double d, double d2, double d3, double d4) {
        double d5 = d + d2 + d3;
        double d6 = 0.2236067977499788d * d4;
        double d7 = ((-0.16666666666666666d) * d5) + d6;
        return noise4_UnskewedBase(j, d + d7, d2 + d7, d3 + d7, (d5 * (-0.5d)) + d6);
    }

    public static float noise4_ImproveXYZ_ImproveXY(long j, double d, double d2, double d3, double d4) {
        double d5 = d + d2;
        double d6 = 0.2236067977499788d * d4;
        double d7 = (0.2886751345948129d * d3) + d6;
        double d8 = ((-0.211324865405187d) * d5) + d7;
        return noise4_UnskewedBase(j, d + d8, d2 + d8, (d5 * (-0.577350269189626d)) + d7, ((-0.866025403784439d) * d3) + d6);
    }

    public static float noise4_ImproveXYZ_ImproveXZ(long j, double d, double d2, double d3, double d4) {
        double d5 = d + d3;
        double d6 = 0.2236067977499788d * d4;
        double d7 = (0.2886751345948129d * d2) + d6;
        double d8 = ((-0.211324865405187d) * d5) + d7;
        return noise4_UnskewedBase(j, d + d8, (d5 * (-0.577350269189626d)) + d7, d3 + d8, ((-0.866025403784439d) * d2) + d6);
    }

    public static float noise4_ImproveXY_ImproveZW(long j, double d, double d2, double d3, double d4) {
        double d5 = d + d2;
        double d6 = d3 + d4;
        double d7 = (0.21562339328884284d * d6) + ((-0.17827565795139938d) * d5);
        double d8 = (d5 * (-0.3751990830100753d)) + (d6 * (-0.4039497625802071d));
        return noise4_UnskewedBase(j, d + d7, d2 + d7, d3 + d8, d4 + d8);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static float noise4_UnskewedBase(long j, double d, double d2, double d3, double d4) {
        double d5;
        long j2;
        float fOooO00o;
        int iFastFloor = fastFloor(d);
        int iFastFloor2 = fastFloor(d2);
        int iFastFloor3 = fastFloor(d3);
        int iFastFloor4 = fastFloor(d4);
        float f = (float) (d - ((double) iFastFloor));
        float f2 = (float) (d2 - ((double) iFastFloor2));
        float f3 = (float) (d3 - ((double) iFastFloor3));
        float f4 = (float) (d4 - ((double) iFastFloor4));
        float f5 = f3 + f4 + f + f2;
        int i = (int) (((double) f5) * 1.25d);
        long j3 = (((long) i) * SEED_OFFSET_4D) + j;
        float f6 = i * (-0.2f);
        float f7 = f + f6;
        float f8 = f2 + f6;
        float f9 = f3 + f6;
        float f10 = f4 + f6;
        float fOooO0O0 = C20504OooO0O0.OooO0O0(f6, 4.0f, f5, UNSKEW_4D);
        long j4 = ((long) iFastFloor) * PRIME_X;
        long j5 = ((long) iFastFloor2) * PRIME_Y;
        long j6 = ((long) iFastFloor3) * PRIME_Z;
        long j7 = ((long) iFastFloor4) * PRIME_W;
        float fGrad = 0.0f;
        int i2 = 0;
        long j8 = j3;
        long j9 = j4;
        long j10 = j5;
        while (true) {
            double d6 = (((double) fOooO0O0) * (-3.2360678915486614d)) + 1.0d;
            if (f7 < f8 || f7 < f9 || f7 < f10) {
                d5 = d6;
            } else {
                d5 = d6;
                if (f7 >= d5) {
                    j9 += PRIME_X;
                    f7 -= 1.0f;
                }
                fOooO0O0 -= UNSKEW_4D;
                j2 = j10;
                long j11 = j7;
                long j12 = j9;
                long j13 = j6;
                float f11 = f7 + fOooO0O0;
                float f12 = f8 + fOooO0O0;
                float f13 = f9 + fOooO0O0;
                float f14 = f10 + fOooO0O0;
                fOooO00o = OooO0O0.OooO00o(f14, f14, f13 * f13, (f12 * f12) + (f11 * f11));
                if (fOooO00o < 0.6f) {
                    float f15 = fOooO00o - 0.6f;
                    float f16 = f15 * f15;
                    fGrad = (f16 * f16 * grad(j8, j12, j2, j13, j11, f11, f12, f13, f14)) + fGrad;
                }
                if (i2 != 4) {
                    return fGrad;
                }
                f7 += 0.2f;
                f8 += 0.2f;
                f9 += 0.2f;
                f10 += 0.2f;
                fOooO0O0 += 0.2472136f;
                long j14 = j8 - SEED_OFFSET_4D;
                if (i2 == i) {
                    j12 -= PRIME_X;
                    j2 -= PRIME_Y;
                    j13 -= PRIME_Z;
                    j11 -= PRIME_W;
                    j8 -= -4183686790220896564L;
                } else {
                    j8 = j14;
                }
                j9 = j12;
                j6 = j13;
                j7 = j11;
                i2++;
                j10 = j2;
            }
            if (f8 <= f7 || f8 < f9 || f8 < f10 || f8 < d5) {
                if (f9 <= f7 || f9 <= f8 || f9 < f10 || f9 < d5) {
                    if (f10 > f7 && f10 > f8 && f10 > f9 && f10 >= d5) {
                        j7 += PRIME_W;
                        f10 -= 1.0f;
                    }
                    j2 = j10;
                    long j112 = j7;
                    long j122 = j9;
                    long j132 = j6;
                    float f112 = f7 + fOooO0O0;
                    float f122 = f8 + fOooO0O0;
                    float f132 = f9 + fOooO0O0;
                    float f142 = f10 + fOooO0O0;
                    fOooO00o = OooO0O0.OooO00o(f142, f142, f132 * f132, (f122 * f122) + (f112 * f112));
                    if (fOooO00o < 0.6f) {
                    }
                    if (i2 != 4) {
                    }
                } else {
                    j6 += PRIME_Z;
                    f9 -= 1.0f;
                }
                fOooO0O0 -= UNSKEW_4D;
                j2 = j10;
                long j1122 = j7;
                long j1222 = j9;
                long j1322 = j6;
                float f1122 = f7 + fOooO0O0;
                float f1222 = f8 + fOooO0O0;
                float f1322 = f9 + fOooO0O0;
                float f1422 = f10 + fOooO0O0;
                fOooO00o = OooO0O0.OooO00o(f1422, f1422, f1322 * f1322, (f1222 * f1222) + (f1122 * f1122));
                if (fOooO00o < 0.6f) {
                }
                if (i2 != 4) {
                }
            } else {
                long j15 = j10 + PRIME_Y;
                f8 -= 1.0f;
                fOooO0O0 -= UNSKEW_4D;
                j2 = j15;
                long j11222 = j7;
                long j12222 = j9;
                long j13222 = j6;
                float f11222 = f7 + fOooO0O0;
                float f12222 = f8 + fOooO0O0;
                float f13222 = f9 + fOooO0O0;
                float f14222 = f10 + fOooO0O0;
                fOooO00o = OooO0O0.OooO00o(f14222, f14222, f13222 * f13222, (f12222 * f12222) + (f11222 * f11222));
                if (fOooO00o < 0.6f) {
                }
                if (i2 != 4) {
                }
            }
        }
    }

    private static float grad(long j, long j2, long j3, long j4, float f, float f2, float f3) {
        long j5 = ((j ^ j2) ^ (j3 ^ j4)) * HASH_MULTIPLIER;
        int i = ((int) (j5 ^ (j5 >> 58))) & PointerIconCompat.TYPE_GRAB;
        float[] fArr = GRADIENTS_3D;
        return (fArr[i | 2] * f3) + (fArr[i | 1] * f2) + (fArr[i] * f);
    }

    private static float grad(long j, long j2, long j3, long j4, long j5, float f, float f2, float f3, float f4) {
        long j6 = ((j ^ (j2 ^ j3)) ^ (j4 ^ j5)) * HASH_MULTIPLIER;
        int i = ((int) (j6 ^ (j6 >> 57))) & 2044;
        float[] fArr = GRADIENTS_4D;
        float f5 = (fArr[i | 1] * f2) + (fArr[i] * f);
        return OooO0O0.OooO00o(fArr[i | 3], f4, fArr[i | 2] * f3, f5);
    }
}
