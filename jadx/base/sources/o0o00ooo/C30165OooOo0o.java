package o0o00ooo;

import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.MainActivity;
import com.orion.notein.p607ui.label.ItemData;
import com.orion.notein.p607ui.notelist.OooO00o;
import com.orion.notein.p607ui.notelist.favorite.FavoriteListFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;

/* JADX INFO: renamed from: o0o00ooo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30165OooOo0o implements OooO00o.InterfaceC19403OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ FavoriteListFragment f107345OooO00o;

    /* JADX INFO: renamed from: o0o00ooo.OooOo0o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.favorite.FavoriteListFragment$initNoteMorePopupWindow$2$onClicked$1", m80623f = "FavoriteListFragment.kt", m80624l = {196, 200}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ FavoriteListFragment f107346OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107347OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ ItemData f107348OooOoO0;

        /* JADX INFO: renamed from: o0o00ooo.OooOo0o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.favorite.FavoriteListFragment$initNoteMorePopupWindow$2$onClicked$1$1", m80623f = "FavoriteListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C20047OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ItemData f107349OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ FavoriteListFragment f107350OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20047OooO00o(FavoriteListFragment favoriteListFragment, ItemData itemData, Continuation<? super C20047OooO00o> continuation) {
                super(2, continuation);
                this.f107350OooOo0o = favoriteListFragment;
                this.f107349OooOo = itemData;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C20047OooO00o(this.f107350OooOo0o, this.f107349OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C20047OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = this.f107350OooOo0o.requireActivity();
                kotlin.jvm.internal.OooOOO0.OooO0o0(activityC21897OooOo0RequireActivity, "null cannot be cast to non-null type com.orion.notein.MainActivity");
                ((MainActivity) activityC21897OooOo0RequireActivity).openLabelPicker(new ItemData[]{this.f107349OooOo});
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(FavoriteListFragment favoriteListFragment, ItemData itemData, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f107346OooOo = favoriteListFragment;
            this.f107348OooOoO0 = itemData;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f107346OooOo, this.f107348OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        
            if (oO0o0OO.C33609OooO0oo.OooO0o(r7, r1, r6) == r0) goto L21;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107347OooOo0o;
            FavoriteListFragment favoriteListFragment = this.f107346OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.notelist.OooO00o oooO00o = favoriteListFragment.f77525Oooo0;
                if (oooO00o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("itemLabelListPopupWindow");
                    throw null;
                }
                oooO00o.OooO00o();
                this.f107347OooOo0o = 1;
                obj = FavoriteListFragment.OooOoO(favoriteListFragment, 30, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                return C32460OooOooO.f116667OooO00o;
            }
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
            C20047OooO00o c20047OooO00o = new C20047OooO00o(favoriteListFragment, this.f107348OooOoO0, null);
            this.f107347OooOo0o = 2;
        }
    }

    public C30165OooOo0o(FavoriteListFragment favoriteListFragment) {
        this.f107345OooO00o = favoriteListFragment;
    }

    @Override // com.orion.notein.p607ui.notelist.OooO00o.InterfaceC19403OooO00o
    public final void OooO00o(ItemData itemData) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(itemData, "itemData");
        FavoriteListFragment favoriteListFragment = this.f107345OooO00o;
        InterfaceC21987OooOoo viewLifecycleOwner = favoriteListFragment.getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(favoriteListFragment, itemData, null), 3);
    }
}
