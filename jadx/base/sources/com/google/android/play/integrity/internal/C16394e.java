package com.google.android.play.integrity.internal;

import android.support.v4.media.session.OooO00o;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.e */
/* JADX INFO: loaded from: classes7.dex */
final class C16394e extends AbstractC16395f {

    /* JADX INFO: renamed from: a */
    private final int f51575a;

    /* JADX INFO: renamed from: b */
    private final long f51576b;

    public C16394e(int i, long j) {
        this.f51575a = i;
        this.f51576b = j;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC16395f
    /* JADX INFO: renamed from: a */
    public final int mo75047a() {
        return this.f51575a;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC16395f
    /* JADX INFO: renamed from: b */
    public final long mo75048b() {
        return this.f51576b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16395f) {
            AbstractC16395f abstractC16395f = (AbstractC16395f) obj;
            if (this.f51575a == abstractC16395f.mo75047a() && this.f51576b == abstractC16395f.mo75048b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f51576b;
        return ((int) (j ^ (j >>> 32))) ^ ((this.f51575a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append(this.f51575a);
        sb.append(", eventTimestamp=");
        return OooO00o.OooO00o(this.f51576b, "}", sb);
    }
}
