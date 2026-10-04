package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzrb;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
final class zzit implements Callable {
    final /* synthetic */ zzbg zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzjd zzc;

    public zzit(zzjd zzjdVar, zzbg zzbgVar, String str) {
        this.zza = zzbgVar;
        this.zzb = str;
        Objects.requireNonNull(zzjdVar);
        this.zzc = zzjdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x044a A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0460 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x046b A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bc A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0220 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0245 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0262 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0290 A[Catch: all -> 0x007b, LOOP:1: B:85:0x028a->B:87:0x0290, LOOP_END, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x032b A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x034c A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x038a A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03e8 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        byte[] bArr;
        zzpg zzpgVar;
        String strZzc;
        zzpg zzpgVar2;
        List listZzn;
        Iterator it;
        zzpn zzpnVar;
        int i;
        zzic zzicVar;
        zzbc zzbcVarZzf;
        zzpg zzpgVar3;
        zzh zzhVar;
        zzic zzicVar2;
        com.google.android.gms.internal.measurement.zzic zzicVar3;
        Bundle bundle;
        String str;
        Object obj;
        boolean z;
        com.google.android.gms.internal.measurement.zzhz zzhzVar;
        zzbc zzbcVarZza;
        long j;
        com.google.android.gms.internal.measurement.zzic zzicVar4;
        com.google.android.gms.internal.measurement.zzhr zzhrVarZzk;
        zzbd zzbdVar;
        long jZzp;
        long jZzn;
        String strZzh;
        byte[] bArr2;
        zzjd zzjdVar = this.zzc;
        zzjdVar.zzL().zzZ();
        zzlp zzlpVarZzn = zzjdVar.zzL().zzn();
        zzlpVarZzn.zzg();
        zzic zzicVar5 = zzlpVarZzn.zzu;
        zzic.zzL();
        zzbg zzbgVar = this.zza;
        Preconditions.checkNotNull(zzbgVar);
        String str2 = this.zzb;
        Preconditions.checkNotEmpty(str2);
        String str3 = zzbgVar.zza;
        if (!"_iap".equals(str3) && !"_iapx".equals(str3)) {
            zzlpVarZzn.zzu.zzaV().zzj().zzc("Generating a payload for this event is not available. package_name, event_name", str2, str3);
            return null;
        }
        zzpg zzpgVar4 = zzlpVarZzn.zzg;
        com.google.android.gms.internal.measurement.zzhz zzhzVarZzh = com.google.android.gms.internal.measurement.zzib.zzh();
        zzpgVar4.zzj().zzb();
        try {
            zzh zzhVarZzu = zzpgVar4.zzj().zzu(str2);
            if (zzhVarZzu == null) {
                zzlpVarZzn.zzu.zzaV().zzj().zzb("Log and bundle not available. package_name", str2);
                bArr2 = new byte[0];
            } else {
                if (zzhVarZzu.zzD()) {
                    com.google.android.gms.internal.measurement.zzic zzicVarZzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                    zzicVarZzaE.zza(1);
                    zzicVarZzaE.zzC(TelemetryEventStrings.C18741Os.OS_NAME);
                    if (!TextUtils.isEmpty(zzhVarZzu.zzc())) {
                        zzicVarZzaE.zzL(zzhVarZzu.zzc());
                    }
                    if (!TextUtils.isEmpty(zzhVarZzu.zzv())) {
                        zzicVarZzaE.zzJ((String) Preconditions.checkNotNull(zzhVarZzu.zzv()));
                    }
                    if (!TextUtils.isEmpty(zzhVarZzu.zzr())) {
                        zzicVarZzaE.zzM((String) Preconditions.checkNotNull(zzhVarZzu.zzr()));
                    }
                    if (zzhVarZzu.zzt() != -2147483648L) {
                        zzicVarZzaE.zzaj((int) zzhVarZzu.zzt());
                    }
                    zzicVarZzaE.zzN(zzhVarZzu.zzx());
                    zzicVarZzaE.zzar(zzhVarZzu.zzB());
                    String strZzf = zzhVarZzu.zzf();
                    if (!TextUtils.isEmpty(strZzf)) {
                        zzicVarZzaE.zzad(strZzf);
                    }
                    zzicVarZzaE.zzay(zzhVarZzu.zzak());
                    zzjl zzjlVarZzB = zzlpVarZzn.zzg.zzB(str2);
                    zzicVarZzaE.zzY(zzhVarZzu.zzz());
                    if (zzicVar5.zzB() && zzlpVarZzn.zzu.zzc().zzC(zzicVarZzaE.zzK()) && zzjlVarZzB.zzo(zzjk.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzicVarZzaE.zzam(null);
                    }
                    zzicVarZzaE.zzat(zzjlVarZzB.zzk());
                    if (zzjlVarZzB.zzo(zzjk.AD_STORAGE) && zzhVarZzu.zzac()) {
                        Pair pairZzc = zzpgVar4.zzq().zzc(zzhVarZzu.zzc(), zzjlVarZzB);
                        if (zzhVarZzu.zzac() && !TextUtils.isEmpty((CharSequence) pairZzc.first)) {
                            try {
                                zzicVarZzaE.zzQ(zzlp.zzc((String) pairZzc.first, Long.toString(zzbgVar.zzd)));
                                Object obj2 = pairZzc.second;
                                if (obj2 != null) {
                                    zzicVarZzaE.zzT(((Boolean) obj2).booleanValue());
                                }
                                zzic zzicVar6 = zzlpVarZzn.zzu;
                                zzicVar6.zzu().zzw();
                                zzicVarZzaE.zzF(Build.MODEL);
                                zzicVar6.zzu().zzw();
                                zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                                zzicVarZzaE.zzI((int) zzicVar6.zzu().zzb());
                                zzicVarZzaE.zzH(zzicVar6.zzu().zzc());
                                if (zzjlVarZzB.zzo(zzjk.ANALYTICS_STORAGE)) {
                                    zzicVarZzaE.zzW(zzlp.zzc((String) Preconditions.checkNotNull(zzhVarZzu.zzd()), Long.toString(zzbgVar.zzd)));
                                }
                                if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                }
                                strZzc = zzhVarZzu.zzc();
                                zzpgVar2 = zzlpVarZzn.zzg;
                                listZzn = zzpgVar2.zzj().zzn(strZzc);
                                it = listZzn.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                    }
                                }
                                if (zzpnVar != null) {
                                    zzpn zzpnVar2 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzaZ().currentTimeMillis(), 0L);
                                    listZzn.add(zzpnVar2);
                                    zzpgVar2.zzj().zzl(zzpnVar2);
                                }
                                com.google.android.gms.internal.measurement.zziu[] zziuVarArr = new com.google.android.gms.internal.measurement.zziu[listZzn.size()];
                                while (i < listZzn.size()) {
                                }
                                zzicVarZzaE.zzq(Arrays.asList(zziuVarArr));
                                zzpg zzpgVar5 = zzlpVarZzn.zzg;
                                zzpgVar5.zzI(zzhVarZzu, zzicVarZzaE);
                                zzpgVar5.zzJ(zzhVarZzu, zzicVarZzaE);
                                zzgv zzgvVarZza = zzgv.zza(zzbgVar);
                                zzicVar = zzlpVarZzn.zzu;
                                zzpp zzppVarZzk = zzicVar.zzk();
                                Bundle bundle2 = zzgvVarZza.zzd;
                                zzppVarZzk.zzI(bundle2, zzpgVar2.zzj().zzU(str2));
                                zzicVar.zzk().zzG(zzgvVarZza, zzicVar.zzc().zzd(str2));
                                bundle2.putLong("_c", 1L);
                                zzicVar.zzaV().zzj().zza("Marking in-app purchase as real-time");
                                bundle2.putLong("_r", 1L);
                                String str4 = zzbgVar.zzc;
                                bundle2.putString("_o", str4);
                                if (zzicVar.zzk().zzaa(zzicVarZzaE.zzK(), zzhVarZzu.zzay())) {
                                }
                                zzav zzavVarZzj = zzpgVar2.zzj();
                                String str5 = zzbgVar.zza;
                                zzbcVarZzf = zzavVarZzj.zzf(str2, str5);
                                if (zzbcVarZzf != null) {
                                }
                                zzbc zzbcVar = zzbcVarZza;
                                zzpgVar2.zzj().zzh(zzbcVar);
                                zzic zzicVar7 = zzlpVarZzn.zzu;
                                long j2 = zzbgVar.zzd;
                                zzh zzhVar2 = zzhVar;
                                zzicVar4 = zzicVar3;
                                zzpg zzpgVar6 = zzpgVar3;
                                boolean z2 = z;
                                zzbb zzbbVar = new zzbb(zzicVar7, str, str2, str5, j2, j, bundle);
                                zzhrVarZzk = com.google.android.gms.internal.measurement.zzhs.zzk();
                                zzhrVarZzk.zzo(zzbbVar.zzd);
                                zzhrVarZzk.zzl(zzbbVar.zzb);
                                zzhrVarZzk.zzq(zzbbVar.zze);
                                zzbe zzbeVar = zzbbVar.zzf;
                                zzbdVar = new zzbd(zzbeVar);
                                while (zzbdVar.hasNext()) {
                                }
                                zzicVar4.zzg(zzhrVarZzk);
                                com.google.android.gms.internal.measurement.zzie zzieVarZza = com.google.android.gms.internal.measurement.zzig.zza();
                                com.google.android.gms.internal.measurement.zzht zzhtVarZza = com.google.android.gms.internal.measurement.zzhu.zza();
                                zzhtVarZza.zzb(zzbcVar.zzc);
                                zzhtVarZza.zza(str5);
                                zzieVarZza.zza(zzhtVarZza);
                                zzicVar4.zzap(zzieVarZza);
                                zzicVar4.zzaf(zzpgVar2.zzm().zzb(zzhVar2.zzc(), Collections.EMPTY_LIST, zzicVar4.zzk(), Long.valueOf(zzhrVarZzk.zzn()), Long.valueOf(zzhrVarZzk.zzn()), false));
                                if (zzhrVarZzk.zzm()) {
                                }
                                jZzp = zzhVar2.zzp();
                                if (jZzp != 0) {
                                }
                                jZzn = zzhVar2.zzn();
                                if (jZzn == 0) {
                                }
                                strZzh = zzhVar2.zzh();
                                zzrb.zza();
                                if (zzicVar2.zzc().zzp(str2, zzfy.zzaM)) {
                                    zzicVar4.zzau(strZzh);
                                }
                                zzhVar2.zzL();
                                zzicVar4.zzZ((int) zzhVar2.zzG());
                                zzicVar2.zzc().zzi();
                                zzicVar4.zzO(133005L);
                                zzicVar4.zzs(zzicVar2.zzaZ().currentTimeMillis());
                                zzicVar4.zzae(z2);
                                zzpgVar6.zzS(zzicVar4.zzK(), zzicVar4);
                                zzhzVar.zze(zzicVar4);
                                zzhVar2.zzo(zzicVar4.zzu());
                                zzhVar2.zzq(zzicVar4.zzw());
                                zzpgVar2.zzj().zzv(zzhVar2, false, false);
                                zzpgVar2.zzj().zzc();
                                zzpgVar2.zzj().zzd();
                                return zzpgVar2.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc()).zzcc());
                            } catch (SecurityException e) {
                                zzlpVarZzn.zzu.zzaV().zzj().zzb("Resettable device id encryption failed", e.getMessage());
                                bArr = new byte[0];
                                zzpgVar = zzlpVarZzn.zzg;
                            }
                        }
                    } else {
                        zzic zzicVar62 = zzlpVarZzn.zzu;
                        zzicVar62.zzu().zzw();
                        zzicVarZzaE.zzF(Build.MODEL);
                        zzicVar62.zzu().zzw();
                        zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                        zzicVarZzaE.zzI((int) zzicVar62.zzu().zzb());
                        zzicVarZzaE.zzH(zzicVar62.zzu().zzc());
                        try {
                            if (zzjlVarZzB.zzo(zzjk.ANALYTICS_STORAGE) && zzhVarZzu.zzd() != null) {
                                zzicVarZzaE.zzW(zzlp.zzc((String) Preconditions.checkNotNull(zzhVarZzu.zzd()), Long.toString(zzbgVar.zzd)));
                            }
                            if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                            }
                            strZzc = zzhVarZzu.zzc();
                            zzpgVar2 = zzlpVarZzn.zzg;
                            listZzn = zzpgVar2.zzj().zzn(strZzc);
                            it = listZzn.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    zzpnVar = null;
                                    break;
                                }
                                zzpnVar = (zzpn) it.next();
                                if ("_lte".equals(zzpnVar.zzc)) {
                                    break;
                                }
                            }
                            if (zzpnVar != null || zzpnVar.zze == null) {
                                zzpn zzpnVar22 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzaZ().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar22);
                                zzpgVar2.zzj().zzl(zzpnVar22);
                            }
                            com.google.android.gms.internal.measurement.zziu[] zziuVarArr2 = new com.google.android.gms.internal.measurement.zziu[listZzn.size()];
                            for (i = 0; i < listZzn.size(); i++) {
                                com.google.android.gms.internal.measurement.zzit zzitVarZzm = com.google.android.gms.internal.measurement.zziu.zzm();
                                zzitVarZzm.zzb(((zzpn) listZzn.get(i)).zzc);
                                zzitVarZzm.zza(((zzpn) listZzn.get(i)).zzd);
                                zzpgVar2.zzp().zzc(zzitVarZzm, ((zzpn) listZzn.get(i)).zze);
                                zziuVarArr2[i] = (com.google.android.gms.internal.measurement.zziu) zzitVarZzm.zzbc();
                            }
                            zzicVarZzaE.zzq(Arrays.asList(zziuVarArr2));
                            zzpg zzpgVar52 = zzlpVarZzn.zzg;
                            zzpgVar52.zzI(zzhVarZzu, zzicVarZzaE);
                            zzpgVar52.zzJ(zzhVarZzu, zzicVarZzaE);
                            zzgv zzgvVarZza2 = zzgv.zza(zzbgVar);
                            zzicVar = zzlpVarZzn.zzu;
                            zzpp zzppVarZzk2 = zzicVar.zzk();
                            Bundle bundle22 = zzgvVarZza2.zzd;
                            zzppVarZzk2.zzI(bundle22, zzpgVar2.zzj().zzU(str2));
                            zzicVar.zzk().zzG(zzgvVarZza2, zzicVar.zzc().zzd(str2));
                            bundle22.putLong("_c", 1L);
                            zzicVar.zzaV().zzj().zza("Marking in-app purchase as real-time");
                            bundle22.putLong("_r", 1L);
                            String str42 = zzbgVar.zzc;
                            bundle22.putString("_o", str42);
                            if (zzicVar.zzk().zzaa(zzicVarZzaE.zzK(), zzhVarZzu.zzay())) {
                                zzicVar.zzk().zzM(bundle22, "_dbg", 1L);
                                zzicVar.zzk().zzM(bundle22, "_r", 1L);
                            }
                            zzav zzavVarZzj2 = zzpgVar2.zzj();
                            String str52 = zzbgVar.zza;
                            zzbcVarZzf = zzavVarZzj2.zzf(str2, str52);
                            if (zzbcVarZzf != null) {
                                zzhVar = zzhVarZzu;
                                zzicVar2 = zzicVar;
                                zzicVar3 = zzicVarZzaE;
                                zzpgVar3 = zzpgVar52;
                                obj = null;
                                z = true;
                                str = str42;
                                bundle = bundle22;
                                zzbcVarZza = new zzbc(str2, str52, 0L, 0L, 0L, zzbgVar.zzd, 0L, null, null, null, null);
                                j = 0;
                                zzhzVar = zzhzVarZzh;
                            } else {
                                zzpgVar3 = zzpgVar52;
                                zzhVar = zzhVarZzu;
                                zzicVar2 = zzicVar;
                                zzicVar3 = zzicVarZzaE;
                                bundle = bundle22;
                                str = str42;
                                obj = null;
                                z = true;
                                zzhzVar = zzhzVarZzh;
                                long j3 = zzbcVarZzf.zzf;
                                zzbcVarZza = zzbcVarZzf.zza(zzbgVar.zzd);
                                j = j3;
                            }
                            zzbc zzbcVar2 = zzbcVarZza;
                            zzpgVar2.zzj().zzh(zzbcVar2);
                            zzic zzicVar72 = zzlpVarZzn.zzu;
                            long j22 = zzbgVar.zzd;
                            zzh zzhVar22 = zzhVar;
                            zzicVar4 = zzicVar3;
                            zzpg zzpgVar62 = zzpgVar3;
                            boolean z22 = z;
                            zzbb zzbbVar2 = new zzbb(zzicVar72, str, str2, str52, j22, j, bundle);
                            zzhrVarZzk = com.google.android.gms.internal.measurement.zzhs.zzk();
                            zzhrVarZzk.zzo(zzbbVar2.zzd);
                            zzhrVarZzk.zzl(zzbbVar2.zzb);
                            zzhrVarZzk.zzq(zzbbVar2.zze);
                            zzbe zzbeVar2 = zzbbVar2.zzf;
                            zzbdVar = new zzbd(zzbeVar2);
                            while (zzbdVar.hasNext()) {
                                String next = zzbdVar.next();
                                com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzhvVarZzn.zzb(next);
                                Object objZza = zzbeVar2.zza(next);
                                if (objZza != null) {
                                    zzpgVar2.zzp().zzd(zzhvVarZzn, objZza);
                                    zzhrVarZzk.zzg(zzhvVarZzn);
                                }
                            }
                            zzicVar4.zzg(zzhrVarZzk);
                            com.google.android.gms.internal.measurement.zzie zzieVarZza2 = com.google.android.gms.internal.measurement.zzig.zza();
                            com.google.android.gms.internal.measurement.zzht zzhtVarZza2 = com.google.android.gms.internal.measurement.zzhu.zza();
                            zzhtVarZza2.zzb(zzbcVar2.zzc);
                            zzhtVarZza2.zza(str52);
                            zzieVarZza2.zza(zzhtVarZza2);
                            zzicVar4.zzap(zzieVarZza2);
                            zzicVar4.zzaf(zzpgVar2.zzm().zzb(zzhVar22.zzc(), Collections.EMPTY_LIST, zzicVar4.zzk(), Long.valueOf(zzhrVarZzk.zzn()), Long.valueOf(zzhrVarZzk.zzn()), false));
                            if (zzhrVarZzk.zzm()) {
                                zzicVar4.zzv(zzhrVarZzk.zzn());
                                zzicVar4.zzx(zzhrVarZzk.zzn());
                            }
                            jZzp = zzhVar22.zzp();
                            if (jZzp != 0) {
                                zzicVar4.zzA(jZzp);
                            }
                            jZzn = zzhVar22.zzn();
                            if (jZzn == 0) {
                                zzicVar4.zzy(jZzn);
                            } else if (jZzp != 0) {
                                zzicVar4.zzy(jZzp);
                            }
                            strZzh = zzhVar22.zzh();
                            zzrb.zza();
                            if (zzicVar2.zzc().zzp(str2, zzfy.zzaM) && strZzh != null) {
                                zzicVar4.zzau(strZzh);
                            }
                            zzhVar22.zzL();
                            zzicVar4.zzZ((int) zzhVar22.zzG());
                            zzicVar2.zzc().zzi();
                            zzicVar4.zzO(133005L);
                            zzicVar4.zzs(zzicVar2.zzaZ().currentTimeMillis());
                            zzicVar4.zzae(z22);
                            zzpgVar62.zzS(zzicVar4.zzK(), zzicVar4);
                            zzhzVar.zze(zzicVar4);
                            zzhVar22.zzo(zzicVar4.zzu());
                            zzhVar22.zzq(zzicVar4.zzw());
                            zzpgVar2.zzj().zzv(zzhVar22, false, false);
                            zzpgVar2.zzj().zzc();
                            zzpgVar2.zzj().zzd();
                            try {
                                return zzpgVar2.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc()).zzcc());
                            } catch (IOException e2) {
                                zzlpVarZzn.zzu.zzaV().zzb().zzc("Data loss. Failed to bundle and serialize. appId", zzgu.zzl(str2), e2);
                                return obj;
                            }
                        } catch (SecurityException e3) {
                            zzlpVarZzn.zzu.zzaV().zzj().zzb("app instance id encryption failed", e3.getMessage());
                            bArr = new byte[0];
                            zzpgVar = zzlpVarZzn.zzg;
                        }
                    }
                    zzpgVar.zzj().zzd();
                    return bArr;
                }
                zzlpVarZzn.zzu.zzaV().zzj().zzb("Log and bundle disabled. package_name", str2);
                bArr2 = new byte[0];
            }
            zzpgVar4.zzj().zzd();
            return bArr2;
        } catch (Throwable th) {
            zzlpVarZzn.zzg.zzj().zzd();
            throw th;
        }
    }
}
