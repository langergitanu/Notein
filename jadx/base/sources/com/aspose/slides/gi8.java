package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class gi8 {

    /* JADX INFO: renamed from: k4 */
    private boolean f5254k4;

    /* JADX INFO: renamed from: kk */
    private u8s f5255kk;

    /* JADX INFO: renamed from: to */
    private y2n f5256to;

    /* JADX INFO: renamed from: x1 */
    private Dictionary<IShape, Long> f5257x1;

    public gi8(Dictionary<IShape, Long> dictionary, y2n y2nVar) {
        this.f5257x1 = dictionary;
        this.f5256to = y2nVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<IShape, Long> m6687k4() {
        return this.f5257x1;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m6695kk() {
        return this.f5254k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m6696x1(IAudio iAudio) {
        y2n y2nVar = this.f5256to;
        if (y2nVar != null) {
            return nmb.m68089k4(iAudio, y2nVar);
        }
        return 0;
    }

    public gi8(u8s u8sVar, Dictionary<IShape, Long> dictionary) {
        this.f5257x1 = dictionary;
        this.f5255kk = u8sVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final C11709bg m6688k4(C11791os c11791os) {
        u8s u8sVar = this.f5255kk;
        if (u8sVar != null) {
            return u8sVar.m55433g8().m55311x1(c11791os);
        }
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m6697x1(String str) {
        u8s u8sVar;
        C11791os c11791osM55296x1;
        IAudio iAudioM71537k4;
        if (this.f5256to == null || (u8sVar = this.f5255kk) == null || (c11791osM55296x1 = u8sVar.m55433g8().m55303k4(str).m55296x1()) == null || (iAudioM71537k4 = this.f5255kk.m71537k4(c11791osM55296x1)) == null) {
            return 0;
        }
        return nmb.m68089k4(iAudioM71537k4, this.f5256to);
    }

    /* JADX INFO: renamed from: k4 */
    public final C11709bg m6689k4(String str) {
        u8s u8sVar = this.f5255kk;
        if (u8sVar != null) {
            return u8sVar.m55433g8().m55304k4(str, "NULL");
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final Dictionary<Long, uz3> m6698x1() {
        return this.f5256to.m73690bv();
    }

    /* JADX INFO: renamed from: k4 */
    public final C11791os m6690k4(IAudio iAudio) {
        u8s u8sVar = this.f5255kk;
        if (u8sVar != null) {
            return u8sVar.m71538k4(iAudio);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6691k4(String str, int i) {
        y2n y2nVar = this.f5256to;
        if (y2nVar == null) {
            throw new InvalidOperationException();
        }
        y2nVar.m73707k4(str, i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6692k4(boolean z) {
        this.f5254k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m6693k4(long j) {
        Dictionary.KeyCollection.Enumerator<IShape, Long> it = m6687k4().getKeys().iterator();
        while (it.hasNext()) {
            try {
                if (((Shape) it.next()).m2584wp() == j) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m6694k4(IShape iShape) {
        Dictionary.KeyCollection.Enumerator<IShape, Long> it = m6687k4().getKeys().iterator();
        while (it.hasNext()) {
            try {
                if (it.next() == iShape) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
