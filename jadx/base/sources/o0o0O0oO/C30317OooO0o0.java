package o0o0O0oO;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinContainerFragment;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o0O0oO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinContainerFragment$initActionBar$12", m80623f = "TrashBinContainerFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_2_ACCENT_2}, m80625m = "invokeSuspend")
public final class C30317OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TrashBinContainerFragment f108094OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108095OooOo0o;

    /* JADX INFO: renamed from: o0o0O0oO.OooO0o0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ TrashBinContainerFragment f108096OooOo0o;

        public OooO00o(TrashBinContainerFragment trashBinContainerFragment) {
            this.f108096OooOo0o = trashBinContainerFragment;
        }

        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        public final Object emit(Object obj, Continuation continuation) {
            List list = (List) obj;
            boolean zIsEmpty = list.isEmpty();
            TrashBinContainerFragment trashBinContainerFragment = this.f108096OooOo0o;
            if (zIsEmpty) {
                TextView textView = trashBinContainerFragment.f78078Oooo0o;
                if (textView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("selectAll");
                    throw null;
                }
                textView.setText(trashBinContainerFragment.getResources().getString(R.string.action_bar_select_all));
            } else {
                TextView textView2 = trashBinContainerFragment.f78078Oooo0o;
                if (textView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("selectAll");
                    throw null;
                }
                textView2.setText(trashBinContainerFragment.getResources().getString(R.string.action_bar_cancel_select));
            }
            TextView textView3 = trashBinContainerFragment.f78078Oooo0o;
            if (textView3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("selectAll");
                throw null;
            }
            textView3.requestLayout();
            ImageView imageView = trashBinContainerFragment.f78081Oooo0oo;
            if (imageView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnRecover");
                throw null;
            }
            List list2 = list;
            imageView.setEnabled(!list2.isEmpty());
            ImageView imageView2 = trashBinContainerFragment.f78071Oooo;
            if (imageView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnDeletePermanently");
                throw null;
            }
            imageView2.setEnabled(!list2.isEmpty());
            ImageView imageView3 = trashBinContainerFragment.f78071Oooo;
            if (imageView3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnDeletePermanently");
                throw null;
            }
            if (imageView3.isEnabled()) {
                ImageView imageView4 = trashBinContainerFragment.f78071Oooo;
                if (imageView4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnDeletePermanently");
                    throw null;
                }
                imageView4.setColorFilter(ContextCompat.getColor(trashBinContainerFragment.requireContext(), R.color.warning_color));
            } else {
                ImageView imageView5 = trashBinContainerFragment.f78071Oooo;
                if (imageView5 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnDeletePermanently");
                    throw null;
                }
                imageView5.setColorFilter(ContextCompat.getColor(trashBinContainerFragment.requireContext(), android.R.color.transparent));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30317OooO0o0(TrashBinContainerFragment trashBinContainerFragment, Continuation<? super C30317OooO0o0> continuation) {
        super(2, continuation);
        this.f108094OooOo = trashBinContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30317OooO0o0(this.f108094OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        ((C30317OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        return EnumC32485OooO00o.f116726OooOo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108095OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            TrashBinContainerFragment trashBinContainerFragment = this.f108094OooOo;
            C30351Oooo0oO c30351Oooo0oOOooOoOO = trashBinContainerFragment.OooOoOO();
            OooO00o oooO00o = new OooO00o(trashBinContainerFragment);
            this.f108095OooOo0o = 1;
            if (c30351Oooo0oOOooOoOO.f108252OooOooo.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        throw new C32438OooO0oO();
    }
}
