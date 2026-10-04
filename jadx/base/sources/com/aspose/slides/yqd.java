package com.aspose.slides;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p407st.C10659tx;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class yqd {

    /* JADX INFO: renamed from: k4 */
    private a3u f50396k4;

    /* JADX INFO: renamed from: kk */
    private final SortedList<String, ISlideComponent> f50397kk;

    /* JADX INFO: renamed from: x1 */
    private gnb f50398x1;

    public yqd(SortedList<String, ISlideComponent> sortedList) {
        this.f50397kk = sortedList;
    }

    /* JADX INFO: renamed from: k4 */
    public final SortedList<String, ISlideComponent> m74068k4() {
        return this.f50397kk;
    }

    /* JADX INFO: renamed from: kk */
    public final a3u m74070kk() {
        return this.f50396k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final gnb m74071x1() {
        return this.f50398x1;
    }

    public yqd(a3u a3uVar, SortedList<String, ISlideComponent> sortedList) {
        this.f50397kk = sortedList;
        this.f50396k4 = a3uVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final IAudio m74069k4(String str) {
        gnb gnbVar = this.f50398x1;
        if (gnbVar != null) {
            if (C14113y2.m67363du("NULL", gnbVar.m55338u4().m55303k4(str).m55292k4())) {
                return null;
            }
            gnb gnbVar2 = this.f50398x1;
            return gnbVar2.m6798x1(gnbVar2.m55338u4().m55303k4(str).m55296x1());
        }
        if (this.f50396k4 == null) {
            throw new InvalidOperationException();
        }
        int[] iArr = {0};
        boolean zM66590k4 = C14057f9.m66590k4(str, iArr);
        int i = iArr[0];
        if (!zM66590k4) {
            return null;
        }
        C10659tx c10659txM51042k4 = this.f50396k4.m71951m9().m51705jd().m51042k4(i);
        if (c10659txM51042k4.m51784h4() == null) {
            return null;
        }
        return this.f50396k4.m3179k4(c10659txM51042k4);
    }

    public yqd(gnb gnbVar, SortedList<String, ISlideComponent> sortedList) {
        this.f50397kk = sortedList;
        this.f50398x1 = gnbVar;
    }
}
