package com.aspose.slides;

import android.support.v4.media.session.PlaybackStateCompat;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p407st.C10609qn;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: loaded from: classes3.dex */
class p7y {

    /* JADX INFO: renamed from: kk */
    private static final long[] f48007kk = {262145, 325, 34805960, 344, 3, 383, 131074, 470, 1, 720898, 325, 44991688, 326, 44992048, 327, 3600, 337, 44991536, 339, 10800, 340, 10800, 341, 44991104, 342, 60132064, 343, 44990744, 344, 2, 383, 131074, 393219, 325, 38643040, 326, 38642968, 337, 38642992, 343, 38642864, 344, 2, 383, 131074, 524308, 324, 0, 325, 60132272, 326, 60132296, 383, 65536, 447, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, 511, 1048592, 831, 524296, 959, 262148, 524320, 324, 0, 325, 61130904, 344, 0, 383, 65536, 447, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, 511, 1048592, 831, 524296, 959, 262148, 655398, 325, 61132384, 326, 61132488, 341, 61132544, 342, 61132512, 344, 0, 383, 65536, 447, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, 511, 1048592, 831, 524296, 959, 262148, 655427, 325, 45048600, 327, 16200, 328, 5400, 337, 45048776, 338, 45048800, 341, 45048704, 342, 45048728, 343, 45048752, 344, 2, 470, 1, 589899, 127, 8388736, 325, 60132120, 342, 60132168, 344, 3, 383, 1179650, 447, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, 470, 1, 511, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, 831, 1048592, 721002, 325, 58372528, 326, 58372552, 327, 1350, 328, 25920, 337, 58372736, 341, 58372632, 342, 58372680, 343, 58372576, 344, 2, 345, 58372704, 383, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, 786568, 127, 262148, 255, 1140868096, 325, 61290880, 326, 61290904, 327, 10800, 337, 61290976, 338, 61291032, 341, 61290952, 342, 61290928, 344, 2, 383, 262148, 831, 524296, 786570, 127, 262148, 255, 1140868096, 325, 61290672, 326, 61290720, 327, 10800, 337, 61290800, 338, 61290824, 341, 61290848, 342, 61290752, 344, 2, 383, 262148, 831, 524296, 786584, 127, 262148, 255, 1145062464, 325, 61290312, 326, 61290160, 327, 9931, 337, 61290624, 338, 61290648, 341, 61290592, 342, 61290568, 344, 2, 383, 262148, 831, 524296, 852126, 127, 262148, 255, 1145062464, 325, 61291104, 326, 61291136, 327, 1404, 328, 10800, 337, 61291208, 338, 61291232, 341, 61291184, 342, 61291160, 344, 2, 383, 262148, 831, 524296, 262346, 325, 34731720, 344, 3, 383, 131074, 470, 1};

    /* JADX INFO: renamed from: k4 */
    private int f48008k4;

    /* JADX INFO: renamed from: x1 */
    private List<C0846c9> f48009x1;

    public p7y() {
        this.f48009x1 = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    private void m68962kk(int i) {
        long j = f48007kk[i];
        this.f48008k4 = (int) (C18177fb.f54859s & j);
        int i2 = (int) ((j & 4294967295L) >> 16);
        for (int i3 = 0; i3 < i2; i3++) {
            C0846c9 c0846c9 = new C0846c9();
            long[] jArr = f48007kk;
            int i4 = i3 * 2;
            c0846c9.f4292k4 = jArr[i + 1 + i4];
            c0846c9.f4293x1 = jArr[i + 2 + i4];
            this.f48009x1.addItem(c0846c9.Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m68963k4() {
        return this.f48008k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m68966x1() {
        return this.f48009x1.size();
    }

    public p7y(int i) {
        this();
        m68962kk(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m68964k4(int i) {
        return this.f48009x1.get_Item(i).f4292k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m68967x1(int i) {
        return this.f48009x1.get_Item(i).f4293x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68961k4(Dictionary<Integer, p7y> dictionary) {
        int length;
        if (dictionary.size() <= 0 && (length = f48007kk.length) != 0) {
            for (int i = 0; i < length; i += (int) ((((((f48007kk[i] & 4294967295L) >> 16) & 4294967295L) * 2) & 4294967295L) + 1)) {
                p7y p7yVar = new p7y(i);
                dictionary.addItem(Integer.valueOf(p7yVar.m68963k4()), p7yVar);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68965k4(C10609qn c10609qn) {
        if (c10609qn == null) {
            return;
        }
        C0846c9 c0846c9 = new C0846c9();
        c0846c9.f4292k4 = ((long) c10609qn.m52116up()) & 4294967295L;
        c0846c9.f4293x1 = c10609qn.m51597ar();
        this.f48009x1.addItem(c0846c9.Clone());
    }
}
