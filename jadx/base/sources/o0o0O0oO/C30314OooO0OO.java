package o0o0O0oO;

import android.view.View;
import android.widget.TextView;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinContainerFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o0O0oO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinContainerFragment$initActionBar$10", m80623f = "TrashBinContainerFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_3_ACCENT_3}, m80625m = "invokeSuspend")
public final class C30314OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TrashBinContainerFragment f108085OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108086OooOo0o;

    /* JADX INFO: renamed from: o0o0O0oO.OooO0OO$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ TrashBinContainerFragment f108087OooOo0o;

        public OooO00o(TrashBinContainerFragment trashBinContainerFragment) {
            this.f108087OooOo0o = trashBinContainerFragment;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        public final Object emit(Object obj, Continuation continuation) {
            String string;
            C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
            NoteVO noteVO = (NoteVO) c32443OooOOO.f116638OooOo0o;
            NoteVO noteVO2 = (NoteVO) c32443OooOOO.f116637OooOo;
            TrashBinContainerFragment trashBinContainerFragment = this.f108087OooOo0o;
            TextView textView = trashBinContainerFragment.f78073Oooo000;
            if (textView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("currentFolder");
                throw null;
            }
            textView.setVisibility(0);
            View view = trashBinContainerFragment.f78070OooOooo;
            if (view == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnSelect");
                throw null;
            }
            view.setVisibility(0);
            if (noteVO == null) {
                TextView textView2 = trashBinContainerFragment.f78073Oooo000;
                if (textView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("currentFolder");
                    throw null;
                }
                textView2.setText(trashBinContainerFragment.getString(R.string.action_bar_trash));
                View view2 = trashBinContainerFragment.f78074Oooo00O;
                if (view2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnMenu");
                    throw null;
                }
                view2.setVisibility(0);
                View view3 = trashBinContainerFragment.f78075Oooo00o;
                if (view3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnBackToParent");
                    throw null;
                }
                view3.setVisibility(8);
                TextView textView3 = trashBinContainerFragment.f78072Oooo0;
                if (textView3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("parentFolderName");
                    throw null;
                }
                textView3.setText(trashBinContainerFragment.getString(R.string.back));
            } else {
                View view4 = trashBinContainerFragment.f78074Oooo00O;
                if (view4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnMenu");
                    throw null;
                }
                view4.setVisibility(8);
                View view5 = trashBinContainerFragment.f78075Oooo00o;
                if (view5 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnBackToParent");
                    throw null;
                }
                view5.setVisibility(0);
                TextView textView4 = trashBinContainerFragment.f78073Oooo000;
                if (textView4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("currentFolder");
                    throw null;
                }
                textView4.setText(noteVO.getName());
                TextView textView5 = trashBinContainerFragment.f78072Oooo0;
                if (textView5 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("parentFolderName");
                    throw null;
                }
                if (noteVO2 == null || (string = noteVO2.getName()) == null) {
                    string = trashBinContainerFragment.getString(R.string.action_bar_trash);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                }
                textView5.setText(string);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30314OooO0OO(TrashBinContainerFragment trashBinContainerFragment, Continuation<? super C30314OooO0OO> continuation) {
        super(2, continuation);
        this.f108085OooOo = trashBinContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30314OooO0OO(this.f108085OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        ((C30314OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        return EnumC32485OooO00o.f116726OooOo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108086OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw androidx.transition.OooOOOO.OooO0O0(obj);
        }
        C32446OooOOOo.OooO0O0(obj);
        TrashBinContainerFragment trashBinContainerFragment = this.f108085OooOo;
        C30351Oooo0oO c30351Oooo0oOOooOoOO = trashBinContainerFragment.OooOoOO();
        OooO00o oooO00o = new OooO00o(trashBinContainerFragment);
        this.f108086OooOo0o = 1;
        c30351Oooo0oOOooOoOO.f108242OooOo0.collect(oooO00o, this);
        return enumC32485OooO00o;
    }
}
