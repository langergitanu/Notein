package o0o0O00;

import androidx.fragment.app.ActivityC21897OooOo0;
import com.orion.notein.MainActivity;
import com.orion.notein.p607ui.widget.EdgeFragment;
import o0o0O00.C30185OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0o0O00.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C30189OooO0o implements C30185OooO00o.InterfaceC20048OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EdgeFragment f107495OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final com.orion.notein.p607ui.notelist.OooO0OO f107496OooO0O0;

    public C30189OooO0o(EdgeFragment edgeFragment, com.orion.notein.p607ui.notelist.OooO0OO noteListViewModel) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteListViewModel, "noteListViewModel");
        this.f107495OooO00o = edgeFragment;
        this.f107496OooO0O0 = noteListViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0O0(C30189OooO0o c30189OooO0o, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30190OooO0o0 c30190OooO0o0;
        boolean zBooleanValue;
        c30189OooO0o.getClass();
        if (abstractC32479OooO0OO instanceof C30190OooO0o0) {
            c30190OooO0o0 = (C30190OooO0o0) abstractC32479OooO0OO;
            int i2 = c30190OooO0o0.f107499OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c30190OooO0o0.f107499OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c30190OooO0o0 = new C30190OooO0o0(c30189OooO0o, abstractC32479OooO0OO);
            }
        }
        C30190OooO0o0 c30190OooO0o02 = c30190OooO0o0;
        Object objShowNonVipFeatureLimitedDialog$default = c30190OooO0o02.f107498OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c30190OooO0o02.f107499OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = c30189OooO0o.f107495OooO00o.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c30190OooO0o02.f107499OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c30190OooO0o02, 6, null);
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

    @Override // o0o0O00.C30185OooO00o.InterfaceC20048OooO00o
    public void OooO00o() {
    }
}
