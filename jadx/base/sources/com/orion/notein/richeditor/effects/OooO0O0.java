package com.orion.notein.richeditor.effects;

import com.orion.notein.richeditor.spans.RTSpan;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.InkStrokeInfo;
import java.util.function.Predicate;
import o0oo0o.InterfaceC31284OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OooO0O0 implements Predicate {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f70421OooO00o;

    public /* synthetic */ OooO0O0(int i) {
        this.f70421OooO00o = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f70421OooO00o) {
            case 0:
                return AlignmentEffect.lambda$onParagraphLayoutChanged$1((RTSpan) obj);
            default:
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj;
                return (interfaceC31284OooO0O0 instanceof DrawRecord) || (interfaceC31284OooO0O0 instanceof InkStrokeInfo);
        }
    }
}
