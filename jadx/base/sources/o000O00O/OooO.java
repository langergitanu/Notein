package o000O00O;

import java.util.function.IntUnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO implements IntUnaryOperator {
    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        return Math.max(i - 1, 0);
    }
}
