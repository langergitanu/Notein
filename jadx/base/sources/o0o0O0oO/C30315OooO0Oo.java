package o0o0O0oO;

import android.view.View;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinContainerFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o0O0oO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinContainerFragment$initActionBar$11", m80623f = "TrashBinContainerFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_6}, m80625m = "invokeSuspend")
public final class C30315OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TrashBinContainerFragment f108088OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108089OooOo0o;

    /* JADX INFO: renamed from: o0o0O0oO.OooO0Oo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ TrashBinContainerFragment f108090OooOo0o;

        public OooO00o(TrashBinContainerFragment trashBinContainerFragment) {
            this.f108090OooOo0o = trashBinContainerFragment;
        }

        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        public final Object emit(Object obj, Continuation continuation) {
            int iIntValue = ((Number) obj).intValue();
            TrashBinContainerFragment trashBinContainerFragment = this.f108090OooOo0o;
            if (iIntValue == 0) {
                View view = trashBinContainerFragment.f78067OooOoo;
                if (view == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("atbNormal");
                    throw null;
                }
                view.setVisibility(0);
                View view2 = trashBinContainerFragment.f78077Oooo0OO;
                if (view2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("atbSelect");
                    throw null;
                }
                view2.setVisibility(8);
                View view3 = trashBinContainerFragment.f78080Oooo0oO;
                if (view3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("selectActions");
                    throw null;
                }
                view3.setVisibility(8);
            } else if (iIntValue == 1) {
                View view4 = trashBinContainerFragment.f78067OooOoo;
                if (view4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("atbNormal");
                    throw null;
                }
                view4.setVisibility(8);
                View view5 = trashBinContainerFragment.f78077Oooo0OO;
                if (view5 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("atbSelect");
                    throw null;
                }
                view5.setVisibility(0);
                View view6 = trashBinContainerFragment.f78080Oooo0oO;
                if (view6 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("selectActions");
                    throw null;
                }
                view6.setVisibility(0);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30315OooO0Oo(TrashBinContainerFragment trashBinContainerFragment, Continuation<? super C30315OooO0Oo> continuation) {
        super(2, continuation);
        this.f108088OooOo = trashBinContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30315OooO0Oo(this.f108088OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        ((C30315OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        return EnumC32485OooO00o.f116726OooOo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108089OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw androidx.transition.OooOOOO.OooO0O0(obj);
        }
        C32446OooOOOo.OooO0O0(obj);
        TrashBinContainerFragment trashBinContainerFragment = this.f108088OooOo;
        C30351Oooo0oO c30351Oooo0oOOooOoOO = trashBinContainerFragment.OooOoOO();
        OooO00o oooO00o = new OooO00o(trashBinContainerFragment);
        this.f108089OooOo0o = 1;
        c30351Oooo0oOOooOoOO.f108238OooOOo.collect(oooO00o, this);
        return enumC32485OooO00o;
    }
}
