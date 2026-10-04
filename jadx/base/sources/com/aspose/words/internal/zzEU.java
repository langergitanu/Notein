package com.aspose.words.internal;

import com.aspose.slides.PatternStyle;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzEU {
    private zzGQ zzFh;
    private byte[] zzwM;
    private String zzwN;
    private String zzwO;
    private static byte[] zzwL = {0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0};
    private static byte[] zzwK = {-16, 0, 1, -1, -16, 0, 0, -1, -16, 0, 0, Ascii.DEL, -16, 0, 0, 63, -16, 0, 0, 31, -16, 0, 0, 15, -16, 0, 0, 15, -16, 0, 0, 15, -16, 0, 0, 15, -16, 0, 0, 15, -16, 0, 0, 15, -16, 0, 0, 15, -16, 0, 0, 15, -16, 0, 0, 15, -32, 0, 0, 15, -64, 0, 0, 15, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 15, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 15, -64, 0, 0, 15, -32, 0, 0, 7, -16, 0, 0, 7, -7, -32, 0, 3, -1, -32, 0, 3, -4, 0, 0, 1, -16, 0, 0, 1, -32, 0, 0, 1, -32, 0, 0, 1, -32, 0, 0, 3, -32, 0, PatternStyle.Cross, -1, -16, 0, 55, -1, -4, 0, 55, -1, -1, -64, 63, -1};
    private static byte[] zzwJ = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 
    0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, -64, -64, -64, 0, 0, -1, -1, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, -1, -1, -1, 0, -1, -1, -1, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, -64, -64, -64, 0, 0, 0, 0, 0, -64, -64, -64, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, -64, -64, -64, 0, -1, -1, -1, 0, 
    -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, -64, -64, -64, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, -64, -64, -64, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, -1, -1, -1, 0, -1, 0, 0, 0, -1, 0, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, -64, -64, -64, 0, -1, -1, -1, 0, -64, -64, -64, 0, -64, -64, -64, 0, -64, -64, -64, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -64, -64, -64, 0, -1, -1, -1, 0, -64, -64, -64, 0, 0, 0, 0, 0, 0, 0, 0, 0, -64, -64, -64, 0, -64, -64, -64, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, -64, -64, -64, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, -64, -64, -64, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, -64, -64, -64, 0, -64, -64, -64, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -64, -64, -64, 0, 0, 0, 0, 0, -64, -64, -64, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 
    UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, -64, -64, -64, 0, -64, -64, -64, 0, -64, -64, -64, 0, -64, -64, -64, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, -64, -64, -64, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, -64, -64, -64, 0, -64, -64, -64, 0, -64, -64, -64, 0, -64, -64, -64, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, -64, -64, -64, 0, -64, -64, -64, 0, -64, -64, -64, 0, -64, -64, -64, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, -64, -64, -64, 0, -1, -1, -1, 0, 0, 0, 0, 0, -64, -64, -64, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -64, -64, -64, 0, -64, -64, -64, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, -64, -64, -64, 0, -1, -1, -1, 0, 0, 0, 0, 0, -64, -64, -64, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, -64, -64, -64, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, -64, -64, -64, 0, -64, -64, -64, 0, 0, 0, 0, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, -1, 0, -1, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, -1, 0, -1, 0, -64, -64, -64, 0, -1, 0, -1, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -64, -64, -64, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -64, -64, -64, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public zzEU(String str, String str2, zzGQ zzgq) {
        this(null, str, str2, zzgq);
    }

    private boolean zzEa() {
        Iterator<Integer> it = new zzZYE(this.zzwO).iterator();
        while (it.hasNext()) {
            if (zzUX.zzZb(it.next().intValue())) {
                return true;
            }
        }
        return false;
    }

    private static zzEX zzEb() {
        byte[] bArr = zzwL;
        int length = bArr.length + 40;
        byte[] bArr2 = zzwK;
        int length2 = length + bArr2.length + 8;
        byte[] bArr3 = zzwJ;
        return new zzEX(32, 32, length2 + bArr3.length, 0, 0, 0, new zzEW(40, 1, 32, 3, 0, 0, 0, 0, bArr, bArr2, bArr3));
    }

    private static zzEX zzU(ArrayList<zzEX> arrayList, int i) {
        zzEX zzex = null;
        zzEX zzex2 = null;
        for (zzEX zzex3 : arrayList) {
            if (zzex3.zzEk() == i) {
                if (zzex3.zzEj().zzEh() == 32) {
                    return zzex3;
                }
                if (zzex == null && zzex3.zzEj().zzEh() == 8) {
                    zzex = zzex3;
                } else if (zzex2 == null && zzex3.zzEj().zzEh() == 4) {
                    zzex2 = zzex3;
                }
            }
        }
        return zzex != null ? zzex : zzex2;
    }

    private static zzEX zzV(ArrayList<zzEX> arrayList) {
        int[] iArr = {32, 24, 16, 48, 64, 72, 96, 128, 256};
        for (int i = 0; i < 9; i++) {
            zzEX zzexZzU = zzU(arrayList, iArr[i]);
            if (zzexZzU != null) {
                return zzexZzU;
            }
        }
        return null;
    }

    private static int zzY(String str, zzPM zzpm) {
        return (int) Math.ceil(zzSA.pointToPixel(zzpm.zz7(str)));
    }

    private static String zzYK(String str) {
        return str.replace(IOUtils.LINE_SEPARATOR_UNIX, "");
    }

    private static ArrayList<zzEX> zzYL(String str) throws Exception {
        zzZOR zzzor = new zzZOR();
        try {
            zzZOS zzzosZzVj = zzZOU.zzVj(str);
            try {
                zzZYQ.zzX(zzzosZzVj, zzzor);
                zzzor.zzH(0L);
                return zzZ(zzzor);
            } finally {
                zzzosZzVj.close();
            }
        } finally {
            zzzor.close();
        }
    }

    private static ArrayList<zzEX> zzZ(zzZOR zzzor) throws Exception {
        zzZOX zzzox = new zzZOX(zzzor);
        try {
            return new zzEV(zzzox).zzEd();
        } finally {
            zzzox.close();
        }
    }

    private static ArrayList<zzEX> zzZZ(byte[] bArr) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            return zzZ(zzzor);
        } finally {
            zzzor.close();
        }
    }

    public final byte[] zzEc() throws Exception {
        byte[] bArr = this.zzwM;
        if (bArr == null) {
            String str = this.zzwN;
            return str != null ? zzZ(zzV(zzYL(str)), this.zzwN) : zzZ(zzEb(), "C:\\WINDOWS\\system32\\packager.dll");
        }
        zzEX zzexZzV = zzV(zzZZ(bArr));
        String str2 = this.zzwN;
        return zzZ(zzexZzV, str2 != null ? str2 : "C:\\WINDOWS\\system32\\packager.dll");
    }

    public zzEU(byte[] bArr, String str, String str2, zzGQ zzgq) {
        this.zzwO = null;
        this.zzwN = null;
        this.zzwM = null;
        if (str2 == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: iconCaption");
        }
        if (zzgq == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: fontProvider");
        }
        this.zzwM = bArr;
        this.zzwN = str;
        this.zzwO = zzYK(str2);
        this.zzFh = zzgq;
    }

    private byte[] zzZ(zzEX zzex, String str) throws Exception {
        if (zzex != null) {
            if (zzex.zzEj() != null) {
                int i = zzEa() ? 2 : 1;
                zzPM zzpm = new zzPM(8.0f, 0, this.zzFh.zzN(zzJY.zzWU(i), 0));
                zzZOR zzzor = new zzZOR();
                try {
                    zzZOW zzzow = new zzZOW(zzzor);
                    try {
                        zzET zzet = new zzET(zzzow);
                        zzet.zzE9();
                        zzet.zzW6(0);
                        zzet.zzE8();
                        if (zzex.zzEj().zzEi()) {
                            zzet.zzZ(zzex);
                        } else {
                            zzet.zzZ(zzex, true);
                            zzet.zzZ(zzex, false);
                        }
                        zzet.zzW6(33554432);
                        zzet.zzE7();
                        zzet.zzW4(0);
                        zzet.zzW5(1);
                        zzet.zzW5(-2147483635);
                        zzet.zzE6();
                        zzet.zzW4(i);
                        zzet.zzW5(1);
                        for (zzZWO zzzwo : zzZ(this.zzwO, zzpm)) {
                            zzet.zzZ(zzzwo.getText(), zzzwo.getOffset(), zzzwo.isFirstRow(), zzpm);
                        }
                        zzet.zzW5(-2147483635);
                        zzet.zzYJ("IconOnly");
                        zzet.zzYJ(this.zzwO);
                        zzet.zzYJ(str);
                        zzet.zzE5();
                        zzet.zzYJ("IconOnly");
                        zzet.zzE4();
                        byte[] bArrZzZX = zzZYQ.zzZX(zzzor);
                        zzzow.close();
                        return bArrZzZX;
                    } catch (Throwable th) {
                        zzzow.close();
                        throw th;
                    }
                } finally {
                    zzzor.close();
                }
            }
            throw new IllegalArgumentException("iconImage.Bmp is null.");
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: iconImage");
    }

    private static ArrayList<zzZWO> zzZ(String str, zzPM zzpm) {
        ArrayList<zzZWO> arrayList = new ArrayList<>(2);
        int iZzY = zzY(str, zzpm);
        if (iZzY <= 95) {
            zzZQG.zzZ(arrayList, new zzZWO(str, 48 - (iZzY / 2), true));
            return arrayList;
        }
        String strSubstring = null;
        String strSubstring2 = null;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                break;
            }
            i++;
            strSubstring2 = str.substring(0, i);
            if (zzY(strSubstring2, zzpm) >= 95) {
                int i2 = -1;
                for (int iIndexOf = strSubstring2.indexOf(32, 0); iIndexOf >= 0; iIndexOf = strSubstring2.indexOf(32, iIndexOf + 1)) {
                    i2 = iIndexOf;
                }
                if (i2 >= 0) {
                    strSubstring2 = str.substring(0, i2);
                    strSubstring = str.substring(i2 + 1);
                } else {
                    strSubstring = str.substring(i);
                }
            }
        }
        int iZzY2 = 48 - (zzY(strSubstring2, zzpm) / 2);
        int iZzY3 = 48 - (zzY(strSubstring, zzpm) / 2);
        if (iZzY2 < -1) {
            iZzY2 = -1;
        }
        zzZQG.zzZ(arrayList, new zzZWO(strSubstring2, iZzY2, true));
        zzZQG.zzZ(arrayList, new zzZWO(strSubstring, iZzY3 >= -1 ? iZzY3 : -1, false));
        return arrayList;
    }
}
