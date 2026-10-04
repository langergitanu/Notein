package o0Oo0o0o;

import androidx.core.os.BundleKt;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.export.WatermarkEditDialogFragment;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Oo0o0o.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.ExportBottomSheetFragment$openWatermarkEditDialog$1", m80623f = "ExportBottomSheetFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_4_ACCENT_6}, m80625m = "invokeSuspend")
public final class C28246OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ExportBottomSheetFragment f100100OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100101OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28246OooOoO0(ExportBottomSheetFragment exportBottomSheetFragment, Continuation<? super C28246OooOoO0> continuation) {
        super(2, continuation);
        this.f100100OooOo = exportBottomSheetFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28246OooOoO0(this.f100100OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28246OooOoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100101OooOo0o;
        ExportBottomSheetFragment exportBottomSheetFragment = this.f100100OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.export.OooO0O0 oooO0O0Oooo000 = exportBottomSheetFragment.Oooo000();
            this.f100101OooOo0o = 1;
            obj = C25252OooO0Oo.OooOOo(oooO0O0Oooo000.f71711OooO0oo, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        String str = (String) obj;
        WatermarkEditDialogFragment watermarkEditDialogFragment = new WatermarkEditDialogFragment();
        if (str == null) {
            str = "";
        }
        watermarkEditDialogFragment.setArguments(BundleKt.bundleOf(new C32443OooOOO("arg_text", str)));
        watermarkEditDialogFragment.show(exportBottomSheetFragment.getChildFragmentManager(), "WatermarkEditDialog");
        return C32460OooOooO.f116667OooO00o;
    }
}
