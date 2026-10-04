package o00Ooo;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.orion.notein.data.p602db.entity.UserEntity;
import com.orion.notein.domain.mapper.UserMapper;
import com.orion.notein.domain.models.User;
import java.lang.ref.WeakReference;
import o0OOOO0o.C27114OooOooo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O0o0O.C32721OooO0o;
import oO0O0o0O.C32722OooO0o0;
import oO0O0oO0.C32730OooO0Oo;
import oO0OoO0.C33238OooO0oo;
import oO0OooO0.C33476OooO0O0;
import oOo000Oo.C34449Oooo0oo;
import oo0oO0.o0O0O0Oo;
import ooo0o.C35194OooOOOo;
import ooo0o.InterfaceC35196OooOOo0;

/* JADX INFO: renamed from: o00Ooo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25086OooOo0O implements oO0OoO0.OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Object f85155OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Object f85156OooO0O0;

    @Override // oO0OoO0.OooO
    public C33238OooO0oo OooO00o(C33476OooO0O0 classId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(classId, "classId");
        ooo0o.OooOO0 oooOO02 = (ooo0o.OooOO0) this.f85156OooO0O0;
        InterfaceC35196OooOOo0 interfaceC35196OooOOo0OooO00o = C35194OooOOOo.OooO00o((C32721OooO0o) this.f85155OooO00o, classId, C34449Oooo0oo.OooO0o0(oooOO02.OooO0OO().f120271OooO0OO));
        if (interfaceC35196OooOOo0OooO00o == null) {
            return null;
        }
        C32730OooO0Oo.OooO00o(((C32722OooO0o0) interfaceC35196OooOOo0OooO00o).f117648OooO00o).equals(classId);
        return oooOO02.OooO0o(interfaceC35196OooOOo0OooO00o);
    }

    public Object OooO0O0(User user, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Object objOooO0OO = ((o0O0O0Oo) this.f85155OooO00o).OooO0OO(new UserEntity[]{((UserMapper) this.f85156OooO0O0).toEntity(user)}, abstractC32479OooO0OO);
        return objOooO0OO == EnumC32485OooO00o.f116726OooOo0o ? objOooO0OO : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object OooO0OO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27114OooOooo c27114OooOooo;
        C25086OooOo0O c25086OooOo0O;
        if (abstractC32479OooO0OO instanceof C27114OooOooo) {
            c27114OooOooo = (C27114OooOooo) abstractC32479OooO0OO;
            int i = c27114OooOooo.f94531OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27114OooOooo.f94531OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27114OooOooo = new C27114OooOooo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c27114OooOooo.f94529OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27114OooOooo.f94531OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            c27114OooOooo.f94530OooOo0o = this;
            c27114OooOooo.f94531OooOoO = 1;
            objOooO0Oo = ((o0O0O0Oo) this.f85155OooO00o).OooO0Oo(str, c27114OooOooo);
            if (objOooO0Oo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c25086OooOo0O = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c25086OooOo0O = c27114OooOooo.f94530OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
        }
        UserEntity userEntity = (UserEntity) objOooO0Oo;
        if (userEntity != null) {
            return ((UserMapper) c25086OooOo0O.f85156OooO0O0).toUser(userEntity);
        }
        return null;
    }

    public void OooO0Oo() {
        WeakReference weakReference = (WeakReference) this.f85155OooO00o;
        Activity activity = (Activity) weakReference.get();
        WeakReference weakReference2 = (WeakReference) this.f85156OooO0O0;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) weakReference2.get();
        if (activity != null && onGlobalLayoutListener != null) {
            View viewFindViewById = activity.findViewById(R.id.content);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById, "activity.findViewById(android.R.id.content)");
            View rootView = ((ViewGroup) viewFindViewById).getRootView();
            kotlin.jvm.internal.OooOOO0.OooO0o(rootView, "getContentRoot(activity).rootView");
            rootView.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        weakReference.clear();
        weakReference2.clear();
    }
}
