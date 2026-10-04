package o0Oo0o0o;

import Oooo0oO.C21030OooOO0o;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.AddWaterMarkFragment;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0Oo00o.C28026OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Oo0o0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.export.AddWaterMarkFragment$navigate2MarkTextEditingDialog$1", m80623f = "AddWaterMarkFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_3}, m80625m = "invokeSuspend")
public final class C28226OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AddWaterMarkFragment f100059OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100060OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28226OooO0OO(AddWaterMarkFragment addWaterMarkFragment, Continuation<? super C28226OooO0OO> continuation) {
        super(2, continuation);
        this.f100059OooOo = addWaterMarkFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28226OooO0OO(this.f100059OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28226OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100060OooOo0o;
        AddWaterMarkFragment addWaterMarkFragment = this.f100059OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List<Integer> list = AddWaterMarkFragment.f71503Oooo000;
            com.orion.notein.p607ui.export.OooO0O0 oooO0O0 = (com.orion.notein.p607ui.export.OooO0O0) addWaterMarkFragment.f71504OooOooO.getValue();
            this.f100060OooOo0o = 1;
            obj = C25252OooO0Oo.OooOOo(oooO0O0.f71711OooO0oo, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        String string = addWaterMarkFragment.requireContext().getString(R.string.edit_water_mark_title);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(addWaterMarkFragment), new C28228OooO0o(string, addWaterMarkFragment.requireContext().getString(R.string.edit_water_mark_hint), (String) obj));
        return C32460OooOooO.f116667OooO00o;
    }
}
