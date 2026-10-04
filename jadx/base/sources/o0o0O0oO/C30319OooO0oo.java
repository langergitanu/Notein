package o0o0O0oO;

import android.content.Context;
import android.widget.TextView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinContainerFragment;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0O0oO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinContainerFragment$initSmallTab$2", m80623f = "TrashBinContainerFragment.kt", m80624l = {402}, m80625m = "invokeSuspend")
public final class C30319OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TrashBinContainerFragment f108099OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108100OooOo0o;

    /* JADX INFO: renamed from: o0o0O0oO.OooO0oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinContainerFragment$initSmallTab$2$1", m80623f = "TrashBinContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TrashBinContainerFragment f108101OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f108102OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(TrashBinContainerFragment trashBinContainerFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f108101OooOo = trashBinContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f108101OooOo, continuation);
            oooO00o.f108102OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(num, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            Context context;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            Integer num = (Integer) this.f108102OooOo0o;
            TrashBinContainerFragment trashBinContainerFragment = this.f108101OooOo;
            TextView textView = trashBinContainerFragment.f78083OoooO0;
            if (textView != null && (context = trashBinContainerFragment.getContext()) != null) {
                int i = R.string.note_list_tabs_all_doc;
                if (num == null || num.intValue() != 0) {
                    if (num != null && num.intValue() == 1) {
                        i = R.string.note_list_tabs_pdf;
                    } else if (num != null && num.intValue() == 2) {
                        i = R.string.note_list_tabs_note;
                    } else if (num != null && num.intValue() == 3) {
                        i = R.string.note_list_tabs_folder;
                    }
                }
                textView.setText(context.getString(i));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30319OooO0oo(TrashBinContainerFragment trashBinContainerFragment, Continuation<? super C30319OooO0oo> continuation) {
        super(2, continuation);
        this.f108099OooOo = trashBinContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30319OooO0oo(this.f108099OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30319OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108100OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            TrashBinContainerFragment trashBinContainerFragment = this.f108099OooOo;
            C30351Oooo0oO c30351Oooo0oOOooOoOO = trashBinContainerFragment.OooOoOO();
            OooO00o oooO00o = new OooO00o(trashBinContainerFragment, null);
            this.f108100OooOo0o = 1;
            if (C25252OooO0Oo.OooO0oO(c30351Oooo0oOOooOoOO.f108236OooOOOO, oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
