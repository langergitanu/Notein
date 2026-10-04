package o00ooO0;

import android.util.SparseIntArray;
import o00o0o0o.C25446OooO0Oo;
import o00o0o0o.InterfaceC25443OooO00o;
import o00ooO0.AbstractC25738OooO0oO;

/* JADX INFO: renamed from: o00ooO0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C25745OooOo0 extends AbstractC25738OooO0oO<byte[]> implements InterfaceC25443OooO00o {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int[] f87868OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25745OooOo0(C25446OooO0Oo memoryTrimmableRegistry, Oooo000 poolParams, C25751OooOoo poolStatsTracker) {
        super(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        kotlin.jvm.internal.OooOOO0.OooO0oO(memoryTrimmableRegistry, "memoryTrimmableRegistry");
        kotlin.jvm.internal.OooOOO0.OooO0oO(poolParams, "poolParams");
        kotlin.jvm.internal.OooOOO0.OooO0oO(poolStatsTracker, "poolStatsTracker");
        SparseIntArray sparseIntArray = poolParams.f87901OooO0OO;
        if (sparseIntArray != null) {
            this.f87868OooOO0 = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i = 0; i < size; i++) {
                this.f87868OooOO0[i] = sparseIntArray.keyAt(i);
            }
        } else {
            this.f87868OooOO0 = new int[0];
        }
        this.f87833OooO0O0.getClass();
        this.f87831OooO.getClass();
    }

    @Override // o00ooO0.AbstractC25738OooO0oO
    public final byte[] OooO00o(int i) {
        return new byte[i];
    }

    @Override // o00ooO0.AbstractC25738OooO0oO
    public final void OooO0OO(byte[] bArr) {
        byte[] value = bArr;
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
    }

    @Override // o00ooO0.AbstractC25738OooO0oO
    public final int OooO0o(byte[] bArr) {
        byte[] value = bArr;
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        return value.length;
    }

    @Override // o00ooO0.AbstractC25738OooO0oO
    public final int OooO0o0(int i) {
        if (i <= 0) {
            throw new AbstractC25738OooO0oO.OooO0O0(Integer.valueOf(i));
        }
        for (int i2 : this.f87868OooOO0) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }

    @Override // o00ooO0.AbstractC25738OooO0oO
    public final int OooO0oO(int i) {
        return i;
    }
}
