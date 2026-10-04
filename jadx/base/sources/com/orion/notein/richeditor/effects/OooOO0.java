package com.orion.notein.richeditor.effects;

import com.orion.notein.richeditor.spans.RTSpan;
import java.util.function.Predicate;
import o0oo0o.InterfaceC31284OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OooOO0 implements Predicate {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f70423OooO00o;

    public /* synthetic */ OooOO0(int i) {
        this.f70423OooO00o = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f70423OooO00o) {
            case 0:
                return NumberEffect.lambda$applyToSelection$0((RTSpan) obj);
            default:
                return ((InterfaceC31284OooO0O0) obj).doesSupportLayer();
        }
    }
}
