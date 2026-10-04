package o0o0O00;

import OooOoOO.C20519OooO0Oo;
import android.widget.PopupWindow;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.MainActivity;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOoooO.C27996OooO00o;
import o0Oo0o00.C28201OooooO0;
import o0Ooo.C29267OooOOo;
import o0o00oOo.C30030OooO0O0;
import o0o00oOo.C30037OooOO0;
import o0oOoOo.C31040OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o0O00.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30201OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Fragment f107547OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO0O000o.OooO00o<LockNoteFragment> f107548OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final com.orion.notein.p607ui.notelist.OooO0OO f107549OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C28201OooooO0 f107550OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C32447OooOOo f107551OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0o0O0.OooO f107552OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C32447OooOOo f107553OooO0oO;

    /* JADX INFO: renamed from: o0o0O00.OooOOO0$OooO00o */
    public static final class OooO00o implements androidx.lifecycle.OooO0o {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.OooO0o
        public final void onDestroy(InterfaceC21987OooOoo interfaceC21987OooOoo) {
            C30201OooOOO0 c30201OooOOO0 = C30201OooOOO0.this;
            C30037OooOO0 c30037OooOO0 = (C30037OooOO0) c30201OooOOO0.f107551OooO0o.getValue();
            if (c30037OooOO0.f106796OooO.get()) {
                PopupWindow popupWindow = c30037OooOO0.f106798OooO0O0;
                if (popupWindow == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("popupWindow");
                    throw null;
                }
                popupWindow.dismiss();
            }
            PopupWindow popupWindow2 = ((C30030OooO0O0) c30201OooOOO0.f107553OooO0oO.getValue()).f106748OooO0OO;
            if (popupWindow2 != null) {
                popupWindow2.dismiss();
            }
            o0o0O0.OooO oooO = c30201OooOOO0.f107552OooO0o0;
            if (oooO != null) {
                oooO.OooO00o();
            }
        }
    }

    /* JADX INFO: renamed from: o0o0O00.OooOOO0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultNoteMoreActionListener$onFolderColorSelected$1", m80623f = "DefaultNoteMoreActionListener.kt", m80624l = {231, 233, 238}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ int f107555OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107556OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C30201OooOOO0 f107557OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f107558OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, OooO0OO oooO0OO, C30201OooOOO0 c30201OooOOO0, Continuation continuation) {
            super(2, continuation);
            this.f107555OooOo = i;
            this.f107558OooOoO0 = oooO0OO;
            this.f107557OooOoO = c30201OooOOO0;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f107555OooOo, this.f107558OooOoO0, this.f107557OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        
            if (r2.invoke(r7) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
        
            if (r2.invoke(r7) == r0) goto L30;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107556OooOo0o;
            OooO0OO oooO0OO = this.f107558OooOoO0;
            C30201OooOOO0 c30201OooOOO0 = this.f107557OooOoO;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                if (this.f107555OooOo == C27996OooO00o.f99274OooO00o) {
                    this.f107556OooOo0o = 1;
                } else {
                    this.f107556OooOo0o = 2;
                    obj = C30201OooOOO0.OooO00o(c30201OooOOO0, 24, this);
                    if (obj != enumC32485OooO00o) {
                        if (((Boolean) obj).booleanValue()) {
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i == 2) {
                    C32446OooOOOo.OooO0O0(obj);
                    if (((Boolean) obj).booleanValue()) {
                        this.f107556OooOo0o = 3;
                    } else {
                        PopupWindow popupWindow = ((C30030OooO0O0) c30201OooOOO0.f107553OooO0oO.getValue()).f106748OooO0OO;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                        }
                        o0o0O0.OooO oooO = c30201OooOOO0.f107552OooO0o0;
                        if (oooO != null) {
                            oooO.OooO00o();
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0o0O00.OooOOO0$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultNoteMoreActionListener$onFolderColorSelected$setFilterFolderColor$1", m80623f = "DefaultNoteMoreActionListener.kt", m80624l = {221}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107560OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ int f107561OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f107562OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, int i, Continuation<? super OooO0OO> continuation) {
            super(1, continuation);
            this.f107562OooOoO0 = str;
            this.f107561OooOoO = i;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
            return C30201OooOOO0.this.new OooO0OO(this.f107562OooOoO0, this.f107561OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107560OooOo0o;
            int i2 = this.f107561OooOoO;
            C30201OooOOO0 c30201OooOOO0 = C30201OooOOO0.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = c30201OooOOO0.f107549OooO0OO;
                this.f107560OooOo0o = 1;
                if (oooO0OO.OooOoo0(this.f107562OooOoO0, i2, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            Iterable iterable = (Iterable) c30201OooOOO0.f107549OooO0OO.f77140OooOo0o.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (((C31040OooOO0o) obj2).f110821OooO00o != 0) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int i3 = ((C31040OooOO0o) it.next()).f110821OooO00o;
                arrayList2.add(new C31040OooOO0o(i3, i2 == i3));
            }
            ((C30030OooO0O0) c30201OooOOO0.f107553OooO0oO.getValue()).OooO00o(arrayList2);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C30201OooOOO0(Fragment fragment, oO0O000o.OooO00o<LockNoteFragment> oooO00o, com.orion.notein.p607ui.notelist.OooO0OO noteListViewModel, C28201OooooO0 c28201OooooO0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteListViewModel, "noteListViewModel");
        this.f107547OooO00o = fragment;
        this.f107548OooO0O0 = oooO00o;
        this.f107549OooO0OO = noteListViewModel;
        this.f107550OooO0Oo = c28201OooooO0;
        fragment.getViewLifecycleOwner().getLifecycle().OooO00o(new OooO00o());
        this.f107551OooO0o = C20519OooO0Oo.OooO0OO(new o0O0ooo0.OooOOO0(this, 3));
        this.f107553OooO0oO = C20519OooO0Oo.OooO0OO(new C29267OooOOo(this, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C30201OooOOO0 c30201OooOOO0, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30210OooOo0O c30210OooOo0O;
        boolean zBooleanValue;
        c30201OooOOO0.getClass();
        if (abstractC32479OooO0OO instanceof C30210OooOo0O) {
            c30210OooOo0O = (C30210OooOo0O) abstractC32479OooO0OO;
            int i2 = c30210OooOo0O.f107596OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c30210OooOo0O.f107596OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c30210OooOo0O = new C30210OooOo0O(c30201OooOOO0, abstractC32479OooO0OO);
            }
        }
        C30210OooOo0O c30210OooOo0O2 = c30210OooOo0O;
        Object objShowNonVipFeatureLimitedDialog$default = c30210OooOo0O2.f107595OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c30210OooOo0O2.f107596OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = c30201OooOOO0.f107547OooO00o.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c30210OooOo0O2.f107596OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c30210OooOo0O2, 6, null);
            if (objShowNonVipFeatureLimitedDialog$default == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
        }
        zBooleanValue = ((Boolean) objShowNonVipFeatureLimitedDialog$default).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    public final void OooO0O0(NoteVO vo, InterfaceC32507OooOO0o<? super List<C31040OooOO0o>, C32460OooOooO> interfaceC32507OooOO0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(vo, "vo");
        Iterable iterable = (Iterable) this.f107549OooO0OO.f77140OooOo0o.getValue();
        ArrayList<C31040OooOO0o> arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((C31040OooOO0o) obj).f110821OooO00o != 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        for (C31040OooOO0o c31040OooOO0o : arrayList) {
            int folderCoverColor = vo.getFolderCoverColor();
            int i = c31040OooOO0o.f110821OooO00o;
            arrayList2.add(new C31040OooOO0o(i, folderCoverColor == i));
        }
        interfaceC32507OooOO0o.invoke(arrayList2);
    }

    public final void OooO0OO(int i, String folderId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(folderId, "folderId");
        OooO0OO oooO0OO = new OooO0OO(folderId, i, null);
        InterfaceC21987OooOoo viewLifecycleOwner = this.f107547OooO00o.getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0O0(i, oooO0OO, this, null), 3);
    }
}
