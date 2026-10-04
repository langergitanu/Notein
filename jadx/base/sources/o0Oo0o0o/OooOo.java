package o0Oo0o0o;

import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportBottomSheetFragment", m80623f = "ExportBottomSheetFragment.kt", m80624l = {390}, m80625m = "ensureWatermarkFeatureAvailable")
public final class OooOo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ExportBottomSheetFragment f100086OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f100087OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f100088OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(ExportBottomSheetFragment exportBottomSheetFragment, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f100086OooOo = exportBottomSheetFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f100087OooOo0o = obj;
        this.f100088OooOoO0 |= Integer.MIN_VALUE;
        return ExportBottomSheetFragment.OooOoo0(this.f100086OooOo, this);
    }
}
