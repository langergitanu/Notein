package o0o0O00O;

import androidx.fragment.app.ActivityC21897OooOo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.label.LabelListFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0o0O00O.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.label.LabelListFragment$onNoteListItemMerged$2", m80623f = "LabelListFragment.kt", m80624l = {534, 536}, m80625m = "invokeSuspend")
public final class C30250OooOoOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f107793OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107794OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ NoteVO f107795OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ LabelListFragment f107796OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ NoteVO f107797OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30250OooOoOO(boolean z, LabelListFragment labelListFragment, NoteVO noteVO, NoteVO noteVO2, Continuation<? super C30250OooOoOO> continuation) {
        super(2, continuation);
        this.f107793OooOo = z;
        this.f107796OooOoO0 = labelListFragment;
        this.f107795OooOoO = noteVO;
        this.f107797OooOoOO = noteVO2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30250OooOoOO(this.f107793OooOo, this.f107796OooOoO0, this.f107795OooOoO, this.f107797OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30250OooOoOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r8 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r8 == r0) goto L24;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        ActivityC21897OooOo0 activity;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107794OooOo0o;
        LabelListFragment labelListFragment = this.f107796OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            boolean z = this.f107793OooOo;
            NoteVO noteVO = this.f107795OooOoO;
            if (z) {
                ArrayList arrayListOooooOo = oOo000Oo.OooOo.OooooOo((Collection) labelListFragment.OooOoo().f77172OooooOO.f121747OooOo0o.getValue(), noteVO);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : arrayListOooooOo) {
                    if (hashSet.add(((NoteVO) obj2).getId())) {
                        arrayList.add(obj2);
                    }
                }
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = labelListFragment.OooOoo();
                this.f107794OooOo0o = 1;
                obj = oooO0OOOooOoo.OooOOo(arrayList, this);
            } else {
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo2 = labelListFragment.OooOoo();
                List listOooOO0o = C34429OooOOo0.OooOO0o(this.f107797OooOoOO, noteVO);
                this.f107794OooOo0o = 2;
                obj = oooO0OOOooOoo2.OooOOo(listOooOO0o, this);
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
        }
        if (!zBooleanValue && (activity = labelListFragment.getActivity()) != null) {
            String string = labelListFragment.getString(R.string.move_fail);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0oO(activity, string);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
