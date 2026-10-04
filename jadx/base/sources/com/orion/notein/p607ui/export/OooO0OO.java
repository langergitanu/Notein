package com.orion.notein.p607ui.export;

import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportBottomSheetFragment$Companion", m80623f = "ExportBottomSheetFragment.kt", m80624l = {80}, m80625m = "getTempFileWithIdList")
public final class OooO0OO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ExportBottomSheetFragment.OooO00o f71746OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f71747OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f71748OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(ExportBottomSheetFragment.OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f71746OooOo = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f71747OooOo0o = obj;
        this.f71748OooOoO0 |= Integer.MIN_VALUE;
        return this.f71746OooOo.OooO00o(null, null, this);
    }
}
